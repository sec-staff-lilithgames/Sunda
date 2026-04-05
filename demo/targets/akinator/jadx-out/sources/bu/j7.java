package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j7 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10465b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10466c;

    public j7(int i10, int i11) {
        this.f10465b = i10;
        this.f10466c = i10 + i11;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.i0 i0Var2;
        i7 i7Var = new i7(i0Var, this.f10465b, this.f10466c);
        i0Var.onSubscribe(i7Var);
        if (i7Var.f10423f) {
            return;
        }
        long j10 = i7Var.f10422e;
        while (true) {
            long j11 = i7Var.f10421c;
            i0Var2 = i7Var.f10420b;
            if (j10 == j11 || i7Var.get() != 0) {
                break;
            }
            i0Var2.onNext(Integer.valueOf((int) j10));
            j10++;
        }
        if (i7Var.get() == 0) {
            i7Var.lazySet(1);
            i0Var2.onComplete();
        }
    }
}
