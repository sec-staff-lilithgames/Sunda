package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.C3191e4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14000a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14001b = com.applovin.impl.sdk.k.o();

    /* renamed from: c, reason: collision with root package name */
    private String f14002c;

    public g4(com.applovin.impl.sdk.k kVar) {
        this.f14000a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() throws IOException {
        if (this.f14002c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f14001b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f14002c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb2.append(line);
                    }
                } catch (IOException e10) {
                    Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                }
            } catch (Throwable th2) {
                try {
                    Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th2);
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f14000a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14000a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f14001b);
        this.f14000a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f14000a.O();
            StringBuilder sb2 = new StringBuilder("Init ");
            sb2.append(d() ? "succeeded" : C3191e4.h.f36509t);
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            b0.e2.B(sb2, "ms", oVarO, "OpenMeasurementService");
        }
        h();
    }

    private void h() {
        this.f14000a.r0().a((g5) new p6(this.f14000a, "OpenMeasurementService", new e9(this, 0)), b6.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f14000a.o0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f14000a.a(v4.f15904d0)).booleanValue()) {
            this.f14000a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14000a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            AppLovinSdkUtils.runOnUiThread(new e9(this, 1));
        }
    }

    public String a() {
        return this.f14002c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f14000a.a(v4.f15912e0), AppLovinSdk.VERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.applovin.impl.sdk.k r0 = r3.f14000a     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = com.applovin.impl.h4.a(r0, r5)     // Catch: java.lang.Throwable -> L17
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r5, r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r5 = move-exception
            goto L21
        L19:
            r5 = r4
        L1a:
            java.lang.String r0 = r3.f14002c     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L17
            return r4
        L21:
            com.applovin.impl.sdk.k r0 = r3.f14000a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L39
            com.applovin.impl.sdk.k r0 = r3.f14000a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.String r1 = "OpenMeasurementService"
            java.lang.String r2 = "Failed to inject JavaScript SDK into HTML"
            r0.a(r1, r2, r5)
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.g4.a(java.lang.String, java.util.Map):java.lang.String");
    }
}
