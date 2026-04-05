package com.unity3d.ads.core.extensions;

import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kl.e;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdFormatExtensions {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(AdFormat adFormat) {
        e0.checkNotNullParameter(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i10 == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i10 == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i10 == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i10 == 4) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new t();
    }

    public static final e toUnityAdFormat(AdFormatOuterClass.AdFormat adFormat) {
        e0.checkNotNullParameter(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i10 == 1) {
            return e.f71584e;
        }
        if (i10 == 2) {
            return e.f71583c;
        }
        if (i10 == 3) {
            return e.f71585f;
        }
        if (i10 != 4) {
            return null;
        }
        return e.f71582b;
    }

    public static final e toUnityAdFormat(AdFormat adFormat) {
        e0.checkNotNullParameter(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i10 == 1) {
            return e.f71582b;
        }
        if (i10 == 2) {
            return e.f71585f;
        }
        if (i10 == 3) {
            return e.f71583c;
        }
        if (i10 == 4) {
            return e.f71584e;
        }
        throw new t();
    }
}
