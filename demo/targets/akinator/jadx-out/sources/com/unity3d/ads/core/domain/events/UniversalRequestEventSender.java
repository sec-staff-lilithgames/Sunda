package com.unity3d.ads.core.domain.events;

import bv.d;
import bv.f;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", i = {0}, l = {21, 35}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1, reason: invalid class name */
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
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        e0.checkNotNullParameter(gatewayClient, "gatewayClient");
        e0.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        e0.checkNotNullParameter(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r13, com.unity3d.ads.gatewayclient.RequestPolicy r14, zu.d<? super tu.x0> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r15
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            java.lang.Object r9 = av.e.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r10 = 2
            r1 = 1
            tu.x0 r11 = tu.x0.f87415a
            if (r0 == 0) goto L44
            if (r0 == r1) goto L39
            if (r0 != r10) goto L31
            tu.a0.throwOnFailure(r15)
            goto L98
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            java.lang.Object r13 = r6.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r13 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r13
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L41
            goto L68
        L41:
            r0 = move-exception
            r14 = r0
            goto L72
        L44:
            tu.a0.throwOnFailure(r15)
            com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r15 = r12.universalRequestTtlValidator
            boolean r15 = r15.invoke(r13, r14)
            if (r15 != 0) goto L50
            return r11
        L50:
            int r15 = tu.z.f87419c     // Catch: java.lang.Throwable -> L6f
            r15 = r1
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r12.gatewayClient     // Catch: java.lang.Throwable -> L6f
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT     // Catch: java.lang.Throwable -> L6f
            r6.L$0 = r12     // Catch: java.lang.Throwable -> L6f
            r6.label = r15     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            r7 = 1
            r8 = 0
            r3 = r13
            r4 = r14
            java.lang.Object r15 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r15 != r9) goto L67
            goto L97
        L67:
            r13 = r12
        L68:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r15 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15     // Catch: java.lang.Throwable -> L41
            java.lang.Object r14 = tu.z.m7131constructorimpl(r15)     // Catch: java.lang.Throwable -> L41
            goto L7c
        L6f:
            r0 = move-exception
            r14 = r0
            r13 = r12
        L72:
            int r15 = tu.z.f87419c
            java.lang.Object r14 = tu.a0.createFailure(r14)
            java.lang.Object r14 = tu.z.m7131constructorimpl(r14)
        L7c:
            java.lang.Throwable r15 = tu.z.m7134exceptionOrNullimpl(r14)
            boolean r15 = r15 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r15 == 0) goto L85
            return r11
        L85:
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r13 = r13.handleGatewayEventResponse
            tu.a0.throwOnFailure(r14)
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r14 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14
            r15 = 0
            r6.L$0 = r15
            r6.label = r10
            java.lang.Object r13 = r13.invoke(r14, r6)
            if (r13 != r9) goto L98
        L97:
            return r9
        L98:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, zu.d):java.lang.Object");
    }
}
