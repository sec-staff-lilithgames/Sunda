package tb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface e0 {
    c0 content() default c0.f86694b;

    Class contentFilter() default Void.class;

    c0 value() default c0.f86694b;

    Class valueFilter() default Void.class;
}
