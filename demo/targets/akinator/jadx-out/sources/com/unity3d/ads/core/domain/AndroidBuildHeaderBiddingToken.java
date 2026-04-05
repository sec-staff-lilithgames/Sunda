package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {40, 52, 57, 60, 62}, m = "invoke", n = {"this", "tokenConfiguration", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u244", "scarSignalsCollected", "this", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId generateId, GetClientInfo getClientInfo, GetSharedDataTimestamps getTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo testDataInfo, OfferwallManager offerwallManager) {
        e0.checkNotNullParameter(generateId, "generateId");
        e0.checkNotNullParameter(getClientInfo, "getClientInfo");
        e0.checkNotNullParameter(getTimestamps, "getTimestamps");
        e0.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        e0.checkNotNullParameter(getInitializationData, "getInitializationData");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        e0.checkNotNullParameter(tcfRepository, "tcfRepository");
        e0.checkNotNullParameter(testDataInfo, "testDataInfo");
        e0.checkNotNullParameter(offerwallManager, "offerwallManager");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(int r18, com.unity3d.ads.TokenConfiguration r19, boolean r20, zu.d<? super gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken> r21) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, boolean, zu.d):java.lang.Object");
    }
}
