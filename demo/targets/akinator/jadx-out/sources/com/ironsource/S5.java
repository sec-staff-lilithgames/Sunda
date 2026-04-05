package com.ironsource;

import android.content.Context;
import com.ironsource.C3191e4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S5 implements Mc {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35443a = true;

    /* renamed from: b, reason: collision with root package name */
    private String f35444b = T5.f35489j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements InterfaceC3283j7 {
        @Override // com.ironsource.InterfaceC3283j7
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C3144bb.f36078o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.b(applicationContext));
            R9 r9D = IronSourceUtils.d(applicationContext);
            if (r9D != null) {
                jSONObject.put("advId", r9D.c());
                jSONObject.put("advIdType", r9D.d());
            }
        }
        String strN = com.ironsource.mediationsdk.r.m().n();
        if (strN != null) {
            jSONObject.put(C3191e4.i.f36535g, strN);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Mc
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dataSource, "dataSource");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f35443a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            C3266i7.a(this.f35444b, jSONObject.toString(), new a());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.API.error("exception " + e10.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Mc
    public void a(List<IronSource.a> list, boolean z10, V3 v32) {
        if (v32 != null) {
            A1 a1B = v32.b();
            K1 k1F = a1B != null ? a1B.f() : null;
            kotlin.jvm.internal.e0.checkNotNull(k1F);
            this.f35443a = k1F.l();
            this.f35444b = v32.b().f().d();
        }
    }

    @Override // com.ironsource.Mc
    public void h(String str) {
    }
}
