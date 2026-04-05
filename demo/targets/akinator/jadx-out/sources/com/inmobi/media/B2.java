package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class B2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31646a = 0;

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            Uri uri = Uri.parse(str);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "Uri.parse(this)");
            return a(uri);
        }
        try {
            Uri uri2 = Uri.parse(str);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri2, "Uri.parse(this)");
            return new Intent("android.intent.action.VIEW", uri2).resolveActivity(context.getPackageManager()) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String b(Context context, C2700b8 c2700b8, String str, String str2) throws UnsupportedEncodingException {
        String stringExtra;
        if (D2.a(str)) {
            kotlin.jvm.internal.e0.checkNotNull(str);
            return a(context, c2700b8, str, (String) null);
        }
        try {
            Uri uri = Uri.parse(str2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(str2, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
                stringExtra = null;
            }
            if (kotlin.jvm.internal.e0.areEqual("intent", uri.getScheme()) && D2.a(stringExtra)) {
                String strDecode = URLDecoder.decode(stringExtra, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strDecode, "decode(...)");
                return a(context, c2700b8, strDecode, (String) null);
            }
        } catch (Exception unused2) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
        }
        return null;
    }

    public static int a(Context context, String url, ResolveInfo resolveInfo, Sb redirectionValidator, String api) throws URISyntaxException {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Intent uri = Intent.parseUri(url, 3);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "parseUri(...)");
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    uri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        uri.setFlags(268435456);
        context.startActivity(uri);
        return 0;
    }

    public static List b(Context context, String url) throws URISyntaxException {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (url.length() == 0 || context == null) {
            return uu.p0.emptyList();
        }
        Intent uri = Intent.parseUri(url, 3);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "parseUri(...)");
        List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int a(Context context, String url, Sb redirectionValidator, String api) throws URISyntaxException {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        String stringExtra = null;
        try {
            Intent uri = Intent.parseUri(url, 0);
            uri.setFlags(268435456);
            context.startActivity(uri);
            return 0;
        } catch (ActivityNotFoundException e10) {
            Uri uri2 = Uri.parse(url);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri2, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
            }
            if (kotlin.jvm.internal.e0.areEqual("intent", uri2.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e10;
        } catch (NullPointerException e11) {
            Uri uri3 = Uri.parse(url);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri3, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused2) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
            }
            if (kotlin.jvm.internal.e0.areEqual("intent", uri3.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e11;
        }
    }

    public static String a(Context context, C2700b8 redirectionValidator, String url, String str) throws URISyntaxException {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter("NATIVE", "api");
        if (context == null) {
            return null;
        }
        redirectionValidator.getClass();
        try {
            Intent uri = Intent.parseUri(url, 0);
            if (uri.resolveActivity(context.getPackageManager()) != null) {
                uri.setFlags(268435456);
                context.startActivity(uri);
                return url;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
            return b(context, redirectionValidator, str, url);
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("B2", "TAG");
            return b(context, redirectionValidator, str, url);
        }
    }

    public static boolean a(Uri uri) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
        return kotlin.jvm.internal.e0.areEqual("http", uri.getScheme()) || kotlin.jvm.internal.e0.areEqual(HttpRequest.DEFAULT_SCHEME, uri.getScheme());
    }

    public static boolean a(String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "Uri.parse(this)");
        return (!a(uri) || kotlin.jvm.internal.e0.areEqual("play.google.com", uri.getHost()) || kotlin.jvm.internal.e0.areEqual("market.android.com", uri.getHost()) || kotlin.jvm.internal.e0.areEqual(ApsAdWebViewSupportClient.MARKET_SCHEME, uri.getScheme())) ? false : true;
    }
}
