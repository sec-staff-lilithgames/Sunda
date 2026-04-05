package com.iab.omid.library.amazon.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.internal.g;
import com.iab.omid.library.amazon.internal.h;
import com.iab.omid.library.amazon.utils.c;
import com.iab.omid.library.amazon.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f30153g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30154h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f30155i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30156j;

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

    /* renamed from: com.iab.omid.library.amazon.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0166b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f30158a;

        public RunnableC0166b() {
            this.f30158a = b.this.f30153g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30158a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f30154h = null;
        this.f30155i = map;
        this.f30156j = str2;
    }

    @Override // com.iab.omid.library.amazon.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0166b(), Math.max(4000 - (this.f30154h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f30154h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f30153g = null;
    }

    @Override // com.iab.omid.library.amazon.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f30153g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f30153g.getSettings().setAllowContentAccess(false);
        this.f30153g.getSettings().setAllowFileAccess(false);
        this.f30153g.setWebViewClient(new a());
        a(this.f30153g);
        h.a().c(this.f30153g, this.f30156j);
        for (String str : this.f30155i.keySet()) {
            h.a().c(this.f30153g, this.f30155i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f30154h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.amazon.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.amazon.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
