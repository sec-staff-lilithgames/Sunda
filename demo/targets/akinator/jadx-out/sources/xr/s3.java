package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3 f92978c;

    public s3(u3 u3Var, wr.e4 e4Var) {
        this.f92978c = u3Var;
        this.f92977b = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92978c.f93081a.headersRead(this.f92977b);
    }
}
