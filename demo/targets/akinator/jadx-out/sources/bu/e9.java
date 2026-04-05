package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e9 extends f9 {
    @Override // bu.f9
    public final void a() {
        this.f10310b.onComplete();
    }

    @Override // bu.f9
    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f10310b.onNext(andSet);
        }
    }
}
