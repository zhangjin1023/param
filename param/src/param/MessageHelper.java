package param;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;

public class MessageHelper {
	public static String createFiexdLengthMsg(Object obj, Class<?> clazz) throws Exception {
		Field[] fields = clazz.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		for (Field field : fields) {
			if (field.isAnnotationPresent(PadRightWithSpace.class)) {// 如果是左对齐，右边补空格注解
				PadRightWithSpace padRightWithSpace = field.getAnnotation(PadRightWithSpace.class);
				int len = padRightWithSpace.len();
				field.setAccessible(true);
				String newValue = padRightWithSpace((String) field.get(obj), len);
				field.set(obj, newValue);
			} else if (field.isAnnotationPresent(PadLeftWithZero.class)) {// 如果是右对齐，左边补0注解
				PadLeftWithZero padLeftWithZero = field.getAnnotation(PadLeftWithZero.class);
				int len = padLeftWithZero.len();
				field.setAccessible(true);
				String newValue = padLeftWithZero((String) field.get(obj), len);
				field.set(obj, newValue);
			}

			String value = (String) field.get(obj);
			sb.append(value);
		}
		String msgBody = sb.toString();
		String msgHead = padLeftWithZero(String.valueOf(msgBody.getBytes("GBK").length), 4);
		return msgHead + msgBody;
	}

	public static String padRightWithSpace(String orgStr, int len) {
		if (orgStr == null) {
			orgStr = "";
		}
		int length = 0;
		try {
			if (orgStr.getBytes("GBK").length >= len) {
				return orgStr;
			}

			length = orgStr.getBytes("GBK").length;
		} catch (UnsupportedEncodingException e) {
		}

		StringBuffer sb = new StringBuffer(orgStr);
		// 准确的字节长度拿到后 再据此补位
		for (int j = 0; j < len - length; j++) {
			sb.append(" ");
		}
		return sb.toString();
	}

	private static String padLeftWithZero(String orgStr, int len) {
		if (orgStr == null) {
			orgStr = "";
		}
		int length = orgStr.length();
		if (length >= len) {
			return orgStr;
		}

		StringBuffer sb = new StringBuffer(orgStr);
		// 准确的字节长度拿到后 再据此补位
		for (int j = 0; j < len - length; j++) {
			sb.insert(0, "0");
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(padRightWithSpace("张锦", 5));
		// System.out.println(padLeftWithZero("112", 5));

		Param param = new Param();
		param.setTransCode("11");
		param.setProcCode("22");
		param.setMerNo("00000123");
		param.setAmt("100");
		param.setPayNo("123456");
		param.setAcctNM("张三");
		System.out.println(createFiexdLengthMsg(param, param.getClass()));
	}

}
