package cu;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends v {
    @Override // cu.v
    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r12 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r15 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r15 == false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.u.d():void");
    }

    @Override // cu.v
    public void onComplete() {
        this.f51093h.decrementAndGet();
        c();
    }

    @Override // cu.v
    public void onError(Throwable th2) {
        iu.d dVar = this.f51090e;
        if (dVar.compareAndSet(null, th2)) {
            a();
            c();
        } else if (th2 != dVar.get()) {
            mu.a.onError(th2);
        }
    }

    @Override // cu.v
    public void onNext(t tVar, Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            AtomicLong atomicLong = this.f51091f;
            long j10 = atomicLong.get();
            tw.c cVar = this.f51088b;
            if (j10 != 0) {
                cVar.onNext(obj);
                if (atomicLong.get() != Long.MAX_VALUE) {
                    atomicLong.decrementAndGet();
                }
                tVar.request(1L);
            } else if (!tVar.a().offer(obj)) {
                a();
                qt.e eVar = new qt.e("Queue full?!");
                if (this.f51090e.compareAndSet(null, eVar)) {
                    cVar.onError(eVar);
                    return;
                } else {
                    mu.a.onError(eVar);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else if (!tVar.a().offer(obj)) {
            a();
            onError(new qt.e("Queue full?!"));
            return;
        } else if (getAndIncrement() != 0) {
            return;
        }
        d();
    }
}
