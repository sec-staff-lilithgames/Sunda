package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import com.ironsource.C3271ic;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2690af extends Uc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2690af(String url, Te te2, String str, int i10, int i11, int i12) {
        super(url, te2, str, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullParameter(C3271ic.f36944b, "requestType");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f32507p = i12;
    }

    @Override // com.inmobi.media.X9
    public final void f() throws JSONException {
        InMobiUserDataTypes emailId;
        InMobiUserDataTypes phoneNumber;
        HashMap map;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        String string;
        HashMap map5;
        super.f();
        String.valueOf(R4.f32200a);
        HashMap mapA = AbstractC3024ub.a();
        HashMap map6 = this.f32502k;
        if (map6 != null) {
            map6.put("mk-version", C2942pd.a());
            String str = C2778g1.f32855a;
            if (str != null) {
            }
            map6.put(com.ironsource.Q6.f35252d0, C2925od.k());
            map6.put("ts", String.valueOf(System.currentTimeMillis()));
        }
        String str2 = this.f32504m;
        if (str2 != null && (map5 = this.f32502k) != null) {
        }
        Boolean boolC = Se.f32278a.c();
        HashMap map7 = this.f32502k;
        if (map7 != null) {
            if (boolC == null || (string = boolC.toString()) == null) {
                string = "true";
            }
        }
        String str3 = (String) mapA.get("u-age");
        if (str3 != null && (map4 = this.f32502k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = R4.f32200a;
        if (inMobiUserDataModel == null || (emailId = inMobiUserDataModel.getEmailId()) == null || (emailId.getMd5() == null && emailId.getSha1() == null && emailId.getSha256() == null)) {
            emailId = null;
        }
        if (emailId != null && (map3 = this.f32502k) != null) {
        }
        InMobiUserDataModel inMobiUserDataModel2 = R4.f32200a;
        if (inMobiUserDataModel2 == null || (phoneNumber = inMobiUserDataModel2.getPhoneNumber()) == null || (phoneNumber.getMd5() == null && phoneNumber.getSha1() == null && phoneNumber.getSha256() == null)) {
            phoneNumber = null;
        }
        if (phoneNumber != null && (map2 = this.f32502k) != null) {
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = W5.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string2 = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                        String string3 = jSONArray2.getJSONObject(i10).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i10).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z10 = System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry");
                        if (string2 != null && string3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string2);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string3);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObjectB);
            }
        }
        HashMap map8 = this.f32502k;
        if (map8 != null) {
            String string4 = jSONArray.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string4, "toString(...)");
        }
        InMobiUserDataModel inMobiUserDataModel3 = R4.f32200a;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras == null || (map = this.f32502k) == null) {
            return;
        }
        map.putAll(extras);
    }
}
