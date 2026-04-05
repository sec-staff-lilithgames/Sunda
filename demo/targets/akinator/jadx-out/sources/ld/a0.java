package ld;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73177a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73178b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f73179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73180d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f73181e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73182f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73183g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f73184h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f73185i;

    public a0(long j10, Integer num, j0 j0Var, long j11, byte[] bArr, String str, long j12, r0 r0Var, l0 l0Var) {
        this.f73177a = j10;
        this.f73178b = num;
        this.f73179c = j0Var;
        this.f73180d = j11;
        this.f73181e = bArr;
        this.f73182f = str;
        this.f73183g = j12;
        this.f73184h = r0Var;
        this.f73185i = l0Var;
    }

    public boolean equals(Object obj) {
        Integer num;
        j0 j0Var;
        String str;
        r0 r0Var;
        l0 l0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.f73177a == o0Var.getEventTimeMs() && ((num = this.f73178b) != null ? num.equals(o0Var.getEventCode()) : o0Var.getEventCode() == null) && ((j0Var = this.f73179c) != null ? j0Var.equals(o0Var.getComplianceData()) : o0Var.getComplianceData() == null) && this.f73180d == o0Var.getEventUptimeMs()) {
                if (Arrays.equals(this.f73181e, o0Var instanceof a0 ? ((a0) o0Var).f73181e : o0Var.getSourceExtension()) && ((str = this.f73182f) != null ? str.equals(o0Var.getSourceExtensionJsonProto3()) : o0Var.getSourceExtensionJsonProto3() == null) && this.f73183g == o0Var.getTimezoneOffsetSeconds() && ((r0Var = this.f73184h) != null ? r0Var.equals(o0Var.getNetworkConnectionInfo()) : o0Var.getNetworkConnectionInfo() == null) && ((l0Var = this.f73185i) != null ? l0Var.equals(o0Var.getExperimentIds()) : o0Var.getExperimentIds() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ld.o0
    public j0 getComplianceData() {
        return this.f73179c;
    }

    @Override // ld.o0
    public Integer getEventCode() {
        return this.f73178b;
    }

    @Override // ld.o0
    public long getEventTimeMs() {
        return this.f73177a;
    }

    @Override // ld.o0
    public long getEventUptimeMs() {
        return this.f73180d;
    }

    @Override // ld.o0
    public l0 getExperimentIds() {
        return this.f73185i;
    }

    @Override // ld.o0
    public r0 getNetworkConnectionInfo() {
        return this.f73184h;
    }

    @Override // ld.o0
    public byte[] getSourceExtension() {
        return this.f73181e;
    }

    @Override // ld.o0
    public String getSourceExtensionJsonProto3() {
        return this.f73182f;
    }

    @Override // ld.o0
    public long getTimezoneOffsetSeconds() {
        return this.f73183g;
    }

    public int hashCode() {
        long j10 = this.f73177a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f73178b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        j0 j0Var = this.f73179c;
        int iHashCode2 = (iHashCode ^ (j0Var == null ? 0 : j0Var.hashCode())) * 1000003;
        long j11 = this.f73180d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f73181e)) * 1000003;
        String str = this.f73182f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f73183g;
        int i11 = (iHashCode4 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        r0 r0Var = this.f73184h;
        int iHashCode5 = (i11 ^ (r0Var == null ? 0 : r0Var.hashCode())) * 1000003;
        l0 l0Var = this.f73185i;
        return iHashCode5 ^ (l0Var != null ? l0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f73177a + ", eventCode=" + this.f73178b + ", complianceData=" + this.f73179c + ", eventUptimeMs=" + this.f73180d + ", sourceExtension=" + Arrays.toString(this.f73181e) + ", sourceExtensionJsonProto3=" + this.f73182f + ", timezoneOffsetSeconds=" + this.f73183g + ", networkConnectionInfo=" + this.f73184h + ", experimentIds=" + this.f73185i + "}";
    }
}
