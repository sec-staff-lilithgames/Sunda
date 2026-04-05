package nm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f77032a = false;

    /* renamed from: b, reason: collision with root package name */
    public static volatile sr.c f77033b = new sr.a("BidMachineLog");

    /* renamed from: c, reason: collision with root package name */
    public static volatile sr.c f77034c = new sr.b();

    /* renamed from: d, reason: collision with root package name */
    public static volatile sr.c f77035d = f77034c;

    public static void d(Object obj, String str) {
        f77035d.d(obj, str);
    }

    public static void e(Object obj, String str) {
        f77035d.e(obj, str);
    }

    public static boolean isLoggingEnabled() {
        return f77032a;
    }

    public static void setDisabledInstance(sr.c cVar) {
        f77034c = cVar;
        setLoggingEnabled(f77032a);
    }

    public static void setEnabledInstance(sr.c cVar) {
        f77033b = cVar;
        setLoggingEnabled(f77032a);
    }

    public static void setLoggingEnabled(boolean z10) {
        f77032a = z10;
        f77035d = z10 ? f77033b : f77034c;
    }

    public static void w(Object obj, String str) {
        f77035d.w(obj, str);
    }

    public static void d(String str) {
        f77035d.d(str);
    }

    public static void e(String str) {
        f77035d.e(str);
    }

    public static void w(String str) {
        f77035d.w(str);
    }

    public static void d(Object obj, rr.b bVar) {
        f77035d.d(obj, bVar);
    }

    public static void e(Object obj, rr.b bVar) {
        f77035d.e(obj, bVar);
    }

    public static void w(Throwable th2) {
        f77035d.w(th2);
    }

    public static void d(rr.b bVar) {
        f77035d.d(bVar);
    }

    public static void e(rr.b bVar) {
        f77035d.e(bVar);
    }
}
