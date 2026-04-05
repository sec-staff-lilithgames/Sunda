package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class na extends r9 {
    @Override // yt.r9, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96268m.cancel();
        this.f96266k.onComplete();
    }

    @Override // yt.r9, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        b(th2);
    }
}
