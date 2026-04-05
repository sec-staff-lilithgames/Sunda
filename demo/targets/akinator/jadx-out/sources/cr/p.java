package cr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f50922a;

    /* renamed from: b, reason: collision with root package name */
    public String f50923b;

    public p(String str) {
        this.f50922a = str;
    }

    public String toString() {
        if (this.f50923b == null) {
            this.f50923b = this.f50922a + " @" + Integer.toHexString(hashCode());
        }
        return this.f50923b;
    }
}
