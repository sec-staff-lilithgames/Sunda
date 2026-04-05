package com.unity3d.ads.core.log;

import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum LogLevel {
    DISABLED(0),
    ERROR(1),
    INFO(2),
    DEBUG(3),
    TRACE(4);

    private final int level;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LogLevel(int i10) {
        this.level = i10;
    }

    public final int getLevel$unity_ads_defaultRelease() {
        return this.level;
    }

    public final int toAndroidLogLevel() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return Integer.MAX_VALUE;
        }
        if (i10 == 2) {
            return 6;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 2;
        }
        throw new t();
    }
}
