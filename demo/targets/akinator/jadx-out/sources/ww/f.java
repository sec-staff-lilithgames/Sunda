package ww;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f91307a;

    public f() {
        this(null);
    }

    @Override // ww.b
    public String replace(String str) {
        String property = System.getProperty(str);
        if (property != null) {
            return property;
        }
        b bVar = this.f91307a;
        if (bVar != null) {
            return bVar.replace(str);
        }
        return null;
    }

    public f(b bVar) {
        this.f91307a = bVar;
    }
}
