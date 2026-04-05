package bk;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f9701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9702b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f9701a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9702b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f9701a.equals(fVar.getLibraryName()) && this.f9702b.equals(fVar.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // bk.f
    public String getLibraryName() {
        return this.f9701a;
    }

    @Override // bk.f
    public String getVersion() {
        return this.f9702b;
    }

    public int hashCode() {
        return ((this.f9701a.hashCode() ^ 1000003) * 1000003) ^ this.f9702b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f9701a);
        sb2.append(", version=");
        return o2.o(sb2, this.f9702b, "}");
    }
}
