package param;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 左对齐右边补空格
 * 
 * @author zhang_jin[zhang_jin@suixingpay.com]
 *
 */
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PadRightWithSpace {
	int len() default 0;
}
