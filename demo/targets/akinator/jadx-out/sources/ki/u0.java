package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u0 extends f2.e.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f71472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71474c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71475d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71477f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71478g;

    /* renamed from: h, reason: collision with root package name */
    public final String f71479h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71480i;

    public u0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f71472a = i10;
        this.f71473b = str;
        this.f71474c = i11;
        this.f71475d = j10;
        this.f71476e = j11;
        this.f71477f = z10;
        this.f71478g = i12;
        this.f71479h = str2;
        this.f71480i = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.c) {
            f2.e.c cVar = (f2.e.c) obj;
            if (this.f71472a == cVar.getArch() && this.f71473b.equals(cVar.getModel()) && this.f71474c == cVar.getCores() && this.f71475d == cVar.getRam() && this.f71476e == cVar.getDiskSpace() && this.f71477f == cVar.isSimulator() && this.f71478g == cVar.getState() && this.f71479h.equals(cVar.getManufacturer()) && this.f71480i.equals(cVar.getModelClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.c
    public int getArch() {
        return this.f71472a;
    }

    @Override // ki.f2.e.c
    public int getCores() {
        return this.f71474c;
    }

    @Override // ki.f2.e.c
    public long getDiskSpace() {
        return this.f71476e;
    }

    @Override // ki.f2.e.c
    public String getManufacturer() {
        return this.f71479h;
    }

    @Override // ki.f2.e.c
    public String getModel() {
        return this.f71473b;
    }

    @Override // ki.f2.e.c
    public String getModelClass() {
        return this.f71480i;
    }

    @Override // ki.f2.e.c
    public long getRam() {
        return this.f71475d;
    }

    @Override // ki.f2.e.c
    public int getState() {
        return this.f71478g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f71472a ^ 1000003) * 1000003) ^ this.f71473b.hashCode()) * 1000003) ^ this.f71474c) * 1000003;
        long j10 = this.f71475d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f71476e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f71477f ? 1231 : 1237)) * 1000003) ^ this.f71478g) * 1000003) ^ this.f71479h.hashCode()) * 1000003) ^ this.f71480i.hashCode();
    }

    @Override // ki.f2.e.c
    public boolean isSimulator() {
        return this.f71477f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f71472a);
        sb2.append(", model=");
        sb2.append(this.f71473b);
        sb2.append(", cores=");
        sb2.append(this.f71474c);
        sb2.append(", ram=");
        sb2.append(this.f71475d);
        sb2.append(", diskSpace=");
        sb2.append(this.f71476e);
        sb2.append(", simulator=");
        sb2.append(this.f71477f);
        sb2.append(", state=");
        sb2.append(this.f71478g);
        sb2.append(", manufacturer=");
        sb2.append(this.f71479h);
        sb2.append(", modelClass=");
        return o2.o(sb2, this.f71480i, "}");
    }
}
