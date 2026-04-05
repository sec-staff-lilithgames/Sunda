package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f29651b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f29652a;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.f29652a = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (g.f29675k) {
            try {
                Iterator it = g.f29676l.values().iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        unregister();
    }

    public void unregister() {
        this.f29652a.unregisterReceiver(this);
    }
}
