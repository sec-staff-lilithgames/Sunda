package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2791ge extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "$intent");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        C2825ie.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
        C2925od.a(new zk.n(24, intent, context));
    }
}
