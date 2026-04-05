package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* loaded from: assets/audience_network.dex */
public abstract class OJ extends Drawable {
    public static String[] A00 = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A01 = Math.cos(Math.toRadians(45.0d));

    public static float A00(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (f10 + ((1.0d - A01) * f11));
        }
        return f10;
    }

    public static float A01(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) ((1.5f * f10) + ((1.0d - A01) * f11));
        }
        float f12 = 1.5f * f10;
        if (A00[6].length() == 2) {
            throw new RuntimeException();
        }
        A00[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
        return f12;
    }
}
