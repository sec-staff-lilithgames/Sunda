package b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final String f8733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8734c;

    /* renamed from: e, reason: collision with root package name */
    public final String f8735e;

    public i(String str, c cVar) {
        super(str);
        this.f8733b = str;
        if (cVar != null) {
            this.f8735e = cVar.c();
            this.f8734c = cVar.getLine();
        } else {
            this.f8735e = "unknown";
            this.f8734c = 0;
        }
    }

    public String reason() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8733b);
        sb2.append(" (");
        sb2.append(this.f8735e);
        sb2.append(" at line ");
        return a.b.f(this.f8734c, ")", sb2);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
