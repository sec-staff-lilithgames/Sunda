package kc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface l {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default dd.l.class;

    Class contentUsing() default w.a.class;

    Class converter() default dd.l.class;

    j include() default j.f70789b;

    Class keyAs() default Void.class;

    Class keyUsing() default w.a.class;

    Class nullsUsing() default w.a.class;

    k typing() default k.f70793e;

    Class using() default w.a.class;
}
