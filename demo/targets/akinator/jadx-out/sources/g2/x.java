package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final r2.m f56873a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.p f56874b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56875c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.x f56876d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f56877e;

    /* renamed from: f, reason: collision with root package name */
    public final r2.h f56878f;

    public x(r2.m mVar, r2.p pVar, long j10, r2.x xVar, c0 c0Var, r2.h hVar, kotlin.jvm.internal.u uVar) {
        this.f56873a = mVar;
        this.f56874b = pVar;
        this.f56875c = j10;
        this.f56876d = xVar;
        this.f56877e = c0Var;
        this.f56878f = hVar;
        if (s2.z.m6991equalsimpl0(j10, s2.z.f85366b.m6983getUnspecifiedXSAIIZE()) || s2.z.m6994getValueimpl(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + s2.z.m6994getValueimpl(j10) + ')').toString());
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ x m4033copyElsmlbk$default(x xVar, r2.m mVar, r2.p pVar, long j10, r2.x xVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = xVar.f56873a;
        }
        if ((i10 & 2) != 0) {
            pVar = xVar.f56874b;
        }
        if ((i10 & 4) != 0) {
            j10 = xVar.f56875c;
        }
        if ((i10 & 8) != 0) {
            xVar2 = xVar.f56876d;
        }
        r2.x xVar3 = xVar2;
        return xVar.m4035copyElsmlbk(mVar, pVar, j10, xVar3);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ x m4034copyxPh5V4g$default(x xVar, r2.m mVar, r2.p pVar, long j10, r2.x xVar2, c0 c0Var, r2.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = xVar.f56873a;
        }
        if ((i10 & 2) != 0) {
            pVar = xVar.f56874b;
        }
        if ((i10 & 4) != 0) {
            j10 = xVar.f56875c;
        }
        if ((i10 & 8) != 0) {
            xVar2 = xVar.f56876d;
        }
        if ((i10 & 16) != 0) {
            c0Var = xVar.f56877e;
        }
        if ((i10 & 32) != 0) {
            hVar = xVar.f56878f;
        }
        r2.h hVar2 = hVar;
        r2.x xVar3 = xVar2;
        long j11 = j10;
        return xVar.m4036copyxPh5V4g(mVar, pVar, j11, xVar3, c0Var, hVar2);
    }

    public static /* synthetic */ x merge$default(x xVar, x xVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar2 = null;
        }
        return xVar.merge(xVar2);
    }

    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final x m4035copyElsmlbk(r2.m mVar, r2.p pVar, long j10, r2.x xVar) {
        return new x(mVar, pVar, j10, xVar, this.f56877e, this.f56878f, null);
    }

    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final x m4036copyxPh5V4g(r2.m mVar, r2.p pVar, long j10, r2.x xVar, c0 c0Var, r2.h hVar) {
        return new x(mVar, pVar, j10, xVar, c0Var, hVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56873a, xVar.f56873a) && kotlin.jvm.internal.e0.areEqual(this.f56874b, xVar.f56874b) && s2.z.m6991equalsimpl0(this.f56875c, xVar.f56875c) && kotlin.jvm.internal.e0.areEqual(this.f56876d, xVar.f56876d) && kotlin.jvm.internal.e0.areEqual(this.f56877e, xVar.f56877e) && kotlin.jvm.internal.e0.areEqual(this.f56878f, xVar.f56878f);
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m4037getLineHeightXSAIIZE() {
        return this.f56875c;
    }

    public final r2.h getLineHeightStyle() {
        return this.f56878f;
    }

    public final c0 getPlatformStyle() {
        return this.f56877e;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final r2.m m4038getTextAlignbuA522U() {
        return this.f56873a;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final r2.p m4039getTextDirectionmmuk1to() {
        return this.f56874b;
    }

    public final r2.x getTextIndent() {
        return this.f56876d;
    }

    public int hashCode() {
        r2.m mVar = this.f56873a;
        int iM6076hashCodeimpl = (mVar != null ? r2.m.m6076hashCodeimpl(mVar.m6078unboximpl()) : 0) * 31;
        r2.p pVar = this.f56874b;
        int iM6995hashCodeimpl = (s2.z.m6995hashCodeimpl(this.f56875c) + ((iM6076hashCodeimpl + (pVar != null ? r2.p.m6088hashCodeimpl(pVar.m6090unboximpl()) : 0)) * 31)) * 31;
        r2.x xVar = this.f56876d;
        int iHashCode = (iM6995hashCodeimpl + (xVar != null ? xVar.hashCode() : 0)) * 31;
        c0 c0Var = this.f56877e;
        int iHashCode2 = (iHashCode + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        r2.h hVar = this.f56878f;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final x merge(x xVar) {
        c0 c0Var;
        if (xVar == null) {
            return this;
        }
        long j10 = xVar.f56875c;
        if (s2.a0.m6730isUnspecifiedR2X_6o(j10)) {
            j10 = this.f56875c;
        }
        long j11 = j10;
        r2.x xVar2 = xVar.f56876d;
        if (xVar2 == null) {
            xVar2 = this.f56876d;
        }
        r2.x xVar3 = xVar2;
        r2.m mVar = xVar.f56873a;
        if (mVar == null) {
            mVar = this.f56873a;
        }
        r2.m mVar2 = mVar;
        r2.p pVar = xVar.f56874b;
        if (pVar == null) {
            pVar = this.f56874b;
        }
        r2.p pVar2 = pVar;
        c0 c0VarMerge = xVar.f56877e;
        c0 c0Var2 = this.f56877e;
        if (c0Var2 == null) {
            c0Var = c0VarMerge;
        } else if (c0VarMerge == null) {
            c0Var = c0Var2;
        } else {
            c0VarMerge = c0Var2.merge(c0VarMerge);
            c0Var = c0VarMerge;
        }
        r2.h hVar = xVar.f56878f;
        if (hVar == null) {
            hVar = this.f56878f;
        }
        return new x(mVar2, pVar2, j11, xVar3, c0Var, hVar, null);
    }

    public final x plus(x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f56873a + ", textDirection=" + this.f56874b + ", lineHeight=" + ((Object) s2.z.m7001toStringimpl(this.f56875c)) + ", textIndent=" + this.f56876d + ", platformStyle=" + this.f56877e + ", lineHeightStyle=" + this.f56878f + ')';
    }

    public /* synthetic */ x(r2.m mVar, r2.p pVar, long j10, r2.x xVar, c0 c0Var, r2.h hVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : mVar, (i10 & 2) != 0 ? null : pVar, (i10 & 4) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : xVar, (i10 & 16) != 0 ? null : c0Var, (i10 & 32) != 0 ? null : hVar, null);
    }

    public /* synthetic */ x(r2.m mVar, r2.p pVar, long j10, r2.x xVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : mVar, (i10 & 2) != 0 ? null : pVar, (i10 & 4) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : xVar, null);
    }

    public x(r2.m mVar, r2.p pVar, long j10, r2.x xVar, kotlin.jvm.internal.u uVar) {
        this(mVar, pVar, j10, xVar, null, null, null);
    }
}
