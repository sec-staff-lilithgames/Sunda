package com.mbridge.msdk.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import b0.e2;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c0;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBSplashView extends RelativeLayout {

    /* renamed from: u, reason: collision with root package name */
    private static String f43076u = "MBSplashView";

    /* renamed from: a, reason: collision with root package name */
    private int f43077a;

    /* renamed from: b, reason: collision with root package name */
    private MBSplashWebview f43078b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f43079c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f43080d;

    /* renamed from: e, reason: collision with root package name */
    private View f43081e;

    /* renamed from: f, reason: collision with root package name */
    private View f43082f;

    /* renamed from: g, reason: collision with root package name */
    private int f43083g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43084h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43085i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f43086j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f43087k;

    /* renamed from: l, reason: collision with root package name */
    private View f43088l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43089m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f43090n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f43091o;

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f43092p;

    /* renamed from: q, reason: collision with root package name */
    private DyCountDownListener f43093q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f43094r;

    /* renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f43095s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f43096t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f43094r;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f43098a;

        public b(CampaignEx campaignEx) {
            this.f43098a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f43098a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.a(MBSplashView.f43076u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f43078b.getLocationOnScreen(iArr);
                    p0.b(MBSplashView.f43076u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), (float) iArr[0]));
                    jSONObject.put("startY", u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    p0.b(MBSplashView.f43076u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f43078b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f43078b, iArr2[0], iArr2[1], MBSplashView.this.f43078b.getWidth(), MBSplashView.this.f43078b.getHeight());
                f.a().a((WebView) MBSplashView.this.f43078b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        p0.b(f43076u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.m().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float fN = l0.n(com.mbridge.msdk.foundation.controller.c.m().d());
            float fM = l0.m(com.mbridge.msdk.foundation.controller.c.m().d());
            HashMap mapV = l0.v(com.mbridge.msdk.foundation.controller.c.m().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            p0.b(f43076u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f43081e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f43086j = false;
        this.f43085i = false;
        this.f43084h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f43087k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f43078b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f43078b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f43078b, "onSystemDestory", "");
        this.f43078b.release();
        this.f43078b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f43095s;
    }

    public View getCloseView() {
        return this.f43081e;
    }

    public ViewGroup getDevContainer() {
        return this.f43087k;
    }

    public View getIconVg() {
        return this.f43082f;
    }

    public View getSplashNativeView() {
        return this.f43088l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f43092p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f43078b;
    }

    public boolean isAttach() {
        return this.f43090n;
    }

    public boolean isDynamicView() {
        return this.f43089m;
    }

    public boolean isH5Ready() {
        return this.f43084h;
    }

    public boolean isImageReady() {
        return this.f43086j;
    }

    public boolean isVideoReady() {
        return this.f43085i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43090n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f43088l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f43088l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f43085i = false;
        this.f43084h = false;
    }

    public void setAllowClickSplash(boolean z10) {
        this.f43094r = z10;
        setOnTouchListener(this.f43095s);
    }

    public void setCloseView(View view) {
        this.f43081e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f43087k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f43093q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f43089m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f43084h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f43082f = view;
        this.f43091o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f43086j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) throws JSONException {
        View view = this.f43088l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f43078b != null) {
            f.a().a((WebView) this.f43078b, "oncutoutfetched", Base64.encodeToString(c0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f43088l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f43092p = bVar;
        MBSplashWebview mBSplashWebview = this.f43078b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f43078b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f43078b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f43092p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f43079c;
                if (aVar != null) {
                    this.f43078b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f43079c = aVar2;
                this.f43078b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                p0.b(f43076u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f43085i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f43092p != null && (viewGroup = this.f43087k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f43092p.a(this.f43087k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f43079c;
            if (aVar != null) {
                aVar.a(this.f43092p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) throws JSONException {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f43078b != null && !this.f43089m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f43078b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f43089m && (view = this.f43088l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f43089m || (dyCountDownListener = this.f43093q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f43077a = getResources().getConfiguration().orientation;
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43094r = true;
        this.f43095s = new a();
        this.f43096t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f43096t = true;
        if (this.f43082f == null) {
            if (this.f43089m && (view3 = this.f43088l) != null) {
                if (view3.getParent() != null) {
                    e1.a(this.f43088l);
                }
                addView(this.f43088l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f43078b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f43078b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f43080d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f43080d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f43077a == 2) {
                this.f43083g = u0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f43080d.getId());
                if (this.f43089m && (view2 = this.f43088l) != null) {
                    if (view2.getParent() != null) {
                        e1.a(this.f43088l);
                    }
                    addView(this.f43088l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f43078b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f43078b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f43080d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f43091o.width;
                    e1.a(this.f43082f);
                    int i11 = this.f43083g / 4;
                    if (i10 > i11) {
                        this.f43080d.addView(this.f43082f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f43080d.addView(this.f43082f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f43080d, layoutParams2);
                }
            } else {
                this.f43083g = u0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f43080d.getId());
                if (this.f43089m && (view = this.f43088l) != null) {
                    if (view.getParent() != null) {
                        e1.a(this.f43088l);
                    }
                    addView(this.f43088l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f43078b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f43078b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f43080d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f43091o.height;
                    int i13 = this.f43083g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    e1.a(this.f43082f);
                    this.f43080d.addView(this.f43082f, -1, i12);
                    addView(this.f43080d, e2.e(-1, i12, 12));
                }
            }
        }
        View view4 = this.f43081e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(u0.a(getContext(), 100.0f), u0.a(getContext(), 30.0f));
                layoutParams4.addRule(10);
                layoutParams4.addRule(11);
                layoutParams4.rightMargin = u0.a(getContext(), 10.0f);
                layoutParams4.topMargin = u0.a(getContext(), 10.0f);
                addView(this.f43081e, layoutParams4);
                return;
            }
            bringChildToFront(this.f43081e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f43078b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? g.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f43096t) {
                    this.f43096t = false;
                    this.f43078b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f43078b.setObject(this.f43092p);
            this.f43078b.post(new c());
        }
    }
}
