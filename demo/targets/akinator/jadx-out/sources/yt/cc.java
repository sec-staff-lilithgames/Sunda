package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.d f95276b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95277c;

    public cc(long j10, tw.d dVar) {
        this.f95276b = dVar;
        this.f95277c = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95276b.request(this.f95277c);
    }
}
