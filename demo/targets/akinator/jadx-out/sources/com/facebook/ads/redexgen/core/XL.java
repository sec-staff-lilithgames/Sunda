package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public abstract class XL {
    public static String[] A00 = {"AGgEj", "LH3rgKkNmktwVHG5nPeK3WsWN7516Jzs", "CK3U371aKg", "MTDWSiS44OE4PV9OKyjdrXQDz2py4IOF", "ej0x21azMZ2lcGnVvFT8lesJnsiudKto", "2BAFbYQr8kMnD6mhXZkfB", "qOS", "n1iHeVYqIlmDLMhT9hH5ssiOIOX1l9w9"};

    public static EnumC1953db A00(VideoStartReason videoStartReason) {
        switch (videoStartReason) {
            case AUTO_STARTED:
                EnumC1953db enumC1953db = EnumC1953db.A02;
                if (A00[2].length() != 10) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[5] = "lDchC145wsMmgVMbBHFb3";
                strArr[0] = "IYy0G";
                return enumC1953db;
            case NOT_STARTED:
                return EnumC1953db.A03;
            case USER_STARTED:
                return EnumC1953db.A04;
            default:
                return EnumC1953db.A03;
        }
    }
}
