package dx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f52934a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f52935b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f52936c;

    static {
        new a(null);
    }

    public a(String str) {
        this(str, null, null);
    }

    public Object[] getArgArray() {
        return this.f52936c;
    }

    public String getMessage() {
        return this.f52934a;
    }

    public Throwable getThrowable() {
        return this.f52935b;
    }

    public a(String str, Object[] objArr, Throwable th2) {
        this.f52934a = str;
        this.f52935b = th2;
        this.f52936c = objArr;
    }
}
