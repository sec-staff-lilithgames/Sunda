package com.amazon.aps.ads.util.adview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdWebViewSchemeHandler {
    private final String AMAZON_SCHEME;
    private final String MARKET_SCHEME;
    private final String MOBILE_SHOPPING_SCHEME;
    private final String MOBILE_SHOPPING_WEB_SCHEME;
    private final String MSHOP_PKG_NAME;
    private final ApsAdWebViewClientListener webviewClientListener;

    public ApsAdWebViewSchemeHandler(ApsAdWebViewClientListener webviewClientListener) {
        e0.checkNotNullParameter(webviewClientListener, "webviewClientListener");
        this.webviewClientListener = webviewClientListener;
        this.MSHOP_PKG_NAME = "com.amazon.mShop.android.shopping";
        this.MOBILE_SHOPPING_WEB_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_WEB_SCHEME;
        this.MOBILE_SHOPPING_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME;
        this.MARKET_SCHEME = ApsAdWebViewSupportClient.MARKET_SCHEME;
        this.AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;
    }

    public boolean handleMarketAndAmazonScheme(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                this.webviewClientListener.getAdViewContext().startActivity(intent);
                this.webviewClientListener.onAdLeftApplication();
                return true;
            } catch (RuntimeException unused) {
                ApsAdExtensionsKt.d(this, "App stores and browsers not found");
                return false;
            }
        } catch (ActivityNotFoundException unused2) {
            ApsUtils.Companion.directAppStoreLinkToBrowser(this.webviewClientListener.getAdViewContext(), uri);
            this.webviewClientListener.onAdLeftApplication();
            return true;
        }
    }

    public boolean handleMshopApp(String url, Uri uri) {
        int iIndexOf$default;
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (this.webviewClientListener.getAdViewContext().getPackageManager().getLaunchIntentForPackage(this.MSHOP_PKG_NAME) == null && (iIndexOf$default = n0.indexOf$default((CharSequence) url, "products/", 0, false, 6, (Object) null)) > 0) {
            String strSubstring = url.substring(iIndexOf$default + 9);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            intent.setData(Uri.parse("https://www.amazon.com/dp/" + strSubstring));
        }
        this.webviewClientListener.getAdViewContext().startActivity(intent);
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    public boolean handleMshopWeb(String url) {
        int i10;
        e0.checkNotNullParameter(url, "url");
        int iIndexOf$default = n0.indexOf$default((CharSequence) url, "//", 0, false, 6, (Object) null);
        if (iIndexOf$default < 0 || (i10 = iIndexOf$default + 2) >= url.length()) {
            return false;
        }
        String strSubstring = url.substring(i10);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.webviewClientListener.getAdViewContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(DtbConstants.HTTPS + strSubstring)));
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    public boolean launchIntent(Uri uri) {
        e0.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.webviewClientListener.getAdViewContext().startActivity(intent);
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    public final boolean openUrl(String url) {
        e0.checkNotNullParameter(url, "url");
        try {
            Uri uri = uri(url);
            if (uri == null || uri.getScheme() == null) {
                return false;
            }
            String scheme = uri.getScheme();
            if (e0.areEqual(scheme, this.MOBILE_SHOPPING_WEB_SCHEME)) {
                return handleMshopWeb(url);
            }
            if (e0.areEqual(scheme, this.MOBILE_SHOPPING_SCHEME)) {
                return handleMshopApp(url, uri);
            }
            if (!e0.areEqual(scheme, this.MARKET_SCHEME) && !e0.areEqual(scheme, this.AMAZON_SCHEME)) {
                return launchIntent(uri);
            }
            return handleMarketAndAmazonScheme(uri);
        } catch (Exception unused) {
            return false;
        }
    }

    public Uri uri(String url) {
        e0.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        e0.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }
}
