package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26819a;

    public t1(v1 v1Var) {
        super(Looper.getMainLooper());
        this.f26819a = new WeakReference(v1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        v1 v1Var = (v1) this.f26819a.get();
        if (v1Var == null || message.what != 1932593528 || v1Var.f26827d) {
            return;
        }
        v1Var.a(message.getWhen());
    }
}
