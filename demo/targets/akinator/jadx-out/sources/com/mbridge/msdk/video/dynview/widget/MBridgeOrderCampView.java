package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import j1.o2;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f44510m;

    /* renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f44511n;

    /* renamed from: o, reason: collision with root package name */
    private int f44512o;

    /* renamed from: p, reason: collision with root package name */
    private int f44513p;

    /* renamed from: q, reason: collision with root package name */
    private int f44514q;

    /* renamed from: r, reason: collision with root package name */
    private int f44515r;

    /* renamed from: s, reason: collision with root package name */
    private String f44516s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f44517t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f44518u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44519v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f44520w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f44521x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f44522y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.video.dynview.listener.c {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    p0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44527a;

        public d(String str) {
            this.f44527a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f44611a, this.f44527a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f44519v = false;
        this.f44520w = new a();
        this.f44522y = false;
    }

    private void f() {
        if (this.f44518u == null) {
            return;
        }
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF == null) {
            this.f44518u.setVisibility(8);
            return;
        }
        String strC = gVarF.c();
        if (TextUtils.isEmpty(strC)) {
            this.f44518u.setVisibility(8);
        }
        this.f44518u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f44612b);
        } catch (Throwable th2) {
            p0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f44511n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f44521x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f44520w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.m().d(), this.f44511n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f44510m = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() throws org.json.JSONException {
        /*
            r4 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f44511n
            if (r0 != 0) goto L8
            goto L30
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f44511n
            int r1 = r1.size()
            if (r0 >= r1) goto L30
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
            r1.<init>()     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = "camp_position"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L1c
            goto L24
        L1c:
            r2 = move-exception
            goto L21
        L1e:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L21:
            r2.printStackTrace()
        L24:
            com.mbridge.msdk.video.module.listener.a r2 = r4.notifyListener
            if (r2 == 0) goto L2d
            r3 = 110(0x6e, float:1.54E-43)
            r2.a(r3, r1)
        L2d:
            int r0 = r0 + 1
            goto L9
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f44521x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f44511n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f44512o = i10;
        this.f44513p = i11;
        this.f44514q = i12;
        this.f44515r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f44522y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f44510m;
        if (mBridgeOrderCampView == null || !this.f44522y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f44519v, "mbridge_native_order_camp_controller"));
        this.f44517t = (FeedBackButton) this.f44510m.findViewById(filterFindViewId(this.f44519v, "mbridge_native_order_camp_feed_btn"));
        this.f44518u = (ImageView) this.f44510m.findViewById(filterFindViewId(this.f44519v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f44512o, this.f44514q, this.f44513p, this.f44515r);
        }
        if (this.f44517t != null) {
            try {
                e();
            } catch (Exception e10) {
                p0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f44518u != null) {
            try {
                f();
            } catch (Exception e11) {
                p0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f44510m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f44510m.startAnimation(translateAnimation);
    }

    private void e() {
        List<CampaignEx> list = this.f44511n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f44517t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f44516s = this.f44511n.get(0).getCampaignUnitId();
        this.f44612b = this.f44511n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(o2.o(new StringBuilder(), this.f44516s, "_2"), this.f44612b);
        if (this.f44517t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f44517t.setVisibility(8);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(o2.o(new StringBuilder(), this.f44516s, "_2"), new c());
            com.mbridge.msdk.foundation.feedback.b.b().a(o2.o(new StringBuilder(), this.f44516s, "_2"), this.f44517t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r10, int r11, int r12) throws org.json.JSONException {
        /*
            r9 = this;
            java.lang.String r0 = "order_view_click"
            if (r10 == 0) goto L62
            boolean r1 = r10.isDynamicView()
            if (r1 == 0) goto L62
            com.mbridge.msdk.foundation.entity.CampaignEx$c r1 = r10.getRewardTemplateMode()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = ""
            if (r1 == 0) goto L25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r3.<init>()     // Catch: java.lang.Exception -> L27
            int r1 = r1.f()     // Catch: java.lang.Exception -> L27
            r3.append(r1)     // Catch: java.lang.Exception -> L27
            r3.append(r2)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L27
        L25:
            r7 = r2
            goto L2a
        L27:
            r0 = move-exception
            r10 = r0
            goto L59
        L2a:
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L27
            android.content.Context r1 = r1.d()     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>(r0)     // Catch: java.lang.Exception -> L27
            r2.append(r7)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r10.getCampaignUnitId()     // Catch: java.lang.Exception -> L27
            boolean r3 = r10.isBidCampaign()     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r10.getRequestId()     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r10.getRequestIdNotice()     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = r10.getId()     // Catch: java.lang.Exception -> L27
            r8 = r1
            r1 = r0
            r0 = r8
            com.mbridge.msdk.foundation.same.report.j.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L27
            goto L62
        L59:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.p0.b(r0, r10)
        L62:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L79
            r10.<init>()     // Catch: org.json.JSONException -> L79
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f40713j     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r11 = r9.a(r11)     // Catch: org.json.JSONException -> L76
            r10.put(r0, r11)     // Catch: org.json.JSONException -> L76
            java.lang.String r11 = "camp_position"
            r10.put(r11, r12)     // Catch: org.json.JSONException -> L76
            goto L80
        L76:
            r0 = move-exception
            r11 = r0
            goto L7d
        L79:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = 0
        L7d:
            r11.printStackTrace()
        L80:
            com.mbridge.msdk.video.module.listener.a r11 = r9.notifyListener
            if (r11 == 0) goto L89
            r12 = 105(0x69, float:1.47E-43)
            r11.a(r12, r10)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44519v = false;
        this.f44520w = new a();
        this.f44522y = false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.video.dynview.listener.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44524a;

        public b(ViewGroup viewGroup) {
            this.f44524a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f44510m.addView(aVar.b());
                    MBridgeOrderCampView.this.f44519v = aVar.c();
                    this.f44524a.removeAllViews();
                    this.f44524a.addView(MBridgeOrderCampView.this.f44510m);
                    f.a(com.mbridge.msdk.foundation.controller.c.m().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f44511n, ((CampaignEx) MBridgeOrderCampView.this.f44511n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f44521x != null) {
                        MBridgeOrderCampView.this.f44521x.a();
                    }
                } catch (Exception e10) {
                    p0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.m().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f44511n, ((CampaignEx) MBridgeOrderCampView.this.f44511n.get(0)).getCampaignUnitId(), aVar.b());
                if (MBridgeOrderCampView.this.f44521x != null) {
                    MBridgeOrderCampView.this.f44521x.b();
                }
            } catch (Exception e10) {
                p0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }
}
