package com.unity3d.ads.core.domain.events;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", i = {0, 0, 0}, l = {37}, m = "invoke", n = {"this", "adFormat", "$this$invoke_u24lambda_u242"}, s = {"L$0", "L$1", "L$3"})
    /* renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetOperativeEventRequest.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventRequest(GetByteStringId generateByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        e0.checkNotNullParameter(generateByteStringId, "generateByteStringId");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.generateByteStringId = generateByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r6, com.google.protobuf.ByteString r7, com.google.protobuf.ByteString r8, com.google.protobuf.ByteString r9, java.lang.String r10, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r11, zu.d<? super gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.L$4
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r6 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$3
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r7 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r7
            java.lang.Object r8 = r0.L$2
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r8 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r8
            java.lang.Object r9 = r0.L$1
            r11 = r9
            gatewayprotocol.v1.AdFormatOuterClass$AdFormat r11 = (gatewayprotocol.v1.AdFormatOuterClass.AdFormat) r11
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r9 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) r9
            tu.a0.throwOnFailure(r12)
            goto L95
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            tu.a0.throwOnFailure(r12)
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl$Companion r12 = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r4)
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r12 = r12._create(r2)
            com.unity3d.ads.core.domain.GetByteStringId r2 = r5.generateByteStringId
            com.google.protobuf.ByteString r2 = r2.invoke()
            r12.setEventId(r2)
            r12.setEventType(r6)
            r12.setImpressionOpportunityId(r8)
            r12.setTrackingToken(r7)
            r12.setAdditionalData(r9)
            if (r10 == 0) goto L72
            r12.setSid(r10)
        L72:
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r5.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r6 = r6.getDynamicDeviceInfo()
            r12.setDynamicDeviceInfo(r6)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r5.deviceInfoRepository
            r0.L$0 = r5
            r0.L$1 = r11
            r0.L$2 = r12
            r0.L$3 = r12
            r0.L$4 = r12
            r0.label = r3
            java.lang.Object r6 = r6.staticDeviceInfo(r0)
            if (r6 != r1) goto L90
            return r1
        L90:
            r9 = r5
            r7 = r12
            r8 = r7
            r12 = r6
            r6 = r8
        L95:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r12 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r12
            r6.setStaticDeviceInfo(r12)
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r9.sessionRepository
            gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters r6 = r6.getSessionCounters()
            r7.setSessionCounters(r6)
            com.unity3d.ads.core.data.repository.CampaignRepository r6 = r9.campaignRepository
            gatewayprotocol.v1.CampaignStateOuterClass$CampaignState r6 = r6.getCampaignState()
            r7.setCampaignState(r6)
            if (r11 == 0) goto Lb1
            r7.setAdFormat(r11)
        Lb1:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r6 = r8._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, zu.d):java.lang.Object");
    }
}
