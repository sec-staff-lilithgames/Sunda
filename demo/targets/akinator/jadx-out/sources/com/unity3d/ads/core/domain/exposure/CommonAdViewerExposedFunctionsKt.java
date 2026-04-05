package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import av.b;
import av.e;
import bv.h;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.j0;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONObject;
import tu.x0;
import tv.f;
import tv.i;
import uu.k0;
import uu.o1;
import zu.d;
import zu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonAdViewerExposedFunctionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38021 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;

        public C38021(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, zu.d<java.lang.Object> r9) throws org.json.JSONException {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
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
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                r0.<init>(r7, r9)
                goto L12
            L1a:
                java.lang.Object r9 = r6.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                tu.a0.throwOnFailure(r9)
                goto L65
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                tu.a0.throwOnFailure(r9)
                r9 = 0
                r1 = r8[r9]
                java.lang.String r3 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r1, r3)
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                java.lang.String r3 = "url"
                r4 = r2
                java.lang.String r2 = r1.getString(r3)
                r5 = 2
                java.lang.Object r8 = uu.k0.getOrNull(r8, r5)
                org.json.JSONArray r8 = (org.json.JSONArray) r8
                java.lang.String r5 = "priority"
                int r5 = r1.optInt(r5, r9)
                com.unity3d.ads.core.domain.CacheFile r1 = r7.$cacheFile
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
                com.unity3d.ads.core.data.model.AdObject r3 = r7.$adObject
                r6.label = r4
                r4 = r8
                java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6)
                if (r9 != r0) goto L65
                return r0
            L65:
                com.unity3d.ads.core.data.model.CacheResult r9 = (com.unity3d.ads.core.data.model.CacheResult) r9
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r8 == 0) goto L84
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
                r8.<init>(r0)
                com.unity3d.ads.core.data.model.CacheResult$Success r9 = (com.unity3d.ads.core.data.model.CacheResult.Success) r9
                com.unity3d.ads.core.data.model.CachedFile r9 = r9.getCachedFile()
                java.lang.String r9 = r9.getName()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                return r8
            L84:
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
                if (r8 == 0) goto L9c
                com.unity3d.ads.core.data.model.CacheResult$Failure r9 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r9
                com.unity3d.ads.core.data.model.CacheError r8 = r9.getError()
                java.lang.String r8 = r8.name()
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L9c:
                tu.t r8 = new tu.t
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38021.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38081 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C38081(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, zu.d<java.lang.Object> r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                tu.a0.throwOnFailure(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                tu.a0.throwOnFailure(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacy(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38081.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38091 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C38091(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, zu.d<java.lang.Object> r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                tu.a0.throwOnFailure(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                tu.a0.throwOnFailure(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacyFsm(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38091.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38211 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        public C38211(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, zu.d<? super tu.x0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L5c
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                java.lang.String r6 = "placementName"
                java.lang.String r5 = r5.optString(r6)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallAd(r3)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallPlacementName(r5)
                com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd r2 = r4.$loadOfferwallAd
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
                r0.label = r3
                java.lang.Object r5 = r2.invoke(r5, r0)
                if (r5 != r1) goto L5c
                return r1
            L5c:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38211.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38221 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        public C38221(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r12, zu.d<? super tu.x0> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r13
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                r0.<init>(r11, r13)
                goto L12
            L1a:
                java.lang.Object r13 = r8.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2b
                tu.a0.throwOnFailure(r13)
                goto L97
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L33:
                tu.a0.throwOnFailure(r13)
                r13 = 0
                r12 = r12[r13]
                java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r12, r13)
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                java.lang.String r13 = "type"
                java.lang.String r13 = r12.optString(r13)
                java.lang.String r1 = "adUnitId"
                java.lang.String r4 = r12.optString(r1)
                java.lang.String r3 = "adString"
                java.lang.String r5 = r12.optString(r3)
                r6 = 0
                java.lang.String r6 = com.unity3d.services.core.request.NJc.yFkbx.eEuUILiJtIE
                r7 = r6
                java.lang.String r6 = r12.optString(r7)
                java.lang.String r9 = "videoLength"
                int r12 = r12.optInt(r9)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAd(r2)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdUnitId(r4)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarQueryId(r6)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdString(r5)
                r9 = r1
                com.unity3d.ads.core.domain.scar.LoadScarAd r1 = r11.$loadScarAd
                java.lang.String r10 = "adType"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r13, r10)
                com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
                java.lang.String r10 = r10.getPlacementId()
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r9)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r3)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r7)
                r8.label = r2
                r7 = r12
                r2 = r13
                r3 = r10
                java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
                if (r12 != r0) goto L97
                return r0
            L97:
                tu.x0 r12 = tu.x0.f87415a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38221.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38241 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        public C38241(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, zu.d<? super tu.x0> r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                tu.a0.throwOnFailure(r5)
                goto L41
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                tu.a0.throwOnFailure(r5)
                com.unity3d.ads.core.domain.om.OmFinishSession r5 = r3.$omFinishSession
                com.unity3d.ads.core.data.model.AdObject r1 = r3.$adObject
                r4.label = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L41
                return r0
            L41:
                tu.x0 r4 = tu.x0.f87415a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38241.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38251 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        public C38251(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, zu.d<java.lang.Object> r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                tu.a0.throwOnFailure(r5)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                tu.a0.throwOnFailure(r5)
                com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L3f
                return r0
            L3f:
                com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
                java.util.Map r4 = uu.o1.createMapBuilder()
                java.lang.String r0 = "version"
                java.lang.String r1 = r5.getVersion()
                r4.put(r0, r1)
                java.lang.String r0 = "partnerName"
                java.lang.String r1 = r5.getPartnerName()
                r4.put(r0, r1)
                java.lang.String r0 = "partnerVersion"
                java.lang.String r5 = r5.getPartnerVersion()
                r4.put(r0, r5)
                java.util.Map r4 = uu.o1.build(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38251.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38261 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public C38261(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, zu.d<? super tu.x0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L4f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
                kotlin.jvm.internal.e0.checkNotNull(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                com.unity3d.ads.core.domain.om.OmImpressionOccurred r6 = r4.$omImpressionOccurred
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4f
                return r1
            L4f:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38261.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38271 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmInteraction $omStartSession;

        public C38271(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
            this.$omStartSession = androidOmInteraction;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, zu.d<? super tu.x0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                com.unity3d.ads.core.domain.om.AndroidOmInteraction r6 = r4.$omStartSession
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38271.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38301 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        public C38301(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, zu.d<java.lang.Object> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                java.lang.String r3 = "adDataRefreshToken"
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L35
                if (r2 != r6) goto L2d
                tu.a0.throwOnFailure(r9)
                goto L6a
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                tu.a0.throwOnFailure(r9)
                int r9 = r8.length
                if (r9 != 0) goto L3e
                com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
                goto L54
            L3e:
                r8 = r8[r5]
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r8, r9)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r8 = r8.optString(r3)
                java.lang.String r9 = "refreshToken"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r9)
                com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r8, r5, r6, r4)
            L54:
                com.unity3d.ads.core.domain.Refresh r9 = r7.$refresh
                java.lang.String r2 = "refreshTokenByteString"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r2)
                com.unity3d.ads.core.data.model.AdObject r2 = r7.$adObject
                com.google.protobuf.ByteString r2 = r2.getOpportunityId()
                r0.label = r6
                java.lang.Object r9 = r9.invoke(r8, r2, r0)
                if (r9 != r1) goto L6a
                return r1
            L6a:
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r9 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r9
                boolean r8 = r9.hasError()
                if (r8 != 0) goto Laf
                java.util.Map r8 = uu.o1.createMapBuilder()
                com.google.protobuf.ByteString r0 = r9.getAdData()
                java.lang.String r1 = "adRefreshResponse.adData"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                java.lang.String r1 = "adData"
                r8.put(r1, r0)
                com.google.protobuf.ByteString r0 = r9.getAdDataRefreshToken()
                java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                r8.put(r3, r0)
                com.google.protobuf.ByteString r9 = r9.getTrackingToken()
                java.lang.String r0 = "adRefreshResponse.trackingToken"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r9, r0)
                java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r5, r6, r4)
                java.lang.String r0 = "trackingToken"
                r8.put(r0, r9)
                java.util.Map r8 = uu.o1.build(r8)
                return r8
            Laf:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Refresh failed"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38301.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38311 implements ExposedFunction {
        final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        final /* synthetic */ RequestType $type;

        public C38311(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, zu.d<java.lang.Object> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.L$1
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r0 = r0.L$0
                java.lang.String r0 = (java.lang.String) r0
                tu.a0.throwOnFailure(r8)     // Catch: java.lang.Exception -> L31
                goto L64
            L31:
                r8 = move-exception
                goto La7
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = uu.k0.first(r7)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.e0.checkNotNull(r8, r2)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r2 = uu.k0.getOrNull(r7, r3)
                java.lang.String r2 = (java.lang.String) r2
                com.unity3d.ads.core.domain.ExecuteAdViewerRequest r4 = r6.$executeAdViewerRequest     // Catch: java.lang.Exception -> La3
                com.unity3d.services.core.network.model.RequestType r5 = r6.$type     // Catch: java.lang.Exception -> La3
                r0.L$0 = r8     // Catch: java.lang.Exception -> La3
                r0.L$1 = r2     // Catch: java.lang.Exception -> La3
                r0.label = r3     // Catch: java.lang.Exception -> La3
                java.lang.Object r7 = r4.invoke(r5, r7, r0)     // Catch: java.lang.Exception -> La3
                if (r7 != r1) goto L61
                return r1
            L61:
                r0 = r8
                r8 = r7
                r7 = r2
            L64:
                com.unity3d.services.core.network.model.HttpResponse r8 = (com.unity3d.services.core.network.model.HttpResponse) r8     // Catch: java.lang.Exception -> L31
                java.lang.Object r1 = r8.getBody()     // Catch: java.lang.Exception -> L31
                boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L31
                if (r2 == 0) goto L71
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L31
                goto L81
            L71:
                boolean r2 = r1 instanceof byte[]     // Catch: java.lang.Exception -> L31
                if (r2 == 0) goto L80
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L31
                byte[] r1 = (byte[]) r1     // Catch: java.lang.Exception -> L31
                java.nio.charset.Charset r3 = sv.g.f86134b     // Catch: java.lang.Exception -> L31
                r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L31
                r1 = r2
                goto L81
            L80:
                r1 = 0
            L81:
                com.unity3d.ads.adplayer.model.OnWebRequestComplete r2 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch: java.lang.Exception -> L31
                java.lang.String r3 = r8.getUrlString()     // Catch: java.lang.Exception -> L31
                int r4 = r8.getStatusCode()     // Catch: java.lang.Exception -> L31
                java.lang.Integer r4 = bv.b.boxInt(r4)     // Catch: java.lang.Exception -> L31
                java.util.Map r8 = r8.getHeaders()     // Catch: java.lang.Exception -> L31
                org.json.JSONArray r8 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r8)     // Catch: java.lang.Exception -> L31
                java.lang.Object[] r8 = new java.lang.Object[]{r0, r3, r1, r4, r8}     // Catch: java.lang.Exception -> L31
                java.util.List r8 = uu.p0.listOf(r8)     // Catch: java.lang.Exception -> L31
                r2.<init>(r8)     // Catch: java.lang.Exception -> L31
                return r2
            La3:
                r7 = move-exception
                r0 = r8
                r8 = r7
                r7 = r2
            La7:
                com.unity3d.ads.adplayer.model.OnWebRequestFailed r1 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
                java.lang.String r8 = r8.getMessage()
                if (r8 != 0) goto Lb1
                java.lang.String r8 = ""
            Lb1:
                java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}
                java.util.List r7 = uu.p0.listOf(r7)
                r1.<init>(r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38311.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38331 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public C38331(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r6, zu.d<? super tu.x0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r7)
                goto L5b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                tu.a0.throwOnFailure(r7)
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r7 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
                r2 = 0
                r6 = r6[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.e0.checkNotNull(r6, r2)
                java.lang.String r6 = (java.lang.String) r6
                r2 = 2
                byte[] r6 = android.util.Base64.decode(r6, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r2)
                com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r6)
                com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r5.$getOperativeEventApi
                com.unity3d.ads.core.data.model.AdObject r4 = r5.$adObject
                r0.label = r3
                java.lang.Object r6 = r2.invoke(r7, r4, r6, r0)
                if (r6 != r1) goto L5b
                return r1
            L5b:
                tu.x0 r6 = tu.x0.f87415a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38331.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38341 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public C38341(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r10, zu.d<java.lang.Object> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r11
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 0
                java.lang.String r4 = "version"
                java.lang.String r5 = "content"
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L37
                if (r2 != r7) goto L2f
                tu.a0.throwOnFailure(r11)
                goto L5f
            L2f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L37:
                tu.a0.throwOnFailure(r11)
                r10 = r10[r6]
                java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.e0.checkNotNull(r10, r11)
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.String r11 = r10.optString(r5)
                int r10 = r10.optInt(r4)
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
                java.lang.String r8 = "privacyUpdateContentBase64"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r8)
                com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r11, r6, r7, r3)
                r0.label = r7
                java.lang.Object r11 = r2.invoke(r10, r11, r0)
                if (r11 != r1) goto L5f
                return r1
            L5f:
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
                java.util.Map r10 = uu.o1.createMapBuilder()
                int r0 = r11.getVersion()
                java.lang.Integer r0 = bv.b.boxInt(r0)
                r10.put(r4, r0)
                com.google.protobuf.ByteString r11 = r11.getContent()
                java.lang.String r0 = "response.content"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r0)
                java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r11, r6, r7, r3)
                r10.put(r5, r11)
                java.util.Map r10 = uu.o1.build(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38341.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38371 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public C38371(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, zu.d<? super tu.x0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r8)
                goto L65
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                tu.a0.throwOnFailure(r8)
                r8 = 0
                r7 = r7[r8]
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
                kotlin.jvm.internal.e0.checkNotNull(r7, r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
                kotlinx.coroutines.flow.MutableSharedFlow r8 = r8.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
                com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
                com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                java.lang.String r4 = r4.toStringUtf8()
                java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r5)
                r2.<init>(r4, r7)
                r0.label = r3
                java.lang.Object r7 = r8.emit(r2, r0)
                if (r7 != r1) goto L65
                return r1
            L65:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38371.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38381 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C38381(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, zu.d<? super tu.x0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.e0.checkNotNull(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacy(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38381.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38391 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C38391(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, zu.d<? super tu.x0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L57
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.e0.checkNotNull(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacyFsm(r5, r0)
                if (r5 != r1) goto L57
                return r1
            L57:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38391.invoke(java.lang.Object[], zu.d):java.lang.Object");
        }
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        e0.checkNotNullParameter(androidAttribution, "androidAttribution");
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, dVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        e0.checkNotNullParameter(androidAttribution, "androidAttribution");
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, dVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        e0.checkNotNullParameter(cacheFile, "cacheFile");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38021(cacheFile, adObject);
    }

    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m3507getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        e0.checkNotNullParameter(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        e0.checkNotNullParameter(adData, "adData");
        e0.checkNotNullParameter(impressionConfig, "impressionConfig");
        e0.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        e0.checkNotNullParameter(isOMActivated, "isOMActivated");
        e0.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                String strEncodeToString = Base64.encodeToString(deviceInfoRepository.getAllowedPii().getValue().toByteArray(), 2);
                e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                e0.checkNotNullExpressionValue(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return bv.b.boxDouble(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return bv.b.boxDouble(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C38081(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C38091(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return bv.b.boxInt(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return bv.b.boxInt(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                sessionRepository.incrementTokenStartsCount();
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                sessionRepository.incrementTokenWinsCount();
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                sessionRepository.resetTokenCounters();
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                sessionRepository.incrementBannerImpressionCount();
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        e0.checkNotNullParameter(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                return androidAttribution.isAvailable(dVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        e0.checkNotNullParameter(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return getIfFileCache.invoke((String) obj, dVar);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        e0.checkNotNullParameter(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) {
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = getIsOfferwallAdReady;
                e0.checkNotNullExpressionValue(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, dVar);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        e0.checkNotNullParameter(loadOfferwallAd, "loadOfferwallAd");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38211(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        e0.checkNotNullParameter(loadScarAd, "loadScarAd");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38221(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        e0.checkNotNullParameter(omFinishSession, "omFinishSession");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38241(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        e0.checkNotNullParameter(getOmData, "getOmData");
        return new C38251(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        e0.checkNotNullParameter(omImpressionOccurred, "omImpressionOccurred");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38261(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction omStartSession, AdObject adObject) {
        e0.checkNotNullParameter(omStartSession, "omStartSession");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38271(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final HandleOpenUrl handleOpenUrl) {
        e0.checkNotNullParameter(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object orNull = k0.getOrNull(objArr, 1);
                JSONObject jSONObject = orNull instanceof JSONObject ? (JSONObject) orNull : null;
                handleOpenUrl.invoke(str, jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null);
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        e0.checkNotNullParameter(refresh, "refresh");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38301(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        return new C38311(executeAdViewerRequest, type);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                String string;
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                Map mapCreateMapBuilder = o1.createMapBuilder();
                Iterator<String> itKeys = jSONObject.keys();
                e0.checkNotNullExpressionValue(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapCreateMapBuilder.put(next, jSONObject.getString(next));
                }
                Map mapBuild = o1.build(mapCreateMapBuilder);
                Object orNull = k0.getOrNull(objArr, 2);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (orNull == null || (string = orNull.toString()) == null) ? null : bv.b.boxDouble(Double.parseDouble(string)), mapBuild, null, adObject, null, 40, null);
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        e0.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38331(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        e0.checkNotNullParameter(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C38341(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                AllowedPiiOuterClass.AllowedPii value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                MutableStateFlow<AllowedPiiOuterClass.AllowedPii> allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    Object objOpt = jSONObject.opt("idfa");
                    Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
                    if (bool != null) {
                        new j0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(bv.b.boxBoolean(bool.booleanValue()));
                    }
                    Object objOpt2 = jSONObject.opt("idfv");
                    Boolean bool2 = objOpt2 instanceof Boolean ? (Boolean) objOpt2 : null;
                    if (bool2 != null) {
                        new j0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }

                            {
                                String str = RnJusJ.SolHkMLOkITh;
                            }
                        }.set(bv.b.boxBoolean(bool2.booleanValue()));
                    }
                    Object objOpt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = objOpt3 instanceof Boolean ? (Boolean) objOpt3 : null;
                    if (bool3 != null) {
                        new j0(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.j0, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(bv.b.boxBoolean(bool3.booleanValue()));
                    }
                } while (!allowedPii.compareAndSet(value, dsl_create._build()));
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                MutableStateFlow<f> ttl = adObject.getTtl();
                tv.e eVar = f.f87433c;
                ttl.setValue(f.m7182boximpl(tv.h.toDuration(iIntValue, i.f87442g)));
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        e0.checkNotNullParameter(adObject, "adObject");
        return new C38371(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C38381(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new C38391(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1
            /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object[] r7, zu.d<? super tu.x0> r8) {
                /*
                    r6 = this;
                    java.lang.Object r7 = uu.k0.firstOrNull(r7)
                    boolean r8 = r7 instanceof org.json.JSONObject
                    r0 = 0
                    if (r8 == 0) goto Lc
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    goto Ld
                Lc:
                    r7 = r0
                Ld:
                    if (r7 == 0) goto Lab
                    java.lang.String r8 = "data"
                    java.lang.String r1 = r7.optString(r8)
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L22
                    boolean r4 = sv.n0.isBlank(r1)
                    if (r4 == 0) goto L20
                    goto L22
                L20:
                    r4 = r3
                    goto L23
                L22:
                    r4 = r2
                L23:
                    if (r4 != 0) goto La3
                    java.lang.String r4 = "dataVersion"
                    int r7 = r7.optInt(r4)
                    if (r7 == 0) goto L9b
                    com.unity3d.ads.core.data.model.AdObject r4 = r1
                    com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                    com.unity3d.ads.core.data.model.AdObject r5 = r1
                    java.lang.String r5 = r5.getPlacementId()
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r8)
                    com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r1, r3, r2, r0)
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L93
                    com.unity3d.ads.core.data.repository.CampaignRepository r0 = r2
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r4)
                    if (r0 == 0) goto L6c
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                    java.lang.String r2 = "this.toBuilder()"
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r2)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                    if (r0 == 0) goto L6c
                    goto L8b
                L6c:
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                    java.lang.String r2 = "newBuilder()"
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    r0.setPlacementId(r5)
                    r0.setImpressionOpportunityId(r4)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                L8b:
                    com.unity3d.ads.core.data.repository.CampaignRepository r7 = r2
                    r7.setCampaign(r4, r0)
                    tu.x0 r7 = tu.x0.f87415a
                    return r7
                L93:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a non-empty data byte string"
                    r7.<init>(r8)
                    throw r7
                L9b:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a dataVersion integer"
                    r7.<init>(r8)
                    throw r7
                La3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a data string"
                    r7.<init>(r8)
                    throw r7
                Lab:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a JSONObject"
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C38431.invoke(java.lang.Object[], zu.d):java.lang.Object");
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        e0.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<? super x0> dVar) {
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (token != null && token.length() != 0) {
                    AdObject adObject2 = adObject;
                    e0.checkNotNullExpressionValue(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return x0.f87415a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, kv.p
            public final Object invoke(Object[] objArr, d<Object> dVar) throws Throwable {
                o oVar = new o(b.intercepted(dVar));
                Object obj = objArr[0];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(oVar));
                Object orThrow = oVar.getOrThrow();
                if (orThrow == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return orThrow;
            }
        };
    }
}
