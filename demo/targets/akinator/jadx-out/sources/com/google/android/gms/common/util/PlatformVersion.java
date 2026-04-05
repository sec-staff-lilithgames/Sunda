package com.google.android.gms.common.util;

import android.os.Build;
import t3.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBean() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    public static boolean isAtLeastKitKat() {
        return true;
    }

    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    public static boolean isAtLeastM() {
        return true;
    }

    public static boolean isAtLeastN() {
        return true;
    }

    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean isAtLeastV() {
        if (isAtLeastU()) {
            return b.isAtLeastV();
        }
        return false;
    }
}
