package com.android.billingclient.api;

import com.ironsource.C3191e4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j1.o2;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class zzc {

    /* renamed from: a, reason: collision with root package name */
    public final String f12807a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12808b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12809c;

    public /* synthetic */ zzc(JSONObject jSONObject) {
        this.f12807a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f12808b = jSONObject.optString(C3191e4.h.f36495m);
        String strOptString = jSONObject.optString("offerToken");
        this.f12809c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.f12807a.equals(zzcVar.f12807a) && this.f12808b.equals(zzcVar.f12808b) && Objects.equals(this.f12809c, zzcVar.f12809c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12807a, this.f12808b, this.f12809c);
    }

    public final String toString() {
        return o2.o(b3.h.b("{id: ", this.f12807a, ", type: ", this.f12808b, ", offer token: "), this.f12809c, "}");
    }
}
