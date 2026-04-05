package com.iab.omid.library.unity3d.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.internal.g;
import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f31340g;

    /* renamed from: h, reason: collision with root package name */
    private Long f31341h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f31342i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31343j;

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

    /* renamed from: com.iab.omid.library.unity3d.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0201b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f31345a;

        public RunnableC0201b() {
            this.f31345a = b.this.f31340g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31345a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f31341h = null;
        this.f31342i = map;
        this.f31343j = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0201b(), Math.max(4000 - (this.f31341h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f31341h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f31340g = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(com.iab.omid.library.unity3d.internal.f.b().a());
        this.f31340g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f31340g.getSettings().setAllowContentAccess(false);
        this.f31340g.getSettings().setAllowFileAccess(false);
        this.f31340g.setWebViewClient(new a());
        a(this.f31340g);
        g.a().c(this.f31340g, this.f31343j);
        for (String str : this.f31342i.keySet()) {
            g.a().c(this.f31340g, this.f31342i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f31341h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.unity3d.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
