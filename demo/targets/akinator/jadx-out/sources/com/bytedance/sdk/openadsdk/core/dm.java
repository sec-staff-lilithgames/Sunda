package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class dm {
    private static volatile dm jpo;

    /* renamed from: jd, reason: collision with root package name */
    private Map<String, Map<String, String>> f20288jd = new ConcurrentHashMap();

    private dm() {
    }

    public static dm jpo() {
        if (jpo == null) {
            synchronized (dm.class) {
                try {
                    if (jpo == null) {
                        jpo = new dm();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public boolean jd(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f20288jd;
        if (map2 == null || !map2.containsKey(str) || (map = this.f20288jd.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean wqx(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f20288jd;
        if (map2 == null || !map2.containsKey(str) || (map = this.f20288jd.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void jpo(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f20288jd;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f20288jd.put(str, concurrentHashMap);
    }

    public String jpo(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f20288jd;
        if (map2 == null || !map2.containsKey(str) || (map = this.f20288jd.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void jpo(String str) {
        Map<String, Map<String, String>> map = this.f20288jd;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f20288jd.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f20288jd.remove(str);
        }
    }
}
