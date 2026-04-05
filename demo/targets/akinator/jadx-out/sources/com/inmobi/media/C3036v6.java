package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3036v6 {
    public static boolean a(Object obj, Object obj2) {
        if (!kotlin.jvm.internal.e0.areEqual(obj.getClass(), obj2.getClass())) {
            if (kotlin.jvm.internal.e0.areEqual(obj.getClass(), Integer.class) && kotlin.jvm.internal.e0.areEqual(obj2.getClass(), Long.class)) {
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                return iIntValue == ((int) ((Long) obj2).longValue());
            }
            if (kotlin.jvm.internal.e0.areEqual(obj.getClass(), Long.class) && kotlin.jvm.internal.e0.areEqual(obj2.getClass(), Integer.class)) {
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                int iLongValue = (int) ((Long) obj).longValue();
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                return iLongValue == ((Integer) obj2).intValue();
            }
            if (kotlin.jvm.internal.e0.areEqual(obj.getClass(), Integer.class) && kotlin.jvm.internal.e0.areEqual(obj2.getClass(), Byte.class)) {
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj).intValue();
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Byte");
                return iIntValue2 == ((Byte) obj2).byteValue();
            }
            if (!kotlin.jvm.internal.e0.areEqual(obj.getClass(), Byte.class) || !kotlin.jvm.internal.e0.areEqual(obj2.getClass(), Integer.class)) {
                return kotlin.jvm.internal.e0.areEqual(obj, obj2);
            }
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
            byte bByteValue = ((Byte) obj).byteValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            return bByteValue == ((Integer) obj2).intValue();
        }
        Class<?> cls = obj.getClass();
        if (kotlin.jvm.internal.e0.areEqual(cls, Integer.TYPE)) {
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj).intValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            return iIntValue3 == ((Integer) obj2).intValue();
        }
        if (kotlin.jvm.internal.e0.areEqual(cls, Long.TYPE)) {
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            return jLongValue == ((Long) obj2).longValue();
        }
        if (kotlin.jvm.internal.e0.areEqual(cls, Boolean.TYPE)) {
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return zBooleanValue == ((Boolean) obj2).booleanValue();
        }
        if (kotlin.jvm.internal.e0.areEqual(cls, Double.TYPE)) {
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj).doubleValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Double");
            return dDoubleValue == ((Double) obj2).doubleValue();
        }
        if (kotlin.jvm.internal.e0.areEqual(cls, Byte.TYPE)) {
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
            byte bByteValue2 = ((Byte) obj).byteValue();
            kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Byte");
            return bByteValue2 == ((Byte) obj2).byteValue();
        }
        if (!kotlin.jvm.internal.e0.areEqual(cls, Short.TYPE)) {
            return kotlin.jvm.internal.e0.areEqual(obj, obj2);
        }
        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Short");
        short sShortValue = ((Short) obj).shortValue();
        kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Short");
        return sShortValue == ((Short) obj2).shortValue();
    }

    public static final boolean b(Class cls) {
        Class cls2 = Integer.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls2, cls) || kotlin.jvm.internal.e0.areEqual(cls2, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls3, cls) || kotlin.jvm.internal.e0.areEqual(cls3, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls4, cls) || kotlin.jvm.internal.e0.areEqual(cls4, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls5, cls) || kotlin.jvm.internal.e0.areEqual(cls5, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls6, cls) || kotlin.jvm.internal.e0.areEqual(cls6, cls) || kotlin.jvm.internal.e0.areEqual(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (kotlin.jvm.internal.e0.areEqual(cls7, cls) || kotlin.jvm.internal.e0.areEqual(cls7, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return kotlin.jvm.internal.e0.areEqual(cls8, cls) || kotlin.jvm.internal.e0.areEqual(cls8, cls);
    }

    public static void b(Object copyFrom, Object copyTo) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        kotlin.jvm.internal.e0.checkNotNullParameter(copyFrom, "copyFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(copyTo, "copyTo");
        Class<?> cls = copyFrom.getClass();
        if (cls.isAssignableFrom(copyTo.getClass())) {
            Object objCast = cls.cast(copyTo);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objCast, "cast(...)");
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    field.set(objCast, field.get(copyFrom));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Object obj = jSONArray.get(i10);
                Object obj2 = jSONArray2.get(i10);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    kotlin.jvm.internal.e0.checkNotNull(obj);
                    kotlin.jvm.internal.e0.checkNotNull(obj2);
                    if (!a(obj, obj2)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(JSONObject json1, JSONObject json2) throws JSONException {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.e0.checkNotNullParameter(json1, "json1");
        kotlin.jvm.internal.e0.checkNotNullParameter(json2, "json2");
        if (json1.length() != json2.length()) {
            return false;
        }
        Iterator<String> itKeys = json1.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                obj = json1.get(next);
                obj2 = json2.get(next);
            } catch (JSONException unused) {
            }
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                if (!a((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                if (!a((JSONArray) obj, (JSONArray) obj2)) {
                    return false;
                }
            } else {
                kotlin.jvm.internal.e0.checkNotNull(obj);
                kotlin.jvm.internal.e0.checkNotNull(obj2);
                if (!a(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a(Class cls) {
        return kotlin.jvm.internal.e0.areEqual(Integer.class, cls) || kotlin.jvm.internal.e0.areEqual(Boolean.class, cls) || kotlin.jvm.internal.e0.areEqual(Double.class, cls) || kotlin.jvm.internal.e0.areEqual(Float.class, cls) || kotlin.jvm.internal.e0.areEqual(Long.class, cls) || kotlin.jvm.internal.e0.areEqual(String.class, cls) || kotlin.jvm.internal.e0.areEqual(Byte.class, cls) || kotlin.jvm.internal.e0.areEqual(Short.class, cls);
    }

    public static final Object a(JSONArray jSONArray, int i10, Class cls) throws JSONException {
        Object objValueOf;
        if (kotlin.jvm.internal.e0.areEqual(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.e0.areEqual(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.e0.areEqual(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.e0.areEqual(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i10));
        } else if (kotlin.jvm.internal.e0.areEqual(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.e0.areEqual(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            objValueOf = jSONArray.get(i10);
        }
        kotlin.jvm.internal.e0.checkNotNull(objValueOf);
        return objValueOf;
    }

    public static final Object a(JSONObject jSONObject, String str, Class cls) throws JSONException {
        Object objValueOf;
        if (kotlin.jvm.internal.e0.areEqual(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.e0.areEqual(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.e0.areEqual(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.e0.areEqual(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONObject.getLong(str));
        } else if (kotlin.jvm.internal.e0.areEqual(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.e0.areEqual(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONObject.getInt(str));
        } else {
            objValueOf = jSONObject.get(str);
        }
        kotlin.jvm.internal.e0.checkNotNull(objValueOf);
        return objValueOf;
    }
}
