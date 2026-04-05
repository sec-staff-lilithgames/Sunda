package com.inmobi.media;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2855kb extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2855kb f33020a = new C2855kb();

    public C2855kb() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        C2973rb.f33316a.getClass();
        Context contextD = C2925od.d();
        JSONObject jSONObject = null;
        if (contextD != null) {
            if (C2973rb.f33319d == null) {
                C2973rb.f33319d = new C2720cb(contextD, "pub_signals_store");
            }
            C2720cb c2720cb = C2973rb.f33319d;
            if (c2720cb == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                c2720cb = null;
            }
            String strA = c2720cb.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
