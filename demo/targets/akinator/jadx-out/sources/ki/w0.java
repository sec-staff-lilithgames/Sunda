package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w0 extends f2.e.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f71499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71500b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.e.d.a f71501c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.e.d.c f71502d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.e.d.AbstractC0730d f71503e;

    /* renamed from: f, reason: collision with root package name */
    public final f2.e.d.f f71504f;

    public w0(long j10, String str, f2.e.d.a aVar, f2.e.d.c cVar, f2.e.d.AbstractC0730d abstractC0730d, f2.e.d.f fVar) {
        this.f71499a = j10;
        this.f71500b = str;
        this.f71501c = aVar;
        this.f71502d = cVar;
        this.f71503e = abstractC0730d;
        this.f71504f = fVar;
    }

    public boolean equals(Object obj) {
        f2.e.d.AbstractC0730d abstractC0730d;
        f2.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d) {
            f2.e.d dVar = (f2.e.d) obj;
            if (this.f71499a == dVar.getTimestamp() && this.f71500b.equals(dVar.getType()) && this.f71501c.equals(dVar.getApp()) && this.f71502d.equals(dVar.getDevice()) && ((abstractC0730d = this.f71503e) != null ? abstractC0730d.equals(dVar.getLog()) : dVar.getLog() == null) && ((fVar = this.f71504f) != null ? fVar.equals(dVar.getRollouts()) : dVar.getRollouts() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d
    public f2.e.d.a getApp() {
        return this.f71501c;
    }

    @Override // ki.f2.e.d
    public f2.e.d.c getDevice() {
        return this.f71502d;
    }

    @Override // ki.f2.e.d
    public f2.e.d.AbstractC0730d getLog() {
        return this.f71503e;
    }

    @Override // ki.f2.e.d
    public f2.e.d.f getRollouts() {
        return this.f71504f;
    }

    @Override // ki.f2.e.d
    public long getTimestamp() {
        return this.f71499a;
    }

    @Override // ki.f2.e.d
    public String getType() {
        return this.f71500b;
    }

    public int hashCode() {
        long j10 = this.f71499a;
        int iHashCode = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f71500b.hashCode()) * 1000003) ^ this.f71501c.hashCode()) * 1000003) ^ this.f71502d.hashCode()) * 1000003;
        f2.e.d.AbstractC0730d abstractC0730d = this.f71503e;
        int iHashCode2 = (iHashCode ^ (abstractC0730d == null ? 0 : abstractC0730d.hashCode())) * 1000003;
        f2.e.d.f fVar = this.f71504f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    @Override // ki.f2.e.d
    public f2.e.d.b toBuilder() {
        v0 v0Var = new v0();
        v0Var.f71488a = getTimestamp();
        v0Var.f71489b = getType();
        v0Var.f71490c = getApp();
        v0Var.f71491d = getDevice();
        v0Var.f71492e = getLog();
        v0Var.f71493f = getRollouts();
        v0Var.f71494g = (byte) 1;
        return v0Var;
    }

    public String toString() {
        return "Event{timestamp=" + this.f71499a + ", type=" + this.f71500b + ", app=" + this.f71501c + ", device=" + this.f71502d + ", log=" + this.f71503e + ", rollouts=" + this.f71504f + "}";
    }
}
