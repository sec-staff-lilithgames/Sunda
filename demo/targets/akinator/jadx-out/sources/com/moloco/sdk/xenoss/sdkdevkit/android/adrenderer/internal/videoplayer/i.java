package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i {
    public static final Flow<Boolean> b(j jVar, View view) {
        Flow<Boolean> flowA;
        return (view == null || (flowA = jVar.a(view)) == null) ? FlowKt.flowOf(Boolean.FALSE) : flowA;
    }
}
