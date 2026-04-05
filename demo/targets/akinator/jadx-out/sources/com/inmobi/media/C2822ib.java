package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2822ib extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2822ib f32931a = new C2822ib();

    public C2822ib() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() throws JSONException {
        JSONObject jSONObjectA = C2973rb.a(C2973rb.f33316a);
        if (jSONObjectA != null) {
            SignalsConfig.PublisherConfig publisherConfigB = C2973rb.b();
            C2973rb.a(AbstractC2990sb.a(publisherConfigB.getDirect().getExpiry(), "dir_", AbstractC2990sb.a(publisherConfigB.getAuto().getExpiry(), "auto_", AbstractC2990sb.a(publisherConfigB.getObj().getExpiry(), "obj_", jSONObjectA))));
        }
        return tu.x0.f87415a;
    }
}
