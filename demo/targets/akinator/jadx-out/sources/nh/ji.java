package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ji extends ni implements fc {

    /* renamed from: e, reason: collision with root package name */
    public transient pi f76407e;

    /* renamed from: f, reason: collision with root package name */
    public transient ei f76408f;

    /* renamed from: g, reason: collision with root package name */
    public transient ei f76409g;

    /* renamed from: h, reason: collision with root package name */
    public transient zh f76410h;

    /* renamed from: i, reason: collision with root package name */
    public transient Object f76411i;

    @Override // nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        zh zhVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76410h == null) {
                    this.f76410h = new zh(c().asMap(), this.f76516c);
                }
                zhVar = this.f76410h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zhVar;
    }

    public fc c() {
        return (fc) this.f76515b;
    }

    @Override // nh.fc
    public void clear() {
        synchronized (this.f76516c) {
            c().clear();
        }
    }

    @Override // nh.fc
    public boolean containsEntry(Object obj, Object obj2) {
        boolean zContainsEntry;
        synchronized (this.f76516c) {
            zContainsEntry = c().containsEntry(obj, obj2);
        }
        return zContainsEntry;
    }

    @Override // nh.fc
    public boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f76516c) {
            zContainsKey = c().containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // nh.fc
    public boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f76516c) {
            zContainsValue = c().containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // nh.fc
    public Collection<Map.Entry<Object, Object>> entries() {
        ei eiVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76409g == null) {
                    this.f76409g = jh.i.c(this.f76516c, c().entries());
                }
                eiVar = this.f76409g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eiVar;
    }

    @Override // nh.fc, nh.c8
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

    public Collection<Object> get(Object obj) {
        ei eiVarC;
        synchronized (this.f76516c) {
            eiVarC = jh.i.c(this.f76516c, c().get(obj));
        }
        return eiVarC;
    }

    @Override // nh.fc
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    @Override // nh.fc
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76516c) {
            zIsEmpty = c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // nh.fc
    public Set<Object> keySet() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76407e == null) {
                    this.f76407e = jh.i.b(c().keySet(), this.f76516c);
                }
                piVar = this.f76407e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nh.ud] */
    @Override // nh.fc
    public ud keys() {
        ?? r12;
        synchronized (this.f76516c) {
            try {
                if (this.f76411i == null) {
                    ud udVarKeys = c().keys();
                    Object obj = this.f76516c;
                    if (!(udVarKeys instanceof ki) && !(udVarKeys instanceof d6)) {
                        udVarKeys = new ki(udVarKeys, obj);
                    }
                    this.f76411i = udVarKeys;
                }
                r12 = this.f76411i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r12;
    }

    @Override // nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        boolean zPut;
        synchronized (this.f76516c) {
            zPut = c().put(obj, obj2);
        }
        return zPut;
    }

    @Override // nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        boolean zPutAll;
        synchronized (this.f76516c) {
            zPutAll = c().putAll(obj, iterable);
        }
        return zPutAll;
    }

    @Override // nh.fc
    public boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f76516c) {
            zRemove = c().remove(obj, obj2);
        }
        return zRemove;
    }

    public Collection<Object> removeAll(Object obj) {
        Collection<Object> collectionRemoveAll;
        synchronized (this.f76516c) {
            collectionRemoveAll = c().removeAll(obj);
        }
        return collectionRemoveAll;
    }

    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        Collection<Object> collectionReplaceValues;
        synchronized (this.f76516c) {
            collectionReplaceValues = c().replaceValues(obj, iterable);
        }
        return collectionReplaceValues;
    }

    @Override // nh.fc
    public int size() {
        int size;
        synchronized (this.f76516c) {
            size = c().size();
        }
        return size;
    }

    @Override // nh.fc
    public Collection<Object> values() {
        ei eiVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76408f == null) {
                    this.f76408f = new ei(c().values(), this.f76516c);
                }
                eiVar = this.f76408f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eiVar;
    }

    @Override // nh.fc
    public boolean putAll(fc fcVar) {
        boolean zPutAll;
        synchronized (this.f76516c) {
            zPutAll = c().putAll(fcVar);
        }
        return zPutAll;
    }
}
