package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80493a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f80494b;

    public u1(Object obj, Object obj2) {
        this.f80493a = obj;
        this.f80494b = obj2;
    }

    public static /* synthetic */ u1 copy$default(u1 u1Var, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = u1Var.f80493a;
        }
        if ((i10 & 2) != 0) {
            obj2 = u1Var.f80494b;
        }
        return u1Var.copy(obj, obj2);
    }

    public final Object component1() {
        return this.f80493a;
    }

    public final Object component2() {
        return this.f80494b;
    }

    public final u1 copy(Object obj, Object obj2) {
        return new u1(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f80493a, u1Var.f80493a) && kotlin.jvm.internal.e0.areEqual(this.f80494b, u1Var.f80494b);
    }

    public final Object getLeft() {
        return this.f80493a;
    }

    public final Object getRight() {
        return this.f80494b;
    }

    public int hashCode() {
        Object obj = this.f80493a;
        int iHashCode = 0;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f80494b;
        if (obj2 instanceof Enum) {
            iHashCode = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return iHashCode + iOrdinal;
    }

    public String toString() {
        return "JoinedKey(left=" + this.f80493a + ", right=" + this.f80494b + ')';
    }
}
