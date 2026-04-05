package mv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final double f74956a = Math.log(2.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final double f74957b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f74958c;

    /* renamed from: d, reason: collision with root package name */
    public static final double f74959d;

    /* renamed from: e, reason: collision with root package name */
    public static final double f74960e;

    static {
        double dSqrt = Math.sqrt(Math.ulp(1.0d));
        f74957b = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f74958c = dSqrt2;
        double d10 = 1;
        f74959d = d10 / dSqrt;
        f74960e = d10 / dSqrt2;
    }
}
