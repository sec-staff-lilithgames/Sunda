package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f87371b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f87372c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f87373e;

    public d0(Object obj, Object obj2, Object obj3) {
        this.f87371b = obj;
        this.f87372c = obj2;
        this.f87373e = obj3;
    }

    public static /* synthetic */ d0 copy$default(d0 d0Var, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = d0Var.f87371b;
        }
        if ((i10 & 2) != 0) {
            obj2 = d0Var.f87372c;
        }
        if ((i10 & 4) != 0) {
            obj3 = d0Var.f87373e;
        }
        return d0Var.copy(obj, obj2, obj3);
    }

    public final Object component1() {
        return this.f87371b;
    }

    public final Object component2() {
        return this.f87372c;
    }

    public final Object component3() {
        return this.f87373e;
    }

    public final d0 copy(Object obj, Object obj2, Object obj3) {
        return new d0(obj, obj2, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f87371b, d0Var.f87371b) && kotlin.jvm.internal.e0.areEqual(this.f87372c, d0Var.f87372c) && kotlin.jvm.internal.e0.areEqual(this.f87373e, d0Var.f87373e);
    }

    public final Object getFirst() {
        return this.f87371b;
    }

    public final Object getSecond() {
        return this.f87372c;
    }

    public final Object getThird() {
        return this.f87373e;
    }

    public int hashCode() {
        Object obj = this.f87371b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f87372c;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f87373e;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.f87371b + ", " + this.f87372c + ", " + this.f87373e + ')';
    }
}
