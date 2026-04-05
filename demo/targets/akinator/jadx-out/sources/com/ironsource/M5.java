package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M5 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f34836a = new ArrayList<>(new L5().a());

    /* renamed from: b, reason: collision with root package name */
    private final S6 f34837b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f34837b.a(this.f34836a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}
