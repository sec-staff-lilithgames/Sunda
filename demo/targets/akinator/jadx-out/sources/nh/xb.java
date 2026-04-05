package nh;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xb extends g4 implements q0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Map f76763b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f76764c;

    /* renamed from: e, reason: collision with root package name */
    public q0 f76765e;

    /* renamed from: f, reason: collision with root package name */
    public transient Set f76766f;

    public xb(q0 q0Var, xb xbVar) {
        this.f76763b = Collections.unmodifiableMap(q0Var);
        this.f76764c = q0Var;
        this.f76765e = xbVar;
    }

    @Override // nh.g4
    public final Map c() {
        return this.f76763b;
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f76763b;
    }

    @Override // nh.q0
    public Object forcePut(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.q0
    public q0 inverse() {
        q0 q0Var = this.f76765e;
        if (q0Var != null) {
            return q0Var;
        }
        xb xbVar = new xb(this.f76764c.inverse(), this);
        this.f76765e = xbVar;
        return xbVar;
    }

    @Override // nh.g4, java.util.Map
    public Set<Object> values() {
        Set<Object> set = this.f76766f;
        if (set != null) {
            return set;
        }
        Set<Object> setUnmodifiableSet = Collections.unmodifiableSet(this.f76764c.values());
        this.f76766f = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
