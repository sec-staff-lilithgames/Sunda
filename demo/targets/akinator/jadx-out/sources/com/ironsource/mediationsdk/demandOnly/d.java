package com.ironsource.mediationsdk.demandOnly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.C3134b1;
import com.ironsource.C3171d2;
import com.ironsource.C3317l5;
import com.ironsource.C3352n2;
import com.ironsource.C3407q5;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.H9;
import com.ironsource.InterfaceC3135b2;
import com.ironsource.Mb;
import com.ironsource.P8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d extends m implements BannerSmashListener, InterfaceC3135b2 {

    /* renamed from: n, reason: collision with root package name */
    private C3317l5 f37397n;

    /* renamed from: o, reason: collision with root package name */
    private C3317l5 f37398o;

    /* renamed from: p, reason: collision with root package name */
    private String f37399p;

    /* renamed from: q, reason: collision with root package name */
    private String f37400q;

    /* renamed from: r, reason: collision with root package name */
    private C3171d2 f37401r;

    /* renamed from: s, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f37402s;

    /* renamed from: t, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f37403t;

    /* renamed from: u, reason: collision with root package name */
    private final P8 f37404u;

    /* renamed from: v, reason: collision with root package name */
    private final P8.a f37405v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.i f37406a;

        public a(com.ironsource.mediationsdk.i iVar) {
            this.f37406a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f37406a.r());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f37406a.r()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            d dVar = d.this;
            dVar.f37402s.a(applicationContext, this.f37406a, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C3134b1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f37404u = Mb.U().s();
        this.f37405v = Mb.O().h();
        this.f37475f = j10;
        this.f37399p = str;
        this.f37400q = str2;
        this.f37401r = new C3171d2();
        this.f37470a.initBannerForBidding(str, str2, this.f37472c, this);
        this.f37402s = eVar;
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f37403t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.f37476g = null;
        this.f37477h = null;
        this.f37401r = new C3171d2();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f37388e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f37388e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            } else {
                String str = "banner layout in blocking state | state: " + k();
                iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
                a(b.c.f37388e, new Object[][]{new Object[]{"reason", str}});
                return;
            }
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f37403t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new C3407q5());
            C3352n2 c3352n2A = new a.C0236a(aVar2.h()).a(h());
            if (c3352n2A == null) {
                IronSourceError ironSourceErrorBuildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            String strK = c3352n2A.k();
            if (strK == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.f37401r.a(c3352n2A.b());
            this.f37397n = new C3317l5();
            w();
            this.f37470a.initBannerForBidding(this.f37399p, this.f37400q, this.f37472c, this);
            this.f37470a.loadBannerForDemandOnlyForBidding(this.f37472c, strK, iSDemandOnlyBannerLayout, this);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.l.a(map, this.f37403t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f37470a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f37470a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f37471b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f37471b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", Integer.valueOf(this.f37471b.d()));
            if (!TextUtils.isEmpty(this.f37476g)) {
                map.put("auctionId", this.f37476g);
            }
            JSONObject jSONObject = this.f37477h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f37477h);
            }
            if (!TextUtils.isEmpty(this.f37479j)) {
                map.put("dynamicDemandSource", this.f37479j);
            }
            return map;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e10.getMessage());
            return map;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f37403t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(b.C0237b.f37381g, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f37403t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37398o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        P8 p82 = this.f37404u;
        IronSource.a aVar = IronSource.a.BANNER;
        int iA = p82.a(aVar);
        a(b.c.f37387d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37398o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f37403t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(iA)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37397n))}});
            this.f37405v.b(aVar);
            a(this.f37401r.c(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f37403t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f37401r.a(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f37403t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    public com.ironsource.mediationsdk.i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(IronSource.a.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(IronSourceUtils.g());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.f37403t.getSize());
        return iVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f37403t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f37403t = null;
        AbstractAdapter abstractAdapter = this.f37470a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f37472c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f37471b.h().isMultipleInstances() ? this.f37471b.h().getProviderTypeForReflection() : this.f37471b.h().getProviderName();
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.f37398o = new C3317l5();
                this.f37470a.initBannerForBidding(this.f37399p, this.f37400q, this.f37472c, this);
                this.f37470a.loadBannerForDemandOnlyForBidding(this.f37472c, str, this.f37403t, this);
            }
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f37388e, new Object[][]{new Object[]{"reason", gjnZrsdA.HsWLjfKA + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a aVarA = a(aVarArr, aVar);
        if (aVarA != aVar && aVarA != m.a.SHOW_IN_PROGRESS) {
            v();
            a(3002, (Object[][]) null);
            if (!o()) {
                ironLog.verbose("can't load banner when isOneFlow = false");
                a(new IronSourceError(1063, "Missing configuration settings"));
                return;
            }
            this.f37403t = iSDemandOnlyBannerLayout;
            this.f37397n = new C3317l5();
            w();
            if (this.f37402s.a()) {
                u();
                return;
            } else {
                ironLog.verbose("can't load the banner the auction isn't enabled");
                a(new IronSourceError(1063, "Missing server configuration"));
                return;
            }
        }
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(b.c.f37388e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
        } else {
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f37388e, new Object[][]{new Object[]{"reason", str}});
        }
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i10 + " - " + str);
        this.f37476g = null;
        this.f37477h = null;
        a(b.c.f37390g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C3352n2> list, String str, C3352n2 c3352n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, C3317l5.a(this.f37397n));
            a(this.f37401r.b(), IronSourceUtils.a());
            if (t()) {
                return;
            }
            this.f37403t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 606) {
            a(b.C0237b.f37383i, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        Map<String, Object> mapJ = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        H9.i().a(new C5(i10, new JSONObject(mapJ)));
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f37479j, str);
    }

    @Override // com.ironsource.InterfaceC3135b2
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f37476g = aVar.a();
        this.f37477h = aVar.f();
        a.C0236a c0236a = new a.C0236a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(b.c.f37391h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(b.c.f37393j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0236a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0236a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(b.C0237b.f37383i, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C3352n2 c3352n2 = c0236a.get(0);
            this.f37401r.a(c3352n2.b());
            this.f37401r.c(c3352n2.h());
            this.f37401r.b(c3352n2.g());
            String strK = c3352n2.k();
            b(strK);
            c(strK);
        }
    }
}
