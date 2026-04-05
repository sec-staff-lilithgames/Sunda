package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.mbridge.msdk.widget.FeedBackButton;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean P;
    private static long Q;
    private AdSession A;
    private AdEvents B;
    private MediaEvents C;
    private d D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private RelativeLayout N;
    private ProgressBar O;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f44290p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f44291q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f44292r;

    /* renamed from: s, reason: collision with root package name */
    private View f44293s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f44294t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f44295u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f44296v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f44297w;

    /* renamed from: x, reason: collision with root package name */
    private int f44298x;

    /* renamed from: y, reason: collision with root package name */
    private int f44299y;

    /* renamed from: z, reason: collision with root package name */
    private int f44300z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            boolean zIsSilent = MBridgeBTVideoView.this.f44290p.isSilent();
            if (MBridgeBTVideoView.this.f44296v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f44195n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f44200d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f44296v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    p0.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.E);
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f44296v, e10.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTVideoView.this.f44296v != null) {
                BTBaseView.a(MBridgeBTVideoView.this.f44296v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f44200d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTVideoView.this.C != null) {
                try {
                    MBridgeBTVideoView.this.C.adUserInteraction(InteractionType.CLICK);
                    p0.a("omsdk", "btv adUserInteraction click");
                } catch (Exception e10) {
                    p0.b("omsdk", e10.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.f44296v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f44195n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f44200d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f44296v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f44296v, "onClicked", MBridgeBTVideoView.this.f44200d);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f44304a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f44305b;

        /* renamed from: c, reason: collision with root package name */
        private MediaEvents f44306c;

        /* renamed from: d, reason: collision with root package name */
        private String f44307d;

        /* renamed from: e, reason: collision with root package name */
        private String f44308e;

        /* renamed from: f, reason: collision with root package name */
        private int f44309f;

        /* renamed from: g, reason: collision with root package name */
        private int f44310g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f44311h;

        /* renamed from: l, reason: collision with root package name */
        private int f44315l;

        /* renamed from: m, reason: collision with root package name */
        private int f44316m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f44312i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f44313j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f44314k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f44317n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f44318o = false;

        public d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f44304a = mBridgeBTVideoView;
            this.f44305b = webView;
            this.f44306c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f44307d = mBridgeBTVideoView.f44200d;
                this.f44308e = mBridgeBTVideoView.f44199c;
            }
        }

        public void b(int i10, int i11) {
            this.f44315l = i10;
            this.f44316m = i11;
            a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f44306c == null || !this.f44318o) {
                    return;
                }
                p0.b("omsdk", "bt onBufferingEnd");
                this.f44318o = false;
                this.f44306c.bufferFinish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                p0.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f44306c != null) {
                    p0.b("omsdk", "bt onBufferingStart");
                    this.f44306c.bufferStart();
                    this.f44318o = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) throws JSONException {
            try {
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) {
                    return;
                }
                if (this.f44305b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f44195n);
                        jSONObject.put("id", this.f44307d);
                        jSONObject.put("data", new JSONObject());
                        f.a().a(this.f44305b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.mbridge.msdk.video.bt.component.d.c().a(this.f44305b, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) throws JSONException {
            super.onPlayError(str);
            if (this.f44305b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f44196o);
                    jSONObject.put("id", this.f44307d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f44307d);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f44305b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f44305b, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) throws JSONException {
            int videoCompleteTime;
            String strJ;
            super.onPlayProgress(i10, i11);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.f44304a;
            if (mBridgeBTVideoView.f44204h) {
                CampaignEx campaignEx = mBridgeBTVideoView.f44198b;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f44304a.f44198b.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                if (videoCompleteTime > i11 || videoCompleteTime <= 0) {
                    videoCompleteTime = i11;
                }
                int i12 = videoCompleteTime <= 0 ? i11 - i10 : videoCompleteTime - i10;
                if (i12 <= 0) {
                    strJ = videoCompleteTime <= 0 ? "0" : (String) this.f44304a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else if (videoCompleteTime <= 0) {
                    strJ = o2.j(i12, "");
                } else {
                    strJ = i12 + ((String) this.f44304a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left", "string")));
                }
                CampaignEx campaignEx2 = this.f44304a.f44198b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f44304a.f44198b.getVst(), i11);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i13 = videoCompleteTime - i10;
                        if (this.f44304a.f44198b.getAdType() == 287) {
                            if (i13 > 0) {
                                strJ = i13 + ((String) this.f44304a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                            } else if (i13 == 0) {
                                this.f44304a.f44292r.setVisibility(4);
                            }
                        }
                    } else {
                        int i14 = iMin - i10;
                        if (i14 > 0) {
                            strJ = i14 + ((String) this.f44304a.getContext().getResources().getText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                        } else if (this.f44304a.f44198b.getAdType() == 287 && i14 == 0) {
                            this.f44304a.f44292r.setVisibility(4);
                        }
                    }
                }
                this.f44304a.f44292r.setText(strJ);
            }
            this.f44310g = i11;
            this.f44309f = i10;
            this.f44304a.O.setMax(this.f44310g);
            this.f44304a.O.setProgress(this.f44309f);
            if (this.f44305b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f44195n);
                    jSONObject.put("id", this.f44307d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f44307d);
                    jSONObject2.put(NotificationCompat.CATEGORY_PROGRESS, MBridgeBTVideoView.b(i10, i11));
                    jSONObject2.put(DTBMetricReport.TIME, String.valueOf(i10));
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(i11));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f44305b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f44305b, e10.getMessage());
                }
            }
            MediaEvents mediaEvents = this.f44306c;
            if (mediaEvents != null) {
                int i15 = (i10 * 100) / i11;
                int i16 = ((i10 + 1) * 100) / i11;
                if (i15 <= 25 && 25 < i16 && !this.f44312i) {
                    this.f44312i = true;
                    mediaEvents.firstQuartile();
                    p0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i15 <= 50 && 50 < i16 && !this.f44313j) {
                    this.f44313j = true;
                    mediaEvents.midpoint();
                    p0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i15 <= 75 && 75 < i16 && !this.f44314k) {
                    this.f44314k = true;
                    mediaEvents.thirdQuartile();
                    p0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) throws JSONException {
            super.onPlayStarted(i10);
            if (!this.f44311h) {
                this.f44304a.O.setMax(i10);
                WebView webView = this.f44305b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f44307d);
                }
                this.f44311h = true;
                if (this.f44306c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f44304a;
                        this.f44306c.start(i10, (mBridgeBTVideoView == null || mBridgeBTVideoView.f44290p == null) ? 0.0f : this.f44304a.f44290p.getVolume());
                        p0.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e10) {
                        p0.b("omsdk", e10.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.P = false;
        }

        private void a() {
            int i10;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            if (!r0.a().a("h_c_r_w_p_c", false) || (i10 = this.f44315l) == 100 || this.f44316m != 0 || this.f44317n || i10 == 0 || (mBridgeBTVideoView = this.f44304a) == null || (campaignEx = mBridgeBTVideoView.f44198b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f44304a.f44198b.getAdType() == 287) {
                    str = this.f44304a.f44198b.getRequestId() + this.f44304a.f44198b.getId() + this.f44304a.f44198b.getVideoUrlEncode();
                } else {
                    str = this.f44304a.f44198b.getId() + this.f44304a.f44198b.getVideoUrlEncode() + this.f44304a.f44198b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f44308e, str);
                if (aVarA != null) {
                    aVarA.v();
                    this.f44317n = true;
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

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() throws JSONException {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f44304a;
            CampaignEx campaignEx = mBridgeBTVideoView.f44198b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f44304a.f44292r.setText(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), yFkbx.ArBIOvq, "string"));
                } else {
                    this.f44304a.f44292r.setText("0");
                }
            } else {
                mBridgeBTVideoView.f44292r.setText("0");
            }
            this.f44304a.f44290p.setClickable(false);
            WebView webView = this.f44305b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f44307d);
            }
            MediaEvents mediaEvents = this.f44306c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                p0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f44309f = this.f44310g;
            boolean unused = MBridgeBTVideoView.P = true;
            this.f44304a.stop();
        }

        private void a(int i10, int i11) {
            int i12;
            int i13;
            String str;
            try {
                int i14 = this.f44315l;
                if (i14 == 100 || this.f44317n || i14 == 0 || (i12 = this.f44316m) < 0 || i10 < (i13 = (i11 * i12) / 100)) {
                    return;
                }
                if (this.f44304a.f44198b.getAdType() != 94 && this.f44304a.f44198b.getAdType() != 287) {
                    str = this.f44304a.f44198b.getId() + this.f44304a.f44198b.getVideoUrlEncode() + this.f44304a.f44198b.getBidToken();
                } else {
                    str = this.f44304a.f44198b.getRequestId() + this.f44304a.f44198b.getId() + this.f44304a.f44198b.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f44308e, str);
                if (aVarA != null) {
                    aVarA.v();
                    this.f44317n = true;
                    p0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i13 + " and start download !");
                }
            } catch (Exception e10) {
                p0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
            }
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f44298x = 0;
        this.f44299y = 0;
        this.f44300z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            i = aVarC != null ? (int) aVarC.i() : 5;
            p0.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i);
            return i;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return i;
        }
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f44199c, false).g();
    }

    private String getPlayURL() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.f44198b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f44297w;
            if (aVar != null) {
                String strK = aVar.k();
                if (!z0.a(strK)) {
                    if (new File(strK).exists()) {
                        return strK;
                    }
                }
            }
            return videoUrlEncode;
        } catch (Throwable th2) {
            p0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return videoUrlEncode;
        }
    }

    public AdEvents getAdEvents() {
        return this.B;
    }

    public AdSession getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public MediaEvents getVideoEvents() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.M) {
            this.H = com.mbridge.msdk.video.bt.component.d.c().g(this.f44199c);
        }
        View view = this.f44293s;
        if (view != null) {
            view.setVisibility(this.f44299y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f44291q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f44300z == 0 ? 8 : 0);
        }
        CampaignEx campaignEx = this.f44198b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f44199c);
            com.mbridge.msdk.foundation.feedback.b.b().a(j1.o2.o(new StringBuilder(), this.f44199c, "_1"), this.f44198b);
        }
        TextView textView = this.f44292r;
        if (textView != null) {
            textView.setVisibility(this.f44298x == 0 ? 8 : 0);
            if (this.f44292r.getVisibility() == 0 && com.mbridge.msdk.foundation.feedback.b.b().a()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(j1.o2.o(new StringBuilder(), this.f44199c, "_1"), this.f44294t);
            }
        }
        if (this.A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.A.removeFriendlyObstruction(rootView);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f44290p != null) {
                AdSession adSession = this.A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.f44290p.setOnClickListener(null);
                this.f44290p.release();
                this.f44290p = null;
                if (!TextUtils.isEmpty(this.J)) {
                    e eVar = new e();
                    long jCurrentTimeMillis = Q;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - Q;
                    }
                    eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f44198b, eVar);
                }
            }
            SoundImageView soundImageView = this.f44291q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f44293s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f44296v != null) {
                this.f44296v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th2) {
            p0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.L = zIsPlayIng;
            this.f44290p.setIsBTVideoPlaying(zIsPlayIng);
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                this.f44290p.setVideoEvents(mediaEvents);
            }
            this.f44290p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f44290p.setIsCovered(false);
            if (this.L) {
                this.f44290p.start(true);
            }
            this.f44290p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f44290p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f44296v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f44200d);
                }
            }
        } catch (Exception e10) {
            p0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.M) {
                if (this.G) {
                    this.f44290p.playVideo(0);
                    this.G = false;
                } else {
                    this.f44290p.start(false);
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        p0.a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    p0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f44296v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f44200d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.J = playURL;
            this.f44290p.initVFPData(playURL, this.f44198b.getVideoUrlEncode(), this.D);
            if (this.H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.B != null) {
                    p0.b("omsdk", "bt impressionOccurred");
                    this.B.impressionOccurred();
                }
            } catch (Throwable th3) {
                p0.a(BTBaseView.TAG, th3.getMessage());
            }
            if (!this.f44290p.playVideo() && (dVar = this.D) != null) {
                dVar.onPlayError("play video failed");
            }
            this.M = true;
            return;
        } catch (Exception e10) {
            p0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
        p0.b(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f44290p;
            if (playerView != null && this.f44296v != null) {
                playerView.closeSound();
                this.f44291q.setSoundStatus(false);
                this.E = 1;
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e10) {
                    p0.a("OMSDK", e10.getMessage());
                }
                BTBaseView.a(this.f44296v, "onPlayerMute", this.f44200d);
                return true;
            }
        } catch (Exception e11) {
            p0.b(BTBaseView.TAG, e11.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f44290p;
            if (playerView == null || this.f44296v == null) {
                return false;
            }
            playerView.openSound();
            this.f44291q.setSoundStatus(true);
            this.E = 2;
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e10) {
                p0.a("OMSDK", e10.getMessage());
            }
            BTBaseView.a(this.f44296v, "onUnmute", this.f44200d);
            return true;
        } catch (Exception e11) {
            p0.b(BTBaseView.TAG, e11.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        d();
        this.F = getBufferTimeout();
        String playURL = getPlayURL();
        this.J = playURL;
        if (this.f44204h && !TextUtils.isEmpty(playURL) && this.f44198b != null) {
            AdSession adSession = this.A;
            if (adSession != null) {
                adSession.registerAdView(this.f44290p);
                AdSession adSession2 = this.A;
                SoundImageView soundImageView = this.f44291q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession2.addFriendlyObstruction(soundImageView, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f44292r, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f44293s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            d dVar = new d(this, this.f44296v, this.C);
            this.D = dVar;
            dVar.b(a(this.f44198b), getCDRate());
            this.f44290p.setDesk(false);
            this.f44290p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        P = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f44290p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        p0.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    p0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f44296v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f44200d);
                }
            }
        } catch (Exception e10) {
            p0.b(BTBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.B = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.A = adSession;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f44292r.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_shape_progress", "drawable"));
            this.f44292r.setWidth(u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 30.0f));
            return;
        }
        this.f44292r.setBackgroundResource(h0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.google.android.gms.internal.play_billing.a.a(30.0f));
        int iA = u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 5.0f);
        layoutParams.setMargins(iA, 0, 0, 0);
        this.f44292r.setPadding(iA, 0, iA, 0);
        this.f44292r.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i10) {
        this.f44293s.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i10) {
        this.f44292r.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f44296v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.N.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.N.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.N.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.N.getPaddingBottom();
        }
        p0.b(BTBaseView.TAG, "NOTCH BTVideoView ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
        this.N.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.I = i10;
    }

    public void setPlaybackParams(float f10) {
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            playerView.setPlaybackParams(f10);
        }
    }

    public void setProgressBarState(int i10) {
        ProgressBar progressBar = this.O;
        if (progressBar != null) {
            progressBar.setVisibility(i10 == 0 ? 8 : 0);
            CampaignEx campaignEx = this.f44198b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.O.setVisibility(0);
        }
    }

    public void setShowClose(int i10) {
        this.f44299y = i10;
    }

    public void setShowMute(int i10) {
        this.f44300z = i10;
    }

    public void setShowTime(int i10) {
        this.f44298x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        this.f44291q.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.C = mediaEvents;
        d dVar = this.D;
        if (dVar != null) {
            dVar.f44306c = mediaEvents;
        }
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVolume(float f10, float f11) {
        PlayerView playerView = this.f44290p;
        if (playerView != null) {
            playerView.setVolume(f10, f11);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f44204h) {
            this.E = i10;
            if (i10 == 1) {
                this.f44291q.setSoundStatus(false);
                this.f44290p.closeSound();
            } else if (i10 == 2) {
                this.f44291q.setSoundStatus(true);
                this.f44290p.openSound();
            }
            if (i11 == 1) {
                this.f44291q.setVisibility(8);
            } else if (i11 == 2) {
                this.f44291q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.f44290p.getVolume());
                } catch (Exception e10) {
                    p0.b("omsdk", e10.getMessage());
                }
            }
        }
    }

    private void d() {
        String str;
        if (this.f44198b.getAdType() == 94 || this.f44198b.getAdType() == 287) {
            str = this.f44198b.getRequestId() + this.f44198b.getId() + this.f44198b.getVideoUrlEncode();
        } else {
            str = this.f44198b.getId() + this.f44198b.getVideoUrlEncode() + this.f44198b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f44199c, str);
        if (aVarA != null) {
            this.f44297w = aVarA;
        }
    }

    private boolean e() {
        try {
            this.f44290p = (PlayerView) findViewById(findID(PtLatqAYjEFT.VFPGphVZn));
            this.f44291q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f44292r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f44293s = findViewById(findID("mbridge_rl_playing_close"));
            this.N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f44290p.setIsBTVideo(true);
            this.f44294t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f44295u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f44290p, this.f44291q, this.f44292r, this.f44293s);
        } catch (Throwable th2) {
            p0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (h0.a(iFindLayout)) {
            this.f44202f.inflate(iFindLayout, this);
            boolean zE = e();
            this.f44204h = zE;
            if (!zE) {
                p0.b(BTBaseView.TAG, QFzuMMDfrzagDN.KSNZvehSdKAeRP);
            }
            b();
        }
        P = false;
    }

    public void stop() {
        try {
            PlayerView playerView = this.f44290p;
            if (playerView != null) {
                playerView.pause();
                this.f44290p.stop();
                this.G = true;
                WebView webView = this.f44296v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f44200d);
                }
            }
        } catch (Exception e10) {
            p0.b(PcrIk.ChHjuOvaJOAAo, e10.getMessage(), e10);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        super.b();
        if (this.f44204h) {
            this.f44291q.setOnClickListener(new a());
            this.f44293s.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f44199c, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f44199c, false).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            try {
                return u0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return o2.j(i11, "");
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44298x = 0;
        this.f44299y = 0;
        this.f44300z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }
}
