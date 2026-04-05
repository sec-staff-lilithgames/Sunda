package ld;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73208a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73209b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f73210c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f73211d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73212e;

    /* renamed from: f, reason: collision with root package name */
    public final List f73213f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f73214g;

    public c0(long j10, long j11, h0 h0Var, Integer num, String str, List list, u0 u0Var) {
        this.f73208a = j10;
        this.f73209b = j11;
        this.f73210c = h0Var;
        this.f73211d = num;
        this.f73212e = str;
        this.f73213f = list;
        this.f73214g = u0Var;
    }

    public boolean equals(Object obj) {
        h0 h0Var;
        Integer num;
        String str;
        List list;
        u0 u0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (this.f73208a == p0Var.getRequestTimeMs() && this.f73209b == p0Var.getRequestUptimeMs() && ((h0Var = this.f73210c) != null ? h0Var.equals(p0Var.getClientInfo()) : p0Var.getClientInfo() == null) && ((num = this.f73211d) != null ? num.equals(p0Var.getLogSource()) : p0Var.getLogSource() == null) && ((str = this.f73212e) != null ? str.equals(p0Var.getLogSourceName()) : p0Var.getLogSourceName() == null) && ((list = this.f73213f) != null ? list.equals(p0Var.getLogEvents()) : p0Var.getLogEvents() == null) && ((u0Var = this.f73214g) != null ? u0Var.equals(p0Var.getQosTier()) : p0Var.getQosTier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ld.p0
    public h0 getClientInfo() {
        return this.f73210c;
    }

    @Override // ld.p0
    public List<o0> getLogEvents() {
        return this.f73213f;
    }

    @Override // ld.p0
    public Integer getLogSource() {
        return this.f73211d;
    }

    @Override // ld.p0
    public String getLogSourceName() {
        return this.f73212e;
    }

    @Override // ld.p0
    public u0 getQosTier() {
        return this.f73214g;
    }

    @Override // ld.p0
    public long getRequestTimeMs() {
        return this.f73208a;
    }

    @Override // ld.p0
    public long getRequestUptimeMs() {
        return this.f73209b;
    }

    public int hashCode() {
        long j10 = this.f73208a;
        long j11 = this.f73209b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        h0 h0Var = this.f73210c;
        int iHashCode = (i10 ^ (h0Var == null ? 0 : h0Var.hashCode())) * 1000003;
        Integer num = this.f73211d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f73212e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f73213f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        u0 u0Var = this.f73214g;
        return iHashCode4 ^ (u0Var != null ? u0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f73208a + ", requestUptimeMs=" + this.f73209b + ", clientInfo=" + this.f73210c + ", logSource=" + this.f73211d + ", logSourceName=" + this.f73212e + ", logEvents=" + this.f73213f + ", qosTier=" + this.f73214g + "}";
    }
}
