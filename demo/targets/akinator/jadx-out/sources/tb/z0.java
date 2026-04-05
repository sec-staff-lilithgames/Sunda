package tb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface z0 {
    Class defaultImpl() default z0.class;

    v0 include() default v0.f86787b;

    String property() default "";

    k1 requireTypeIdForSubtypes() default k1.f86738e;

    w0 use();

    boolean visible() default false;
}
