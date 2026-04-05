package tb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface u {
    k1 lenient() default k1.f86738e;

    String locale() default "##default";

    String pattern() default "";

    s shape() default s.f86775k;

    String timezone() default "##default";

    q[] with() default {};

    q[] without() default {};
}
