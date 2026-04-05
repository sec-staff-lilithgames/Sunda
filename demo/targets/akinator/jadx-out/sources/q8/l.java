package q8;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final h f82580a;

    /* renamed from: b, reason: collision with root package name */
    public final k f82581b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f82582c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f82583d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82584e;

    /* renamed from: f, reason: collision with root package name */
    public int f82585f;

    public l() {
        this.f82580a = new h();
        this.f82581b = new k();
        this.f82582c = new HashMap();
        this.f82583d = new HashMap();
        this.f82584e = 4194304;
    }

    public final void a(int i10, Class cls) {
        NavigableMap navigableMapE = e(cls);
        Integer num = (Integer) navigableMapE.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapE.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapE.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void b(int i10) {
        while (this.f82585f > i10) {
            Object objRemoveLast = this.f82580a.removeLast();
            j9.q.checkNotNull(objRemoveLast);
            a aVarC = c(objRemoveLast.getClass());
            this.f82585f -= aVarC.getElementSizeInBytes() * aVarC.getArrayLength(objRemoveLast);
            a(aVarC.getArrayLength(objRemoveLast), objRemoveLast.getClass());
            if (Log.isLoggable(aVarC.getTag(), 2)) {
                Log.v(aVarC.getTag(), "evicted: " + aVarC.getArrayLength(objRemoveLast));
            }
        }
    }

    public final a c(Class cls) {
        a fVar;
        HashMap map = this.f82583d;
        a aVar = (a) map.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new i();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            fVar = new f();
        }
        map.put(cls, fVar);
        return fVar;
    }

    @Override // q8.b
    public synchronized void clearMemory() {
        b(0);
    }

    public final Object d(j jVar, Class cls) {
        a aVarC = c(cls);
        Object obj = this.f82580a.get(jVar);
        if (obj != null) {
            this.f82585f -= aVarC.getElementSizeInBytes() * aVarC.getArrayLength(obj);
            a(aVarC.getArrayLength(obj), cls);
        }
        if (obj != null) {
            return obj;
        }
        if (Log.isLoggable(aVarC.getTag(), 2)) {
            Log.v(aVarC.getTag(), "Allocated " + jVar.f82578b + " bytes");
        }
        return aVarC.newArray(jVar.f82578b);
    }

    public final NavigableMap e(Class cls) {
        HashMap map = this.f82582c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // q8.b
    public synchronized <T> T get(int i10, Class<T> cls) {
        j jVar;
        int i11;
        try {
            Integer num = (Integer) e(cls).ceilingKey(Integer.valueOf(i10));
            if (num == null || ((i11 = this.f82585f) != 0 && this.f82584e / i11 < 2 && num.intValue() > i10 * 8)) {
                k kVar = this.f82581b;
                q qVarA = (q) kVar.f82570a.poll();
                if (qVarA == null) {
                    qVarA = kVar.a();
                }
                jVar = (j) qVarA;
                jVar.f82578b = i10;
                jVar.f82579c = cls;
            } else {
                k kVar2 = this.f82581b;
                int iIntValue = num.intValue();
                q qVarA2 = (q) kVar2.f82570a.poll();
                if (qVarA2 == null) {
                    qVarA2 = kVar2.a();
                }
                jVar = (j) qVarA2;
                jVar.f82578b = iIntValue;
                jVar.f82579c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) d(jVar, cls);
    }

    @Override // q8.b
    public synchronized <T> T getExact(int i10, Class<T> cls) {
        j jVar;
        k kVar = this.f82581b;
        q qVarA = (q) kVar.f82570a.poll();
        if (qVarA == null) {
            qVarA = kVar.a();
        }
        jVar = (j) qVarA;
        jVar.f82578b = i10;
        jVar.f82579c = cls;
        return (T) d(jVar, cls);
    }

    @Override // q8.b
    @Deprecated
    public <T> void put(T t10, Class<T> cls) {
        put(t10);
    }

    @Override // q8.b
    public synchronized void trimMemory(int i10) {
        try {
            if (i10 >= 40) {
                clearMemory();
            } else if (i10 >= 20 || i10 == 15) {
                b(this.f82584e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q8.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        a aVarC = c(cls);
        int arrayLength = aVarC.getArrayLength(t10);
        int elementSizeInBytes = aVarC.getElementSizeInBytes() * arrayLength;
        if (elementSizeInBytes <= this.f82584e / 2) {
            k kVar = this.f82581b;
            q qVarA = (q) kVar.f82570a.poll();
            if (qVarA == null) {
                qVarA = kVar.a();
            }
            j jVar = (j) qVarA;
            jVar.f82578b = arrayLength;
            jVar.f82579c = cls;
            this.f82580a.put(jVar, t10);
            NavigableMap navigableMapE = e(cls);
            Integer num = (Integer) navigableMapE.get(Integer.valueOf(jVar.f82578b));
            Integer numValueOf = Integer.valueOf(jVar.f82578b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapE.put(numValueOf, Integer.valueOf(iIntValue));
            this.f82585f += elementSizeInBytes;
            b(this.f82584e);
        }
    }

    public l(int i10) {
        this.f82580a = new h();
        this.f82581b = new k();
        this.f82582c = new HashMap();
        this.f82583d = new HashMap();
        this.f82584e = i10;
    }
}
