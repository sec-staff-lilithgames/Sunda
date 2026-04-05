package com.moloco.sdk.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f46745a = tu.q.lazy(new a1.k(17));

    public static final Json a() {
        return JsonKt.Json$default(null, new a1.o(10), 1, null);
    }

    public static final Json b() {
        return c();
    }

    public static final Json c() {
        return (Json) f46745a.getValue();
    }

    public static final x0 a(JsonBuilder Json) {
        e0.checkNotNullParameter(Json, "$this$Json");
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return x0.f87415a;
    }
}
