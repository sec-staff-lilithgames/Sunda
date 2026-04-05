package ua;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import wa.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements bb.b {

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.receiver.a f88180a = new com.digitalturbine.ignite.authenticator.receiver.a(this);

    /* renamed from: b, reason: collision with root package name */
    public Context f88181b;

    /* renamed from: c, reason: collision with root package name */
    public wa.a f88182c;

    /* renamed from: d, reason: collision with root package name */
    public h f88183d;

    public d(Context context, wa.a aVar, h hVar) {
        this.f88181b = context.getApplicationContext();
        this.f88182c = aVar;
        this.f88183d = hVar;
    }

    public final void a() {
        com.digitalturbine.ignite.authenticator.receiver.a aVar;
        cb.b.a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f88181b;
        if (context == null || (aVar = this.f88180a) == null || aVar.f21828b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.f88180a.f21828b = true;
    }
}
