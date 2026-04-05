package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f51985b = new z();

    public static a0 chainedTransformer(a0 a0Var, a0 a0Var2) {
        return new y(a0Var, a0Var2);
    }

    public static a0 simpleTransformer(String str, String str2) {
        boolean z10 = false;
        boolean z11 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z10 = true;
        }
        return z11 ? z10 ? new v(str, str2) : new w(str) : z10 ? new x(str2) : f51985b;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
