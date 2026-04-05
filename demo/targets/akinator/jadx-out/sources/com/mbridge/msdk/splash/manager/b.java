package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.e2;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f42799b;

    /* renamed from: c, reason: collision with root package name */
    protected MBSplashView f42800c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f42801d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f42802e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42803f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f42804g;

    /* renamed from: h, reason: collision with root package name */
    private View f42805h;

    /* renamed from: i, reason: collision with root package name */
    protected String f42806i;

    /* renamed from: j, reason: collision with root package name */
    private String f42807j;

    /* renamed from: k, reason: collision with root package name */
    protected MBridgeIds f42808k;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f42814q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f42815r;

    /* renamed from: s, reason: collision with root package name */
    protected Context f42816s;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f42818u;

    /* renamed from: v, reason: collision with root package name */
    private i f42819v;

    /* renamed from: w, reason: collision with root package name */
    private AdSession f42820w;

    /* renamed from: a, reason: collision with root package name */
    protected final String f42798a = "SplashShowManager";

    /* renamed from: l, reason: collision with root package name */
    protected int f42809l = 5;

    /* renamed from: m, reason: collision with root package name */
    protected String f42810m = "点击跳过|";

    /* renamed from: n, reason: collision with root package name */
    protected String f42811n = "点击跳过|";

    /* renamed from: o, reason: collision with root package name */
    protected String f42812o = "秒";

    /* renamed from: p, reason: collision with root package name */
    protected String f42813p = "秒后自动关闭";

    /* renamed from: t, reason: collision with root package name */
    protected boolean f42817t = true;

    /* renamed from: x, reason: collision with root package name */
    private View.OnClickListener f42821x = new a();

    /* renamed from: y, reason: collision with root package name */
    public Handler f42822y = new HandlerC0324b(Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    private boolean f42823z = true;
    protected j A = new e();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (b.this.f42803f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    public class HandlerC0324b extends Handler {
        public HandlerC0324b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r9) throws org.json.JSONException {
            /*
                r8 = this;
                java.lang.String r1 = "OMSDK"
                super.handleMessage(r9)
                int r9 = r9.what
                r0 = 2
                r2 = 1
                if (r9 == r2) goto La2
                if (r9 == r0) goto Lf
                goto La1
            Lf:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.splash.manager.b.d(r9)
                if (r9 == 0) goto La1
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.splash.manager.b.d(r9)
                boolean r9 = r9.isActiveOm()
                if (r9 == 0) goto La1
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.splash.view.MBSplashView r9 = r9.f42800c
                if (r9 == 0) goto La1
                com.mbridge.msdk.splash.view.MBSplashWebview r9 = r9.getSplashWebview()
                if (r9 == 0) goto La1
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                com.iab.omid.library.mmadbridge.adsession.AdSession r2 = r9.getAdSession()     // Catch: java.lang.Throwable -> L51
                com.mbridge.msdk.splash.manager.b.a(r0, r2)     // Catch: java.lang.Throwable -> L51
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                com.iab.omid.library.mmadbridge.adsession.AdSession r0 = com.mbridge.msdk.splash.manager.b.e(r0)     // Catch: java.lang.Throwable -> L51
                if (r0 == 0) goto L53
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                com.iab.omid.library.mmadbridge.adsession.AdSession r0 = com.mbridge.msdk.splash.manager.b.e(r0)     // Catch: java.lang.Throwable -> L51
                com.iab.omid.library.mmadbridge.adsession.AdEvents r0 = com.iab.omid.library.mmadbridge.adsession.AdEvents.createAdEvents(r0)     // Catch: java.lang.Throwable -> L51
                r0.loaded()     // Catch: java.lang.Throwable -> L51
                r0.impressionOccurred()     // Catch: java.lang.Throwable -> L51
                goto L53
            L51:
                r0 = move-exception
                goto L59
            L53:
                java.lang.String r0 = "adSession.impressionOccurred()"
                com.mbridge.msdk.foundation.tools.p0.a(r1, r0)     // Catch: java.lang.Throwable -> L51
                return
            L59:
                java.lang.String r2 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.p0.a(r1, r2)
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                if (r1 == 0) goto La1
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r3 = r1.getRequestId()
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r4 = r1.getRequestIdNotice()
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r5 = r1.getId()
                com.mbridge.msdk.foundation.same.report.h r2 = new com.mbridge.msdk.foundation.same.report.h
                android.content.Context r9 = r9.getContext()
                r2.<init>(r9)
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                java.lang.String r6 = r9.f42806i
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r1 = "fetch OM failed, exception"
                r9.<init>(r1)
                java.lang.String r7 = b0.e2.o(r0, r9)
                r2.a(r3, r4, r5, r6, r7)
            La1:
                return
            La2:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r9 = com.mbridge.msdk.splash.manager.b.b(r9)
                if (r9 != 0) goto Laf
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.splash.manager.b.c(r9)
            Laf:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                int r1 = r9.f42809l
                if (r1 <= 0) goto Le3
                boolean r9 = com.mbridge.msdk.foundation.feedback.b.f40664f
                if (r9 != 0) goto Ld1
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r0 = r9.f42814q
                if (r0 != 0) goto Ld1
                int r0 = r9.f42809l
                int r0 = r0 - r2
                r9.f42809l = r0
                com.mbridge.msdk.splash.manager.b.a(r9, r0)
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r0 = r9.f42817t
                if (r0 != 0) goto Ld6
                r9.g()
                goto Ld6
            Ld1:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                r9.f()
            Ld6:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                android.os.Handler r9 = r9.f42822y
                r9.removeMessages(r2)
                r0 = 1000(0x3e8, double:4.94E-321)
                r8.sendEmptyMessageDelayed(r2, r0)
                return
            Le3:
                r9.b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.b.HandlerC0324b.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, b.this.f42800c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, b.this.f42800c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            t0.b(campaign, b.this.f42800c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42829a;

        public f(int i10) {
            this.f42829a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f42829a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f42831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42832b;

        public g(Context context, CampaignEx campaignEx) {
            this.f42831a = context;
            this.f42832b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f42831a)).b(this.f42832b.getId());
            } catch (Exception unused) {
                p0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f42800c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            p0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f42809l = i10;
            bVar.f42822y.removeMessages(1);
            b.this.f42822y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f42822y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f42801d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f42801d.a(bVar.f42808k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f42799b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                p0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f42822y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f42809l = i11;
                bVar.f42822y.removeMessages(1);
                b.this.f42822y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) throws Resources.NotFoundException {
        this.f42806i = str2;
        this.f42807j = str;
        this.f42808k = new MBridgeIds(str, str2);
        this.f42816s = context;
        if (this.f42804g == null) {
            TextView textView = new TextView(context);
            this.f42804g = textView;
            textView.setGravity(1);
            this.f42804g.setTextIsSelectable(false);
            this.f42804g.setPadding(u0.a(context, 5.0f), u0.a(context, 5.0f), u0.a(context, 5.0f), u0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f42804g.getLayoutParams();
            this.f42804g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(u0.a(context, 100.0f), u0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f42799b == null) {
                return;
            }
            this.f42815r = true;
            if (this.f42801d != null && (mBSplashView = this.f42800c) != null) {
                if (mBSplashView.getContext() != null && (this.f42800c.getContext() instanceof Activity) && ((Activity) this.f42800c.getContext()).isFinishing()) {
                    p0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f42800c.isShown()) {
                    this.f42801d.b(this.f42808k);
                } else {
                    this.f42801d.a(this.f42808k, "SplashView or container is not visibility");
                }
            }
            if (!this.f42799b.isReport()) {
                MBSplashView mBSplashView2 = this.f42800c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f42799b);
                } else {
                    b(this.f42799b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42799b, this.f42806i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j() {
        String str;
        if (this.f42803f) {
            str = this.f42811n + this.f42809l + this.f42812o;
        } else {
            str = this.f42809l + this.f42813p;
        }
        this.f42804g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f42800c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f42800c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.g.a(splashWebview2, this.f42799b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f42799b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.g.a(arrayList, lVarA);
        } else if (this.f42823z) {
            this.f42823z = false;
            this.f42800c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.g.a(arrayList, lVarA);
            if (this.f42799b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f42799b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f42800c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.m().d(), splashWebview, splashWebview.getUrl(), this.f42799b);
                this.f42820w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f42820w.registerAdView(splashWebview);
                    this.f42820w.start();
                }
                p0.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                p0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = this.f42799b;
                if (campaignEx2 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(campaignEx2.getRequestId(), this.f42799b.getRequestIdNotice(), this.f42799b.getId(), this.f42806i, e2.o(th2, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f42806i);
        this.f42822y.removeMessages(1);
        this.f42822y.sendEmptyMessageDelayed(1, 1000L);
        this.f42822y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f42799b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42799b.getMaitve(), this.f42799b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f42806i, this.f42799b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f42818u == null) {
                    this.f42818u = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
                }
                if (this.f42818u.getVisibility() != 0) {
                    this.f42818u.setVisibility(0);
                }
                u0.a(this.f42818u, bitmapDrawableA, this.f42800c.getResources().getDisplayMetrics());
                if (this.f42818u.getParent() == null) {
                    this.f42800c.addView(this.f42818u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f42820w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f42818u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f42817t = true;
        if (this.f42800c != null && this.f42809l > 0 && (handler = this.f42822y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f42800c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f42800c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f42799b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.g.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f42822y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f40664f || (mBSplashView = this.f42800c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f42800c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f42801d != null) {
            this.f42801d = null;
        }
        if (this.f42819v != null) {
            this.f42819v = null;
        }
        if (this.f42821x != null) {
            this.f42821x = null;
        }
        MBSplashView mBSplashView = this.f42800c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f42806i);
    }

    private void e() throws Resources.NotFoundException {
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (contextD != null) {
            String strH = com.mbridge.msdk.foundation.controller.c.m().h();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", strH);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", strH);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", strH);
            this.f42811n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f42813p = string;
            this.f42810m = string;
            this.f42812o = contextD.getResources().getString(identifier3);
            this.f42804g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            this.f42804g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strH)));
        }
    }

    public void c(int i10) {
        this.f42809l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f42799b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f42799b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f42817t = false;
        if (this.f42800c != null && this.f42809l > 0 && (handler = this.f42822y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f42800c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f42800c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f42799b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f42806i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f42801d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) throws JSONException {
        MBSplashView mBSplashView = this.f42800c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f42800c.getSplashSignalCommunicationImpl() != null) {
                this.f42800c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f42809l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f42801d;
        if (dVar != null) {
            dVar.a(this.f42808k, i10 * 1000);
        }
        if (this.f42805h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f42821x);
        }
        this.f42805h = viewGroup;
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
                p0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f42803f);
        this.f42799b = campaignEx;
        this.f42800c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        com.mbridge.msdk.splash.signal.b bVar = splashSignalCommunicationImpl;
        if (splashSignalCommunicationImpl == null) {
            com.mbridge.msdk.splash.signal.b bVar2 = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f42807j, this.f42806i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            bVar2.a(arrayList);
            bVar = bVar2;
        }
        bVar.b(this.f42809l);
        bVar.a(this.f42803f ? 1 : 0);
        if (this.f42819v == null) {
            this.f42819v = new i(this, null);
        }
        bVar.a(this.f42819v);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f42805h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f42804g.setVisibility(8);
            }
            j();
            a(this.f42804g);
            mBSplashView.setCloseView(this.f42804g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f42805h);
            mBSplashView.setCloseView(this.f42805h);
        }
        a1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f42799b.getLocalRequestId(), this.f42799b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f42823z = true;
        k();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f42800c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f42800c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f42800c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f42800c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f42822y != null && (campaignEx = this.f42799b) != null && campaignEx.isActiveOm()) {
            this.f42822y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
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
                p0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f42799b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f42800c) == null || mBSplashView.getSplashWebview() == null || this.f42800c.isDynamicView() || !this.f42799b.isMraid() || (context = this.f42800c.getContext()) == null) {
            return;
        }
        try {
            int iA = h0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = u0.a(context, 35.0f);
            int iA3 = u0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            u0.a(3, imageView, this.f42799b, context, true, new h());
            this.f42800c.addView(imageView);
        } catch (Throwable th2) {
            p0.b("SplashShowManager", th2.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f42799b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f42806i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f42806i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f42806i, this.f42799b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f42800c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f42806i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f42806i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f40663e, com.mbridge.msdk.foundation.feedback.b.f40662d);
                    }
                    layoutParams.topMargin = com.google.android.gms.internal.play_billing.a.a(10.0f);
                    layoutParams.leftMargin = com.google.android.gms.internal.play_billing.a.a(10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f42800c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f42806i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f42801d;
        if (dVar != null) {
            dVar.a(this.f42808k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f42800c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f42800c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f42800c.getParent()).removeView(this.f42800c);
    }

    public void a(boolean z10) {
        this.f42803f = z10;
        if (z10) {
            this.f42810m = this.f42811n;
        } else {
            this.f42810m = this.f42813p;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f42802e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42806i);
            this.f42802e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f42806i);
        this.f42802e.a(campaignEx);
        if (!this.f42799b.isReportClick()) {
            this.f42799b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f42801d;
        if (dVar != null) {
            dVar.a(this.f42808k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f42806i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f42821x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f42801d;
            if (dVar != null) {
                dVar.a(this.f42808k, i10);
                this.f42801d = null;
                com.mbridge.msdk.splash.report.a.a(this.f42806i, this.f42799b);
            }
            ImageView imageView = this.f42818u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f42800c) != null) {
                mBSplashView.removeView(this.f42818u);
                this.f42818u.setVisibility(8);
            }
            this.f42815r = false;
            com.mbridge.msdk.splash.report.a.a(this.f42806i, i10, this.f42799b);
            Handler handler = this.f42822y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            p0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.m().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39792m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
    }
}
