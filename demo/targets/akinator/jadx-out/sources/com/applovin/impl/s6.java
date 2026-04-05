package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class s6 extends o6 {
    public s6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private l4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(b0.e2.t(jSONObject, "results"), 0, new JSONObject());
        r0.c(jSONObject2, this.f14003a);
        r0.b(jSONObject, this.f14003a);
        r0.a(jSONObject, this.f14003a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return l4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        l4 l4VarB = b(jSONObject);
        a(l4VarB);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Pending reward handled: " + l4VarB);
        }
    }

    public abstract void a(l4 l4Var);

    @Override // com.applovin.impl.o6
    public int g() {
        return ((Integer) this.f14003a.a(v4.f15905d1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (s6.this.h()) {
                com.applovin.impl.sdk.o oVar = s6.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    s6 s6Var = s6.this;
                    s6Var.f14005c.b(s6Var.f14004b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = s6.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    s6 s6Var2 = s6.this;
                    s6Var2.f14005c.b(s6Var2.f14004b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = s6.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                s6 s6Var3 = s6.this;
                s6Var3.f14005c.a(s6Var3.f14004b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            s6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (s6.this.h()) {
                com.applovin.impl.sdk.o oVar = s6.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    s6 s6Var = s6.this;
                    s6Var.f14005c.b(s6Var.f14004b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = s6.this.f14005c;
            if (com.applovin.impl.sdk.o.a()) {
                s6 s6Var2 = s6.this;
                s6Var2.f14005c.b(s6Var2.f14004b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            s6.this.a(i10);
        }
    }
}
