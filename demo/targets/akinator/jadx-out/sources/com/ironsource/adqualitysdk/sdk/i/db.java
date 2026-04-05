package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class db extends da {
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m2184(List<Object> list) {
        if (list.get(0) instanceof Class) {
            return hu.m2670().m2672().m2723((Class) da.m2180(list, 0, Class.class), (String) da.m2180(list, 1, String.class));
        }
        Object objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
        if (list.get(1) instanceof List) {
            return hu.m2670().m2672().m2720(objM2180, new JSONArray((Collection) da.m2180(list, 1, List.class)));
        }
        if (list.get(1) instanceof JSONArray) {
            return hu.m2670().m2672().m2720(objM2180, (JSONArray) da.m2180(list, 1, JSONArray.class));
        }
        return hu.m2670().m2672().m2719(objM2180, (String) da.m2180(list, 1, String.class));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m2185(List<Object> list) {
        Object objM2180;
        Class<?> cls;
        hm hmVar;
        Object objM21802;
        hm hmVar2;
        Object objM21803;
        int size = list.size();
        Object objM21804 = null;
        Class<?> cls2 = null;
        if (size != 2) {
            if (size == 3) {
                if (list.get(0) instanceof Class) {
                    cls = (Class) da.m2180(list, 0, Class.class);
                    if (list.get(1) instanceof hm) {
                        hmVar2 = (hm) da.m2180(list, 1, hm.class);
                        objM21803 = da.m2180(list, 2, (Class<Object>) Object.class);
                    } else {
                        objM2180 = da.m2180(list, 1, (Class<Object>) Object.class);
                        hmVar = (hm) da.m2180(list, 2, hm.class);
                    }
                } else {
                    objM21804 = da.m2180(list, 0, (Class<Object>) Object.class);
                    cls = objM21804.getClass();
                    hmVar2 = (hm) da.m2180(list, 1, hm.class);
                    objM21803 = da.m2180(list, 2, (Class<Object>) Object.class);
                }
                Class<?> cls3 = cls;
                objM21802 = objM21803;
                hmVar = hmVar2;
                objM2180 = objM21804;
                cls2 = cls3;
            } else if (size != 4) {
                hmVar = null;
                objM21802 = null;
                objM2180 = null;
            } else {
                cls2 = (Class) da.m2180(list, 0, Class.class);
                Object objM21805 = da.m2180(list, 1, (Class<Object>) Object.class);
                hm hmVar3 = (hm) da.m2180(list, 2, hm.class);
                objM21802 = da.m2180(list, 3, (Class<Object>) Object.class);
                hmVar = hmVar3;
                objM2180 = objM21805;
            }
            hu.m2670().m2672();
            return hy.m2715(cls2, objM2180, hmVar, objM21802);
        }
        if (list.get(0) instanceof Class) {
            cls = (Class) da.m2180(list, 0, Class.class);
            objM2180 = null;
        } else {
            Object objM21806 = da.m2180(list, 0, (Class<Object>) Object.class);
            if (objM21806 != null) {
                objM2180 = objM21806;
                cls = objM21806.getClass();
            } else {
                objM2180 = objM21806;
                cls = null;
            }
        }
        hmVar = (hm) da.m2180(list, 1, hm.class);
        cls2 = cls;
        objM21802 = null;
        hu.m2670().m2672();
        return hy.m2715(cls2, objM2180, hmVar, objM21802);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m2186(List<Object> list) {
        Object objM2180;
        hm hmVar;
        Class<?> cls;
        int size = list.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object objM21802 = null;
        if (size == 2) {
            if (list.get(0) instanceof Class) {
                cls2 = (Class) da.m2180(list, 0, Class.class);
                objM2180 = null;
            } else {
                objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
                if (objM2180 != null) {
                    cls2 = objM2180.getClass();
                }
            }
            hmVar = (hm) da.m2180(list, 1, hm.class);
        } else if (size != 3) {
            hmVar = null;
            objM2180 = null;
        } else {
            if (list.get(0) instanceof Class) {
                cls = (Class) da.m2180(list, 0, Class.class);
                if (list.get(1) instanceof hm) {
                    hmVar = (hm) da.m2180(list, 1, hm.class);
                } else {
                    objM21802 = da.m2180(list, 1, (Class<Object>) Object.class);
                    hmVar = (hm) da.m2180(list, 2, hm.class);
                }
            } else {
                objM21802 = da.m2180(list, 0, (Class<Object>) Object.class);
                cls = objM21802.getClass();
                hmVar = (hm) da.m2180(list, 1, hm.class);
            }
            Object obj = objM21802;
            cls2 = cls;
            objM2180 = obj;
        }
        hu.m2670().m2672();
        return hy.m2706(cls2, objM2180, hmVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static cq.b m2187(List<Object> list) {
        return new cq.b((List) da.m2180(list, 0, List.class), ((Integer) da.m2180(list, 1, Integer.class)).intValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<hs> m2188(final ds dsVar, final cp cpVar, List<Object> list) {
        Object objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
        final cq cqVar = (cq) da.m2180(list, 1, cq.class);
        final List<Object> listM2182 = da.m2182(list, 2);
        if (cqVar == null) {
            return null;
        }
        return hu.m2670().m2672().m2724(objM2180, cqVar.m2066(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.db.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final boolean mo2192(hs hsVar) {
                return cqVar.m2065().m1923(hsVar, dsVar, cpVar, listM2182);
            }
        }));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m2191(ds dsVar, cp cpVar, List<Object> list) {
        hs hsVarM2190 = m2190(dsVar, cpVar, list);
        if (hsVarM2190 != null) {
            return hsVarM2190.mo2643();
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final <T> hs<T> m2190(final ds dsVar, final cp cpVar, List<Object> list) {
        Object objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
        final cq cqVar = (cq) da.m2180(list, 1, cq.class);
        final List<Object> listM2182 = da.m2182(list, 2);
        if (cqVar == null) {
            return null;
        }
        return hu.m2670().m2672().m2722(objM2180, cqVar.m2066(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.db.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* renamed from: ﾇ */
            public final boolean mo2192(hs hsVar) {
                return cqVar.m2065().m1923(hsVar, dsVar, cpVar, listM2182);
            }
        }));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<Object> m2189(ds dsVar, cp cpVar, List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (hs hsVar : m2188(dsVar, cpVar, list)) {
            if (hsVar != null) {
                arrayList.add(hsVar.mo2643());
            }
        }
        return arrayList;
    }
}
