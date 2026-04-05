package qq;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import cr.q;
import cr.r;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import um.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements qq.b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: qq.a$a, reason: collision with other inner class name */
    public static final class C0771a {
        public C0771a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ir.d {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f83477b;

        /* renamed from: c, reason: collision with root package name */
        public final ir.d f83478c;

        public b(Uri baseUri, ir.d dVar) {
            e0.checkNotNullParameter(baseUri, "baseUri");
            this.f83477b = baseUri;
            this.f83478c = dVar;
        }

        public void a(boolean z10) {
            if (z10) {
                r.track$bidmachine_android_sdk_bi_3_4_0(this.f83477b.getQueryParameter("fallbackTrackingUrl"));
            }
            q.onUiThreadWithArgSafely(Boolean.valueOf(z10), this.f83478c);
        }

        @Override // ir.d
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // ir.d
        public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
            return super.executeSafely(obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements ir.d {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f83479b;

        /* renamed from: c, reason: collision with root package name */
        public final ir.d f83480c;

        /* renamed from: e, reason: collision with root package name */
        public final Context f83481e;

        public void a(boolean z10) {
            Uri uri = this.f83479b;
            ir.d dVar = this.f83480c;
            if (z10) {
                r.track$bidmachine_android_sdk_bi_3_4_0(uri.getQueryParameter("primaryTrackingUrl"));
                q.onUiThreadWithArgSafely(Boolean.TRUE, dVar);
                return;
            }
            String queryParameter = uri.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
                return;
            }
            Uri validUri = ir.q.getValidUri(queryParameter);
            if (validUri == null) {
                q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
            } else {
                r.openBrowser(this.f83481e, validUri, new b(uri, dVar));
            }
        }

        @Override // ir.d
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // ir.d
        public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
            return super.executeSafely(obj);
        }

        public c(Context context, Uri uri, ir.d dVar) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(uri, KGUkpTlXZlJLy.IysXqB);
            this.f83479b = uri;
            this.f83480c = dVar;
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f83481e = applicationContext;
        }
    }

    static {
        new C0771a(null);
    }

    @Override // qq.b
    public /* bridge */ /* synthetic */ void a(Context context, String str, ir.d dVar) {
        super.a(context, str, dVar);
    }

    @Override // qq.b
    public boolean a(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        return e0.areEqual("bmlink", uri.getScheme());
    }

    @Override // qq.b
    public void a(Context context, Uri uri, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (TextUtils.isEmpty(queryParameter)) {
            j.e("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
            return;
        }
        Uri validUri = ir.q.getValidUri(queryParameter);
        if (validUri == null) {
            j.e("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        } else {
            r.openBrowser(context, validUri, new c(context, uri, dVar));
        }
    }
}
