package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3196e9 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f36600a = new ArrayList<>(new C3178d9().a());

    /* renamed from: b, reason: collision with root package name */
    private final S6 f36601b = new S6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f36601b.a(this.f36600a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return jSONObjectA;
    }
}
