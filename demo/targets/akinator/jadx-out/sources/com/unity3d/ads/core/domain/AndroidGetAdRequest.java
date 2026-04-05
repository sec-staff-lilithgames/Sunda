package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {33, 40, 55}, m = "invoke", n = {"this", "placement", "impressionOpportunity", ContentDisposition.Parameters.Size, "$this$invoke_u24lambda_u241", "this", ContentDisposition.Parameters.Size, "$this$invoke_u24lambda_u241"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$3"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1, reason: invalid class name */
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
            return AndroidGetAdRequest.this.invoke(null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webViewConfigurationDataSource, TcfRepository tcfRepository) {
        e0.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        e0.checkNotNullParameter(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        e0.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.String r18, com.google.protobuf.ByteString r19, gatewayprotocol.v1.AdRequestOuterClass.BannerSize r20, zu.d<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke(java.lang.String, com.google.protobuf.ByteString, gatewayprotocol.v1.AdRequestOuterClass$BannerSize, zu.d):java.lang.Object");
    }
}
