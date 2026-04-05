package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface e {
    Banner a(Context context, com.moloco.sdk.internal.services.r rVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, a aVar, k kVar, com.moloco.sdk.acm.recorder.c cVar);

    InterstitialAd a(Context context, com.moloco.sdk.internal.services.r rVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, com.moloco.sdk.acm.recorder.c cVar);

    NativeAd a(Context context, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.y yVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, com.moloco.sdk.internal.services.i iVar, com.moloco.sdk.internal.services.k kVar2, com.moloco.sdk.acm.recorder.c cVar);

    Banner b(Context context, com.moloco.sdk.internal.services.r rVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, a aVar, k kVar, com.moloco.sdk.acm.recorder.c cVar);

    RewardedInterstitialAd b(Context context, com.moloco.sdk.internal.services.r rVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, com.moloco.sdk.acm.recorder.c cVar);

    Banner c(Context context, com.moloco.sdk.internal.services.r rVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.publisher.j jVar2, a aVar, k kVar, com.moloco.sdk.acm.recorder.c cVar);
}
