package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.B3;
import com.ironsource.C3134b1;
import com.ironsource.C3262i3;
import com.ironsource.C3286ja;
import com.ironsource.C3317l5;
import com.ironsource.C3422r4;
import com.ironsource.C3433rf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.H9;
import com.ironsource.InterfaceC3516wd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.BKC.KerkSviMAy;
import j1.o2;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z extends A implements BannerSmashListener, C3433rf.a, B3 {

    /* renamed from: h, reason: collision with root package name */
    private k f37880h;

    /* renamed from: i, reason: collision with root package name */
    private C3433rf f37881i;

    /* renamed from: j, reason: collision with root package name */
    private a f37882j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3516wd f37883k;

    /* renamed from: l, reason: collision with root package name */
    private q f37884l;

    /* renamed from: m, reason: collision with root package name */
    private String f37885m;

    /* renamed from: n, reason: collision with root package name */
    private JSONObject f37886n;

    /* renamed from: o, reason: collision with root package name */
    private int f37887o;

    /* renamed from: p, reason: collision with root package name */
    private String f37888p;

    /* renamed from: q, reason: collision with root package name */
    private C3262i3 f37889q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f37890r;

    /* renamed from: s, reason: collision with root package name */
    private C3317l5 f37891s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f37892t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f37893u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f37894v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public z(k kVar, InterfaceC3516wd interfaceC3516wd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, interfaceC3516wd, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f37238a != null) {
                if (p()) {
                    this.f37238a.initBannerForBidding(this.f37880h.a(), this.f37880h.i(), this.f37241d, this);
                } else {
                    this.f37238a.initBanners(this.f37880h.a(), this.f37880h.i(), this.f37241d, this);
                }
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f37238a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th2.getLocalizedMessage()));
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f37890r) {
            z10 = this.f37882j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f37890r) {
            z10 = this.f37882j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f37238a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f37238a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f37238a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean b(D5 d52) {
        return d52 == D5.BN_INSTANCE_LOAD_SUCCESS || d52 == D5.BN_INSTANCE_LOAD || d52 == D5.BN_INSTANCE_RELOAD || d52 == D5.BN_INSTANCE_RELOAD_SUCCESS || d52 == D5.BN_INSTANCE_CLICK || d52 == D5.BN_INSTANCE_DESTROY || d52 == D5.BN_INSTANCE_LOAD_ERROR || d52 == D5.BN_INSTANCE_LOAD_NO_FILL || d52 == D5.BN_INSTANCE_RELOAD_NO_FILL || d52 == D5.BN_INSTANCE_PRESENT_SCREEN || d52 == D5.BN_INSTANCE_DISMISS_SCREEN || d52 == D5.BN_INSTANCE_LEAVE_APP || d52 == D5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f37893u = true;
        A();
    }

    public void D() {
        this.f37238a.onBannerViewBound(this.f37239b.h().getBannerSettings());
    }

    public void E() {
        this.f37238a.onBannerViewWillBind(this.f37239b.h().getBannerSettings());
    }

    public void a(q qVar, C3262i3 c3262i3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f37889q = c3262i3;
        this.f37894v = jSONObject;
        if (!l.c(qVar)) {
            String str2 = qVar == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.f37883k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.f37238a == null) {
            ironLog.verbose("mAdapter is null");
            this.f37883k.a(new IronSourceError(611, "mAdapter is null"), this, false);
            return;
        }
        this.f37884l = qVar;
        this.f37881i.a((C3433rf.a) this);
        try {
            if (p()) {
                a(str, this.f37894v);
            } else {
                A();
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error("exception = " + th2.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.B3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(D5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f37238a.collectBannerBiddingData(this.f37241d, adData != null ? C3286ja.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f37238a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_CLICK);
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_LEAVE_APP);
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f37881i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f37881i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f37892t ? D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f37892t ? D5.BN_INSTANCE_RELOAD_SUCCESS : D5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37891s))}});
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(D5.BN_INSTANCE_SHOW);
            InterfaceC3516wd interfaceC3516wd = this.f37883k;
            if (interfaceC3516wd != null) {
                interfaceC3516wd.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f37882j);
        a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f37882j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f37881i.e();
        if (!a(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.f37882j);
        } else {
            InterfaceC3516wd interfaceC3516wd = this.f37883k;
            if (interfaceC3516wd != null) {
                interfaceC3516wd.a(ironSourceError, this, false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public void q() {
        this.f37881i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(D5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f37238a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f37239b.h().getBannerSettings());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f37238a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f37239b.h().getAdSourceNameForEvents()) ? this.f37239b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f37238a;
    }

    public String x() {
        return this.f37885m;
    }

    public String y() {
        return o2.l(f(), " - ");
    }

    public String z() {
        return this.f37239b.i();
    }

    public z(k kVar, InterfaceC3516wd interfaceC3516wd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new C3134b1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f37890r = new Object();
        this.f37882j = a.NONE;
        this.f37880h = kVar;
        this.f37881i = new C3433rf(kVar.e());
        this.f37883k = interfaceC3516wd;
        this.f37243f = i10;
        this.f37885m = str;
        this.f37887o = i11;
        this.f37888p = str2;
        this.f37886n = jSONObject;
        this.f37892t = z10;
        this.f37894v = null;
        if (r()) {
            u();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f37893u) {
                this.f37893u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f37884l)) {
                    a((String) null, this.f37894v);
                } else {
                    this.f37883k.a(new IronSourceError(605, this.f37884l == null ? "banner is null" : KerkSviMAy.KgImHPqwTrfAzi), this, false);
                }
            }
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.f37891s = new C3317l5();
            a(this.f37892t ? D5.BN_INSTANCE_RELOAD : D5.BN_INSTANCE_LOAD);
            if (this.f37238a == null) {
                return;
            }
            try {
                try {
                    if (p()) {
                        this.f37238a.loadBannerForBidding(this.f37241d, this.f37894v, str, this.f37884l.getSize(), this);
                    } else {
                        this.f37238a.loadBanner(this.f37241d, this.f37894v, this.f37884l.getSize(), this);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    C3422r4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f37238a.getProviderName() + ", exception =  " + th3.getLocalizedMessage());
                    onBannerAdLoadFailed(new IronSourceError(605, th3.getLocalizedMessage()));
                    a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th3.getLocalizedMessage()}});
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            ironLog.error("wrong state - state = " + this.f37882j);
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f37890r) {
            try {
                if (this.f37882j == aVar) {
                    IronLog.INTERNAL.verbose(y() + "set state from '" + this.f37882j + "' to '" + aVar2 + "'");
                    this.f37882j = aVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f37890r) {
            this.f37882j = aVar;
        }
    }

    @Override // com.ironsource.C3433rf.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (a(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f37882j);
            return;
        }
        a(ironSourceError);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        if (z10) {
            a(this.f37892t ? D5.BN_INSTANCE_RELOAD_NO_FILL : D5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37891s))}});
        } else {
            a(this.f37892t ? D5.BN_INSTANCE_RELOAD_ERROR : D5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C3317l5.a(this.f37891s))}});
        }
        InterfaceC3516wd interfaceC3516wd = this.f37883k;
        if (interfaceC3516wd != null) {
            interfaceC3516wd.a(ironSourceError, this, z10);
        }
    }

    public void a(D5 d52) {
        a(d52, (Object[][]) null);
    }

    public void a(D5 d52, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            q qVar = this.f37884l;
            if (qVar != null) {
                l.a(mapM, qVar.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f37885m)) {
            mapM.put("auctionId", this.f37885m);
        }
        JSONObject jSONObject = this.f37886n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f37886n);
        }
        C3262i3 c3262i3 = this.f37889q;
        if (c3262i3 != null) {
            mapM.put("placement", c3262i3.c());
        }
        if (b(d52)) {
            H9.i().a(mapM, this.f37887o, this.f37888p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f37243f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        H9.i().a(new C5(d52, new JSONObject(mapM)));
    }
}
