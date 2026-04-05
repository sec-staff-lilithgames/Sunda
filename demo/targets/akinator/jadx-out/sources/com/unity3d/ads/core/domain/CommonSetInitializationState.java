package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sdkPropertiesManager) {
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(InitializationState state, boolean z10) {
        e0.checkNotNullParameter(state, "state");
        if (z10) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(state));
        } else {
            this.sessionRepository.setInitializationState(state);
        }
    }
}
