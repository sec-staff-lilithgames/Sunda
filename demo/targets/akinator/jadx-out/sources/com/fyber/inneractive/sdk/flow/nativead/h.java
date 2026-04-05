package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements c, s {

    /* renamed from: a, reason: collision with root package name */
    public CountDownLatch f23700a;

    /* renamed from: b, reason: collision with root package name */
    public final e f23701b;

    /* renamed from: d, reason: collision with root package name */
    public final List f23703d;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23702c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23704e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23705f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b f23706g = b.UNINITIALIZED;

    public h(ArrayList arrayList, e eVar) {
        this.f23703d = arrayList;
        this.f23701b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f23706g == b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() throws Throwable {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        if (this.f23703d.isEmpty()) {
            this.f23706g = b.FAILED;
            c();
            return;
        }
        Iterator it = this.f23703d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar == null || (cVar = fVar.f26666d) == null || (str = cVar.f26660a) == null || str.trim().isEmpty()) {
                IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.a(this), Integer.valueOf(fVar.f26663a), fVar.f26666d);
                this.f23704e.add(fVar);
            } else {
                ArrayList arrayList = this.f23702c;
                if (arrayList != null) {
                    arrayList.add(new u0(new t(fVar, this), IAConfigManager.O.f23227v.f23318a, new com.fyber.inneractive.sdk.cache.d(fVar.f26666d.f26660a)));
                }
            }
        }
        ArrayList arrayList2 = this.f23702c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f23706g = b.FAILED;
            c();
            return;
        }
        this.f23706g = b.LOADING;
        this.f23700a = new CountDownLatch(this.f23702c.size());
        Iterator it2 = this.f23702c.iterator();
        while (it2.hasNext()) {
            IAConfigManager.O.f23224s.a((u0) it2.next());
        }
    }

    public final void c() throws Throwable {
        e eVar = this.f23701b;
        if (eVar != null) {
            ArrayList arrayList = this.f23705f;
            ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.f23704e;
            if (!arrayList.isEmpty()) {
                eVar.f23683a.f23689d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", f.f23684m, Integer.valueOf(fVar.f26663a), fVar.f26666d);
                }
            }
            eVar.f23683a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        ArrayList arrayList = this.f23702c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f23702c.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).f24282a = true;
            }
            this.f23702c.clear();
        }
        this.f23702c = null;
        this.f23706g = b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        if (gVar != null) {
            this.f23705f.add(gVar);
        } else {
            this.f23704e.add(fVar);
        }
        CountDownLatch countDownLatch = this.f23700a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f23700a.getCount() == 0) {
            this.f23706g = b.LOADED;
            c();
        }
    }
}
