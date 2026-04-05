package ir;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.applovin.impl.k9;
import io.bidmachine.media3.exoplayer.b1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.a0;
import tu.x0;
import uu.c2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h {
    public static final Set<String> extractBmCustomParams(String urlString) {
        e0.checkNotNullParameter(urlString, "urlString");
        Uri uri = p.parseUri(urlString);
        if (uri == null) {
            return c2.emptySet();
        }
        String queryParameter = uri.getQueryParameter("bmcp");
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listSplit$default = n0.split$default((CharSequence) queryParameter, new String[]{"_"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!n0.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return y0.toSet(arrayList);
    }

    public static final boolean findAndSetIntentComponent(Context context, Intent intent) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(intent, "intent");
        ComponentName componentNameFindComponentName = findComponentName(context, intent);
        if (componentNameFindComponentName == null) {
            return false;
        }
        intent.setComponent(componentNameFindComponentName);
        return true;
    }

    public static final ComponentName findComponentName(Context context, Intent intent) {
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        e0.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        ComponentName componentNameFindStoreComponentName = g.findStoreComponentName(listQueryIntentActivities);
        return componentNameFindStoreComponentName == null ? new ComponentName(listQueryIntentActivities.get(0).activityInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name) : componentNameFindStoreComponentName;
    }

    public static final boolean findEndpointAndOpenUrl(Context context, String str, d dVar) {
        e0.checkNotNullParameter(context, "<this>");
        if (str != null && str.length() != 0) {
            Context applicationContext = context.getApplicationContext();
            String validUrl = q.getValidUrl(str);
            if (validUrl != null && validUrl.length() != 0) {
                Set<String> setExtractBmCustomParams = extractBmCustomParams(validUrl);
                if (setExtractBmCustomParams.contains("lraw")) {
                    if (setExtractBmCustomParams.contains("rcp")) {
                        str = removeBmCustomParams(str);
                    }
                    return openRawUrl(context, str, dVar);
                }
                if (q.isHttpUrl(validUrl)) {
                    Executors.newSingleThreadExecutor().execute(new b1(applicationContext, 6, validUrl, dVar));
                    return true;
                }
                e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
                return openUrlWithPostback(applicationContext, validUrl, dVar);
            }
            if (dVar != null) {
                dVar.execute(Boolean.FALSE);
                return false;
            }
        } else if (dVar != null) {
            dVar.execute(Boolean.FALSE);
        }
        return false;
    }

    public static final boolean openRawUrl(Context context, String urlString, d dVar) {
        Object objM7131constructorimpl;
        x0 x0Var;
        e0.checkNotNullParameter(context, "<this>");
        e0.checkNotNullParameter(urlString, "urlString");
        Uri uri = p.parseUri(urlString);
        if (uri == null) {
            if (dVar == null) {
                return false;
            }
            dVar.execute(Boolean.FALSE);
            return false;
        }
        try {
            int i10 = tu.z.f87419c;
            context.startActivity(toIntent(uri));
            if (dVar != null) {
                dVar.execute(Boolean.TRUE);
                x0Var = x0.f87415a;
            } else {
                x0Var = null;
            }
            objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null && dVar != null) {
            dVar.execute(Boolean.FALSE);
        }
        return tu.z.m7137isSuccessimpl(objM7131constructorimpl);
    }

    public static final boolean openUrl(Context context, String str) {
        Boolean bool;
        e0.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intentUrlToIntent = g.urlToIntent(str);
            if (!g.findAndSetIntentComponent(context, intentUrlToIntent)) {
                String decodedUrl = URLDecoder.decode(str, sv.g.f86134b.name());
                e0.checkNotNullExpressionValue(decodedUrl, "decodedUrl");
                intentUrlToIntent = g.urlToIntent(decodedUrl);
                g.findAndSetIntentComponent(context, intentUrlToIntent);
            }
            context.startActivity(intentUrlToIntent);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }

    public static final boolean openUrlWithPostback(Context context, String str, d dVar) {
        e0.checkNotNullParameter(context, "<this>");
        boolean zOpenUrl = openUrl(context, str);
        n.onUiThread(new k9(dVar, zOpenUrl, 7));
        return zOpenUrl;
    }

    public static final String removeBmCustomParams(String urlString) {
        e0.checkNotNullParameter(urlString, "urlString");
        Uri uri = p.parseUri(urlString);
        if (uri == null) {
            return urlString;
        }
        String string = p.removeQueryParameters(uri, "bmcp").toString();
        e0.checkNotNullExpressionValue(string, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return string;
    }

    public static final Intent toIntent(Uri uri) {
        e0.checkNotNullParameter(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        return intent;
    }
}
