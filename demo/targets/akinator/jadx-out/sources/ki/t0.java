package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t0 extends f2.e.c.a {

    /* renamed from: a, reason: collision with root package name */
    public int f71458a;

    /* renamed from: b, reason: collision with root package name */
    public String f71459b;

    /* renamed from: c, reason: collision with root package name */
    public int f71460c;

    /* renamed from: d, reason: collision with root package name */
    public long f71461d;

    /* renamed from: e, reason: collision with root package name */
    public long f71462e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71463f;

    /* renamed from: g, reason: collision with root package name */
    public int f71464g;

    /* renamed from: h, reason: collision with root package name */
    public String f71465h;

    /* renamed from: i, reason: collision with root package name */
    public String f71466i;

    /* renamed from: j, reason: collision with root package name */
    public byte f71467j;

    @Override // ki.f2.e.c.a
    public f2.e.c build() {
        String str;
        String str2;
        String str3;
        if (this.f71467j == 63 && (str = this.f71459b) != null && (str2 = this.f71465h) != null && (str3 = this.f71466i) != null) {
            return new u0(this.f71458a, str, this.f71460c, this.f71461d, this.f71462e, this.f71463f, this.f71464g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71467j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f71459b == null) {
            sb2.append(" model");
        }
        if ((this.f71467j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f71467j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f71467j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f71467j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f71467j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f71465h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f71466i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setArch(int i10) {
        this.f71458a = i10;
        this.f71467j = (byte) (this.f71467j | 1);
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setCores(int i10) {
        this.f71460c = i10;
        this.f71467j = (byte) (this.f71467j | 2);
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setDiskSpace(long j10) {
        this.f71462e = j10;
        this.f71467j = (byte) (this.f71467j | 8);
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setManufacturer(String str) {
        if (str == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f71465h = str;
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setModel(String str) {
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f71459b = str;
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setModelClass(String str) {
        if (str == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f71466i = str;
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setRam(long j10) {
        this.f71461d = j10;
        this.f71467j = (byte) (this.f71467j | 4);
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setSimulator(boolean z10) {
        this.f71463f = z10;
        this.f71467j = (byte) (this.f71467j | 16);
        return this;
    }

    @Override // ki.f2.e.c.a
    public f2.e.c.a setState(int i10) {
        this.f71464g = i10;
        this.f71467j = (byte) (this.f71467j | 32);
        return this;
    }
}
