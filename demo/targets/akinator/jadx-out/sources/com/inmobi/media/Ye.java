package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ye {
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.media.Ze a() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ye.a():com.inmobi.media.Ze");
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        short s10;
        String message = error != null ? error.getMessage() : null;
        if (kotlin.jvm.internal.e0.areEqual(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s10 = 93;
        } else {
            s10 = kotlin.jvm.internal.e0.areEqual(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s10 >= 0) {
            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("FetchCallbackFailure", mapMutableMapOf, EnumC2993se.f33373a);
        }
        AbstractC2875le.a(new io.bidmachine.media3.exoplayer.b1(inMobiUnifiedIdInterface, 25, jSONObject, error));
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray2.getJSONObject(i10).getString("src");
                        kotlin.jvm.internal.e0.checkNotNull(string);
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject4, "getJSONObject(...)");
                        map.put(string, jSONObject4);
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String string2 = jSONArray3.getJSONObject(i11).getString("src");
                kotlin.jvm.internal.e0.checkNotNull(string2);
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i11);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
                map.put(string2, jSONObject5);
            }
        }
        Collection collectionValues = map.values();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
