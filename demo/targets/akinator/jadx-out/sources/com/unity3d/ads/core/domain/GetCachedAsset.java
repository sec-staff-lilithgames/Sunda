package com.unity3d.ads.core.domain;

import a.b;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import sv.n0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        e0.checkNotNullParameter(cacheRepository, "cacheRepository");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) throws IOException {
        String strSubstringAfter$default = n0.substringAfter$default(String.valueOf(uri.getPath()), "/", (String) null, 2, (Object) null);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strSubstringAfter$default);
            e0.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strSubstringAfter$default), null, inputStreamOpen);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object objM7131constructorimpl;
        String strGuessMimeType;
        StringBuilder sbS = b.s(str, '/');
        String string = uri.toString();
        e0.checkNotNullExpressionValue(string, "uri.toString()");
        sbS.append(n0.substringAfterLast$default(n0.substringBefore$default(string, "?", (String) null, 2, (Object) null), "/", (String) null, 2, (Object) null));
        String string2 = sbS.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file != null) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(new FileInputStream(file));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objM7131constructorimpl;
            if (fileInputStream != null && (strGuessMimeType = StringExtensionsKt.guessMimeType(string2)) != null && !n0.isBlank(strGuessMimeType)) {
                return new WebResourceResponse(strGuessMimeType, null, fileInputStream);
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        e0.checkNotNullParameter(uri, "uri");
        e0.checkNotNullParameter(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        File file;
        Object objM7131constructorimpl;
        String string = uri.toString();
        e0.checkNotNullExpressionValue(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) BuildersKt__BuildersKt.runBlocking$default(null, new GetCachedAsset$getCachedAsset$result$1(this, n0.substringAfterLast$default(string, "/", (String) null, 2, (Object) null), null), 1, null);
        if (!(cacheResult instanceof CacheResult.Success) || (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) == null) {
            return null;
        }
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(new FileInputStream(file));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objM7131constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        e0.checkNotNullExpressionValue(absolutePath, wHkgq.koeTUzcwkhz);
        String strGuessMimeType = StringExtensionsKt.guessMimeType(absolutePath);
        if (strGuessMimeType != null && !n0.isBlank(strGuessMimeType)) {
            return new WebResourceResponse(strGuessMimeType, null, fileInputStream);
        }
        return null;
    }
}
