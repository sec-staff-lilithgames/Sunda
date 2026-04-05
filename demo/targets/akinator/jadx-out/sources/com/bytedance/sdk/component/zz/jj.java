package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.hmu;
import com.bytedance.sdk.component.zz.jpo;
import com.ironsource.C3191e4;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends FrameLayout {

    /* renamed from: va, reason: collision with root package name */
    private static wqx f19065va;

    /* renamed from: au, reason: collision with root package name */
    private boolean f19066au;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jd.jpo f19067cm;

    /* renamed from: dm, reason: collision with root package name */
    private AtomicBoolean f19068dm;

    /* renamed from: dt, reason: collision with root package name */
    private boolean f19069dt;
    private AtomicBoolean duq;

    /* renamed from: ef, reason: collision with root package name */
    private Context f19070ef;
    private boolean hmu;
    private jpo.InterfaceC0096jpo hna;

    /* renamed from: hx, reason: collision with root package name */
    private float f19071hx;

    /* renamed from: if, reason: not valid java name */
    private long f80if;

    /* renamed from: jd, reason: collision with root package name */
    public int f19072jd;

    /* renamed from: jj, reason: collision with root package name */
    private JSONObject f19073jj;
    public int jpo;

    /* renamed from: jr, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.cm f19074jr;

    /* renamed from: ju, reason: collision with root package name */
    private long f19075ju;
    private AttributeSet kln;
    private String my;
    private boolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    private WebViewClient f19076nq;
    private AtomicBoolean nzb;
    private List<String> opi;
    private volatile WebView oya;
    private float pdm;
    private View prr;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19077qk;
    private long roc;

    /* renamed from: rq, reason: collision with root package name */
    private boolean f19078rq;

    /* renamed from: rv, reason: collision with root package name */
    private int f19079rv;

    /* renamed from: se, reason: collision with root package name */
    private float f19080se;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jpo f19081sq;
    private hmu sz;
    private cm tic;

    /* renamed from: tu, reason: collision with root package name */
    private boolean f19082tu;

    /* renamed from: uu, reason: collision with root package name */
    private jd f19083uu;
    private long vrc;
    public int wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private long f19084yd;
    private float zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface cm {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.zz.jj.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface wqx {
        WebView createWebView(Context context, AttributeSet attributeSet, int i10);
    }

    public jj(Context context) {
        this(jpo(context), false);
    }

    private static Context jpo(Context context) {
        return context;
    }

    private void jr() {
        if (this.oya == null) {
            return;
        }
        try {
            this.oya.removeJavascriptInterface("searchBoxJavaBridge_");
            this.oya.removeJavascriptInterface("accessibility");
            this.oya.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void nmd() {
        try {
            WebSettings settings = this.oya.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void rq() {
        if (this.sz == null) {
            this.f19068dm.set(false);
            this.sz = new hmu(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.zz.jj.1
        };
        this.f19068dm.set(true);
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(wqx wqxVar) {
        f19065va = wqxVar;
    }

    private static void wqx(Context context) {
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.oya.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void au() {
        if (this.oya != null) {
            this.oya.onResume();
        }
    }

    public void b_(String str) {
        try {
            this.oya.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public boolean cm() {
        return this.f19069dt;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.oya == null) {
            return;
        }
        try {
            this.oya.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getArbitrageLoadingView() {
        return this.prr;
    }

    public int getContentHeight() {
        if (this.oya == null) {
            return 0;
        }
        try {
            return this.oya.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.vrc;
    }

    public long getLandingPageClickEnd() {
        return this.roc;
    }

    public com.bytedance.sdk.component.zz.jd.jpo getMaterialMeta() {
        return this.f19067cm;
    }

    public String getOriginalUrl() {
        String url;
        if (this.oya == null) {
            return null;
        }
        try {
            String originalUrl = this.oya.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.oya.getUrl()) != null) {
                if (url.startsWith(AdPayload.FILE_SCHEME)) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.oya == null) {
            return 0;
        }
        try {
            return this.oya.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.oya == null) {
            return null;
        }
        try {
            return this.oya.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.oya == null) {
            return "";
        }
        try {
            return this.oya.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.oya;
    }

    public WebViewClient getWebViewClient() {
        return this.f19076nq;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hna() {
        if (this.oya == null) {
            return;
        }
        try {
            this.oya.destroy();
        } catch (Throwable unused) {
        }
    }

    public boolean i_() {
        return this.nmd;
    }

    /* renamed from: if, reason: not valid java name */
    public void m423if() {
        try {
            this.oya.goForward();
        } catch (Throwable unused) {
        }
    }

    public boolean jd() {
        return this.f19078rq;
    }

    public void jj() {
        if (this.oya != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.oya.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.oya, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public boolean ju() {
        if (this.oya == null) {
            return false;
        }
        try {
            return this.oya.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void my() {
        try {
            this.oya = jpo(this.kln, 0);
            jj();
            jd(jpo(this.f19070ef));
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.nzb.set(true);
        if (!this.duq.get() || this.f19068dm.get()) {
            return;
        }
        rq();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.nzb.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentJpo;
        try {
            jpo(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f19066au && (viewParentJpo = jpo(this)) != null) {
                viewParentJpo.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void opi() {
        try {
            this.oya.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void oya() {
        try {
            this.oya.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void prr() {
        if (this.oya == null) {
            return;
        }
        try {
            this.oya.onPause();
        } catch (Throwable unused) {
        }
    }

    public void qk() {
        try {
            this.oya.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.oya.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.oya.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.oya.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.oya.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.oya.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.oya.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.f19079rv = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.oya.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.f19071hx = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.oya.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.oya.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.oya.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.oya.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.oya.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.f19066au = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.oya.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.oya.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.f19077qk = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.vrc = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.roc = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.oya.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.oya.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.oya.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z10) {
        this.nmd = z10;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.zz.jd.jpo jpoVar) {
        this.f19067cm = jpoVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.oya.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.oya.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(jd jdVar) {
        this.f19083uu = jdVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.oya.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z10) {
        this.hmu = z10;
    }

    public void setPreFinish(boolean z10) {
        this.f19082tu = z10;
    }

    public void setPreProgressHundred(boolean z10) {
        this.f19069dt = z10;
    }

    public void setPreStart(boolean z10) {
        this.f19078rq = z10;
    }

    public void setRecycler(boolean z10) {
        if (this.oya == null || !(this.oya instanceof my)) {
            return;
        }
        ((my) this.oya).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.f19080se = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.oya.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.my = str;
        com.bytedance.sdk.component.zz.jpo jpoVar = this.f19081sq;
        if (jpoVar != null) {
            jpoVar.jpo(str);
        }
        com.bytedance.sdk.component.zz.cm cmVar = this.f19074jr;
        if (cmVar != null) {
            cmVar.jpo(str);
        }
    }

    public void setTouchStateListener(cm cmVar) {
        this.tic = cmVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.oya.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.oya.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.oya.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.oya.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof cm) {
                setTouchStateListener((cm) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new jpo();
            }
            this.f19076nq = webViewClient;
            this.oya.setWebViewClient(new qk(this.hna, webViewClient, this.opi));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.pdm = f10;
    }

    public void sq() {
        try {
            this.oya.clearView();
        } catch (Throwable unused) {
        }
    }

    public void xyk() {
        try {
            this.oya.reload();
        } catch (Throwable unused) {
        }
    }

    public void yd() {
        try {
            this.oya.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean zz() {
        if (this.oya == null) {
            return false;
        }
        try {
            return this.oya.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public jj(Context context, boolean z10) {
        super(jpo(context));
        this.xyk = 0.0f;
        this.zz = 0.0f;
        this.f19084yd = 0L;
        this.f19075ju = 0L;
        this.f80if = 0L;
        this.f19066au = false;
        this.f19080se = 20.0f;
        this.pdm = 50.0f;
        this.nzb = new AtomicBoolean();
        this.duq = new AtomicBoolean();
        this.f19068dm = new AtomicBoolean();
        this.f19070ef = context;
        if (z10) {
            return;
        }
        try {
            this.oya = jpo((AttributeSet) null, 0);
            jj();
        } catch (Throwable unused) {
        }
        jd(jpo(context));
    }

    private void jd(Context context) {
        wqx(context);
        nmd();
        jr();
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.oya.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(C3191e4.h.f36473b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.my;
    }

    public void jpo(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.oya != null && (this.oya instanceof my)) {
            this.f19081sq = new com.bytedance.sdk.component.zz.jpo(this.f19070ef, i10, i11, list, i12);
            this.opi = list2;
            if (!TextUtils.isEmpty(this.my)) {
                this.f19081sq.jpo(this.my);
            }
            ((my) this.oya).setTouchListenerProxy(this.f19081sq);
            this.hna = this.f19081sq.jpo();
        }
    }

    public boolean wqx() {
        return this.f19082tu;
    }

    private static boolean wqx(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean jd(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void jpo(int i10, long j10) {
        if (this.oya == null || !(this.oya instanceof my)) {
            return;
        }
        this.f19074jr = new com.bytedance.sdk.component.zz.cm(this.f19070ef, this.f19081sq, i10, j10, this);
        if (!TextUtils.isEmpty(this.my)) {
            this.f19074jr.jpo(this.my);
        }
        ((my) this.oya).setTouchListenerProxy(this.f19074jr);
    }

    public void jpo(boolean z10, View view) {
        if (z10) {
            this.prr = view;
            view.setVisibility(8);
            View view2 = this.prr;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.prr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView jpo(AttributeSet attributeSet, int i10) {
        wqx wqxVar = f19065va;
        if (wqxVar != null) {
            return wqxVar.createWebView(getContext(), attributeSet, i10);
        }
        if (attributeSet == null) {
            return new WebView(jpo(this.f19070ef));
        }
        return new WebView(jpo(this.f19070ef), attributeSet);
    }

    public void jpo(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.oya.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void jpo(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.oya.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void jpo(boolean z10) {
        try {
            this.oya.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent jpo(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (jd(view2) || wqx(view2)) ? parent : jpo(view2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void jpo(Object obj, String str) {
        try {
            this.oya.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void jpo(MotionEvent motionEvent) {
        if (!this.f19077qk || this.f19067cm == null) {
            return;
        }
        if ((this.my == null && this.f19073jj == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.xyk = motionEvent.getRawX();
                this.zz = motionEvent.getRawY();
                this.f19084yd = System.currentTimeMillis();
                this.f19073jj = new JSONObject();
                if (this.oya != null) {
                    this.vrc = this.f19084yd;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.f19073jj.put("start_x", String.valueOf(this.xyk));
                this.f19073jj.put("start_y", String.valueOf(this.zz));
                this.f19073jj.put("offset_x", String.valueOf(motionEvent.getRawX() - this.xyk));
                this.f19073jj.put("offset_y", String.valueOf(motionEvent.getRawY() - this.zz));
                this.f19073jj.put("url", String.valueOf(getUrl()));
                this.f19073jj.put("tag", "");
                this.f19075ju = System.currentTimeMillis();
                if (this.oya != null) {
                    this.roc = this.f19075ju;
                }
                this.f19073jj.put("down_time", this.f19084yd);
                this.f19073jj.put("up_time", this.f19075ju);
                if (com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd() != null) {
                    long j10 = this.f80if;
                    long j11 = this.f19084yd;
                    if (j10 != j11) {
                        this.f80if = j11;
                        com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd().jpo(this.f19067cm, this.my, "in_web_click", this.f19073jj, this.f19075ju - this.f19084yd);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
