package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class XJ implements Executor {
    public static final XJ A01 = new XJ();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A01.execute(runnable);
        }
    }

    public final Handler A01() {
        return this.A00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
