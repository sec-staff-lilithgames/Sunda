package com.unity3d.ads.gl;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i10, int i11) {
        super(eglCore);
        e0.checkNotNullParameter(eglCore, "eglCore");
        createOffscreenSurface(i10, i11);
    }

    public final void release() {
        releaseEglSurface();
    }
}
