package pr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f81817a;

    /* renamed from: b, reason: collision with root package name */
    public String f81818b;

    public n(String str) {
        this.f81817a = str;
    }

    public String toString() {
        if (this.f81818b == null) {
            this.f81818b = this.f81817a + " @" + Integer.toHexString(hashCode());
        }
        return this.f81818b;
    }
}
