package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    public final Config f32532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32533b;

    /* renamed from: c, reason: collision with root package name */
    public T2 f32534c;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[PHI: r5
      0x0028: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:9:0x0021, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y2(org.json.JSONObject r9, com.inmobi.commons.core.configs.Config r10) throws org.json.JSONException {
        /*
            r8 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.e0.checkNotNullParameter(r10, r0)
            r8.<init>()
            r8.f32532a = r10
            r0 = -1
            r8.f32533b = r0
            if (r9 == 0) goto Lb9
            r1 = 2
            r2 = 0
            java.lang.String r2 = qm.zMPW.GalEuEfxjome.jWchjtbHoj     // Catch: org.json.JSONException -> L60
            int r2 = r9.getInt(r2)     // Catch: org.json.JSONException -> L60
            r3 = 304(0x130, float:4.26E-43)
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L2c
            if (r2 == r3) goto L2a
            r5 = 404(0x194, float:5.66E-43)
            if (r2 == r5) goto L28
            r5 = 500(0x1f4, float:7.0E-43)
            if (r2 == r5) goto L28
            goto L2d
        L28:
            r0 = r5
            goto L2d
        L2a:
            r0 = r3
            goto L2d
        L2c:
            r0 = r4
        L2d:
            r8.f32533b = r0     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "access$getTAG$cp(...)"
            java.lang.String r5 = "c3"
            if (r0 != r4) goto L8b
            java.lang.String r0 = "content"
            org.json.JSONObject r9 = r9.getJSONObject(r0)     // Catch: org.json.JSONException -> L60
            com.inmobi.media.I2 r0 = com.inmobi.commons.core.configs.Config.Companion     // Catch: org.json.JSONException -> L60
            java.lang.String r3 = r10.getType()     // Catch: org.json.JSONException -> L60
            kotlin.jvm.internal.e0.checkNotNull(r9)     // Catch: org.json.JSONException -> L60
            java.lang.String r10 = r10.getAccountId$media_release()     // Catch: org.json.JSONException -> L60
            long r6 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L60
            r0.getClass()     // Catch: org.json.JSONException -> L60
            com.inmobi.commons.core.configs.Config r9 = com.inmobi.media.I2.a(r3, r9, r10, r6)     // Catch: org.json.JSONException -> L60
            if (r9 != 0) goto L62
            com.inmobi.media.T2 r9 = new com.inmobi.media.T2     // Catch: org.json.JSONException -> L60
            java.lang.String r10 = "The received config has failed backend contract."
            r0 = 3
            r9.<init>(r0, r10)     // Catch: org.json.JSONException -> L60
            r8.f32534c = r9     // Catch: org.json.JSONException -> L60
            goto L64
        L60:
            r9 = move-exception
            goto La5
        L62:
            r8.f32532a = r9     // Catch: org.json.JSONException -> L60
        L64:
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)     // Catch: org.json.JSONException -> L60
            com.inmobi.commons.core.configs.Config r9 = r8.f32532a     // Catch: org.json.JSONException -> L60
            r9.getType()     // Catch: org.json.JSONException -> L60
            com.inmobi.commons.core.configs.Config r9 = r8.f32532a     // Catch: org.json.JSONException -> L60
            r9.isValid()     // Catch: org.json.JSONException -> L60
            com.inmobi.commons.core.configs.Config r9 = r8.f32532a     // Catch: org.json.JSONException -> L60
            boolean r9 = r9.isValid()     // Catch: org.json.JSONException -> L60
            if (r9 != 0) goto Lb9
            com.inmobi.media.T2 r9 = new com.inmobi.media.T2     // Catch: org.json.JSONException -> L60
            java.lang.String r10 = "The received config has failed validation."
            r9.<init>(r1, r10)     // Catch: org.json.JSONException -> L60
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)     // Catch: org.json.JSONException -> L60
            com.inmobi.commons.core.configs.Config r10 = r8.f32532a     // Catch: org.json.JSONException -> L60
            r10.getType()     // Catch: org.json.JSONException -> L60
            r8.f32534c = r9     // Catch: org.json.JSONException -> L60
            return
        L8b:
            if (r0 != r3) goto L94
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)     // Catch: org.json.JSONException -> L60
            r10.getType()     // Catch: org.json.JSONException -> L60
            return
        L94:
            com.inmobi.media.T2 r9 = new com.inmobi.media.T2     // Catch: org.json.JSONException -> L60
            java.lang.String r0 = "Internal error"
            r3 = 1
            r9.<init>(r3, r0)     // Catch: org.json.JSONException -> L60
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)     // Catch: org.json.JSONException -> L60
            r10.getType()     // Catch: org.json.JSONException -> L60
            r8.f32534c = r9     // Catch: org.json.JSONException -> L60
            return
        La5:
            com.inmobi.media.T2 r10 = new com.inmobi.media.T2
            java.lang.String r9 = r9.getLocalizedMessage()
            if (r9 != 0) goto Laf
            java.lang.String r9 = "Exception in config validation"
        Laf:
            r10.<init>(r1, r9)
            com.inmobi.commons.core.configs.Config r9 = r8.f32532a
            r9.getType()
            r8.f32534c = r10
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Y2.<init>(org.json.JSONObject, com.inmobi.commons.core.configs.Config):void");
    }
}
