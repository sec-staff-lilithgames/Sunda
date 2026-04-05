package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a9 extends b9 {
    @Override // bu.b9
    public final void a() {
        this.f10123b.onComplete();
    }

    @Override // java.lang.Runnable
    public void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f10123b.onNext(andSet);
        }
    }
}
