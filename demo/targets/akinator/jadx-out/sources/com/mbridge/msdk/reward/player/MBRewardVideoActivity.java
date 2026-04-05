package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.a;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBridgeBTContainer A;
    private WindVaneWebView B;
    private com.mbridge.msdk.video.bt.module.listener.a C;
    private String D;
    private String E;
    private boolean F;
    private String N;
    private com.mbridge.msdk.foundation.same.report.metrics.c O;
    private boolean Q;

    /* renamed from: f, reason: collision with root package name */
    private String f42546f;

    /* renamed from: g, reason: collision with root package name */
    private String f42547g;

    /* renamed from: h, reason: collision with root package name */
    private String f42548h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f42549i;

    /* renamed from: m, reason: collision with root package name */
    private int f42553m;

    /* renamed from: n, reason: collision with root package name */
    private int f42554n;

    /* renamed from: o, reason: collision with root package name */
    private int f42555o;

    /* renamed from: r, reason: collision with root package name */
    private h f42558r;

    /* renamed from: s, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f42559s;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f42562v;

    /* renamed from: w, reason: collision with root package name */
    private CampaignEx f42563w;

    /* renamed from: x, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f42564x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f42565y;

    /* renamed from: z, reason: collision with root package name */
    private MBTempContainer f42566z;

    /* renamed from: j, reason: collision with root package name */
    private int f42550j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42551k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42552l = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42556p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f42557q = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f42560t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f42561u = false;
    private int G = 1;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private boolean P = false;
    private AdSession R = null;
    private MediaEvents S = null;
    private AdEvents T = null;
    private long U = 0;
    private String V = "";
    private Boolean W = null;
    private int X = 0;
    private boolean Y = false;
    private boolean Z = false;

    /* renamed from: a0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f42544a0 = new a();

    /* renamed from: b0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f42545b0 = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.video.dynview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f42550j = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(C3191e4.h.L)) {
                int iIntValue = ((Integer) map.get(C3191e4.h.L)).intValue();
                if (MBRewardVideoActivity.this.f42565y == null || MBRewardVideoActivity.this.f42565y.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f42563w = (CampaignEx) mBRewardVideoActivity.f42565y.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f42565y.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f42565y.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f42563w.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f42563w.getVideoCompleteTime(), MBRewardVideoActivity.this.G));
                MBRewardVideoActivity.this.f42563w.setShowIndex(MBRewardVideoActivity.this.G);
                MBRewardVideoActivity.this.f42563w.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f42563w);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f42571a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42572b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42573c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f42571a = list;
            this.f42572b = str;
            this.f42573c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f42571a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f42571a) {
                    if (aVar != null && aVar.c() != null) {
                        CampaignEx campaignExC = aVar.c();
                        try {
                            AppletModelManager.getInstance().remove(campaignExC);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                p0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f42572b, campaignExC.getRequestId() + campaignExC.getId() + campaignExC.getVideoUrlEncode());
                        if (campaignExC.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExC.getRewardTemplateMode().e())) {
                                com.mbridge.msdk.videocommon.a.e(this.f42572b + "_" + campaignExC.getId() + "_" + this.f42573c + "_" + campaignExC.getRewardTemplateMode().e());
                                com.mbridge.msdk.videocommon.a.b(campaignExC.getAdType(), campaignExC);
                            }
                            if (!TextUtils.isEmpty(campaignExC.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f42572b + "_" + this.f42573c + "_" + campaignExC.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f42572b, campaignExC);
                        }
                    }
                }
            } catch (Exception e11) {
                p0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f42574a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42575b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f42574a = list;
            this.f42575b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f42574a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f42574a) {
                    if (aVar != null && aVar.c() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.c(), this.f42575b);
                    }
                }
            } catch (Throwable th2) {
                p0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    public static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.G;
        mBRewardVideoActivity.G = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f42563w;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42566z.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f42563w.getRewardTemplateMode().b() == 0) {
                if (i10 == 2) {
                    iF = (int) (u0.f(this) * 0.6f);
                    iG2 = u0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (u0.f(this) * 0.6f);
                    iG = u0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f42563w.getRewardTemplateMode().b() == 2) {
                iF = (int) (u0.f(this) * 0.6f);
                iG2 = u0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (u0.f(this) * 0.6f);
                iG = u0.g(this);
                f10 = iG * 0.7f;
            }
            int i11 = (int) f10;
            layoutParams.height = iF;
            layoutParams.width = i11;
            this.f42566z.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            p0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    public int findID(String str) {
        return h0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return h0.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        this.Y = true;
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f42566z = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f42546f);
        if (this.R != null) {
            p0.b("omsdk", "mbrewardvideoac finish");
            this.R.removeAllFriendlyObstructions();
            this.R.finish();
            this.R = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.Z = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f42566z != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f42566z.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        this.U = SystemClock.elapsedRealtime();
        this.V = TextUtils.isEmpty(this.V) ? "onCreate" : o2.o(new StringBuilder(), this.V, "_onCreate");
        try {
            Intent intent = getIntent();
            this.f42546f = intent.getStringExtra(INTENT_UNITID);
            this.f42547g = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f42549i = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(INTENT_REWARD));
            this.f42548h = intent.getStringExtra(INTENT_USERID);
            this.f42550j = intent.getIntExtra(INTENT_MUTE, 2);
            this.f42551k = intent.getBooleanExtra(INTENT_ISIV, false);
            com.mbridge.msdk.foundation.controller.c.m().b(this.f42551k ? 287 : 94);
            this.f42552l = intent.getBooleanExtra(INTENT_ISBID, false);
            this.E = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.P = booleanExtra;
            if (booleanExtra) {
                this.f42558r = MBridgeGlobalCommon.showRewardListenerMap.get(this.f42546f);
            } else {
                this.f42558r = com.mbridge.msdk.reward.controller.a.f42450f0.get(this.f42546f);
            }
            if (this.f42551k) {
                this.f42553m = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f42554n = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f42555o = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.f42556p = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.f42564x = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f42546f);
            this.f42565y = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f42546f);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!h0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f42546f)) {
                b("data empty error");
                return;
            }
            IJSFactory bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f42558r;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.X = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f42547g, this.f42546f);
            this.f42559s = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42546f);
                this.f42559s = cVarC;
                if (cVarC == null) {
                    this.f42559s = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42546f, this.f42551k);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f42559s;
            if (cVar2 != null) {
                this.f42549i.a(cVar2.d());
                this.f42549i.b(this.f42559s.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f42549i;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f42549i.a(1);
            }
            int iA = h0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = h0.a(this, "mbridge_reward_activity_stay", "anim");
            if (h0.a(iA) && h0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f42561u = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            p0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f42556p);
            if (!this.f42556p) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f42564x;
                if (list2 != null && list2.size() > 0) {
                    this.f42562v = this.f42564x.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f42562v;
                if (aVar != null) {
                    this.f42563w = aVar.c();
                    this.f42562v.b(true);
                    this.f42562v.d(false);
                    CampaignEx campaignEx = this.f42563w;
                    if (campaignEx != null) {
                        this.N = campaignEx.getCurrentLocalRid();
                        this.f42563w.setShowIndex(1);
                        this.f42563w.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f42446b0 = this.f42563w.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42563w.getMaitve(), this.f42563w.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f42563w;
                if (campaignEx2 != null && !g.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f42562v != null && this.f42563w != null && this.f42549i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f42563w);
                    a(arrayList);
                    b(this.f42563w);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f42565y);
            this.D = "";
            List<CampaignEx> list3 = this.f42565y;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f42565y.get(0);
                if (!g.a(this.f42565y, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.D = campaignEx3.getRequestId();
                this.N = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f42446b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f42546f + "_" + this.D + "_" + cMPTEntryUrl);
            this.B = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f42562v == null && (list = this.f42564x) != null && list.size() > 0) {
                    this.f42562v = this.f42564x.get(0);
                }
                if (this.f42562v == null) {
                    this.f42562v = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f42551k ? 287 : 94, this.f42546f, this.f42552l);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f42562v;
                if (aVar2 != null) {
                    this.f42563w = aVar2.c();
                    this.f42562v.b(true);
                    this.f42562v.d(false);
                }
                if (this.f42562v != null && this.f42563w != null && this.f42549i != null) {
                    this.f42556p = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f42565y);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f42563w = campaignEx4;
                        if (campaignEx4 != null) {
                            this.N = campaignEx4.getCurrentLocalRid();
                            this.f42563w.setCampaignIsFiltered(true);
                        }
                        c(this.f42563w);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f42565y.get(0));
            WindVaneWebView windVaneWebView = this.B;
            if (windVaneWebView != null) {
                a1.a(windVaneWebView, this.f42565y.get(0).getLocalRequestId(), this.f42565y.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.B.getObject();
                    kVar.setAdEvents(this.T);
                    kVar.setAdSession(this.R);
                    kVar.setVideoEvents(this.S);
                    this.B.setObject(kVar);
                } catch (Exception e11) {
                    p0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th2) {
            a(this.f42565y);
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        this.V = TextUtils.isEmpty(this.V) ? "onDestroy" : o2.o(new StringBuilder(), this.V, "_onDestroy");
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.V) ? "unKnown" : this.V);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.U));
        Boolean bool = this.W;
        eVar.a("is_unexpected_destroy", Integer.valueOf(bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        eVar.a("is_listener_null", Integer.valueOf(this.f42558r == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Y ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.Z ? 1 : 2));
        h hVar = this.f42558r;
        eVar.a("is_listener_change", Integer.valueOf(hVar != null ? hVar.hashCode() == this.X ? 1 : 2 : 0));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f42563w, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f42546f);
        h();
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f42566z = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        this.f42544a0 = null;
        this.f42545b0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f42546f + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f42546f + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f42564x, this.f42546f, this.D));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.V = TextUtils.isEmpty(this.V) ? C3191e4.h.f36510t0 : o2.o(new StringBuilder(), this.V, "_onPause");
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.V = TextUtils.isEmpty(this.V) ? "onRestart" : o2.o(new StringBuilder(), this.V, "_onRestart");
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        this.V = TextUtils.isEmpty(this.V) ? C3191e4.h.f36512u0 : o2.o(new StringBuilder(), this.V, "_onResume");
        if (com.mbridge.msdk.foundation.feedback.b.f40664f) {
            MBTempContainer mBTempContainer = this.f42566z;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f42546f, this.f42564x));
        } catch (Throwable th2) {
            p0.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.f42566z;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f42561u);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.V = TextUtils.isEmpty(this.V) ? "onStart" : o2.o(new StringBuilder(), this.V, "_onStart");
        if (com.mbridge.msdk.foundation.feedback.b.f40664f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f42563w.setCampaignUnitId(this.f42546f);
            com.mbridge.msdk.foundation.feedback.b.b().a(o2.o(new StringBuilder(), this.f42546f, "_1"), this.f42563w);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f42565y;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f42565y.get(0);
                campaignEx.setCampaignUnitId(this.f42546f);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f42546f + "_1", campaignEx);
            }
        }
        if (this.F) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f42546f + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f42546f + "_2");
        this.F = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        this.V = TextUtils.isEmpty(this.V) ? "onStop" : o2.o(new StringBuilder(), this.V, "_onStop");
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(h0.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.I = i11;
        this.K = i12;
        this.J = i13;
        this.L = i14;
        this.M = i10;
        MBTempContainer mBTempContainer = this.f42566z;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
            i19 = i14;
            i18 = i13;
            i17 = i12;
            i16 = i11;
            i15 = i10;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = i12;
            i18 = i13;
            i19 = i14;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i15, i16, i17, i18, i19);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i15, i16, i17, i18, i19);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.video.bt.module.listener.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(MBRewardVideoActivity.this.O);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(MBRewardVideoActivity.this.O, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(MBRewardVideoActivity.this.O, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f42558r != null) {
                MBRewardVideoActivity.this.f42558r.a(i10, str, str2);
            }
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.H - i10;
        mBRewardVideoActivity.H = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExC;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f42564x;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f42564x) {
                    if (aVar != null && (campaignExC = aVar.c()) != null && TextUtils.equals(campaignExC.getId(), campaignEx.getId()) && TextUtils.equals(campaignExC.getRequestId(), campaignEx.getRequestId())) {
                        this.f42562v = aVar;
                    }
                }
            }
            this.f42556p = true;
            j();
            MBTempContainer mBTempContainer = this.f42566z;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.M, this.I, this.K, this.J, this.L);
            }
        } catch (Exception e10) {
            p0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f42559s, this.f42546f);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f42546f, this.f42551k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
                u0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.R;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.f42558r;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.W = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.W = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th2) {
            p0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void g() {
        try {
            Boolean bool = this.W;
            if (bool != null && !bool.booleanValue()) {
                return;
            }
            h hVar = this.f42558r;
            if (hVar != null) {
                hVar.a(this.O, "show fail : unexpected destroy");
            }
        } catch (Throwable th2) {
            p0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f42565y;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f42565y.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f42563w;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th2) {
            p0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.C == null) {
            this.C = new c();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!h0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.f42566z = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f42565y;
        if (list3 == null || list3.size() <= 0 || !this.f42565y.get(0).isDynamicView()) {
            this.f42566z.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.f42566z, 500L);
        }
        changeHalfScreenPadding(-1);
        this.f42566z.setActivity(this);
        this.f42566z.setBidCampaign(this.f42552l);
        this.f42566z.setBigOffer(this.f42556p);
        this.f42566z.setUnitId(this.f42546f);
        this.f42566z.setCampaign(this.f42563w);
        if (this.f42563w.getDynamicTempCode() == 5 && (list2 = this.f42565y) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.f42566z.removeAllViews();
            this.f42566z.setCampOrderViewData(this.f42565y, this.H);
            this.f42566z.setCamPlayOrderCallback(this.f42544a0, this.G);
        }
        this.f42566z.setCampaignDownLoadTask(this.f42562v);
        this.f42566z.setIV(this.f42551k);
        CampaignEx campaignEx2 = this.f42563w;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.f42566z.setIVRewardEnable(this.f42553m, this.f42554n, this.f42555o);
        } else {
            this.f42566z.setIVRewardEnable(0, 0, 0);
        }
        this.f42566z.setMute(this.f42550j);
        CampaignEx campaignEx3 = this.f42563w;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f42565y) != null && list.size() > 0 && this.f42565y.get(0) != null && (rewardPlus = this.f42565y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f42549i = cVar;
        }
        this.f42566z.setReward(this.f42549i);
        this.f42566z.setRewardUnitSetting(this.f42559s);
        this.f42566z.setPlacementId(this.f42547g);
        this.f42566z.setUserId(this.f42548h);
        this.f42566z.setShowRewardListener(this.f42558r);
        this.f42566z.setDeveloperExtraData(this.E);
        this.f42566z.init(this);
        this.f42566z.setAdSession(this.R);
        this.f42566z.setAdEvents(this.T);
        this.f42566z.setVideoEvents(this.S);
        this.f42566z.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f42563w) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!h0.a(iFindID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.A = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.A.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.C = aVarI;
        this.A.setBTContainerCallback(aVarI);
        this.A.setShowRewardVideoListener(this.f42558r);
        this.A.setChoiceOneCallback(this.f42545b0);
        this.A.setCampaigns(this.f42565y);
        this.A.setCampaignDownLoadTasks(this.f42564x);
        this.A.setRewardUnitSetting(this.f42559s);
        this.A.setUnitId(this.f42546f);
        this.A.setPlacementId(this.f42547g);
        this.A.setUserId(this.f42548h);
        this.A.setActivity(this);
        CampaignEx campaignEx = this.f42563w;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f42565y.get(0) != null && (rewardPlus = this.f42565y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f42549i = cVar;
        }
        this.A.setReward(this.f42549i);
        this.A.setIVRewardEnable(this.f42553m, this.f42554n, this.f42555o);
        this.A.setIV(this.f42551k);
        this.A.setMute(this.f42550j);
        this.A.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.A.setDeveloperExtraData(this.E);
        this.A.init(this);
        this.A.setAdSession(this.R);
        this.A.setVideoEvents(this.S);
        this.A.setAdEvents(this.T);
        this.A.onCreate(this.P);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f42565y) == null || list.size() <= 0 || this.f42565y.get(0) == null) {
            return;
        }
        d(this.f42565y.get(0));
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.R == null) {
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f42546f, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.R = adSessionA;
                    if (adSessionA != null) {
                        this.T = AdEvents.createAdEvents(adSessionA);
                        this.S = MediaEvents.createMediaEvents(this.R);
                    }
                }
            } catch (Throwable th2) {
                p0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.video.dynview.listener.d {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f42563w = campaignEx;
            MBRewardVideoActivity.this.f42563w.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f42563w);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() throws JSONException {
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f42556p = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.f42566z != null) {
                MBRewardVideoActivity.this.f42566z.setNotchPadding(MBRewardVideoActivity.this.M, MBRewardVideoActivity.this.I, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L);
            }
        }
    }

    private WindVaneWebView a(String str) {
        a.C0355a c0355aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0355aB != null) {
            return c0355aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f42565y;
        if (list != null && list.size() != 0) {
            int videoLength = 0;
            int videoCompleteTime = 0;
            for (int i12 = 0; i12 < this.f42565y.size(); i12++) {
                if (this.f42565y.get(0) != null) {
                    if (i12 == 0) {
                        videoCompleteTime = this.f42565y.get(0).getVideoCompleteTime();
                    }
                    videoLength += this.f42565y.get(i12).getVideoLength();
                }
            }
            if (i11 == 1) {
                if (i10 == 0) {
                    if (videoLength >= 45) {
                        return 45;
                    }
                } else if (videoLength > i10) {
                    if (i10 > 45) {
                        return 45;
                    }
                }
                return videoLength;
            }
            int videoLength2 = 0;
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                if (this.f42565y.get(i13) != null) {
                    videoLength2 += this.f42565y.get(i13).getVideoLength();
                }
            }
            if (videoCompleteTime > videoLength2) {
                return videoCompleteTime - videoLength2;
            }
            return 0;
        }
        return i10;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int iA = a(campaignEx.getVideoCompleteTime(), this.G);
            this.f42563w = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.G = 1;
            this.f42563w.setVideoCompleteTime(iA);
            this.f42563w.setShowIndex(this.G);
            this.f42563w.setShowType(1);
            c(this.f42563w);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.N = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.H = campaignEx.getVideoLength() + this.H;
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(campaignEx.getIconUrl());
        }
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.Q) {
            return;
        }
        List<CampaignEx> list2 = list;
        if (list == null) {
            try {
                if (this.f42556p) {
                    list2 = this.f42565y;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<com.mbridge.msdk.videocommon.download.a> list3 = this.f42564x;
                    list2 = arrayList;
                    if (list3 != null) {
                        list2 = arrayList;
                        if (list3.get(0) != null) {
                            list2 = arrayList;
                            if (this.f42564x.get(0).c() != null) {
                                arrayList.add(this.f42564x.get(0).c());
                                list2 = arrayList;
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list2 != null && !list2.isEmpty() && (campaignEx = list2.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.O = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
        }
        if (this.O == null) {
            this.O = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42546f);
            eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f42552l ? 1 : 0));
            eVar.a("adtp", Integer.valueOf(this.f42551k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar.a("lrid", this.N);
            eVar.a("his_reason", "show campaign is null");
            this.O.a("2000129", eVar);
        }
        if (list2 != null) {
            this.O.b(list2);
        }
        this.Q = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        p0.b("MBRewardVideoActivity", str);
        a(this.f42565y);
        h hVar = this.f42558r;
        if (hVar != null) {
            hVar.a(this.O, str);
        }
        finish();
    }
}
