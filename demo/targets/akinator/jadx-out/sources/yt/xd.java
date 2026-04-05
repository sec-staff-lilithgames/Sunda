package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xd implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yd f96571b;

    public xd(yd ydVar) {
        this.f96571b = ydVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96571b.f96621e.cancel();
    }
}
