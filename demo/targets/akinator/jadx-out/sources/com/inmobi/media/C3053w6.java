package com.inmobi.media;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3053w6 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f33533b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f33534a = new HashMap();

    public static final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        return C3036v6.a(jSONObject, jSONObject2);
    }

    public static final /* synthetic */ String b() {
        return "w6";
    }

    public static final void a(Object obj, Object obj2) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        C3036v6.b(obj, obj2);
    }

    public static final void b(boolean z10) {
        f33533b = z10;
    }

    public final C3053w6 a(Yc key, Xc types) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(types, "types");
        this.f33534a.put(key, types);
        return this;
    }

    public final JSONObject a(Object obj, Class cls) throws IllegalAccessException, JSONException, SecurityException, IllegalArgumentException {
        JSONObject jSONObject;
        try {
            Class superclass = cls.getSuperclass();
            if (superclass == null || kotlin.jvm.internal.e0.areEqual(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getClass();
                kotlin.jvm.internal.e0.checkNotNull(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(InterfaceC2765f5.class)) {
                        kotlin.jvm.internal.e0.checkNotNull(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !kotlin.jvm.internal.e0.areEqual(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (!kotlin.jvm.internal.e0.areEqual(cls2, type) && !kotlin.jvm.internal.e0.areEqual(cls2, type) && !kotlin.jvm.internal.e0.areEqual(Integer.class, type)) {
                                Class cls3 = Boolean.TYPE;
                                if (!kotlin.jvm.internal.e0.areEqual(cls3, type) && !kotlin.jvm.internal.e0.areEqual(cls3, type) && !kotlin.jvm.internal.e0.areEqual(Boolean.class, type)) {
                                    Class cls4 = Double.TYPE;
                                    if (!kotlin.jvm.internal.e0.areEqual(cls4, type) && !kotlin.jvm.internal.e0.areEqual(cls4, type) && !kotlin.jvm.internal.e0.areEqual(Double.class, type)) {
                                        Class cls5 = Float.TYPE;
                                        if (!kotlin.jvm.internal.e0.areEqual(cls5, type) && !kotlin.jvm.internal.e0.areEqual(cls5, type) && !kotlin.jvm.internal.e0.areEqual(Float.class, type)) {
                                            Class cls6 = Long.TYPE;
                                            if (!kotlin.jvm.internal.e0.areEqual(cls6, type) && !kotlin.jvm.internal.e0.areEqual(cls6, type) && !kotlin.jvm.internal.e0.areEqual(Long.class, type)) {
                                                Class cls7 = Byte.TYPE;
                                                if (!kotlin.jvm.internal.e0.areEqual(cls7, type) && !kotlin.jvm.internal.e0.areEqual(cls7, type) && !kotlin.jvm.internal.e0.areEqual(Byte.class, type)) {
                                                    if (!kotlin.jvm.internal.e0.areEqual(String.class, type) && !kotlin.jvm.internal.e0.areEqual(JSONObject.class, type) && !kotlin.jvm.internal.e0.areEqual(JSONArray.class, type)) {
                                                        Class cls8 = Short.TYPE;
                                                        if (!kotlin.jvm.internal.e0.areEqual(cls8, type) && !kotlin.jvm.internal.e0.areEqual(cls8, type) && !kotlin.jvm.internal.e0.areEqual(Short.class, type)) {
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                HashMap map = this.f33534a;
                                                                kotlin.jvm.internal.e0.checkNotNull(name);
                                                                if (((Xc) map.get(new Yc(name, cls))) instanceof C3054w7) {
                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                    Object obj2 = field.get(obj);
                                                                    if (obj2 != null) {
                                                                        Map map2 = (Map) obj2;
                                                                        for (Object obj3 : map2.keySet()) {
                                                                            kotlin.jvm.internal.e0.checkNotNullParameter(map2, "map");
                                                                            Object objA = map2.get(obj3);
                                                                            if (objA != null) {
                                                                                if (!C3036v6.b(objA.getClass()) && !C3036v6.a(objA.getClass())) {
                                                                                    objA = a(objA, (Class) objA.getClass());
                                                                                }
                                                                                jSONObject2.put(obj3.toString(), objA);
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONObject2);
                                                                } else {
                                                                    type.getClass();
                                                                }
                                                            } else if (List.class.isAssignableFrom(type)) {
                                                                HashMap map3 = this.f33534a;
                                                                kotlin.jvm.internal.e0.checkNotNull(name);
                                                                Object obj4 = map3.get(new Yc(name, cls));
                                                                kotlin.jvm.internal.e0.checkNotNull(obj4);
                                                                if (((Xc) obj4) instanceof C2682a7) {
                                                                    JSONArray jSONArray = new JSONArray();
                                                                    Object obj5 = field.get(obj);
                                                                    if (obj5 != null) {
                                                                        for (Object obj6 : (List) obj5) {
                                                                            if (obj6 != null) {
                                                                                JSONObject jSONObjectA = (C3036v6.b(obj6.getClass()) || C3036v6.a(obj6.getClass())) ? obj6 : a(obj6, (Class) obj6.getClass());
                                                                                if (jSONObjectA == null) {
                                                                                    obj6.getClass().toString();
                                                                                } else {
                                                                                    jSONArray.put(jSONObjectA);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    jSONObject.put(name, jSONArray);
                                                                } else {
                                                                    type.getClass();
                                                                }
                                                            } else {
                                                                Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    jSONObject.put(name, a(obj7, (Class) obj7.getClass()));
                                                                } else {
                                                                    type.getClass();
                                                                }
                                                            }
                                                        } else {
                                                            Object obj8 = field.get(obj);
                                                            kotlin.jvm.internal.e0.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                            jSONObject.put(name, (Short) obj8);
                                                        }
                                                    } else {
                                                        jSONObject.put(name, field.get(obj));
                                                    }
                                                } else {
                                                    Object obj9 = field.get(obj);
                                                    kotlin.jvm.internal.e0.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj9);
                                                }
                                            } else {
                                                Object obj10 = field.get(obj);
                                                kotlin.jvm.internal.e0.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj10).longValue());
                                            }
                                        } else {
                                            Object obj11 = field.get(obj);
                                            kotlin.jvm.internal.e0.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj11);
                                        }
                                    } else {
                                        Object obj12 = field.get(obj);
                                        kotlin.jvm.internal.e0.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj12).doubleValue());
                                    }
                                } else {
                                    Object obj13 = field.get(obj);
                                    kotlin.jvm.internal.e0.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj13).booleanValue());
                                }
                            } else {
                                Object obj14 = field.get(obj);
                                kotlin.jvm.internal.e0.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj14).intValue());
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject a(Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        return a(obj, (Class) obj.getClass());
    }

    public final Object a(JSONObject jsonObject, Class<Object> type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        return type.cast(a(jsonObject, type, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00ad: MOVE (r7 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:40:0x00ad */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b3 A[Catch: Exception -> 0x00ac, TryCatch #3 {Exception -> 0x00ac, blocks: (B:42:0x00b7, B:44:0x00bd, B:45:0x00cd, B:47:0x00db, B:52:0x00f8, B:55:0x0103, B:58:0x010c, B:60:0x0112, B:63:0x0124, B:65:0x012e, B:67:0x0134, B:70:0x0149, B:72:0x014f, B:74:0x0155, B:77:0x016b, B:79:0x0171, B:81:0x0177, B:84:0x018d, B:86:0x0193, B:88:0x0199, B:91:0x01af, B:93:0x01b5, B:95:0x01bb, B:98:0x01d1, B:100:0x01d9, B:102:0x01df, B:105:0x01f5, B:107:0x01fd, B:108:0x0206, B:110:0x020e, B:112:0x0214, B:115:0x0228, B:117:0x0230, B:120:0x0248, B:121:0x024d, B:123:0x0255, B:124:0x025e, B:128:0x026e, B:130:0x0284, B:132:0x028d, B:133:0x02ac, B:135:0x02b2, B:137:0x02d9, B:142:0x0301, B:138:0x02e4, B:141:0x02f1, B:143:0x0310, B:147:0x0322, B:148:0x032a, B:150:0x033a, B:152:0x034e, B:154:0x0354, B:156:0x036c, B:158:0x0381, B:167:0x03b6, B:166:0x03b3, B:160:0x038f, B:163:0x039a, B:168:0x03bb, B:169:0x03c0, B:171:0x03c6, B:37:0x00a8), top: B:260:0x001c }] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.json.JSONObject r25, java.lang.Class r26, java.lang.Object r27, java.lang.Object r28) throws java.lang.IllegalAccessException, org.json.JSONException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3053w6.a(org.json.JSONObject, java.lang.Class, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
