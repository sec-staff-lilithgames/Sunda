package qg;

import android.view.View;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class n0 implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f83208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f83209c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f83210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0 f83211f;

    public n0(boolean z10, boolean z11, boolean z12, r0 r0Var) {
        this.f83208b = z10;
        this.f83209c = z11;
        this.f83210e = z12;
        this.f83211f = r0Var;
    }

    @Override // qg.r0
    public e3 onApplyWindowInsets(View view, e3 e3Var, s0 s0Var) {
        if (this.f83208b) {
            s0Var.f83235d = e3Var.getSystemWindowInsetBottom() + s0Var.f83235d;
        }
        boolean zIsLayoutRtl = t0.isLayoutRtl(view);
        if (this.f83209c) {
            if (zIsLayoutRtl) {
                s0Var.f83234c = e3Var.getSystemWindowInsetLeft() + s0Var.f83234c;
            } else {
                s0Var.f83232a = e3Var.getSystemWindowInsetLeft() + s0Var.f83232a;
            }
        }
        if (this.f83210e) {
            if (zIsLayoutRtl) {
                s0Var.f83232a = e3Var.getSystemWindowInsetRight() + s0Var.f83232a;
            } else {
                s0Var.f83234c = e3Var.getSystemWindowInsetRight() + s0Var.f83234c;
            }
        }
        s0Var.applyToView(view);
        r0 r0Var = this.f83211f;
        return r0Var != null ? r0Var.onApplyWindowInsets(view, e3Var, s0Var) : e3Var;
    }
}
