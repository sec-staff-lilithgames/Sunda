package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitializationStateKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final InitializationState toBold(SdkProperties.InitializationState initializationState) {
        e0.checkNotNullParameter(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i10 == 1) {
            return InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return InitializationState.INITIALIZED;
        }
        if (i10 == 4) {
            return InitializationState.FAILED;
        }
        throw new t();
    }

    public static final SdkProperties.InitializationState toLegacy(InitializationState initializationState) {
        e0.checkNotNullParameter(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i10 == 1) {
            return SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return SdkProperties.InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i10 == 4) {
            return SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new t();
    }
}
