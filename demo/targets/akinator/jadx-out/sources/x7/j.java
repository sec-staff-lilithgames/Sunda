package x7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f91789a;

    /* renamed from: b, reason: collision with root package name */
    public Object f91790b;

    public boolean equals(Object obj) {
        if (!(obj instanceof w3.e)) {
            return false;
        }
        w3.e eVar = (w3.e) obj;
        Object obj2 = eVar.f90368a;
        Object obj3 = this.f91789a;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = eVar.f90369b;
        Object obj5 = this.f91790b;
        if (obj4 != obj5) {
            return obj4 != null && obj4.equals(obj5);
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f91789a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f91790b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public void set(Object obj, Object obj2) {
        this.f91789a = obj;
        this.f91790b = obj2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.f91789a);
        sb2.append(" ");
        return w0.i.e(sb2, this.f91790b, "}");
    }
}
