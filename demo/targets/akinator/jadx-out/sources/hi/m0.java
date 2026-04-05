package hi;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58847b;

    public m0(String str, String str2) {
        this.f58846a = str;
        this.f58847b = str2;
    }

    public static /* synthetic */ m0 copy$default(m0 m0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = m0Var.f58846a;
        }
        if ((i10 & 2) != 0) {
            str2 = m0Var.f58847b;
        }
        return m0Var.copy(str, str2);
    }

    public final String component1() {
        return this.f58846a;
    }

    public final String component2() {
        return this.f58847b;
    }

    public final m0 copy(String str, String str2) {
        return new m0(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f58846a, m0Var.f58846a) && kotlin.jvm.internal.e0.areEqual(this.f58847b, m0Var.f58847b);
    }

    public final String getAuthToken() {
        return this.f58847b;
    }

    public final String getFid() {
        return this.f58846a;
    }

    public int hashCode() {
        String str = this.f58846a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58847b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f58846a);
        sb2.append(", authToken=");
        return o2.q(sb2, this.f58847b, ')');
    }
}
