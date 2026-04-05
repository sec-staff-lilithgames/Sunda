package ld;

import java.util.List;
import ld.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 extends p0.a {

    /* renamed from: a, reason: collision with root package name */
    public Long f73199a;

    /* renamed from: b, reason: collision with root package name */
    public Long f73200b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f73201c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f73202d;

    /* renamed from: e, reason: collision with root package name */
    public String f73203e;

    /* renamed from: f, reason: collision with root package name */
    public List f73204f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f73205g;

    @Override // ld.p0.a
    public final b0 a(Integer num) {
        this.f73202d = num;
        return this;
    }

    @Override // ld.p0.a
    public final b0 b(String str) {
        this.f73203e = str;
        return this;
    }

    @Override // ld.p0.a
    public p0 build() {
        String strConcat = this.f73199a == null ? " requestTimeMs" : "";
        if (this.f73200b == null) {
            strConcat = strConcat.concat(" requestUptimeMs");
        }
        if (strConcat.isEmpty()) {
            return new c0(this.f73199a.longValue(), this.f73200b.longValue(), this.f73201c, this.f73202d, this.f73203e, this.f73204f, this.f73205g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // ld.p0.a
    public p0.a setClientInfo(h0 h0Var) {
        this.f73201c = h0Var;
        return this;
    }

    @Override // ld.p0.a
    public p0.a setLogEvents(List<o0> list) {
        this.f73204f = list;
        return this;
    }

    @Override // ld.p0.a
    public p0.a setQosTier(u0 u0Var) {
        this.f73205g = u0Var;
        return this;
    }

    @Override // ld.p0.a
    public p0.a setRequestTimeMs(long j10) {
        this.f73199a = Long.valueOf(j10);
        return this;
    }

    @Override // ld.p0.a
    public p0.a setRequestUptimeMs(long j10) {
        this.f73200b = Long.valueOf(j10);
        return this;
    }
}
