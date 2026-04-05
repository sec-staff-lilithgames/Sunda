package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends o {

    /* renamed from: g, reason: collision with root package name */
    public l f23678g;

    public m(String str) {
        super(str);
    }

    public static void a(boolean z10, com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest) throws JSONException {
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        String str = (String) iAConfigManager.f23229x.f23422c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.contains("-" + spotId + "-")) {
            return;
        }
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.MISSMATCH_SPOTID, inneractiveAdRequest, eVar);
        String strL = z10 ? a.b.l("There is no ", spotId, " spot ID in current app config") : a.b.l("spot ID ", spotId, " is not active in current app config");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", strL);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "reason", strL);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
        iAConfigManager.f23229x.f23422c.put("KEY_MISSMATCH_STATS_SPOTS", e3.g.k(str, " -", spotId, "-"));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        IAlog.a("%s onRetry()", IAlog.a(this));
    }

    public final void c(InneractiveAdRequest inneractiveAdRequest) {
        o oVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        n nVar;
        if (!InneractiveAdManager.wasInitialized() && (nVar = this.f23757b) != null) {
            ((e0) nVar).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_NOT_INITIALIZED, i.NO_APP_CONFIG_AVAILABLE));
        }
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f23206a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (map == null || !map.containsKey(spotId)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f23206a.get(spotId);
        com.fyber.inneractive.sdk.response.e eVarC = c();
        if (q0Var != null && !q0Var.f23342b) {
            a(false, eVarC, inneractiveAdRequest);
            ((e0) this.f23757b).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SPOT_DISABLED, i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        if (q0Var == null || !q0Var.f23341a.iterator().hasNext()) {
            if (q0Var == null) {
                a(true, eVarC, inneractiveAdRequest);
                IAConfigManager.a();
            }
            IAlog.f("************************************************************************************************************************", new Object[0]);
            IAlog.f("*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'", inneractiveAdRequest.getSpotId(), iAConfigManager.f23208c);
            IAlog.f("*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?", new Object[0]);
            IAlog.f("************************************************************************************************************************", new Object[0]);
            ((e0) this.f23757b).a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT, i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f23341a.get(0);
        if (r0Var.f23347e != null || (r0Var.f23345c == null && ((t0Var = r0Var.f23348f) == null || ((unitDisplayType = t0Var.f23408j) != UnitDisplayType.INTERSTITIAL && unitDisplayType != UnitDisplayType.REWARDED)))) {
            ((e0) this.f23757b).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.UNSUPPORTED_SPOT, i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        this.f23758c = rVarA;
        rVarA.a(false, inneractiveAdRequest.getSpotId());
        com.fyber.inneractive.sdk.network.s sVar = new com.fyber.inneractive.sdk.network.s(inneractiveAdRequest, inneractiveAdRequest.f23899b, this.f23758c, this);
        this.f23759d = sVar;
        sVar.f24253b = false;
        IAlog.a("IARemoteAdFetcher: requestAd called", new Object[0]);
        if (TextUtils.isEmpty(inneractiveAdRequest.getSpotId())) {
            IAlog.b("appID is null or empty. Please provide a valid appID and re-try.", new Object[0]);
        } else {
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.INTERNET")) {
                if (!com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE")) {
                    IAlog.b("It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting", new Object[0]);
                }
                if (!com.fyber.inneractive.sdk.util.o.a("android.permission.READ_PHONE_STATE")) {
                    IAlog.f("It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting", new Object[0]);
                }
                iAConfigManager.f23224s.a(sVar.f24277f);
                return;
            }
            IAlog.b("INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! ", new Object[0]);
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.VALIDATE_PARAMS_FAILED, new Exception("appID is null or empty or INTERNET permission is missing"));
        if (sVar.f24253b || (oVar = sVar.f24252a) == null) {
            return;
        }
        oVar.a(inneractiveAdRequest, null, inneractiveInfrastructureError);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        IAlog.a("%s onTimeout()", IAlog.a(this));
    }
}
