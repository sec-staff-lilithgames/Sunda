package l6;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewCookieManagerBoundaryInterface f72506a;

    public v(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f72506a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> getCookieInfo(String str) {
        return this.f72506a.getCookieInfo(str);
    }
}
