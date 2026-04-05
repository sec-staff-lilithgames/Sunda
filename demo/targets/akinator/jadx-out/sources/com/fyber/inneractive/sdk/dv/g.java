package com.fyber.inneractive.sdk.dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IAlog.a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.f23522a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MOBILE_ADS, new d());
        com.fyber.inneractive.sdk.factories.i iVar = com.fyber.inneractive.sdk.factories.h.f23524a;
        iVar.f23525a.add(new e());
        com.fyber.inneractive.sdk.factories.c cVar = com.fyber.inneractive.sdk.factories.b.f23520a;
        cVar.f23521a.add(new f(this));
    }
}
