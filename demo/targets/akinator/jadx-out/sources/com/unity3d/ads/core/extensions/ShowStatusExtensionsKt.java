package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ShowStatusExtensionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NativeConfigurationOuterClass.ShowCompletionState.values().length];
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShowStatus.values().length];
            try {
                iArr2[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShowStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus, NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState) {
        e0.checkNotNullParameter(showStatus, "<this>");
        e0.checkNotNullParameter(defaultShowCompletionState, "defaultShowCompletionState");
        int i10 = WhenMappings.$EnumSwitchMapping$1[showStatus.ordinal()];
        if (i10 == 1) {
            return UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i10 == 2) {
            return UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        if (i10 != 3) {
            throw new t();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[defaultShowCompletionState.ordinal()];
        return i11 != 1 ? i11 != 2 ? UnityAds.UnityAdsShowCompletionState.COMPLETED : UnityAds.UnityAdsShowCompletionState.SKIPPED : UnityAds.UnityAdsShowCompletionState.COMPLETED;
    }
}
