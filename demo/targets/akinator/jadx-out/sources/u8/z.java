package u8;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z implements n8.q {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f88143b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f88144c;

    /* renamed from: d, reason: collision with root package name */
    public final String f88145d;

    /* renamed from: e, reason: collision with root package name */
    public String f88146e;

    /* renamed from: f, reason: collision with root package name */
    public URL f88147f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f88148g;

    /* renamed from: h, reason: collision with root package name */
    public int f88149h;

    public z(URL url) {
        this(url, a0.f88052a);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f88146e)) {
            String string = this.f88145d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) j9.q.checkNotNull(this.f88144c)).toString();
            }
            this.f88146e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f88146e;
    }

    @Override // n8.q
    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (getCacheKey().equals(zVar.getCacheKey()) && this.f88143b.equals(zVar.f88143b)) {
                return true;
            }
        }
        return false;
    }

    public String getCacheKey() {
        String str = this.f88145d;
        return str != null ? str : ((URL) j9.q.checkNotNull(this.f88144c)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.f88143b.getHeaders();
    }

    @Override // n8.q
    public int hashCode() {
        if (this.f88149h == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.f88149h = iHashCode;
            this.f88149h = this.f88143b.hashCode() + (iHashCode * 31);
        }
        return this.f88149h;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return a();
    }

    public URL toURL() throws MalformedURLException {
        if (this.f88147f == null) {
            this.f88147f = new URL(a());
        }
        return this.f88147f;
    }

    @Override // n8.q
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.f88148g == null) {
            this.f88148g = getCacheKey().getBytes(n8.q.f75849a);
        }
        messageDigest.update(this.f88148g);
    }

    public z(String str) {
        this(str, a0.f88052a);
    }

    public z(URL url, a0 a0Var) {
        this.f88144c = (URL) j9.q.checkNotNull(url);
        this.f88145d = null;
        this.f88143b = (a0) j9.q.checkNotNull(a0Var);
    }

    public z(String str, a0 a0Var) {
        this.f88144c = null;
        this.f88145d = j9.q.checkNotEmpty(str);
        this.f88143b = (a0) j9.q.checkNotNull(a0Var);
    }
}
