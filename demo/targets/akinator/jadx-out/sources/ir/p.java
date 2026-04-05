package ir;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p {
    public static final Uri parseUri(String str) {
        Uri validUri;
        e0.checkNotNullParameter(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            e0.checkNotNullExpressionValue(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                return uri;
            }
            if (!k0.startsWith$default(str, "/", false, 2, null) && (validUri = q.getValidUri(str)) != null) {
                String scheme2 = validUri.getScheme();
                if (scheme2 != null) {
                    e0.checkNotNullExpressionValue(scheme2, "scheme");
                    if (scheme2.length() > 0) {
                        return validUri;
                    }
                }
                String string = validUri.toString();
                e0.checkNotNullExpressionValue(string, "newUri.toString()");
                if (k0.startsWith$default(string, "/", false, 2, null)) {
                    return validUri;
                }
            }
            return uri;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri removeQueryParameters(Uri uri, String... parameterNames) {
        e0.checkNotNullParameter(uri, "<this>");
        e0.checkNotNullParameter(parameterNames, "parameterNames");
        if (parameterNames.length == 0) {
            return uri;
        }
        Set set = uu.k0.toSet(parameterNames);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        e0.checkNotNullExpressionValue(builderClearQuery, "buildUpon().clearQuery()");
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        e0.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }
}
