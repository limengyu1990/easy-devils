package easy.devils.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Interceptor {

    /**
     * 拦截器类(优先使用)
     * @return
     */
    Class<?> value() default Object.class;

    /**
     * beanId
     * @return
     */
    String[] beanId() default {};
}
