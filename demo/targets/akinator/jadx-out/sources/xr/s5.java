package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5 f92981b;

    public s5(t5 t5Var) {
        this.f92981b = t5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i6 i6Var = this.f92981b.f93009c;
        h9 h9Var = i6Var.f92627t;
        i6Var.f92626s = null;
        i6Var.f92627t = null;
        h9Var.shutdown(wr.m6.f91047o.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
