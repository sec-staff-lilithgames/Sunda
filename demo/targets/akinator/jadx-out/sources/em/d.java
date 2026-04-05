package em;

import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f54697a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f54698b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f54699c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f54700d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f54701e = new Object();

    public d(String str) {
        this.f54697a = new pr.n(o2.l(str, "AdManager"));
    }

    public final u a(AdsFormat adsFormat) {
        synchronized (this.f54699c) {
            try {
                for (int size = this.f54698b.size() - 1; size >= 0; size--) {
                    u uVar = (u) this.f54698b.get(size);
                    if (uVar.getAdsFormat() == adsFormat && !e(uVar)) {
                        return uVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(AdsFormat adsFormat) {
        int i10;
        synchronized (this.f54699c) {
            try {
                Iterator it = this.f54698b.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((u) it.next()).getAdsFormat() == adsFormat) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final u c(NetworkAdUnit networkAdUnit) {
        u uVar;
        synchronized (this.f54701e) {
            uVar = (u) this.f54700d.get(networkAdUnit);
        }
        return uVar;
    }

    public final int d(AdsFormat adsFormat) {
        int i10;
        synchronized (this.f54701e) {
            try {
                Iterator it = this.f54700d.values().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((u) it.next()).getAdsFormat() == adsFormat) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final boolean e(u uVar) {
        boolean zContainsValue;
        synchronized (this.f54701e) {
            zContainsValue = this.f54700d.containsValue(uVar);
        }
        return zContainsValue;
    }

    public final boolean f(u uVar) {
        boolean zRemove;
        synchronized (this.f54699c) {
            try {
                zRemove = this.f54698b.remove(uVar);
                if (zRemove) {
                    nm.a.d(this.f54697a, new c(this, uVar, 0));
                }
                i(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    public final u g(NetworkAdUnit networkAdUnit, AdsFormat adsFormat) {
        u uVar;
        synchronized (this.f54699c) {
            synchronized (this.f54699c) {
                try {
                    Iterator it = this.f54698b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            uVar = null;
                            break;
                        }
                        uVar = (u) it.next();
                        if (uVar.getAdsFormat() == adsFormat && !e(uVar)) {
                        }
                    }
                } finally {
                }
            }
            if (uVar == null) {
                return null;
            }
            synchronized (this.f54701e) {
                nm.a.d(this.f54697a, new a(this, networkAdUnit, uVar, 0));
                this.f54700d.put(networkAdUnit, uVar);
            }
            return uVar;
        }
    }

    public final void h(u uVar) {
        synchronized (this.f54699c) {
            try {
                if (this.f54698b.contains(uVar)) {
                    return;
                }
                this.f54698b.add(uVar);
                Collections.sort(this.f54698b, new af.i(8));
                nm.a.d(this.f54697a, new c(this, uVar, 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(u uVar) {
        synchronized (this.f54701e) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f54700d.entrySet()) {
                    if (((u) entry.getValue()).equals(uVar)) {
                        arrayList.add((NetworkAdUnit) entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j((NetworkAdUnit) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(NetworkAdUnit networkAdUnit) {
        synchronized (this.f54701e) {
            try {
                u uVar = (u) this.f54700d.remove(networkAdUnit);
                if (uVar != null) {
                    nm.a.d(this.f54697a, new a(this, networkAdUnit, uVar, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
