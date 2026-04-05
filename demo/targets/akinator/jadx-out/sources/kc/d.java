package kc;

import tb.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public @interface d {
    c0 include() default c0.f86695c;

    String name() default "";

    String namespace() default "";

    boolean required() default false;

    Class type() default Object.class;

    Class value();
}
