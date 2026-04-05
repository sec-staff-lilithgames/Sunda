package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3434s;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, r rVar) throws JSONException {
        t tVar;
        InneractiveErrorCode inneractiveErrorCode;
        InneractiveErrorCode inneractiveErrorCode2;
        t tVar2;
        x xVarA;
        Set<com.fyber.inneractive.sdk.model.vast.r> setKeySet;
        String str;
        String str2 = gVar.f26637i;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = t.VAST_ERROR_INVALID_RESPONSE;
            if (gVar.f26638j != null) {
                xVarA = new x().a(gVar.f26638j, "exception");
                t tVar3 = tVar2;
                inneractiveErrorCode = inneractiveErrorCode2;
                tVar = tVar3;
            }
            t tVar4 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar4;
            xVarA = null;
        } else {
            if ("ErrorNoCompatibleMediaFile".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
                LinkedHashMap linkedHashMap = gVar.P;
                if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null && setKeySet.size() > 0) {
                    x xVar = new x();
                    JSONArray jSONArray = new JSONArray();
                    for (com.fyber.inneractive.sdk.model.vast.r rVar2 : setKeySet) {
                        try {
                            f fVar = (f) linkedHashMap.get(rVar2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", rVar2.f24141g);
                            jSONObject.put("bitrate", rVar2.f24139e);
                            jSONObject.put("mime", TextUtils.isEmpty(rVar2.f24138d) ? "na" : rVar2.f24138d);
                            jSONObject.put(C3434s.f38306g, rVar2.f24135a);
                            e eVar = fVar.f23919a;
                            jSONObject.put("reason", eVar != null ? eVar.value : 0);
                            jSONObject.put("required_value", fVar.f23920b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                            IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                        }
                    }
                    xVar.a(jSONArray, "media_files");
                    inneractiveErrorCode = inneractiveErrorCode2;
                    tVar = tVar2;
                    xVarA = xVar;
                }
            } else if ("VastErrorTooManyWrappers".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_TOO_MANY_WRAPPERS;
                xVarA = new x().a(Integer.valueOf(IAConfigManager.O.f23214i.f23323b), "max");
                t tVar32 = tVar2;
                inneractiveErrorCode = inneractiveErrorCode2;
                tVar = tVar32;
            } else if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar2 = t.INTERNAL_CONFIG_MISMATCH;
            } else if ("VastErrorUnsecure".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_UNSECURE_URL;
            } else {
                tVar = null;
                inneractiveErrorCode = null;
                xVarA = null;
            }
            t tVar42 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar42;
            xVarA = null;
        }
        if (tVar != null) {
            JSONArray jSONArrayB = rVar == null ? null : rVar.b();
            w wVar = new w(gVar);
            wVar.f24325b = tVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            if (xVarA != null) {
                wVar.f24329f.put(xVarA.f24331a);
            }
            wVar.a((String) null);
        }
        if (gVar.f26644p != UnitDisplayType.NATIVE) {
            ArrayList arrayList = gVar.Q;
            if (arrayList != null && arrayList.size() > 0) {
                u uVar = u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray jSONArrayB2 = rVar == null ? null : rVar.b();
                w wVar2 = new w(gVar);
                wVar2.f24326c = uVar;
                wVar2.f24324a = inneractiveAdRequest;
                wVar2.f24327d = jSONArrayB2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it.next();
                    hVar.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("w", hVar.f24110a);
                        jSONObject3.put(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, hVar.f24111b);
                        jSONObject3.put(Q6.I0, hVar.f24116g);
                        jSONObject3.put("clt", hVar.f24117h);
                        String str3 = hVar.f24115f;
                        if (str3 != null) {
                            jSONObject3.put("content", str3);
                            str = "HTMLResource";
                        } else {
                            str = null;
                        }
                        l lVar = hVar.f24113d;
                        if (lVar != null) {
                            jSONObject3.put("content", lVar.f24122b);
                            jSONObject3.put("creativeType", hVar.f24113d.f24121a);
                            str = "StaticResource";
                        }
                        if (!TextUtils.isEmpty(hVar.f24114e)) {
                            jSONObject3.put("content", hVar.f24114e);
                            str = "iFrameResource";
                        }
                        if (str != null) {
                            jSONObject3.put("type", str);
                        }
                        b bVar = hVar.f24118i;
                        if (bVar != null) {
                            jSONObject3.put("reason", bVar.f23905a);
                            jSONObject3.put("exception", hVar.f24118i.getMessage());
                        }
                    } catch (JSONException e10) {
                        IAlog.a("Failed creating Companion json object: %s", e10.getMessage());
                        jSONObject3 = null;
                    }
                    jSONArray2.put(jSONObject3);
                }
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                }
                wVar2.f24329f.put(jSONObject2);
                wVar2.a((String) null);
            }
            com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.O;
            int size = bVar2 != null ? bVar2.f24076g.size() : 0;
            ArrayList arrayList2 = gVar.Q;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            u uVar2 = u.NUMBER_OF_COMPANIONS;
            JSONArray jSONArrayB3 = rVar == null ? null : rVar.b();
            w wVar3 = new w(gVar);
            wVar3.f24326c = uVar2;
            wVar3.f24324a = inneractiveAdRequest;
            wVar3.f24327d = jSONArrayB3;
            JSONObject jSONObject4 = new JSONObject();
            Integer numValueOf = Integer.valueOf(size + size2);
            try {
                jSONObject4.put("number_of_endcards", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", numValueOf);
            }
            wVar3.f24329f.put(jSONObject4);
            wVar3.a((String) null);
        }
        if (gVar.O != null) {
            i iVar = new i(gVar);
            if (iVar.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                u uVar3 = u.OMID_VAST_DETECTION;
                JSONArray jSONArrayB4 = rVar == null ? null : rVar.b();
                w wVar4 = new w(gVar);
                wVar4.f24326c = uVar3;
                wVar4.f24324a = inneractiveAdRequest;
                wVar4.f24327d = jSONArrayB4;
                Iterator it2 = iVar.iterator();
                while (it2.hasNext()) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = (com.fyber.inneractive.sdk.measurement.h) it2.next();
                    hVar2.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(hVar2.b()));
                        if (!hVar2.b()) {
                            jSONObject6.put("error_reason", hVar2.a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put("verifications", jSONArray3);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "verifications", jSONArray3);
                }
                wVar4.f24329f.put(jSONObject5);
                wVar4.a((String) null);
            }
        }
        return inneractiveErrorCode;
    }
}
