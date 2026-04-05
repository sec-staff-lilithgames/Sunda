package com.vungle.ads.internal.bidding;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.json.JsonBuilder;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BidTokenEncoder$json$1 extends f0 implements l {
    public static final BidTokenEncoder$json$1 INSTANCE = new BidTokenEncoder$json$1();

    public BidTokenEncoder$json$1() {
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
