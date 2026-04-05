package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3241h0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f36825a = new ArrayList<>(new C3223g0().a());

    /* renamed from: b, reason: collision with root package name */
    private final S6 f36826b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f36826b.a(this.f36825a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}
