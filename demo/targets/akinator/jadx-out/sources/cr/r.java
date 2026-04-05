package cr;

import android.content.Context;
import android.net.Uri;
import cr.f;
import dq.a0;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.k0;
import tm.w;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f50925a;

    /* renamed from: b, reason: collision with root package name */
    public static final qq.c f50926b;

    /* renamed from: c, reason: collision with root package name */
    public static final qq.d f50927c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f50928d;

    static {
        a0 a0Var = new a0();
        f50925a = a0Var;
        w wVar = new w();
        io.bidmachine.rendering.internal.r rVar = new io.bidmachine.rendering.internal.r();
        qq.c cVar = new qq.c(wVar, a0Var);
        f50926b = cVar;
        qq.d dVar = new qq.d(wVar, rVar);
        f50927c = dVar;
        f50928d = p0.listOf((Object[]) new qq.b[]{cVar, dVar, new qq.a()});
    }

    public static final void openBrowser(Context context, Uri uri, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uri, "uri");
        f50925a.a(context, uri, dVar);
    }

    public static final void openCalendar(Context context, String url, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(url, "url");
        f50926b.a(context, url, dVar);
    }

    public static final void openUrl(Context context, String url, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(url, "url");
        Uri url2 = parseUrl(url);
        for (qq.b bVar : f50928d) {
            if (bVar.a(url2)) {
                bVar.a(context, url2, dVar);
                return;
            }
        }
        openBrowser(context, url2, dVar);
    }

    public static final Uri parseUrl(String url) {
        Uri validUri;
        e0.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        e0.checkNotNullExpressionValue(uri, "parse(url)");
        String scheme = uri.getScheme();
        if ((scheme == null || scheme.length() == 0) && !k0.startsWith$default(url, "/", false, 2, null) && (validUri = ir.q.getValidUri(url)) != null) {
            String scheme2 = validUri.getScheme();
            if (scheme2 == null || scheme2.length() <= 0) {
                String string = validUri.toString();
                e0.checkNotNullExpressionValue(string, "newUri.toString()");
                if (k0.startsWith$default(string, "/", false, 2, null)) {
                }
            }
            return validUri;
        }
        return uri;
    }

    public static final void storePicture(Context context, String url, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(url, "url");
        f50927c.a(context, url, dVar);
    }

    public static final void track$bidmachine_android_sdk_bi_3_4_0(String str) {
        String validUrl = ir.q.getValidUrl(str);
        if (validUrl == null || validUrl.length() <= 0) {
            return;
        }
        new f.a(validUrl, i.Get).setUserAgent(zp.a.getUserAgent()).send();
    }

    public static /* synthetic */ void getSUPPORTED_DEEPLINK_PROCESSORS$annotations() {
    }
}
