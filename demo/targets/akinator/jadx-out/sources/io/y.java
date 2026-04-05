package io;

import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y {
    public static void setSurfaceFrameRate(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            io.bidmachine.media3.common.util.b0.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
