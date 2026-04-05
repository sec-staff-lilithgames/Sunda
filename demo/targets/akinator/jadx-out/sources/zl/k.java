package zl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final l f98243c;

    /* renamed from: e, reason: collision with root package name */
    public final q f98244e;

    /* renamed from: b, reason: collision with root package name */
    public final String f98242b = UUID.randomUUID().toString();

    /* renamed from: f, reason: collision with root package name */
    public final int f98245f = 500;

    public k(l lVar, q qVar) {
        this.f98243c = lVar;
        this.f98244e = qVar;
    }

    public final boolean a(t tVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.f98243c.f98247b;
            j jVar = new j(countDownLatch);
            nm.a.d(tVar.f98277a, new g(tVar, 5));
            nm.j.onUiThread(new h(tVar, 1, context.getApplicationContext(), jVar));
            countDownLatch.await();
        } catch (Throwable unused) {
            countDownLatch.countDown();
        }
        if (tVar.f98282f != 3) {
            l lVar = this.f98243c;
            lVar.getClass();
            try {
                tVar.destroy();
            } catch (Throwable unused2) {
            }
            lVar.d(tVar);
            return false;
        }
        l lVar2 = this.f98243c;
        synchronized (lVar2.f98256k) {
            try {
                if (!lVar2.f98254i.contains(tVar)) {
                    lVar2.f98254i.add(tVar);
                    Collections.sort(lVar2.f98254i, new ni.a(26));
                }
            } finally {
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f98244e;
        try {
            Iterator it = new ArrayList(qVar.getGAMUnitDataList()).iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                l lVar = this.f98243c;
                t tVarCreateAd = lVar.f98248c.createAd(lVar, qVar.getAdsFormat(), sVar);
                if (tVarCreateAd != null) {
                    if (a(tVarCreateAd)) {
                        return;
                    } else {
                        Thread.sleep(this.f98245f);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
