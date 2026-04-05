package s4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f0 extends k {

    /* renamed from: k, reason: collision with root package name */
    public static final a f85388k = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        public Typeface buildTypeface(Context context, u3.o oVar) throws PackageManager.NameNotFoundException {
            return u3.q.buildTypeface(context, null, new u3.o[]{oVar});
        }

        public u3.n fetchFonts(Context context, u3.g gVar) throws PackageManager.NameNotFoundException {
            return u3.q.fetchFonts(context, null, gVar);
        }

        public void registerObserver(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract long getRetryDelay();
    }

    public f0(Context context, u3.g gVar) {
        super(new i0(context, gVar, f85388k));
    }

    @Deprecated
    public f0 setHandler(Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(new androidx.browser.customtabs.i(handler, 0));
        return this;
    }

    public f0 setLoadingExecutor(Executor executor) {
        ((i0) this.f85410a).setExecutor(executor);
        return this;
    }

    public f0 setRetryPolicy(b bVar) {
        ((i0) this.f85410a).setRetryPolicy(bVar);
        return this;
    }

    public f0(Context context, u3.g gVar, a aVar) {
        super(new i0(context, gVar, aVar));
    }
}
