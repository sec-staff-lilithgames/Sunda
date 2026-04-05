package sf;

import android.view.Surface;
import com.google.android.exoplayer2.util.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m {
    public static void setSurfaceFrameRate(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            f0.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
