package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetInitRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetInitRequestPolicy(SessionRepository sessionRepository) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetRequestPolicy
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
