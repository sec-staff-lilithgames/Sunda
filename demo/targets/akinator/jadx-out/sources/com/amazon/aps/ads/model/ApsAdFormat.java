package com.amazon.aps.ads.model;

import com.ironsource.mediationsdk.l;
import cv.a;
import cv.b;
import hr.kNq.ikJMrW;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class ApsAdFormat {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApsAdFormat[] $VALUES;
    public static final ApsAdFormat BANNER = new ApsAdFormat(l.f37554a, 0);
    public static final ApsAdFormat MREC = new ApsAdFormat(ikJMrW.gTdEjUJsBJD, 1);
    public static final ApsAdFormat LEADERBOARD = new ApsAdFormat(l.f37557d, 2);
    public static final ApsAdFormat BANNER_SMART = new ApsAdFormat("BANNER_SMART", 3);
    public static final ApsAdFormat INTERSTITIAL = new ApsAdFormat("INTERSTITIAL", 4);
    public static final ApsAdFormat REWARDED_VIDEO = new ApsAdFormat("REWARDED_VIDEO", 5);
    public static final ApsAdFormat INSTREAM_VIDEO = new ApsAdFormat("INSTREAM_VIDEO", 6);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApsAdFormat.BANNER_SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApsAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApsAdFormat.LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ApsAdFormat[] $values() {
        return new ApsAdFormat[]{BANNER, MREC, LEADERBOARD, BANNER_SMART, INTERSTITIAL, REWARDED_VIDEO, INSTREAM_VIDEO};
    }

    private ApsAdFormat(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApsAdFormat valueOf(String str) {
        return (ApsAdFormat) Enum.valueOf(ApsAdFormat.class, str);
    }

    public static ApsAdFormat[] values() {
        return (ApsAdFormat[]) $VALUES.clone();
    }

    public final boolean isBanner() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
    }

    static {
        ApsAdFormat[] apsAdFormatArr$values = $values();
        $VALUES = apsAdFormatArr$values;
        $ENTRIES = b.enumEntries(apsAdFormatArr$values);
    }
}
