package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3428ra implements Le<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Le<String> f38292a;

    public C3428ra(Le<String> serverResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverResponse, "serverResponse");
        this.f38292a = serverResponse;
    }

    @Override // com.ironsource.Le
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f38292a.a());
    }
}
