package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n1 extends f2.e.d.c.a {

    /* renamed from: a, reason: collision with root package name */
    public Double f71373a;

    /* renamed from: b, reason: collision with root package name */
    public int f71374b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f71375c;

    /* renamed from: d, reason: collision with root package name */
    public int f71376d;

    /* renamed from: e, reason: collision with root package name */
    public long f71377e;

    /* renamed from: f, reason: collision with root package name */
    public long f71378f;

    /* renamed from: g, reason: collision with root package name */
    public byte f71379g;

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c build() {
        if (this.f71379g == 31) {
            return new o1(this.f71373a, this.f71374b, this.f71375c, this.f71376d, this.f71377e, this.f71378f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71379g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f71379g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f71379g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f71379g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f71379g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setBatteryLevel(Double d10) {
        this.f71373a = d10;
        return this;
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setBatteryVelocity(int i10) {
        this.f71374b = i10;
        this.f71379g = (byte) (this.f71379g | 1);
        return this;
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setDiskUsed(long j10) {
        this.f71378f = j10;
        this.f71379g = (byte) (this.f71379g | 16);
        return this;
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setOrientation(int i10) {
        this.f71376d = i10;
        this.f71379g = (byte) (this.f71379g | 4);
        return this;
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setProximityOn(boolean z10) {
        this.f71375c = z10;
        this.f71379g = (byte) (this.f71379g | 2);
        return this;
    }

    @Override // ki.f2.e.d.c.a
    public f2.e.d.c.a setRamUsed(long j10) {
        this.f71377e = j10;
        this.f71379g = (byte) (this.f71379g | 8);
        return this;
    }
}
