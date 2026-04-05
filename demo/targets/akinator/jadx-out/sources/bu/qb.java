package bu;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qb extends AtomicLong implements mt.i0, pt.c, rb {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10869b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10870c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.h f10871e = new tt.h();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10872f = new AtomicReference();

    public qb(mt.i0 i0Var, st.o oVar) {
        this.f10869b = i0Var;
        this.f10870c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10872f);
        this.f10871e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10872f.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f10871e.dispose();
            this.f10869b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
        } else {
            this.f10871e.dispose();
            this.f10869b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long j10 = get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (compareAndSet(j10, j11)) {
                tt.h hVar = this.f10871e;
                pt.c cVar = (pt.c) hVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                mt.i0 i0Var = this.f10869b;
                i0Var.onNext(obj);
                try {
                    mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10870c.apply(obj), "The itemTimeoutIndicator returned a null ObservableSource.");
                    ob obVar = new ob(j11, this);
                    if (hVar.replace(obVar)) {
                        g0Var.subscribe(obVar);
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    ((pt.c) this.f10872f.get()).dispose();
                    getAndSet(Long.MAX_VALUE);
                    i0Var.onError(th2);
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10872f, cVar);
    }

    @Override // bu.rb, bu.wb
    public void onTimeout(long j10) {
        if (compareAndSet(j10, Long.MAX_VALUE)) {
            tt.d.dispose(this.f10872f);
            this.f10869b.onError(new TimeoutException());
        }
    }

    @Override // bu.rb
    public void onTimeoutError(long j10, Throwable th2) {
        if (!compareAndSet(j10, Long.MAX_VALUE)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(this.f10872f);
            this.f10869b.onError(th2);
        }
    }
}
