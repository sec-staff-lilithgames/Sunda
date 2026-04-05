package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x5 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80601a;

    public x5(Object obj) {
        this.f80601a = obj;
    }

    public static /* synthetic */ x5 copy$default(x5 x5Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = x5Var.f80601a;
        }
        return x5Var.copy(obj);
    }

    public final Object component1() {
        return this.f80601a;
    }

    public final x5 copy(Object obj) {
        return new x5(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5) && kotlin.jvm.internal.e0.areEqual(this.f80601a, ((x5) obj).f80601a);
    }

    public final Object getValue() {
        return this.f80601a;
    }

    public int hashCode() {
        Object obj = this.f80601a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // p0.b6
    public Object readValue(z2 z2Var) {
        return this.f80601a;
    }

    @Override // p0.b6
    public h3 toProvided(l0 l0Var) {
        Object obj = this.f80601a;
        return new h3(l0Var, obj, obj == null, null, null, null, false);
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f80601a + ')';
    }
}
