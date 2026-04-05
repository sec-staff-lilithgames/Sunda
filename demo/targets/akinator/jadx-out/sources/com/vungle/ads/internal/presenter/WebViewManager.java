package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewManager {
    private static final String TAG = "WebViewManager";
    public static final WebViewManager INSTANCE = new WebViewManager();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WebViewEntry {
        private final WebView webView;
        private final VungleWebClient webViewClient;

        public WebViewEntry(WebView webView, VungleWebClient webViewClient) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        public final WebView component1() {
            return this.webView;
        }

        public final VungleWebClient component2() {
            return this.webViewClient;
        }

        public final WebViewEntry copy(WebView webView, VungleWebClient webViewClient) {
            e0.checkNotNullParameter(webView, "webView");
            e0.checkNotNullParameter(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) obj;
            return e0.areEqual(this.webView, webViewEntry.webView) && e0.areEqual(this.webViewClient, webViewEntry.webViewClient);
        }

        public final WebView getWebView() {
            return this.webView;
        }

        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return this.webViewClient.hashCode() + (this.webView.hashCode() * 31);
        }

        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(String key) {
        e0.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final WebView getOrCreateWebView(Context context, String str) {
        WebView webView;
        e0.checkNotNullParameter(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(str);
            if (webViewEntry != null) {
                Logger.Companion.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.Companion.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            reentrantLock.unlock();
            return webView;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final VungleWebClient getOrCreateWebViewClient(AdPayload advertisement, Placement placement, VungleThreadPoolExecutor offloadExecutor, Platform platform) {
        e0.checkNotNullParameter(advertisement, "advertisement");
        e0.checkNotNullParameter(placement, "placement");
        e0.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        e0.checkNotNullParameter(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            reentrantLock.unlock();
            return webViewClient;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void preloadWebView$vungle_ads_release(Context context, AdPayload adv, Placement placement, String templatePath, AdPayload.WebViewSettings webViewSettings, PreloadDelegate delegate, Long l9) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adv, "adv");
        e0.checkNotNullParameter(placement, "placement");
        e0.checkNotNullParameter(templatePath, "templatePath");
        e0.checkNotNullParameter(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.Companion;
            StringBuilder sb2 = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            companion.d(TAG, sb2.toString());
            String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new WebViewManager$preloadWebView$1$1(context, adv, placement, delegate, l9, templatePath, strEventId, webViewSettings));
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
