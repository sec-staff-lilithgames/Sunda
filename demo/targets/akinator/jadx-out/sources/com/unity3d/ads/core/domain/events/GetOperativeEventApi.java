package com.unity3d.ads.core.domain.events;

import av.e;
import bv.d;
import bv.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", i = {0}, l = {21}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1, reason: invalid class name */
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
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest operativeEventRequest) {
        e0.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        e0.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, zu.d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str = null;
        }
        if ((i10 & 32) != 0) {
            adFormat = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, adFormat, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r11, com.google.protobuf.ByteString r12, com.google.protobuf.ByteString r13, com.google.protobuf.ByteString r14, java.lang.String r15, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r16, zu.d<? super tu.x0> r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1
            if (r1 == 0) goto L16
            r1 = r0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r1 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1 r1 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r9.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r11 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) r11
            tu.a0.throwOnFailure(r0)
            goto L51
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            tu.a0.throwOnFailure(r0)
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r2 = r10.operativeEventRequest
            r9.L$0 = r10
            r9.label = r3
            r3 = r11
            r5 = r12
            r4 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            java.lang.Object r0 = r2.invoke(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r1) goto L50
            return r1
        L50:
            r11 = r10
        L51:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r0 = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) r0
            com.unity3d.ads.core.data.repository.OperativeEventRepository r11 = r11.operativeEventRepository
            r11.addOperativeEvent(r0)
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, zu.d):java.lang.Object");
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, zu.d<? super x0> dVar) {
        Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }
}
