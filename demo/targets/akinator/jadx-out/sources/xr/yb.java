package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class yb implements cc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f93264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc f93265b;

    public yb(tc tcVar, Object obj) {
        this.f93265b = tcVar;
        this.f93264a = obj;
    }

    @Override // xr.cc
    public void runWith(rc rcVar) {
        rcVar.f92966a.writeMessage(this.f93265b.f93039a.streamRequest(this.f93264a));
        rcVar.f92966a.flush();
    }
}
