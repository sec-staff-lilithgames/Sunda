package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C3390p5;
import com.ironsource.C3422r4;
import com.ironsource.D5;
import com.ironsource.F9;
import com.ironsource.InterfaceC3141b8;
import com.ironsource.L9;
import com.ironsource.U4;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f implements i.b {

    /* renamed from: a, reason: collision with root package name */
    private final U4 f37420a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f37421b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3141b8<ISDemandOnlyInterstitialListener> f37422c;

    public f(List<NetworkSettings> list, F9 f92, com.ironsource.mediationsdk.c cVar, InterfaceC3141b8<ISDemandOnlyInterstitialListener> interfaceC3141b8, String str, String str2, U4 u42) throws JSONException {
        String strD = IronSourceUtils.d();
        boolean zJ = f92.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(f92.g(), strD);
        this.f37421b = new ConcurrentHashMap<>();
        this.f37420a = u42;
        this.f37422c = interfaceC3141b8;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    g gVar = new g(str, str2, networkSettings, this.f37422c.a(networkSettings.getSubProviderId()), f92.e(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(zJ);
                    this.f37421b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(h.d dVar) {
        String strE = dVar.e();
        String strB = dVar.b();
        try {
            g gVar = this.f37421b.get(strE);
            if (gVar == null) {
                this.f37420a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f37422c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                gVar.b();
            } else {
                gVar.a(new o.a(L9.b(C3390p5.b().c(), strB)));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f37422c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f37421b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f37420a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f37421b.get(str);
            if (gVar == null) {
                this.f37420a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f37422c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f37422c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f37421b;
    }
}
