package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final x f72373a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f72374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72375c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72376d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f72377e;

    public u1(x xVar, c1 c1Var, int i10, int i11, Object obj, kotlin.jvm.internal.u uVar) {
        this.f72373a = xVar;
        this.f72374b = c1Var;
        this.f72375c = i10;
        this.f72376d = i11;
        this.f72377e = obj;
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ u1 m5463copye1PVR60$default(u1 u1Var, x xVar, c1 c1Var, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            xVar = u1Var.f72373a;
        }
        if ((i12 & 2) != 0) {
            c1Var = u1Var.f72374b;
        }
        if ((i12 & 4) != 0) {
            i10 = u1Var.f72375c;
        }
        if ((i12 & 8) != 0) {
            i11 = u1Var.f72376d;
        }
        if ((i12 & 16) != 0) {
            obj = u1Var.f72377e;
        }
        Object obj3 = obj;
        int i13 = i10;
        return u1Var.m5466copye1PVR60(xVar, c1Var, i13, i11, obj3);
    }

    public final x component1() {
        return this.f72373a;
    }

    public final c1 component2() {
        return this.f72374b;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m5464component3_LCdwA() {
        return this.f72375c;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m5465component4GVVA2EU() {
        return this.f72376d;
    }

    public final Object component5() {
        return this.f72377e;
    }

    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final u1 m5466copye1PVR60(x xVar, c1 fontWeight, int i10, int i11, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        return new u1(xVar, fontWeight, i10, i11, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f72373a, u1Var.f72373a) && kotlin.jvm.internal.e0.areEqual(this.f72374b, u1Var.f72374b) && y0.m5485equalsimpl0(this.f72375c, u1Var.f72375c) && a1.m5426equalsimpl0(this.f72376d, u1Var.f72376d) && kotlin.jvm.internal.e0.areEqual(this.f72377e, u1Var.f72377e);
    }

    public final x getFontFamily() {
        return this.f72373a;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m5467getFontStyle_LCdwA() {
        return this.f72375c;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m5468getFontSynthesisGVVA2EU() {
        return this.f72376d;
    }

    public final c1 getFontWeight() {
        return this.f72374b;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.f72377e;
    }

    public int hashCode() {
        x xVar = this.f72373a;
        int iM5427hashCodeimpl = (a1.m5427hashCodeimpl(this.f72376d) + ((y0.m5486hashCodeimpl(this.f72375c) + ((this.f72374b.hashCode() + ((xVar == null ? 0 : xVar.hashCode()) * 31)) * 31)) * 31)) * 31;
        Object obj = this.f72377e;
        return iM5427hashCodeimpl + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f72373a + ", fontWeight=" + this.f72374b + ", fontStyle=" + ((Object) y0.m5487toStringimpl(this.f72375c)) + ", fontSynthesis=" + ((Object) a1.m5430toStringimpl(this.f72376d)) + ", resourceLoaderCacheKey=" + this.f72377e + ')';
    }
}
