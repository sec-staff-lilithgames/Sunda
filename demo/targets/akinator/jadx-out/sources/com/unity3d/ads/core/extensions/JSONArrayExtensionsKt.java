package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONArray;
import org.json.JSONException;
import qv.m;
import qv.v;
import uu.j1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        e0.checkNotNullParameter(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            e0.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            e0.checkNotNullExpressionValue(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            e0.checkNotNullExpressionValue(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        e0.checkNotNullParameter(jSONArray, "<this>");
        m mVarUntil = v.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((j1) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
