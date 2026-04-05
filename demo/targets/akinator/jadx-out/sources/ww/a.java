package ww;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f91303a;

    public a() {
        this(null);
    }

    @Override // ww.b
    public String replace(String str) {
        String str2 = System.getenv(str);
        if (str2 != null) {
            return str2;
        }
        b bVar = this.f91303a;
        if (bVar != null) {
            return bVar.replace(str);
        }
        return null;
    }

    public a(b bVar) {
        this.f91303a = bVar;
    }
}
