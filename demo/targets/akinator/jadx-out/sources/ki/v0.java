package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v0 extends f2.e.d.b {

    /* renamed from: a, reason: collision with root package name */
    public long f71488a;

    /* renamed from: b, reason: collision with root package name */
    public String f71489b;

    /* renamed from: c, reason: collision with root package name */
    public f2.e.d.a f71490c;

    /* renamed from: d, reason: collision with root package name */
    public f2.e.d.c f71491d;

    /* renamed from: e, reason: collision with root package name */
    public f2.e.d.AbstractC0730d f71492e;

    /* renamed from: f, reason: collision with root package name */
    public f2.e.d.f f71493f;

    /* renamed from: g, reason: collision with root package name */
    public byte f71494g;

    @Override // ki.f2.e.d.b
    public f2.e.d build() {
        String str;
        f2.e.d.a aVar;
        f2.e.d.c cVar;
        if (this.f71494g == 1 && (str = this.f71489b) != null && (aVar = this.f71490c) != null && (cVar = this.f71491d) != null) {
            return new w0(this.f71488a, str, aVar, cVar, this.f71492e, this.f71493f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f71494g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f71489b == null) {
            sb2.append(" type");
        }
        if (this.f71490c == null) {
            sb2.append(" app");
        }
        if (this.f71491d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setApp(f2.e.d.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null app");
        }
        this.f71490c = aVar;
        return this;
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setDevice(f2.e.d.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null device");
        }
        this.f71491d = cVar;
        return this;
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setLog(f2.e.d.AbstractC0730d abstractC0730d) {
        this.f71492e = abstractC0730d;
        return this;
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setRollouts(f2.e.d.f fVar) {
        this.f71493f = fVar;
        return this;
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setTimestamp(long j10) {
        this.f71488a = j10;
        this.f71494g = (byte) (this.f71494g | 1);
        return this;
    }

    @Override // ki.f2.e.d.b
    public f2.e.d.b setType(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f71489b = str;
        return this;
    }
}
