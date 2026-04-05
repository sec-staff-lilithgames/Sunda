package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3134b1;
import com.ironsource.C3171d2;
import com.ironsource.C3225g2;
import com.ironsource.C3317l5;
import com.ironsource.C3352n2;
import com.ironsource.C3407q5;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.H9;
import com.ironsource.InterfaceC3135b2;
import com.ironsource.Mb;
import com.ironsource.P8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g extends m implements n.a, InterstitialSmashListener, InterfaceC3135b2 {

    /* renamed from: n, reason: collision with root package name */
    private C3317l5 f37423n;

    /* renamed from: o, reason: collision with root package name */
    private C3317l5 f37424o;

    /* renamed from: p, reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f37425p;

    /* renamed from: q, reason: collision with root package name */
    private C3171d2 f37426q;

    /* renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f37427r;

    /* renamed from: s, reason: collision with root package name */
    private p f37428s;

    /* renamed from: t, reason: collision with root package name */
    private final P8 f37429t;

    /* renamed from: u, reason: collision with root package name */
    private final P8.a f37430u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C3134b1(networkSettings, networkSettings.getInterstitialSettings(), IronSource.a.f37252c), abstractAdapter);
        this.f37428s = new p.b();
        this.f37429t = Mb.U().s();
        this.f37430u = Mb.O().h();
        this.f37425p = iSDemandOnlyInterstitialListener;
        this.f37475f = j10;
        this.f37427r = eVar;
        this.f37470a.initInterstitial(str, str2, this.f37472c, this);
    }

    private void c(o oVar) {
        this.f37423n = new C3317l5();
        a(new a());
        if (!n()) {
            a(new IronSourceError(e.a.f37419k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C3407q5());
            C3352n2 c3352n2A = new a.C0236a(aVar.h()).a(h());
            if (c3352n2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(D5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            String strK = c3352n2A.k();
            if (strK == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(e.a.f37417i, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(D5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.f37426q.a(c3352n2A.b());
            this.f37424o = new C3317l5();
            this.f37470a.loadInterstitialForBidding(this.f37472c, null, strK, this);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e10.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.i q() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f37482m);
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f37429t.a(this.f37482m));
        C3225g2 c3225g2 = new C3225g2(h(), false);
        c3225g2.a(this.f37428s.value());
        Map<String, Object> interstitialBiddingData = this.f37470a.getInterstitialBiddingData(this.f37472c, new JSONObject());
        if (interstitialBiddingData != null) {
            c3225g2.b(interstitialBiddingData);
        }
        iVar.a(c3225g2);
        return iVar;
    }

    private void r() {
        this.f37424o = new C3317l5();
        this.f37470a.loadInterstitial(this.f37472c, null, this);
    }

    private void s() {
        if (!this.f37427r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(D5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.i iVarQ = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + iVarQ.r());
        a(D5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, iVarQ.r()}});
        this.f37427r.a(ContextProvider.getInstance().getApplicationContext(), iVarQ, this);
    }

    private void t() {
        this.f37476g = null;
        this.f37477h = null;
        this.f37479j = null;
        this.f37426q = new C3171d2();
    }

    private void u() {
        this.f37423n = new C3317l5();
        a(new b());
        if (n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(D5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(D5.IS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(new m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.f37425p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(D5.IS_INSTANCE_LOAD, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(D5.IS_INSTANCE_SHOW, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f37470a.showInterstitial(this.f37472c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.IS_INSTANCE_CLICKED, new Object[0][]);
        this.f37425p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f37429t.a(this.f37482m))}});
        this.f37430u.b(this.f37482m);
        this.f37425p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(D5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37424o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.IS_INSTANCE_OPENED, new Object[0][]);
        a(this.f37426q.a(), IronSourceUtils.a());
        this.f37425p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(D5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37424o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(D5.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37423n))}});
            a(this.f37426q.c(), IronSourceUtils.a());
            this.f37425p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(D5.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f37425p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(D5.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        D5 d52;
        boolean zIsInterstitialReady = false;
        if (!a(m.a.LOADED)) {
            a(D5.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f37470a.isInterstitialReady(this.f37472c);
            if (zIsInterstitialReady) {
                d52 = D5.IS_INSTANCE_READY_TRUE;
            } else {
                d52 = D5.IS_INSTANCE_READY_FALSE;
            }
            a(d52, (Object[][]) null);
            return zIsInterstitialReady;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception=" + e10.getMessage());
            return zIsInterstitialReady;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C3317l5.a(this.f37423n));
            a(this.f37426q.b(), IronSourceUtils.a());
            this.f37425p.onInterstitialAdLoadFailed(l(), ironSourceError);
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
        H9.i().a(new C5(d52, new JSONObject(mapJ)));
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.f37417i, "No available ad to load"));
            } else {
                a(D5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f37470a.loadInterstitialForBidding(this.f37472c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(D5.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(D5.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
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
        this.f37428s = aVar.a(l());
        a.C0236a c0236a = new a.C0236a(aVar.h());
        if (!c0236a.isEmpty()) {
            C3352n2 c3352n2 = c0236a.get(0);
            this.f37426q.a(c3352n2.b());
            this.f37426q.c(c3352n2.h());
            this.f37426q.b(c3352n2.g());
            strK = c3352n2.k();
            b(strK);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(str)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(D5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(D5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0236a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0236a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(strK);
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("error " + i10 + " - " + str);
        this.f37476g = null;
        this.f37477h = null;
        a(D5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.f37418j, "No available ad to load"));
        }
    }
}
