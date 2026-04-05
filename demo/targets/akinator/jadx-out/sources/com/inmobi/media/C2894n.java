package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2894n extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (kotlin.jvm.internal.e0.areEqual(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C2978s.c();
        }
    }
}
