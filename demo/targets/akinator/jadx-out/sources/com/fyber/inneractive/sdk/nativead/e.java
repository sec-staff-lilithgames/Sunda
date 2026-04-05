package com.fyber.inneractive.sdk.nativead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.factories.j;
import com.fyber.inneractive.sdk.factories.k;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar = b.f24184f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            bVar.getClass();
            IAlog.f("context is null, would not start the native cache.", new Object[0]);
        } else if (!bVar.f24187c || !s.a()) {
            bVar.f24185a = applicationContext;
            new Thread(bVar.f24189e, "NativeCache").start();
        }
        com.fyber.inneractive.sdk.factories.d.f23522a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_NATIVE, new c());
        k kVar = j.f23526a;
        kVar.f23527a.add(new d());
    }
}
