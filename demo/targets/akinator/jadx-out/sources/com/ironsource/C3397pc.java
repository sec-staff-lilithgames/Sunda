package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3397pc {

    /* renamed from: b, reason: collision with root package name */
    private final B7 f38171b = Mb.U().i();

    /* renamed from: a, reason: collision with root package name */
    U6 f38170a = new U6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f38170a.a(Q6.f35281n, Boolean.valueOf(this.f38171b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f38170a.a(Q6.f35266i, new JSONObject(controllerConfig).opt(C3191e4.a.f36379q));
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void c() {
        this.f38170a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f38170a.a(Q6.V, "9.0.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(Q6.E, Hc.f34589f);
        map.put(Q6.D, Hc.f34588e);
        this.f38170a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f38170a.a("debug", jSONObject);
        }
    }

    public void b(Context context) {
        this.f38170a.a("gpi", Boolean.valueOf(C3182dd.d(context)));
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.f38170a.a(Q6.f35275l, jSONObject);
    }

    public void a(C3460t8.c cVar) {
        this.f38170a.a(Q6.f35313x1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f38170a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.f38170a.a(Q6.A1, list);
    }

    public void a(boolean z10) {
        this.f38170a.a(Q6.R0, Boolean.valueOf(z10));
    }
}
