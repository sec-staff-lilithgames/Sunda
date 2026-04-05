package yl;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements ar.f {
    @Override // ar.f
    public ar.d createHtmlMeasurer(Context context, String str, Map<String, String> map) {
        if (str.equalsIgnoreCase("om") && fn.t.isInitialized()) {
            return new c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ar.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ar.g createVideoMeasurer(android.content.Context r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            java.lang.String r7 = "om"
            boolean r7 = r8.equalsIgnoreCase(r7)
            r8 = 0
            if (r7 == 0) goto Laa
            boolean r7 = fn.t.isInitialized()
            if (r7 == 0) goto Laa
            if (r9 == 0) goto Laa
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L19
            goto Laa
        L19:
            java.lang.String r7 = "verifications"
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L29
        L27:
            r7 = r8
            goto L80
        L29:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L27
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L27
            int r7 = r0.length()     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L35
            goto L27
        L35:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
        L3b:
            int r2 = r0.length()
            if (r1 >= r2) goto L80
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            if (r2 != 0) goto L48
            goto L7d
        L48:
            java.lang.String r3 = "java_script_resource_url"
            java.lang.String r3 = r2.optString(r3)
            java.lang.String r4 = "vendor"
            java.lang.String r4 = r2.optString(r4)
            java.lang.String r5 = "verification_parameters"
            java.lang.String r2 = r2.optString(r5)
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L70
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L70
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L72
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L70
            if (r3 != 0) goto L72
            com.iab.omid.library.appodeal.adsession.VerificationScriptResource r2 = com.iab.omid.library.appodeal.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(r4, r5, r2)     // Catch: java.lang.Throwable -> L70
            goto L76
        L70:
            r2 = move-exception
            goto L7a
        L72:
            com.iab.omid.library.appodeal.adsession.VerificationScriptResource r2 = com.iab.omid.library.appodeal.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(r5)     // Catch: java.lang.Throwable -> L70
        L76:
            r7.add(r2)     // Catch: java.lang.Throwable -> L70
            goto L7d
        L7a:
            nm.a.w(r2)
        L7d:
            int r1 = r1 + 1
            goto L3b
        L80:
            if (r7 == 0) goto Laa
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L89
            goto Laa
        L89:
            java.lang.String r0 = "skip_offset"
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L98
            goto La4
        L98:
            long r0 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> La4
            float r9 = (float) r0     // Catch: java.lang.Throwable -> La4
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r0
            java.lang.Float r8 = java.lang.Float.valueOf(r9)     // Catch: java.lang.Throwable -> La4
        La4:
            yl.u r9 = new yl.u
            r9.<init>(r7, r8)
            return r9
        Laa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.a.createVideoMeasurer(android.content.Context, java.lang.String, java.util.Map):ar.g");
    }
}
