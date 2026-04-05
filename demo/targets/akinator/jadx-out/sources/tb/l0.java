package tb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface l0 {
    k0 access() default k0.f86732b;

    String defaultValue() default "";

    int index() default -1;

    k1 isRequired() default k1.f86738e;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}
