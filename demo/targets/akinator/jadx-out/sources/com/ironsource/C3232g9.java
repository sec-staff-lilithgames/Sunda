package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3232g9 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f36800a = new ArrayList<>(new C3214f9().a());

    /* renamed from: b, reason: collision with root package name */
    private final S6 f36801b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f36801b.a(this.f36800a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
