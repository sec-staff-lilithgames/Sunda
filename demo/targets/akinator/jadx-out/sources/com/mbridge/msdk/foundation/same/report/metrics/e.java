package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f41002a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f41002a.put(str, (String) obj);
            } else {
                this.f41002a.put(str, obj + "");
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f41002a.get(str);
    }

    public void c(String str) {
        if (this.f41002a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f41002a.remove(str);
    }

    public boolean a(String str) {
        return this.f41002a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f41002a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f41002a) == null || (map2 = this.f41002a) == null) {
            return;
        }
        map2.putAll(map);
    }
}
