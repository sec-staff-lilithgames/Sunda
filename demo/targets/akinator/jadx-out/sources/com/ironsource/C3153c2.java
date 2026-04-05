package com.ironsource;

import com.ironsource.Q6;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3153c2 {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36109a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f36110b = new ArrayList<>(new C3117a2().a());

    /* renamed from: c, reason: collision with root package name */
    private final S6 f36111c = new S6();

    public C3153c2(Q6.a aVar) {
        this.f36109a = aVar;
    }

    public final JSONObject a() {
        Q6.a aVar = this.f36109a;
        JSONObject jSONObjectA = aVar != null ? this.f36111c.a(this.f36110b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f36111c.a(this.f36110b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject("md"));
        if (jSONObjectB != null) {
            jSONObject.put("md", jSONObjectB);
        }
        return jSONObject;
    }
}
