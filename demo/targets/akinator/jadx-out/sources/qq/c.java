package qq;

import android.content.Context;
import android.net.Uri;
import cr.q;
import dq.a0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tm.n;
import tm.w;
import um.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final w f83482a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f83483b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public c(w mraidNativeFeatureUrlParser, a0 intentLauncher) {
        e0.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        e0.checkNotNullParameter(intentLauncher, "intentLauncher");
        this.f83482a = mraidNativeFeatureUrlParser;
        this.f83483b = intentLauncher;
    }

    @Override // qq.b
    public /* bridge */ /* synthetic */ void a(Context context, String str, ir.d dVar) {
        super.a(context, str, dVar);
    }

    @Override // qq.b
    public boolean a(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        return e0.areEqual("calendar", uri.getScheme());
    }

    @Override // qq.b
    public void a(Context context, Uri uri, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uri, "uri");
        n calendarEvent = this.f83482a.parseCalendarEvent(uri);
        if (calendarEvent == null) {
            j.e("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
            q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        } else {
            this.f83483b.a(context, calendarEvent, dVar);
        }
    }
}
