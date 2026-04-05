package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class wd implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yd f93221b;

    public wd(yd ydVar) {
        this.f93221b = ydVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93221b.f93268a.shutdownNow(wr.m6.f91038f.withDescription("Handshake timeout exceeded"));
    }
}
