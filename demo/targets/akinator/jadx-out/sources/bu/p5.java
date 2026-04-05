package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p5 extends AtomicReference implements pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10793b;

    /* renamed from: c, reason: collision with root package name */
    public long f10794c;

    public p5(mt.i0 i0Var) {
        this.f10793b = i0Var;
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
        if (get() != tt.d.f87352b) {
            long j10 = this.f10794c;
            this.f10794c = 1 + j10;
            this.f10793b.onNext(Long.valueOf(j10));
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
