package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, l = {24, 25, 33, 34, 45, 50, 55, 60, 78}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$1"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        e0.checkNotNullParameter(getClientInfo, "getClientInfo");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        e0.checkNotNullParameter(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0 A[PHI: r1 r4 r5 r9
      0x02b0: PHI (r1v71 java.lang.Object) = (r1v70 java.lang.Object), (r1v1 java.lang.Object) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r4v28 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v25 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v30 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v10 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v15 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r9v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
      (r9v17 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
      (r9v22 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
     binds: [B:61:0x02ac, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d6 A[PHI: r1 r4 r5 r9
      0x02d6: PHI (r1v75 java.lang.Object) = (r1v74 java.lang.Object), (r1v1 java.lang.Object) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02d6: PHI (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v28 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v33 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02d6: PHI (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v18 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02d6: PHI (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
      (r9v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
      (r9v25 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
     binds: [B:73:0x02d2, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5 A[PHI: r1 r4 r5 r9
      0x02f5: PHI (r1v79 java.lang.Object) = (r1v78 java.lang.Object), (r1v1 java.lang.Object) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r4v34 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v36 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v21 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02f5: PHI (r9v26 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
      (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
      (r9v29 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
     binds: [B:79:0x02f1, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0331  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(zu.d<? super gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> r24) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(zu.d):java.lang.Object");
    }
}
