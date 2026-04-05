package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f73288a;

    /* renamed from: b, reason: collision with root package name */
    public final a f73289b;

    public q(i0 i0Var, a aVar) {
        this.f73288a = i0Var;
        this.f73289b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            i0 i0Var = this.f73288a;
            if (i0Var != null ? i0Var.equals(h0Var.getClientType()) : h0Var.getClientType() == null) {
                a aVar = this.f73289b;
                if (aVar != null ? aVar.equals(h0Var.getAndroidClientInfo()) : h0Var.getAndroidClientInfo() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ld.h0
    public a getAndroidClientInfo() {
        return this.f73289b;
    }

    @Override // ld.h0
    public i0 getClientType() {
        return this.f73288a;
    }

    public int hashCode() {
        i0 i0Var = this.f73288a;
        int iHashCode = ((i0Var == null ? 0 : i0Var.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f73289b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f73288a + ", androidClientInfo=" + this.f73289b + "}";
    }
}
