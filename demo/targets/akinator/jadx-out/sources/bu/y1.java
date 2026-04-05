package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y1 extends AtomicReference implements Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11235b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11236c;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f11237e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11238f = new AtomicBoolean();

    public y1(Object obj, long j10, z1 z1Var) {
        this.f11235b = obj;
        this.f11236c = j10;
        this.f11237e = z1Var;
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
        if (this.f11238f.compareAndSet(false, true)) {
            z1 z1Var = this.f11237e;
            long j10 = this.f11236c;
            Object obj = this.f11235b;
            if (j10 == z1Var.f11292i) {
                z1Var.f11286b.onNext(obj);
                dispose();
            }
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
