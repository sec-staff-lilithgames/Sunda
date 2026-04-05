package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 extends f2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f71225a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71227c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71228d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71229e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71230f;

    /* renamed from: g, reason: collision with root package name */
    public final long f71231g;

    /* renamed from: h, reason: collision with root package name */
    public final String f71232h;

    /* renamed from: i, reason: collision with root package name */
    public final List f71233i;

    public e0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f71225a = i10;
        this.f71226b = str;
        this.f71227c = i11;
        this.f71228d = i12;
        this.f71229e = j10;
        this.f71230f = j11;
        this.f71231g = j12;
        this.f71232h = str2;
        this.f71233i = list;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.a) {
            f2.a aVar = (f2.a) obj;
            if (this.f71225a == aVar.getPid() && this.f71226b.equals(aVar.getProcessName()) && this.f71227c == aVar.getReasonCode() && this.f71228d == aVar.getImportance() && this.f71229e == aVar.getPss() && this.f71230f == aVar.getRss() && this.f71231g == aVar.getTimestamp() && ((str = this.f71232h) != null ? str.equals(aVar.getTraceFile()) : aVar.getTraceFile() == null) && ((list = this.f71233i) != null ? list.equals(aVar.getBuildIdMappingForArch()) : aVar.getBuildIdMappingForArch() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.a
    public List<f2.a.AbstractC0714a> getBuildIdMappingForArch() {
        return this.f71233i;
    }

    @Override // ki.f2.a
    public int getImportance() {
        return this.f71228d;
    }

    @Override // ki.f2.a
    public int getPid() {
        return this.f71225a;
    }

    @Override // ki.f2.a
    public String getProcessName() {
        return this.f71226b;
    }

    @Override // ki.f2.a
    public long getPss() {
        return this.f71229e;
    }

    @Override // ki.f2.a
    public int getReasonCode() {
        return this.f71227c;
    }

    @Override // ki.f2.a
    public long getRss() {
        return this.f71230f;
    }

    @Override // ki.f2.a
    public long getTimestamp() {
        return this.f71231g;
    }

    @Override // ki.f2.a
    public String getTraceFile() {
        return this.f71232h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f71225a ^ 1000003) * 1000003) ^ this.f71226b.hashCode()) * 1000003) ^ this.f71227c) * 1000003) ^ this.f71228d) * 1000003;
        long j10 = this.f71229e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f71230f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f71231g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f71232h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f71233i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f71225a + ", processName=" + this.f71226b + ", reasonCode=" + this.f71227c + ", importance=" + this.f71228d + ", pss=" + this.f71229e + ", rss=" + this.f71230f + ", timestamp=" + this.f71231g + ", traceFile=" + this.f71232h + ", buildIdMappingForArch=" + this.f71233i + "}";
    }
}
