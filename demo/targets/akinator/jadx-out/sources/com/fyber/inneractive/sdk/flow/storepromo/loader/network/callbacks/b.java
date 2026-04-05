package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f23856a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b f23857b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23858c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23859d;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar) {
        this.f23857b = bVar;
        this.f23858c = str;
        this.f23856a = gVar;
        this.f23859d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r7, java.lang.Exception r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            r0 = 1
            if (r7 == 0) goto L38
            if (r8 != 0) goto L38
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r8 = r6.f23856a
            com.fyber.inneractive.sdk.flow.storepromo.model.b r1 = r6.f23857b
            int r2 = r6.f23859d
            r8.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r4 = "StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r3)
            com.fyber.inneractive.sdk.flow.storepromo.model.c r3 = r8.f23827d
            com.fyber.inneractive.sdk.flow.storepromo.model.a r4 = new com.fyber.inneractive.sdk.flow.storepromo.model.a
            r4.<init>(r7, r1, r2)
            java.util.ArrayList r7 = r3.f23866a
            r7.add(r4)
            com.fyber.inneractive.sdk.flow.storepromo.model.b r7 = com.fyber.inneractive.sdk.flow.storepromo.model.b.SCREENSHOT
            if (r1 != r7) goto L33
            int r7 = r3.f23874i
            int r7 = r7 + r0
            r3.f23874i = r7
        L33:
            r7 = 0
            r8.a(r7, r9, r7, r7)
            return
        L38:
            boolean r7 = r8 instanceof com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a
            if (r7 == 0) goto L3f
            com.fyber.inneractive.sdk.flow.storepromo.events.a r7 = com.fyber.inneractive.sdk.flow.storepromo.events.a.FILE_SIZE_EXCEEDS_LIMIT
            goto L41
        L3f:
            com.fyber.inneractive.sdk.flow.storepromo.events.a r7 = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR
        L41:
            com.fyber.inneractive.sdk.flow.storepromo.model.b r1 = r6.f23857b
            if (r8 == 0) goto L55
            java.lang.String r2 = r8.getMessage()
            if (r2 == 0) goto L50
            java.lang.String r8 = r8.getMessage()
            goto L57
        L50:
            java.lang.String r8 = r8.toString()
            goto L57
        L55:
            java.lang.String r8 = ""
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable download store promo asset type: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", error: "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r1 = r6.f23856a
            java.lang.String r2 = r6.f23858c
            com.fyber.inneractive.sdk.flow.storepromo.model.b r3 = r6.f23857b
            int[] r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.a.f23855a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 2
            if (r3 == r0) goto L92
            if (r3 == r4) goto L8f
            r5 = 3
            if (r3 == r5) goto L8c
            r5 = 4
            if (r3 == r5) goto L89
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.UNKNOWN_FAILURE
            goto L94
        L89:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.RATING_ICON_FAILURE
            goto L94
        L8c:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.VIDEO_FAILURE
            goto L94
        L8f:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE
            goto L94
        L92:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.APP_ICON_FAILURE
        L94:
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r5 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE
            if (r3 != r5) goto La2
            int r3 = r1.f23829f
            int r5 = r1.f23830g
            int r5 = r5 + r0
            r1.f23830g = r5
            int r3 = r3 - r5
            if (r3 >= r4) goto La3
        La2:
            r9 = r0
        La3:
            r1.a(r7, r9, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b.a(java.lang.Object, java.lang.Exception, boolean):void");
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, String str, g gVar, int i10) {
        this.f23857b = bVar;
        this.f23858c = str;
        this.f23856a = gVar;
        this.f23859d = i10;
    }
}
