package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import j1.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f40829a;

    /* renamed from: b, reason: collision with root package name */
    private int f40830b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, b> f40831c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f40832d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f40833a;

        /* renamed from: b, reason: collision with root package name */
        public String f40834b;

        /* renamed from: c, reason: collision with root package name */
        public long f40835c;

        public b(long j10, int i10, String str) {
            this.f40835c = j10;
            this.f40833a = i10;
            this.f40834b = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    public static class C0273c {

        /* renamed from: a, reason: collision with root package name */
        private static final c f40836a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0273c.f40836a;
    }

    private c() {
        this.f40829a = "IDErrorUtil";
        this.f40831c = new ConcurrentHashMap<>();
        this.f40832d = new ArrayList<>();
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.f40830b = gVarF.t() * 1000;
        if (gVarF.x() == null || gVarF.x().size() <= 0) {
            p0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f40832d.addAll(a());
        } else {
            p0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f40832d.addAll(gVarF.x());
        }
    }

    public synchronized void a(String str, int i10, String str2, long j10) {
        if (this.f40831c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f40832d.contains(Integer.valueOf(i10))) {
            p0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f40831c.put(str, new b(j10, i10, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(C3191e4.i.f36529d, "").replace(C3191e4.i.f36531e, "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return a(str, str4, str3, eVar.a().get("token"), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str3);
        sb2.append("_");
        sb2.append(str2);
        String strO = o2.o(sb2, "_", str5);
        b bVarA = a(strO);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.f40834b)) {
            try {
                if (bVarA.f40833a != -1) {
                    return e.a(new JSONObject(bVarA.f40834b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f40834b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i10 = Integer.parseInt(str5)) != 287 && i10 != 94) {
                    if (System.currentTimeMillis() < (h.b().c(str, str2).u() * 1000) + bVarA.f40835c) {
                        return e.a(new JSONObject(bVarA.f40834b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f40834b.getBytes(), arrayList));
                    }
                    this.f40831c.remove(strO);
                    return null;
                }
            } catch (Exception e10) {
                p0.b("IDErrorUtil", e10.getMessage());
            }
        }
        p0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        p0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f40831c.containsKey(str) || (bVar = this.f40831c.get(str)) == null) {
            return null;
        }
        if (bVar.f40833a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f40835c + this.f40830b) {
            this.f40831c.remove(str);
            if (this.f40831c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f40831c.entrySet()) {
                    p0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f40835c > this.f40830b) {
                        this.f40831c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        p0.b("IDErrorUtil", "getErrorInfo : " + bVar.f40834b);
        return bVar;
    }
}
