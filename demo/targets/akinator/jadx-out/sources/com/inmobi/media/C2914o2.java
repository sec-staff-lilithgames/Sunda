package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2914o2 extends V1 {
    public C2914o2() {
        super("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
        Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
        String asString2 = contentValues.getAsString("track_extras");
        HashMap map = new HashMap();
        if (asString2 != null) {
            try {
                map.putAll(a(new JSONObject(asString2)));
            } catch (JSONException unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("o2", "TAG");
            } catch (Exception unused2) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("o2", "TAG");
            }
        }
        kotlin.jvm.internal.e0.checkNotNull(asInteger);
        int iIntValue = asInteger.intValue();
        kotlin.jvm.internal.e0.checkNotNull(asString);
        kotlin.jvm.internal.e0.checkNotNull(asBoolean);
        boolean zBooleanValue = asBoolean.booleanValue();
        kotlin.jvm.internal.e0.checkNotNull(asBoolean2);
        boolean zBooleanValue2 = asBoolean2.booleanValue();
        kotlin.jvm.internal.e0.checkNotNull(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong);
        long jLongValue = asLong.longValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong2);
        return new C2897n2(iIntValue, asString, map, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue());
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        C2897n2 click = (C2897n2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(click.f33110a));
        contentValues.put("url", click.f33111b);
        contentValues.put("pending_attempts", Integer.valueOf(click.f33115f));
        contentValues.put("ts", Long.valueOf(click.f33116g));
        contentValues.put("created_ts", Long.valueOf(click.f33117h));
        contentValues.put("follow_redirect", Boolean.valueOf(click.f33113d));
        contentValues.put("ping_in_webview", Boolean.valueOf(click.f33114e));
        Map map = click.f33112c;
        if (map != null && !map.isEmpty()) {
            Map map2 = click.f33112c;
            kotlin.jvm.internal.e0.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            contentValues.put("track_extras", new JSONObject(map2).toString());
        }
        return contentValues;
    }

    public final ArrayList a(int i10, int i11) {
        if (V1.a(this, null, null, 63) == 0) {
            return new ArrayList();
        }
        ArrayList<C2897n2> arrayListA = V1.a(this, null, null, "ts", "ts < " + (System.currentTimeMillis() - i11), "ts ASC ", -1 != i10 ? Integer.valueOf(i10) : null, 3);
        ArrayList arrayList = new ArrayList();
        for (C2897n2 c2897n2 : arrayListA) {
            if (c2897n2 != null) {
                arrayList.add(c2897n2);
            }
        }
        return arrayList;
    }

    public static HashMap a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.e0.checkNotNull(next);
            Object obj = jSONObject.get(next);
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            map.put(next, (String) obj);
        }
        return map;
    }
}
