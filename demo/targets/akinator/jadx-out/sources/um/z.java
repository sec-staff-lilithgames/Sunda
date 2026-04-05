package um;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f88649b;

    public z(a0 a0Var) {
        this.f88649b = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        a0 a0Var = this.f88649b;
        long j10 = a0Var.f88542f;
        if (a0Var.f88537a.isShown()) {
            long jMin = Math.min(a0Var.f88541e, j10 + 16);
            a0Var.f88542f = jMin;
            long j11 = a0Var.f88541e;
            ((tm.f0) a0Var.f88538b).onTimerTick((jMin * 100.0f) / j11, jMin, j11);
            j10 = jMin;
        }
        if (j10 >= a0Var.f88541e) {
            ((tm.f0) a0Var.f88538b).onTimerFinish();
        } else {
            a0Var.f88537a.postDelayed(this, 16L);
        }
    }
}
