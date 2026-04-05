package g2;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f56741d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final c2 f56742e = new c2(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);

    /* renamed from: a, reason: collision with root package name */
    public final r1 f56743a;

    /* renamed from: b, reason: collision with root package name */
    public final x f56744b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f56745c;

    public c2(r1 spanStyle, x paragraphStyle, f0 f0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyle, "spanStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.f56743a = spanStyle;
        this.f56744b = paragraphStyle;
        this.f56745c = f0Var;
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ c2 m3975copyHL5avdY$default(c2 c2Var, long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, int i10, Object obj) {
        long jM4016getColor0d7_KjU = (i10 & 1) != 0 ? c2Var.f56743a.m4016getColor0d7_KjU() : j10;
        return c2Var.m3978copyHL5avdY(jM4016getColor0d7_KjU, (i10 & 2) != 0 ? c2Var.f56743a.m4017getFontSizeXSAIIZE() : j11, (i10 & 4) != 0 ? c2Var.f56743a.getFontWeight() : c1Var, (i10 & 8) != 0 ? c2Var.f56743a.m4018getFontStyle4Lr2A7w() : y0Var, (i10 & 16) != 0 ? c2Var.f56743a.m4019getFontSynthesisZQGJjVo() : a1Var, (i10 & 32) != 0 ? c2Var.f56743a.getFontFamily() : xVar, (i10 & 64) != 0 ? c2Var.f56743a.getFontFeatureSettings() : str, (i10 & 128) != 0 ? c2Var.f56743a.m4020getLetterSpacingXSAIIZE() : j12, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? c2Var.f56743a.m4015getBaselineShift5SSeXJ0() : bVar, (i10 & 512) != 0 ? c2Var.f56743a.getTextGeometricTransform() : vVar, (i10 & 1024) != 0 ? c2Var.f56743a.getLocaleList() : eVar, (i10 & 2048) != 0 ? c2Var.f56743a.m4014getBackground0d7_KjU() : j13, (i10 & 4096) != 0 ? c2Var.f56743a.getTextDecoration() : nVar, (i10 & Segment.SIZE) != 0 ? c2Var.f56743a.getShadow() : d2Var, (i10 & 16384) != 0 ? c2Var.f56744b.m4038getTextAlignbuA522U() : mVar, (i10 & 32768) != 0 ? c2Var.f56744b.m4039getTextDirectionmmuk1to() : pVar, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? c2Var.f56744b.m4037getLineHeightXSAIIZE() : j14, (i10 & 131072) != 0 ? c2Var.f56744b.getTextIndent() : xVar2);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ c2 m3976copyNOaFTUo$default(c2 c2Var, long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, f0 f0Var, r2.h hVar, int i10, Object obj) {
        r2.h lineHeightStyle;
        f0 f0Var2;
        long jM4016getColor0d7_KjU = (i10 & 1) != 0 ? c2Var.f56743a.m4016getColor0d7_KjU() : j10;
        long jM4017getFontSizeXSAIIZE = (i10 & 2) != 0 ? c2Var.f56743a.m4017getFontSizeXSAIIZE() : j11;
        l2.c1 fontWeight = (i10 & 4) != 0 ? c2Var.f56743a.getFontWeight() : c1Var;
        l2.y0 y0VarM4018getFontStyle4Lr2A7w = (i10 & 8) != 0 ? c2Var.f56743a.m4018getFontStyle4Lr2A7w() : y0Var;
        l2.a1 a1VarM4019getFontSynthesisZQGJjVo = (i10 & 16) != 0 ? c2Var.f56743a.m4019getFontSynthesisZQGJjVo() : a1Var;
        l2.x fontFamily = (i10 & 32) != 0 ? c2Var.f56743a.getFontFamily() : xVar;
        String fontFeatureSettings = (i10 & 64) != 0 ? c2Var.f56743a.getFontFeatureSettings() : str;
        long jM4020getLetterSpacingXSAIIZE = (i10 & 128) != 0 ? c2Var.f56743a.m4020getLetterSpacingXSAIIZE() : j12;
        r2.b bVarM4015getBaselineShift5SSeXJ0 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? c2Var.f56743a.m4015getBaselineShift5SSeXJ0() : bVar;
        r2.v textGeometricTransform = (i10 & 512) != 0 ? c2Var.f56743a.getTextGeometricTransform() : vVar;
        n2.e localeList = (i10 & 1024) != 0 ? c2Var.f56743a.getLocaleList() : eVar;
        long j15 = jM4016getColor0d7_KjU;
        long jM4014getBackground0d7_KjU = (i10 & 2048) != 0 ? c2Var.f56743a.m4014getBackground0d7_KjU() : j13;
        r2.n textDecoration = (i10 & 4096) != 0 ? c2Var.f56743a.getTextDecoration() : nVar;
        j1.d2 shadow = (i10 & Segment.SIZE) != 0 ? c2Var.f56743a.getShadow() : d2Var;
        r2.n nVar2 = textDecoration;
        r2.m mVarM4038getTextAlignbuA522U = (i10 & 16384) != 0 ? c2Var.f56744b.m4038getTextAlignbuA522U() : mVar;
        r2.p pVarM4039getTextDirectionmmuk1to = (i10 & 32768) != 0 ? c2Var.f56744b.m4039getTextDirectionmmuk1to() : pVar;
        long jM4037getLineHeightXSAIIZE = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? c2Var.f56744b.m4037getLineHeightXSAIIZE() : j14;
        r2.x textIndent = (i10 & 131072) != 0 ? c2Var.f56744b.getTextIndent() : xVar2;
        f0 f0Var3 = (i10 & 262144) != 0 ? c2Var.f56745c : f0Var;
        if ((i10 & 524288) != 0) {
            f0Var2 = f0Var3;
            lineHeightStyle = c2Var.f56744b.getLineHeightStyle();
        } else {
            lineHeightStyle = hVar;
            f0Var2 = f0Var3;
        }
        return c2Var.m3979copyNOaFTUo(j15, jM4017getFontSizeXSAIIZE, fontWeight, y0VarM4018getFontStyle4Lr2A7w, a1VarM4019getFontSynthesisZQGJjVo, fontFamily, fontFeatureSettings, jM4020getLetterSpacingXSAIIZE, bVarM4015getBaselineShift5SSeXJ0, textGeometricTransform, localeList, jM4014getBackground0d7_KjU, nVar2, shadow, mVarM4038getTextAlignbuA522U, pVarM4039getTextDirectionmmuk1to, jM4037getLineHeightXSAIIZE, textIndent, f0Var2, lineHeightStyle);
    }

    /* renamed from: copy-WQp3-mU$default, reason: not valid java name */
    public static /* synthetic */ c2 m3977copyWQp3mU$default(c2 c2Var, j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j13, r2.x xVar2, f0 f0Var, r2.h hVar, int i10, Object obj) {
        r2.h lineHeightStyle;
        f0 f0Var2;
        r2.n nVar2;
        r2.p pVar2;
        r2.m mVar2;
        j1.d2 d2Var2;
        l2.y0 y0Var2;
        l2.a1 a1Var2;
        l2.x xVar3;
        String str2;
        long j14;
        r2.b bVar2;
        r2.v vVar2;
        n2.e eVar2;
        long j15;
        long j16;
        long j17;
        r2.x xVar4;
        c2 c2Var2;
        l2.c1 c1Var2;
        long jM4017getFontSizeXSAIIZE = (i10 & 2) != 0 ? c2Var.f56743a.m4017getFontSizeXSAIIZE() : j10;
        l2.c1 fontWeight = (i10 & 4) != 0 ? c2Var.f56743a.getFontWeight() : c1Var;
        l2.y0 y0VarM4018getFontStyle4Lr2A7w = (i10 & 8) != 0 ? c2Var.f56743a.m4018getFontStyle4Lr2A7w() : y0Var;
        l2.a1 a1VarM4019getFontSynthesisZQGJjVo = (i10 & 16) != 0 ? c2Var.f56743a.m4019getFontSynthesisZQGJjVo() : a1Var;
        l2.x fontFamily = (i10 & 32) != 0 ? c2Var.f56743a.getFontFamily() : xVar;
        String fontFeatureSettings = (i10 & 64) != 0 ? c2Var.f56743a.getFontFeatureSettings() : str;
        long jM4020getLetterSpacingXSAIIZE = (i10 & 128) != 0 ? c2Var.f56743a.m4020getLetterSpacingXSAIIZE() : j11;
        r2.b bVarM4015getBaselineShift5SSeXJ0 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? c2Var.f56743a.m4015getBaselineShift5SSeXJ0() : bVar;
        r2.v textGeometricTransform = (i10 & 512) != 0 ? c2Var.f56743a.getTextGeometricTransform() : vVar;
        n2.e localeList = (i10 & 1024) != 0 ? c2Var.f56743a.getLocaleList() : eVar;
        long jM4014getBackground0d7_KjU = (i10 & 2048) != 0 ? c2Var.f56743a.m4014getBackground0d7_KjU() : j12;
        long j18 = jM4017getFontSizeXSAIIZE;
        r2.n textDecoration = (i10 & 4096) != 0 ? c2Var.f56743a.getTextDecoration() : nVar;
        j1.d2 shadow = (i10 & Segment.SIZE) != 0 ? c2Var.f56743a.getShadow() : d2Var;
        r2.n nVar3 = textDecoration;
        r2.m mVarM4038getTextAlignbuA522U = (i10 & 16384) != 0 ? c2Var.f56744b.m4038getTextAlignbuA522U() : mVar;
        r2.p pVarM4039getTextDirectionmmuk1to = (i10 & 32768) != 0 ? c2Var.f56744b.m4039getTextDirectionmmuk1to() : pVar;
        long jM4037getLineHeightXSAIIZE = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? c2Var.f56744b.m4037getLineHeightXSAIIZE() : j13;
        r2.x textIndent = (i10 & 131072) != 0 ? c2Var.f56744b.getTextIndent() : xVar2;
        f0 f0Var3 = (i10 & 262144) != 0 ? c2Var.f56745c : f0Var;
        if ((i10 & 524288) != 0) {
            f0Var2 = f0Var3;
            lineHeightStyle = c2Var.f56744b.getLineHeightStyle();
            nVar2 = nVar3;
            pVar2 = pVarM4039getTextDirectionmmuk1to;
            xVar4 = textIndent;
            mVar2 = mVarM4038getTextAlignbuA522U;
            d2Var2 = shadow;
            c1Var2 = fontWeight;
            y0Var2 = y0VarM4018getFontStyle4Lr2A7w;
            a1Var2 = a1VarM4019getFontSynthesisZQGJjVo;
            xVar3 = fontFamily;
            str2 = fontFeatureSettings;
            j14 = jM4020getLetterSpacingXSAIIZE;
            bVar2 = bVarM4015getBaselineShift5SSeXJ0;
            vVar2 = textGeometricTransform;
            eVar2 = localeList;
            j15 = jM4014getBackground0d7_KjU;
            j16 = jM4037getLineHeightXSAIIZE;
            j17 = j18;
            c2Var2 = c2Var;
        } else {
            lineHeightStyle = hVar;
            f0Var2 = f0Var3;
            nVar2 = nVar3;
            pVar2 = pVarM4039getTextDirectionmmuk1to;
            mVar2 = mVarM4038getTextAlignbuA522U;
            d2Var2 = shadow;
            y0Var2 = y0VarM4018getFontStyle4Lr2A7w;
            a1Var2 = a1VarM4019getFontSynthesisZQGJjVo;
            xVar3 = fontFamily;
            str2 = fontFeatureSettings;
            j14 = jM4020getLetterSpacingXSAIIZE;
            bVar2 = bVarM4015getBaselineShift5SSeXJ0;
            vVar2 = textGeometricTransform;
            eVar2 = localeList;
            j15 = jM4014getBackground0d7_KjU;
            j16 = jM4037getLineHeightXSAIIZE;
            j17 = j18;
            xVar4 = textIndent;
            c2Var2 = c2Var;
            c1Var2 = fontWeight;
        }
        return c2Var2.m3980copyWQp3mU(b0Var, j17, c1Var2, y0Var2, a1Var2, xVar3, str2, j14, bVar2, vVar2, eVar2, j15, nVar2, d2Var2, mVar2, pVar2, j16, xVar4, f0Var2, lineHeightStyle);
    }

    public static /* synthetic */ c2 merge$default(c2 c2Var, c2 c2Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2Var2 = null;
        }
        return c2Var.merge(c2Var2);
    }

    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final c2 m3978copyHL5avdY(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2) {
        r1 r1Var = this.f56743a;
        return new c2(new r1(j1.m0.m4859equalsimpl0(j10, r1Var.m4016getColor0d7_KjU()) ? r1Var.getTextDrawStyle$ui_text_release() : r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, r1Var.getPlatformStyle(), (kotlin.jvm.internal.u) null), new x(mVar, pVar, j14, xVar2, this.f56744b.getPlatformStyle(), getLineHeightStyle(), null), this.f56745c);
    }

    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final c2 m3979copyNOaFTUo(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, f0 f0Var, r2.h hVar) {
        r1 r1Var = this.f56743a;
        return new c2(new r1(j1.m0.m4859equalsimpl0(j10, r1Var.m4016getColor0d7_KjU()) ? r1Var.getTextDrawStyle$ui_text_release() : r2.q.f83721a.m6091from8_81llA(j10), j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, f0Var != null ? f0Var.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new x(mVar, pVar, j14, xVar2, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, null), f0Var);
    }

    /* renamed from: copy-WQp3-mU, reason: not valid java name */
    public final c2 m3980copyWQp3mU(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j13, r2.x xVar2, f0 f0Var, r2.h hVar) {
        return new c2(new r1(b0Var, j10, c1Var, y0Var, a1Var, xVar, str, j11, bVar, vVar, eVar, j12, nVar, d2Var, f0Var != null ? f0Var.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new x(mVar, pVar, j13, xVar2, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, null), f0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56743a, c2Var.f56743a) && kotlin.jvm.internal.e0.areEqual(this.f56744b, c2Var.f56744b) && kotlin.jvm.internal.e0.areEqual(this.f56745c, c2Var.f56745c);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m3981getBackground0d7_KjU() {
        return this.f56743a.m4014getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final r2.b m3982getBaselineShift5SSeXJ0() {
        return this.f56743a.m4015getBaselineShift5SSeXJ0();
    }

    public final j1.b0 getBrush() {
        return this.f56743a.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3983getColor0d7_KjU() {
        return this.f56743a.m4016getColor0d7_KjU();
    }

    public final l2.x getFontFamily() {
        return this.f56743a.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.f56743a.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m3984getFontSizeXSAIIZE() {
        return this.f56743a.m4017getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final l2.y0 m3985getFontStyle4Lr2A7w() {
        return this.f56743a.m4018getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final l2.a1 m3986getFontSynthesisZQGJjVo() {
        return this.f56743a.m4019getFontSynthesisZQGJjVo();
    }

    public final l2.c1 getFontWeight() {
        return this.f56743a.getFontWeight();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m3987getLetterSpacingXSAIIZE() {
        return this.f56743a.m4020getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3988getLineHeightXSAIIZE() {
        return this.f56744b.m4037getLineHeightXSAIIZE();
    }

    public final r2.h getLineHeightStyle() {
        return this.f56744b.getLineHeightStyle();
    }

    public final n2.e getLocaleList() {
        return this.f56743a.getLocaleList();
    }

    public final x getParagraphStyle$ui_text_release() {
        return this.f56744b;
    }

    public final f0 getPlatformStyle() {
        return this.f56745c;
    }

    public final j1.d2 getShadow() {
        return this.f56743a.getShadow();
    }

    public final r1 getSpanStyle$ui_text_release() {
        return this.f56743a;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final r2.m m3989getTextAlignbuA522U() {
        return this.f56744b.m4038getTextAlignbuA522U();
    }

    public final r2.n getTextDecoration() {
        return this.f56743a.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final r2.p m3990getTextDirectionmmuk1to() {
        return this.f56744b.m4039getTextDirectionmmuk1to();
    }

    public final r2.v getTextGeometricTransform() {
        return this.f56743a.getTextGeometricTransform();
    }

    public final r2.x getTextIndent() {
        return this.f56744b.getTextIndent();
    }

    public final boolean hasSameLayoutAffectingAttributes(c2 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (this != other) {
            return kotlin.jvm.internal.e0.areEqual(this.f56744b, other.f56744b) && this.f56743a.hasSameLayoutAffectingAttributes$ui_text_release(other.f56743a);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (this.f56744b.hashCode() + (this.f56743a.hashCode() * 31)) * 31;
        f0 f0Var = this.f56745c;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public final c2 merge(c2 c2Var) {
        return (c2Var == null || kotlin.jvm.internal.e0.areEqual(c2Var, f56742e)) ? this : new c2(toSpanStyle().merge(c2Var.toSpanStyle()), toParagraphStyle().merge(c2Var.toParagraphStyle()));
    }

    public final c2 plus(c2 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public final x toParagraphStyle() {
        return this.f56744b;
    }

    public final r1 toSpanStyle() {
        return this.f56743a;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) j1.m0.m4866toStringimpl(m3983getColor0d7_KjU())) + ", brush=" + getBrush() + ", fontSize=" + ((Object) s2.z.m7001toStringimpl(m3984getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m3985getFontStyle4Lr2A7w() + ", fontSynthesis=" + m3986getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) s2.z.m7001toStringimpl(m3987getLetterSpacingXSAIIZE())) + ", baselineShift=" + m3982getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) j1.m0.m4866toStringimpl(m3981getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", textAlign=" + m3989getTextAlignbuA522U() + ", textDirection=" + m3990getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) s2.z.m7001toStringimpl(m3988getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.f56745c + "lineHeightStyle=" + getLineHeightStyle() + ')';
    }

    public final c2 plus(x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public final c2 plus(r1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public /* synthetic */ c2(r1 r1Var, x xVar, f0 f0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(r1Var, xVar, (i10 & 4) != 0 ? null : f0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(r1 spanStyle, x paragraphStyle) {
        this(spanStyle, paragraphStyle, e2.access$createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyle, "spanStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphStyle, "paragraphStyle");
    }

    public final c2 merge(r1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return new c2(toSpanStyle().merge(other), toParagraphStyle());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c2(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, int i10, kotlin.jvm.internal.u uVar) {
        long jM4835getUnspecified0d7_KjU = (i10 & 1) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10;
        long jM6983getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11;
        l2.c1 c1Var2 = (i10 & 4) != 0 ? null : c1Var;
        l2.y0 y0Var2 = (i10 & 8) != 0 ? null : y0Var;
        l2.a1 a1Var2 = (i10 & 16) != 0 ? null : a1Var;
        l2.x xVar3 = (i10 & 32) != 0 ? null : xVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM6983getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j12;
        r2.b bVar2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar;
        r2.v vVar2 = (i10 & 512) != 0 ? null : vVar;
        n2.e eVar2 = (i10 & 1024) != 0 ? null : eVar;
        long jM4835getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j13;
        r2.n nVar2 = (i10 & 4096) != 0 ? null : nVar;
        long j15 = jM4835getUnspecified0d7_KjU;
        j1.d2 d2Var2 = (i10 & Segment.SIZE) != 0 ? null : d2Var;
        l2.y0 y0Var3 = y0Var2;
        l2.a1 a1Var3 = a1Var2;
        l2.x xVar4 = xVar3;
        String str3 = str2;
        long j16 = jM6983getUnspecifiedXSAIIZE2;
        r2.b bVar3 = bVar2;
        r2.v vVar3 = vVar2;
        n2.e eVar3 = eVar2;
        long j17 = jM4835getUnspecified0d7_KjU2;
        this(j15, jM6983getUnspecifiedXSAIIZE, c1Var2, y0Var3, a1Var3, xVar4, str3, j16, bVar3, vVar3, eVar3, j17, nVar2, d2Var2, (i10 & 16384) != 0 ? null : mVar, (i10 & 32768) != 0 ? null : pVar, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j14, (i10 & 131072) != 0 ? null : xVar2, null);
    }

    public final c2 merge(x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return new c2(toSpanStyle(), toParagraphStyle().merge(other));
    }

    public c2(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, kotlin.jvm.internal.u uVar) {
        this(new r1(j10, j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, (d0) null, (kotlin.jvm.internal.u) null), new x(mVar, pVar, j14, xVar2, null, null, null), null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c2 getDefault() {
            return c2.f56742e;
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public static /* synthetic */ void getBrush$annotations() {
    }

    public static /* synthetic */ void getLineHeightStyle$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c2(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, f0 f0Var, r2.h hVar, int i10, kotlin.jvm.internal.u uVar) {
        long jM4835getUnspecified0d7_KjU = (i10 & 1) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10;
        long jM6983getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11;
        l2.c1 c1Var2 = (i10 & 4) != 0 ? null : c1Var;
        l2.y0 y0Var2 = (i10 & 8) != 0 ? null : y0Var;
        l2.a1 a1Var2 = (i10 & 16) != 0 ? null : a1Var;
        l2.x xVar3 = (i10 & 32) != 0 ? null : xVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM6983getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j12;
        r2.b bVar2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar;
        r2.v vVar2 = (i10 & 512) != 0 ? null : vVar;
        n2.e eVar2 = (i10 & 1024) != 0 ? null : eVar;
        long jM4835getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j13;
        r2.n nVar2 = (i10 & 4096) != 0 ? null : nVar;
        long j15 = jM4835getUnspecified0d7_KjU;
        j1.d2 d2Var2 = (i10 & Segment.SIZE) != 0 ? null : d2Var;
        l2.y0 y0Var3 = y0Var2;
        l2.a1 a1Var3 = a1Var2;
        l2.x xVar4 = xVar3;
        String str3 = str2;
        long j16 = jM6983getUnspecifiedXSAIIZE2;
        r2.b bVar3 = bVar2;
        r2.v vVar3 = vVar2;
        n2.e eVar3 = eVar2;
        long j17 = jM4835getUnspecified0d7_KjU2;
        this(j15, jM6983getUnspecifiedXSAIIZE, c1Var2, y0Var3, a1Var3, xVar4, str3, j16, bVar3, vVar3, eVar3, j17, nVar2, d2Var2, (i10 & 16384) != 0 ? null : mVar, (i10 & 32768) != 0 ? null : pVar, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j14, (i10 & 131072) != 0 ? null : xVar2, (i10 & 262144) != 0 ? null : f0Var, (i10 & 524288) != 0 ? null : hVar, (kotlin.jvm.internal.u) null);
    }

    public c2(long j10, long j11, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j12, r2.b bVar, r2.v vVar, n2.e eVar, long j13, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j14, r2.x xVar2, f0 f0Var, r2.h hVar, kotlin.jvm.internal.u uVar) {
        this(new r1(j10, j11, c1Var, y0Var, a1Var, xVar, str, j12, bVar, vVar, eVar, j13, nVar, d2Var, f0Var != null ? f0Var.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new x(mVar, pVar, j14, xVar2, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, null), f0Var);
    }

    public /* synthetic */ c2(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j13, r2.x xVar2, f0 f0Var, r2.h hVar, int i10, kotlin.jvm.internal.u uVar) {
        this(b0Var, (i10 & 2) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j10, (i10 & 4) != 0 ? null : c1Var, (i10 & 8) != 0 ? null : y0Var, (i10 & 16) != 0 ? null : a1Var, (i10 & 32) != 0 ? null : xVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j11, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bVar, (i10 & 512) != 0 ? null : vVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j12, (i10 & 4096) != 0 ? null : nVar, (i10 & Segment.SIZE) != 0 ? null : d2Var, (i10 & 16384) != 0 ? null : mVar, (32768 & i10) != 0 ? null : pVar, (65536 & i10) != 0 ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : j13, (131072 & i10) != 0 ? null : xVar2, (262144 & i10) != 0 ? null : f0Var, (i10 & 524288) != 0 ? null : hVar, (kotlin.jvm.internal.u) null);
    }

    public c2(j1.b0 b0Var, long j10, l2.c1 c1Var, l2.y0 y0Var, l2.a1 a1Var, l2.x xVar, String str, long j11, r2.b bVar, r2.v vVar, n2.e eVar, long j12, r2.n nVar, j1.d2 d2Var, r2.m mVar, r2.p pVar, long j13, r2.x xVar2, f0 f0Var, r2.h hVar, kotlin.jvm.internal.u uVar) {
        this(new r1(b0Var, j10, c1Var, y0Var, a1Var, xVar, str, j11, bVar, vVar, eVar, j12, nVar, d2Var, f0Var != null ? f0Var.getSpanStyle() : null, (kotlin.jvm.internal.u) null), new x(mVar, pVar, j13, xVar2, f0Var != null ? f0Var.getParagraphStyle() : null, hVar, null), f0Var);
    }
}
