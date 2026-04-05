package qq;

import android.content.Context;
import android.net.Uri;
import cr.q;
import io.bidmachine.rendering.internal.r;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tm.w;
import um.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final w f83484a;

    /* renamed from: b, reason: collision with root package name */
    public final r f83485b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public d(w mraidNativeFeatureUrlParser, r pictureDownloader) {
        e0.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        e0.checkNotNullParameter(pictureDownloader, "pictureDownloader");
        this.f83484a = mraidNativeFeatureUrlParser;
        this.f83485b = pictureDownloader;
    }

    @Override // qq.b
    public /* bridge */ /* synthetic */ void a(Context context, String str, ir.d dVar) {
        super.a(context, str, dVar);
    }

    @Override // qq.b
    public boolean a(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        return e0.areEqual("storePicture", uri.getScheme());
    }

    @Override // qq.b
    public void a(Context context, Uri uri, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uri, "uri");
        Uri storePictureUri = this.f83484a.parseStorePictureUri(uri);
        if (storePictureUri == null) {
            j.e("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        } else {
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f83485b.a(applicationContext, storePictureUri, dVar);
        }
    }
}
