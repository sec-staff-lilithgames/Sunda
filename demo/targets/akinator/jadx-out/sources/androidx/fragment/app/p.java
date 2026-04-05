package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Object f6429c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6430d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6431e;

    public p(a3 a3Var, t3.g gVar, boolean z10, boolean z11) {
        super(a3Var, gVar);
        if (a3Var.getFinalState() == z2.f6508c) {
            this.f6429c = z10 ? a3Var.getFragment().getReenterTransition() : a3Var.getFragment().getEnterTransition();
            this.f6430d = z10 ? a3Var.getFragment().getAllowReturnTransitionOverlap() : a3Var.getFragment().getAllowEnterTransitionOverlap();
        } else {
            this.f6429c = z10 ? a3Var.getFragment().getReturnTransition() : a3Var.getFragment().getExitTransition();
            this.f6430d = true;
        }
        if (!z11) {
            this.f6431e = null;
        } else if (z10) {
            this.f6431e = a3Var.getFragment().getSharedElementReturnTransition();
        } else {
            this.f6431e = a3Var.getFragment().getSharedElementEnterTransition();
        }
    }

    public final q2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        o2 o2Var = i2.f6384a;
        if (o2Var != null && o2Var.canHandle(obj)) {
            return o2Var;
        }
        q2 q2Var = i2.f6385b;
        if (q2Var != null && q2Var.canHandle(obj)) {
            return q2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f6422a.getFragment() + " is not a valid framework Transition or AndroidX Transition");
    }

    public Object getSharedElementTransition() {
        return this.f6431e;
    }

    public boolean hasSharedElementTransition() {
        return this.f6431e != null;
    }
}
