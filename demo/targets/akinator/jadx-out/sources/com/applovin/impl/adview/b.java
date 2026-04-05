package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.e2;
import com.applovin.impl.j0;
import com.applovin.impl.k7;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.r4;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.v4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b extends j0 {

    /* renamed from: j, reason: collision with root package name */
    private static final Set f13510j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k, reason: collision with root package name */
    private static final Object f13511k = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13512c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13513d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f13514e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13515f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13516g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13517h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f13518i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends r4 {
        public a() {
        }

        @Override // com.applovin.impl.r4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f13517h = new ArrayList();
        this.f13518i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f13513d = kVar;
        this.f13512c = kVar.O();
        Integer num = (Integer) kVar.a(v4.f16046u6);
        if (num.intValue() > 0) {
            synchronized (f13511k) {
                Set set = f13510j;
                set.add(this);
                k7.a("AdWebView", set.size(), num.intValue(), kVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (o0.j() && ((Boolean) kVar.a(v4.N5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new r(0));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.s
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f13564b.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f13515f = true;
        this.f13516g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f13514e;
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f13516g = z10;
        if (z10 && ((Boolean) this.f13513d.a(v4.f15982m6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f13518i) {
            try {
                Iterator it = this.f13517h.iterator();
                while (it.hasNext()) {
                    l8.a(this, (String) it.next(), "AdWebView", this.f13513d);
                }
                this.f13517h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f13512c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f13515f) {
            this.f13514e = bVar;
            try {
                applySettings(bVar);
                if (k7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).s1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13512c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof l7) {
                    l7 l7Var = (l7) bVar;
                    o7 o7VarS1 = l7Var.s1();
                    if (o7VarS1 != null) {
                        t7 t7VarE = o7VarS1.e();
                        Uri uriC = t7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = t7VarE.b();
                        String strU1 = l7Var.u1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f13512c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (t7VarE.d() == t7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f13512c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f13513d.a(v4.D4), string);
                            if (l7Var.J1() && l7Var.isOpenMeasurementEnabled() && l7Var.K1()) {
                                strA = this.f13513d.e0().a(strA, e2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (t7VarE.d() == t7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strU1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f13512c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f13512c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strU1, this.f13513d, l7Var);
                                return;
                            }
                            return;
                        }
                        String str2 = string;
                        if (t7VarE.d() == t7.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f13512c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), strU1, this.f13513d, l7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strU1, strB);
                                    String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f13512c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    loadDataWithBaseURL(bVar.k(), str3, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f13512c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13512c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL) + ") - " + th2);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    public void a(String str) {
        if (((Boolean) this.f13513d.a(v4.f15982m6)).booleanValue()) {
            if (this.f13516g) {
                l8.a(this, str, "AdWebView", this.f13513d);
                return;
            }
            synchronized (this.f13517h) {
                this.f13517h.add(str);
            }
            return;
        }
        l8.a(this, str, "AdWebView", this.f13513d);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, l7 l7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Rendering webview for VAST ad with resourceContents : ", strA, this.f13512c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(v4.E4), str);
        if (StringUtils.isValidString(strA2)) {
            if (l7Var.J1() && l7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.e0().a(strA2, e2.a((AppLovinAdImpl) l7Var));
            }
            if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Rendering webview for VAST ad with resourceContents : ", strA2, this.f13512c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Rendering webview for VAST ad with resourceURL : ", str, this.f13512c, "AdWebView");
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }
}
