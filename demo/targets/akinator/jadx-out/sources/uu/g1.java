package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f88732a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88733b;

    public g1(int i10, Object obj) {
        this.f88732a = i10;
        this.f88733b = obj;
    }

    public static /* synthetic */ g1 copy$default(g1 g1Var, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = g1Var.f88732a;
        }
        if ((i11 & 2) != 0) {
            obj = g1Var.f88733b;
        }
        return g1Var.copy(i10, obj);
    }

    public final int component1() {
        return this.f88732a;
    }

    public final Object component2() {
        return this.f88733b;
    }

    public final g1 copy(int i10, Object obj) {
        return new g1(i10, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f88732a == g1Var.f88732a && kotlin.jvm.internal.e0.areEqual(this.f88733b, g1Var.f88733b);
    }

    public final int getIndex() {
        return this.f88732a;
    }

    public final Object getValue() {
        return this.f88733b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f88732a) * 31;
        Object obj = this.f88733b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f88732a + ", value=" + this.f88733b + ')';
    }
}
