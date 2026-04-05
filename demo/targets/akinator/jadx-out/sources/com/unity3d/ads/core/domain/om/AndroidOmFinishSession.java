package com.unity3d.ads.core.domain.om;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidOmFinishSession implements OmFinishSession {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.om.AndroidOmFinishSession", f = "AndroidOmFinishSession.kt", i = {0, 0}, l = {17}, m = "invoke", n = {"this", "adObject"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOmFinishSession.this.invoke(null, this);
        }
    }

    public AndroidOmFinishSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.OmFinishSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r12, zu.d<? super tu.x0> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.om.AndroidOmFinishSession.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r12 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r12 = (com.unity3d.ads.core.data.model.AdObject) r12
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession) r0
            tu.a0.throwOnFailure(r13)
        L30:
            r7 = r12
            goto L52
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            tu.a0.throwOnFailure(r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r13 = r11.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r12.getOpportunityId()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r13 = r13.finishSession(r2, r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            r0 = r11
            goto L30
        L52:
            com.unity3d.ads.core.data.model.OMResult r13 = (com.unity3d.ads.core.data.model.OMResult) r13
            boolean r12 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r12 == 0) goto L67
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            r9 = 46
            r10 = 0
            java.lang.String r3 = "om_session_finish_success"
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L9a
        L67:
            boolean r12 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r12 == 0) goto L9a
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            java.util.Map r12 = uu.o1.createMapBuilder()
            com.unity3d.ads.core.data.model.OMResult$Failure r13 = (com.unity3d.ads.core.data.model.OMResult.Failure) r13
            java.lang.String r0 = r13.getReason()
            java.lang.String r1 = "reason"
            r12.put(r1, r0)
            java.lang.String r0 = r13.getReasonDebug()
            if (r0 == 0) goto L8b
            java.lang.String r0 = "reason_debug"
            java.lang.String r13 = r13.getReasonDebug()
            r12.put(r0, r13)
        L8b:
            java.util.Map r5 = uu.o1.build(r12)
            r9 = 42
            r10 = 0
            java.lang.String r3 = "om_session_finish_failure"
            r4 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L9a:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke(com.unity3d.ads.core.data.model.AdObject, zu.d):java.lang.Object");
    }
}
