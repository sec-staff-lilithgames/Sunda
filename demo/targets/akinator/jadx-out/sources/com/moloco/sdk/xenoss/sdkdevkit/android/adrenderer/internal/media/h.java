package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h {
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d a(String str);

    Object a(String str, String str2, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> dVar);

    Object a(String str, zu.d<? super g> dVar);

    Job a();

    Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d> b(String str);
}
