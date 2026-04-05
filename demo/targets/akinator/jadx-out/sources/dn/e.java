package dn;

import java.util.concurrent.atomic.AtomicBoolean;
import nm.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements cn.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f52393b;

    public e(h hVar) {
        this.f52393b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // cn.a, pr.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRun() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.e.onRun():void");
    }

    @Override // cn.a, pr.l
    public void onThrows(Throwable th2) throws Throwable {
        super.onThrows(th2);
        h hVar = this.f52393b;
        AtomicBoolean atomicBoolean = hVar.f52404i;
        atomicBoolean.set(false);
        e eVar = hVar.f52400e;
        if (atomicBoolean.compareAndSet(false, true)) {
            j.cancelUiThreadTask(eVar);
            j.onUiThread(eVar, 100L);
        }
    }

    @Override // cn.a, pr.l, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
