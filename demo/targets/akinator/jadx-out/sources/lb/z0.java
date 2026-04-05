package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static z0 f73057c;

    /* renamed from: a, reason: collision with root package name */
    public c f73058a;

    /* renamed from: b, reason: collision with root package name */
    public String f73059b;

    public static z0 getInstance() {
        if (f73057c == null) {
            z0 z0Var = new z0();
            z0Var.f73058a = null;
            z0Var.f73059b = null;
            f73057c = z0Var;
        }
        return f73057c;
    }

    public c getLastInstanceSelected() {
        return this.f73058a;
    }

    public String getLastWSUrlTried() {
        return this.f73059b;
    }
}
