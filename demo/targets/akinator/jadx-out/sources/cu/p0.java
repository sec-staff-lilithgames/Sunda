package cu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends m0 {

    /* renamed from: m, reason: collision with root package name */
    public final tw.c f51046m;

    public p0(tw.c cVar, int i10, eu.c cVar2, m0.a aVar) {
        super(i10, cVar2, aVar);
        this.f51046m = cVar;
    }

    @Override // cu.m0, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f51027g, dVar)) {
            this.f51027g = dVar;
            this.f51046m.onSubscribe(this);
            dVar.request(this.f51023b);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2;
        int i10 = this.f51032l;
        eu.c cVar = this.f51025e;
        tw.c cVar2 = this.f51046m;
        int i11 = this.f51024c;
        int iAddAndGet = 1;
        while (true) {
            long j10 = this.f51030j.get();
            long j11 = 0;
            while (j11 != j10) {
                if (this.f51031k) {
                    cVar.clear();
                    return;
                }
                boolean z10 = this.f51028h;
                if (z10 && (th2 = this.f51029i) != null) {
                    cVar.clear();
                    cVar2.onError(th2);
                    this.f51026f.dispose();
                    return;
                }
                Object objPoll = cVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    cVar2.onComplete();
                    this.f51026f.dispose();
                    return;
                } else {
                    if (z11) {
                        break;
                    }
                    cVar2.onNext(objPoll);
                    j11++;
                    i10++;
                    if (i10 == i11) {
                        this.f51027g.request(i10);
                        i10 = 0;
                    }
                }
            }
            if (j11 == j10) {
                if (this.f51031k) {
                    cVar.clear();
                    return;
                }
                if (this.f51028h) {
                    Throwable th3 = this.f51029i;
                    if (th3 != null) {
                        cVar.clear();
                        cVar2.onError(th3);
                        this.f51026f.dispose();
                        return;
                    } else if (cVar.isEmpty()) {
                        cVar2.onComplete();
                        this.f51026f.dispose();
                        return;
                    }
                }
            }
            if (j11 != 0 && j10 != Long.MAX_VALUE) {
                this.f51030j.addAndGet(-j11);
            }
            int i12 = get();
            if (i12 == iAddAndGet) {
                this.f51032l = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i12;
            }
        }
    }
}
