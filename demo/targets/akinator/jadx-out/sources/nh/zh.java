package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class zh extends ii {

    /* renamed from: h, reason: collision with root package name */
    public transient bi f76831h;

    /* renamed from: i, reason: collision with root package name */
    public transient ci f76832i;

    @Override // nh.ii, java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // nh.ii, java.util.Map
    public Set<Map.Entry<Object, Collection<Object>>> entrySet() {
        bi biVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76831h == null) {
                    this.f76831h = new bi(((Map) this.f76515b).entrySet(), this.f76516c);
                }
                biVar = this.f76831h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return biVar;
    }

    @Override // nh.ii, java.util.Map, nh.q0
    public Collection<Collection<Object>> values() {
        ci ciVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76832i == null) {
                    this.f76832i = new ci(((Map) this.f76515b).values(), this.f76516c);
                }
                ciVar = this.f76832i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ciVar;
    }

    @Override // nh.ii, java.util.Map
    public Collection<Object> get(Object obj) {
        ei eiVarC;
        synchronized (this.f76516c) {
            Collection collection = (Collection) super.get(obj);
            eiVarC = collection == null ? null : jh.i.c(this.f76516c, collection);
        }
        return eiVarC;
    }
}
