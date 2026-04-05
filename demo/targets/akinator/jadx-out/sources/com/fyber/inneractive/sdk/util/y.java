package com.fyber.inneractive.sdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f26830a;

    public y(b0 b0Var) {
        this.f26830a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b0 b0Var = this.f26830a;
        b0Var.getClass();
        IAlog.a("%sonReceive. action = %s", IAlog.a(b0Var), intent.getAction());
        b0.a(this.f26830a, context, intent);
    }
}
