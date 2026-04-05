package com.iab.omid.library.bytedance2.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f30553g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30554h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f30555i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30556j;

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

    /* renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0178b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f30558a;

        public RunnableC0178b() {
            this.f30558a = b.this.f30553g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30558a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f30554h = null;
        this.f30555i = map;
        this.f30556j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0178b(), Math.max(4000 - (this.f30554h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f30554h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f30553g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f30553g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f30553g.getSettings().setAllowContentAccess(false);
        this.f30553g.getSettings().setAllowFileAccess(false);
        this.f30553g.setWebViewClient(new a());
        a(this.f30553g);
        h.a().c(this.f30553g, this.f30556j);
        for (String str : this.f30555i.keySet()) {
            h.a().c(this.f30553g, this.f30555i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f30554h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
