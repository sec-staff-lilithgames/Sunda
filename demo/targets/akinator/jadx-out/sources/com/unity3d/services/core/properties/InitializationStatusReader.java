package com.unity3d.services.core.properties;

import com.unity3d.services.core.properties.SdkProperties;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class InitializationStatusReader {
    private static final String STATE_INITIALIZED_FAILED = "initialized_failed";
    private static final String STATE_INITIALIZED_SUCCESSFULLY = "initialized_successfully";
    private static final String STATE_INITIALIZING = "initializing";
    private static final String STATE_NOT_INITIALIZED = "not_initialized";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.properties.InitializationStatusReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        static {
            int[] iArr = new int[SdkProperties.InitializationState.values().length];
            $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = iArr;
            try {
                iArr[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String getInitializationStateString(SdkProperties.InitializationState initializationState) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[initializationState.ordinal()];
        if (i10 == 1) {
            return "not_initialized";
        }
        if (i10 == 2) {
            return STATE_INITIALIZING;
        }
        if (i10 == 3) {
            return STATE_INITIALIZED_SUCCESSFULLY;
        }
        if (i10 != 4) {
            return null;
        }
        return STATE_INITIALIZED_FAILED;
    }
}
