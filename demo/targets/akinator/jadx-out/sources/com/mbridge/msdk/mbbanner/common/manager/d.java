package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b0.e2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.d1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {
    private com.mbridge.msdk.mbbanner.common.communication.b A;
    private AdSession B;
    private AdEvents C;
    private float F;
    private float G;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.listener.c f41482a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41483b;

    /* renamed from: c, reason: collision with root package name */
    protected CampaignEx f41484c;

    /* renamed from: d, reason: collision with root package name */
    protected final MBBannerView f41485d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f41486e;

    /* renamed from: f, reason: collision with root package name */
    private MBBannerWebView f41487f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f41488g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f41489h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f41490i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f41491j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41492k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41493l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41494m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41495n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f41496o;

    /* renamed from: p, reason: collision with root package name */
    protected final String f41497p;

    /* renamed from: q, reason: collision with root package name */
    private final String f41498q;

    /* renamed from: r, reason: collision with root package name */
    private String f41499r;

    /* renamed from: t, reason: collision with root package name */
    com.mbridge.msdk.click.a f41501t;

    /* renamed from: u, reason: collision with root package name */
    private List<CampaignEx> f41502u;

    /* renamed from: w, reason: collision with root package name */
    private View.OnTouchListener f41504w;

    /* renamed from: y, reason: collision with root package name */
    private int f41506y;

    /* renamed from: s, reason: collision with root package name */
    private int f41500s = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f41503v = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f41505x = 1;

    /* renamed from: z, reason: collision with root package name */
    private final long f41507z = MBInterstitialActivity.WEB_LOAD_TIME;
    private final Handler D = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a E = new f();
    private final View.OnClickListener H = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a I = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b J = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41510b;

        public b(Context context, CampaignEx campaignEx) {
            this.f41509a = context;
            this.f41510b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f41509a)).b(this.f41510b.getId());
            } catch (Exception e10) {
                p0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.B != null) {
                    d dVar = d.this;
                    dVar.C = AdEvents.createAdEvents(dVar.B);
                    if (d.this.C != null) {
                        d.this.C.loaded();
                        d.this.C.impressionOccurred();
                    }
                }
            } catch (Throwable th2) {
                p0.a("BannerShowManager", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f41496o) {
                dVar.f41500s = 1;
                d.this.b();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        public h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.f41500s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i10) {
            if (i10 != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i10) {
            if (i10 == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.f41500s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10) {
            d dVar = d.this;
            if (dVar.f41482a != null) {
                dVar.f41495n = z10;
                if (z10) {
                    d.this.f41482a.a();
                } else {
                    d.this.f41482a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10, String str) {
            try {
                if (d.this.f41482a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f41482a.c();
                        d.this.f41482a.onLeaveApp();
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f41484c));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    d.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                p0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f41487f != null) {
                    String str = d.this.f41503v == 2 ? "false" : "true";
                    d.this.f41487f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements View.OnTouchListener {
        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.F = motionEvent.getRawX();
            d.this.G = motionEvent.getRawY();
            p0.b("BannerShowManager", d.this.F + "  " + d.this.G);
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.F, d.this.G), d.this.f41484c), false, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements com.mbridge.msdk.foundation.same.image.c {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.b(d.this.f41499r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.f41486e != null) {
                d.this.f41486e.setImageBitmap(bitmap);
            }
            d.this.f41492k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.f41496o) {
                return;
            }
            dVar.p();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, com.mbridge.msdk.setting.l lVar) {
        this.f41483b = z10;
        this.f41485d = mBBannerView;
        this.f41497p = str2;
        this.f41498q = str;
        this.f41482a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.f41492k && !this.f41493l && this.f41482a != null) {
            this.f41493l = true;
            this.D.removeCallbacks(this.E);
            CampaignEx campaignEx = this.f41484c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f41484c.setCallbacked(true);
                this.f41482a.a(this.f41502u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f41484c.getMaitve(), this.f41484c.getMaitve_src());
            }
        }
        if (this.f41492k && this.f41490i && this.f41491j && this.f41493l && this.f41484c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.f41485d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f41494m && zA) {
                p0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f41485d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f41487f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f41487f, iArr[0], iArr[1], this.f41485d.getWidth(), this.f41485d.getHeight());
                this.f41494m = false;
                this.f41505x = 1;
                if (!TextUtils.isEmpty(this.f41484c.getImageUrl())) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(this.f41484c.getImageUrl());
                }
                l();
            }
            p0.b("BannerShowManager", "showSuccessed:" + this.f41484c.getId());
            CampaignEx campaignEx2 = this.f41484c;
            if (!zA) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f41486e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f41502u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f41502u.get(0);
                    boolean z10 = false;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.f41502u.size(); i11++) {
                        if (!this.f41502u.get(i11).isHasMBTplMark() && (i11 == 0 || !this.f41502u.get(i11).isReport())) {
                            a(this.f41502u.get(i11), com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
                            this.f41502u.get(i11).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.f41497p, this.f41502u.get(i11), "banner");
                            i10 = i11;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        b(this.f41502u.get(i10), com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
                        c(this.f41502u.get(i10), com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f41484c;
                if (campaignEx3 != null) {
                    b(campaignEx3);
                    this.f41484c.setReport(true);
                    this.f41505x = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.f41497p, this.f41484c, "banner");
                }
            }
            this.f41496o = true;
            if (campaignEx2 == null || this.f41482a == null || d1.a(this.f41485d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f41482a.a(this.f41484c);
            try {
                CampaignEx campaignEx4 = this.f41484c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                    MBBannerWebView mBBannerWebView = this.f41487f;
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.f41484c);
                    this.B = adSessionA;
                    if (adSessionA != null) {
                        try {
                            adSessionA.registerAdView(this.f41487f);
                            ImageView imageView2 = this.f41488g;
                            if (imageView2 != null) {
                                this.B.addFriendlyObstruction(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f41486e;
                            if (imageView3 != null) {
                                this.B.addFriendlyObstruction(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.B.start();
                        } catch (Exception e10) {
                            p0.a("OMSDK", e10.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f41484c;
                        if (campaignEx5 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx5.getRequestId(), this.f41484c.getRequestIdNotice(), this.f41484c.getId(), this.f41497p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f41484c;
                if (campaignEx6 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx6.getRequestId(), this.f41484c.getRequestIdNotice(), this.f41484c.getId(), this.f41497p, "fetch OM failed, context null");
                }
            }
            this.D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f41497p, this.f41484c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f41489h == null) {
                    this.f41489h = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
                }
                if (this.f41489h.getVisibility() != 0) {
                    this.f41489h.setVisibility(0);
                }
                u0.a(this.f41489h, bitmapDrawableA, this.f41485d.getResources().getDisplayMetrics());
                if (this.f41489h.getParent() == null) {
                    this.f41485d.addView(this.f41489h, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.B;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f41489h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.f41484c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.f41485d != null) {
            if (this.f41487f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().d());
                    this.f41487f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f41487f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f41497p, this.f41502u, this.I));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f41486e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f41487f.getVisibility() != 0) {
                this.f41487f.setVisibility(0);
            }
            if (this.f41487f.getParent() == null) {
                this.f41485d.addView(this.f41487f);
                a(this.f41484c.isMraid());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 296);
            if (TextUtils.isEmpty(this.f41484c.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, this.f41484c.getLocalRequestId());
            cVarA.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
            a1.a(this.f41487f, cVarA.o(), this.f41484c.getLocalAllowTrackClick());
            if (this.f41484c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.f41485d.getContext(), this.f41498q, this.f41497p);
            this.A = bVar;
            bVar.a(this.f41502u);
            this.A.a(this.I);
            this.A.a(this.f41506y);
            this.f41487f.setWebViewListener(this.J);
            this.f41487f.setObject(this.A);
            this.f41487f.loadUrl(strA);
            MBBannerWebView mBBannerWebView2 = this.f41487f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.b(this.f41499r);
            a(bVar2);
        }
        return true;
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.f41484c.isReport();
        if (!zIsReport) {
            this.f41484c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f41483b && (imageView = this.f41488g) != null && imageView.getVisibility() == 0) {
            this.f41488g.setVisibility(8);
            this.f41488g.setOnClickListener(null);
            if (this.f41485d == null || this.f41488g.getParent() == null) {
                return;
            }
            this.f41485d.removeView(this.f41488g);
        }
    }

    private void f() {
        if (this.f41483b && this.f41488g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
            this.f41488g = imageView;
            imageView.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_banner_close", "drawable"));
            this.f41488g.setVisibility(8);
            this.f41488g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f41485d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.b(this.f41499r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f41487f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f41485d.removeView(this.f41487f);
        }
        if (this.f41486e == null) {
            this.f41486e = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
            this.f41504w = new j();
            this.f41486e.setOnClickListener(new k());
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 296);
        if (TextUtils.isEmpty(this.f41484c.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, this.f41484c.getLocalRequestId()).a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
        a1.a(this.f41486e, this.f41484c.getLocalRequestId(), this.f41484c.getLocalAllowTrackClick(), this.f41504w);
        String imageUrl = this.f41484c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.b(this.f41499r);
        a(bVar2);
    }

    private void i() {
        AdSession adSession = this.B;
        if (adSession != null) {
            adSession.finish();
            this.B = null;
            p0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.f41484c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, campaignEx.getLocalRequestId());
                cVarA.g(this.f41505x);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            p0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.f41484c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, campaignEx.getLocalRequestId());
                cVarA.g(this.f41505x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.f41500s));
                eVar.a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.f41484c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th2) {
            p0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.f41484c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, campaignEx.getLocalRequestId());
                cVarA.g(this.f41505x);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            p0.b("BannerShowManager", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f41485d == null) {
            return;
        }
        CampaignEx campaignEx = this.f41484c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().d());
            mBAdChoice.setCampaign(this.f41484c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.internal.play_billing.a.a(6.0f), com.google.android.gms.internal.play_billing.a.a(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f41485d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.f41483b || (imageView = this.f41488g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f41488g.setVisibility(0);
            this.f41488g.setOnClickListener(this.H);
        }
        if (this.f41488g.getParent() != null || this.f41485d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.google.android.gms.internal.play_billing.a.a(12.0f), com.google.android.gms.internal.play_billing.a.a(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f41485d.addView(this.f41488g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f41486e != null) {
            MBBannerWebView mBBannerWebView = this.f41487f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f41486e.getVisibility() != 0) {
                this.f41486e.setVisibility(0);
            }
            this.f41505x = 2;
            if (this.f41485d != null) {
                RelativeLayout.LayoutParams layoutParamsE = e2.e(-1, -1, 10);
                this.f41486e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f41486e.getParent() == null) {
                    this.f41485d.addView(this.f41486e, layoutParamsE);
                }
                a(true);
            }
        }
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f41484c, this.f41497p);
        if (this.f41482a != null) {
            this.f41482a = null;
        }
        MBBannerWebView mBBannerWebView = this.f41487f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.J != null) {
            this.J = null;
        }
        ImageView imageView = this.f41488g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f41486e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f41485d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f41487f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.A;
        if (bVar != null) {
            bVar.a();
        }
        if (this.I != null) {
            this.I = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f41497p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p);
    }

    public void c(boolean z10) {
        this.f41483b = z10;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.f41484c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.b(this.f41499r);
            a(bVar);
            return;
        }
        if (!com.mbridge.msdk.foundation.tools.g.a(campaignExA, (Context) null, this.f41485d, campaignExA.getImpReportType())) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880044);
            bVar2.b(this.f41499r);
            a(bVar2);
            return;
        }
        this.D.removeCallbacks(this.E);
        f();
        this.f41492k = false;
        this.f41493l = false;
        this.f41496o = false;
        if (!TextUtils.isEmpty(this.f41484c.getBannerHtml()) || !TextUtils.isEmpty(this.f41484c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, this.f41484c);
        }
        this.D.postDelayed(this.E, MBInterstitialActivity.WEB_LOAD_TIME);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41484c.getBannerHtml()) || !TextUtils.isEmpty(this.f41484c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z10) {
        this.f41491j = z10;
        p();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            d.this.f41492k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.f41494m = true;
            CampaignEx campaignEx = d.this.f41484c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.c(i10 + " WebView receive error: " + i10 + "  message : " + str);
            bVar.b(d.this.f41499r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView) {
            d.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
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
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
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
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    public class C0284d implements com.mbridge.msdk.foundation.feedback.a {
        public C0284d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            d.this.f41485d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.f41485d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            d.this.f41485d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f41487f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(boolean z10, int i10) {
        this.f41506y = i10;
        if (i10 != 0) {
            this.f41483b = z10;
            return;
        }
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f41497p);
        if (lVarE != null) {
            this.f41483b = lVarE.g() == 1;
        }
    }

    public int c() {
        return this.f41505x;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            return null;
        }
        ArrayList<CampaignEx> ads = campaignUnit.getAds();
        this.f41502u = ads;
        if (ads == null || ads.size() <= 0) {
            return null;
        }
        return this.f41502u.get(0);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends com.mbridge.msdk.foundation.same.task.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.b(d.this.f41484c.getLocalRequestId());
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }
    }

    private String a(CampaignEx campaignEx) {
        String bannerUrl = "";
        if (campaignEx != null) {
            try {
                bannerUrl = campaignEx.getBannerUrl();
                if (TextUtils.isEmpty(bannerUrl)) {
                    bannerUrl = campaignEx.getBannerHtml();
                    File file = new File(bannerUrl);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return "file:////" + bannerUrl;
                    }
                }
                return bannerUrl;
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage());
            }
        }
        return bannerUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f41487f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f41485d.removeView(this.f41487f);
        }
        ImageView imageView = this.f41486e;
        if (imageView != null && imageView.getParent() != null) {
            this.f41486e.setVisibility(8);
            this.f41485d.removeView(this.f41486e);
        }
        ImageView imageView2 = this.f41488g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f41485d.removeView(this.f41488g);
            this.f41488g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f41497p);
        ImageView imageView3 = this.f41489h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f41485d.removeView(this.f41489h);
            this.f41489h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f41497p, this.f41502u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f41482a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.f41484c == null || d()) {
            return;
        }
        this.D.removeCallbacks(this.E);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f41482a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    private boolean a() {
        if (this.f41485d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f41484c;
        return (d1.a(this.f41485d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f41495n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39792m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f41487f, i10, i11);
    }

    private void a(boolean z10) {
        if (this.f41485d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f41497p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z10 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f40663e, com.mbridge.msdk.foundation.feedback.b.f40662d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.f41485d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f41497p, new C0284d());
            this.f41484c.setCampaignUnitId(this.f41497p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f41497p, this.f41484c);
        }
    }

    public void b(boolean z10) {
        this.f41490i = z10;
        p();
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39793n);
            } catch (Throwable th2) {
                p0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void a(String str) {
        this.f41499r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        try {
            CampaignEx campaignEx = this.f41484c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f41497p, campaignEx.getLocalRequestId());
                cVarA.g(this.f41505x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i10));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.f41484c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th2) {
            p0.b("BannerShowManager", th2.getMessage());
        }
    }
}
