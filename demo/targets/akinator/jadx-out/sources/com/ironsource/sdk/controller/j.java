package com.ironsource.sdk.controller;

import com.ironsource.C3121a6;
import com.ironsource.C3395pa;
import com.ironsource.C3412qa;
import com.ironsource.C3422r4;
import com.ironsource.C3477u8;
import com.ironsource.C8;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.Pc;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f38589a;

    /* renamed from: b, reason: collision with root package name */
    private final C3121a6 f38590b;

    public j(String str, C3121a6 c3121a6) {
        this.f38589a = str;
        this.f38590b = c3121a6;
    }

    private C8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(Y5.c.f35775c) || !jSONObject.has(Y5.c.f35774b)) {
            throw new Exception(Y5.a.f35759a);
        }
        String string = jSONObject.getString(Y5.c.f35775c);
        return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(Y5.c.f35774b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public void a(JSONObject jSONObject, InterfaceC3378oa interfaceC3378oa) {
        C3395pa c3395pa = new C3395pa(jSONObject);
        C3412qa c3412qa = new C3412qa(interfaceC3378oa);
        try {
            String strB = c3395pa.b();
            JSONObject jSONObjectC = c3395pa.c();
            C8 c8B = b(jSONObjectC, this.f38589a);
            IronSourceStorageUtils.ensurePathSafety(c8B, this.f38589a);
            switch (strB.hashCode()) {
                case -2073025383:
                    if (strB.equals(Y5.b.f35767a)) {
                        this.f38590b.a(c8B, jSONObjectC.optString(Y5.c.f35773a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(c3395pa, c3412qa));
                        break;
                    }
                    break;
                case -1137024519:
                    if (strB.equals(Y5.b.f35769c)) {
                        this.f38590b.b(c8B);
                        c3412qa.b(c3395pa, a(c3395pa, c8B.a()));
                        break;
                    }
                    break;
                case -318115535:
                    if (strB.equals(Y5.b.f35771e)) {
                        c3412qa.b(c3395pa, a(c3395pa, this.f38590b.d(c8B)));
                        break;
                    }
                    break;
                case 537556755:
                    if (strB.equals(Y5.b.f35772f)) {
                        this.f38590b.a(c8B, jSONObjectC.optJSONObject(Y5.c.f35779g));
                        c3412qa.b(c3395pa, a(c3395pa, c8B.a()));
                        break;
                    }
                    break;
                case 1764172231:
                    if (strB.equals(Y5.b.f35768b)) {
                        this.f38590b.a(c8B);
                        c3412qa.b(c3395pa, a(c3395pa, c8B.a()));
                        break;
                    }
                    break;
                case 1953259713:
                    if (strB.equals(Y5.b.f35770d)) {
                        c3412qa.b(c3395pa, a(c3395pa, this.f38590b.c(c8B)));
                        break;
                    }
                    break;
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            c3412qa.a(c3395pa, a(c3395pa, e10.getMessage()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Pc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3412qa f38591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3395pa f38592b;

        public a(C3412qa c3412qa, C3395pa c3395pa) {
            this.f38591a = c3412qa;
            this.f38592b = c3395pa;
        }

        @Override // com.ironsource.Pc
        public void a(C8 c82) {
            try {
                C3412qa c3412qa = this.f38591a;
                C3395pa c3395pa = this.f38592b;
                c3412qa.b(c3395pa, j.this.a(c3395pa, c82.a()));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Pc
        public void a(C8 c82, C3477u8 c3477u8) {
            try {
                C3412qa c3412qa = this.f38591a;
                C3395pa c3395pa = this.f38592b;
                c3412qa.a(c3395pa, j.this.a(c3395pa, c3477u8.b()));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    private Pc a(C3395pa c3395pa, C3412qa c3412qa) {
        return new a(c3412qa, c3395pa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C3395pa c3395pa, JSONObject jSONObject) {
        try {
            return c3395pa.e().put("result", jSONObject);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C3395pa c3395pa, long j10) {
        try {
            return c3395pa.e().put("result", j10);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C3395pa c3395pa, String str) {
        try {
            return c3395pa.e().put("errMsg", str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private C8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(Y5.c.f35776d)) {
            return new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(Y5.c.f35776d)));
        }
        throw new Exception(Y5.a.f35760b);
    }
}
