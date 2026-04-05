package com.inmobi.media;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.billingclient.api.BillingClient;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3041vb extends kotlin.jvm.internal.f0 implements kv.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3041vb() {
        super(1);
        String str = C3075xb.f33575a;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        I6 i6A;
        C3092yb c3092yb = (C3092yb) obj;
        C3075xb.f33578d = 2;
        if (c3092yb == null) {
            Ob ob2 = C3075xb.f33576b;
            if (ob2 != null) {
                ob2.f32095a = null;
                BillingClient billingClient = ob2.f32096b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            C3075xb.f33576b = null;
        } else {
            c3092yb.toString();
            JSONObject jSONObject = new JSONObject();
            int i10 = c3092yb.f33608a;
            if (i10 > 0) {
                jSONObject.put("p", i10);
            }
            int i11 = c3092yb.f33609b;
            if (i11 > 0) {
                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, i11);
            }
            String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
            if (nipMapJSON != null) {
                C3075xb.f33575a = nipMapJSON;
                kotlin.jvm.internal.e0.checkNotNullParameter(nipMapJSON, "nipMapJSON");
                kotlin.jvm.internal.e0.checkNotNullParameter(nipMapJSON, "nipMapJSON");
                Context contextD = C2925od.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = I6.f31865b;
                    i6A = H6.a(contextD, "purchase_store");
                } else {
                    i6A = null;
                }
                if (i6A != null) {
                    I6.a(i6A, "purchase_pref", nipMapJSON, false, 4, (Object) null);
                }
            }
            Ob ob3 = C3075xb.f33576b;
            if (ob3 != null) {
                ob3.f32095a = null;
                BillingClient billingClient2 = ob3.f32096b;
                if (billingClient2 != null) {
                    billingClient2.endConnection();
                }
            }
            C3075xb.f33576b = null;
        }
        return tu.x0.f87415a;
    }
}
