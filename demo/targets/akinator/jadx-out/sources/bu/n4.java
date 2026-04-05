package bu;

import bu.l4;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n4 extends AtomicInteger implements pt.c, mt.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10686b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f10687c;

    /* renamed from: e, reason: collision with root package name */
    public final l4.a f10688e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10689f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10690g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f10691h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f10692i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f10693j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f10694k = new AtomicReference();

    public n4(Object obj, int i10, l4.a aVar, boolean z10) {
        this.f10687c = new eu.d(i10);
        this.f10688e = aVar;
        this.f10686b = obj;
        this.f10689f = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f10687c;
        boolean z10 = this.f10689f;
        mt.i0 i0Var = (mt.i0) this.f10694k.get();
        int iAddAndGet = 1;
        while (true) {
            if (i0Var != null) {
                while (true) {
                    boolean z11 = this.f10690g;
                    Object objPoll = dVar.poll();
                    boolean z12 = objPoll == null;
                    eu.d dVar2 = this.f10687c;
                    AtomicReference atomicReference = this.f10694k;
                    if (this.f10692i.get()) {
                        dVar2.clear();
                        this.f10688e.cancel(this.f10686b);
                        atomicReference.lazySet(null);
                        return;
                    }
                    if (z11) {
                        if (!z10) {
                            Throwable th2 = this.f10691h;
                            if (th2 != null) {
                                dVar2.clear();
                                atomicReference.lazySet(null);
                                i0Var.onError(th2);
                                return;
                            } else if (z12) {
                                atomicReference.lazySet(null);
                                i0Var.onComplete();
                                return;
                            }
                        } else if (z12) {
                            Throwable th3 = this.f10691h;
                            atomicReference.lazySet(null);
                            if (th3 != null) {
                                i0Var.onError(th3);
                                return;
                            } else {
                                i0Var.onComplete();
                                return;
                            }
                        }
                    }
                    if (z12) {
                        break;
                    } else {
                        i0Var.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (i0Var == null) {
                i0Var = (mt.i0) this.f10694k.get();
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10692i.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.f10694k.lazySet(null);
            this.f10688e.cancel(this.f10686b);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10692i.get();
    }

    public void onComplete() {
        this.f10690g = true;
        a();
    }

    public void onError(Throwable th2) {
        this.f10691h = th2;
        this.f10690g = true;
        a();
    }

    public void onNext(Object obj) {
        this.f10687c.offer(obj);
        a();
    }

    @Override // mt.g0
    public void subscribe(mt.i0 i0Var) {
        if (!this.f10693j.compareAndSet(false, true)) {
            tt.e.error(new IllegalStateException("Only one Observer allowed!"), i0Var);
            return;
        }
        i0Var.onSubscribe(this);
        AtomicReference atomicReference = this.f10694k;
        atomicReference.lazySet(i0Var);
        if (this.f10692i.get()) {
            atomicReference.lazySet(null);
        } else {
            a();
        }
    }
}
