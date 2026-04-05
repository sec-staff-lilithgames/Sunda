package ki;

import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b2 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final h2.a f71156a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.c f71157b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.b f71158c;

    public b2(h2.a aVar, h2.c cVar, h2.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f71156a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f71157b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f71158c = bVar;
    }

    @Override // ki.h2
    public h2.a appData() {
        return this.f71156a;
    }

    @Override // ki.h2
    public h2.b deviceData() {
        return this.f71158c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            h2 h2Var = (h2) obj;
            if (this.f71156a.equals(h2Var.appData()) && this.f71157b.equals(h2Var.osData()) && this.f71158c.equals(h2Var.deviceData())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f71156a.hashCode() ^ 1000003) * 1000003) ^ this.f71157b.hashCode()) * 1000003) ^ this.f71158c.hashCode();
    }

    @Override // ki.h2
    public h2.c osData() {
        return this.f71157b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f71156a + ", osData=" + this.f71157b + ", deviceData=" + this.f71158c + "}";
    }
}
