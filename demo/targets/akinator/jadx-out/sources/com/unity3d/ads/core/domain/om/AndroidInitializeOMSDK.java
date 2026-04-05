package com.unity3d.ads.core.domain.om;

import android.content.Context;
import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        long J$0;
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
            return AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository omRepository) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(zu.d<? super tu.x0> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r2 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r2 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            long r3 = r2.J$0
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK r2 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) r2
            tu.a0.throwOnFailure(r1)
            goto L6f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            tu.a0.throwOnFailure(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r0.sessionRepository
            boolean r1 = r1.isOmEnabled()
            if (r1 == 0) goto Lcf
            tv.y r1 = tv.y.f87465a
            long r6 = r1.m7254markNowz9LOYto()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            r15 = 62
            r16 = 0
            java.lang.String r9 = "om_activate_started"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r1 = r0.omRepository
            android.content.Context r4 = r0.context
            r2.L$0 = r0
            r2.J$0 = r6
            r2.label = r5
            java.lang.Object r1 = r1.activateOM(r4, r2)
            if (r1 != r3) goto L6d
            return r3
        L6d:
            r2 = r0
            r3 = r6
        L6f:
            com.unity3d.ads.core.data.model.OMResult r1 = (com.unity3d.ads.core.data.model.OMResult) r1
            boolean r5 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r5 == 0) goto L90
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r2.sendDiagnosticEvent
            tv.x r1 = tv.x.m7236boximpl(r3)
            double r1 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r1)
            java.lang.Double r8 = bv.b.boxDouble(r1)
            r13 = 60
            r14 = 0
            java.lang.String r7 = "om_activate_success_time"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lcf
        L90:
            boolean r5 = r1 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r5 == 0) goto Lcf
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r2.sendDiagnosticEvent
            tv.x r2 = tv.x.m7236boximpl(r3)
            double r2 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r2)
            java.lang.Double r8 = bv.b.boxDouble(r2)
            java.util.Map r2 = uu.o1.createMapBuilder()
            com.unity3d.ads.core.data.model.OMResult$Failure r1 = (com.unity3d.ads.core.data.model.OMResult.Failure) r1
            java.lang.String r3 = r1.getReason()
            java.lang.String r4 = "reason"
            r2.put(r4, r3)
            java.lang.String r3 = r1.getReasonDebug()
            if (r3 == 0) goto Lc0
            java.lang.String r3 = "reason_debug"
            java.lang.String r1 = r1.getReasonDebug()
            r2.put(r3, r1)
        Lc0:
            java.util.Map r9 = uu.o1.build(r2)
            r13 = 56
            r14 = 0
            java.lang.String r7 = "om_activate_failure_time"
            r10 = 0
            r11 = 0
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Lcf:
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke(zu.d):java.lang.Object");
    }
}
