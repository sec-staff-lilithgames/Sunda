package l2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z {
    public static final x FontFamily(List<? extends w> fonts) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fonts, "fonts");
        return new l0(fonts);
    }

    public static final x FontFamily(w... fonts) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fonts, "fonts");
        return new l0(uu.f0.asList(fonts));
    }

    public static final x FontFamily(s1 typeface) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeface, "typeface");
        return new f1(typeface);
    }
}
