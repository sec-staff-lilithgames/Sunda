package com.apm.insight.runtime;

import android.content.Context;
import com.amazon.device.ads.DTBMetricReport;
import com.apm.insight.l.c;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f13301a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f13302b;

    /* renamed from: c, reason: collision with root package name */
    private int f13303c;

    /* renamed from: d, reason: collision with root package name */
    private int f13304d;

    public f(Context context) {
        this.f13302b = null;
        this.f13303c = 50;
        this.f13304d = 100;
        this.f13301a = context;
        this.f13302b = b();
        this.f13303c = a.a(this.f13303c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f13304d = a.a(this.f13304d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f13301a);
        HashMap<String, Long> map = new HashMap<>();
        map.put(DTBMetricReport.TIME, Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    File fileG = com.apm.insight.l.j.g(this.f13301a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put(DTBMetricReport.TIME, lDecode);
                    for (int i10 = 1; i10 < jSONArrayA.length(); i10++) {
                        String[] strArrSplit = jSONArrayA.optString(i10, "").split(" ");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return map;
    }

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f13302b;
        Long lRemove = map.remove(DTBMetricReport.TIME);
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lRemove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f13301a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return c.AnonymousClass1.a(this.f13302b, str, 1L).longValue() < ((long) this.f13303c) && c.AnonymousClass1.a(this.f13302b, "all", 1L).longValue() < ((long) this.f13304d);
    }
}
