package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f96098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f96099c;

    public p2(q2 q2Var, Object obj) {
        this.f96099c = q2Var;
        this.f96098b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96099c.f96166b.onNext(this.f96098b);
    }
}
