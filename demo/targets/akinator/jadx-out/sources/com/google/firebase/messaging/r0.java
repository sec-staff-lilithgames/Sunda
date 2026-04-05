package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.applovin.impl.ga;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r0 extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public final l f29874b;

    public r0(l lVar) {
        this.f29874b = lVar;
    }

    public final void a(s0 s0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f29874b.handle(s0Var.f29877a).addOnCompleteListener(new ga(2), new af.g(s0Var, 11));
    }
}
