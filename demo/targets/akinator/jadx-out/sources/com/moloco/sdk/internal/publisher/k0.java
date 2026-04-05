package com.moloco.sdk.internal.publisher;

import androidx.lifecycle.x0;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class k0 {
    public static final void a(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus initStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoInitializationListener, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(initStatus, "initStatus");
        com.moloco.sdk.internal.scheduling.e.a(new x0(2, molocoInitializationListener, initStatus));
    }

    public static final tu.x0 b(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus molocoInitStatus) {
        molocoInitializationListener.onMolocoInitializationStatus(molocoInitStatus);
        return tu.x0.f87415a;
    }
}
