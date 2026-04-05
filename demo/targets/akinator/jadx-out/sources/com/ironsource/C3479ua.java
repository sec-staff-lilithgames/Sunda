package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3479ua {

    /* renamed from: a, reason: collision with root package name */
    private static final int f39058a = 100;

    public static final boolean a(JSONObject lhs, JSONObject rhs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.e0.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(JSONArray lhs, JSONArray rhs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.e0.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i10 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "lhs.keys()");
        for (String str : rv.y.asSequence(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i10 > 100) {
            return false;
        }
        Iterable iterableUntil = qv.v.until(0, jSONArray.length());
        if (!(iterableUntil instanceof Collection) || !((Collection) iterableUntil).isEmpty()) {
            Iterator it = iterableUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((uu.j1) it).nextInt();
                if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i10)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean a(Object obj, Object obj2, int i10) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i10 + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i10 + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return kotlin.jvm.internal.e0.areEqual(obj, obj2);
    }
}
