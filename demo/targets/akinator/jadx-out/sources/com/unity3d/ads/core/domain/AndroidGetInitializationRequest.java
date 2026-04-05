package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {
    private final GetInitializationRequestPayload getInitializationRequestPayload;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequest", f = "AndroidGetInitializationRequest.kt", i = {0}, l = {11, 15}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1, reason: invalid class name */
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
            return AndroidGetInitializationRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequest(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        e0.checkNotNullParameter(getInitializationRequestPayload, "getInitializationRequestPayload");
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(zu.d<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationRequest r2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest) r2
            tu.a0.throwOnFailure(r8)
            goto L4d
        L3c:
            tu.a0.throwOnFailure(r8)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r8 = r7.getInitializationRequestPayload
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L4c
            goto L74
        L4c:
            r2 = r7
        L4d:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r8 = (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) r8
            gatewayprotocol.v1.UniversalRequestKt r4 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r4 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            java.lang.String r6 = "newBuilder()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r4 = r4._create(r5)
            r4.setInitializationRequest(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r8 = r4._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r2.getUniversalRequestForPayLoad
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r2.invoke(r8, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke(zu.d):java.lang.Object");
    }
}
