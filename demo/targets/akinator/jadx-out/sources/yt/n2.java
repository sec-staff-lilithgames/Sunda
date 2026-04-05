package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f95984b;

    public n2(q2 q2Var) {
        this.f95984b = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        q2 q2Var = this.f95984b;
        try {
            q2Var.f96166b.onComplete();
        } finally {
            q2Var.f96169f.dispose();
        }
    }
}
