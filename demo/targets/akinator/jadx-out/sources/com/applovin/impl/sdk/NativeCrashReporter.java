package com.applovin.impl.sdk;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.amazon.device.ads.DTBMetricReport;
import com.applovin.impl.k7;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class NativeCrashReporter implements g.d {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f15290b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f15291c;

    /* renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f15292d = new NativeCrashReporter();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f15293a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(v4.f15988n4)).booleanValue() && !k7.k(k.o())) {
            if (f15291c) {
                try {
                    g gVarL = kVar.l();
                    NativeCrashReporter nativeCrashReporter = f15292d;
                    gVarL.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th2) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    kVar.E().a("NativeCrashReporter", "disableInstance", th2);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = kVar.c(v4.f15996o4);
            int[] iArr = new int[listC.size()];
            for (int i10 = 0; i10 < listC.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) listC.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f15292d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) kVar.a(v4.f16004p4)).booleanValue());
                if (((Boolean) kVar.a(v4.f16012q4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(g.c.LOADING);
                    hashSet.add(g.c.LOAD);
                    hashSet.add(g.c.SHOW);
                    hashSet.add(g.c.CLICK);
                    hashSet.add(g.c.SHOW_ERROR);
                    hashSet.add(g.c.DESTROY);
                    kVar.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th3) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th3);
                }
                kVar.E().a("NativeCrashReporter", OIPXcgrVyyxoLF.SfCPuy, th3);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!f15290b) {
            f15290b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f15291c = true;
            } catch (Throwable th2) {
                o.b("NativeCrashReporter", "Failed to load native crash reporter library", th2);
            }
        }
        return f15291c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.io.File r16, com.applovin.impl.sdk.k r17) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(g.b bVar) {
        String strH = bVar.h();
        if (bVar.i() == g.c.DESTROY) {
            this.f15293a.remove(strH);
        } else if (this.f15293a.containsKey(strH)) {
            JsonUtils.putString((JSONObject) this.f15293a.get(strH), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, "network_name", bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, DTBMetricReport.ADAPTER_VERSION, bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, CampaignEx.JSON_KEY_CREATIVE_ID, bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.f15293a.put(strH, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.f15293a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
