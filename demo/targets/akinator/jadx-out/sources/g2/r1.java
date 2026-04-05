package g2;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final r2.t f56826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56827b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.c1 f56828c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.y0 f56829d;

    /* renamed from: e, reason: collision with root package name */
    public final l2.a1 f56830e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.x f56831f;

    /* renamed from: g, reason: collision with root package name */
    public final String f56832g;

    /* renamed from: h, reason: collision with root package name */
    public final long f56833h;

    /* renamed from: i, reason: collision with root package name */
    public final r2.b f56834i;

    /* renamed from: j, reason: collision with root package name */
    public final r2.v f56835j;

    /* renamed from: k, reason: collision with root package name */
    public final n2.e f56836k;

    /* renamed from: l, reason: collision with root package name */
    public final long f56837l;

    /* renamed from: m, reason: collision with root package name */
    public final r2.n f56838m;

    /* renamed from: n, reason: collision with root package name */
    public final j1.d2 f56839n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f56840o;

    public r1(r2.t tVar, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, d0 d0Var, kotlin.jvm.internal.u uVar) {
        this.f56826a = tVar;
        this.f56827b = j10;
        this.f56828c = c1Var;
        this.f56829d = y0Var;
        this.f56830e = a1Var;
        this.f56831f = xVar;
        this.f56832g = str;
        this.f56833h = j11;
        this.f56834i = bVar;
        this.f56835j = vVar;
        this.f56836k = eVar;
        this.f56837l = j12;
        this.f56838m = nVar;
        this.f56839n = d2Var;
        this.f56840o = d0Var;
    }

    public static /* synthetic */ void getBrush$annotations() {
    }

    public static /* synthetic */ r1 merge$default(r1 r1Var, r1 r1Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r1Var2 = null;
        }
        return r1Var.merge(r1Var2);
    }

    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final r1 m4011copy2BkPm_w(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, d0 d0Var) {
        return new r1(j1.m0.m4859equalsimpl0(j10, m4016getColor0d7_KjU()) ? this.f56826a : r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, d0Var, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final r1 m4012copyIuqyXdg(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var) {
        return new r1(j1.m0.m4859equalsimpl0(j10, m4016getColor0d7_KjU()) ? this.f56826a : r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, this.f56840o, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: copy-YSq14V0, reason: not valid java name */
    public final r1 m4013copyYSq14V0(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, d0 d0Var) {
        return new r1(r2.q.f83721a.from(b0Var), j10, c1Var, y0Var, a1Var, xVar, str, j11, bVar, vVar, eVar, j12, nVar, d2Var, d0Var, (kotlin.jvm.internal.u) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return hasSameLayoutAffectingAttributes$ui_text_release(r1Var) && kotlin.jvm.internal.e0.areEqual(this.f56826a, r1Var.f56826a) && kotlin.jvm.internal.e0.areEqual(this.f56838m, r1Var.f56838m) && kotlin.jvm.internal.e0.areEqual(this.f56839n, r1Var.f56839n);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4014getBackground0d7_KjU() {
        return this.f56837l;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final r2.b m4015getBaselineShift5SSeXJ0() {
        return this.f56834i;
    }

    public final j1.b0 getBrush() {
        return this.f56826a.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4016getColor0d7_KjU() {
        return this.f56826a.mo6039getColor0d7_KjU();
    }

    public final l2.x getFontFamily() {
        return this.f56831f;
    }

    public final String getFontFeatureSettings() {
        return this.f56832g;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4017getFontSizeXSAIIZE() {
        return this.f56827b;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final l2.y0 m4018getFontStyle4Lr2A7w() {
        return this.f56829d;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final l2.a1 m4019getFontSynthesisZQGJjVo() {
        return this.f56830e;
    }

    public final l2.c1 getFontWeight() {
        return this.f56828c;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4020getLetterSpacingXSAIIZE() {
        return this.f56833h;
    }

    public final n2.e getLocaleList() {
        return this.f56836k;
    }

    public final d0 getPlatformStyle() {
        return this.f56840o;
    }

    public final j1.d2 getShadow() {
        return this.f56839n;
    }

    public final r2.n getTextDecoration() {
        return this.f56838m;
    }

    public final r2.t getTextDrawStyle$ui_text_release() {
        return this.f56826a;
    }

    public final r2.v getTextGeometricTransform() {
        return this.f56835j;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(r1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (this == other) {
            return true;
        }
        return s2.z.m6991equalsimpl0(this.f56827b, other.f56827b) && kotlin.jvm.internal.e0.areEqual(this.f56828c, other.f56828c) && kotlin.jvm.internal.e0.areEqual(this.f56829d, other.f56829d) && kotlin.jvm.internal.e0.areEqual(this.f56830e, other.f56830e) && kotlin.jvm.internal.e0.areEqual(this.f56831f, other.f56831f) && kotlin.jvm.internal.e0.areEqual(this.f56832g, other.f56832g) && s2.z.m6991equalsimpl0(this.f56833h, other.f56833h) && kotlin.jvm.internal.e0.areEqual(this.f56834i, other.f56834i) && kotlin.jvm.internal.e0.areEqual(this.f56835j, other.f56835j) && kotlin.jvm.internal.e0.areEqual(this.f56836k, other.f56836k) && j1.m0.m4859equalsimpl0(this.f56837l, other.f56837l) && kotlin.jvm.internal.e0.areEqual(this.f56840o, other.f56840o);
    }

    public int hashCode() {
        int iM4865hashCodeimpl = j1.m0.m4865hashCodeimpl(m4016getColor0d7_KjU()) * 31;
        j1.b0 brush = getBrush();
        int iM6995hashCodeimpl = (s2.z.m6995hashCodeimpl(this.f56827b) + ((iM4865hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31)) * 31;
        l2.c1 c1Var = this.f56828c;
        int iHashCode = (iM6995hashCodeimpl + (c1Var != null ? c1Var.hashCode() : 0)) * 31;
        l2.y0 y0Var = this.f56829d;
        int iM5486hashCodeimpl = (iHashCode + (y0Var != null ? l2.y0.m5486hashCodeimpl(y0Var.m5488unboximpl()) : 0)) * 31;
        l2.a1 a1Var = this.f56830e;
        int iM5427hashCodeimpl = (iM5486hashCodeimpl + (a1Var != null ? l2.a1.m5427hashCodeimpl(a1Var.m5431unboximpl()) : 0)) * 31;
        l2.x xVar = this.f56831f;
        int iHashCode2 = (iM5427hashCodeimpl + (xVar != null ? xVar.hashCode() : 0)) * 31;
        String str = this.f56832g;
        int iM6995hashCodeimpl2 = (s2.z.m6995hashCodeimpl(this.f56833h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        r2.b bVar = this.f56834i;
        int iM6035hashCodeimpl = (iM6995hashCodeimpl2 + (bVar != null ? r2.b.m6035hashCodeimpl(bVar.m6037unboximpl()) : 0)) * 31;
        r2.v vVar = this.f56835j;
        int iHashCode3 = (iM6035hashCodeimpl + (vVar != null ? vVar.hashCode() : 0)) * 31;
        n2.e eVar = this.f56836k;
        int iM4865hashCodeimpl2 = (j1.m0.m4865hashCodeimpl(this.f56837l) + ((iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31)) * 31;
        r2.n nVar = this.f56838m;
        int iHashCode4 = (iM4865hashCodeimpl2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        j1.d2 d2Var = this.f56839n;
        int iHashCode5 = (iHashCode4 + (d2Var != null ? d2Var.hashCode() : 0)) * 31;
        d0 d0Var = this.f56840o;
        return iHashCode5 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final r1 merge(r1 r1Var) {
        d0 d0Var;
        if (r1Var == null) {
            return this;
        }
        long j10 = r1Var.f56833h;
        long j11 = r1Var.f56827b;
        r2.t tVarMerge = this.f56826a.merge(r1Var.f56826a);
        l2.x xVar = r1Var.f56831f;
        if (xVar == null) {
            xVar = this.f56831f;
        }
        l2.x xVar2 = xVar;
        if (s2.a0.m6730isUnspecifiedR2X_6o(j11)) {
            j11 = this.f56827b;
        }
        long j12 = j11;
        l2.c1 c1Var = r1Var.f56828c;
        if (c1Var == null) {
            c1Var = this.f56828c;
        }
        l2.c1 c1Var2 = c1Var;
        l2.y0 y0Var = r1Var.f56829d;
        if (y0Var == null) {
            y0Var = this.f56829d;
        }
        l2.y0 y0Var2 = y0Var;
        l2.a1 a1Var = r1Var.f56830e;
        if (a1Var == null) {
            a1Var = this.f56830e;
        }
        l2.a1 a1Var2 = a1Var;
        String str = r1Var.f56832g;
        if (str == null) {
            str = this.f56832g;
        }
        String str2 = str;
        if (s2.a0.m6730isUnspecifiedR2X_6o(j10)) {
            j10 = this.f56833h;
        }
        long j13 = j10;
        r2.b bVar = r1Var.f56834i;
        if (bVar == null) {
            bVar = this.f56834i;
        }
        r2.b bVar2 = bVar;
        r2.v vVar = r1Var.f56835j;
        if (vVar == null) {
            vVar = this.f56835j;
        }
        r2.v vVar2 = vVar;
        n2.e eVar = r1Var.f56836k;
        if (eVar == null) {
            eVar = this.f56836k;
        }
        n2.e eVar2 = eVar;
        long j14 = r1Var.f56837l;
        if (j14 == j1.m0.f68918b.m4835getUnspecified0d7_KjU()) {
            j14 = this.f56837l;
        }
        long j15 = j14;
        r2.n nVar = r1Var.f56838m;
        if (nVar == null) {
            nVar = this.f56838m;
        }
        r2.n nVar2 = nVar;
        j1.d2 d2Var = r1Var.f56839n;
        if (d2Var == null) {
            d2Var = this.f56839n;
        }
        j1.d2 d2Var2 = d2Var;
        d0 d0VarMerge = r1Var.f56840o;
        d0 d0Var2 = this.f56840o;
        if (d0Var2 == null) {
            d0Var = d0VarMerge;
        } else if (d0VarMerge == null) {
            d0Var = d0Var2;
        } else {
            d0VarMerge = d0Var2.merge(d0VarMerge);
            d0Var = d0VarMerge;
        }
        return new r1(tVarMerge, j12, c1Var2, y0Var2, a1Var2, xVar2, str2, j13, bVar2, vVar2, eVar2, j15, nVar2, d2Var2, d0Var, (kotlin.jvm.internal.u) null);
    }

    public final r1 plus(r1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) j1.m0.m4866toStringimpl(m4016getColor0d7_KjU())) + ", brush=" + getBrush() + ", fontSize=" + ((Object) s2.z.m7001toStringimpl(this.f56827b)) + ", fontWeight=" + this.f56828c + ", fontStyle=" + this.f56829d + ", fontSynthesis=" + this.f56830e + ", fontFamily=" + this.f56831f + ", fontFeatureSettings=" + this.f56832g + ", letterSpacing=" + ((Object) s2.z.m7001toStringimpl(this.f56833h)) + ", baselineShift=" + this.f56834i + ", textGeometricTransform=" + this.f56835j + ", localeList=" + this.f56836k + ", background=" + ((Object) j1.m0.m4866toStringimpl(this.f56837l)) + uQjDr.xBXZiZbShAEzKT + this.f56838m + ", shadow=" + this.f56839n + ", platformStyle=" + this.f56840o + ')';
    }

    public /* synthetic */ r1(r2.t tVar, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, d0 d0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(tVar, (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j10, (i10 & 4) != 0 ? null : c1Var, (i10 & 8) != 0 ? null : y0Var, (i10 & 16) != 0 ? null : a1Var, (i10 & 32) != 0 ? null : xVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar, (i10 & 512) != 0 ? null : vVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j12, (i10 & 4096) != 0 ? null : nVar, (i10 & Segment.SIZE) != 0 ? null : d2Var, (i10 & 16384) != 0 ? null : d0Var, (kotlin.jvm.internal.u) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r1(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, int i10, kotlin.jvm.internal.u uVar) {
        long jM4835getUnspecified0d7_KjU = (i10 & 1) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10;
        long jM6983getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11;
        l2.c1 c1Var2 = (i10 & 4) != 0 ? null : c1Var;
        l2.y0 y0Var2 = (i10 & 8) != 0 ? null : y0Var;
        l2.a1 a1Var2 = (i10 & 16) != 0 ? null : a1Var;
        l2.x xVar2 = (i10 & 32) != 0 ? null : xVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM6983getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j12;
        r2.b bVar2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar;
        r2.v vVar2 = (i10 & 512) != 0 ? null : vVar;
        n2.e eVar2 = (i10 & 1024) != 0 ? null : eVar;
        long jM4835getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j13;
        this(jM4835getUnspecified0d7_KjU, jM6983getUnspecifiedXSAIIZE, c1Var2, y0Var2, a1Var2, xVar2, str2, jM6983getUnspecifiedXSAIIZE2, bVar2, vVar2, eVar2, jM4835getUnspecified0d7_KjU2, (i10 & 4096) != 0 ? null : nVar, (i10 & Segment.SIZE) != 0 ? null : d2Var, null);
    }

    public r1(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, kotlin.jvm.internal.u uVar) {
        this(r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, (d0) null, (kotlin.jvm.internal.u) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r1(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, d0 d0Var, int i10, kotlin.jvm.internal.u uVar) {
        long jM4835getUnspecified0d7_KjU = (i10 & 1) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10;
        long jM6983getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11;
        l2.c1 c1Var2 = (i10 & 4) != 0 ? null : c1Var;
        l2.y0 y0Var2 = (i10 & 8) != 0 ? null : y0Var;
        l2.a1 a1Var2 = (i10 & 16) != 0 ? null : a1Var;
        l2.x xVar2 = (i10 & 32) != 0 ? null : xVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM6983getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j12;
        r2.b bVar2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar;
        r2.v vVar2 = (i10 & 512) != 0 ? null : vVar;
        n2.e eVar2 = (i10 & 1024) != 0 ? null : eVar;
        long jM4835getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j13;
        r2.n nVar2 = (i10 & 4096) != 0 ? null : nVar;
        long j14 = jM4835getUnspecified0d7_KjU;
        j1.d2 d2Var2 = (i10 & Segment.SIZE) != 0 ? null : d2Var;
        l2.y0 y0Var3 = y0Var2;
        l2.a1 a1Var3 = a1Var2;
        l2.x xVar3 = xVar2;
        String str3 = str2;
        long j15 = jM6983getUnspecifiedXSAIIZE2;
        r2.b bVar3 = bVar2;
        r2.v vVar3 = vVar2;
        n2.e eVar3 = eVar2;
        long j16 = jM4835getUnspecified0d7_KjU2;
        this(j14, jM6983getUnspecifiedXSAIIZE, c1Var2, y0Var3, a1Var3, xVar3, str3, j15, bVar3, vVar3, eVar3, j16, nVar2, d2Var2, (i10 & 16384) != 0 ? null : d0Var, (kotlin.jvm.internal.u) null);
    }

    public r1(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, d0 d0Var, kotlin.jvm.internal.u uVar) {
        this(r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, d0Var, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ r1(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, d0 d0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(b0Var, (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j10, (i10 & 4) != 0 ? null : c1Var, (i10 & 8) != 0 ? null : y0Var, (i10 & 16) != 0 ? null : a1Var, (i10 & 32) != 0 ? null : xVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar, (i10 & 512) != 0 ? null : vVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j12, (i10 & 4096) != 0 ? null : nVar, (i10 & Segment.SIZE) != 0 ? null : d2Var, (i10 & 16384) != 0 ? null : d0Var, (kotlin.jvm.internal.u) null);
    }

    public r1(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, d0 d0Var, kotlin.jvm.internal.u uVar) {
        this(r2.q.f83721a.from(b0Var), j10, c1Var, y0Var, a1Var, xVar, str, j11, bVar, vVar, eVar, j12, nVar, d2Var, d0Var, (kotlin.jvm.internal.u) null);
    }
}
