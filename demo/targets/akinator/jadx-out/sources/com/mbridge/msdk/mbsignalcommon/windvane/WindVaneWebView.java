package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: d, reason: collision with root package name */
    protected j f41908d;

    /* renamed from: e, reason: collision with root package name */
    protected b f41909e;

    /* renamed from: f, reason: collision with root package name */
    protected e f41910f;

    /* renamed from: g, reason: collision with root package name */
    private Object f41911g;

    /* renamed from: h, reason: collision with root package name */
    private Object f41912h;

    /* renamed from: i, reason: collision with root package name */
    private String f41913i;

    /* renamed from: j, reason: collision with root package name */
    private c f41914j;

    /* renamed from: k, reason: collision with root package name */
    private String f41915k;

    /* renamed from: l, reason: collision with root package name */
    private String f41916l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignEx f41917m;

    /* renamed from: n, reason: collision with root package name */
    private int f41918n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41919o;

    /* renamed from: p, reason: collision with root package name */
    private float f41920p;

    /* renamed from: q, reason: collision with root package name */
    private float f41921q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f41919o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f41919o = false;
        this.f41920p = 0.0f;
        this.f41921q = 0.0f;
    }

    public void clearWebView() {
        if (this.f41919o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f41917m;
    }

    public String getCampaignId() {
        return this.f41913i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f41910f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f41916l;
    }

    public Object getMraidObject() {
        return this.f41912h;
    }

    public Object getObject() {
        return this.f41911g;
    }

    public String getRid() {
        return this.f41915k;
    }

    public b getSignalCommunication() {
        return this.f41909e;
    }

    public c getWebViewListener() {
        return this.f41914j;
    }

    public boolean isDestoryed() {
        return this.f41919o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f41920p = motionEvent.getRawX();
                    this.f41921q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f41920p;
                    float y10 = motionEvent.getY() - this.f41921q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f41910f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f41919o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f41918n));
                if (this.f41917m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f41917m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f41911g = null;
            if (u0.b(getContext()) == 0) {
                this.f41919o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), r0 * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f41910f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f41910f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f41917m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f41913i = str;
    }

    public void setLocalRequestId(String str) {
        this.f41916l = str;
    }

    public void setMraidObject(Object obj) {
        this.f41912h = obj;
    }

    public void setObject(Object obj) {
        this.f41911g = obj;
    }

    public void setRid(String str) {
        this.f41915k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f41909e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f41918n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f41908d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f41914j = cVar;
        j jVar = this.f41908d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f41908d == null) {
            this.f41908d = new j(this);
        }
        setWebViewChromeClient(this.f41908d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f41909e == null) {
            b hVar = new h(this.f41808a);
            this.f41909e = hVar;
            setSignalCommunication(hVar);
        }
        this.f41910f = new e(this.f41808a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41919o = false;
        this.f41920p = 0.0f;
        this.f41921q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41919o = false;
        this.f41920p = 0.0f;
        this.f41921q = 0.0f;
    }
}
