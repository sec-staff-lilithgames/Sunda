package qq;

import android.content.Context;
import android.net.Uri;
import cr.r;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    void a(Context context, Uri uri, ir.d dVar);

    default void a(Context context, String url, ir.d dVar) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(url, "url");
        a(context, r.parseUrl(url), dVar);
    }

    boolean a(Uri uri);
}
