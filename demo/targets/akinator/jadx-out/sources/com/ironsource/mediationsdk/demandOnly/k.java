package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3390p5;
import com.ironsource.C3422r4;
import com.ironsource.D5;
import com.ironsource.InterfaceC3141b8;
import com.ironsource.L9;
import com.ironsource.U4;
import com.ironsource.Zd;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class k implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private final U4 f37458a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f37459b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3141b8<ISDemandOnlyRewardedVideoListener> f37460c;

    public k(List<NetworkSettings> list, Zd zd2, com.ironsource.mediationsdk.c cVar, InterfaceC3141b8<ISDemandOnlyRewardedVideoListener> interfaceC3141b8, String str, String str2, U4 u42) throws JSONException {
        String strD = IronSourceUtils.d();
        boolean zD = zd2.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(zd2.k(), strD);
        this.f37459b = new ConcurrentHashMap<>();
        this.f37458a = u42;
        this.f37460c = interfaceC3141b8;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    l lVar = new l(str, str2, networkSettings, this.f37460c.a(networkSettings.getSubProviderId()), zd2.i(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(zD);
                    this.f37459b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String strE = dVar.e();
        try {
            l lVar = this.f37459b.get(strE);
            if (lVar == null) {
                this.f37458a.a(D5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f37460c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.c()) {
                lVar.b(new o.a(L9.b(C3390p5.b().c(), dVar.b())));
            } else {
                lVar.c();
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f37460c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f37459b.get(str);
            if (lVar != null) {
                lVar.d();
                return;
            }
            this.f37458a.a(D5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f37460c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f37460c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f37459b.get(str);
        if (lVar == null) {
            this.f37458a.a(D5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return lVar.a();
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f37459b;
    }
}
