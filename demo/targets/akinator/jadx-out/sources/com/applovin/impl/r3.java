package com.applovin.impl;

import com.applovin.impl.p3;
import com.applovin.impl.q3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r3 {

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f15181d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f15182e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f15183f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f15184g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap f15185h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f15186i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f15187a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f15188b = a(o3.f14949h8);

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f15189c = a(o3.g8);

    public r3(com.applovin.impl.sdk.k kVar) {
        this.f15187a = kVar;
        a((String) y4.a(x4.J, (Object) null, com.applovin.impl.sdk.k.o()), q3.a.AD_UNIT_ID);
        a((String) y4.a(x4.K, (Object) null, com.applovin.impl.sdk.k.o()), q3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l9, Long l10) {
        return l9;
    }

    private JSONObject a(v4 v4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f15187a.a(v4Var), new JSONObject());
    }

    private Map b(p3 p3Var, q3 q3Var, p3.b bVar) {
        if (!a(p3Var, q3Var, bVar) || !b(p3Var, q3Var)) {
            return null;
        }
        String strB = q3Var.b();
        HashMap mapA = a(q3Var.a());
        Object objB = b(q3Var.a());
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                if (q3Var instanceof n3) {
                    a((n3) q3Var, mapA);
                }
                HashMap map2 = (HashMap) mapA.get(strB);
                if (map2 == null) {
                    map2 = new HashMap();
                    mapA.put(strB, map2);
                }
                Iterator it = p3Var.b().iterator();
                while (it.hasNext()) {
                    String strB2 = ((p3.a) it.next()).b();
                    HashMap map3 = (HashMap) map2.get(strB2);
                    if (map3 == null) {
                        map3 = new HashMap();
                        map2.put(strB2, map3);
                    }
                    Object objA = bVar.a(map3.get(p3Var));
                    map3.put(p3Var, objA);
                    map.put(strB2, objA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Boolean bool = (Boolean) this.f15187a.a(o3.f14953j8);
        if (p3Var.a(p3.a.INSTALL) && bool.booleanValue()) {
            b(q3Var);
        }
        return map;
    }

    private x4 c(q3.a aVar) {
        if (aVar == q3.a.AD_UNIT_ID) {
            return x4.J;
        }
        if (aVar == q3.a.AD_FORMAT) {
            return x4.K;
        }
        return null;
    }

    public Map a(p3 p3Var, q3 q3Var) {
        return b(p3Var, q3Var, new cf.a(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l9) {
        return Long.valueOf(l9 != null ? 1 + l9.longValue() : 1L);
    }

    public void a(p3 p3Var, q3 q3Var, Long l9) {
        b(p3Var, q3Var, new q9(l9, 3));
    }

    public Map a(p3 p3Var, q3.a aVar) {
        return a(p3Var, aVar, p3.a.SESSION);
    }

    private Map a(p3 p3Var, q3.a aVar, p3.a aVar2) {
        HashMap mapA = a(aVar);
        Object objB = b(aVar);
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                for (String str : mapA.keySet()) {
                    HashMap map2 = (HashMap) mapA.get(str);
                    String strB = aVar2.b();
                    if (map2 != null && map2.containsKey(strB)) {
                        HashMap map3 = (HashMap) map2.get(strB);
                        if (aVar == q3.a.AD) {
                            map.put(g3.a(str).b(), map3.get(p3Var));
                        } else {
                            map.put(str, map3.get(p3Var));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private void a(n3 n3Var, Map map) {
        MaxAdFormat maxAdFormatA = n3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.f15189c, maxAdFormatA.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (g3.a((String) it.next()).a().equals(maxAdFormatA)) {
                i10++;
            }
        }
        if (i10 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i10 >= integer.intValue()) {
            if (g3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(maxAdFormatA)) {
                it2.remove();
                i10--;
            }
        }
    }

    private Object b(q3.a aVar) {
        if (aVar == q3.a.AD_UNIT_ID) {
            return f15182e;
        }
        if (aVar == q3.a.AD_FORMAT) {
            return f15184g;
        }
        return f15186i;
    }

    private boolean b(p3 p3Var, q3 q3Var) {
        Iterator<String> itKeys = this.f15188b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(q3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(b0.e2.t(this.f15188b, next), p3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(q3.a aVar) {
        if (aVar == q3.a.AD_UNIT_ID) {
            return f15181d;
        }
        if (aVar == q3.a.AD_FORMAT) {
            return f15183f;
        }
        return f15185h;
    }

    private boolean a(p3 p3Var, q3 q3Var, p3.b bVar) {
        if (p3Var == null) {
            this.f15187a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f15187a.O().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (q3Var == null) {
            this.f15187a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f15187a.O().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f15187a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f15187a.O().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private void b(q3 q3Var) {
        x4 x4VarC = c(q3Var.a());
        if (x4VarC == null) {
            return;
        }
        y4.b(x4VarC, a((Map) a(q3Var)), com.applovin.impl.sdk.k.o());
    }

    private HashMap a(q3 q3Var) {
        HashMap map = new HashMap();
        HashMap mapA = a(q3Var.a());
        synchronized (b(q3Var.a())) {
            try {
                for (Map.Entry entry : mapA.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap map2 = (HashMap) entry.getValue();
                    if (!CollectionUtils.isEmpty(map2)) {
                        HashMap map3 = (HashMap) map2.get(p3.a.INSTALL.b());
                        if (!CollectionUtils.isEmpty(map3)) {
                            map.put(str, new HashMap(map3));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                p3 p3Var = (p3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, p3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, q3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapA = a(aVar);
            Object objB = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objB) {
                try {
                    for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                        String key = entry.getKey();
                        HashMap map = new HashMap();
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            p3 p3VarA = p3.a((String) entry2.getKey());
                            if (p3VarA != null) {
                                map.put(p3VarA, a(entry2.getValue()));
                            }
                        }
                        if (!CollectionUtils.isEmpty(map)) {
                            HashMap map2 = new HashMap();
                            map2.put(p3.a.INSTALL.b(), map);
                            mapA.put(key, map2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
