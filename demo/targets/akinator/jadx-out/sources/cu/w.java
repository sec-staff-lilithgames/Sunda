package cu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends v {
    @Override // cu.v
    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r12 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r15 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (((java.lang.Throwable) r18.f51090e.get()) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r3.onError(r18.f51090e.terminate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r15 == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.w.d():void");
    }

    @Override // cu.v
    public final void onComplete() {
        this.f51093h.decrementAndGet();
        c();
    }

    @Override // cu.v
    public final void onError(Throwable th2) {
        this.f51090e.addThrowable(th2);
        this.f51093h.decrementAndGet();
        c();
    }

    @Override // cu.v
    public final void onNext(t tVar, Object obj) {
        int i10 = get();
        AtomicInteger atomicInteger = this.f51093h;
        iu.d dVar = this.f51090e;
        if (i10 == 0 && compareAndSet(0, 1)) {
            AtomicLong atomicLong = this.f51091f;
            if (atomicLong.get() != 0) {
                this.f51088b.onNext(obj);
                if (atomicLong.get() != Long.MAX_VALUE) {
                    atomicLong.decrementAndGet();
                }
                tVar.request(1L);
            } else if (!tVar.a().offer(obj)) {
                tVar.cancel();
                dVar.addThrowable(new qt.e("Queue full?!"));
                atomicInteger.decrementAndGet();
                d();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            if (!tVar.a().offer(obj) && tVar.cancel()) {
                dVar.addThrowable(new qt.e("Queue full?!"));
                atomicInteger.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        d();
    }
}
