package com.ironsource;

import com.ironsource.environment.ContextProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3250h9 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3250h9 f36872a = new C3250h9();

    private C3250h9() {
    }

    public static final JSONObject a() throws JSONException {
        new V9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectPut = new JSONObject().put("data", L9.e(C3390p5.b().c(), new C3232g9().a().toString()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return jSONObjectPut;
    }
}
