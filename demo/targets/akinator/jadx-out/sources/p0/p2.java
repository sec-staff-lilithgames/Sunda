package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f80393a;

    public p2(String str) {
        this.f80393a = str;
    }

    public static /* synthetic */ p2 copy$default(p2 p2Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = p2Var.f80393a;
        }
        return p2Var.copy(str);
    }

    public final String component1() {
        return this.f80393a;
    }

    public final p2 copy(String str) {
        return new p2(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && kotlin.jvm.internal.e0.areEqual(this.f80393a, ((p2) obj).f80393a);
    }

    public final String getKey() {
        return this.f80393a;
    }

    public int hashCode() {
        return this.f80393a.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("OpaqueKey(key="), this.f80393a, ')');
    }
}
