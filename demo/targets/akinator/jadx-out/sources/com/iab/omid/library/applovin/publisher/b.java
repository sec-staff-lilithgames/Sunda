package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f30287g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30288h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f30289i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30290j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0170b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f30292a;

        public RunnableC0170b() {
            this.f30292a = b.this.f30287g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30292a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f30288h = null;
        this.f30289i = map;
        this.f30290j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0170b(), Math.max(4000 - (this.f30288h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f30288h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f30287g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f30287g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f30287g.getSettings().setAllowContentAccess(false);
        this.f30287g.getSettings().setAllowFileAccess(false);
        this.f30287g.setWebViewClient(new a());
        a(this.f30287g);
        h.a().c(this.f30287g, this.f30290j);
        for (String str : this.f30289i.keySet()) {
            h.a().d(this.f30287g, this.f30289i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f30288h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
