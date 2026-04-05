package com.iab.omid.library.mmadbridge.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.internal.g;
import com.iab.omid.library.mmadbridge.internal.h;
import com.iab.omid.library.mmadbridge.utils.c;
import com.iab.omid.library.mmadbridge.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f31094g;

    /* renamed from: h, reason: collision with root package name */
    private Long f31095h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f31096i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31097j;

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

    /* renamed from: com.iab.omid.library.mmadbridge.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0194b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f31099a;

        public RunnableC0194b() {
            this.f31099a = b.this.f31094g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31099a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f31095h = null;
        this.f31096i = map;
        this.f31097j = str2;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0194b(), Math.max(4000 - (this.f31095h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f31095h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f31094g = null;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f31094g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f31094g.getSettings().setAllowContentAccess(false);
        this.f31094g.getSettings().setAllowFileAccess(false);
        this.f31094g.setWebViewClient(new a());
        a(this.f31094g);
        h.a().c(this.f31094g, this.f31097j);
        for (String str : this.f31096i.keySet()) {
            h.a().d(this.f31094g, this.f31096i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f31095h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
