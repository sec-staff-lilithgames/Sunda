package as;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final pw.l f7941d = pw.l.encodeUtf8(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e, reason: collision with root package name */
    public static final pw.l f7942e = pw.l.encodeUtf8(Header.TARGET_METHOD_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final pw.l f7943f = pw.l.encodeUtf8(Header.TARGET_PATH_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final pw.l f7944g = pw.l.encodeUtf8(Header.TARGET_SCHEME_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final pw.l f7945h = pw.l.encodeUtf8(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final pw.l f7946a;

    /* renamed from: b, reason: collision with root package name */
    public final pw.l f7947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7948c;

    static {
        pw.l.encodeUtf8(":host");
        pw.l.encodeUtf8(":version");
    }

    public e(String str, String str2) {
        this(pw.l.encodeUtf8(str), pw.l.encodeUtf8(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f7946a.equals(eVar.f7946a) && this.f7947b.equals(eVar.f7947b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7947b.hashCode() + ((this.f7946a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return w0.i.d(this.f7946a.utf8(), ": ", this.f7947b.utf8());
    }

    public e(pw.l lVar, String str) {
        this(lVar, pw.l.encodeUtf8(str));
    }

    public e(pw.l lVar, pw.l lVar2) {
        this.f7946a = lVar;
        this.f7947b = lVar2;
        this.f7948c = lVar2.size() + lVar.size() + 32;
    }
}
