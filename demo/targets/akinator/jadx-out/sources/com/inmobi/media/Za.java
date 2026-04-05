package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Za extends V1 {
    public Za() {
        super("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) throws IllegalStateException, JSONException {
        String str;
        String str2;
        String str3;
        Bc bc2;
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString(KGUkpTlXZlJLy.wbmNJpojCV);
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (true) {
            String str4 = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            kotlin.jvm.internal.e0.checkNotNull(next);
            String string = jSONObject.getString(next);
            if (string != null) {
                kotlin.jvm.internal.e0.checkNotNull(string);
                str4 = string;
            }
            linkedHashMap.put(next, str4);
        }
        boolean z10 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z11 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger == null ? 0 : asInteger.intValue();
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str5 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        kotlin.jvm.internal.e0.checkNotNull(asString2);
        kotlin.jvm.internal.e0.checkNotNull(asString);
        kotlin.jvm.internal.e0.checkNotNull(asString3);
        kotlin.jvm.internal.e0.checkNotNull(asLong2);
        long jLongValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                str = asString3;
                try {
                    String string2 = jSONObject2.getString("adType");
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
                    str2 = asString2;
                    str3 = asString;
                    try {
                        C2675a0 c2675a0A = new Y(string2).a(jSONObject2.getLong("plId")).a();
                        String string3 = jSONObject2.getString("markupType");
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "getString(...)");
                        String string4 = jSONObject2.getString("impressionId");
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string4, "getString(...)");
                        String strOptString = jSONObject2.optString("metadataBlob", "");
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
                        String string5 = jSONObject2.getString("creativeType");
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = jSONObject2.getString("creativeId");
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string6, "getString(...)");
                        bc2 = new Bc(c2675a0A, string3, string4, strOptString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null);
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                }
            } catch (JSONException unused3) {
            }
        } else {
            str = asString3;
            str2 = asString2;
            str3 = asString;
            bc2 = null;
        }
        return new Ja(str2, str3, linkedHashMap, z10, str, z11, iIntValue, str5, jLongValue, asLong, bc2);
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) throws JSONException {
        Ja item = (Ja) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", item.f31914b);
        contentValues.put("url", item.f31913a);
        Map map = item.f31915c;
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(item.f31916d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, item.f31917e);
        contentValues.put("ack_required", String.valueOf(item.f31918f));
        contentValues.put("time_created", Long.valueOf(item.f31921i));
        contentValues.put("retry_count", Integer.valueOf(item.f31919g));
        contentValues.put("owner", item.f31920h);
        Long l9 = item.f31922j;
        contentValues.put("retryAfter", Long.valueOf(l9 != null ? l9.longValue() : 0L));
        Bc bc2 = item.f31923k;
        if (bc2 != null) {
            String string = new JSONObject().put("plType", bc2.f31677a.m()).put("plId", bc2.f31677a.l()).put("adType", bc2.f31677a.b()).put("markupType", bc2.f31678b).put("networkType", R3.x()).put("creativeType", bc2.f31682f).put("creativeId", bc2.f31683g).put("isRewarded", bc2.f31684h).put("adPosition", bc2.f31685i).put("metadataBlob", bc2.f31680d).put("impressionId", bc2.f31679c).toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public final ArrayList a(Integer num) {
        kotlin.jvm.internal.e0.checkNotNullParameter("high", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        return V1.a(this, "priority = ? AND retry_count >= ? AND retryAfter <= ?", new String[]{"high", "1", String.valueOf(System.currentTimeMillis())}, null, null, "time_created ASC", num, 12);
    }

    public final Ja a(String priority) {
        kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
        Ja ja2 = (Ja) uu.y0.firstOrNull((List) V1.a(this, "priority = ?", new String[]{priority}, null, null, "time_created ASC", 1, 12));
        if (ja2 == null) {
            return null;
        }
        a("id = ?", new String[]{ja2.f31914b});
        return ja2;
    }
}
