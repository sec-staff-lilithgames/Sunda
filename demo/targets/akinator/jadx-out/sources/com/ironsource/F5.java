package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class F5 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private Handler f34355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(String name) {
        super(name);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        Handler handler = this.f34355a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f34355a = new Handler(getLooper());
    }
}
