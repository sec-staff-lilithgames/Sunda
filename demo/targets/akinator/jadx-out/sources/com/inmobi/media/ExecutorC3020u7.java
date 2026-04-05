package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ExecutorC3020u7 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f33447a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        this.f33447a.post(runnable);
    }
}
