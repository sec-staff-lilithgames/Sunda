package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3091ya extends AbstractC3074xa {

    /* renamed from: b, reason: collision with root package name */
    public Partner f33607b = Partner.createPartner("Inmobi", "a" + sv.k0.replace$default("10.8.8", ".", "", false, 4, (Object) null));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x0017, B:10:0x0012), top: B:15:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.inmobi.commons.core.configs.AdConfig r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L12
            com.inmobi.commons.core.configs.AdConfig$ViewabilityConfig r10 = r10.getViewability()     // Catch: java.lang.Exception -> Lf
            if (r10 == 0) goto L12
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r10 = r10.getOmidConfig()     // Catch: java.lang.Exception -> Lf
            if (r10 != 0) goto L17
            goto L12
        Lf:
            r0 = move-exception
            r10 = r0
            goto L40
        L12:
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r10 = new com.inmobi.commons.core.configs.AdConfig$OmidConfig     // Catch: java.lang.Exception -> Lf
            r10.<init>()     // Catch: java.lang.Exception -> Lf
        L17:
            java.lang.String r0 = r10.getPartnerKey()     // Catch: java.lang.Exception -> Lf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = "a"
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = "10.8.8"
            java.lang.String r4 = "."
            java.lang.String r5 = ""
            r7 = 4
            r8 = 0
            r6 = 0
            java.lang.String r2 = sv.k0.replace$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lf
            r1.append(r2)     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lf
            com.iab.omid.library.inmobi.adsession.Partner r0 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r0, r1)     // Catch: java.lang.Exception -> Lf
            r9.f33607b = r0     // Catch: java.lang.Exception -> Lf
            com.inmobi.media.AbstractC2989sa.a(r10)     // Catch: java.lang.Exception -> Lf
            return
        L40:
            com.inmobi.media.Y5 r0 = com.inmobi.media.Y5.f32563a
            java.lang.String r0 = "event"
            com.inmobi.media.h2 r10 = com.inmobi.media.C5.a(r10, r0)
            com.inmobi.media.K6 r0 = com.inmobi.media.Y5.f32566d
            r0.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3091ya.a(com.inmobi.commons.core.configs.AdConfig):void");
    }
}
