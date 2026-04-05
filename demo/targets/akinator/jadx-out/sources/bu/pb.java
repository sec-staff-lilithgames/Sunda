package bu;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pb extends AtomicReference implements mt.i0, pt.c, rb {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10809b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10810c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.h f10811e = new tt.h();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f10812f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f10813g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public mt.g0 f10814h;

    public pb(mt.g0 g0Var, mt.i0 i0Var, st.o oVar) {
        this.f10809b = i0Var;
        this.f10810c = oVar;
        this.f10814h = g0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10813g);
        tt.d.dispose(this);
        this.f10811e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10812f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            tt.h hVar = this.f10811e;
            hVar.dispose();
            this.f10809b.onComplete();
            hVar.dispose();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10812f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        tt.h hVar = this.f10811e;
        hVar.dispose();
        this.f10809b.onError(th2);
        hVar.dispose();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        AtomicLong atomicLong = this.f10812f;
        long j10 = atomicLong.get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (atomicLong.compareAndSet(j10, j11)) {
                tt.h hVar = this.f10811e;
                pt.c cVar = (pt.c) hVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                mt.i0 i0Var = this.f10809b;
                i0Var.onNext(obj);
                try {
                    mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10810c.apply(obj), "The itemTimeoutIndicator returned a null ObservableSource.");
                    ob obVar = new ob(j11, this);
                    if (hVar.replace(obVar)) {
                        g0Var.subscribe(obVar);
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    ((pt.c) this.f10813g.get()).dispose();
                    atomicLong.getAndSet(Long.MAX_VALUE);
                    i0Var.onError(th2);
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10813g, cVar);
    }

    @Override // bu.rb, bu.wb
    public void onTimeout(long j10) {
        if (this.f10812f.compareAndSet(j10, Long.MAX_VALUE)) {
            tt.d.dispose(this.f10813g);
            mt.g0 g0Var = this.f10814h;
            this.f10814h = null;
            g0Var.subscribe(new tb(this.f10809b, this));
        }
    }

    @Override // bu.rb
    public void onTimeoutError(long j10, Throwable th2) {
        if (!this.f10812f.compareAndSet(j10, Long.MAX_VALUE)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(this);
            this.f10809b.onError(th2);
        }
    }
}
