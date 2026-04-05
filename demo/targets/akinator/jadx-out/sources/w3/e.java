package w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f90368a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90369b;

    public e(Object obj, Object obj2) {
        this.f90368a = obj;
        this.f90369b = obj2;
    }

    public static <A, B> e create(A a10, B b10) {
        return new e(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.equals(eVar.f90368a, this.f90368a) && d.equals(eVar.f90369b, this.f90369b);
    }

    public int hashCode() {
        Object obj = this.f90368a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f90369b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.f90368a);
        sb2.append(" ");
        return w0.i.e(sb2, this.f90369b, "}");
    }
}
