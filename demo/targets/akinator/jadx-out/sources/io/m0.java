package io;

import android.view.Surface;
import io.bidmachine.media3.common.util.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface m0 {
    void clearOutputSurfaceInfo();

    l0 getSink(int i10);

    void release();

    void setOutputSurfaceInfo(Surface surface, p0 p0Var);
}
