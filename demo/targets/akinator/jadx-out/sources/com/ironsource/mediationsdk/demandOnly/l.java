package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3134b1;
import com.ironsource.C3147be;
import com.ironsource.C3171d2;
import com.ironsource.C3225g2;
import com.ironsource.C3317l5;
import com.ironsource.C3325ld;
import com.ironsource.C3352n2;
import com.ironsource.C3407q5;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC3135b2;
import com.ironsource.Mb;
import com.ironsource.P8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC3135b2 {

    /* renamed from: n, reason: collision with root package name */
    private C3317l5 f37461n;

    /* renamed from: o, reason: collision with root package name */
    private C3317l5 f37462o;

    /* renamed from: p, reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f37463p;

    /* renamed from: q, reason: collision with root package name */
    private C3171d2 f37464q;

    /* renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f37465r;

    /* renamed from: s, reason: collision with root package name */
    private p f37466s;

    /* renamed from: t, reason: collision with root package name */
    private final P8 f37467t;

    /* renamed from: u, reason: collision with root package name */
    private final P8.a f37468u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    public l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C3134b1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f37466s = new p.b();
        this.f37467t = Mb.U().s();
        this.f37468u = Mb.O().h();
        this.f37463p = iSDemandOnlyRewardedVideoListener;
        this.f37475f = j10;
        this.f37465r = eVar;
        this.f37470a.initRewardedVideoForDemandOnly(str, str2, this.f37472c, this);
    }

    private void c(o oVar) {
        this.f37461n = new C3317l5();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.f37457k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C3407q5());
            C3352n2 c3352n2A = new a.C0236a(aVar.h()).a(h());
            if (c3352n2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(D5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c3352n2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(D5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f37464q.a(c3352n2A.b());
            this.f37462o = new C3317l5();
            this.f37470a.loadRewardedVideoForBidding(this.f37472c, null, strK, this);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.i r() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f37482m);
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f37467t.a(this.f37482m));
        C3225g2 c3225g2 = new C3225g2(h(), false);
        c3225g2.a(this.f37466s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f37470a.getRewardedVideoBiddingData(this.f37472c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c3225g2.b(rewardedVideoBiddingData);
        }
        iVar.a(c3225g2);
        return iVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.f37462o = new C3317l5();
        this.f37470a.loadRewardedVideo(this.f37472c, null, this);
    }

    private void u() {
        if (!this.f37465r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(D5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.i iVarR = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarR.r());
        a(D5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarR.r()}});
        this.f37465r.a(ContextProvider.getInstance().getApplicationContext(), iVarR, this);
    }

    private void v() {
        this.f37476g = null;
        this.f37477h = null;
        this.f37479j = null;
        this.f37464q = new C3171d2();
    }

    private void w() {
        this.f37461n = new C3317l5();
        a(s());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(D5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(m.a.LOADED)) {
            a(D5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f37470a.isRewardedVideoAvailable(this.f37472c);
            a(zIsRewardedVideoAvailable ? D5.RV_INSTANCE_READY_TRUE : D5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return zIsRewardedVideoAvailable;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsRewardedVideoAvailable;
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(D5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(D5.f34093q0, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f37470a.showRewardedVideo(this.f37472c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.f37463p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f37467t.a(this.f37482m))}});
        this.f37468u.b(this.f37482m);
        this.f37463p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.f37464q.a(), IronSourceUtils.a());
        this.f37463p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() throws JSONException {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> mapJ = j();
        if (!TextUtils.isEmpty(r.m().l())) {
            mapJ.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapJ.put(a.b.k("custom_", str), r.m().r().get(str));
            }
        }
        C3325ld c3325ldA = r.m().h().c().f().a();
        if (c3325ldA != null) {
            mapJ.put("placement", c3325ldA.c());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_NAME, c3325ldA.f());
            mapJ.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(c3325ldA.e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C5 c52 = new C5(D5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(mapJ));
        c52.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c52.d(), h()));
        C3147be.i().a(c52);
        this.f37463p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(D5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f37463p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(D5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37462o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(D5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37462o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37461n))}});
            a(this.f37464q.c(), IronSourceUtils.a());
            this.f37463p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C3317l5.a(this.f37461n));
            a(this.f37464q.b(), IronSourceUtils.a());
            this.f37463p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(D5 d52, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
            }
        }
        C3147be.i().a(new C5(d52, new JSONObject(mapJ)));
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(D5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            if (aVarA == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.f37463p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, str));
            return;
        }
        v();
        a(D5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f37479j, str);
    }

    @Override // com.ironsource.InterfaceC3135b2
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        String strK;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f37476g = aVar.a();
        this.f37477h = aVar.f();
        this.f37466s = aVar.a(l());
        a.C0236a c0236a = new a.C0236a(aVar.h());
        if (!c0236a.isEmpty()) {
            C3352n2 c3352n2 = c0236a.get(0);
            this.f37464q.a(c3352n2.b());
            this.f37464q.c(c3352n2.h());
            this.f37464q.b(c3352n2.g());
            strK = c3352n2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(D5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(D5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0236a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0236a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(D5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f37470a.loadRewardedVideoForBidding(this.f37472c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f37476g = null;
        this.f37477h = null;
        a(D5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.f37456j, "No available ad to load"));
        }
    }
}
