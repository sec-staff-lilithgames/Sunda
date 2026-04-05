package bs;

import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10046c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10047d;

    public b(a aVar) {
        String str = aVar.f10041a;
        this.f10044a = str;
        this.f10045b = aVar.f10042b;
        int i10 = aVar.f10043c;
        this.f10046c = i10 == -1 ? defaultPort(str) : i10;
        this.f10047d = aVar.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f10047d.equals(this.f10047d);
    }

    public int hashCode() {
        return this.f10047d.hashCode();
    }

    public String host() {
        return this.f10045b;
    }

    public boolean isHttps() {
        return this.f10044a.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public a newBuilder() {
        a aVar = new a();
        String str = this.f10044a;
        aVar.f10041a = str;
        aVar.f10042b = this.f10045b;
        int iDefaultPort = defaultPort(str);
        int i10 = this.f10046c;
        if (i10 == iDefaultPort) {
            i10 = -1;
        }
        aVar.f10043c = i10;
        return aVar;
    }

    public int port() {
        return this.f10046c;
    }

    public String scheme() {
        return this.f10044a;
    }

    public String toString() {
        return this.f10047d;
    }
}
