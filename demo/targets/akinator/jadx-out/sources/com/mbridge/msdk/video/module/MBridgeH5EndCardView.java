package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    Handler L;
    private boolean M;
    private boolean N;
    boolean O;

    /* renamed from: m, reason: collision with root package name */
    protected View f44659m;

    /* renamed from: n, reason: collision with root package name */
    protected RelativeLayout f44660n;

    /* renamed from: o, reason: collision with root package name */
    protected ImageView f44661o;

    /* renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f44662p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44663q;

    /* renamed from: r, reason: collision with root package name */
    protected Handler f44664r;

    /* renamed from: s, reason: collision with root package name */
    protected String f44665s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f44666t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f44667u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44668v;

    /* renamed from: w, reason: collision with root package name */
    private int f44669w;

    /* renamed from: x, reason: collision with root package name */
    private int f44670x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f44671y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44672z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                p0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f44662p.getLocationOnScreen(iArr);
                    p0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                    if (contextD != null) {
                        jSONObject.put("startX", u0.b(contextD, iArr[0]));
                        jSONObject.put("startY", u0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f40715l, u0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f44662p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f44662p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44679a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f44679a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                p0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44679a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44681a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f44681a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44681a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f44672z) {
                return;
            }
            this.f44681a.f44672z = true;
            this.f44681a.f44666t = false;
            MBridgeH5EndCardView.this.reportRenderResult(QCmNMSGd.ktxfJvkBZjd, 5);
            this.f44681a.notifyListener.a(127, "");
            p0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44683a;

        /* renamed from: b, reason: collision with root package name */
        private int f44684b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f44683a = mBridgeH5EndCardView;
            this.f44684b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44683a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f44612b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f44671y) {
                    p0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f44683a.f44671y = true;
                n nVar = new n("m_download_end", 12, (this.f44684b * 1000) + "", this.f44683a.f44612b.getendcard_url(), this.f44683a.f44612b.getId(), this.f44683a.unitId, "ready timeout", (z0.b(this.f44683a.f44612b.getendcard_url()) && this.f44683a.f44612b.getendcard_url().contains(".zip")) ? "1" : "2");
                try {
                    if (this.f44683a.f44612b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f44683a.f44612b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f44683a.f44612b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f44683a.f44612b.getRequestId());
                nVar.k(this.f44683a.f44612b.getCurrentLocalRid());
                nVar.o(this.f44683a.f44612b.getRequestIdNotice());
                nVar.a(this.f44683a.f44612b.getAdSpaceT());
                this.f44683a.isLoadSuccess();
            } catch (Throwable th2) {
                p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44685a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f44685a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44685a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44687a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f44687a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44687a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f44689a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f44689a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f44689a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f44689a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f44663q = false;
        this.f44664r = new Handler();
        this.f44666t = false;
        this.f44667u = false;
        this.f44668v = false;
        this.f44669w = 1;
        this.f44670x = 1;
        this.f44671y = false;
        this.f44672z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws JSONException {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = l0.n(getContext());
            float fM = l0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f44662p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f44662p, r7.getLeft(), this.f44662p.getTop(), this.f44662p.getWidth(), this.f44662p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p, r13.getLeft(), this.f44662p.getTop(), this.f44662p.getWidth(), this.f44662p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p, com.mbridge.msdk.mbsignalcommon.mraid.d.f41891f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f44661o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f44664r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f44668v || this.f44669w <= -1) {
            return;
        }
        this.f44664r.postDelayed(new k(this), this.f44669w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f44664r.postDelayed(new g(this), i10 * 1000);
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f44612b;
    }

    public String getURL() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.f44668v = false;
            String mraid = this.f44612b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f44612b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f44612b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f44612b.getendcard_url();
        if (z0.a(str)) {
            this.f44668v = false;
            return this.f44612b.getEndScreenUrl();
        }
        this.f44668v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            StringBuilder sbT = a.b.t(h5ResAddress, "&native_adtype=");
            sbT.append(this.f44612b.getAdType());
            return sbT.toString();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.f44612b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f44668v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th3) {
            p0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        StringBuilder sbT2 = a.b.t(str, "&native_adtype=");
        sbT2.append(this.f44612b.getAdType());
        return sbT2.toString();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f44667u) {
            return;
        }
        this.f44667u = true;
        this.f44666t = false;
        if (this.f44612b != null) {
            n nVar = new n();
            nVar.n(this.f44612b.getRequestId());
            nVar.o(this.f44612b.getRequestIdNotice());
            nVar.b(this.f44612b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f44611a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (h0.a(iFindLayout)) {
            View viewInflate = this.f44613c.inflate(iFindLayout, (ViewGroup) null);
            this.f44659m = viewInflate;
            try {
                this.f44615e = a(viewInflate);
            } catch (Exception unused) {
                this.f44615e = false;
            }
            addView(this.f44659m, getContentLayoutParams());
            d();
            j();
        }
    }

    public boolean isLoadSuccess() {
        return this.f44666t;
    }

    public boolean isPlayable() {
        return this.f44668v;
    }

    public void j() {
        if (this.f44615e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.D || (((z10 = this.E) && this.F) || (!(z10 || !this.G || this.O) || (!z10 && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.metrics.d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:18:0x0057). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        Object objB = "";
        int i10 = 119;
        int i11 = 103;
        try {
            if (this.f44662p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f44662p, "onSystemDestory", "");
                new Thread(new f(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.notifyListener.a(i11, objB);
            this.notifyListener.a(i10, "close webview exception" + e10.getMessage());
            p0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            objB = com.mbridge.msdk.foundation.same.report.metrics.d.b();
            i10 = "2000134";
            i11 = this.f44612b;
            objB.a("2000134", i11);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        t0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        t0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) throws JSONException {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        t0.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f44662p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f44662p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f44662p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f44615e || this.f44612b == null || TextUtils.isEmpty(url) || this.f44662p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f44612b);
            aVar.a(this.f44612b.getAppName());
            this.f44662p.setDownloadListener(aVar);
            this.f44662p.setCampaignId(this.f44612b.getId());
            this.f44662p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null) {
                this.f44662p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f44662p.setApiManagerJSFactory(bVar);
            if (this.f44612b.isMraid()) {
                this.f44662p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            a1.a(this.f44662p, this.f44612b.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
            this.f44662p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f44612b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f44665s)) {
                this.f44662p.loadUrl(url);
            } else {
                this.f44662p.loadDataWithBaseURL(url, this.f44665s, "text/html", C.UTF8_NAME, null);
            }
        }
        this.O = false;
    }

    public void release() {
        Handler handler = this.f44664r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f44664r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f44660n.removeAllViews();
        this.f44662p.release();
        this.f44662p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f44612b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f44612b == null || this.f44667u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f44612b.getRequestId());
        nVar.o(this.f44612b.getRequestIdNotice());
        nVar.b(this.f44612b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        String str2 = "2";
        if (this.f44612b.getAdType() == 287) {
            nVar.a("3");
        } else if (this.f44612b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f44612b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.f44612b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.f44612b.getendcard_url());
            if (z0.b(this.f44612b.getendcard_url()) && this.f44612b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f44612b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f44669w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f44615e) {
            this.f44661o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f44615e) {
            this.I = true;
            if (i10 == 4) {
                this.f44661o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f44661o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f44661o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f44667u = z10;
    }

    public void setHtmlSource(String str) {
        this.f44665s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        p0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f44661o.getLayoutParams();
        int iA = u0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f44661o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f44670x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f44612b.getendcard_url();
            if (z0.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(C3191e4.i.f36527c);
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (z0.b(str2) && str2.contains("timeout") && str2.split(C3191e4.i.f36525b) != null && str2.split(C3191e4.i.f36525b).length > 0) {
                            iA = u0.a((Object) str2.split(C3191e4.i.f36525b)[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th2) {
            p0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f44661o.getVisibility();
        if (i10 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.D = false;
            if (this.O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f44662p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f44662p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i10 = this.f44669w;
        if (i10 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i10 > -1) {
            this.f44664r.postDelayed(new i(this), this.f44669w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i10 = this.f44670x;
        if (i10 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i10 > -1) {
            this.f44664r.postDelayed(new j(this), this.f44670x * 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            r7 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            r7.B = r2     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f44612b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.getendcard_url()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.b r3 = com.mbridge.msdk.videocommon.setting.b.b()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r7.unitId     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.c r3 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r7.f44668v     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L97
            boolean r4 = com.mbridge.msdk.foundation.tools.z0.b(r2)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L97
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L3d
            if (r3 == 0) goto L97
            int r4 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r4 <= 0) goto L97
            goto L3d
        L3b:
            r0 = move-exception
            goto L98
        L3d:
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            r4 = 20
            if (r0 == 0) goto L80
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r2 <= 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L52:
            if (r3 >= r2) goto L8d
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L3b
            boolean r6 = com.mbridge.msdk.foundation.tools.z0.b(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String r6 = "to"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3b
            if (r6 <= 0) goto L7d
            java.lang.String[] r0 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L3b
            int r0 = com.mbridge.msdk.foundation.tools.u0.a(r0)     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L7d:
            int r3 = r3 + 1
            goto L52
        L80:
            if (r3 == 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r0 <= 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L8d:
            r0 = r4
        L8e:
            if (r0 < 0) goto L94
            r7.excuteEndCardShowTask(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L94:
            r7.excuteEndCardShowTask(r4)     // Catch: java.lang.Throwable -> L3b
        L97:
            return
        L98:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.p0.b(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.h():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f44612b);
            }
            CampaignEx campaignEx2 = this.f44612b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
            imageView.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f44661o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f), u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f);
                layoutParams2.topMargin = u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            u0.a(4, imageView, this.f44612b, com.mbridge.msdk.foundation.controller.c.m().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f44615e) {
            this.f44661o.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.f44661o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f44660n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f44662p = windVaneWebView;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f44662p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f44660n.addView(this.f44662p);
        return isNotNULL(this.f44661o, this.f44662p);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements com.mbridge.msdk.foundation.feedback.a {
        public e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f44662p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f44662p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f44662p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:5|6|(1:13)(1:10)|14|(1:16)(2:17|(1:19)(9:22|21|23|49|24|(1:26)(2:29|(1:31)(2:32|(1:34)))|48|37|(1:55)(4:40|(1:42)(1:43)|44|56)))|20|21|23|49|24|(0)(0)|48|37|(1:55)(1:54)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(long, boolean):void");
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44663q = false;
        this.f44664r = new Handler();
        this.f44666t = false;
        this.f44667u = false;
        this.f44668v = false;
        this.f44669w = 1;
        this.f44670x = 1;
        this.f44671y = false;
        this.f44672z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f44675a;

        public c(boolean z10) {
            this.f44675a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f44667u) {
                return;
            }
            mBridgeH5EndCardView.f44666t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f44612b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f44612b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f44612b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f44612b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f44612b.getAdType() == 287) {
                    nVar.a("3");
                } else if (MBridgeH5EndCardView.this.f44612b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f44612b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.f44612b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f44612b.getendcard_url());
                    if (z0.b(MBridgeH5EndCardView.this.f44612b.getendcard_url()) && MBridgeH5EndCardView.this.f44612b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f44612b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, "");
            if (this.f44675a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f44612b, eVar);
            } catch (Throwable th2) {
                p0.b("WindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.A = i10;
            if (MBridgeH5EndCardView.this.f44672z) {
                return;
            }
            MBridgeH5EndCardView.this.f44672z = true;
            if (i10 == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult(C3191e4.h.f36509t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f44667u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(127, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.f44667u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            StringBuilder sbT = o2.t(i10, "h5EncardView readyStatus:", "- isError");
            sbT.append(MBridgeH5EndCardView.this.f44667u);
            p0.c("WindVaneWebView", sbT.toString());
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f44667u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.f44675a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(KGUkpTlXZlJLy.aFsQFAbOdxX, MBridgeH5EndCardView.this.f44612b, eVar);
                } catch (Throwable th2) {
                    p0.b("WindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView) {
            super.a(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }
}
