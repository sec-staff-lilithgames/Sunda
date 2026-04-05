package kc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import jc.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface f {
    Class as() default Void.class;

    Class builder() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default dd.l.class;

    Class contentUsing() default jc.p.class;

    Class converter() default dd.l.class;

    Class keyAs() default Void.class;

    Class keyUsing() default x.a.class;

    Class using() default jc.p.class;
}
