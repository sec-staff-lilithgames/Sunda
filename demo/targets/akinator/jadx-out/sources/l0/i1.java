package l0;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import g2.c2;
import p0.i3;
import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public y0 f72101a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f72102b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.f f72103c;

    /* renamed from: d, reason: collision with root package name */
    public m2.w0 f72104d;

    /* renamed from: e, reason: collision with root package name */
    public final j2 f72105e;

    /* renamed from: f, reason: collision with root package name */
    public x1.d0 f72106f;

    /* renamed from: g, reason: collision with root package name */
    public final j2 f72107g;

    /* renamed from: h, reason: collision with root package name */
    public final j2 f72108h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f72109i;

    /* renamed from: j, reason: collision with root package name */
    public final j2 f72110j;

    /* renamed from: k, reason: collision with root package name */
    public final j2 f72111k;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f72112l;

    /* renamed from: m, reason: collision with root package name */
    public final t f72113m;

    /* renamed from: n, reason: collision with root package name */
    public kv.l f72114n;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f72115o;

    /* renamed from: p, reason: collision with root package name */
    public final f1 f72116p;

    /* renamed from: q, reason: collision with root package name */
    public final j1.i1 f72117q;

    public i1(y0 textDelegate, i3 recomposeScope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textDelegate, "textDelegate");
        kotlin.jvm.internal.e0.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.f72101a = textDelegate;
        this.f72102b = recomposeScope;
        this.f72103c = new m2.f();
        Boolean bool = Boolean.FALSE;
        this.f72105e = o5.mutableStateOf$default(bool, null, 2, null);
        this.f72107g = o5.mutableStateOf$default(null, null, 2, null);
        this.f72108h = o5.mutableStateOf$default(r.f72161b, null, 2, null);
        this.f72110j = o5.mutableStateOf$default(bool, null, 2, null);
        this.f72111k = o5.mutableStateOf$default(bool, null, 2, null);
        this.f72112l = o5.mutableStateOf$default(bool, null, 2, null);
        this.f72113m = new t();
        this.f72114n = h1.f72096e;
        this.f72115o = new g1(this);
        this.f72116p = new f1(this);
        this.f72117q = j1.k.Paint();
    }

    public final r getHandleState() {
        return (r) this.f72108h.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.f72105e.getValue()).booleanValue();
    }

    public final m2.w0 getInputSession() {
        return this.f72104d;
    }

    public final x1.d0 getLayoutCoordinates() {
        return this.f72106f;
    }

    public final k1 getLayoutResult() {
        return (k1) this.f72107g.getValue();
    }

    public final kv.l getOnImeActionPerformed() {
        return this.f72116p;
    }

    public final kv.l getOnValueChange() {
        return this.f72115o;
    }

    public final m2.f getProcessor() {
        return this.f72103c;
    }

    public final i3 getRecomposeScope() {
        return this.f72102b;
    }

    public final j1.i1 getSelectionPaint() {
        return this.f72117q;
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.f72112l.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.f72109i;
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.f72111k.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.f72110j.getValue()).booleanValue();
    }

    public final y0 getTextDelegate() {
        return this.f72101a;
    }

    public final void setHandleState(r rVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rVar, "<set-?>");
        this.f72108h.setValue(rVar);
    }

    public final void setHasFocus(boolean z10) {
        this.f72105e.setValue(Boolean.valueOf(z10));
    }

    public final void setInputSession(m2.w0 w0Var) {
        this.f72104d = w0Var;
    }

    public final void setLayoutCoordinates(x1.d0 d0Var) {
        this.f72106f = d0Var;
    }

    public final void setLayoutResult(k1 k1Var) {
        this.f72107g.setValue(k1Var);
    }

    public final void setShowCursorHandle(boolean z10) {
        this.f72112l.setValue(Boolean.valueOf(z10));
    }

    public final void setShowFloatingToolbar(boolean z10) {
        this.f72109i = z10;
    }

    public final void setShowSelectionHandleEnd(boolean z10) {
        this.f72111k.setValue(Boolean.valueOf(z10));
    }

    public final void setShowSelectionHandleStart(boolean z10) {
        this.f72110j.setValue(Boolean.valueOf(z10));
    }

    public final void setTextDelegate(y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<set-?>");
        this.f72101a = y0Var;
    }

    /* renamed from: update-aKPr-nQ, reason: not valid java name */
    public final void m5264updateaKPrnQ(g2.b visualText, c2 textStyle, boolean z10, s2.e density, l2.y fontFamilyResolver, kv.l onValueChange, v keyboardActions, h1.m focusManager, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visualText, "visualText");
        kotlin.jvm.internal.e0.checkNotNullParameter(textStyle, "textStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.e0.checkNotNullParameter(onValueChange, "onValueChange");
        kotlin.jvm.internal.e0.checkNotNullParameter(keyboardActions, "keyboardActions");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusManager, "focusManager");
        this.f72114n = onValueChange;
        this.f72117q.mo4772setColor8_81llA(j10);
        t tVar = this.f72113m;
        tVar.setKeyboardActions(keyboardActions);
        tVar.setFocusManager(focusManager);
        this.f72101a = p.m5275updateTextDelegatex_uQXYA(this.f72101a, visualText, textStyle, density, fontFamilyResolver, (PsExtractor.AUDIO_STREAM & 32) != 0 ? true : z10, (PsExtractor.AUDIO_STREAM & 64) != 0 ? r2.a0.f83672b.m6099getClipgIe3tQ8() : 0, (PsExtractor.AUDIO_STREAM & 128) != 0 ? Integer.MAX_VALUE : 0, uu.p0.emptyList());
    }
}
