package com.fyber.inneractive.sdk.flow;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {
    public static void a(InneractiveAdRequest inneractiveAdRequest, InneractiveInfrastructureError inneractiveInfrastructureError, x xVar, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
        String string;
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() == i.ADM_FETCH_FAILED || inneractiveInfrastructureError.getErrorCode().getMetricable() != InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            return;
        }
        if (xVar == null || xVar.c() || xVar.isVideoAd()) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_LOAD_FAILED;
            if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                return;
            }
            IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
            if (inneractiveInfrastructureError.getCause() != null) {
                string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
            } else {
                StringBuilder sb2 = new StringBuilder();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i10 = 7; i10 >= 0 && i10 < 13 && i10 < stackTrace.length; i10++) {
                    sb2.append(stackTrace[i10].toString());
                    sb2.append(",");
                }
                Log.d("stack trace:", sb2.toString());
                string = sb2.toString();
            }
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.f24325b = tVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArray;
            JSONObject jSONObject = new JSONObject();
            String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, string2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, string2);
            }
            try {
                jSONObject.put("description", string);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "description", string);
            }
            String strDescription = inneractiveInfrastructureError.description();
            try {
                jSONObject.put("extra_description", strDescription);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
            }
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
            inneractiveInfrastructureError.addReportedError(tVar);
        }
    }
}
