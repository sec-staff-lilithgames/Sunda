package e6;

import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f53820a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f53821b;

    public i(ViewGroup viewGroup) {
        this.f53821b = viewGroup;
    }

    @Override // e6.j0, e6.g0
    public void onTransitionCancel(c0 c0Var) {
        x.c(this.f53821b, false);
        this.f53820a = true;
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionPause(c0 c0Var) {
        x.c(this.f53821b, false);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionResume(c0 c0Var) {
        x.c(this.f53821b, true);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionEnd(c0 c0Var) {
        if (!this.f53820a) {
            x.c(this.f53821b, false);
        }
        c0Var.removeListener(this);
    }
}
