package com.iab.omid.library.inmobi.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f30824g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30825h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f30826i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30827j;

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

    /* renamed from: com.iab.omid.library.inmobi.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0186b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f30829a;

        public RunnableC0186b() {
            this.f30829a = b.this.f30824g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30829a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f30825h = null;
        this.f30826i = map;
        this.f30827j = str2;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0186b(), Math.max(4000 - (this.f30825h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f30825h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f30824g = null;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f30824g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f30824g.getSettings().setAllowContentAccess(false);
        this.f30824g.getSettings().setAllowFileAccess(false);
        this.f30824g.setWebViewClient(new a());
        a(this.f30824g);
        h.a().c(this.f30824g, this.f30827j);
        for (String str : this.f30826i.keySet()) {
            h.a().d(this.f30824g, this.f30826i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f30825h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
