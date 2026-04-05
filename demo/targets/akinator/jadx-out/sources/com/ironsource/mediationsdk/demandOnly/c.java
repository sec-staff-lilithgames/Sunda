package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C3390p5;
import com.ironsource.D5;
import com.ironsource.L9;
import com.ironsource.U4;
import com.ironsource.V2;
import com.ironsource.mediationsdk.AbstractAdapter;
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
public class c implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f37395a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private U4 f37396b;

    public c(List<NetworkSettings> list, V2 v22, String str, String str2, U4 u42) throws JSONException {
        String strD = IronSourceUtils.d();
        boolean zK = v22.k();
        this.f37396b = u42;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(v22.d(), strD));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterA != null) {
                    d dVar = new d(str, str2, networkSettings, v22.b(), abstractAdapterA, eVar);
                    dVar.a(zK);
                    this.f37395a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f37395a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f37396b.a(D5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f37395a.get(str);
        if (dVar == null) {
            this.f37396b.a(D5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new o.a(L9.b(C3390p5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f37395a.get(str);
        if (dVar == null) {
            this.f37396b.a(D5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
