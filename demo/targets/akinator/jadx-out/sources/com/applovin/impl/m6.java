package com.applovin.impl;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class m6 extends o6 {
    public m6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(l4 l4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", l4Var.b());
        Map mapA = l4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.o6
    public int g() {
        return ((Integer) this.f14003a.a(v4.f15913e1)).intValue();
    }

    public abstract l4 h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        l4 l4VarH = h();
        if (l4VarH == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Reporting pending reward: " + l4VarH + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a(a(l4VarH), new a());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements q0.e {
        public a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            m6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            m6.this.a(i10);
        }
    }
}
