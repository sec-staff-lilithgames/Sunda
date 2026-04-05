package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", i = {0}, l = {15}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(zu.d<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r2 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 r2 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.AndroidGetAdPlayerContext r2 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) r2
            tu.a0.throwOnFailure(r1)
            goto L4a
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            tu.a0.throwOnFailure(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r0.deviceInfoRepository
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.staticDeviceInfo(r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            r2 = r0
        L4a:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r1
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r3 = r2.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r3 = r3.getDynamicDeviceInfo()
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r2.sessionRepository
            java.lang.String r2 = r2.getGameId()
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            java.lang.String r4 = "bundleId"
            java.lang.String r5 = r1.getBundleId()
            tu.v r6 = tu.e0.to(r4, r5)
            java.lang.String r4 = "bundleVersion"
            java.lang.String r5 = r1.getBundleVersion()
            tu.v r7 = tu.e0.to(r4, r5)
            java.lang.String r4 = "webviewHash"
            java.lang.String r5 = "unknown"
            tu.v r8 = tu.e0.to(r4, r5)
            int r4 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            java.lang.Integer r4 = bv.b.boxInt(r4)
            java.lang.String r5 = "sdkVersion"
            tu.v r9 = tu.e0.to(r5, r4)
            java.lang.String r4 = "sdkVersionName"
            java.lang.String r5 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            tu.v r10 = tu.e0.to(r4, r5)
            java.lang.String r4 = "osVersion"
            java.lang.String r5 = r1.getOsVersion()
            tu.v r11 = tu.e0.to(r4, r5)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "systemLanguage"
            tu.v r12 = tu.e0.to(r5, r4)
            java.lang.String r4 = "deviceModel"
            java.lang.String r1 = r1.getDeviceModel()
            tu.v r13 = tu.e0.to(r4, r1)
            boolean r1 = r3.getLimitedTracking()
            java.lang.Boolean r1 = bv.b.boxBoolean(r1)
            java.lang.String r4 = "limitAdTracking"
            tu.v r14 = tu.e0.to(r4, r1)
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android r1 = r3.getAndroid()
            double r3 = r1.getMaxVolume()
            java.lang.Double r1 = bv.b.boxDouble(r3)
            java.lang.String r3 = "maxVolume"
            tu.v r15 = tu.e0.to(r3, r1)
            java.lang.String r1 = "gameId"
            tu.v r16 = tu.e0.to(r1, r2)
            tu.v[] r1 = new tu.v[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.Map r1 = uu.p1.mapOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke(zu.d):java.lang.Object");
    }
}
