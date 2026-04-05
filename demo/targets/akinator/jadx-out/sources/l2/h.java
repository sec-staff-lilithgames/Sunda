package l2;

import l2.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static final c1 getAndroidBold(c1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return aVar.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m5438getAndroidTypefaceStyleFO1MlWM(c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(c1.f72258c)) >= 0, y0.m5485equalsimpl0(i10, y0.f72394b.m5479getItalic_LCdwA()));
    }
}
