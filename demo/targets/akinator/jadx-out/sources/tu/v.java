package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f87412b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f87413c;

    public v(Object obj, Object obj2) {
        this.f87412b = obj;
        this.f87413c = obj2;
    }

    public static /* synthetic */ v copy$default(v vVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = vVar.f87412b;
        }
        if ((i10 & 2) != 0) {
            obj2 = vVar.f87413c;
        }
        return vVar.copy(obj, obj2);
    }

    public final Object component1() {
        return this.f87412b;
    }

    public final Object component2() {
        return this.f87413c;
    }

    public final v copy(Object obj, Object obj2) {
        return new v(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f87412b, vVar.f87412b) && kotlin.jvm.internal.e0.areEqual(this.f87413c, vVar.f87413c);
    }

    public final Object getFirst() {
        return this.f87412b;
    }

    public final Object getSecond() {
        return this.f87413c;
    }

    public int hashCode() {
        Object obj = this.f87412b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f87413c;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "(" + this.f87412b + ", " + this.f87413c + ')';
    }
}
