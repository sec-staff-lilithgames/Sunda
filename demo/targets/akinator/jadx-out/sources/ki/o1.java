package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o1 extends f2.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    public final Double f71396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71397b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71399d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71400e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71401f;

    public o1(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f71396a = d10;
        this.f71397b = i10;
        this.f71398c = z10;
        this.f71399d = i11;
        this.f71400e = j10;
        this.f71401f = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.c) {
            f2.e.d.c cVar = (f2.e.d.c) obj;
            Double d10 = this.f71396a;
            if (d10 != null ? d10.equals(cVar.getBatteryLevel()) : cVar.getBatteryLevel() == null) {
                if (this.f71397b == cVar.getBatteryVelocity() && this.f71398c == cVar.isProximityOn() && this.f71399d == cVar.getOrientation() && this.f71400e == cVar.getRamUsed() && this.f71401f == cVar.getDiskUsed()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.c
    public Double getBatteryLevel() {
        return this.f71396a;
    }

    @Override // ki.f2.e.d.c
    public int getBatteryVelocity() {
        return this.f71397b;
    }

    @Override // ki.f2.e.d.c
    public long getDiskUsed() {
        return this.f71401f;
    }

    @Override // ki.f2.e.d.c
    public int getOrientation() {
        return this.f71399d;
    }

    @Override // ki.f2.e.d.c
    public long getRamUsed() {
        return this.f71400e;
    }

    public int hashCode() {
        Double d10 = this.f71396a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f71397b) * 1000003) ^ (this.f71398c ? 1231 : 1237)) * 1000003) ^ this.f71399d) * 1000003;
        long j10 = this.f71400e;
        long j11 = this.f71401f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // ki.f2.e.d.c
    public boolean isProximityOn() {
        return this.f71398c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f71396a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f71397b);
        sb2.append(", proximityOn=");
        sb2.append(this.f71398c);
        sb2.append(", orientation=");
        sb2.append(this.f71399d);
        sb2.append(", ramUsed=");
        sb2.append(this.f71400e);
        sb2.append(", diskUsed=");
        return a.b.g(this.f71401f, "}", sb2);
    }
}
