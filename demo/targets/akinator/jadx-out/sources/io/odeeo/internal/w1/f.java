package io.odeeo.internal.w1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {
    public static final void setAudioOnlySize(io.odeeo.sdk.l lVar, a size) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(size, "size");
        lVar.getAudioOnlyVisualizer$odeeoSdk_release().setLength(size.getLength());
        lVar.getAudioOnlyVisualizer$odeeoSdk_release().setSpace(size.getSpace());
        lVar.getAudioOnlyVisualizer$odeeoSdk_release().setWidth(size.getWidth());
    }
}
