package com.amazon.device.ads;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AdUtils {
    public static final String REQUIRED_ACTIVITY = "com.amazon.device.ads.AdActivity";
    public static AdUtilsExecutor executor = new AdUtilsExecutor();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class AdUtilsExecutor {
        public boolean hasRequiredActivities;
        public final HashSet<String> requiredActivities;

        public AdUtilsExecutor() {
            HashSet<String> hashSet = new HashSet<>();
            this.requiredActivities = hashSet;
            this.hasRequiredActivities = false;
            hashSet.add(AdUtils.REQUIRED_ACTIVITY);
        }

        public double calculateScalingMultiplier(int i10, int i11, int i12, int i13) {
            double d10 = i12 / i10;
            double d11 = i13 / i11;
            if ((d11 < d10 || d10 == 0.0d) && d11 != 0.0d) {
                d10 = d11;
            }
            if (d10 == 0.0d) {
                return 1.0d;
            }
            return d10;
        }

        public int deviceIndependentPixelToPixel(int i10) {
            return (int) (i10 == -1 ? i10 : i10 * getScalingFactorAsFloat());
        }

        public float getScalingFactorAsFloat() {
            WindowManager windowManager = (WindowManager) AdRegistration.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.scaledDensity;
        }

        public int pixelToDeviceIndependentPixel(int i10) {
            return (int) (i10 / getScalingFactorAsFloat());
        }
    }

    public static double calculateScalingMultiplier(int i10, int i11, int i12, int i13) {
        return executor.calculateScalingMultiplier(i10, i11, i12, i13);
    }

    public static int deviceIndependentPixelToPixel(int i10) {
        return executor.deviceIndependentPixelToPixel(i10);
    }

    public static float getScalingFactorAsFloat() {
        return executor.getScalingFactorAsFloat();
    }

    public static int pixelToDeviceIndependentPixel(int i10) {
        return executor.pixelToDeviceIndependentPixel(i10);
    }
}
