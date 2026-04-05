package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l7 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f10598b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10599c;

    public l7(long j10, long j11) {
        this.f10598b = j10;
        this.f10599c = j11;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.i0 i0Var2;
        long j10 = this.f10599c;
        long j11 = this.f10598b;
        k7 k7Var = new k7(i0Var, j11, j10 + j11);
        i0Var.onSubscribe(k7Var);
        if (k7Var.f10524f) {
            return;
        }
        long j12 = k7Var.f10523e;
        while (true) {
            long j13 = k7Var.f10522c;
            i0Var2 = k7Var.f10521b;
            if (j12 == j13 || k7Var.get() != 0) {
                break;
            }
            i0Var2.onNext(Long.valueOf(j12));
            j12++;
        }
        if (k7Var.get() == 0) {
            k7Var.lazySet(1);
            i0Var2.onComplete();
        }
    }
}
