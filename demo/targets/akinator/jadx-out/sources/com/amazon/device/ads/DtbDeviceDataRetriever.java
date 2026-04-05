package com.amazon.device.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbDeviceDataRetriever {
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    public static final String ORIENTATION_UNKNOWN = "unknown";
    public static final int SMALLEST_TABLET_SCREEN_WIDTH = 600;
    public static int[][] rotationArray = {new int[]{1, 0, 9, 8}, new int[]{0, 9, 8, 1}};

    public static int determineCanonicalScreenOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        char c10 = 0;
        if (i10 != 1 ? i10 != 2 || rotation == 1 || rotation == 3 : rotation == 0 || rotation == 2) {
            c10 = 1;
        }
        return rotationArray[c10 ^ 1][rotation];
    }

    public static String getCanonicalOrientation(Context context) {
        int iDetermineCanonicalScreenOrientation = determineCanonicalScreenOrientation(context);
        return iDetermineCanonicalScreenOrientation != 0 ? iDetermineCanonicalScreenOrientation != 1 ? iDetermineCanonicalScreenOrientation != 8 ? iDetermineCanonicalScreenOrientation != 9 ? "unknown" : "portrait" : "landscape" : "portrait" : "landscape";
    }

    public static String getOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (rotation == 0 || rotation == 2) ? "portrait" : "landscape";
    }

    public static String getScreenSize(DisplayMetrics displayMetrics, String str) {
        try {
            ((WindowManager) AdRegistration.getContext().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            int iPixelsToDeviceIndependenPixels = DTBAdUtil.pixelsToDeviceIndependenPixels(i10);
            int iPixelsToDeviceIndependenPixels2 = DTBAdUtil.pixelsToDeviceIndependenPixels(i11);
            if (str.equals("landscape")) {
                if (iPixelsToDeviceIndependenPixels < iPixelsToDeviceIndependenPixels2) {
                    iPixelsToDeviceIndependenPixels = iPixelsToDeviceIndependenPixels2;
                    iPixelsToDeviceIndependenPixels2 = iPixelsToDeviceIndependenPixels;
                }
            } else if (iPixelsToDeviceIndependenPixels > iPixelsToDeviceIndependenPixels2) {
                iPixelsToDeviceIndependenPixels = iPixelsToDeviceIndependenPixels2;
                iPixelsToDeviceIndependenPixels2 = iPixelsToDeviceIndependenPixels;
            }
            return String.valueOf(iPixelsToDeviceIndependenPixels) + "x" + String.valueOf(iPixelsToDeviceIndependenPixels2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isTablet() {
        return AdRegistration.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }
}
