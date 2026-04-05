package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class re implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f96286b;

    /* renamed from: c, reason: collision with root package name */
    public final se f96287c;

    public re(long j10, se seVar) {
        this.f96286b = j10;
        this.f96287c = seVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        se seVar = this.f96287c;
        if (seVar.f58456h) {
            seVar.f96338v = true;
        } else {
            seVar.f58455g.offer(this);
        }
        if (seVar.enter()) {
            seVar.U();
        }
    }
}
