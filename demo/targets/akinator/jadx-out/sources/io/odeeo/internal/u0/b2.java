package io.odeeo.internal.u0;

import io.odeeo.internal.t0.o;
import io.odeeo.internal.u0.c2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f66534a;

    /* renamed from: b, reason: collision with root package name */
    public int f66535b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f66536c = -1;

    /* renamed from: d, reason: collision with root package name */
    public c2.p f66537d;

    /* renamed from: e, reason: collision with root package name */
    public c2.p f66538e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.t0.i<Object> f66539f;

    public b2 a(io.odeeo.internal.t0.i<Object> iVar) {
        io.odeeo.internal.t0.i<Object> iVar2 = this.f66539f;
        io.odeeo.internal.t0.u.checkState(iVar2 == null, "key equivalence was already set to %s", iVar2);
        this.f66539f = (io.odeeo.internal.t0.i) io.odeeo.internal.t0.u.checkNotNull(iVar);
        this.f66534a = true;
        return this;
    }

    public int b() {
        int i10 = this.f66535b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    public io.odeeo.internal.t0.i<Object> c() {
        return (io.odeeo.internal.t0.i) io.odeeo.internal.t0.o.firstNonNull(this.f66539f, d().a());
    }

    public b2 concurrencyLevel(int i10) {
        int i11 = this.f66536c;
        io.odeeo.internal.t0.u.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        io.odeeo.internal.t0.u.checkArgument(i10 > 0);
        this.f66536c = i10;
        return this;
    }

    public c2.p d() {
        return (c2.p) io.odeeo.internal.t0.o.firstNonNull(this.f66537d, c2.p.f66593a);
    }

    public c2.p e() {
        return (c2.p) io.odeeo.internal.t0.o.firstNonNull(this.f66538e, c2.p.f66593a);
    }

    public b2 initialCapacity(int i10) {
        int i11 = this.f66535b;
        io.odeeo.internal.t0.u.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0);
        this.f66535b = i10;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.f66534a ? new ConcurrentHashMap(b(), 0.75f, a()) : c2.a(this);
    }

    public String toString() {
        o.b stringHelper = io.odeeo.internal.t0.o.toStringHelper(this);
        int i10 = this.f66535b;
        if (i10 != -1) {
            stringHelper.add("initialCapacity", i10);
        }
        int i11 = this.f66536c;
        if (i11 != -1) {
            stringHelper.add("concurrencyLevel", i11);
        }
        c2.p pVar = this.f66537d;
        if (pVar != null) {
            stringHelper.add("keyStrength", io.odeeo.internal.t0.c.toLowerCase(pVar.toString()));
        }
        c2.p pVar2 = this.f66538e;
        if (pVar2 != null) {
            stringHelper.add("valueStrength", io.odeeo.internal.t0.c.toLowerCase(pVar2.toString()));
        }
        if (this.f66539f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    public b2 weakKeys() {
        return a(c2.p.f66594b);
    }

    public b2 weakValues() {
        return b(c2.p.f66594b);
    }

    public b2 b(c2.p pVar) {
        c2.p pVar2 = this.f66538e;
        io.odeeo.internal.t0.u.checkState(pVar2 == null, "Value strength was already set to %s", pVar2);
        this.f66538e = (c2.p) io.odeeo.internal.t0.u.checkNotNull(pVar);
        if (pVar != c2.p.f66593a) {
            this.f66534a = true;
        }
        return this;
    }

    public int a() {
        int i10 = this.f66536c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    public b2 a(c2.p pVar) {
        c2.p pVar2 = this.f66537d;
        io.odeeo.internal.t0.u.checkState(pVar2 == null, "Key strength was already set to %s", pVar2);
        this.f66537d = (c2.p) io.odeeo.internal.t0.u.checkNotNull(pVar);
        if (pVar != c2.p.f66593a) {
            this.f66534a = true;
        }
        return this;
    }
}
