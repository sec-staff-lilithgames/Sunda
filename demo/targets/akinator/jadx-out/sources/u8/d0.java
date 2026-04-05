package u8;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f88066a;

    public d0(String str) {
        this.f88066a = str;
    }

    @Override // u8.b0
    public String buildHeader() {
        return this.f88066a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f88066a.equals(((d0) obj).f88066a);
        }
        return false;
    }

    public int hashCode() {
        return this.f88066a.hashCode();
    }

    public String toString() {
        return o2.o(new StringBuilder("StringHeaderFactory{value='"), this.f88066a, "'}");
    }
}
