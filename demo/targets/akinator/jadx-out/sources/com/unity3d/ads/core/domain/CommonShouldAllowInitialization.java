package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.InitMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonShouldAllowInitialization implements ShouldAllowInitialization {
    private final AlternativeFlowReader alternativeFlowReader;
    private final CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;
    private final GetInitializationState getInitializationState;
    private final SetInitializationState setInitializationState;
    private final ValidateGameId validateGameId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonShouldAllowInitialization(AlternativeFlowReader alternativeFlowReader, CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges, GetInitializationState getInitializationState, SetInitializationState setInitializationState, ValidateGameId validateGameId) {
        e0.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        e0.checkNotNullParameter(checkForGameIdAndTestModeChanges, "checkForGameIdAndTestModeChanges");
        e0.checkNotNullParameter(getInitializationState, "getInitializationState");
        e0.checkNotNullParameter(setInitializationState, "setInitializationState");
        e0.checkNotNullParameter(validateGameId, "validateGameId");
        this.alternativeFlowReader = alternativeFlowReader;
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges;
        this.getInitializationState = getInitializationState;
        this.setInitializationState = setInitializationState;
        this.validateGameId = validateGameId;
    }

    public final AlternativeFlowReader getAlternativeFlowReader() {
        return this.alternativeFlowReader;
    }

    public final CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    public final ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.validateGameId.invoke(str)) {
            return false;
        }
        if (this.alternativeFlowReader.invoke()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(false).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new t();
                    }
                    this.checkForGameIdAndTestModeChanges.invoke(false);
                    this.setInitializationState.invoke(InitializationState.INITIALIZING, false);
                    return true;
                }
                SdkProperties.notifyInitializationComplete();
            }
            return false;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(true).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new t();
                    }
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                    return false;
                }
                if (!EnvironmentCheck.isEnvironmentOk()) {
                    DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                    InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentNotOk());
                    return false;
                }
                DeviceLog.info("Unity Services environment check OK");
                InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentOk());
                this.checkForGameIdAndTestModeChanges.invoke(true);
                this.setInitializationState.invoke(InitializationState.INITIALIZING, true);
                return true;
            }
            SdkProperties.notifyInitializationComplete();
        }
        return false;
    }
}
