package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.APSAnalytics;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.C3434s;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c0;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.impl.a;
import com.mbridge.msdk.videocommon.a;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* renamed from: s0, reason: collision with root package name */
    private static final String f44210s0 = "MBTempContainer";
    private int A;
    private int B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private String I;
    private String J;
    private List<CampaignEx> K;
    private int L;
    private com.mbridge.msdk.foundation.same.report.metrics.c M;
    protected boolean N;
    private LayoutInflater O;
    protected boolean P;
    protected k Q;
    protected WindVaneWebView R;
    protected MBridgeContainerView S;
    protected Handler T;
    private int U;
    private int V;
    protected Runnable W;

    /* renamed from: a0, reason: collision with root package name */
    protected Runnable f44211a0;

    /* renamed from: b0, reason: collision with root package name */
    private View f44212b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f44213c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f44214d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f44215e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f44216f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f44217g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f44218h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f44219i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f44220j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f44221k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f44222l0;

    /* renamed from: m0, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f44223m0;

    /* renamed from: n0, reason: collision with root package name */
    private AdSession f44224n0;

    /* renamed from: o0, reason: collision with root package name */
    private MediaEvents f44225o0;

    /* renamed from: p0, reason: collision with root package name */
    private AdEvents f44226p0;

    /* renamed from: q0, reason: collision with root package name */
    private Runnable f44227q0;

    /* renamed from: r, reason: collision with root package name */
    private View f44228r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f44229r0;

    /* renamed from: s, reason: collision with root package name */
    private CampaignEx f44230s;

    /* renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f44231t;

    /* renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f44232u;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f44233v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f44234w;

    /* renamed from: x, reason: collision with root package name */
    private int f44235x;

    /* renamed from: y, reason: collision with root package name */
    private String f44236y;

    /* renamed from: z, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f44237z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f44212b0.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                MBTempContainer.this.U = -3;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                MBTempContainer.this.U = -4;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements MBridgeVideoView.u {
        public d() {
        }

        @Override // com.mbridge.msdk.video.module.MBridgeVideoView.u
        public void a() {
            if (MBTempContainer.this.f44230s != null) {
                MBTempContainer.this.l();
                if (!MBTempContainer.this.f44230s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f45181p || MBTempContainer.this.f44230s.isCampaignIsFiltered()) {
                    MBTempContainer.this.f44232u.a(MBTempContainer.this.M);
                }
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f44230s, ((AbstractJSContainer) MBTempContainer.this).f45169d, MBTempContainer.this.f44235x);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements com.mbridge.msdk.video.dynview.listener.f {
        public e() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.f
        public void a() {
            MBTempContainer.this.w();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.f44212b0 != null) {
                MBTempContainer.this.f44212b0.setVisibility(8);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractJSContainer) MBTempContainer.this).f45168c != null) {
                ((AbstractJSContainer) MBTempContainer.this).f45168c.finish();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements d.b {
        public i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            MBridgeContainerView mBridgeContainerView;
            p0.b(MBTempContainer.f44210s0, "volume is : " + d10);
            try {
                if (!MBTempContainer.this.f44230s.isMraid() || (mBridgeContainerView = MBTempContainer.this.S) == null || mBridgeContainerView.getH5EndCardView() == null) {
                    return;
                }
                MBTempContainer.this.S.getH5EndCardView().volumeChange(d10);
            } catch (Exception e10) {
                p0.b(MBTempContainer.f44210s0, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f44212b0.setBackgroundColor(0);
            MBTempContainer.this.f44212b0.setVisibility(0);
            MBTempContainer.this.f44212b0.bringToFront();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface k {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a implements k {

            /* renamed from: a, reason: collision with root package name */
            private boolean f44248a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void a(boolean z10) {
                this.f44248a = z10;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void onError(String str) {
                p0.b("ActivityErrorListener", str);
                this.f44248a = true;
            }
        }

        void a(boolean z10);

        void onError(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends AppletSchemeCallBack {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f44249a;

        public l(CampaignEx campaignEx) {
            this.f44249a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestFailed(int i10, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                p0.a(MBTempContainer.f44210s0, "request wx scheme failed: errorCode: " + i10 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f44249a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b(MBTempContainer.f44210s0, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                p0.a(MBTempContainer.f44210s0, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                p0.a(MBTempContainer.f44210s0, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f44249a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b(MBTempContainer.f44210s0, e10.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class m extends com.mbridge.msdk.video.module.listener.impl.a {
        public m(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
        @Override // com.mbridge.msdk.video.module.listener.impl.a, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(int r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.m.a(int, java.lang.Object):void");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class n extends com.mbridge.msdk.video.module.listener.impl.f {
        private n() {
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            try {
                String string = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (((AbstractJSContainer) MBTempContainer.this).f45176k && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (iOptInt == 2) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.D;
                    } else if (iOptInt != 3) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.F;
                    } else {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.E;
                    }
                    MBTempContainer.this.B = iOptInt2;
                }
            } catch (Exception unused) {
                p0.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i10 == 120) {
                MBTempContainer.this.f44232u.a(((AbstractJSContainer) MBTempContainer.this).f45170e, ((AbstractJSContainer) MBTempContainer.this).f45169d);
            }
            if (i10 == 131) {
                MBTempContainer.this.getJSCommon().click(4, obj != null ? obj.toString() : "");
                return;
            }
            if (i10 == 126) {
                MBTempContainer.this.f44232u.a(false, ((AbstractJSContainer) MBTempContainer.this).f45170e, ((AbstractJSContainer) MBTempContainer.this).f45169d);
                return;
            }
            if (i10 == 127) {
                MBTempContainer.this.f44214d0 = true;
                MBTempContainer.this.f44232u.a(MBTempContainer.this.M);
                MBTempContainer.this.f44232u.a(((AbstractJSContainer) MBTempContainer.this).f45170e, ((AbstractJSContainer) MBTempContainer.this).f45169d);
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i10) {
                case 100:
                    MBTempContainer.this.f44221k0 = true;
                    MBTempContainer mBTempContainer = MBTempContainer.this;
                    mBTempContainer.T.postDelayed(mBTempContainer.f44227q0, 250L);
                    MBTempContainer.this.f44232u.a(MBTempContainer.this.M);
                    break;
                case 101:
                case 102:
                    MBTempContainer.this.getJSCommon().f();
                    break;
                case 103:
                    MBTempContainer.this.f44214d0 = true;
                    if (!MBTempContainer.this.f44230s.isMraid()) {
                        MBTempContainer.this.getJSCommon().f();
                        break;
                    } else {
                        MBTempContainer.this.onAdClose();
                        break;
                    }
                case 104:
                    MBTempContainer.this.onAdClose();
                    break;
                case 105:
                    if (com.mbridge.msdk.util.b.a()) {
                        MBTempContainer.this.setChinaCTACallBack();
                    }
                    MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }

        public /* synthetic */ n(MBTempContainer mBTempContainer, b bVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o extends a.C0354a {
        private o() {
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(boolean z10) {
            if (MBTempContainer.this.f44225o0 != null) {
                try {
                    MBTempContainer.this.f44225o0.adUserInteraction(InteractionType.CLICK);
                    p0.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e10) {
                    p0.b("omsdk", e10.getMessage());
                }
            }
            super.a(z10);
            MBTempContainer.this.f44232u.a(z10, ((AbstractJSContainer) MBTempContainer.this).f45170e, ((AbstractJSContainer) MBTempContainer.this).f45169d);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.f44218h0 = true;
            MBTempContainer.this.m();
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String strOptString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals(APSAnalytics.DEFAULT_SDK_VERSION) && ((AbstractJSContainer) MBTempContainer.this).f45168c != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f45181p) {
                            MBTempContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f45168c.finish();
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            if (MBTempContainer.this.f44229r0) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void onInitSuccess() {
            super.onInitSuccess();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.this.m();
            MBTempContainer.this.f44218h0 = true;
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.this.y();
            if (MBTempContainer.this.f44229r0) {
                MBTempContainer.this.onPause();
            }
        }

        public /* synthetic */ o(MBTempContainer mBTempContainer, b bVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a(int i10, String str) {
            super.a(i10, str);
            MBTempContainer.this.defaultLoad(i10, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0354a, com.mbridge.msdk.video.signal.a.InterfaceC0353a
        public void a() {
            super.a();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.T;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.W);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class p extends com.mbridge.msdk.video.module.listener.impl.f {
        private p() {
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            if (((AbstractJSContainer) MBTempContainer.this).f45176k) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            MBTempContainer.this.A = jSONObject.getInt("Alert_window_status");
                            MBTempContainer.this.B = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e10) {
                    p0.b("NotifyListener", e10.getMessage());
                }
            }
            if (i10 != 2) {
                if (i10 == 121) {
                    MBTempContainer.this.f44214d0 = true;
                    MBTempContainer.this.f44232u.b(((AbstractJSContainer) MBTempContainer.this).f45170e, ((AbstractJSContainer) MBTempContainer.this).f45169d);
                    MBTempContainer.this.f44219i0 = false;
                    return;
                }
                if (i10 == 16) {
                    if (com.mbridge.msdk.util.b.a()) {
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.getJSCommon().f();
                        return;
                    }
                }
                if (i10 == 17) {
                    MBTempContainer.this.f44214d0 = true;
                    MBridgeContainerView mBridgeContainerView = MBTempContainer.this.S;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i10) {
                    case 10:
                        MBTempContainer.this.f44219i0 = true;
                        if (MBTempContainer.this.f44230s != null && !r0.a().a("i_l_s_t_r_i", false)) {
                            MBTempContainer.this.l();
                            if (!MBTempContainer.this.f44230s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f45181p || MBTempContainer.this.f44230s.isCampaignIsFiltered()) {
                                MBTempContainer.this.f44232u.a(MBTempContainer.this.M);
                            }
                            com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f44230s, ((AbstractJSContainer) MBTempContainer.this).f45169d, MBTempContainer.this.f44235x);
                            break;
                        }
                        break;
                }
            }
            if (i10 == 12) {
                try {
                } catch (Throwable th2) {
                    p0.b("NotifyListener", th2.getMessage());
                }
                String string = obj instanceof String ? obj.toString() : "Play error but has no message.";
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f44230s, ((AbstractJSContainer) MBTempContainer.this).f45169d, string, MBTempContainer.this.f44235x);
                if (!MBTempContainer.this.f44219i0) {
                    if (((AbstractJSContainer) MBTempContainer.this).f45171f.C() == 0) {
                        MBTempContainer.this.f44232u.a(MBTempContainer.this.M, "play error");
                        MBTempContainer.this.f44219i0 = false;
                        MBTempContainer.this.onAdClose();
                        return;
                    } else {
                        MBTempContainer.this.l();
                        if (MBTempContainer.this.f44230s == null || !MBTempContainer.this.f44230s.isDynamicView() || !((AbstractJSContainer) MBTempContainer.this).f45181p || MBTempContainer.this.f44230s.isCampaignIsFiltered()) {
                            MBTempContainer.this.f44232u.a(MBTempContainer.this.M);
                        }
                    }
                }
            }
            MBTempContainer.this.getJSVideoModule().videoOperate(i10 == 2 ? 6 : 3);
            MBTempContainer.this.f44219i0 = false;
            if (MBTempContainer.this.f44225o0 == null || i10 != 2) {
                return;
            }
            p0.b("omsdk", "mbtc skip");
            try {
                MBTempContainer.this.f44225o0.skipped();
                MBTempContainer.this.f44225o0 = null;
            } catch (Exception e11) {
                p0.a("omsdk", e11.getMessage());
            }
        }

        public /* synthetic */ p(MBTempContainer mBTempContainer, b bVar) {
            this();
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f44235x = 1;
        this.f44236y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f44211a0 = new c();
        this.f44213c0 = false;
        this.f44214d0 = false;
        this.f44215e0 = false;
        this.f44217g0 = false;
        this.f44218h0 = false;
        this.f44219i0 = false;
        this.f44220j0 = false;
        this.f44221k0 = false;
        this.f44222l0 = false;
        this.f44224n0 = null;
        this.f44225o0 = null;
        this.f44226p0 = null;
        this.f44227q0 = new f();
        this.f44229r0 = false;
        init(context);
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                return (int) aVarC.i();
            }
            return 5;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 5;
        }
    }

    private int getCloseBtnTime() {
        CampaignEx campaignEx = this.f44230s;
        if (campaignEx == null) {
            return 1;
        }
        boolean zA = u0.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iC = u0.c(this.f44230s.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        return (!zA || iC < 0) ? this.f44230s.getCbd() > -2 ? this.f44230s.getCbd() : this.f45171f.i() : iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdClose() {
        int i10;
        try {
            com.mbridge.msdk.video.bt.module.listener.b bVar = this.f44233v;
            if (bVar == null) {
                Activity activity = this.f45168c;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f45176k && ((i10 = this.f45178m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                boolean z10 = true;
                if (this.B != 1) {
                    z10 = false;
                }
                bVar.a(z10, this.A);
            }
            this.f44233v.a(this.f44236y, this.f44214d0, this.f45173h);
        } catch (Exception unused) {
            Activity activity2 = this.f45168c;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.S;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void defaultLoad(int i10, String str) {
        int i11;
        superDefaultLoad(i10, str);
        CampaignEx campaignEx = this.f44230s;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f44230s.setTemplateRenderSucc(false);
        }
        if (!isLoadSuccess()) {
            b(i10, str);
            Activity activity = this.f45168c;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        b bVar = null;
        if (this.f44230s.getPlayable_ads_without_video() == 2) {
            this.S.setCampaign(this.f44230s);
            this.S.addOrderViewData(this.K);
            this.S.setUnitID(this.f45169d);
            this.S.setCloseDelayTime(getCloseBtnTime());
            this.S.setPlayCloseBtnTm(this.f45171f.u());
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f44230s, this.f44231t, this.f45173h, getInnerPlacementId(), this.f45169d, new n(this, bVar), this.f45171f.A(), this.f45181p));
            this.S.preLoadData(this.f44237z);
            this.f44237z.getJSCommon().g(this.f45175j);
            this.S.showPlayableView();
        } else {
            b(i10, str);
            this.f44212b0.setVisibility(8);
            loadModuleDatas();
            int iE = this.f45171f.E();
            int h5CloseType = getH5CloseType();
            int i12 = h5CloseType != 0 ? h5CloseType : iE;
            CampaignEx campaignEx2 = this.f44230s;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                this.mbridgeVideoView.setContainerViewOnNotifyListener(new m(this.f45168c, this.f44230s));
            }
            CampaignEx campaignEx3 = this.f44230s;
            int iF = (campaignEx3 == null || campaignEx3.getVst() <= -2) ? this.f45171f.F() : this.f44230s.getVst();
            CampaignEx campaignEx4 = this.f44230s;
            if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i11 = this.f44235x) > 1) {
                iF = a(iF, i11);
                this.f44230s.setVst(iF);
            }
            int i13 = iF;
            this.mbridgeVideoView.setVideoSkipTime(i13);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            mBridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.m(mBridgeVideoView, this.S, this.f44230s, this.f45173h, this.f44231t, getInnerPlacementId(), this.f45169d, i12, i13, new p(this, bVar), this.f45171f.A(), this.f45181p, this.f45171f.C()));
            this.mbridgeVideoView.setAdSession(this.f44224n0);
            this.mbridgeVideoView.setVideoEvents(this.f44225o0);
            this.mbridgeVideoView.defaultShow();
            MBridgeContainerView mBridgeContainerView = this.S;
            mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.b(this.mbridgeVideoView, mBridgeContainerView, this.f44230s, this.f45173h, this.f44231t, getInnerPlacementId(), this.f45169d, new m(this.f45168c, this.f44230s), this.f45171f.A(), this.f45181p));
            this.S.defaultShow();
        }
        q();
    }

    public int findID(String str) {
        return h0.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return h0.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f45181p) {
                a.C0355a c0355aA = this.f45176k ? com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f44230s) : com.mbridge.msdk.videocommon.a.a(94, this.f44230s);
                if (c0355aA == null || !c0355aA.c()) {
                    return null;
                }
                if (this.f45176k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f44230s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f44230s);
                }
                WindVaneWebView windVaneWebViewB = c0355aA.b();
                if (this.f44217g0) {
                    windVaneWebViewB.setWebViewTransparent();
                }
                return windVaneWebViewB;
            }
            CampaignEx campaignEx = this.f44230s;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
                return null;
            }
            a.C0355a c0355aB = com.mbridge.msdk.videocommon.a.b(this.f45169d + "_" + this.f44230s.getId() + "_" + this.f44230s.getRequestId() + "_" + this.f44230s.getRewardTemplateMode().e());
            if (c0355aB != null) {
                return c0355aB.b();
            }
            return null;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }

    public AdEvents getAdEvents() {
        return this.f44226p0;
    }

    public AdSession getAdSession() {
        return this.f44224n0;
    }

    public CampaignEx getCampaign() {
        return this.f44230s;
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public int getH5CloseType() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f44230s);
        if (kVarB != null) {
            return kVarB.l();
        }
        return 0;
    }

    public int getH5DialogRole() {
        if (getJSCommon() != null) {
            return getJSCommon().d();
        }
        return 1;
    }

    public int getH5MuteState() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f44230s);
        if (kVarB != null) {
            return kVarB.m();
        }
        return 0;
    }

    public String getInstanceId() {
        return this.f44236y;
    }

    public boolean getIsShowingTransparent() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f44230s);
        if (kVarB != null) {
            return kVarB.p();
        }
        return false;
    }

    public int getLayoutID() {
        return findLayout(this.f44217g0 ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public MediaEvents getVideoEvents() {
        return this.f44225o0;
    }

    public void init(Context context) {
        this.O = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f44212b0 = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isHasDestoryed() {
        return this.C;
    }

    public boolean isLoadSuccess() {
        return this.P;
    }

    public void loadModuleDatas() {
        int i10;
        int i11;
        int h5MuteState = getH5MuteState();
        if (h5MuteState != 0) {
            this.f45175j = h5MuteState;
        }
        int iE = this.f45171f.E();
        int h5CloseType = getH5CloseType();
        int i12 = h5CloseType != 0 ? h5CloseType : iE;
        this.mbridgeVideoView.setSoundState(this.f45175j);
        this.mbridgeVideoView.setCampaign(this.f44230s);
        this.mbridgeVideoView.setPlayURL(this.f44231t.g());
        CampaignEx campaignEx = this.f44230s;
        int iF = (campaignEx == null || campaignEx.getVst() <= -2) ? this.f45171f.F() : this.f44230s.getVst();
        CampaignEx campaignEx2 = this.f44230s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i11 = this.f44235x) > 1) {
            iF = a(iF, i11);
            this.f44230s.setVst(iF);
        }
        int i13 = iF;
        this.mbridgeVideoView.setVideoSkipTime(i13);
        this.mbridgeVideoView.setCloseAlert(this.f45171f.h());
        this.mbridgeVideoView.setBufferTimeout(getBufferTimeout());
        b bVar = null;
        this.mbridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.n(this.f44237z, this.f44230s, this.f45173h, this.f44231t, getInnerPlacementId(), this.f45169d, i12, i13, new p(this, bVar), this.f45171f.A(), this.f45181p, this.f45171f.C()));
        this.mbridgeVideoView.setShowingTransparent(this.f44217g0);
        this.mbridgeVideoView.setAdSession(this.f44224n0);
        if (this.f45176k && ((i10 = this.f45178m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
            this.mbridgeVideoView.setIVRewardEnable(i10, this.f45179n, this.f45180o);
            this.mbridgeVideoView.setDialogRole(getH5DialogRole());
        }
        this.S.setCampaign(this.f44230s);
        this.S.addOrderViewData(this.K);
        this.S.setUnitID(this.f45169d);
        this.S.setCloseDelayTime(getCloseBtnTime());
        this.S.setPlayCloseBtnTm(this.f45171f.u());
        this.S.setVideoInteractiveType(this.f45171f.D());
        this.S.setEndscreenType(this.f45171f.m());
        this.S.setVideoSkipTime(i13);
        this.S.setShowingTransparent(this.f44217g0);
        this.S.setJSFactory(this.f44237z);
        this.f44237z.getJSCommon().g(this.f45175j);
        if (this.f44230s.getPlayable_ads_without_video() == 2) {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f44230s, this.f44231t, this.f45173h, getInnerPlacementId(), this.f45169d, new n(this, bVar), this.f45171f.A(), this.f45181p));
            this.S.preLoadData(this.f44237z);
            this.S.showPlayableView();
        } else {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.c(this.f44237z, this.f44230s, this.f45173h, this.f44231t, getInnerPlacementId(), this.f45169d, new m(this.f45168c, this.f44230s), this.f45171f.A(), this.f45181p));
            this.S.preLoadData(this.f44237z);
            this.mbridgeVideoView.preLoadData(this.f44237z);
        }
        if (this.f44217g0) {
            this.S.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f44217g0 && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f44230s;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f44230s.getRewardTemplateMode().f() == 5002010) || this.f44219i0) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (!mBridgeVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            MBridgeContainerView mBridgeContainerView3 = this.S;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.f44221k0 && (mBridgeContainerView2 = this.S) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f44220j0 && (mBridgeContainerView = this.S) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().e();
                return;
            }
            return;
        }
        if (!canBackPress()) {
            p0.a(f44210s0, "onBackPressed can't excute");
            return;
        }
        Activity activity = this.f45168c;
        if (activity == null || this.f45181p || this.f44222l0) {
            return;
        }
        this.f44222l0 = true;
        activity.onBackPressed();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        k();
        try {
            A();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        this.f44222l0 = false;
        try {
            if (this.f45181p) {
                CampaignEx campaignEx = this.f44230s;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    this.f44232u = new com.mbridge.msdk.video.bt.module.orglistener.c(this.f44233v, this.f44236y);
                } else {
                    this.f44232u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f45176k, this.f45171f, this.f44230s, this.f44232u, getInnerPlacementId(), this.f45169d);
                }
            } else {
                this.f44232u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f45176k, this.f45171f, this.f44230s, this.f44232u, getInnerPlacementId(), this.f45169d);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.orglistener.e(this.M, this.f44232u));
            a(this.f45171f, this.f44230s);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (!h0.a(layoutID)) {
                b("layoutID not found");
                return;
            }
            View viewInflate = this.O.inflate(layoutID, (ViewGroup) null);
            this.f44228r = viewInflate;
            addView(viewInflate, getContentLayoutParams());
            x();
            if (n()) {
                this.P = true;
                p();
                return;
            }
            this.Q.onError("not found View IDS");
            Activity activity = this.f45168c;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.C) {
            return;
        }
        this.C = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.util.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.R;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.R.clearWebView();
                this.R.release();
            }
            if (this.f44233v != null) {
                this.f44233v = null;
            }
            this.T.removeCallbacks(this.W);
            this.T.removeCallbacks(this.f44211a0);
            getJSCommon().release();
            if (this.f45176k) {
                com.mbridge.msdk.setting.h.b().g(this.f45169d);
            }
            if (!this.f44213c0) {
                r();
            }
            if (!this.f44216f0) {
                s();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.f44223m0;
            if (dVar != null) {
                dVar.d();
            }
            if (this.f44224n0 != null) {
                p0.b("omsdk", "tc onDestroy");
                this.f44224n0.removeAllFriendlyObstructions();
                this.f44224n0.finish();
                this.f44224n0 = null;
            }
            if (!this.f45181p) {
                if (isLoadSuccess()) {
                    this.T.postDelayed(new g(), 100L);
                } else {
                    Activity activity = this.f45168c;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.f44216f0) {
                s();
            }
            com.mbridge.msdk.video.bt.component.d.c().a(this.f44236y);
        } catch (Throwable th2) {
            p0.a(f44210s0, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f44215e0 = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th2) {
            p0.b(f44210s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        t();
        try {
            if (this.mbridgeVideoView != null && !o() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.feedback.b.f40664f) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.f44215e0 && !o() && !com.mbridge.msdk.foundation.feedback.b.f40664f) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f45168c;
            if (activity2 != null) {
                u0.a(activity2.getWindow().getDecorView());
            }
            if (this.f44217g0 && this.f44218h0 && (activity = this.f45168c) != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            p0.b(f44210s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void receiveSuccess() {
        p0.a(f44210s0, "receiveSuccess ,start hybrid");
        this.T.removeCallbacks(this.f44211a0);
        this.T.postDelayed(this.f44227q0, 250L);
    }

    public void registerErrorListener(k kVar) {
        this.Q = kVar;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f44226p0 = adEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f44237z;
        if (bVar == null || bVar.getJSCommon() == null) {
            return;
        }
        this.f44237z.getJSCommon().setAdEvents(adEvents);
    }

    public void setAdSession(AdSession adSession) {
        this.f44224n0 = adSession;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f44237z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f44237z.getJSCommon().setAdSession(adSession);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(adSession);
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, int i10) {
        this.f44234w = aVar;
        this.f44235x = i10;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i10) {
        if (list != null) {
            this.K = list;
        }
        this.L = i10;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f44230s = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
            this.M = cVarB;
            if (cVarB == null) {
                this.M = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.M.i(campaignEx.getCurrentLocalRid());
            this.M.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f45169d)) {
                campaignEx.setCampaignUnitId(this.f45169d);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.f44229r0 = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f44231t = aVar;
    }

    public void setCampaignExpired(boolean z10) {
        try {
            CampaignEx campaignEx = this.f44230s;
            if (campaignEx != null) {
                if (!z10) {
                    campaignEx.setSpareOfferFlag(0);
                    this.f44230s.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (!com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.f45171f;
                    if (cVar != null) {
                        if (cVar.A() == 1) {
                            this.f44230s.setCbt(1);
                            return;
                        } else {
                            this.f44230s.setCbt(0);
                            return;
                        }
                    }
                    return;
                }
                if (this.f45177l) {
                    this.f44230s.setCbt(0);
                    return;
                }
                com.mbridge.msdk.videocommon.setting.c cVar2 = this.f45171f;
                if (cVar2 != null) {
                    if (cVar2.A() == 1) {
                        this.f44230s.setCbt(1);
                    } else {
                        this.f44230s.setCbt(0);
                    }
                }
            }
        } catch (Exception e10) {
            p0.b(f44210s0, e10.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.J = str;
    }

    public void setInstanceId(String str) {
        this.f44236y = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f44237z = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.listener.b bVar) {
        this.f44233v = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        this.D = i10;
        this.E = i11;
        this.F = i12;
        this.G = i13;
        this.H = i14;
        String strA = c0.a(i10, i11, i12, i13, i14);
        this.I = strA;
        p0.b(f44210s0, strA);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.I)) {
            getJSCommon().a(this.I);
            if (this.R != null && !TextUtils.isEmpty(this.I)) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeContainerView mBridgeContainerView = this.S;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i10, i11, i12, i13, i14);
        }
    }

    public void setShowRewardListener(com.mbridge.msdk.video.bt.module.orglistener.h hVar) {
        this.f44232u = hVar;
    }

    public void setShowingTransparent() {
        Activity activity;
        boolean isShowingTransparent = getIsShowingTransparent();
        this.f44217g0 = isShowingTransparent;
        if (isShowingTransparent) {
            return;
        }
        int iA = h0.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE);
        if (!h0.a(iA) || (activity = this.f45168c) == null) {
            return;
        }
        activity.setTheme(iA);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f44225o0 = mediaEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f44237z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f44237z.getJSCommon().setVideoEvents(mediaEvents);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(mediaEvents);
        }
    }

    public void setWebViewFront(int i10) {
        this.V = i10;
    }

    public void superDefaultLoad(int i10, String str) {
        this.T.removeCallbacks(this.W);
        this.T.removeCallbacks(this.f44211a0);
        this.Q.a(true);
        WindVaneWebView windVaneWebView = this.R;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    private void A() {
        AppletsModel appletsModel;
        if (this.f44230s == null) {
            return;
        }
        try {
            appletsModel = AppletModelManager.getInstance().get(this.f44230s);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            appletsModel = null;
        }
        if (appletsModel != null) {
            try {
                if (appletsModel.can(0)) {
                    appletsModel.setUserClick(false);
                    appletsModel.requestWxAppletsScheme(0, new l(this.f44230s));
                }
            } catch (Exception e11) {
                appletsModel.clearRequestState();
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
        }
    }

    private void k() {
        if (this.f45171f == null) {
            this.f45171f = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45169d, this.f45176k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView == null || mBridgeVideoView.notifyListener == null) {
                eVar.a("notify_listener", 0);
            } else {
                eVar.a("notify_listener", 1);
                com.mbridge.msdk.video.module.listener.a aVar = this.mbridgeVideoView.notifyListener;
                if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.n) {
                    eVar.a("listener_type", 1);
                } else if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.m) {
                    eVar.a("listener_type", 2);
                } else {
                    eVar.a("listener_type", 3);
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000130", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (isLoadSuccess()) {
            this.f45168c.runOnUiThread(new a());
        }
    }

    private void q() {
        AdSession adSession = this.f44224n0;
        if (adSession != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.S;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession.addFriendlyObstruction(mBridgeContainerView, friendlyObstructionPurpose, null);
                View view = this.f44212b0;
                if (view != null) {
                    this.f44224n0.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
                WindVaneWebView windVaneWebView = this.R;
                if (windVaneWebView != null) {
                    this.f44224n0.addFriendlyObstruction(windVaneWebView, friendlyObstructionPurpose, null);
                }
                this.mbridgeVideoView.setVideoEvents(this.f44225o0);
                this.f44224n0.start();
                if (this.f44226p0 != null) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    p0.a("omsdk", "bt:   adEvents.loaded");
                    this.f44226p0.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    this.f44226p0.impressionOccurred();
                }
            } catch (Exception e10) {
                p0.a("omsdk", e10.getMessage());
            }
        }
    }

    private void r() {
        CampaignEx campaignEx;
        int i10;
        boolean z10 = true;
        try {
            this.f44213c0 = true;
            CampaignEx campaignEx2 = this.f44230s;
            if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                this.f44214d0 = true;
            }
            MediaEvents mediaEvents = this.f44225o0;
            if (mediaEvents != null && !this.f44214d0) {
                try {
                    mediaEvents.skipped();
                    this.f44225o0 = null;
                } catch (Exception e10) {
                    p0.a("omsdk", e10.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f44232u;
            if (hVar != null) {
                if (this.f45176k && ((i10 = this.f45178m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                    if (this.B != 1) {
                        z10 = false;
                    }
                    hVar.a(z10, this.A);
                }
                if (!this.f44214d0) {
                    this.f45173h.a(0);
                }
                this.M.a(this.f44230s);
                this.f44232u.a(this.M, this.f44214d0, this.f45173h);
            }
            this.T.removeCallbacks(this.f44227q0);
            if ((!this.f45176k && !this.f45181p) || ((campaignEx = this.f44230s) != null && campaignEx.isDynamicView())) {
                u();
            }
            if (!this.f45181p) {
                if (this.f45176k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f44230s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f44230s);
                }
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.release();
            }
        } catch (Throwable th2) {
            p0.b(f44210s0, th2.getMessage(), th2);
        }
    }

    private void s() throws JSONException {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getContext());
        CampaignEx campaignEx = this.f44230s;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f44230s.getRequestIdNotice(), this.f44230s.getId(), this.f45169d, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f44230s.getId()), this.f44230s.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f44230s.getId());
            this.f44216f0 = true;
        }
    }

    private void t() {
        int i10 = this.U;
        Runnable runnable = i10 == -3 ? this.W : i10 == -4 ? this.f44211a0 : null;
        if (runnable != null) {
            runnable.run();
            this.U = 0;
        }
    }

    private void u() {
        if (this.f44214d0) {
            if (com.mbridge.msdk.util.b.a() && checkChinaSendToServerDiff(this.f44232u)) {
                return;
            }
            p0.a(f44210s0, "sendToServerRewardInfo");
            com.mbridge.msdk.video.module.report.b.a(this.f44230s, this.f45173h, this.f45169d, this.f45172g, this.J);
        }
    }

    private void v() {
        getJSCommon().setAdEvents(this.f44226p0);
        getJSCommon().setAdSession(this.f44224n0);
        getJSCommon().setVideoEvents(this.f44225o0);
        getJSCommon().g(this.f45175j);
        getJSCommon().setUnitId(this.f45169d);
        getJSCommon().setRewardUnitSetting(this.f45171f);
        getJSCommon().a(new o(this, null));
        CampaignEx campaignEx = this.f44230s;
        if (campaignEx != null) {
            if (campaignEx.isMraid() || this.f44230s.isActiveOm()) {
                com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                this.f44223m0 = dVar;
                dVar.c();
                this.f44223m0.a();
                this.f44223m0.a(new i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("temp_container", getWidth() + "x" + getHeight());
            if (this.R != null) {
                eVar.a("web_view", this.R.getWidth() + "x" + this.R.getHeight());
            }
            if (this.mbridgeVideoView != null) {
                eVar.a("mbridge_video_view", this.mbridgeVideoView.getWidth() + "x" + this.mbridgeVideoView.getHeight());
                if (this.mbridgeVideoView.mPlayerView != null) {
                    eVar.a("player_view", this.mbridgeVideoView.mPlayerView.getWidth() + "x" + this.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000136", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoadSuccess()) {
            this.f45168c.runOnUiThread(new j());
        }
    }

    public boolean n() {
        this.R = findWindVaneWebView();
        MBridgeVideoView mBridgeVideoViewFindMBridgeVideoView = findMBridgeVideoView();
        this.mbridgeVideoView = mBridgeVideoViewFindMBridgeVideoView;
        mBridgeVideoViewFindMBridgeVideoView.setVideoLayout(this.f44230s);
        this.mbridgeVideoView.setIsIV(this.f45176k);
        this.mbridgeVideoView.setUnitId(this.f45169d);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f44234w, this.K, this.f44235x, this.L);
        if (this.f45181p) {
            this.mbridgeVideoView.setNotchPadding(this.E, this.F, this.G, this.H);
        }
        MBridgeContainerView mBridgeContainerViewFindMBridgeContainerView = findMBridgeContainerView();
        this.S = mBridgeContainerViewFindMBridgeContainerView;
        if (this.f45181p) {
            mBridgeContainerViewFindMBridgeContainerView.setNotchPadding(this.D, this.E, this.F, this.G, this.H);
        }
        if (r0.a().a("i_l_s_t_r_i", false)) {
            this.mbridgeVideoView.setPlayerViewAttachListener(new d());
        }
        this.mbridgeVideoView.setIPlayVideoViewLayoutCallBack(new e());
        return (this.mbridgeVideoView == null || this.S == null || !initViews()) ? false : true;
    }

    public boolean o() {
        if (this.mbridgeVideoView != null) {
            return com.mbridge.msdk.util.b.a() ? this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing() : this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    public void p() throws JSONException {
        ViewGroup viewGroup;
        List<CampaignEx> list;
        WindVaneWebView windVaneWebView = this.R;
        CampaignEx campaignEx = this.f44230s;
        if (campaignEx != null) {
            a1.a(windVaneWebView, campaignEx.getLocalRequestId(), this.f44230s.getLocalAllowTrackClick());
        }
        this.f44237z = new com.mbridge.msdk.video.signal.factory.b(this.f45168c, windVaneWebView, this.mbridgeVideoView, this.S, this.f44230s, new o(this, null));
        CampaignEx campaignEx2 = this.f44230s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.K) != null) {
            this.f44237z.a(list);
        }
        registerJsFactory(this.f44237z);
        com.mbridge.msdk.foundation.feedback.b.b().a(o2.o(new StringBuilder(), this.f45169d, "_1"), new h());
        q();
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f44228r.findViewById(h0.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.f44237z);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.mbridge.msdk.video.signal.impl.k) {
            v();
            getJSContainerModule().readyStatus(((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).v());
            z();
            ((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).f45211m.onInitSuccess();
            if (this.f45181p) {
                getJSCommon().setWebViewFront(this.V);
            }
        }
        if (getJSCommon().b() == 1 && (viewGroup = (ViewGroup) this.f44228r.findViewById(h0.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f44228r).removeView(viewGroup);
            ((ViewGroup) this.f44228r).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void x() {
        if (this.N) {
            setMatchParent();
        }
    }

    public void z() throws JSONException {
        int iG;
        int iF;
        try {
            if (this.R != null) {
                int i10 = getResources().getConfiguration().orientation;
                if (getIsShowingTransparent()) {
                    iG = u0.i(getContext());
                    iF = u0.h(getContext());
                    if (com.mbridge.msdk.foundation.tools.e.a(getContext())) {
                        int iC = u0.c(getContext());
                        if (i10 == 2) {
                            iG += iC;
                        } else {
                            iF += iC;
                        }
                    }
                } else {
                    iG = u0.g(getContext());
                    iF = u0.f(getContext());
                }
                int iB = this.f44230s.getRewardTemplateMode().b();
                if (a(this.f44230s) == 1) {
                    iB = i10;
                }
                getJSNotifyProxy().a(i10, iB, iG, iF);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f40715l, u0.d(getContext()));
                try {
                    if (this.f45173h != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f45173h.c());
                        jSONObject2.put("amount", this.f45173h.a());
                        jSONObject2.put("id", this.f45174i);
                        jSONObject.put("userId", this.f45172g);
                        jSONObject.put(C3434s.f38309j, jSONObject2);
                        jSONObject.put("playVideoMute", this.f45175j);
                        jSONObject.put("extra", this.J);
                    }
                } catch (JSONException e10) {
                    p0.a(f44210s0, e10.getMessage());
                } catch (Exception e11) {
                    p0.a(f44210s0, e11.getMessage());
                }
                String string = jSONObject.toString();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f44230s, eVar);
                getJSNotifyProxy().a(string);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
                getJSCommon().b(true);
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCallBackStatus(this.R);
                }
                loadModuleDatas();
                this.T.postDelayed(this.W, 2000L);
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void b(String str) {
        com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f44232u;
        if (hVar != null) {
            hVar.a(this.M, str);
        }
        super.b(str);
    }

    private int a(int i10, int i11) {
        List<CampaignEx> list;
        if (i10 < 0 || (list = this.K) == null || list.size() == 0 || i11 <= 1) {
            return i10;
        }
        int videoLength = 0;
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            if (this.K.get(i12) != null) {
                videoLength += this.K.get(i12).getVideoLength();
            }
        }
        if (i10 > videoLength) {
            return i10 - videoLength;
        }
        return 0;
    }

    private void b(int i10, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.j("2000037");
            nVar.h("code=" + i10 + ",desc=" + str);
            CampaignEx campaignEx = this.f44230s;
            nVar.t((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f44230s.getRewardTemplateMode().e());
            nVar.u(this.f45169d);
            CampaignEx campaignEx2 = this.f44230s;
            nVar.b(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f44230s;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.n(this.f44230s.getRequestId());
            }
            CampaignEx campaignEx4 = this.f44230s;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.o(this.f44230s.getRequestIdNotice());
            }
            int iS = l0.s(getContext());
            nVar.c(iS);
            nVar.l(l0.a(getContext(), iS));
            com.mbridge.msdk.foundation.same.report.o.i(nVar);
        } catch (Throwable th2) {
            p0.b(f44210s0, th2.getMessage(), th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBTempContainer.f44210s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBTempContainer.f44210s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(MBTempContainer.f44210s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44235x = 1;
        this.f44236y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f44211a0 = new c();
        this.f44213c0 = false;
        this.f44214d0 = false;
        this.f44215e0 = false;
        this.f44217g0 = false;
        this.f44218h0 = false;
        this.f44219i0 = false;
        this.f44220j0 = false;
        this.f44221k0 = false;
        this.f44222l0 = false;
        this.f44224n0 = null;
        this.f44225o0 = null;
        this.f44226p0 = null;
        this.f44227q0 = new f();
        this.f44229r0 = false;
        init(context);
    }
}
