package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f23860a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23861b = false;

    /* renamed from: c, reason: collision with root package name */
    public final String f23862c;

    public c(g gVar, String str) {
        this.f23860a = gVar;
        this.f23862c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r6, java.lang.Exception r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r5.f23861b
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = "StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached"
            com.fyber.inneractive.sdk.util.IAlog.a(r7, r6)
            return
        Lf:
            java.lang.String r0 = "StorePromoTemplateCallback: onNetworkResult: fromCache: "
            java.lang.String r8 = j1.o2.n(r0, r8)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r8, r0)
            r8 = 1
            r5.f23861b = r8
            if (r6 == 0) goto L36
            if (r7 != 0) goto L36
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r7 = r5.f23860a
            r7.getClass()
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "StorePromoResourcesLoader: onTemplateDownloaded"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r8)
            com.fyber.inneractive.sdk.flow.storepromo.model.c r8 = r7.f23827d
            r8.f23868c = r6
            r6 = 0
            r7.a(r6, r1, r6, r6)
            return
        L36:
            if (r7 == 0) goto L48
            java.lang.String r6 = r7.getMessage()
            if (r6 == 0) goto L43
            java.lang.String r6 = r7.getMessage()
            goto L4a
        L43:
            java.lang.String r6 = r7.toString()
            goto L4a
        L48:
            java.lang.String r6 = ""
        L4a:
            java.lang.String r7 = "Unable download store promo template, error: "
            java.lang.String r6 = a.b.k(r7, r6)
            com.fyber.inneractive.sdk.flow.storepromo.loader.g r7 = r5.f23860a
            com.fyber.inneractive.sdk.flow.storepromo.events.a r0 = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR
            java.lang.String r2 = r5.f23862c
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r3 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE
            com.fyber.inneractive.sdk.flow.storepromo.loader.network.b r4 = com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE
            if (r3 != r4) goto L67
            int r3 = r7.f23829f
            int r4 = r7.f23830g
            int r4 = r4 + r8
            r7.f23830g = r4
            int r3 = r3 - r4
            r4 = 2
            if (r3 >= r4) goto L68
        L67:
            r1 = r8
        L68:
            r7.a(r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.c.a(java.lang.Object, java.lang.Exception, boolean):void");
    }
}
