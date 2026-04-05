package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f92583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f92584c;

    public h5(n1 n1Var, long j10) {
        this.f92583b = n1Var;
        this.f92584c = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((u6) this.f92583b).onSuccess(this.f92584c);
    }
}
