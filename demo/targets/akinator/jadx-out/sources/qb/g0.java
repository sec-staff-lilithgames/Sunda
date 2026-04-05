package qb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f82690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82691b;

    public g0(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f82690a = key;
        this.f82691b = value;
    }

    public static /* synthetic */ g0 copy$default(g0 g0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g0Var.f82690a;
        }
        if ((i10 & 2) != 0) {
            str2 = g0Var.f82691b;
        }
        return g0Var.copy(str, str2);
    }

    public final String component1() {
        return this.f82690a;
    }

    public final String component2() {
        return this.f82691b;
    }

    public final g0 copy(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        return new g0(key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f82690a, g0Var.f82690a) && kotlin.jvm.internal.e0.areEqual(this.f82691b, g0Var.f82691b);
    }

    public final String getKey() {
        return this.f82690a;
    }

    public final String getValue() {
        return this.f82691b;
    }

    public int hashCode() {
        return this.f82691b.hashCode() + (this.f82690a.hashCode() * 31);
    }

    public String toString() {
        return "\t" + this.f82690a + " : " + this.f82691b;
    }
}
