package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.ironsource.C3271ic;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final String f16367g;

    /* renamed from: h, reason: collision with root package name */
    private final List f16368h;

    /* renamed from: i, reason: collision with root package name */
    private final h3 f16369i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f16370j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f16371k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f16372l;

    /* renamed from: m, reason: collision with root package name */
    private final MaxError f16373m;

    public z5(String str, List list, Map map, Map map2, MaxError maxError, h3 h3Var, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskFireMediationPostbacks", kVar);
        this.f16367g = j1.o2.l(str, "_urls");
        this.f16368h = list;
        this.f16370j = k7.a(map, kVar);
        this.f16371k = map2 == null ? new HashMap() : map2;
        this.f16373m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f16369i = h3Var;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z10 && h3Var != null) {
            map3.put("AppLovin-Ad-Network-Name", h3Var.c());
        }
        if (h3Var instanceof v2) {
            v2 v2Var = (v2) h3Var;
            map3.put("AppLovin-Ad-Unit-Id", v2Var.getAdUnitId());
            map3.put("AppLovin-Ad-Format", v2Var.getFormat().getLabel());
            if (z10) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", v2Var.Q());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f16372l = map3;
    }

    private void a(String str, Map map) {
        b().f0().e(com.applovin.impl.sdk.network.d.b().d(str).c(C3271ic.f36944b).a(this.f16372l).a(false).c(map).c(((Boolean) this.f14003a.a(o3.f14965p8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f14003a.a(o3.f14958m7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f16368h;
        if (list != null) {
            return list;
        }
        h3 h3Var = this.f16369i;
        if (h3Var != null) {
            return h3Var.b(this.f16367g);
        }
        return null;
    }

    private h g() {
        h3 h3Var = this.f16369i;
        if (h3Var instanceof v2) {
            return ((v2) h3Var).M().f();
        }
        if (h3Var instanceof b5) {
            return ((b5) h3Var).u().f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarG;
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.f16370j), this.f16373m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f16371k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    h3 h3Var = this.f16369i;
                    if (h3Var != null) {
                        map.put(str, h3Var.a((String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f14003a.B().e());
            if (((Boolean) this.f14003a.a(o3.f14951i8)).booleanValue() && (hVarG = g()) != null) {
                map.put("arn_info", hVarG.e());
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
