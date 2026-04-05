package zl;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f98246a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f98247b;

    /* renamed from: c, reason: collision with root package name */
    public final am.b f98248c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98249d;

    /* renamed from: f, reason: collision with root package name */
    public final String f98251f;

    /* renamed from: g, reason: collision with root package name */
    public final long f98252g;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f98250e = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final i f98253h = new i();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f98254i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap f98255j = new WeakHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final Object f98256k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final Object f98257l = new Object();

    public l(Context context, am.b bVar, String str, HashMap map, String str2, long j10) {
        this.f98246a = new pr.n(o2.l(str, "Loader"));
        this.f98247b = context;
        this.f98248c = bVar;
        this.f98249d = str;
        this.f98251f = str2;
        this.f98252g = j10;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            q qVar = (q) map.get(adsFormat);
            if (qVar != null && !qVar.getGAMUnitDataList().isEmpty()) {
                Collections.sort(qVar.getGAMUnitDataList(), new ni.a(27));
                this.f98250e.put(qVar.getAdsFormat(), qVar);
            }
        }
    }

    public final t a(String str) {
        boolean zContainsValue;
        synchronized (this.f98256k) {
            Iterator it = this.f98254i.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.getAdUnitId().equals(str)) {
                    synchronized (this.f98257l) {
                        zContainsValue = this.f98255j.containsValue(tVar);
                    }
                    if (!zContainsValue) {
                        return tVar;
                    }
                }
            }
            return null;
        }
    }

    public final t b(NetworkAdUnit networkAdUnit) {
        t tVar;
        synchronized (this.f98257l) {
            tVar = (t) this.f98255j.get(networkAdUnit);
        }
        return tVar;
    }

    public final boolean c(AdsFormat adsFormat) {
        int i10;
        q qVar = (q) this.f98250e.get(adsFormat);
        int i11 = 0;
        if (qVar != null) {
            synchronized (this.f98256k) {
                try {
                    Iterator it = this.f98254i.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (((t) it.next()).getAdsFormat() == qVar.getAdsFormat()) {
                            i10++;
                        }
                    }
                } finally {
                }
            }
            if (i10 < qVar.getCacheSize()) {
                i iVar = this.f98253h;
                k kVar = new k(this, qVar);
                int i12 = i.f98237d;
                iVar.getClass();
                try {
                    synchronized (iVar.f98240c) {
                        try {
                            Map map = (Map) iVar.f98239b.get(adsFormat);
                            if (map != null && !map.isEmpty()) {
                                return true;
                            }
                            Future<?> futureSubmit = iVar.f98238a.submit(new h(iVar, i11, kVar, adsFormat));
                            if (map == null) {
                                map = new HashMap();
                                iVar.f98239b.put((EnumMap) adsFormat, (AdsFormat) map);
                            }
                            map.put(kVar.f98242b, futureSubmit);
                            return true;
                        } finally {
                        }
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(t tVar) {
        synchronized (this.f98256k) {
            try {
                if (this.f98254i.remove(tVar)) {
                    nm.a.d(this.f98246a, new g(tVar, 0));
                }
                f(tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(NetworkAdUnit networkAdUnit) {
        synchronized (this.f98257l) {
            nm.a.d(this.f98246a, new em.o(networkAdUnit, 3));
            this.f98255j.remove(networkAdUnit);
        }
    }

    public final void f(t tVar) {
        synchronized (this.f98257l) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.f98255j.entrySet()) {
                    if (((t) entry.getValue()).equals(tVar)) {
                        arrayList.add((NetworkAdUnit) entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e((NetworkAdUnit) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getExpirationTimeMs() {
        return this.f98252g;
    }

    public String getNetworkName() {
        return this.f98249d;
    }

    public String getRequestAgent() {
        return this.f98251f;
    }

    public am.b getVersionWrapper() {
        return this.f98248c;
    }
}
