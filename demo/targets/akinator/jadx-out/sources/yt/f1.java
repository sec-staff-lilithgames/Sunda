package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 extends d1 {

    /* renamed from: o, reason: collision with root package name */
    public final tw.c f95463o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicInteger f95464p;

    public f1(tw.c cVar, st.o oVar, int i10) {
        super(oVar, i10);
        this.f95463o = cVar;
        this.f95464p = new AtomicInteger();
    }

    @Override // yt.d1
    public final void a() {
        if (this.f95464p.getAndIncrement() == 0) {
            while (!this.f95332k) {
                if (!this.f95334m) {
                    boolean z10 = this.f95331j;
                    try {
                        Object objPoll = this.f95330i.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            this.f95463o.onComplete();
                            return;
                        }
                        if (!z11) {
                            try {
                                tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95325c.apply(objPoll), "The mapper returned a null Publisher");
                                if (this.f95335n != 1) {
                                    int i10 = this.f95329h + 1;
                                    if (i10 == this.f95327f) {
                                        this.f95329h = 0;
                                        this.f95328g.request(i10);
                                    } else {
                                        this.f95329h = i10;
                                    }
                                }
                                if (bVar instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) bVar).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.f95324b.isUnbounded()) {
                                            this.f95334m = true;
                                            this.f95324b.setSubscription(new i1(objCall, this.f95324b));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f95463o.onNext(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                this.f95463o.onError(this.f95333l.terminate());
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        qt.d.throwIfFatal(th2);
                                        this.f95328g.cancel();
                                        this.f95333l.addThrowable(th2);
                                        this.f95463o.onError(this.f95333l.terminate());
                                        return;
                                    }
                                } else {
                                    this.f95334m = true;
                                    bVar.subscribe(this.f95324b);
                                }
                            } catch (Throwable th3) {
                                qt.d.throwIfFatal(th3);
                                this.f95328g.cancel();
                                this.f95333l.addThrowable(th3);
                                this.f95463o.onError(this.f95333l.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        qt.d.throwIfFatal(th4);
                        this.f95328g.cancel();
                        this.f95333l.addThrowable(th4);
                        this.f95463o.onError(this.f95333l.terminate());
                        return;
                    }
                }
                if (this.f95464p.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // yt.d1
    public final void b() {
        this.f95463o.onSubscribe(this);
    }

    @Override // yt.d1, tw.d
    public void cancel() {
        if (this.f95332k) {
            return;
        }
        this.f95332k = true;
        this.f95324b.cancel();
        this.f95328g.cancel();
    }

    @Override // yt.d1, yt.h1
    public void innerError(Throwable th2) {
        iu.d dVar = this.f95333l;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f95328g.cancel();
        if (getAndIncrement() == 0) {
            this.f95463o.onError(dVar.terminate());
        }
    }

    @Override // yt.d1, yt.h1
    public void innerNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            tw.c cVar = this.f95463o;
            cVar.onNext(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            cVar.onError(this.f95333l.terminate());
        }
    }

    @Override // yt.d1, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f95333l;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f95324b.cancel();
        if (getAndIncrement() == 0) {
            this.f95463o.onError(dVar.terminate());
        }
    }

    @Override // yt.d1, tw.d
    public void request(long j10) {
        this.f95324b.request(j10);
    }
}
