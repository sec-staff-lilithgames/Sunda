package com.iab.omid.library.odeeoio.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.odeeoio.adsession.AdSessionContext;
import com.iab.omid.library.odeeoio.adsession.VerificationScriptResource;
import com.iab.omid.library.odeeoio.b.e;
import com.iab.omid.library.odeeoio.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private WebView f31221a;

    /* renamed from: b, reason: collision with root package name */
    private Long f31222b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f31223c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31224d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f31223c = map;
        this.f31224d = str;
    }

    @Override // com.iab.omid.library.odeeoio.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.odeeoio.publisher.b.1

            /* renamed from: b, reason: collision with root package name */
            private final WebView f31226b;

            {
                this.f31226b = b.this.f31221a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f31226b.destroy();
            }
        }, Math.max(4000 - (this.f31222b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f31222b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f31221a = null;
    }

    public void j() {
        WebView webView = new WebView(com.iab.omid.library.odeeoio.b.d.a().b());
        this.f31221a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f31221a);
        e.a().a(this.f31221a, this.f31224d);
        for (String str : this.f31223c.keySet()) {
            e.a().a(this.f31221a, this.f31223c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f31222b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.odeeoio.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.odeeoio.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.odeeoio.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.odeeoio.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
