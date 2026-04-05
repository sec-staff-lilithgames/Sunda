package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31929a = "h";

    public static void a(C2793h ad2, JSONObject adJson, String str, long j10, F5 f52) throws IllegalStateException, JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(adJson, "adJson");
        ad2.a();
        long jOptLong = adJson.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j10));
        ad2.a(adJson, str, jOptLong <= 0 ? -1L : TimeUnit.SECONDS.toMillis(jOptLong));
        if (kotlin.jvm.internal.e0.areEqual("inmobiJson", ad2.u())) {
            try {
                JSONObject jSONObject = adJson.getJSONObject("pubContent");
                if (f52 != null) {
                    String TAG = f31929a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                    ((G5) f52).a(TAG, string);
                }
                if (jSONObject.isNull("rootContainer")) {
                    if (f52 != null) {
                        String TAG2 = f31929a;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f52).b(TAG2, "Missing key (rootContainer) in the ad markup");
                        return;
                    }
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                Iterator it = b(jSONObject2, f52).iterator();
                while (it.hasNext()) {
                    a(jSONArray, (String) it.next(), (byte) 2);
                }
                Iterator it2 = a(jSONObject2, f52).iterator();
                while (it2.hasNext()) {
                    a(jSONArray, (String) it2.next(), (byte) 1);
                }
                boolean zD = d(jSONObject2, f52);
                ad2.a(jSONArray);
                ad2.a(zD);
            } catch (Exception e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(f31929a, "TAG");
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    public static ArrayList b(JSONObject jSONObject, F5 f52) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.e0.checkNotNull(jSONArray);
            if (!D2.a(jSONArray)) {
                String string = jSONObject.getString("assetType");
                if (sv.k0.equals("image", string, true)) {
                    if (!jSONObject.isNull(LinkHeader.Rel.PreLoad) && jSONObject.getBoolean(LinkHeader.Rel.PreLoad)) {
                        String string2 = jSONArray.getString(0);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
                        arrayList.add(string2);
                        return arrayList;
                    }
                } else if (sv.k0.equals("container", string, true)) {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                        arrayList.addAll(b(jSONObject2, f52));
                    }
                }
            }
        } catch (JSONException e10) {
            if (f52 != null) {
                String str = f31929a;
                StringBuilder sbA = N6.a(str, "TAG", "Error getting getImageAssetUrls (");
                sbA.append(e10.getMessage());
                sbA.append(')');
                ((G5) f52).b(str, sbA.toString());
            }
        }
        return arrayList;
    }

    public static String c(JSONObject jSONObject, F5 f52) throws JSONException {
        String string;
        String strC;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.e0.checkNotNull(jSONArray);
            if (D2.a(jSONArray)) {
                return "";
            }
            String string2 = jSONObject.getString("assetType");
            if (sv.k0.equals("video", string2, true)) {
                string = jSONArray.getString(0);
            } else {
                if (sv.k0.equals("container", string2, true)) {
                    int length = jSONArray.length();
                    strC = "";
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                        strC = c(jSONObject2, f52);
                        int length2 = strC.length() - 1;
                        int i11 = 0;
                        boolean z10 = false;
                        while (i11 <= length2) {
                            boolean z11 = kotlin.jvm.internal.e0.compare((int) strC.charAt(!z10 ? i11 : length2), 32) <= 0;
                            if (z10) {
                                if (!z11) {
                                    break;
                                }
                                length2--;
                            } else if (z11) {
                                i11++;
                            } else {
                                z10 = true;
                            }
                        }
                        if (strC.subSequence(i11, length2 + 1).toString().length() > 0) {
                            break;
                        }
                    }
                    kotlin.jvm.internal.e0.checkNotNull(strC);
                    return strC;
                }
                string = "";
            }
            strC = string;
            kotlin.jvm.internal.e0.checkNotNull(strC);
            return strC;
        } catch (JSONException e10) {
            if (f52 != null) {
                String str = f31929a;
                StringBuilder sbA = N6.a(str, "TAG", "Error getting VAST video XML (");
                sbA.append(e10.getMessage());
                sbA.append(')');
                ((G5) f52).b(str, sbA.toString());
            }
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return "";
        }
    }

    public static boolean d(JSONObject jSONObject, F5 f52) throws JSONException {
        JSONArray jSONArray;
        try {
            jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.e0.checkNotNull(jSONArray);
        } catch (JSONException e10) {
            if (f52 != null) {
                String str = f31929a;
                StringBuilder sbA = N6.a(str, "TAG", "Error getting preload webview flag (");
                sbA.append(e10.getMessage());
                sbA.append(')');
                ((G5) f52).b(str, sbA.toString());
            }
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        if (D2.a(jSONArray)) {
            return false;
        }
        String string = jSONObject.getString("assetType");
        if (sv.k0.equals(C3191e4.h.K, string, true)) {
            if (!jSONObject.isNull(LinkHeader.Rel.PreLoad) && jSONObject.getBoolean(LinkHeader.Rel.PreLoad)) {
                return true;
            }
        } else if (sv.k0.equals("container", string, true)) {
            int length = jSONArray.length();
            boolean zD = false;
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                zD = d(jSONObject2, f52);
                if (zD) {
                    return zD;
                }
            }
            return zD;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023b A[Catch: JSONException -> 0x0258, TryCatch #0 {JSONException -> 0x0258, blocks: (B:115:0x0230, B:117:0x023b, B:119:0x0245), top: B:142:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3 A[Catch: JSONException -> 0x0200, TryCatch #3 {JSONException -> 0x0200, blocks: (B:97:0x01d8, B:99:0x01e3, B:101:0x01ed), top: B:148:0x01d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.inmobi.media.C2793h a(com.inmobi.media.C2793h r20, com.inmobi.commons.core.configs.AdConfig r21, com.inmobi.media.F5 r22) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.K.a(com.inmobi.media.h, com.inmobi.commons.core.configs.AdConfig, com.inmobi.media.F5):com.inmobi.media.h");
    }

    public static void a(JSONArray jSONArray, String str, byte b10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (int) b10);
        jSONObject.put("url", str);
        jSONArray.put(jSONObject);
    }

    public static ArrayList a(JSONObject jSONObject, F5 f52) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.e0.checkNotNull(jSONArray);
            if (!D2.a(jSONArray)) {
                String string = jSONObject.getString("assetType");
                if (sv.k0.equals("gif", string, true)) {
                    String string2 = jSONArray.getString(0);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(string2);
                    return arrayList;
                }
                if (sv.k0.equals("container", string, true)) {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                        arrayList.addAll(a(jSONObject2, f52));
                    }
                }
            }
        } catch (JSONException e10) {
            if (f52 != null) {
                String str = f31929a;
                StringBuilder sbA = N6.a(str, "TAG", "Error getting getGifAssetUrls (");
                sbA.append(e10.getMessage());
                sbA.append(')');
                ((G5) f52).b(str, sbA.toString());
            }
        }
        return arrayList;
    }
}
