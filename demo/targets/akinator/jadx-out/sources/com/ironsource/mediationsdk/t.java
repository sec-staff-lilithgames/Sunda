package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.ironsource.B3;
import com.ironsource.C3134b1;
import com.ironsource.C3147be;
import com.ironsource.C3286ja;
import com.ironsource.C3325ld;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC3513wa;
import com.ironsource.Mb;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class t extends A implements RewardedVideoSmashListener, B3 {

    /* renamed from: h, reason: collision with root package name */
    private b f37725h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3513wa f37726i;

    /* renamed from: j, reason: collision with root package name */
    private Timer f37727j;

    /* renamed from: k, reason: collision with root package name */
    private int f37728k;

    /* renamed from: l, reason: collision with root package name */
    private String f37729l;

    /* renamed from: m, reason: collision with root package name */
    private String f37730m;

    /* renamed from: n, reason: collision with root package name */
    private C3325ld f37731n;

    /* renamed from: o, reason: collision with root package name */
    private long f37732o;

    /* renamed from: p, reason: collision with root package name */
    private String f37733p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f37734q;

    /* renamed from: r, reason: collision with root package name */
    private int f37735r;

    /* renamed from: s, reason: collision with root package name */
    private String f37736s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f37737t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f37738u;

    /* renamed from: v, reason: collision with root package name */
    private long f37739v;

    /* renamed from: w, reason: collision with root package name */
    private final P8.a f37740w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10;
            boolean z10;
            t tVar = t.this;
            b bVar = tVar.f37725h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || bVar == b.INIT_IN_PROGRESS) {
                if (bVar == bVar2) {
                    i10 = 1025;
                } else {
                    i10 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                tVar.a(b.NOT_LOADED);
                z10 = true;
            } else {
                z10 = false;
                i10 = 510;
            }
            t.this.a(str);
            if (!z10) {
                t.this.a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.this.f37725h.name()}});
                return;
            }
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t.this.v())}});
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t.this.v())}});
            t tVar2 = t.this;
            tVar2.f37726i.d(tVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public t(String str, String str2, NetworkSettings networkSettings, InterfaceC3513wa interfaceC3513wa, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new C3134b1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f37737t = new Object();
        this.f37738u = new Object();
        this.f37740w = Mb.O().h();
        this.f37729l = str;
        this.f37730m = str2;
        this.f37726i = interfaceC3513wa;
        this.f37727j = null;
        this.f37728k = i10;
        this.f37243f = i11;
        this.f37725h = b.NO_INIT;
        this.f37739v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f37238a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            a("setCustomParams() " + th2.getMessage());
        }
    }

    private void D() {
        synchronized (this.f37738u) {
            Timer timer = new Timer();
            this.f37727j = timer;
            timer.schedule(new a(), this.f37728k * 1000);
        }
    }

    private void E() {
        synchronized (this.f37738u) {
            try {
                Timer timer = this.f37727j;
                if (timer != null) {
                    timer.cancel();
                    this.f37727j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(D5 d52) {
        return d52 == D5.RV_BUSINESS_INSTANCE_LOAD || d52 == D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || d52 == D5.RV_INSTANCE_LOAD_FAILED || d52 == D5.RV_INSTANCE_LOAD_FAILED_REASON || d52 == D5.RV_INSTANCE_LOAD_NO_FILL || d52 == D5.RV_BUSINESS_INSTANCE_OPENED || d52 == D5.RV_INSTANCE_CLOSED || d52 == D5.f34093q0 || d52 == D5.RV_INSTANCE_SHOW_FAILED || d52 == D5.RV_BUSINESS_INSTANCE_CLICKED || d52 == D5.RV_BUSINESS_INSTANCE_REWARDED;
    }

    public boolean A() {
        if (this.f37725h != b.LOADED) {
            return false;
        }
        try {
            return this.f37238a.isRewardedVideoAvailable(this.f37241d);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b("isReadyToShow exception: " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th2.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(D5.RV_CAP_SESSION);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x00fe
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.t.a(java.lang.String, org.json.JSONObject):void");
    }

    public void b(boolean z10) {
        b(D5.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z10 ? "true" : "false"}});
    }

    @Override // com.ironsource.B3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(D5.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f37238a.collectRewardedVideoBiddingData(this.f37241d, adData != null ? C3286ja.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b("collectBiddingData exception: " + th2.getLocalizedMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.A
    public int l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f37726i.b(this, this.f37731n);
        b(D5.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f37737t) {
            try {
                if (this.f37725h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f37739v = e2.c();
                    this.f37726i.c(this);
                } else {
                    b(D5.RV_INSTANCE_CLOSED);
                    a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f37725h}});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f37726i.e(this);
        b(D5.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f37726i.f(this);
        b(D5.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f37726i.a(this, this.f37731n);
        Map<String, Object> mapM = m();
        C3325ld c3325ld = this.f37731n;
        if (c3325ld != null) {
            mapM.put("placement", c3325ld.c());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f37731n.f());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f37731n.e()));
        }
        if (!TextUtils.isEmpty(r.m().l())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapM.put(a.b.k("custom_", str), r.m().r().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f37733p)) {
            mapM.put("auctionId", this.f37733p);
        }
        JSONObject jSONObject = this.f37734q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f37734q);
        }
        D5 d52 = D5.RV_BUSINESS_INSTANCE_REWARDED;
        if (c(d52)) {
            C3147be.i().a(mapM, this.f37735r, this.f37736s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f37243f));
        C5 c52 = new C5(d52, new JSONObject(mapM));
        c52.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c52.d(), c()));
        long j10 = this.f37739v;
        if (j10 != 0) {
            long j11 = time - j10;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            c52.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        C3147be.i().a(c52);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(D5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f37737t) {
            try {
                if (this.f37725h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f37726i.a(ironSourceError, this);
                    return;
                }
                a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f37725h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f37726i.b(this);
        b(D5.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(D5.RV_INSTANCE_VISIBLE);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f37725h.name());
        synchronized (this.f37737t) {
            try {
                if (this.f37725h == b.LOAD_IN_PROGRESS) {
                    a(z10 ? b.LOADED : b.NOT_LOADED);
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            if (z10) {
                a(D5.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f37725h.name()}});
                return;
            } else {
                a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f37725h.name()}});
                return;
            }
        }
        E();
        a(z10 ? D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        if (z10) {
            this.f37726i.a(this);
        } else {
            this.f37726i.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        synchronized (this.f37737t) {
            try {
                if (this.f37725h == b.INIT_IN_PROGRESS) {
                    a(b.NO_INIT);
                    this.f37726i.d(this);
                    return;
                }
                a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f37725h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f37737t) {
            try {
                if (this.f37725h == b.INIT_IN_PROGRESS) {
                    a(b.NOT_LOADED);
                    return;
                }
                a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f37725h}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(D5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f37244g = Long.valueOf(System.currentTimeMillis());
        }
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public C3325ld x() {
        return this.f37731n;
    }

    public boolean y() {
        return this.f37725h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f37725h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f37238a.initRewardedVideoWithCallback(this.f37729l, this.f37730m, this.f37241d, this);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b(QGjYBESwAiCc.rPF + th2.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return e2.c() - this.f37732o;
    }

    public String u() {
        return this.f37733p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f37238a.getLoadWhileShowSupportState(this.f37241d);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th2.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    private void b(D5 d52) {
        b(d52, null);
    }

    public void b(D5 d52, Object[][] objArr) {
        a(d52, objArr, true);
    }

    public t(t tVar, InterfaceC3513wa interfaceC3513wa, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(tVar.f37729l, tVar.f37730m, tVar.f37239b.h(), interfaceC3513wa, tVar.f37728k, abstractAdapter, i10);
        this.f37733p = str;
        this.f37734q = jSONObject;
        this.f37735r = i11;
        this.f37736s = str2;
    }

    public void a(C3325ld c3325ld) {
        E();
        a("showVideo()");
        this.f37731n = c3325ld;
        a(b.SHOW_IN_PROGRESS);
        b(D5.f34093q0);
        try {
            this.f37238a.showRewardedVideo(this.f37241d, this);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b("showVideo exception: " + th2.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f37725h + ", new state=" + bVar);
        synchronized (this.f37737t) {
            this.f37725h = bVar;
        }
    }

    public void a(D5 d52) {
        a(d52, null, false);
    }

    public void a(D5 d52, Object[][] objArr) {
        a(d52, objArr, false);
    }

    private void a(D5 d52, Object[][] objArr, boolean z10) {
        C3325ld c3325ld;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.f37733p)) {
            mapM.put("auctionId", this.f37733p);
        }
        JSONObject jSONObject = this.f37734q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f37734q);
        }
        if (z10 && (c3325ld = this.f37731n) != null && !TextUtils.isEmpty(c3325ld.c())) {
            mapM.put("placement", this.f37731n.c());
        }
        if (c(d52)) {
            C3147be.i().a(mapM, this.f37735r, this.f37736s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f37243f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3147be.i().a(new C5(d52, new JSONObject(mapM)));
        if (d52 == D5.RV_INSTANCE_CLOSED) {
            this.f37740w.b(IronSource.a.REWARDED_VIDEO);
        }
    }
}
