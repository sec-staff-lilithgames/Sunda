package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ga extends t9 {

    /* renamed from: f, reason: collision with root package name */
    public final int f95544f;

    public ga(int i10) {
        this.f95544f = i10;
    }

    @Override // yt.t9
    public final void d() {
        if (this.f96366c > this.f95544f) {
            z9 z9Var = (z9) ((z9) get()).get();
            if (z9Var == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f96366c--;
            set(z9Var);
        }
    }
}
