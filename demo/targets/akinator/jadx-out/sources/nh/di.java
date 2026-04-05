package nh;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class di extends ii implements q0 {

    /* renamed from: h, reason: collision with root package name */
    public transient pi f76190h;

    /* renamed from: i, reason: collision with root package name */
    public transient q0 f76191i;

    public di(q0 q0Var, Object obj, di diVar) {
        super(q0Var, obj);
        this.f76191i = diVar;
    }

    @Override // nh.ii
    public final Map c() {
        return (q0) ((Map) this.f76515b);
    }

    @Override // nh.q0
    public Object forcePut(Object obj, Object obj2) {
        Object objForcePut;
        synchronized (this.f76516c) {
            objForcePut = ((q0) ((Map) this.f76515b)).forcePut(obj, obj2);
        }
        return objForcePut;
    }

    @Override // nh.q0
    public q0 inverse() {
        q0 q0Var;
        synchronized (this.f76516c) {
            try {
                if (this.f76191i == null) {
                    this.f76191i = new di(((q0) ((Map) this.f76515b)).inverse(), this.f76516c, this);
                }
                q0Var = this.f76191i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q0Var;
    }

    @Override // nh.ii, java.util.Map, nh.q0
    public Set<Object> values() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76190h == null) {
                    this.f76190h = new pi(((q0) ((Map) this.f76515b)).values(), this.f76516c);
                }
                piVar = this.f76190h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }
}
