package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends d1 {

    /* renamed from: o, reason: collision with root package name */
    public final tw.c f95405o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f95406p;

    public e1(int i10, st.o oVar, tw.c cVar, boolean z10) {
        super(oVar, i10);
        this.f95405o = cVar;
        this.f95406p = z10;
    }

    @Override // yt.d1
    public final void a() {
        Object objCall;
        if (getAndIncrement() == 0) {
            while (!this.f95332k) {
                if (!this.f95334m) {
                    boolean z10 = this.f95331j;
                    if (z10 && !this.f95406p && ((Throwable) this.f95333l.get()) != null) {
                        this.f95405o.onError(this.f95333l.terminate());
                        return;
                    }
                    try {
                        Object objPoll = this.f95330i.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            Throwable thTerminate = this.f95333l.terminate();
                            if (thTerminate != null) {
                                this.f95405o.onError(thTerminate);
                                return;
                            } else {
                                this.f95405o.onComplete();
                                return;
                            }
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
                                        objCall = ((Callable) bVar).call();
                                    } catch (Throwable th2) {
                                        qt.d.throwIfFatal(th2);
                                        this.f95333l.addThrowable(th2);
                                        if (!this.f95406p) {
                                            this.f95328g.cancel();
                                            this.f95405o.onError(this.f95333l.terminate());
                                            return;
                                        }
                                        objCall = null;
                                    }
                                    if (objCall == null) {
                                        continue;
                                    } else if (this.f95324b.isUnbounded()) {
                                        this.f95405o.onNext(objCall);
                                    } else {
                                        this.f95334m = true;
                                        this.f95324b.setSubscription(new i1(objCall, this.f95324b));
                                    }
                                } else {
                                    this.f95334m = true;
                                    bVar.subscribe(this.f95324b);
                                }
                            } catch (Throwable th3) {
                                qt.d.throwIfFatal(th3);
                                this.f95328g.cancel();
                                this.f95333l.addThrowable(th3);
                                this.f95405o.onError(this.f95333l.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        qt.d.throwIfFatal(th4);
                        this.f95328g.cancel();
                        this.f95333l.addThrowable(th4);
                        this.f95405o.onError(this.f95333l.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // yt.d1
    public final void b() {
        this.f95405o.onSubscribe(this);
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
        if (!this.f95333l.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f95406p) {
            this.f95328g.cancel();
            this.f95331j = true;
        }
        this.f95334m = false;
        a();
    }

    @Override // yt.d1, yt.h1
    public void innerNext(Object obj) {
        this.f95405o.onNext(obj);
    }

    @Override // yt.d1, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f95333l.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f95331j = true;
            a();
        }
    }

    @Override // yt.d1, tw.d
    public void request(long j10) {
        this.f95324b.request(j10);
    }
}
