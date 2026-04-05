package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b0.e2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f39434b;

    /* renamed from: c, reason: collision with root package name */
    protected MBNativeAdvancedView f39435c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.advanced.middle.d f39436d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f39437e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f39438f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39439g;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f39441i;

    /* renamed from: j, reason: collision with root package name */
    protected String f39442j;

    /* renamed from: k, reason: collision with root package name */
    private String f39443k;

    /* renamed from: l, reason: collision with root package name */
    protected MBridgeIds f39444l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39445m;

    /* renamed from: a, reason: collision with root package name */
    private String f39433a = "NativeAdvancedShowManager";

    /* renamed from: h, reason: collision with root package name */
    private int f39440h = -1;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f39446n = new ViewOnClickListenerC0249a();

    /* renamed from: o, reason: collision with root package name */
    public Handler f39447o = new b(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f39448p = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0249a implements View.OnClickListener {
        public ViewOnClickListenerC0249a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f39439g) {
                a.this.a(1);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f39434b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f39435c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    p0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th2) {
                p0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = a.this.f39434b;
                if (campaignEx2 != null) {
                    new h(advancedNativeWebview.getContext()).a(campaignEx2.getRequestId(), a.this.f39434b.getRequestIdNotice(), a.this.f39434b.getId(), a.this.f39442j, e2.o(th2, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.advanced.middle.a {
        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f39440h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f39435c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f39435c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            p0.b(a.this.f39433a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f39436d != null) {
                aVar.f39445m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f39436d.f(aVar2.f39444l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f39436d.a(aVar3.f39444l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f39436d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f39436d.b(aVar.f39444l);
                        a aVar2 = a.this;
                        aVar2.f39436d.d(aVar2.f39444l);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f39434b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    a.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                p0.b(a.this.f39433a, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f39455b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f39454a = campaignEx;
            this.f39455b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f39454a, this.f39455b, false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f39457a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39458b;

        public f(Context context, CampaignEx campaignEx) {
            this.f39457a = context;
            this.f39458b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f39457a)).b(this.f39458b.getId());
            } catch (Exception unused) {
                p0.b(a.this.f39433a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f39442j = str2;
        this.f39443k = str;
        this.f39444l = new MBridgeIds(str, str2);
        if (this.f39441i == null) {
            ImageView imageView = new ImageView(context);
            this.f39441i = imageView;
            imageView.setPadding(u0.a(context, 2.0f), u0.a(context, 2.0f), u0.a(context, 2.0f), u0.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        this.f39441i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f39441i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(u0.a(contextD, 29.0f), u0.a(contextD, 16.0f));
        }
        this.f39441i.setLayoutParams(layoutParams);
        this.f39441i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
    }

    private void h() {
        if (this.f39434b.isReport()) {
            return;
        }
        a(this.f39434b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39434b, this.f39442j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f39436d;
        if (dVar != null) {
            dVar.e(this.f39444l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f39435c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f39434b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.f39434b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f39434b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f39435c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f39435c == null || com.mbridge.msdk.foundation.feedback.b.f40664f || (advancedNativeWebview = this.f39435c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f39436d != null) {
            this.f39436d = null;
        }
        if (this.f39448p != null) {
            this.f39448p = null;
        }
        if (this.f39446n != null) {
            this.f39446n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f39435c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f39435c.destroy();
        }
        if (this.f39438f != null) {
            this.f39438f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39442j);
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f39448p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39793n);
            } catch (Throwable th2) {
                p0.b(this.f39433a, th2.getMessage());
            }
        }
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
                p0.b(this.f39433a, th2.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f39438f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f39436d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f39434b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f39452a;

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f39452a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(a.this.f39433a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39452a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(a.this.f39433a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39452a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(a.this.f39433a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39452a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f39434b = campaignEx;
        this.f39435c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f39442j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f39442j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f40663e, com.mbridge.msdk.foundation.feedback.b.f40662d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f39439g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f39443k, this.f39442j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f39439g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f39448p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        a1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f39439g) {
            this.f39441i.setVisibility(8);
        }
        a(this.f39441i);
        mBNativeAdvancedView.setCloseView(this.f39441i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.g.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f39438f == null || !lVarA.a() || this.f39438f.d() == null || this.f39438f.d().getAlpha() < 0.5f || this.f39438f.d().getVisibility() != 0 || this.f39445m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.g.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.m().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f39442j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f39442j, campaignEx);
        CampaignEx campaignEx2 = this.f39434b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.m().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f39434b);
                if (adSessionA != null) {
                    advancedNativeWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(advancedNativeWebview);
                    adSessionA.start();
                    p0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th2) {
                p0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f39434b;
                if (campaignEx3 != null) {
                    new h(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx3.getRequestId(), this.f39434b.getRequestIdNotice(), this.f39434b.getId(), this.f39442j, e2.o(th2, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f39440h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f39442j);
        com.mbridge.msdk.advanced.common.c.b(this.f39443k + this.f39442j + campaignEx.getRequestId());
        this.f39447o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39434b.getMaitve(), this.f39434b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f39442j);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f39442j, campaignEx, "h5_native");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f39442j);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().d(), this.f39442j);
    }

    public void a(boolean z10) {
        this.f39439g = z10;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f39446n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f39436d;
        if (dVar != null) {
            dVar.c(this.f39444l);
            this.f39436d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f39442j, this.f39434b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f39442j, i10, this.f39434b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f39435c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f39435c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f39447o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.m().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39792m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
    }
}
