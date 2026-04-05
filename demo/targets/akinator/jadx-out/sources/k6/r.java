package k6;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70627c;

    /* renamed from: d, reason: collision with root package name */
    public final q f70628d;

    public r(String str, String str2, boolean z10, q qVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f70626b = str;
        this.f70627c = str2;
        this.f70625a = z10;
        this.f70628d = qVar;
    }

    public String getSuffixPath(String str) {
        return str.replaceFirst(this.f70627c, "");
    }

    public q match(Uri uri) {
        if (uri.getScheme().equals("http") && !this.f70625a) {
            return null;
        }
        if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(this.f70626b) && uri.getPath().startsWith(this.f70627c)) {
            return this.f70628d;
        }
        return null;
    }
}
