package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeVideoView extends MBridgeBaseView implements com.mbridge.msdk.video.signal.j {
    private static int R0;
    private static int S0;
    private static int T0;
    private static int U0;
    private static int V0;
    private static boolean W0;
    private static long X0;
    private boolean A;
    private int A0;
    private FrameLayout B;
    private int B0;
    private MBridgeClickCTAView C;
    private int C0;
    private com.mbridge.msdk.video.signal.factory.b D;
    private AcquireRewardPopViewParameters D0;
    private int E;
    private MBAcquireRewardPopView E0;
    private int F;
    private boolean F0;
    private RelativeLayout G;
    private RelativeLayout G0;
    private boolean H;
    private CollapsibleWebView H0;
    private boolean I;
    private RelativeLayout I0;
    private boolean J;
    private boolean J0;
    private String K;
    private int K0;
    private int L;
    private boolean L0;
    private int M;
    private boolean M0;
    private int N;
    private w N0;
    private MBAlertDialog O;
    private boolean O0;
    private com.mbridge.msdk.widget.dialog.b P;
    private Runnable P0;
    private String Q;
    private final Runnable Q0;
    private double R;
    private double S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f44743a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f44744b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f44745c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f44746d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f44747e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f44748f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f44749g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f44750h0;

    /* renamed from: i0, reason: collision with root package name */
    private AdSession f44751i0;

    /* renamed from: j0, reason: collision with root package name */
    private MediaEvents f44752j0;

    /* renamed from: k0, reason: collision with root package name */
    private String f44753k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f44754l0;

    /* renamed from: m, reason: collision with root package name */
    private TextView f44755m;

    /* renamed from: m0, reason: collision with root package name */
    private int f44756m0;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    public PlayerView mPlayerView;
    public SoundImageView mSoundImageView;

    /* renamed from: n, reason: collision with root package name */
    private View f44757n;

    /* renamed from: n0, reason: collision with root package name */
    private int f44758n0;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f44759o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f44760o0;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f44761p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f44762p0;

    /* renamed from: q, reason: collision with root package name */
    private ProgressBar f44763q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f44764q0;

    /* renamed from: r, reason: collision with root package name */
    private FeedBackButton f44765r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f44766r0;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f44767s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f44768s0;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f44769t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f44770t0;
    public TextView tvFlag;

    /* renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.module.listener.a f44771u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f44772u0;

    /* renamed from: v, reason: collision with root package name */
    private u f44773v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f44774v0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f44775w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f44776w0;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f44777x;

    /* renamed from: x0, reason: collision with root package name */
    private AlphaAnimation f44778x0;

    /* renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.f f44779y;

    /* renamed from: y0, reason: collision with root package name */
    private MBridgeBaitClickView f44780y0;

    /* renamed from: z, reason: collision with root package name */
    private int f44781z;

    /* renamed from: z0, reason: collision with root package name */
    private int f44782z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeVideoView.this.f44746d0 = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44787d;

        public b(int i10, int i11, int i12, int i13) {
            this.f44784a = i10;
            this.f44785b = i11;
            this.f44786c = i12;
            this.f44787d = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f44759o == null) {
                return;
            }
            MBridgeVideoView.this.f44759o.setVisibility(0);
            CampaignEx campaignEx = MBridgeVideoView.this.f44612b;
            if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
                return;
            }
            MBridgeVideoView.this.f44759o.setPadding(this.f44784a, this.f44785b, this.f44786c, this.f44787d);
            MBridgeVideoView.this.f44759o.startAnimation(MBridgeVideoView.this.f44778x0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.same.image.c {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f44790a;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c$a$a, reason: collision with other inner class name */
            public class RunnableC0351a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f44792a;

                public RunnableC0351a(Bitmap bitmap) {
                    this.f44792a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MBridgeVideoView.this.f44761p.setVisibility(0);
                    MBridgeVideoView.this.f44761p.setImageBitmap(this.f44792a);
                }
            }

            public a(Bitmap bitmap) {
                this.f44790a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeVideoView.this.f44761p.post(new RunnableC0351a(z.a(this.f44790a, 10)));
                } catch (Exception e10) {
                    p0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            p0.b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || MBridgeVideoView.this.f44761p == null) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new a(bitmap));
                } catch (Throwable th2) {
                    p0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements CollapsibleWebView.e {
        public d() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, Map<String, String> map) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, Map<String, String> map) {
            String str;
            String str2;
            str = "";
            if (map != null) {
                String str3 = map.get("url");
                str = str3 != null ? str3 : "";
                str2 = map.get("description");
            } else {
                str2 = "";
            }
            a(str, str2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, String str) throws JSONException {
            JSONObject jSONObject;
            if (MBridgeVideoView.this.J0) {
                return;
            }
            MBridgeVideoView.this.J0 = true;
            if (MBridgeVideoView.this.G0 != null && MBridgeVideoView.this.G0.getVisibility() != 0) {
                MBridgeVideoView.this.G0.setVisibility(0);
            }
            Context context = MBridgeVideoView.this.getContext();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.click.a.a(context, mBridgeVideoView.f44612b, mBridgeVideoView.getUnitId(), MBridgeVideoView.this.f44612b.getNoticeUrl(), true, false, com.mbridge.msdk.click.retry.a.f39794o);
            try {
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                new com.mbridge.msdk.click.a(mBridgeVideoView2.f44611a, mBridgeVideoView2.Q).c(MBridgeVideoView.this.f44612b);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.m().d().getApplicationContext(), MBridgeVideoView.this.f44612b);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("result", 1);
            if (MBridgeVideoView.this.f44771u != null) {
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, MBridgeVideoView.this.a(0));
                    } catch (JSONException e10) {
                        e = e10;
                        e.printStackTrace();
                        MBridgeVideoView.this.f44771u.a(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jSONObject);
                        MBridgeVideoView.this.f44612b.setClickType(1);
                        MBridgeVideoView.this.f44612b.setClickTempSource(1);
                        MBridgeVideoView.this.f44612b.setTriggerClickSource(2);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", MBridgeVideoView.this.f44612b);
                        eVar.a("type", 9);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("web_view");
                        eVar.a("click_path", arrayList.toString());
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", MBridgeVideoView.this.f44612b, eVar);
                        eVar.a("url", str);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f44612b, eVar);
                    }
                } catch (JSONException e11) {
                    e = e11;
                    jSONObject = null;
                }
                MBridgeVideoView.this.f44771u.a(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jSONObject);
                MBridgeVideoView.this.f44612b.setClickType(1);
                MBridgeVideoView.this.f44612b.setClickTempSource(1);
                MBridgeVideoView.this.f44612b.setTriggerClickSource(2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", MBridgeVideoView.this.f44612b);
                eVar.a("type", 9);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("web_view");
                eVar.a("click_path", arrayList2.toString());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", MBridgeVideoView.this.f44612b, eVar);
            }
            eVar.a("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f44612b, eVar);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, String str) {
            a(str, "timeout");
        }

        private void a(String str, String str2) {
            if (MBridgeVideoView.this.J0) {
                return;
            }
            MBridgeVideoView.this.J0 = true;
            if (str == null) {
                str = "";
            }
            if (MBridgeVideoView.this.G0 != null && MBridgeVideoView.this.G0.getVisibility() == 0) {
                MBridgeVideoView.this.G0.setVisibility(8);
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("result", 2);
            eVar.a("url", str);
            eVar.a("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f44612b, eVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements CommonWebView.h {
        public f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(0);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f44612b, eVar);
            }
            if (MBridgeVideoView.this.H0 != null) {
                MBridgeVideoView.this.H0.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
            }
            MBridgeVideoView.this.p();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements CommonWebView.h {
        public g() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(8);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f44612b, eVar);
            }
            if (MBridgeVideoView.this.H0 != null) {
                MBridgeVideoView.this.H0.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.K0, 0, 0);
            }
            MBridgeVideoView.this.o();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.I0 != null) {
                MBridgeVideoView.this.I0.setVisibility(0);
            }
            if (MBridgeVideoView.this.G0 != null) {
                MBridgeVideoView.this.G0.setVisibility(8);
            }
            if (MBridgeVideoView.this.f44768s0) {
                return;
            }
            MBridgeVideoView.this.p();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener != null) {
                mBridgeVideoView.f44612b.setTriggerClickSource(2);
                MBridgeVideoView.this.b("bait_click_clicked");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements AcquireRewardPopViewBehaviourListener {
        public j() {
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onOutOfContentClicked(float f10, float f11) {
            if (MBridgeVideoView.this.f44771u != null) {
                MBridgeVideoView.this.f44771u.a(105, "");
            }
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedFail(String str) {
            MBridgeVideoView.this.J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f44612b, mBridgeVideoView.Q, MBridgeVideoView.this.f44782z0, 2, str);
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedSuccess(int i10) {
            MBridgeVideoView.this.J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            int videoCompleteTime = MBridgeVideoView.this.getVideoCompleteTime() - i10;
            MBridgeVideoView.this.f44612b.setVideoCompleteTime(videoCompleteTime);
            MBridgeVideoView.this.p();
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(130, Integer.valueOf(videoCompleteTime));
            }
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f44612b, mBridgeVideoView.Q, MBridgeVideoView.this.f44782z0, 1, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.B != null) {
                MBridgeVideoView.this.B.setVisibility(8);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.A0 <= 0) {
                MBridgeVideoView.this.showRewardPopView();
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                mBridgeVideoView.removeCallbacks(mBridgeVideoView.Q0);
            } else {
                MBridgeVideoView.W(MBridgeVideoView.this);
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                mBridgeVideoView2.postDelayed(mBridgeVideoView2.Q0, 1000L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements PlayerView.OnPlayerViewVisibleListener {
        public n() {
        }

        @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
        public void playerViewVisibleCallback() {
            if (MBridgeVideoView.this.f44775w) {
                return;
            }
            MBridgeVideoView.this.f44775w = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener == null || mBridgeVideoView.f44773v == null) {
                return;
            }
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            mBridgeVideoView2.notifyListener.a(20, mBridgeVideoView2.f44773v);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.f44612b.setClickTempSource(1);
                MBridgeVideoView.this.f44612b.setTriggerClickSource(2);
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
            if (MBridgeVideoView.this.f44752j0 != null) {
                try {
                    MBridgeVideoView.this.f44752j0.adUserInteraction(InteractionType.CLICK);
                    p0.a("omsdk", "play video view:  click");
                } catch (Exception e11) {
                    p0.b("omsdk", e11.getMessage());
                }
            }
            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoView.this.f44612b.setClickTempSource(1);
            MBridgeVideoView.this.f44612b.setTriggerClickSource(2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_player_click", MBridgeVideoView.this.f44612b);
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            Integer num = 2;
            PlayerView playerView = MBridgeVideoView.this.mPlayerView;
            if (playerView != null) {
                eVar.a("mute_state", Boolean.valueOf(playerView.isSilent()));
                if (MBridgeVideoView.this.mPlayerView.isSilent()) {
                    num = 1;
                }
            }
            if (num.intValue() == 1) {
                MBridgeVideoView.this.mMuteSwitch = 2;
            } else {
                MBridgeVideoView.this.mMuteSwitch = 1;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(5, num);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_sound_click", MBridgeVideoView.this.f44612b, eVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r implements View.OnClickListener {
        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", MBridgeVideoView.this.f44612b, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            if (!MBridgeVideoView.this.f44749g0) {
                CampaignEx campaignEx = MBridgeVideoView.this.f44612b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || MBridgeVideoView.this.f44612b.getRewardTemplateMode().f() != 5002010 || !MBridgeVideoView.this.f44768s0) {
                    MBridgeVideoView.this.y();
                    return;
                }
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                if (mBridgeVideoView.notifyListener != null) {
                    mBridgeVideoView.L0 = true;
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.notifyListener.a(2, mBridgeVideoView2.c(mBridgeVideoView2.f44768s0));
                    return;
                }
                return;
            }
            MBridgeVideoView.this.f44774v0 = true;
            CampaignEx campaignEx2 = MBridgeVideoView.this.f44612b;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && MBridgeVideoView.this.f44612b.getRewardTemplateMode().f() == 5002010 && MBridgeVideoView.this.f44768s0) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f44768s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f44766r0) {
                MBridgeVideoView.this.y();
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, "");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class t implements com.mbridge.msdk.foundation.feedback.a {
        public t() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeVideoView.this.o();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeVideoView.this.p();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeVideoView.this.p();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface u {
        void a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class v {

        /* renamed from: a, reason: collision with root package name */
        public int f44815a;

        /* renamed from: b, reason: collision with root package name */
        public int f44816b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f44817c;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProgressData{curPlayPosition=");
            sb2.append(this.f44815a);
            sb2.append(", allDuration=");
            return e3.g.m(sb2, this.f44816b, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class w extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f44818a;

        /* renamed from: b, reason: collision with root package name */
        private int f44819b;

        /* renamed from: c, reason: collision with root package name */
        private int f44820c;

        /* renamed from: d, reason: collision with root package name */
        private int f44821d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44822e;

        /* renamed from: f, reason: collision with root package name */
        private MediaEvents f44823f;

        /* renamed from: k, reason: collision with root package name */
        private boolean f44828k;

        /* renamed from: l, reason: collision with root package name */
        private String f44829l;

        /* renamed from: m, reason: collision with root package name */
        private CampaignEx f44830m;

        /* renamed from: n, reason: collision with root package name */
        private int f44831n;

        /* renamed from: o, reason: collision with root package name */
        private int f44832o;

        /* renamed from: g, reason: collision with root package name */
        private v f44824g = new v();

        /* renamed from: h, reason: collision with root package name */
        private boolean f44825h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f44826i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f44827j = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f44833p = false;

        public w(MBridgeVideoView mBridgeVideoView) {
            this.f44818a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f44829l = mBridgeVideoView.getUnitId();
                this.f44830m = mBridgeVideoView.getCampaign();
            }
        }

        private void c() {
            int i10;
            CampaignEx campaignEx;
            String str;
            if (!r0.a().a("h_c_r_w_p_c", false) || (i10 = this.f44831n) == 100 || this.f44832o != 0 || this.f44833p || i10 == 0 || (campaignEx = this.f44830m) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f44830m.getAdType() == 287) {
                    str = this.f44830m.getRequestId() + this.f44830m.getId() + this.f44830m.getVideoUrlEncode();
                } else {
                    str = this.f44830m.getId() + this.f44830m.getVideoUrlEncode() + this.f44830m.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f44829l, str);
                if (aVarA != null) {
                    aVarA.v();
                    this.f44833p = true;
                    if (MBridgeConstans.DEBUG) {
                        p0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                }
            }
        }

        private void e() {
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f44755m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = com.google.android.gms.internal.play_billing.a.a(25.0f);
                this.f44818a.f44755m.setLayoutParams(layoutParams);
            }
            int iA = com.google.android.gms.internal.play_billing.a.a(5.0f);
            this.f44818a.f44755m.setPadding(iA, 0, iA, 0);
        }

        public int b() {
            return this.f44821d;
        }

        public void d() {
            this.f44818a = null;
            boolean unused = MBridgeVideoView.W0 = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                MediaEvents mediaEvents = this.f44823f;
                if (mediaEvents != null) {
                    mediaEvents.bufferFinish();
                    p0.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f44818a.notifyListener.a(14, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f44823f != null) {
                    p0.a("omsdk", "play:  videoEvents.bufferStart()");
                    this.f44823f.bufferStart();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                this.f44818a.notifyListener.a(13, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() throws JSONException {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f44818a.f44768s0 = true;
            CampaignEx campaignEx = this.f44830m;
            if (campaignEx != null) {
                if (this.f44828k && campaignEx.getRewardTemplateMode() != null && this.f44830m.getRewardTemplateMode().f() == 5002010) {
                    this.f44818a.f44755m.setText("0");
                } else {
                    this.f44818a.f44755m.setText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                }
                this.f44830m.setVideoPlayProgress(100);
                if (this.f44830m.getAdSpaceT() == 2) {
                    this.f44818a.f44757n.setVisibility(4);
                    if (this.f44818a.f44765r != null) {
                        this.f44818a.f44765r.setClickable(false);
                    }
                    SoundImageView soundImageView = this.f44818a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.f44818a.f44755m.setText("0");
            }
            MediaEvents mediaEvents = this.f44823f;
            if (mediaEvents != null) {
                mediaEvents.complete();
                p0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f44818a.mPlayerView.setClickable(false);
            String strC = this.f44818a.c(true);
            CampaignEx campaignEx2 = this.f44830m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f44830m.getRewardTemplateMode().f() == 5002010) {
                this.f44818a.x();
            }
            CampaignEx campaignEx3 = this.f44830m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f44818a) != null && mBridgeVideoView.f44777x != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f44818a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put(C3191e4.h.L, Integer.valueOf(this.f44818a.mCurrPlayNum));
                    int i10 = this.f44818a.mMuteSwitch;
                    if (i10 != 0) {
                        map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
                    }
                    this.f44818a.f44777x.a(map);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f44818a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.a(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "");
                this.f44818a.notifyListener.a(11, strC);
            }
            int i11 = this.f44820c;
            this.f44819b = i11;
            this.f44818a.mCurrentPlayProgressTime = i11;
            boolean unused = MBridgeVideoView.W0 = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            com.google.android.gms.internal.play_billing.a.v("errorStr", str, "DefaultVideoPlayerStatusListener");
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) {
            CampaignEx campaignEx;
            int videoCompleteTime;
            super.onPlayProgress(i10, i11);
            if (MBridgeVideoView.X0 == 0) {
                long unused = MBridgeVideoView.X0 = System.currentTimeMillis();
            }
            if (!this.f44818a.M0 && this.f44818a.f44779y != null) {
                this.f44818a.M0 = true;
                this.f44818a.f44779y.a();
            }
            if (this.f44818a.f44615e) {
                CampaignEx campaignEx2 = this.f44830m;
                if (campaignEx2 != null) {
                    videoCompleteTime = campaignEx2.getVideoCompleteTime();
                    if (videoCompleteTime <= 0) {
                        videoCompleteTime = i11;
                    }
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f44830m.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                CampaignEx campaignEx3 = this.f44830m;
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f44830m.getDynamicTempCode() == 5) {
                    try {
                        b(videoCompleteTime, this.f44818a.f44781z, i10);
                    } catch (Exception e10) {
                        p0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                    }
                } else {
                    a(videoCompleteTime, i11, i10);
                    this.f44824g.f44815a = i10;
                }
            }
            this.f44820c = i11;
            v vVar = this.f44824g;
            vVar.f44816b = i11;
            vVar.f44817c = this.f44818a.f44772u0;
            this.f44819b = i10;
            if (this.f44818a.f44767s != null) {
                this.f44818a.f44767s.setTag("" + this.f44819b);
            }
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            mBridgeVideoView.mCurrentPlayProgressTime = i10;
            mBridgeVideoView.notifyListener.a(15, this.f44824g);
            MediaEvents mediaEvents = this.f44823f;
            if (mediaEvents != null) {
                int i12 = (i10 * 100) / i11;
                int i13 = ((i10 + 1) * 100) / i11;
                if (i12 <= 25 && 25 < i13 && !this.f44825h) {
                    this.f44825h = true;
                    mediaEvents.firstQuartile();
                    p0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i12 <= 50 && 50 < i13 && !this.f44826i) {
                    this.f44826i = true;
                    mediaEvents.midpoint();
                    p0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i12 <= 75 && 75 < i13 && !this.f44827j) {
                    this.f44827j = true;
                    mediaEvents.thirdQuartile();
                    p0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f44818a.f44749g0 && !this.f44818a.f44760o0 && this.f44818a.f44754l0 == com.mbridge.msdk.foundation.same.a.I) {
                this.f44818a.y();
            }
            try {
                MBridgeVideoView mBridgeVideoView2 = this.f44818a;
                if (mBridgeVideoView2 != null && mBridgeVideoView2.f44769t != null) {
                    int i14 = (i10 * 100) / i11;
                    this.f44818a.f44769t.setProgress(i14, this.f44818a.mCurrPlayNum - 1);
                    this.f44830m.setVideoPlayProgress(i14);
                }
                MBridgeVideoView mBridgeVideoView3 = this.f44818a;
                if (mBridgeVideoView3 != null) {
                    int i15 = mBridgeVideoView3.F != -5 ? this.f44818a.F : this.f44818a.E;
                    if (i15 != -1 && i10 == i15 && (campaignEx = this.f44818a.f44612b) != null && campaignEx.isDynamicView()) {
                        this.f44818a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th2) {
                p0.b("DefaultVideoPlayerStatusListener", th2.getMessage());
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) {
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i10);
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.g();
            }
            if (!this.f44822e) {
                MBridgeVideoView mBridgeVideoView2 = this.f44818a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.A = true;
                    this.f44818a.notifyListener.a(10, this.f44824g);
                }
                this.f44822e = true;
            }
            this.f44821d = i10;
            CampaignEx campaignEx2 = this.f44830m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i10;
                }
                if (this.f44830m.isDynamicView()) {
                    b(videoCompleteTime);
                } else {
                    a(videoCompleteTime);
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f44818a;
            if (mBridgeVideoView3 != null && mBridgeVideoView3.f44763q != null) {
                this.f44818a.f44763q.setMax(i10);
            }
            MBridgeVideoView mBridgeVideoView4 = this.f44818a;
            if (mBridgeVideoView4 != null && mBridgeVideoView4.f44759o != null && (campaignEx = this.f44830m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f44818a.f44759o.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView5 = this.f44818a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f44755m != null && this.f44818a.f44755m.getVisibility() == 0) {
                this.f44818a.f();
            }
            boolean unused = MBridgeVideoView.W0 = false;
            if (this.f44818a != null && this.f44830m.isDynamicView()) {
                if (this.f44818a.F != -5) {
                    if (this.f44818a.F == 0) {
                        this.f44818a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f44818a.E == 0) {
                    this.f44818a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView6 = this.f44818a;
            if (mBridgeVideoView6 != null) {
                mBridgeVideoView6.showMoreOfferInPlayTemplate();
                this.f44818a.showBaitClickView();
                this.f44818a.q();
            }
            if (this.f44823f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView7 = this.f44818a;
                    this.f44823f.start(i10, (mBridgeVideoView7 == null || (playerView = mBridgeVideoView7.mPlayerView) == null) ? 0.0f : playerView.getVolume());
                    p0.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e10) {
                    p0.b("omsdk", e10.getMessage());
                }
            }
        }

        public void a(CampaignEx campaignEx) {
            this.f44830m = campaignEx;
        }

        public void b(int i10, int i11) {
            this.f44831n = i10;
            this.f44832o = i11;
            c();
        }

        public void a(boolean z10) {
            this.f44828k = z10;
        }

        public void a(String str) {
            this.f44829l = str;
        }

        private void b(int i10) {
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView == null || mBridgeVideoView.f44755m == null) {
                return;
            }
            String str = "mbridge_reward_video_time_count_num_bg";
            if (this.f44830m.getDynamicTempCode() == 5) {
                MBridgeVideoView mBridgeVideoView2 = this.f44818a;
                if (mBridgeVideoView2.mCurrPlayNum > 1 && i10 <= 0) {
                    mBridgeVideoView2.f44755m.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    e();
                    return;
                }
            }
            if (i10 > 0) {
                if (!this.f44828k || this.f44830m.getDynamicTempCode() == 5) {
                    e();
                }
            } else {
                str = "mbridge_reward_shape_progress";
            }
            CampaignEx campaignEx = this.f44830m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1 && this.f44828k) {
                e();
            }
            this.f44818a.f44755m.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, "drawable"));
        }

        public int a() {
            return this.f44819b;
        }

        private void a(int i10) {
            if (i10 > 0) {
                this.f44818a.f44755m.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.google.android.gms.internal.play_billing.a.a(30.0f));
                int iA = com.google.android.gms.internal.play_billing.a.a(5.0f);
                layoutParams.addRule(1, h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(iA, 0, 0, 0);
                this.f44818a.f44755m.setPadding(iA, 0, iA, 0);
                this.f44818a.f44755m.setLayoutParams(layoutParams);
                return;
            }
            this.f44818a.f44755m.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_shape_progress", "drawable"));
        }

        private void b(int i10, int i11, int i12) {
            int i13;
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView == null) {
                return;
            }
            String strJ = (String) mBridgeVideoView.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
            String str = (String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left", "string"));
            if (i10 >= 0) {
                if (this.f44830m.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f44818a.L, i10);
                    if (iMin >= i10 || iMin <= 0) {
                        i13 = i10 - i12;
                        if (this.f44828k) {
                            if (i13 <= 0) {
                                this.f44818a.f44755m.setVisibility(4);
                            } else {
                                str = (String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                            }
                        }
                    } else {
                        i13 = iMin - i12;
                        if (i13 <= 0) {
                            i13 = i10 - i12;
                            if (this.f44828k) {
                                this.f44818a.f44755m.setVisibility(4);
                            }
                        } else {
                            str = (String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string"));
                        }
                    }
                } else {
                    i13 = i10 - i12;
                }
                if (i13 > 0) {
                    strJ = o2.j(i13, str);
                }
            } else {
                i13 = i11 - i12;
                if (i13 > 0) {
                    strJ = i10 <= 0 ? o2.j(i13, "") : o2.j(i13, str);
                } else if (i10 <= 0) {
                    strJ = "0";
                }
            }
            this.f44824g.f44815a = i12;
            this.f44818a.f44755m.setText(strJ);
            if (this.f44818a.f44763q != null && this.f44818a.f44763q.getVisibility() == 0) {
                this.f44818a.f44763q.setProgress(i12);
            }
            if (i13 >= this.f44818a.C0 || this.f44818a.E0 == null || !this.f44818a.J) {
                return;
            }
            this.f44818a.E0.onTimeLessThanReduce(i13);
        }

        private void a(int i10, int i11) {
            int i12;
            String str;
            int i13 = this.f44831n;
            if (i13 == 100 || this.f44833p || i13 == 0) {
                return;
            }
            if (this.f44832o > i13) {
                this.f44832o = i13 / 2;
            }
            int i14 = this.f44832o;
            if (i14 < 0 || i10 < (i12 = (i11 * i14) / 100)) {
                return;
            }
            if (this.f44830m.getAdType() != 94 && this.f44830m.getAdType() != 287) {
                str = this.f44830m.getId() + this.f44830m.getVideoUrlEncode() + this.f44830m.getBidToken();
            } else {
                str = this.f44830m.getRequestId() + this.f44830m.getId() + this.f44830m.getVideoUrlEncode();
            }
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f44829l, str);
            if (aVarA != null) {
                aVarA.v();
                this.f44833p = true;
                p0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i12 + " and start download !");
            }
        }

        private void a(int i10, int i11, int i12) {
            String strJ;
            MBridgeVideoView mBridgeVideoView = this.f44818a;
            if (mBridgeVideoView == null) {
                return;
            }
            if (!this.f44828k) {
                if (i10 > i11) {
                    i10 = i11;
                }
                int i13 = i10 <= 0 ? i11 - i12 : i10 - i12;
                if (i13 <= 0) {
                    i13 = 0;
                    strJ = i10 <= 0 ? "0" : (String) mBridgeVideoView.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else if (i10 <= 0) {
                    strJ = o2.j(i13, "");
                } else {
                    strJ = i13 + ((String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left", "string")));
                }
                if (i13 < this.f44818a.C0 && this.f44818a.E0 != null && this.f44818a.J) {
                    this.f44818a.E0.onTimeLessThanReduce(i13);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 - i12);
                strJ = sb2.toString();
            }
            CampaignEx campaignEx = this.f44830m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1) {
                int iMin = Math.min(this.f44818a.L, i11);
                if (iMin >= i10 || iMin < 0) {
                    int i14 = i10 - i12;
                    if (this.f44828k) {
                        if (i14 > 0) {
                            strJ = i14 + ((String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                        } else if (i14 == 0) {
                            this.f44818a.f44755m.setVisibility(4);
                        }
                    }
                } else {
                    int i15 = iMin - i12;
                    if (i15 > 0) {
                        strJ = i15 + ((String) this.f44818a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                    } else if (this.f44828k && i15 == 0) {
                        this.f44818a.f44755m.setVisibility(4);
                    }
                }
            }
            this.f44818a.f44755m.setText(strJ);
            if (this.f44818a.f44763q == null || this.f44818a.f44763q.getVisibility() != 0) {
                return;
            }
            this.f44818a.f44763q.setProgress(i12);
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f44775w = false;
        this.f44781z = 0;
        this.H = false;
        this.I = false;
        this.J = false;
        this.Q = "";
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f44743a0 = false;
        this.f44744b0 = false;
        this.f44745c0 = false;
        this.f44746d0 = false;
        this.f44747e0 = false;
        this.f44749g0 = false;
        this.f44750h0 = 2;
        this.f44760o0 = false;
        this.f44762p0 = false;
        this.f44764q0 = false;
        this.f44766r0 = true;
        this.f44768s0 = false;
        this.f44770t0 = false;
        this.f44772u0 = false;
        this.f44774v0 = false;
        this.f44776w0 = false;
        this.f44782z0 = 0;
        this.A0 = 5;
        this.B0 = 5;
        this.C0 = 5;
        this.F0 = false;
        this.J0 = false;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        this.N0 = new w(this);
        this.O0 = false;
        this.P0 = new k();
        this.Q0 = new m();
    }

    public static /* synthetic */ int W(MBridgeVideoView mBridgeVideoView) {
        int i10 = mBridgeVideoView.A0;
        mBridgeVideoView.A0 = i10 - 1;
        return i10;
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.Q, false).g();
    }

    private int getVideoAllDuration() {
        try {
            w wVar = this.N0;
            int iB = wVar != null ? wVar.b() : 0;
            return iB == 0 ? this.f44612b.getVideoLength() : iB;
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoCompleteTime() {
        int videoCompleteTime = 0;
        try {
            int videoAllDuration = getVideoAllDuration();
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null) {
                videoCompleteTime = campaignEx.getVideoCompleteTime();
                if (this.f44612b.getDynamicTempCode() != 5 && videoCompleteTime > videoAllDuration) {
                    videoCompleteTime = videoAllDuration;
                }
                if (videoCompleteTime > 0) {
                    return videoCompleteTime;
                }
            }
            return videoAllDuration;
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
            return videoCompleteTime;
        }
    }

    private void setBlurBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str, new c());
    }

    private void setPlayerViewRadius(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(u0.a(getContext(), i10));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.mPlayerView.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.mPlayerView.setClipToOutline(true);
        }
    }

    private void t() {
    }

    public void addCTAView() {
        if (this.B == null) {
            return;
        }
        if (this.C == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.C = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f44612b);
            this.C.setUnitId(this.Q);
            com.mbridge.msdk.video.module.listener.a aVar = this.f44771u;
            if (aVar != null) {
                this.C.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.i(aVar));
            }
            this.C.preLoadData(this.D);
        }
        this.B.addView(this.C);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.I = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        if (i10 == 1) {
            this.f44774v0 = true;
            if (getVisibility() == 0) {
                y();
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", this.f44612b, eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f44612b);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
        if (i11 == 1) {
            gonePlayingCloseView();
        } else if (i11 == 2) {
            if (this.f44772u0 && getVisibility() == 0) {
                return;
            }
            x();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.T = true;
        showVideoLocation(0, 0, u0.g(this.f44611a), u0.f(this.f44611a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.L == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.O;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return V0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return T0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return R0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return S0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return U0;
    }

    public int getBufferTimeout() {
        return this.M;
    }

    public int getCloseAlert() {
        return this.N;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        try {
            int iA = this.N0.a();
            CampaignEx campaignEx = this.f44612b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(iA, videoLength));
            jSONObject.put(DTBMetricReport.TIME, iA);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, videoLength + "");
            return jSONObject.toString();
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return "{}";
        }
    }

    public int getMute() {
        return this.f44750h0;
    }

    public String getPlayURL() {
        return this.K;
    }

    public String getUnitId() {
        return this.Q;
    }

    public int getVideoSkipTime() {
        return this.L;
    }

    public void gonePlayingCloseView() {
        if (this.f44615e && this.f44757n.getVisibility() != 8) {
            this.f44757n.setVisibility(8);
            this.f44743a0 = false;
        }
        i();
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        if (this.I) {
            this.I = false;
            this.f44760o0 = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.foundation.same.report.j.a(this.f44611a, this.f44612b, com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.Q, false).c(), this.Q, 1, i10, 1);
            if (i10 == 0) {
                p();
                if (this.f44749g0) {
                    int i11 = this.f44754l0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.I || i11 == com.mbridge.msdk.foundation.same.a.H) {
                        this.f44762p0 = true;
                        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
                        if (aVar != null) {
                            aVar.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "");
                        }
                        CampaignEx campaignEx = this.f44612b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f44612b.getRewardTemplateMode().f() == 5002010) {
                            x();
                            return;
                        } else {
                            this.f44772u0 = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.f44764q0 = true;
            boolean z10 = this.f44749g0;
            if (z10 && this.f44754l0 == com.mbridge.msdk.foundation.same.a.I) {
                p();
                return;
            }
            if (z10 && this.f44754l0 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.L0 = true;
                    aVar2.a(2, c(this.f44768s0));
                    return;
                }
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
            if (aVar3 != null) {
                this.L0 = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < u0.f(this.f44611a.getApplicationContext());
    }

    public boolean isInstDialogShowing() {
        return this.F0;
    }

    public boolean isMiniCardShowing() {
        return this.W;
    }

    public boolean isRewardPopViewShowing() {
        return this.J;
    }

    public boolean isShowingAlertView() {
        return this.I;
    }

    public boolean isShowingTransparent() {
        return this.f44747e0;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i10 = iIndexOfChild + 1;
        boolean z10 = false;
        while (i10 <= childCount - 1) {
            if (viewGroup.getChildAt(i10).getVisibility() == 0 && this.W) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.f44744b0 = true;
            this.f44746d0 = false;
        } else if (i10 == 1) {
            this.f44745c0 = true;
        }
    }

    public void notifyVideoClose() {
        this.L0 = true;
        this.notifyListener.a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.W || this.I || this.f44762p0) {
            return;
        }
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f44612b.getRewardTemplateMode().f() == 5002010 && (z10 = this.f44768s0)) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                this.L0 = true;
                aVar.a(2, c(z10));
                return;
            }
            return;
        }
        if (this.f44743a0) {
            y();
            return;
        }
        boolean z11 = this.f44744b0;
        if (z11 && this.f44745c0) {
            y();
        } else {
            if (z11 || !this.f44746d0) {
                return;
            }
            y();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f44612b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f44615e && this.T) {
            u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.P0 != null) {
                getHandler().removeCallbacks(this.P0);
            }
            if (this.f44782z0 != 0) {
                removeCallbacks(this.Q0);
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.D = bVar;
        if (!this.f44615e) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.K) && this.f44612b != null) {
            AdSession adSession = this.f44751i0;
            if (adSession != null) {
                adSession.registerAdView(this.mPlayerView);
                SoundImageView soundImageView = this.mSoundImageView;
                if (soundImageView != null) {
                    this.f44751i0.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, null);
                }
                this.f44751i0.addFriendlyObstruction(this.f44755m, FriendlyObstructionPurpose.OTHER, null);
                this.f44751i0.addFriendlyObstruction(this.f44757n, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            k();
            this.mPlayerView.initBufferIngParam(this.M);
            this.mPlayerView.initVFPData(this.K, this.f44612b.getVideoUrlEncode(), this.N0);
            soundOperate(this.f44750h0, -1, null);
        }
        W0 = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        ProgressBar progressBar;
        if (this.f44615e) {
            if (i10 == 1) {
                ProgressBar progressBar2 = this.f44763q;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i10 != 2 || (progressBar = this.f44763q) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        if (this.f44615e) {
            p0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
            CampaignEx campaignEx = this.f44612b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            if (i10 > 0 && i10 <= videoLength && this.mPlayerView != null) {
                p0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
                this.mPlayerView.seekTo(i10 * 1000);
            }
            if (i11 == 1) {
                this.f44755m.setVisibility(8);
            } else if (i11 == 2) {
                this.f44755m.setVisibility(0);
            }
            if (this.f44755m.getVisibility() == 0) {
                f();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.V) {
                playerView.release();
                if (!TextUtils.isEmpty(this.K)) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - X0;
                    }
                    eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f44612b, eVar);
                }
            }
            w wVar = this.N0;
            if (wVar != null) {
                wVar.d();
            }
            if (this.f44771u != null) {
                this.f44771u = null;
            }
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f44751i0 = adSession;
    }

    public void setBufferTimeout(int i10) {
        this.M = i10;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || this.B == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() == null || this.f44612b.getRewardTemplateMode().f() != 902) {
            int i10 = this.F;
            if (i10 != -5) {
                if (i10 == -3) {
                    return;
                }
                if (this.C == null) {
                    addCTAView();
                }
                if (this.F == -1) {
                    if (this.B.getVisibility() != 0) {
                        this.B.setVisibility(0);
                        postDelayed(this.P0, 3000L);
                    } else {
                        this.B.setVisibility(8);
                        getHandler().removeCallbacks(this.P0);
                    }
                }
                if (this.F >= 0) {
                    this.B.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.E < -1) {
                return;
            }
            if (this.C == null) {
                addCTAView();
            }
            int i11 = this.E;
            if (i11 >= 0) {
                this.B.setVisibility(0);
                return;
            }
            if (i11 == -1) {
                if (this.B.getVisibility() != 0) {
                    this.B.setVisibility(0);
                    postDelayed(this.P0, 3000L);
                } else {
                    this.B.setVisibility(8);
                    getHandler().removeCallbacks(this.P0);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, List<CampaignEx> list, int i10, int i11) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f44777x = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i10;
        this.f44781z = i11;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            CampaignEx campaignEx2 = this.f44612b;
            if (campaignEx2 == null || campaignEx2.getProgressBarShow() != 1 || (mBridgeSegmentsProgressBar = this.f44769t) == null) {
                return;
            }
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f44769t.setVisibility(0);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f44769t;
        if (mBridgeSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            mBridgeSegmentsProgressBar2.setVisibility(0);
            this.f44769t.init(this.mCampaignSize, 2);
            for (int i12 = 0; i12 < this.mCampOrderViewData.size(); i12++) {
                int videoPlayProgress = this.mCampOrderViewData.get(i12).getVideoPlayProgress();
                if (videoPlayProgress > 0) {
                    this.f44769t.setProgress(videoPlayProgress, i12);
                }
                if (this.mCampOrderViewData.get(i12).isRewardPopViewShowed) {
                    this.H = true;
                }
            }
            return;
        }
        CampaignEx campaignEx3 = this.f44612b;
        if (campaignEx3 == null || campaignEx3.getProgressBarShow() != 1) {
            this.f44769t.setVisibility(8);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f44769t;
        if (mBridgeSegmentsProgressBar3 != null) {
            mBridgeSegmentsProgressBar3.init(1, 3);
            this.f44769t.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(campaignEx);
            this.N0.b(a(campaignEx), getCDRate());
        }
    }

    public void setCloseAlert(int i10) {
        this.N = i10;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f44771u = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        if (this.f44615e) {
            this.mPlayerView.setIsCovered(z10);
        }
    }

    public void setDialogRole(int i10) {
        this.f44766r0 = i10 == 1;
        p0.b(MBridgeBaseView.TAG, i10 + " " + this.f44766r0);
    }

    public void setIPlayVideoViewLayoutCallBack(com.mbridge.msdk.video.dynview.listener.f fVar) {
        this.f44779y = fVar;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f44754l0 = i10;
        this.f44756m0 = i11;
        this.f44758n0 = i12;
    }

    public void setInstDialogState(boolean z10) {
        PlayerView playerView;
        this.F0 = z10;
        if (!com.mbridge.msdk.util.b.a() || (playerView = this.mPlayerView) == null) {
            return;
        }
        playerView.setIsCovered(z10);
    }

    public void setIsIV(boolean z10) {
        this.f44749g0 = z10;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        this.W = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        RelativeLayout relativeLayout;
        MBridgeVideoView mBridgeVideoView;
        try {
            p0.b(MBridgeBaseView.TAG, "NOTCH VideoView ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i14 = layoutParams.leftMargin;
            int i15 = layoutParams.rightMargin;
            int i16 = layoutParams.topMargin;
            int i17 = layoutParams.bottomMargin;
            this.K0 = i12;
            if (Math.max(Math.max(i14, i15), Math.max(i16, i17)) <= Math.max(Math.max(i10, i11), Math.max(i12, i13)) && (relativeLayout = this.f44759o) != null) {
                mBridgeVideoView = this;
                try {
                    relativeLayout.postDelayed(mBridgeVideoView.new b(i10, i12, i11, i13), 200L);
                } catch (Exception e10) {
                    e = e10;
                    p0.b(MBridgeBaseView.TAG, e.getMessage());
                    return;
                }
            } else {
                mBridgeVideoView = this;
            }
            if (mBridgeVideoView.f44755m.getVisibility() == 0) {
                f();
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void setPlayURL(String str) {
        this.K = str;
    }

    public void setPlayerViewAttachListener(u uVar) {
        this.f44773v = uVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        this.f44748f0 = i10;
    }

    public void setShowingAlertViewCover(boolean z10) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z10 && (mBAcquireRewardPopView = this.E0) != null && this.J && this.I) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z10);
    }

    public void setShowingTransparent(boolean z10) {
        this.f44747e0 = z10;
    }

    public void setSoundState(int i10) {
        this.f44750h0 = i10;
    }

    public void setUnitId(String str) {
        this.Q = str;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.a(str);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f44752j0 = mediaEvents;
        w wVar = this.N0;
        if (wVar != null) {
            wVar.f44823f = mediaEvents;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f44612b = campaignEx;
            this.f44618h = campaignEx.isDynamicView();
        }
        if (this.f44618h) {
            a(this, campaignEx);
        } else {
            h();
        }
    }

    public void setVideoSkipTime(int i10) {
        this.L = i10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        setVisibility(i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.W) {
            return;
        }
        if (this.P == null) {
            this.P = new s();
        }
        if (this.O == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.P);
            this.O = mBAlertDialog;
            AdSession adSession = this.f44751i0;
            if (adSession != null) {
                adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        if (this.f44749g0) {
            this.O.makeIVAlertView(this.f44754l0, this.Q);
        } else {
            this.O.makeRVAlertView(this.Q);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (playerView.isComplete() && ((campaignEx = this.f44612b) == null || campaignEx.getRewardTemplateMode() == null || this.f44612b.getRewardTemplateMode().f() != 5002010)) {
                return;
            }
            this.O.show();
            this.f44760o0 = true;
            this.I = true;
            setShowingAlertViewCover(true);
            String strC = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.Q, false).c();
            this.f44753k0 = strC;
            com.mbridge.msdk.foundation.same.report.j.a(this.f44611a, this.f44612b, strC, this.Q, 1, 1);
        }
    }

    public void showBaitClickView() {
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f44612b.getRewardTemplateMode() == null) {
            return;
        }
        String strE = this.f44612b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = b1.a(strE, "bait_click");
            if (TextUtils.isEmpty(strA) || (i10 = Integer.parseInt(strA)) == 0 || (mBridgeBaitClickView = this.f44780y0) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.f44780y0.init(i10);
            this.f44780y0.startAnimation();
            this.f44780y0.setOnClickListener(new i());
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || this.G == null || !campaignEx.isDynamicView() || this.f44612b.getRewardTemplateMode() == null) {
            return;
        }
        String strE = this.f44612b.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = b1.a(strE, "mof");
            if (TextUtils.isEmpty(strA) || Integer.parseInt(strA) != 1) {
                return;
            }
            com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f44612b, this, new com.mbridge.msdk.video.module.listener.impl.i(this.f44771u), 1);
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.D0) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.E0.setVisibility(0);
            setCover(true);
            o();
            this.J = true;
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float f10;
        if (this.f44615e) {
            this.f44759o.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f44759o.getVisibility() != 0) {
                this.f44759o.setVisibility(0);
            }
            if (this.f44755m.getVisibility() == 0) {
                f();
            }
            if (!b(i12, i13) || this.T) {
                u();
                return;
            }
            S0 = i15;
            T0 = i16;
            U0 = i17 + 4;
            V0 = i18 + 4;
            float f11 = i12 / i13;
            try {
                f10 = (float) (this.R / this.S);
            } catch (Throwable th2) {
                p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                f10 = 0.0f;
            }
            if (i14 > 0) {
                R0 = i14;
                setPlayerViewRadius(i14);
            }
            if (Math.abs(f11 - f10) > 0.1f && this.f44748f0 != 1) {
                u();
                videoOperate(1);
                return;
            }
            u();
            if (!this.f44747e0) {
                setLayoutParam(i11, i10, i12, i13);
                return;
            }
            setLayoutCenter(i12, i13);
            if (W0) {
                this.notifyListener.a(114, "");
            } else {
                this.notifyListener.a(116, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        soundOperate(i10, i11, "2");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        p0.a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i10);
        if (this.f44615e) {
            if (i10 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    p0.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.I0;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.I || com.mbridge.msdk.foundation.feedback.b.f40664f) {
                        return;
                    }
                    if (!com.mbridge.msdk.util.b.a()) {
                        p();
                        return;
                    } else {
                        if (this.W || this.F0) {
                            return;
                        }
                        p();
                        return;
                    }
                }
                return;
            }
            if (i10 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    p0.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    o();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (this.V) {
                    return;
                }
                this.mPlayerView.stop();
                CampaignEx campaignEx = this.f44612b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f44612b.getRewardTemplateMode().f() != 5002010) {
                    this.mPlayerView.release();
                    this.V = true;
                    if (TextUtils.isEmpty(this.K)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - X0;
                    }
                    eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f44612b, eVar);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.F0 = true;
                    if (this.V) {
                        return;
                    }
                    o();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.F0 = false;
                    if (this.V || isMiniCardShowing()) {
                        return;
                    }
                    p();
                    return;
                }
                return;
            }
            if (i10 != 6 || this.V) {
                return;
            }
            this.mPlayerView.release();
            this.V = true;
            if (TextUtils.isEmpty(this.K)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            long jCurrentTimeMillis2 = X0;
            if (jCurrentTimeMillis2 != 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis() - X0;
            }
            eVar2.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jCurrentTimeMillis2));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f44612b, eVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        w wVar;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f44612b.getRewardTemplateMode().f() != 5002010 || (relativeLayout = this.I0) == null || relativeLayout.getVisibility() == 0) {
                if (!this.U) {
                    boolean zPlayVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.f44612b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !zPlayVideo && (wVar = this.N0) != null) {
                        wVar.onPlayError("play video failed");
                    }
                    this.U = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.E0;
                if (mBAcquireRewardPopView != null && this.J) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.J) {
                    return;
                }
                if (!com.mbridge.msdk.util.b.a()) {
                    w();
                } else {
                    if (this.F0 || this.I) {
                        return;
                    }
                    this.mPlayerView.setIsCovered(false);
                    w();
                }
            }
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String strE;
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.H) {
            return;
        }
        if (!TextUtils.isEmpty(this.f44612b.getMof_template_url())) {
            strE = this.f44612b.getMof_template_url();
        } else if (this.f44612b.getRewardTemplateMode() == null) {
            return;
        } else {
            strE = this.f44612b.getRewardTemplateMode().e();
        }
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            String strA = b1.a(strE, "guideShow");
            String strA2 = b1.a(strE, "guideDelay");
            String strA3 = b1.a(strE, "guideTime");
            String strA4 = b1.a(strE, "guideRewardTime");
            if (!TextUtils.isEmpty(strA)) {
                this.f44782z0 = Integer.parseInt(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                int i10 = Integer.parseInt(strA2);
                this.A0 = i10;
                if (i10 > 10 || i10 < 3) {
                    this.A0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                int i11 = Integer.parseInt(strA3);
                this.B0 = i11;
                if (i11 > 10 || i11 < 3) {
                    this.B0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA4)) {
                int i12 = Integer.parseInt(strA4);
                this.C0 = i12;
                if (i12 > 10 || i12 < 5) {
                    this.C0 = 5;
                }
            }
            int i13 = this.f44782z0;
            if (i13 > 0 && i13 <= 2) {
                int videoCompleteTime = getVideoCompleteTime();
                if (videoCompleteTime == 0 || videoCompleteTime > this.A0) {
                    int i14 = videoCompleteTime - this.A0;
                    if (i14 >= 0 && this.C0 > i14) {
                        this.C0 = i14;
                    }
                    int videoAllDuration = getVideoAllDuration();
                    if (this.C0 >= videoAllDuration) {
                        this.C0 = videoAllDuration - this.A0;
                    }
                    if (this.A0 >= videoAllDuration) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f44612b.getAppName());
                    com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
                    this.D0 = new AcquireRewardPopViewParameters.Builder("", this.Q, this.f44782z0, gVarB != null ? gVarB.k() : "US").setAutoDismissTime(this.B0).setReduceTime(this.C0).setBehaviourListener(new j()).setRightAnswerList(arrayList).build();
                    postDelayed(this.Q0, 1000L);
                }
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void r() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    private void s() {
        int iB;
        int iF;
        float fG = u0.g(this.f44611a);
        float f10 = u0.f(this.f44611a);
        double d10 = this.R;
        if (d10 > 0.0d) {
            double d11 = this.S;
            if (d11 > 0.0d && fG > 0.0f && f10 > 0.0f) {
                double d12 = d10 / d11;
                double d13 = fG / f10;
                p0.c(MBridgeBaseView.TAG, "videoWHDivide:" + d12 + "  screenWHDivide:" + d13);
                double dA = u0.a(Double.valueOf(d12));
                double dA2 = u0.a(Double.valueOf(d13));
                p0.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + dA + "  screenWHDivideFinal:" + dA2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (dA > dA2) {
                    double d14 = (fG * this.S) / this.R;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d14;
                    layoutParams.gravity = 17;
                } else if (dA < dA2) {
                    layoutParams.width = (int) (f10 * d12);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.f44612b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.f44612b.getRewardTemplateMode() != null) {
                            iF = this.f44612b.getRewardTemplateMode().f();
                            iB = this.f44612b.getRewardTemplateMode().b();
                        } else {
                            iB = this.f44611a.getResources().getConfiguration().orientation;
                            iF = EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE;
                        }
                        if (iF == 102 || iF == 202) {
                            if (iB == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.S / (this.R / fG));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (f10 * d12);
                            }
                        }
                        if (iF == 202 && !TextUtils.isEmpty(this.f44612b.getImageUrl())) {
                            setBlurBackgroundImage(this.f44612b.getImageUrl());
                        }
                        if (iF == 302 || iF == 802 || iF == 5002010) {
                            double d15 = this.R;
                            double d16 = this.S;
                            if (d15 / d16 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d16 * fG) / d15);
                            } else {
                                int iA = u0.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.R * iA) / this.S);
                                layoutParams.height = iA;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    p0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
                this.mPlayerView.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        v();
    }

    private void u() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getAdSpaceT() == 2) {
            t();
        } else {
            s();
        }
    }

    private void v() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f44615e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int iG = u0.g(this.f44611a);
            layoutParams.width = -1;
            layoutParams.height = (iG * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void w() {
        if (this.f44768s0) {
            if (!this.f44770t0) {
                this.mPlayerView.seekToEndFrame();
            }
            this.f44770t0 = true;
        } else {
            this.mPlayerView.onResume();
        }
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!this.f44615e || this.f44757n.getVisibility() == 0) {
            return;
        }
        if (!this.f44618h || this.A) {
            this.f44757n.setVisibility(0);
        }
        this.f44743a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        int i10;
        com.mbridge.msdk.video.module.listener.a aVar;
        boolean z10;
        try {
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f44612b.getRewardTemplateMode().f() == 5002010 && this.L0 && !(z10 = this.f44768s0)) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.L0 = true;
                    aVar2.a(2, c(z10));
                    return;
                }
                return;
            }
            if (!this.f44749g0 || ((i10 = this.f44754l0) != com.mbridge.msdk.foundation.same.a.H && i10 != com.mbridge.msdk.foundation.same.a.I)) {
                CampaignEx campaignEx2 = this.f44612b;
                if (campaignEx2 == null || campaignEx2.getAdSpaceT() == 2) {
                    com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
                    if (aVar3 != null) {
                        this.L0 = true;
                        aVar3.a(2, "");
                        return;
                    }
                    return;
                }
                boolean zM = m();
                if (zM && this.N == 1 && !this.f44747e0) {
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar4 = this.notifyListener;
                    if (aVar4 != null) {
                        aVar4.a(8, "");
                        return;
                    }
                    return;
                }
                if (this.notifyListener != null) {
                    this.L0 = true;
                    if (this.f44612b.getAdType() == 94 && !zM) {
                        this.notifyListener.a(17, "");
                    }
                    this.notifyListener.a(2, c(!zM));
                    return;
                }
                return;
            }
            if (this.f44760o0) {
                if (i10 != com.mbridge.msdk.foundation.same.a.I || (aVar = this.notifyListener) == null) {
                    return;
                }
                this.L0 = true;
                aVar.a(2, c(this.f44768s0));
                return;
            }
            if (i10 == com.mbridge.msdk.foundation.same.a.I && this.f44774v0) {
                com.mbridge.msdk.video.module.listener.a aVar5 = this.notifyListener;
                if (aVar5 != null) {
                    this.L0 = true;
                    aVar5.a(2, c(this.f44768s0));
                    return;
                }
                return;
            }
            if (this.f44766r0) {
                int curPosition = this.mPlayerView.getCurPosition() / 1000;
                int videoLength = (int) ((curPosition / (this.mPlayerView.getDuration() == 0 ? this.f44612b.getVideoLength() : this.mPlayerView.getDuration())) * 100.0f);
                if (this.f44754l0 == com.mbridge.msdk.foundation.same.a.H) {
                    o();
                    int i11 = this.f44756m0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.J && videoLength >= this.f44758n0) {
                        com.mbridge.msdk.video.module.listener.a aVar6 = this.notifyListener;
                        if (aVar6 != null) {
                            this.L0 = true;
                            aVar6.a(2, c(this.f44768s0));
                            return;
                        }
                        return;
                    }
                    if (i11 == com.mbridge.msdk.foundation.same.a.K && curPosition >= this.f44758n0) {
                        com.mbridge.msdk.video.module.listener.a aVar7 = this.notifyListener;
                        if (aVar7 != null) {
                            this.L0 = true;
                            aVar7.a(2, c(this.f44768s0));
                            return;
                        }
                        return;
                    }
                    com.mbridge.msdk.video.module.listener.a aVar8 = this.notifyListener;
                    if (aVar8 != null) {
                        aVar8.a(8, "");
                    }
                }
                if (this.f44754l0 == com.mbridge.msdk.foundation.same.a.I) {
                    int i12 = this.f44756m0;
                    if (i12 == com.mbridge.msdk.foundation.same.a.J && videoLength >= this.f44758n0) {
                        o();
                        com.mbridge.msdk.video.module.listener.a aVar9 = this.notifyListener;
                        if (aVar9 != null) {
                            aVar9.a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i12 != com.mbridge.msdk.foundation.same.a.K || curPosition < this.f44758n0) {
                        return;
                    }
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar10 = this.notifyListener;
                    if (aVar10 != null) {
                        aVar10.a(8, "");
                    }
                }
            }
        } catch (Exception e10) {
            p0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        com.mbridge.msdk.video.module.listener.a aVar;
        SoundImageView soundImageView;
        if (this.f44615e) {
            this.f44750h0 = i10;
            if (i10 == 1) {
                this.D.getJSCommon().g(i10);
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    MediaEvents mediaEvents = this.f44752j0;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                        p0.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e10) {
                    p0.a("OMSDK", e10.getMessage());
                }
            } else if (i10 == 2) {
                this.D.getJSCommon().g(i10);
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    MediaEvents mediaEvents2 = this.f44752j0;
                    if (mediaEvents2 != null) {
                        mediaEvents2.volumeChange(1.0f);
                        p0.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e11) {
                    p0.a("OMSDK", e11.getMessage());
                }
            }
            CampaignEx campaignEx = this.f44612b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i11 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i11 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.notifyListener) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(boolean z10) throws JSONException {
        if (!this.f44749g0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f44760o0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.F);
            }
            if (this.f44764q0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.D);
            }
            if (this.f44762p0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.E);
            }
            jSONObject.put("complete_info", z10 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            p0.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.Q);
            com.mbridge.msdk.foundation.feedback.b.b().a(j1.o2.o(new StringBuilder(), this.Q, "_1"), this.f44612b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            if (this.f44765r != null) {
                com.mbridge.msdk.foundation.feedback.b.b().a(j1.o2.o(new StringBuilder(), this.Q, "_1"), this.f44765r);
            }
        } else {
            FeedBackButton feedBackButton = this.f44765r;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CollapsibleWebView collapsibleWebView = this.H0;
        if (collapsibleWebView == null || this.f44612b == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.H0.loadUrl(this.f44612b.getClickURL());
        this.H0.setToolBarTitle(this.f44612b.getAppName());
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        if (gVarF == null) {
            gVarF = com.mbridge.msdk.setting.h.b().a();
        }
        this.H0.setPageLoadTimtout((int) gVarF.o0());
        this.H0.setPageLoadListener(new d());
        this.H0.setWebViewClient(new e());
        this.H0.setCollapseListener(new f());
        this.H0.setExpandListener(new g());
        this.H0.setExitsClickListener(new h());
    }

    private void h() {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (h0.a(iFindLayout)) {
            this.f44613c.inflate(iFindLayout, this);
            n();
        }
        W0 = false;
        r();
    }

    private void i() {
        if (this.O0 || this.f44746d0 || this.f44744b0) {
            return;
        }
        this.O0 = true;
        int i10 = this.L;
        if (i10 < 0) {
            return;
        }
        if (i10 == 0) {
            this.f44746d0 = true;
        } else {
            new Handler().postDelayed(new a(), this.L * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.B == null) {
            return;
        }
        if (this.C == null) {
            addCTAView();
        }
        if (this.B.getVisibility() != 0) {
            this.B.setVisibility(0);
            postDelayed(this.P0, 3000L);
        } else {
            this.B.setVisibility(8);
            getHandler().removeCallbacks(this.P0);
        }
    }

    private void k() {
        CampaignEx campaignEx = this.f44612b;
        if (campaignEx == null || !z0.b(campaignEx.getVideoResolution())) {
            return;
        }
        String videoResolution = this.f44612b.getVideoResolution();
        p0.c(MBridgeBaseView.TAG, RnJusJ.KvKKHpYw + videoResolution);
        String[] strArrSplit = videoResolution.split("x");
        if (strArrSplit.length == 2) {
            if (u0.m(strArrSplit[0]) > 0.0d) {
                this.R = u0.m(strArrSplit[0]);
            }
            if (u0.m(strArrSplit[1]) > 0.0d) {
                this.S = u0.m(strArrSplit[1]);
            }
            p0.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.R + "  mVideoH:" + this.S);
        }
        if (this.R <= 0.0d) {
            this.R = 1280.0d;
        }
        if (this.S <= 0.0d) {
            this.S = 720.0d;
        }
    }

    private boolean l() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.f44776w0, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.f44776w0, "mbridge_sound_switch"));
            this.f44755m = (TextView) findViewById(filterFindViewId(this.f44776w0, "mbridge_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.f44776w0, PcrIk.aBdmxQsgU));
            this.f44757n = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            this.f44759o = (RelativeLayout) findViewById(filterFindViewId(this.f44776w0, "mbridge_top_control"));
            this.f44761p = (ImageView) findViewById(filterFindViewId(this.f44776w0, "mbridge_videoview_bg"));
            this.f44763q = (ProgressBar) findViewById(filterFindViewId(this.f44776w0, "mbridge_video_progress_bar"));
            this.f44765r = (FeedBackButton) findViewById(filterFindViewId(this.f44776w0, "mbridge_native_endcard_feed_btn"));
            this.f44767s = (ImageView) findViewById(filterFindViewId(this.f44776w0, "mbridge_iv_link"));
            this.G0 = (RelativeLayout) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_scale_webview_layout"));
            this.I0 = (RelativeLayout) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_header_layout"));
            if (this.G0 != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.H0 = collapsibleWebView;
                this.G0.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            u0.a(1, this.f44767s, this.f44612b, this.f44611a, false, new t());
            this.f44769t = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_segment_progressbar"));
            this.B = (FrameLayout) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_cta_layout"));
            this.f44780y0 = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f44776w0, "mbridge_animation_click_view"));
            this.G = (RelativeLayout) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_moreoffer_layout"));
            this.E0 = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.f44776w0, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.f44776w0, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f44755m, this.f44757n);
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    private boolean m() {
        int videoCompleteTime = getVideoCompleteTime();
        int curPosition = (this.mPlayerView.getCurPosition() / 1000) + 1;
        if (this.f44612b.getDynamicTempCode() != 5 || this.mCurrPlayNum <= 1) {
            if ((videoCompleteTime <= 0 || curPosition >= videoCompleteTime) && videoCompleteTime != 0) {
                return false;
            }
        } else if (videoCompleteTime == 0 || videoCompleteTime <= 0 || curPosition >= videoCompleteTime) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        PlayerView playerView;
        boolean zL = l();
        this.f44615e = zL;
        if (!zL) {
            p0.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (r0.a().a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new n());
        }
        d();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f44778x0 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f44612b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.Q0);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    this.mPlayerView.setIsCovered(this.F0 || this.I || this.J);
                }
                CampaignEx campaignEx2 = this.f44612b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.f44612b.isHasReportAdTrackPause()) {
                    return;
                }
                this.f44612b.setHasReportAdTrackPause(true);
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                CampaignEx campaignEx3 = this.f44612b;
                com.mbridge.msdk.click.a.a(contextD, campaignEx3, this.Q, campaignEx3.getNativeVideoTracking().n(), false, false);
            }
        } catch (Throwable th2) {
            p0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f44615e) {
            a1.a(this.mPlayerView, this.f44612b.getLocalRequestId(), this.f44612b.getLocalAllowTrackClick());
            if (this.f44618h) {
                if (com.mbridge.msdk.video.dynview.util.a.b(this.f44612b) == -1 || com.mbridge.msdk.video.dynview.util.a.b(this.f44612b) == 100) {
                    this.mPlayerView.setOnClickListener(new o());
                }
            } else {
                this.mPlayerView.setOnClickListener(new p());
            }
            SoundImageView soundImageView = this.mSoundImageView;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new q());
            }
            this.f44757n.setOnClickListener(new r());
        }
    }

    private boolean b(int i10, int i11) {
        return i10 > 0 && i11 > 0 && u0.g(this.f44611a) >= i10 && u0.f(this.f44611a) >= i11;
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.c cVarB = new com.mbridge.msdk.video.dynview.wrapper.c().b(viewGroup, campaignEx);
        com.mbridge.msdk.video.dynview.b.a().a(cVarB, new l(viewGroup, campaignEx, cVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9) throws org.json.JSONException {
        /*
            r8 = this;
            com.mbridge.msdk.video.module.listener.a r0 = r8.f44771u
            if (r0 == 0) goto L9c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f44612b
            if (r0 == 0) goto L56
            r1 = 1
            r0.setClickTempSource(r1)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r0.getRewardTemplateMode()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = ""
            if (r0 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            int r0 = r0.f()     // Catch: java.lang.Exception -> L2b
            r2.append(r0)     // Catch: java.lang.Exception -> L2b
            r2.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L2b
        L29:
            r7 = r1
            goto L2e
        L2b:
            r0 = move-exception
            r9 = r0
            goto L53
        L2e:
            android.content.Context r0 = r8.f44611a     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r1.getCampaignUnitId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            boolean r3 = r1.isBidCampaign()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r1.getRequestId()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r1.getRequestIdNotice()     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r8.f44612b     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r1.getId()     // Catch: java.lang.Exception -> L2b
            r1 = r9
            com.mbridge.msdk.foundation.same.report.j.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            goto L56
        L53:
            r9.printStackTrace()
        L56:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68
            r9.<init>()     // Catch: org.json.JSONException -> L68
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f40713j     // Catch: org.json.JSONException -> L66
            r1 = 0
            org.json.JSONObject r1 = r8.a(r1)     // Catch: org.json.JSONException -> L66
            r9.put(r0, r1)     // Catch: org.json.JSONException -> L66
            goto L6e
        L66:
            r0 = move-exception
            goto L6b
        L68:
            r0 = move-exception
            r9 = r0
            r9 = 0
        L6b:
            r0.printStackTrace()
        L6e:
            com.mbridge.msdk.video.module.listener.a r0 = r8.f44771u
            r1 = 105(0x69, float:1.47E-43)
            r0.a(r1, r9)
            com.mbridge.msdk.foundation.controller.c r9 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r9 = r9.d()
            if (r9 == 0) goto L9c
            com.mbridge.msdk.foundation.controller.c r9 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L91
            android.content.Context r9 = r9.d()     // Catch: java.lang.Exception -> L91
            android.content.Context r9 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L91
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f44612b     // Catch: java.lang.Exception -> L91
            com.mbridge.msdk.video.module.report.b.a(r9, r0)     // Catch: java.lang.Exception -> L91
            goto L9c
        L91:
            r0 = move-exception
            r9 = r0
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.p0.b(r0, r9)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.b(java.lang.String):void");
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return u0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return o2.j(i11, "");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements com.mbridge.msdk.video.dynview.listener.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f44802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f44803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f44804c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends com.mbridge.msdk.widget.a {
            public a() {
            }

            @Override // com.mbridge.msdk.widget.a
            public void a(View view) throws JSONException {
                if (view instanceof TextView) {
                    MBridgeVideoView.this.f44612b.setTriggerClickSource(1);
                } else {
                    MBridgeVideoView.this.f44612b.setTriggerClickSource(2);
                }
                if (MBridgeVideoView.this.f44612b.getRewardTemplateMode() == null || MBridgeVideoView.this.f44612b.getRewardTemplateMode().f() != 902) {
                    MBridgeVideoView.this.b("video_play_click");
                } else {
                    MBridgeVideoView.this.j();
                }
            }
        }

        public l(ViewGroup viewGroup, CampaignEx campaignEx, com.mbridge.msdk.video.dynview.c cVar) {
            this.f44802a = viewGroup;
            this.f44803b = campaignEx;
            this.f44804c = cVar;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                if (this.f44802a != null && aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f44802a.addView(aVar.b());
                }
                if (aVar.a() != null) {
                    for (View view : aVar.a()) {
                        a1.a(view, this.f44803b.getLocalRequestId(), this.f44803b.getLocalAllowTrackClick());
                        view.setOnClickListener(new a());
                    }
                }
                MBridgeVideoView.this.f44776w0 = aVar.c();
                MBridgeVideoView.this.n();
                boolean unused = MBridgeVideoView.W0 = false;
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                CampaignEx campaignEx = mBridgeVideoView.f44612b;
                if (campaignEx != null) {
                    campaignEx.setTemplateRenderSucc(mBridgeVideoView.f44776w0);
                }
                MBridgeVideoView.this.E = this.f44804c.j();
                MBridgeVideoView.this.F = this.f44804c.e();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            p0.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.b());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class s implements com.mbridge.msdk.widget.dialog.b {
        public s() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            MBridgeVideoView.this.I = false;
            MBridgeVideoView.this.f44764q0 = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.I);
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f44611a, mBridgeVideoView2.f44612b, mBridgeVideoView2.f44753k0, MBridgeVideoView.this.Q, 1, 1, 1);
            if (MBridgeVideoView.this.f44749g0 && MBridgeVideoView.this.f44754l0 == com.mbridge.msdk.foundation.same.a.H) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f44768s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f44749g0 && MBridgeVideoView.this.f44754l0 == com.mbridge.msdk.foundation.same.a.I) {
                MBridgeVideoView.this.p();
                return;
            }
            MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
            if (mBridgeVideoView5.notifyListener != null) {
                mBridgeVideoView5.L0 = true;
                MBridgeVideoView.this.notifyListener.a(2, "");
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            MBridgeVideoView.this.I = false;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.I);
            if (MBridgeVideoView.this.f44749g0 && (MBridgeVideoView.this.f44754l0 == com.mbridge.msdk.foundation.same.a.I || MBridgeVideoView.this.f44754l0 == com.mbridge.msdk.foundation.same.a.H)) {
                MBridgeVideoView.this.f44762p0 = true;
                com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
                if (aVar != null) {
                    aVar.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "");
                }
                MBridgeVideoView.this.f44772u0 = true;
                MBridgeVideoView.this.gonePlayingCloseView();
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f44611a, mBridgeVideoView2.f44612b, mBridgeVideoView2.f44753k0, MBridgeVideoView.this.Q, 1, 0, 1);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.Q, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.Q, false).w();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            p0.b(MBridgeBaseView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    p0.b(MBridgeBaseView.TAG, th2.getMessage());
                }
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f44775w = false;
        this.f44781z = 0;
        this.H = false;
        this.I = false;
        this.J = false;
        this.Q = "";
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f44743a0 = false;
        this.f44744b0 = false;
        this.f44745c0 = false;
        this.f44746d0 = false;
        this.f44747e0 = false;
        this.f44749g0 = false;
        this.f44750h0 = 2;
        this.f44760o0 = false;
        this.f44762p0 = false;
        this.f44764q0 = false;
        this.f44766r0 = true;
        this.f44768s0 = false;
        this.f44770t0 = false;
        this.f44772u0 = false;
        this.f44774v0 = false;
        this.f44776w0 = false;
        this.f44782z0 = 0;
        this.A0 = 5;
        this.B0 = 5;
        this.C0 = 5;
        this.F0 = false;
        this.J0 = false;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        this.N0 = new w(this);
        this.O0 = false;
        this.P0 = new k();
        this.Q0 = new m();
    }
}
