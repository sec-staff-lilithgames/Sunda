package com.moloco.sdk.common_adapter_internal;

import com.moloco.sdk.publisher.bidrequest.Geo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Geo f45693a = new Geo(null, null, null, null, null, null);

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.moloco.sdk.common_adapter_internal.c a(com.moloco.sdk.Init$SDKInitResponse r10, java.lang.String r11) {
        /*
            com.moloco.sdk.Init$SDKInitResponse$Geo r0 = r10.getGeo()
            if (r0 == 0) goto L2e
            java.lang.String r2 = r0.getCity()
            java.lang.String r3 = r0.getCountryIso3Code()
            java.lang.String r5 = r0.getZipCode()
            java.lang.String r4 = r0.getCountryIso2Code()
            float r1 = r0.getLatitude()
            float r0 = r0.getLongitude()
            r6 = r1
            com.moloco.sdk.publisher.bidrequest.Geo r1 = new com.moloco.sdk.publisher.bidrequest.Geo
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L2c:
            r3 = r1
            goto L31
        L2e:
            com.moloco.sdk.publisher.bidrequest.Geo r1 = com.moloco.sdk.common_adapter_internal.b.f45693a
            goto L2c
        L31:
            java.lang.String r4 = com.moloco.sdk.publisher.Moloco.getBidRequestEndpoint()
            java.lang.String r5 = r10.getAppId()
            java.lang.String r6 = r10.getPublisherId()
            java.lang.String r7 = r10.getPlatformId()
            java.util.List r0 = r10.getAdUnitsList()
            r1 = 0
            if (r0 == 0) goto L6f
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            r8 = r2
            com.moloco.sdk.Init$SDKInitResponse$AdUnit r8 = (com.moloco.sdk.Init$SDKInitResponse.AdUnit) r8
            java.lang.String r8 = r8.getId()
            boolean r8 = kotlin.jvm.internal.e0.areEqual(r8, r11)
            if (r8 == 0) goto L4c
            goto L65
        L64:
            r2 = r1
        L65:
            com.moloco.sdk.Init$SDKInitResponse$AdUnit r2 = (com.moloco.sdk.Init$SDKInitResponse.AdUnit) r2
            if (r2 == 0) goto L6f
            java.lang.String r0 = r2.getName()
            r8 = r0
            goto L70
        L6f:
            r8 = r1
        L70:
            java.util.List r10 = r10.getAdUnitsList()
            if (r10 == 0) goto L9f
            java.util.Iterator r10 = r10.iterator()
        L7a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r10.next()
            r2 = r0
            com.moloco.sdk.Init$SDKInitResponse$AdUnit r2 = (com.moloco.sdk.Init$SDKInitResponse.AdUnit) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r11)
            if (r2 == 0) goto L7a
            goto L93
        L92:
            r0 = r1
        L93:
            com.moloco.sdk.Init$SDKInitResponse$AdUnit r0 = (com.moloco.sdk.Init$SDKInitResponse.AdUnit) r0
            if (r0 == 0) goto L9f
            float r10 = r0.getBidFloor()
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
        L9f:
            r9 = r1
            com.moloco.sdk.common_adapter_internal.c r2 = new com.moloco.sdk.common_adapter_internal.c
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.common_adapter_internal.b.a(com.moloco.sdk.Init$SDKInitResponse, java.lang.String):com.moloco.sdk.common_adapter_internal.c");
    }
}
