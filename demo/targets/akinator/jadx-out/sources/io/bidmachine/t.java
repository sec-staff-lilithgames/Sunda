package io.bidmachine;

import io.bidmachine.protobuf.AdCachePlacementControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static volatile t f62015c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f62016d = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f62017a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f62018b = new ArrayList();

    public static t get() {
        t tVar;
        t tVar2 = f62015c;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (t.class) {
            try {
                tVar = f62015c;
                if (tVar == null) {
                    tVar = new t();
                    f62015c = tVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    public final List a(AdRequestParameters adRequestParameters) {
        synchronized (this.f62017a) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f62018b.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    if (nVar.getStatus() == u.f62021b && adRequestParameters.isParametersMatched(nVar.getAdRequestParameters())) {
                        arrayList.add(nVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    return arrayList;
                }
                Collections.sort(arrayList, new s());
                AdCachePlacementControl adCachePlacementControl = (AdCachePlacementControl) f62016d.get(adRequestParameters.getAdsType().getName());
                int maxRetainCount = adCachePlacementControl != null ? adCachePlacementControl.getMaxRetainCount() : 0;
                if (maxRetainCount <= 0) {
                    maxRetainCount = 2;
                }
                return arrayList.subList(0, Math.min(maxRetainCount, arrayList.size()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n b(AdRequestParameters adRequestParameters) {
        synchronized (this.f62017a) {
            try {
                AdCachePlacementControl adCachePlacementControl = (AdCachePlacementControl) f62016d.get(adRequestParameters.getAdsType().getName());
                int i10 = 0;
                int maxRetainCount = adCachePlacementControl != null ? adCachePlacementControl.getMaxRetainCount() : 0;
                if (maxRetainCount <= 0) {
                    maxRetainCount = 2;
                }
                Iterator it = this.f62018b.iterator();
                n nVar = null;
                n nVar2 = null;
                while (it.hasNext()) {
                    n nVar3 = (n) it.next();
                    if (!nVar3.wasShown() && adRequestParameters.isParametersMatched(nVar3.getAdRequestParameters())) {
                        u status = nVar3.getStatus();
                        u uVar = u.f62021b;
                        if (status == uVar) {
                            if (nVar == null || nVar3.getPrice() > nVar.getPrice()) {
                                nVar = nVar3;
                            }
                        } else if (nVar3.getStatus() == u.f62022c) {
                            i10++;
                            if (nVar2 == null) {
                                nVar2 = nVar3;
                            }
                            if (i10 >= maxRetainCount) {
                                nVar2.e(null);
                                nVar2.a();
                                nVar2.setStatus(uVar);
                                if (nVar == null || nVar2.getPrice() >= nVar.getPrice()) {
                                    nVar = nVar2;
                                }
                            }
                        }
                    }
                }
                if (nVar == null || !adRequestParameters.isPricePassedByPriceFloor(nVar.getPrice())) {
                    return null;
                }
                nVar.setStatus(u.f62022c);
                nm.a.d("AdResponseManager", new c(nVar, 16));
                this.f62018b.remove(nVar);
                this.f62018b.add(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(n nVar) {
        nm.a.d("AdResponseManager", new c(nVar, 18));
        synchronized (this.f62017a) {
            this.f62018b.remove(nVar);
        }
    }
}
