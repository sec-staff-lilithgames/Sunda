package j9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f69192a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f69193b;

    /* renamed from: c, reason: collision with root package name */
    public long f69194c;

    /* renamed from: d, reason: collision with root package name */
    public long f69195d;

    public n(long j10) {
        this.f69193b = j10;
        this.f69194c = j10;
    }

    public int a(Object obj) {
        return 1;
    }

    public final synchronized void c(long j10) {
        while (this.f69195d > j10) {
            Iterator it = this.f69192a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            m mVar = (m) entry.getValue();
            this.f69195d -= mVar.f69191b;
            Object key = entry.getKey();
            it.remove();
            b(key, mVar.f69190a);
        }
    }

    public void clearMemory() {
        c(0L);
    }

    public synchronized boolean contains(Object obj) {
        return this.f69192a.containsKey(obj);
    }

    public synchronized Object get(Object obj) {
        m mVar;
        mVar = (m) this.f69192a.get(obj);
        return mVar != null ? mVar.f69190a : null;
    }

    public synchronized long getCurrentSize() {
        return this.f69195d;
    }

    public synchronized long getMaxSize() {
        return this.f69194c;
    }

    public synchronized Object put(Object obj, Object obj2) {
        int iA = a(obj2);
        long j10 = iA;
        if (j10 >= this.f69194c) {
            b(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f69195d += j10;
        }
        m mVar = (m) this.f69192a.put(obj, obj2 == null ? null : new m(obj2, iA));
        if (mVar != null) {
            this.f69195d -= mVar.f69191b;
            if (!mVar.f69190a.equals(obj2)) {
                b(obj, mVar.f69190a);
            }
        }
        c(this.f69194c);
        return mVar != null ? mVar.f69190a : null;
    }

    public synchronized Object remove(Object obj) {
        m mVar = (m) this.f69192a.remove(obj);
        if (mVar == null) {
            return null;
        }
        this.f69195d -= mVar.f69191b;
        return mVar.f69190a;
    }

    public synchronized void setSizeMultiplier(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        long jRound = Math.round(this.f69193b * f10);
        this.f69194c = jRound;
        c(jRound);
    }

    public void b(Object obj, Object obj2) {
    }
}
