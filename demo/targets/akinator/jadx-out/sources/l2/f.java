package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements k1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f72285b;

    public f(int i10) {
        this.f72285b = i10;
    }

    public static /* synthetic */ f copy$default(f fVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f72285b;
        }
        return fVar.copy(i10);
    }

    public final f copy(int i10) {
        return new f(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f72285b == ((f) obj).f72285b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f72285b);
    }

    @Override // l2.k1
    public /* bridge */ /* synthetic */ x interceptFontFamily(x xVar) {
        return super.interceptFontFamily(xVar);
    }

    @Override // l2.k1
    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    public /* bridge */ /* synthetic */ int mo5435interceptFontStyleT2F_aPo(int i10) {
        return super.mo5435interceptFontStyleT2F_aPo(i10);
    }

    @Override // l2.k1
    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    public /* bridge */ /* synthetic */ int mo5436interceptFontSynthesisMscr08Y(int i10) {
        return super.mo5436interceptFontSynthesisMscr08Y(i10);
    }

    @Override // l2.k1
    public c1 interceptFontWeight(c1 fontWeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        int i10 = this.f72285b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? fontWeight : new c1(qv.v.coerceIn(fontWeight.getWeight() + i10, 1, 1000));
    }

    public String toString() {
        return e3.g.m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f72285b, ')');
    }
}
