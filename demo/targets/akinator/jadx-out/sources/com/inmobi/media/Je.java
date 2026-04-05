package com.inmobi.media;

import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Je extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public static final Je f31927a = new Je();

    public Je() {
        super(2);
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        JSONObject param = (JSONObject) obj;
        int iIntValue = ((Number) obj2).intValue();
        kotlin.jvm.internal.e0.checkNotNullParameter(param, "param");
        Iterator<String> itKeys = param.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < iIntValue) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
