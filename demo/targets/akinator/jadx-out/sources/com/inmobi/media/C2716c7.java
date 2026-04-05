package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2716c7 implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(C2733d7.f32738e, "access$getTAG$p(...)");
        C2733d7.f32739f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C2733d7.f32739f = false;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(C2733d7.f32738e, "access$getTAG$p(...)");
    }
}
