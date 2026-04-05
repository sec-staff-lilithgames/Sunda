package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2411lW implements FT, DisplayManager.DisplayListener {
    public static byte[] A02;
    public FS A00;
    public final DisplayManager A01;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{15, 20, 30, 27, 23, 12, 36};
    }

    public C2411lW(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private Display A00() {
        return this.A01.getDisplay(0);
    }

    public static C2411lW A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 65));
        if (displayManager != null) {
            return new C2411lW(displayManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AGn(FS fs) {
        this.A00 = fs;
        this.A01.registerDisplayListener(this, AbstractC09264a.A0Y());
        fs.ACz(A00());
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AJl() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (this.A00 != null && i10 == 0) {
            this.A00.ACz(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
