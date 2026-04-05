package ld;

import j1.o2;
import ld.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z extends o0.a {

    /* renamed from: a, reason: collision with root package name */
    public Long f73318a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f73319b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f73320c;

    /* renamed from: d, reason: collision with root package name */
    public Long f73321d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f73322e;

    /* renamed from: f, reason: collision with root package name */
    public String f73323f;

    /* renamed from: g, reason: collision with root package name */
    public Long f73324g;

    /* renamed from: h, reason: collision with root package name */
    public r0 f73325h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f73326i;

    @Override // ld.o0.a
    public o0 build() {
        String strL = this.f73318a == null ? " eventTimeMs" : "";
        if (this.f73321d == null) {
            strL = strL.concat(" eventUptimeMs");
        }
        if (this.f73324g == null) {
            strL = o2.l(strL, " timezoneOffsetSeconds");
        }
        if (strL.isEmpty()) {
            return new a0(this.f73318a.longValue(), this.f73319b, this.f73320c, this.f73321d.longValue(), this.f73322e, this.f73323f, this.f73324g.longValue(), this.f73325h, this.f73326i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override // ld.o0.a
    public o0.a setComplianceData(j0 j0Var) {
        this.f73320c = j0Var;
        return this;
    }

    @Override // ld.o0.a
    public o0.a setEventCode(Integer num) {
        this.f73319b = num;
        return this;
    }

    @Override // ld.o0.a
    public o0.a setEventTimeMs(long j10) {
        this.f73318a = Long.valueOf(j10);
        return this;
    }

    @Override // ld.o0.a
    public o0.a setEventUptimeMs(long j10) {
        this.f73321d = Long.valueOf(j10);
        return this;
    }

    @Override // ld.o0.a
    public o0.a setExperimentIds(l0 l0Var) {
        this.f73326i = l0Var;
        return this;
    }

    @Override // ld.o0.a
    public o0.a setNetworkConnectionInfo(r0 r0Var) {
        this.f73325h = r0Var;
        return this;
    }

    @Override // ld.o0.a
    public o0.a setTimezoneOffsetSeconds(long j10) {
        this.f73324g = Long.valueOf(j10);
        return this;
    }
}
