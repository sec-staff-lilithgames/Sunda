package ki;

import j1.o2;
import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d2 extends h2.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f71213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71215c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71216d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71217e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71218f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71219g;

    /* renamed from: h, reason: collision with root package name */
    public final String f71220h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71221i;

    public d2(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f71213a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f71214b = str;
        this.f71215c = i11;
        this.f71216d = j10;
        this.f71217e = j11;
        this.f71218f = z10;
        this.f71219g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f71220h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f71221i = str3;
    }

    @Override // ki.h2.b
    public int arch() {
        return this.f71213a;
    }

    @Override // ki.h2.b
    public int availableProcessors() {
        return this.f71215c;
    }

    @Override // ki.h2.b
    public long diskSpace() {
        return this.f71217e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2.b) {
            h2.b bVar = (h2.b) obj;
            if (this.f71213a == bVar.arch() && this.f71214b.equals(bVar.model()) && this.f71215c == bVar.availableProcessors() && this.f71216d == bVar.totalRam() && this.f71217e == bVar.diskSpace() && this.f71218f == bVar.isEmulator() && this.f71219g == bVar.state() && this.f71220h.equals(bVar.manufacturer()) && this.f71221i.equals(bVar.modelClass())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f71213a ^ 1000003) * 1000003) ^ this.f71214b.hashCode()) * 1000003) ^ this.f71215c) * 1000003;
        long j10 = this.f71216d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f71217e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f71218f ? 1231 : 1237)) * 1000003) ^ this.f71219g) * 1000003) ^ this.f71220h.hashCode()) * 1000003) ^ this.f71221i.hashCode();
    }

    @Override // ki.h2.b
    public boolean isEmulator() {
        return this.f71218f;
    }

    @Override // ki.h2.b
    public String manufacturer() {
        return this.f71220h;
    }

    @Override // ki.h2.b
    public String model() {
        return this.f71214b;
    }

    @Override // ki.h2.b
    public String modelClass() {
        return this.f71221i;
    }

    @Override // ki.h2.b
    public int state() {
        return this.f71219g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f71213a);
        sb2.append(", model=");
        sb2.append(this.f71214b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f71215c);
        sb2.append(", totalRam=");
        sb2.append(this.f71216d);
        sb2.append(", diskSpace=");
        sb2.append(this.f71217e);
        sb2.append(", isEmulator=");
        sb2.append(this.f71218f);
        sb2.append(", state=");
        sb2.append(this.f71219g);
        sb2.append(", manufacturer=");
        sb2.append(this.f71220h);
        sb2.append(", modelClass=");
        return o2.o(sb2, this.f71221i, "}");
    }

    @Override // ki.h2.b
    public long totalRam() {
        return this.f71216d;
    }
}
