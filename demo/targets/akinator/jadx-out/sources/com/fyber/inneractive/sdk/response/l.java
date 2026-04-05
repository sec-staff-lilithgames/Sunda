package com.fyber.inneractive.sdk.response;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends b {

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.j f26658e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws Exception {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f26618a == null || (jVar = this.f26658e) == null) {
            throw new Exception("Missing response ".concat(this.f26618a == null ? "data" : OcvDtWCQ.HkMgV));
        }
        if (r0Var == null) {
            jVar.f26637i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f26658e.f26637i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i iVarA = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.f26658e.T;
            kVar.N = iVarA;
            if (kVar.d()) {
                a(this.f26658e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            if (e10.getCause() != null) {
                this.f26658e.f26637i = e10.getCause().getMessage();
            }
            this.f26658e.f26638j = e10.getMessage();
            throw e10;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            if (e11.getCause() != null) {
                this.f26658e.f26637i = e11.getCause().getMessage();
            }
            this.f26658e.f26638j = e11.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            this.f26658e.f26638j = e12.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.f26658e;
            jVar2.f26637i = "ErrorInvalidNativeOrtbObject";
            jVar2.f26654z = e12;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e12.getMessage());
            if (IAlog.f26748a == 2) {
                e12.printStackTrace();
            }
            throw e12;
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return false;
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e eVarC = jVar.T.c();
        String str = eVarC != null ? eVarC.f26662a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.f26618a = new g();
            dVar.f26622e = this.f26658e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.response.nativead.i a(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.l.a(org.json.JSONObject):com.fyber.inneractive.sdk.response.nativead.i");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f26618a = jVar;
        this.f26658e = jVar;
        return jVar;
    }
}
