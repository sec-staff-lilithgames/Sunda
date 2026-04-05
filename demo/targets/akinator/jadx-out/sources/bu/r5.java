package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r5 extends AtomicReference implements pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10895b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10896c;

    /* renamed from: e, reason: collision with root package name */
    public long f10897e;

    public r5(mt.i0 i0Var, long j10, long j11) {
        this.f10895b = i0Var;
        this.f10897e = j10;
        this.f10896c = j11;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isDisposed()) {
            return;
        }
        long j10 = this.f10897e;
        Long lValueOf = Long.valueOf(j10);
        mt.i0 i0Var = this.f10895b;
        i0Var.onNext(lValueOf);
        if (j10 != this.f10896c) {
            this.f10897e = j10 + 1;
        } else {
            tt.d.dispose(this);
            i0Var.onComplete();
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
