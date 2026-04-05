package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {
    @tu.f
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ w m5439FontRetOiIg(int i10, c1 weight, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        return new p1(i10, weight, i11, v0.f72378b.m5461getBlockingPKNRLFQ(), null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ w m5440FontRetOiIg$default(int i10, c1 c1Var, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c1Var = c1.f72258c.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = y0.f72394b.m5480getNormal_LCdwA();
        }
        return m5439FontRetOiIg(i10, c1Var, i11);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final w m5441FontYpTlLL0(int i10, c1 weight, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(weight, "weight");
        return new p1(i10, weight, i11, i12, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ w m5442FontYpTlLL0$default(int i10, c1 c1Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            c1Var = c1.f72258c.getNormal();
        }
        if ((i13 & 4) != 0) {
            i11 = y0.f72394b.m5480getNormal_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = v0.f72378b.m5461getBlockingPKNRLFQ();
        }
        return m5441FontYpTlLL0(i10, c1Var, i11, i12);
    }

    public static final x toFontFamily(w wVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wVar, "<this>");
        return z.FontFamily(wVar);
    }
}
