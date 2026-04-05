package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ii extends ni implements Map {

    /* renamed from: e, reason: collision with root package name */
    public transient pi f76372e;

    /* renamed from: f, reason: collision with root package name */
    public transient ei f76373f;

    /* renamed from: g, reason: collision with root package name */
    public transient pi f76374g;

    public Map c() {
        return (Map) this.f76515b;
    }

    @Override // java.util.Map
    public void clear() {
        synchronized (this.f76516c) {
            c().clear();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f76516c) {
            zContainsKey = c().containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f76516c) {
            zContainsValue = c().containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76374g == null) {
                    this.f76374g = new pi(c().entrySet(), this.f76516c);
                }
                piVar = this.f76374g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76516c) {
            zEquals = c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2;
        synchronized (this.f76516c) {
            obj2 = c().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76516c) {
            zIsEmpty = c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76372e == null) {
                    this.f76372e = new pi(c().keySet(), this.f76516c);
                }
                piVar = this.f76372e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f76516c) {
            objPut = c().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        synchronized (this.f76516c) {
            c().putAll(map);
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f76516c) {
            objRemove = c().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public int size() {
        int size;
        synchronized (this.f76516c) {
            size = c().size();
        }
        return size;
    }

    public Collection<Object> values() {
        ei eiVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76373f == null) {
                    this.f76373f = new ei(c().values(), this.f76516c);
                }
                eiVar = this.f76373f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eiVar;
    }
}
