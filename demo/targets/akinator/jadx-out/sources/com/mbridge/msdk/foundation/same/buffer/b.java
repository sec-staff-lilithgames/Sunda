package com.mbridge.msdk.foundation.same.buffer;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.c;
import com.mbridge.msdk.foundation.entity.d;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40735a = "b";

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, c>> f40739e;

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f40740f;

    /* renamed from: g, reason: collision with root package name */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f40741g;

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40736b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40737c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40738d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40742h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40743i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40744j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40745k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, Long> f40746l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40747m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> f40748n = new HashMap();

    public static void a(String str, String str2, String str3, long j10, long j11, long j12, String str4) {
        if (f40739e == null) {
            f40739e = new ConcurrentHashMap<>();
        }
        try {
            if (!f40739e.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str3);
                ConcurrentHashMap<String, c> concurrentHashMap = new ConcurrentHashMap<>();
                c cVar = new c();
                cVar.a(arrayList);
                cVar.a(j10);
                cVar.b(j11);
                cVar.c(j12);
                cVar.c(str4);
                concurrentHashMap.put(str2, cVar);
                f40739e.put(str, concurrentHashMap);
                return;
            }
            ConcurrentHashMap<String, c> concurrentHashMap2 = f40739e.get(str);
            if (concurrentHashMap2 != null) {
                c cVar2 = concurrentHashMap2.get(str2);
                if (cVar2 != null) {
                    if (cVar2.c() != null) {
                        cVar2.a(j10);
                        cVar2.b(j11);
                        cVar2.c(j12);
                        cVar2.c().add(str3);
                        cVar2.c(str4);
                        return;
                    }
                    return;
                }
                c cVar3 = new c();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                cVar3.a(arrayList2);
                cVar3.a(j10);
                cVar3.b(j11);
                cVar3.c(j12);
                cVar3.c(str4);
                concurrentHashMap2.put(str2, cVar3);
            }
        } catch (Throwable th2) {
            p0.b(f40735a, th2.getMessage());
        }
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> b(String str) {
        str.getClass();
        switch (str) {
            case "banner":
                return f40737c;
            case "native":
                return f40744j;
            case "reward":
                return f40745k;
            case "splash":
                return f40747m;
            case "h5_native":
                return f40738d;
            case "interstitial":
                return f40743i;
            case "interactive":
                return f40742h;
            default:
                return null;
        }
    }

    public static ConcurrentHashMap<String, c> c(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap = f40739e;
        if (concurrentHashMap == null) {
            e eVarA = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
            if (eVarA != null) {
                eVarA.b(str, "");
                f40739e = new ConcurrentHashMap<>();
                return null;
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f40739e.get(str);
        }
        return null;
    }

    public static String d(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f40741g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f40741g.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static void e(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f40741g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f40741g.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap;
        c cVarRemove;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f40739e) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f40739e.remove(str);
            return;
        }
        ConcurrentHashMap<String, c> concurrentHashMap2 = f40739e.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2) || (cVarRemove = concurrentHashMap2.remove(str2)) == null) {
            return;
        }
        try {
            String strD = cVarRemove.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Iterator<Map.Entry<String, c>> it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                if (strD.equals(it.next().getValue().d())) {
                    it.remove();
                }
            }
        } catch (Exception e10) {
            p0.a(f40735a, e10.getMessage());
        }
    }

    public static void d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f40740f;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f40740f.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e10) {
            p0.a(f40735a, e10.getMessage());
        }
    }

    public static d b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        d dVar = new d();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f40740f;
                if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f40740f.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                    dVar.a(1);
                    dVar.c(concurrentHashMap.get(str2));
                    return dVar;
                }
            } catch (Exception e10) {
                p0.a(f40735a, e10.getMessage());
                return dVar;
            }
        }
        return dVar;
    }

    public static void a(String str, String str2, int i10) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f40741g == null) {
            f40741g = new ConcurrentHashMap<>();
        }
        try {
            if (f40741g.containsKey(str)) {
                copyOnWriteArrayList = f40741g.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f40741g.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i10;
            if (size >= 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    copyOnWriteArrayList.remove(i11);
                }
            }
        } catch (Exception e10) {
            p0.a(f40735a, e10.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f40740f == null) {
                f40740f = new ConcurrentHashMap<>();
            }
            if (f40740f.containsKey(str)) {
                if (f40740f.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f40740f.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f40740f.put(str, concurrentHashMap2);
        } catch (Exception e10) {
            p0.a(f40735a, e10.getMessage());
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> mapB;
        List<com.mbridge.msdk.foundation.same.metadata.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            mapB = a(str);
        } else {
            mapB = b(str2);
        }
        if (mapB != null) {
            try {
                if (z0.b(str) && mapB.containsKey(str) && (list = mapB.get(str)) != null && list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", list.get(i10).a());
                        jSONObject.put("1", list.get(i10).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> a(String str) {
        if (f40744j.containsKey(str)) {
            return f40744j;
        }
        if (f40745k.containsKey(str)) {
            return f40745k;
        }
        if (f40742h.containsKey(str)) {
            return f40742h;
        }
        if (f40748n.containsKey(str)) {
            return f40748n;
        }
        if (f40743i.containsKey(str)) {
            return f40743i;
        }
        if (f40737c.containsKey(str)) {
            return f40737c;
        }
        if (f40747m.containsKey(str)) {
            return f40747m;
        }
        if (f40738d.containsKey(str)) {
            return f40738d;
        }
        return null;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.metadata.a>> mapB = b(str2);
        if (campaignEx == null || mapB == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.metadata.a aVar = new com.mbridge.msdk.foundation.same.metadata.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (mapB.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.metadata.a> list = mapB.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            mapB.put(str, arrayList);
        } catch (Throwable th2) {
            p0.b(f40735a, th2.getMessage(), th2);
        }
    }
}
