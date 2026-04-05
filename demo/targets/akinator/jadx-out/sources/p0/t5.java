package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80492b;

    public t5(Object obj, int i10) {
        this.f80491a = obj;
        this.f80492b = i10;
    }

    public static /* synthetic */ t5 copy$default(t5 t5Var, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = t5Var.f80491a;
        }
        if ((i11 & 2) != 0) {
            i10 = t5Var.f80492b;
        }
        return t5Var.copy(obj, i10);
    }

    public final Object component1() {
        return this.f80491a;
    }

    public final int component2() {
        return this.f80492b;
    }

    public final t5 copy(Object obj, int i10) {
        return new t5(obj, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f80491a, t5Var.f80491a) && this.f80492b == t5Var.f80492b;
    }

    public final int getIndex() {
        return this.f80492b;
    }

    public final Object getParentIdentity() {
        return this.f80491a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f80492b) + (this.f80491a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb2.append(this.f80491a);
        sb2.append(", index=");
        return e3.g.m(sb2, this.f80492b, ')');
    }
}
