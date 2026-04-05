package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3892b;

    public y4(String name, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f3891a = name;
        this.f3892b = obj;
    }

    public static /* synthetic */ y4 copy$default(y4 y4Var, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = y4Var.f3891a;
        }
        if ((i10 & 2) != 0) {
            obj = y4Var.f3892b;
        }
        return y4Var.copy(str, obj);
    }

    public final String component1() {
        return this.f3891a;
    }

    public final Object component2() {
        return this.f3892b;
    }

    public final y4 copy(String name, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return new y4(name, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f3891a, y4Var.f3891a) && kotlin.jvm.internal.e0.areEqual(this.f3892b, y4Var.f3892b);
    }

    public final String getName() {
        return this.f3891a;
    }

    public final Object getValue() {
        return this.f3892b;
    }

    public int hashCode() {
        int iHashCode = this.f3891a.hashCode() * 31;
        Object obj = this.f3892b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f3891a + ", value=" + this.f3892b + ')';
    }
}
