package com.learn.c;

import java.lang.annotation.Inherited;

/**
 * @author admin
 * @create 2020/10/16
 */
@MyAnnotation(value = "hello")
public class AnnotationTest {

    @SuppressWarnings("unused")
    private int m;

    @MyAnnotation1()
    public AnnotationTest(int m) {
        this.m = m;
    }
}

/**
 * 自定义注解
 * 一般要有  @Retention 和 @target
 * @author admin
 */

@Inherited
@interface MyAnnotation {
    String value();
}

/**
 * @Description 父类AnnotationTest被@Inherited修饰
 * 故SubTest也被 父类的注解修饰 (也就是继承了父类的注解)
 *    以上 后边通过 反射 验证
 * @author nisu
 * @date 11:16 2020/10/17
 */

class SubTest extends AnnotationTest{

    public SubTest(int m) {
        super(m);
    }
}

/**
 * 四种元注解
 * @Retention     指定Annotation生命周期
 * @Target        指定Annotation作用范围(修饰哪些程序元素)
 * @Inherited    被它修饰的Annotation 将具有继承性。
 *如果某个类使用了被 @Inherited 修饰的Annotation, 则其子类将自动具有该注解。
 * @Documented    用于指定修饰的Annotation 类将被 javadoc 工具提取成文档。
 * 默认情况下，javadoc是不包括注解的。
 */

/**
 * @author admin
 */
@interface MyAnnotation1 {
    String value() default "有default时" +
            " @MyAnnotation()不用传参数了" +
            " 传参数时修改默认值";
}

/**
 * JDK 8.0 中新特性: 可重复注解、类型注解
 * 可重复注解 @Repeatable
 * 想要达到以下目的:   (下边代码不能直接实现)
 *    @MyAnnotation(value = "hello")
 *    @MyAnnotation(value = "world")
 * jdk 8.0 之前
 *
 *     1.创建 自定义注解注解 xxs - 属性是 想要重复的注解(xx)数组
 *          可能需要 -- @Target 和 @Retention 里边的参数保持一致
 *          (否则编译不过  @Inherited不一样运行不过   一般保持两者注解一致)
 *          (猜测 ssx不能比xx 范围小)
 *     2.调用 @xxs({@xx(val1),@xx(val2)})
 * jdk 8.0 新特性
 *     1.创建 自定义注解注解 xxs - 属性是 想要重复的注解(xx)数组
 *     2. @Target 和 @Retention 里边的参数保持一致(猜测 ssx不能比xx 范围小)
 *     3. 想要重复的注解 xx 添加可重复注解  @Repeatable(xxs.class)
 *     4. 调用
 *             @MyAnnotation(value = "hello")
 *  *          @MyAnnotation(value = "world")
 */

