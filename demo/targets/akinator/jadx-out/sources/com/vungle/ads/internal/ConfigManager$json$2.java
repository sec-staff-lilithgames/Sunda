package com.vungle.ads.internal;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigManager$json$2 extends f0 implements kv.a {
    public static final ConfigManager$json$2 INSTANCE = new ConfigManager$json$2();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.ConfigManager$json$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(JsonBuilder Json) {
            e0.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
        }
    }

    public ConfigManager$json$2() {
        super(0);
    }

    @Override // kv.a
    public final Json invoke() {
        return JsonKt.Json$default(null, AnonymousClass1.INSTANCE, 1, null);
    }
}
