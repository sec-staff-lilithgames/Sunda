package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T9 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private Handler f35492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T9(String name) {
        super(name);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(Runnable task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        Handler handler = this.f35492a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(T9 t92, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        t92.a(runnable, j10);
    }

    public final void a(Runnable task, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        Handler handler = this.f35492a;
        if (handler != null) {
            handler.postDelayed(task, j10);
        }
    }

    public final void a() {
        this.f35492a = new Handler(getLooper());
    }
}
