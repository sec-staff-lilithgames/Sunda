package kc;

import tb.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public @interface c {
    c0 include() default c0.f86695c;

    String propName() default "";

    String propNamespace() default "";

    boolean required() default false;

    String value();
}
