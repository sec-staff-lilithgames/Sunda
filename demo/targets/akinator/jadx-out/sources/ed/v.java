package ed;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final int f54130q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f54131r;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f54132b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f54133c;

    /* renamed from: e, reason: collision with root package name */
    public final d f54134e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f54135f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f54136g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f54137h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue f54138i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLongArray f54139j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLongArray f54140k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceArray f54141l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f54142m;

    /* renamed from: n, reason: collision with root package name */
    public transient n f54143n;

    /* renamed from: o, reason: collision with root package name */
    public transient s f54144o;

    /* renamed from: p, reason: collision with root package name */
    public transient l f54145p;

    static {
        int iMin = Math.min(4, 1 << (32 - Integer.numberOfLeadingZeros(Runtime.getRuntime().availableProcessors() - 1)));
        f54130q = iMin;
        f54131r = iMin - 1;
    }

    public v(f fVar) {
        int i10 = fVar.f54098a;
        this.f54136g = new AtomicLong(Math.min(fVar.f54100c, 9223372034707292160L));
        this.f54132b = new ConcurrentHashMap(fVar.f54099b, 0.75f, i10);
        this.f54137h = new ReentrantLock();
        this.f54135f = new AtomicLong();
        this.f54134e = new d();
        this.f54138i = new ConcurrentLinkedQueue();
        this.f54142m = new AtomicReference(j.f54101b);
        int i11 = f54130q;
        this.f54133c = new long[i11];
        this.f54139j = new AtomicLongArray(i11);
        this.f54140k = new AtomicLongArray(i11);
        this.f54141l = new AtomicReferenceArray(i11 * 16);
    }

    public final void a(o oVar) {
        int id2 = ((int) Thread.currentThread().getId()) & f54131r;
        AtomicLongArray atomicLongArray = this.f54139j;
        long j10 = atomicLongArray.get(id2);
        atomicLongArray.lazySet(id2, 1 + j10);
        this.f54141l.lazySet((id2 * 16) + ((int) (15 & j10)), oVar);
        if (((j) this.f54142m.get()).a(j10 - this.f54140k.get(id2) < 4)) {
            g();
        }
    }

    public final void b(Runnable runnable) {
        this.f54138i.add(runnable);
        this.f54142m.lazySet(j.f54102c);
        g();
    }

    public final void c() {
        int i10;
        Runnable runnable;
        int id2 = (int) Thread.currentThread().getId();
        int i11 = f54130q + id2;
        while (true) {
            i10 = 0;
            if (id2 >= i11) {
                break;
            }
            int i12 = f54131r & id2;
            long j10 = this.f54139j.get(i12);
            while (i10 < 8) {
                long[] jArr = this.f54133c;
                int i13 = (i12 * 16) + ((int) (jArr[i12] & 15));
                AtomicReferenceArray atomicReferenceArray = this.f54141l;
                o oVar = (o) atomicReferenceArray.get(i13);
                if (oVar == null) {
                    break;
                }
                atomicReferenceArray.lazySet(i13, null);
                d dVar = this.f54134e;
                if (dVar.a(oVar)) {
                    dVar.moveToBack(oVar);
                }
                jArr[i12] = jArr[i12] + 1;
                i10++;
            }
            this.f54140k.lazySet(i12, j10);
            id2++;
        }
        while (i10 < 16 && (runnable = (Runnable) this.f54138i.poll()) != null) {
            runnable.run();
            i10++;
        }
    }

    public long capacity() {
        return this.f54136g.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        AtomicReferenceArray atomicReferenceArray = this.f54141l;
        ReentrantLock reentrantLock = this.f54137h;
        reentrantLock.lock();
        while (true) {
            try {
                o oVar = (o) this.f54134e.poll();
                if (oVar == null) {
                    break;
                }
                this.f54132b.remove(oVar.f54115b, oVar);
                e(oVar);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
            atomicReferenceArray.lazySet(i10, null);
        }
        while (true) {
            Runnable runnable = (Runnable) this.f54138i.poll();
            if (runnable == null) {
                reentrantLock.unlock();
                return;
            }
            runnable.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f54132b.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        Iterator it = this.f54132b.values().iterator();
        while (it.hasNext()) {
            if (((o) it.next()).a().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        o oVar;
        while (this.f54135f.get() > this.f54136g.get() && (oVar = (o) this.f54134e.poll()) != null) {
            this.f54132b.remove(oVar.f54115b, oVar);
            e(oVar);
        }
    }

    public final void e(o oVar) {
        t tVar;
        do {
            tVar = (t) oVar.get();
        } while (!oVar.compareAndSet(tVar, new t(tVar.f54128b, 0)));
        AtomicLong atomicLong = this.f54135f;
        atomicLong.lazySet(atomicLong.get() - Math.abs(tVar.f54127a));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        l lVar = this.f54145p;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f54145p = lVar2;
        return lVar2;
    }

    public final Object f(boolean z10, Object obj, Object obj2) {
        t tVar;
        obj.getClass();
        obj2.getClass();
        t tVar2 = new t(obj2, 1);
        o oVar = new o(obj, tVar2);
        while (true) {
            o oVar2 = (o) this.f54132b.putIfAbsent(oVar.f54115b, oVar);
            if (oVar2 == null) {
                b(new e(this, oVar));
                return null;
            }
            if (z10) {
                a(oVar2);
                return oVar2.a();
            }
            do {
                tVar = (t) oVar2.get();
                if (!tVar.a()) {
                    break;
                }
            } while (!oVar2.compareAndSet(tVar, tVar2));
            int i10 = 1 - tVar.f54127a;
            if (i10 == 0) {
                a(oVar2);
            } else {
                b(new q(this, oVar2, i10));
            }
            return tVar.f54128b;
        }
    }

    public final void g() {
        g gVar = j.f54101b;
        i iVar = j.f54103e;
        AtomicReference atomicReference = this.f54142m;
        ReentrantLock reentrantLock = this.f54137h;
        if (reentrantLock.tryLock()) {
            try {
                atomicReference.lazySet(iVar);
                c();
                while (!atomicReference.compareAndSet(iVar, gVar) && atomicReference.get() == iVar) {
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                while (!atomicReference.compareAndSet(iVar, gVar) && atomicReference.get() == iVar) {
                }
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        o oVar = (o) this.f54132b.get(obj);
        if (oVar == null) {
            return null;
        }
        a(oVar);
        return oVar.a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f54132b.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        n nVar = this.f54143n;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.f54143n = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return f(false, obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        return f(true, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        t tVar;
        o oVar = (o) this.f54132b.remove(obj);
        if (oVar == null) {
            return null;
        }
        do {
            tVar = (t) oVar.get();
            if (!tVar.a()) {
                break;
            }
        } while (!oVar.compareAndSet(tVar, new t(tVar.f54128b, -tVar.f54127a)));
        b(new p(this, oVar));
        return oVar.a();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        t tVar;
        obj.getClass();
        obj2.getClass();
        t tVar2 = new t(obj2, 1);
        o oVar = (o) this.f54132b.get(obj);
        if (oVar == null) {
            return null;
        }
        do {
            tVar = (t) oVar.get();
            if (!tVar.a()) {
                return null;
            }
        } while (!oVar.compareAndSet(tVar, tVar2));
        int i10 = 1 - tVar.f54127a;
        if (i10 == 0) {
            a(oVar);
        } else {
            b(new q(this, oVar, i10));
        }
        return tVar.f54128b;
    }

    public void setCapacity(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        ReentrantLock reentrantLock = this.f54137h;
        reentrantLock.lock();
        try {
            this.f54136g.lazySet(Math.min(j10, 9223372034707292160L));
            c();
            d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f54132b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        s sVar = this.f54144o;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f54144o = sVar2;
        return sVar2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.f54132b;
        o oVar = (o) concurrentHashMap.get(obj);
        if (oVar != null && obj2 != null) {
            t tVar = (t) oVar.get();
            while (true) {
                Object obj3 = tVar.f54128b;
                if (obj2 != obj3 && !obj3.equals(obj2)) {
                    return false;
                }
                if (tVar.a() ? oVar.compareAndSet(tVar, new t(tVar.f54128b, -tVar.f54127a)) : false) {
                    if (concurrentHashMap.remove(obj, oVar)) {
                        b(new p(this, oVar));
                        return true;
                    }
                } else {
                    tVar = (t) oVar.get();
                    if (!tVar.a()) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        t tVar;
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        t tVar2 = new t(obj3, 1);
        o oVar = (o) this.f54132b.get(obj);
        if (oVar != null) {
            do {
                tVar = (t) oVar.get();
                if (tVar.a()) {
                    Object obj4 = tVar.f54128b;
                    if (obj2 != obj4 && !obj4.equals(obj2)) {
                        return false;
                    }
                }
            } while (!oVar.compareAndSet(tVar, tVar2));
            int i10 = 1 - tVar.f54127a;
            if (i10 == 0) {
                a(oVar);
                return true;
            }
            b(new q(this, oVar, i10));
            return true;
        }
        return false;
    }
}
