package hu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends AtomicInteger implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public tw.d f59168b;

    /* renamed from: c, reason: collision with root package name */
    public long f59169c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f59170e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f59171f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f59172g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59173h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f59174i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59175j;

    public f(boolean z10) {
        this.f59173h = z10;
    }

    public final void a() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        tw.d dVar = null;
        do {
            tw.d dVar2 = (tw.d) this.f59170e.get();
            if (dVar2 != null) {
                dVar2 = (tw.d) this.f59170e.getAndSet(null);
            }
            long andSet = this.f59171f.get();
            if (andSet != 0) {
                andSet = this.f59171f.getAndSet(0L);
            }
            long andSet2 = this.f59172g.get();
            if (andSet2 != 0) {
                andSet2 = this.f59172g.getAndSet(0L);
            }
            tw.d dVar3 = this.f59168b;
            if (this.f59174i) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.f59168b = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long jAddCap2 = this.f59169c;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = iu.e.addCap(jAddCap2, andSet);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet2;
                        if (jAddCap2 < 0) {
                            g.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.f59169c = jAddCap2;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.f59173h) {
                        dVar3.cancel();
                    }
                    this.f59168b = dVar2;
                    if (jAddCap2 != 0) {
                        jAddCap = iu.e.addCap(jAddCap, jAddCap2);
                        dVar = dVar2;
                    }
                } else if (dVar3 != null && andSet != 0) {
                    jAddCap = iu.e.addCap(jAddCap, andSet);
                    dVar = dVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            dVar.request(jAddCap);
        }
    }

    @Override // tw.d
    public void cancel() {
        if (this.f59174i) {
            return;
        }
        this.f59174i = true;
        if (getAndIncrement() != 0) {
            return;
        }
        a();
    }

    public final boolean isCancelled() {
        return this.f59174i;
    }

    public final boolean isUnbounded() {
        return this.f59175j;
    }

    public final void produced(long j10) {
        if (this.f59175j) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            iu.e.add(this.f59172g, j10);
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        long j11 = this.f59169c;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                g.reportMoreProduced(j12);
                j12 = 0;
            }
            this.f59169c = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        a();
    }

    @Override // tw.d
    public final void request(long j10) {
        if (!g.validate(j10) || this.f59175j) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            iu.e.add(this.f59171f, j10);
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        long j11 = this.f59169c;
        if (j11 != Long.MAX_VALUE) {
            long jAddCap = iu.e.addCap(j11, j10);
            this.f59169c = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.f59175j = true;
            }
        }
        tw.d dVar = this.f59168b;
        if (decrementAndGet() != 0) {
            a();
        }
        if (dVar != null) {
            dVar.request(j10);
        }
    }

    public final void setSubscription(tw.d dVar) {
        if (this.f59174i) {
            dVar.cancel();
            return;
        }
        o0.requireNonNull(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            tw.d dVar2 = (tw.d) this.f59170e.getAndSet(dVar);
            if (dVar2 != null && this.f59173h) {
                dVar2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        tw.d dVar3 = this.f59168b;
        if (dVar3 != null && this.f59173h) {
            dVar3.cancel();
        }
        this.f59168b = dVar;
        long j10 = this.f59169c;
        if (decrementAndGet() != 0) {
            a();
        }
        if (j10 != 0) {
            dVar.request(j10);
        }
    }
}
