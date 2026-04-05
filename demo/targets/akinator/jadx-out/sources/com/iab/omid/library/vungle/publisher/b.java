package com.iab.omid.library.vungle.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.utils.c;
import com.iab.omid.library.vungle.utils.f;
import h2.rl.UeklptUrP;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f31474g;

    /* renamed from: h, reason: collision with root package name */
    private Long f31475h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f31476i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31477j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", UeklptUrP.ZlSE);
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.vungle.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0205b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f31479a;

        public RunnableC0205b() {
            this.f31479a = b.this.f31474g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31479a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f31475h = null;
        this.f31476i = map;
        this.f31477j = str2;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0205b(), Math.max(4000 - (this.f31475h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f31475h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f31474g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f31474g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f31474g.getSettings().setAllowContentAccess(false);
        this.f31474g.getSettings().setAllowFileAccess(false);
        this.f31474g.setWebViewClient(new a());
        a(this.f31474g);
        h.a().c(this.f31474g, this.f31477j);
        for (String str : this.f31476i.keySet()) {
            h.a().d(this.f31474g, this.f31476i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f31475h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
