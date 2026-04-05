package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b1 extends f2.e.d.a.b.AbstractC0719a.AbstractC0720a {

    /* renamed from: a, reason: collision with root package name */
    public long f71151a;

    /* renamed from: b, reason: collision with root package name */
    public long f71152b;

    /* renamed from: c, reason: collision with root package name */
    public String f71153c;

    /* renamed from: d, reason: collision with root package name */
    public String f71154d;

    /* renamed from: e, reason: collision with root package name */
    public byte f71155e;

    @Override // ki.f2.e.d.a.b.AbstractC0719a.AbstractC0720a
    public f2.e.d.a.b.AbstractC0719a build() {
        String str;
        if (this.f71155e == 3 && (str = this.f71153c) != null) {
            return new c1(str, this.f71154d, this.f71151a, this.f71152b);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71155e & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((this.f71155e & 2) == 0) {
            sb2.append(" size");
        }
        if (this.f71153c == null) {
            sb2.append(" name");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a.AbstractC0720a
    public f2.e.d.a.b.AbstractC0719a.AbstractC0720a setBaseAddress(long j10) {
        this.f71151a = j10;
        this.f71155e = (byte) (this.f71155e | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a.AbstractC0720a
    public f2.e.d.a.b.AbstractC0719a.AbstractC0720a setName(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f71153c = str;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a.AbstractC0720a
    public f2.e.d.a.b.AbstractC0719a.AbstractC0720a setSize(long j10) {
        this.f71152b = j10;
        this.f71155e = (byte) (this.f71155e | 2);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a.AbstractC0720a
    public f2.e.d.a.b.AbstractC0719a.AbstractC0720a setUuid(String str) {
        this.f71154d = str;
        return this;
    }
}
