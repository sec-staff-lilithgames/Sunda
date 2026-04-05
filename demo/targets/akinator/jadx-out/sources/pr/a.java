package pr;

import android.text.TextUtils;
import com.apm.insight.b.El.rJqlArycrfkilN;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f81787e = new a(100, "Can't connect to server");

    /* renamed from: f, reason: collision with root package name */
    public static final a f81788f = new a(102, "Timeout reached");

    /* renamed from: g, reason: collision with root package name */
    public static final a f81789g = new a(110, "Request contains bad syntax or cannot be fulfilled");

    /* renamed from: h, reason: collision with root package name */
    public static final a f81790h = new a(109, "Server failed to fulfil an apparently valid request");

    /* renamed from: i, reason: collision with root package name */
    public static final a f81791i = new a(107, "AdRequest expired, load new one please");

    /* renamed from: j, reason: collision with root package name */
    public static final a f81792j = new a(106, "AdRequest destroyed, create new one please");

    /* renamed from: k, reason: collision with root package name */
    public static final a f81793k = new a(107, "AdResponse expired, load new one please");

    /* renamed from: l, reason: collision with root package name */
    public static final a f81794l = new a(111, "AdResponse already was shown");

    /* renamed from: m, reason: collision with root package name */
    public static final a f81795m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f81796n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f81797o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f81798p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f81799q;

    /* renamed from: r, reason: collision with root package name */
    public static final a f81800r;

    /* renamed from: a, reason: collision with root package name */
    public final int f81801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81803c;

    /* renamed from: d, reason: collision with root package name */
    public final a f81804d;

    static {
        new a(111, "Ads was already shown, load new one please");
        f81795m = new a(107, "Ads was expired, load new one please");
        f81796n = new a(106, "Ads destroyed, load new one please");
        f81797o = new a(201, "Placeholder timeout error");
        f81798p = new a(103, "No ads fill");
        f81799q = internal("Unknown error");
        f81800r = new a(103, "No bid", false, null);
    }

    public a(a aVar, int i10, String str) {
        this(aVar.getCode(), aVar.getMessage(), aVar.isTrackError(), new a(i10, str));
    }

    public static a adapter(String str) {
        return new a(200, str);
    }

    public static a adapterGetsParameter(String str) {
        return adapter(str + " not found");
    }

    public static a adapterInitialization(String str) {
        return adapter("Adapter SDK initialization error: " + str);
    }

    public static a incorrectContent(String str) {
        return new a(101, str);
    }

    public static a internal(String str) {
        return new a(108, str);
    }

    public static a notFound(String str) {
        return new a(103, o2.l(str, " not found"));
    }

    public static a throwable(String str, Throwable th2) {
        a aVar = null;
        if (th2 != null) {
            try {
                StringBuilder sb2 = new StringBuilder(th2.getClass().getName());
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                aVar = new a(-1, sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return new a(108, str, true, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f81801a != aVar.f81801a) {
            return false;
        }
        return this.f81802b.equals(aVar.f81802b);
    }

    public int getCode() {
        return this.f81801a;
    }

    public a getErrorExtension() {
        return this.f81804d;
    }

    public String getMessage() {
        return this.f81802b;
    }

    public int hashCode() {
        return this.f81802b.hashCode() + (this.f81801a * 31);
    }

    public boolean isTrackError() {
        return this.f81803c;
    }

    public String toString() {
        String str = this.f81802b;
        int i10 = this.f81801a;
        a aVar = this.f81804d;
        if (aVar == null) {
            return "(" + i10 + ") " + str;
        }
        return "(" + i10 + ") " + str + " - (" + aVar.getCode() + " - " + aVar.getMessage() + ")";
    }

    public static a adapterNotInitialized() {
        return adapter(rJqlArycrfkilN.SEXdEs);
    }

    public a(a aVar, a aVar2) {
        this(aVar.getCode(), aVar.getMessage(), aVar.isTrackError(), aVar2);
    }

    public a(int i10, String str) {
        this(i10, str, true, null);
    }

    public a(int i10, String str, boolean z10, a aVar) {
        this.f81801a = i10;
        this.f81802b = nm.j.checkIfEmpty(str, "Unknown error");
        this.f81803c = z10;
        this.f81804d = aVar;
    }
}
