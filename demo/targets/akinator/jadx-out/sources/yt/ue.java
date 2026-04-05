package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ue implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final nu.d f96421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ we f96422c;

    public ue(we weVar, nu.d dVar) {
        this.f96422c = weVar;
        this.f96421b = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        we weVar = this.f96422c;
        weVar.f58455g.offer(new ve(this.f96421b, false));
        if (weVar.enter()) {
            weVar.U();
        }
    }
}
