package com.fyber.inneractive.sdk.player.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends s {
    public final t0 A;

    /* renamed from: y, reason: collision with root package name */
    public final o f26273y;

    /* renamed from: z, reason: collision with root package name */
    public p f26274z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r20, com.fyber.inneractive.sdk.player.ui.a r21, com.fyber.inneractive.sdk.player.n r22, com.fyber.inneractive.sdk.config.global.r r23, java.lang.String r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.ui.i.<init>(android.content.Context, com.fyber.inneractive.sdk.player.ui.a, com.fyber.inneractive.sdk.player.n, com.fyber.inneractive.sdk.config.global.r, java.lang.String):void");
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        p pVar = this.f26274z;
        return pVar != null && pVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        this.f26273y.b(z10);
        if (a(this.f26274z)) {
            this.f26274z.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        this.f26273y.c(z10);
        if (a(this.f26274z)) {
            this.f26274z.c(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        this.f26273y.d(z10);
        if (a(this.f26274z)) {
            this.f26274z.d(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        if (a(this.f26274z)) {
            this.f26274z.e(z10);
        } else {
            this.f26273y.e(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        this.f26273y.f(z10);
        if (a(this.f26274z)) {
            this.f26274z.f(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        if (a(this.f26274z)) {
            this.f26274z.g(z10);
        } else {
            this.f26273y.g(z10);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f23944a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.A;
        if (t0Var != null) {
            return t0Var.f23945b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f26273y.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.f26274z) ? this.f26274z.getTrackingFriendlyView() : this.f26273y.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.f26274z) ? this.f26274z.getTrackingFriendlyViewObstructionPurposeOther() : this.f26273y.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.f26273y.h();
        if (a(this.f26274z)) {
            this.f26274z.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean i() {
        return a(this.f26274z) ? this.f26274z.L.f26300n : this.f26273y.i();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.f26273y.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.f26273y.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.f26274z) ? this.f26274z.L.f26299m : this.f26273y.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.f26273y.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.f26273y.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f26273y.o();
        this.f26328t = this.f26273y.f26328t;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.f26273y.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f26273y.setListener(nVar);
        if (a(this.f26274z)) {
            this.f26274z.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        this.f26273y.setMuteButtonState(z10);
        if (a(this.f26274z)) {
            this.f26274z.setMuteButtonState(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.f26273y.setRemainingTime(str);
        if (a(this.f26274z)) {
            this.f26274z.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) throws NumberFormatException {
        this.f26273y.setSkipText(str);
        if (a(this.f26274z)) {
            this.f26274z.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.f26273y.setUnitConfig(s0Var);
        if (a(this.f26274z)) {
            this.f26274z.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.f26273y.a(dVar, bVar);
        if (!a(this.f26274z) || (viewGroup = this.f26325q) == null || viewGroup.getVisibility() != 0 || (pVar = this.f26274z) == null) {
            return;
        }
        pVar.destroy();
        this.f26274z = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f() {
        o oVar = this.f26273y;
        oVar.p();
        oVar.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        this.f26273y.g();
        if (a(this.f26274z)) {
            this.f26274z.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.f26274z)) {
            this.f26273y.a(z10, mVar);
        } else {
            this.f26274z.a(z10, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        this.f26273y.a(z10, str);
        if (a(this.f26274z)) {
            this.f26274z.a(z10, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, int i10, int i11) {
        this.f26322n = i10;
        this.f26323o = i11;
        this.f26324p = z10;
        o oVar = this.f26273y;
        oVar.f26322n = i10;
        oVar.f26323o = i11;
        oVar.f26324p = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.f26273y.a(bVar, bVar2);
        p pVar = this.f26274z;
        if (pVar != null) {
            pVar.destroy();
            this.f26274z = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        if (a(this.f26274z)) {
            this.f26274z.a(z10);
        } else {
            this.f26273y.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        this.f26273y.a(i10, i11);
        if (a(this.f26274z)) {
            this.f26274z.a(i10, i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i10, int i11) {
        this.f26273y.a(h1Var, i10, i11);
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.L.f26294h || !pVar.a()) ? false : true;
    }
}
