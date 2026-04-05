package yt;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x7 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96552b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f96553c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.a f96554e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96555f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96556g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f96557h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public tw.d f96558i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f96559j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f96560k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f96561l;

    public x7(tw.c cVar, st.a aVar, mt.a aVar2, long j10) {
        this.f96552b = cVar;
        this.f96553c = aVar;
        this.f96554e = aVar2;
        this.f96555f = j10;
    }

    public static void a(ArrayDeque arrayDeque) {
        synchronized (arrayDeque) {
            arrayDeque.clear();
        }
    }

    public final void b() {
        boolean zIsEmpty;
        Object objPoll;
        if (getAndIncrement() != 0) {
            return;
        }
        ArrayDeque arrayDeque = this.f96557h;
        tw.c cVar = this.f96552b;
        int iAddAndGet = 1;
        do {
            long j10 = this.f96556g.get();
            long j11 = 0;
            while (j11 != j10) {
                if (this.f96559j) {
                    a(arrayDeque);
                    return;
                }
                boolean z10 = this.f96560k;
                synchronized (arrayDeque) {
                    objPoll = arrayDeque.poll();
                }
                boolean z11 = objPoll == null;
                if (z10) {
                    Throwable th2 = this.f96561l;
                    if (th2 != null) {
                        a(arrayDeque);
                        cVar.onError(th2);
                        return;
                    } else if (z11) {
                        cVar.onComplete();
                        return;
                    }
                }
                if (z11) {
                    break;
                }
                cVar.onNext(objPoll);
                j11++;
            }
            if (j11 == j10) {
                if (this.f96559j) {
                    a(arrayDeque);
                    return;
                }
                boolean z12 = this.f96560k;
                synchronized (arrayDeque) {
                    zIsEmpty = arrayDeque.isEmpty();
                }
                if (z12) {
                    Throwable th3 = this.f96561l;
                    if (th3 != null) {
                        a(arrayDeque);
                        cVar.onError(th3);
                        return;
                    } else if (zIsEmpty) {
                        cVar.onComplete();
                        return;
                    }
                }
            }
            if (j11 != 0) {
                iu.e.produced(this.f96556g, j11);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f96559j = true;
        this.f96558i.cancel();
        if (getAndIncrement() == 0) {
            a(this.f96557h);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96560k = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96560k) {
            mu.a.onError(th2);
            return;
        }
        this.f96561l = th2;
        this.f96560k = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        boolean z10;
        boolean z11;
        if (this.f96560k) {
            return;
        }
        ArrayDeque arrayDeque = this.f96557h;
        synchronized (arrayDeque) {
            try {
                z10 = false;
                if (arrayDeque.size() == this.f96555f) {
                    int iOrdinal = this.f96554e.ordinal();
                    z11 = true;
                    if (iOrdinal == 1) {
                        arrayDeque.poll();
                        arrayDeque.offer(obj);
                    } else if (iOrdinal == 2) {
                        arrayDeque.pollLast();
                        arrayDeque.offer(obj);
                    }
                    z11 = false;
                    z10 = true;
                } else {
                    arrayDeque.offer(obj);
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            if (!z11) {
                b();
                return;
            } else {
                this.f96558i.cancel();
                onError(new qt.e());
                return;
            }
        }
        st.a aVar = this.f96553c;
        if (aVar != null) {
            try {
                aVar.run();
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f96558i.cancel();
                onError(th3);
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96558i, dVar)) {
            this.f96558i = dVar;
            this.f96552b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96556g, j10);
            b();
        }
    }
}
