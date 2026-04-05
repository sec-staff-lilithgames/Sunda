package dq;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f52462b;

    public d(f fVar) {
        this.f52462b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // dq.c0, ir.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRun() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.d.onRun():void");
    }

    @Override // dq.c0, ir.k
    public void onThrows(Throwable th2) {
        super.onThrows(th2);
        f fVar = this.f52462b;
        AtomicBoolean atomicBoolean = fVar.f52473h;
        atomicBoolean.set(false);
        d dVar = fVar.f52469d;
        if (atomicBoolean.compareAndSet(false, true)) {
            cr.q.cancelOnUiThread(dVar);
            cr.q.onUiThread(dVar, 100L);
        }
    }

    @Override // dq.c0, ir.k, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
