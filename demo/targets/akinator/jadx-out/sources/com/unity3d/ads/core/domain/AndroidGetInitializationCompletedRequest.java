package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", i = {0, 0}, l = {16, 24}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(zu.d<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            tu.a0.throwOnFailure(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.L$3
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r2
            java.lang.Object r5 = r0.L$2
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r5 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r5
            java.lang.Object r6 = r0.L$1
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r6 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest r7 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest) r7
            tu.a0.throwOnFailure(r9)
            goto L70
        L4a:
            tu.a0.throwOnFailure(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl$Companion r9 = gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder r2 = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r2 = r9._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r5
            java.lang.Object r9 = r9.staticDeviceInfo(r0)
            if (r9 != r1) goto L6d
            goto Lab
        L6d:
            r7 = r8
            r5 = r2
            r6 = r5
        L70:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r9 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r9
            r2.setStaticDeviceInfo(r9)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r7.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r9 = r9.getDynamicDeviceInfo()
            r5.setDynamicDeviceInfo(r9)
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest r9 = r6._build()
            gatewayprotocol.v1.UniversalRequestKt r2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r3)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r2 = r2._create(r5)
            r2.setInitializationCompletedEventRequest(r9)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r2._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r7.getUniversalRequestForPayLoad
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r0)
            if (r9 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke(zu.d):java.lang.Object");
    }
}
