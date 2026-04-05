package wr;

import wr.b3;
import wr.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c3 {

    /* renamed from: e, reason: collision with root package name */
    public static final c3 f90854e = new c3(null, null, m6.f91037e, false);

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f90855a;

    /* renamed from: b, reason: collision with root package name */
    public final u.a f90856b;

    /* renamed from: c, reason: collision with root package name */
    public final m6 f90857c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f90858d;

    public c3(b3.e eVar, u.a aVar, m6 m6Var, boolean z10) {
        this.f90855a = eVar;
        this.f90856b = aVar;
        this.f90857c = (m6) mh.p1.checkNotNull(m6Var, "status");
        this.f90858d = z10;
    }

    public static c3 withDrop(m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "drop status shouldn't be OK");
        return new c3(null, null, m6Var, true);
    }

    public static c3 withError(m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "error status shouldn't be OK");
        return new c3(null, null, m6Var, false);
    }

    public static c3 withNoResult() {
        return f90854e;
    }

    public static c3 withSubchannel(b3.e eVar, u.a aVar) {
        return new c3((b3.e) mh.p1.checkNotNull(eVar, "subchannel"), aVar, m6.f91037e, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return mh.h1.equal(this.f90855a, c3Var.f90855a) && mh.h1.equal(this.f90857c, c3Var.f90857c) && mh.h1.equal(this.f90856b, c3Var.f90856b) && this.f90858d == c3Var.f90858d;
    }

    public m6 getStatus() {
        return this.f90857c;
    }

    public u.a getStreamTracerFactory() {
        return this.f90856b;
    }

    public b3.e getSubchannel() {
        return this.f90855a;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f90855a, this.f90857c, this.f90856b, Boolean.valueOf(this.f90858d));
    }

    public boolean isDrop() {
        return this.f90858d;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("subchannel", this.f90855a).add("streamTracerFactory", this.f90856b).add("status", this.f90857c).add("drop", this.f90858d).toString();
    }

    public static c3 withSubchannel(b3.e eVar) {
        return withSubchannel(eVar, null);
    }
}
