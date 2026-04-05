package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ib implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb f92639b;

    public ib(jb jbVar) {
        this.f92639b = jbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jb jbVar = this.f92639b;
        jbVar.f92711b.execute(new hb(jbVar));
    }
}
