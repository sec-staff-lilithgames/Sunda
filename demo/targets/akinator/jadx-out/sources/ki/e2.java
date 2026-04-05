package ki;

import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e2 extends h2.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f71239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71241c;

    public e2(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f71239a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f71240b = str2;
        this.f71241c = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2.c) {
            h2.c cVar = (h2.c) obj;
            if (this.f71239a.equals(cVar.osRelease()) && this.f71240b.equals(cVar.osCodeName()) && this.f71241c == cVar.isRooted()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f71239a.hashCode() ^ 1000003) * 1000003) ^ this.f71240b.hashCode()) * 1000003) ^ (this.f71241c ? 1231 : 1237);
    }

    @Override // ki.h2.c
    public boolean isRooted() {
        return this.f71241c;
    }

    @Override // ki.h2.c
    public String osCodeName() {
        return this.f71240b;
    }

    @Override // ki.h2.c
    public String osRelease() {
        return this.f71239a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f71239a);
        sb2.append(", osCodeName=");
        sb2.append(this.f71240b);
        sb2.append(", isRooted=");
        return a.b.q(sb2, this.f71241c, "}");
    }
}
