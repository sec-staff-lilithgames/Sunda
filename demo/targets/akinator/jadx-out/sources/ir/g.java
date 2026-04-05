package ir;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {
    public static final boolean findAndSetIntentComponent(Context context, Intent intent) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(intent, "intent");
        return h.findAndSetIntentComponent(context, intent);
    }

    public static final ComponentName findComponentName(Context context, Intent intent) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(intent, "intent");
        return h.findComponentName(context, intent);
    }

    public static final boolean findEndpointAndOpenUrl(Context context, String str, d dVar) {
        e0.checkNotNullParameter(context, "context");
        return h.findEndpointAndOpenUrl(context, str, dVar);
    }

    public static final ComponentName findStoreComponentName(List<? extends ResolveInfo> resolveInfoList) {
        Object next;
        e0.checkNotNullParameter(resolveInfoList, "resolveInfoList");
        Iterator<T> it = resolveInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((ResolveInfo) next).activityInfo.packageName, "com.android.vending")) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static final boolean openUrl(Context context, String str) {
        e0.checkNotNullParameter(context, "context");
        return h.openUrl(context, str);
    }

    public static final Intent uriToIntent(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        return h.toIntent(uri);
    }

    public static final Intent urlToIntent(String url) {
        e0.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        e0.checkNotNullExpressionValue(uri, "parse(url)");
        return uriToIntent(uri);
    }
}
