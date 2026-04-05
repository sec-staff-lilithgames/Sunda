package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public BannerSize(int i10, int i11, int i12) {
        if (i10 == 1) {
            this.height = 90;
            this.width = 320;
            return;
        }
        if (i10 == 2) {
            this.height = 250;
            this.width = 300;
            return;
        }
        if (i10 == 3) {
            setSmartMode();
            return;
        }
        if (i10 == 4) {
            this.height = 50;
            this.width = 320;
        } else {
            if (i10 != 5) {
                return;
            }
            this.height = i12;
            this.width = i11;
        }
    }

    private void setSmartMode() {
        if (l0.m(c.m().d()) < 720) {
            this.height = 50;
            this.width = 320;
        } else {
            this.height = 90;
            this.width = 728;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
