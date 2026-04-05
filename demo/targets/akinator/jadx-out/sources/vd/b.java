package vd;

import md.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    public final long f89207a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f89208b;

    /* renamed from: c, reason: collision with root package name */
    public final md.u f89209c;

    public b(long j10, d0 d0Var, md.u uVar) {
        this.f89207a = j10;
        if (d0Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f89208b = d0Var;
        if (uVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f89209c = uVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f89207a == mVar.getId() && this.f89208b.equals(mVar.getTransportContext()) && this.f89209c.equals(mVar.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // vd.m
    public md.u getEvent() {
        return this.f89209c;
    }

    @Override // vd.m
    public long getId() {
        return this.f89207a;
    }

    @Override // vd.m
    public d0 getTransportContext() {
        return this.f89208b;
    }

    public int hashCode() {
        long j10 = this.f89207a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f89208b.hashCode()) * 1000003) ^ this.f89209c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f89207a + ", transportContext=" + this.f89208b + ", event=" + this.f89209c + "}";
    }
}
