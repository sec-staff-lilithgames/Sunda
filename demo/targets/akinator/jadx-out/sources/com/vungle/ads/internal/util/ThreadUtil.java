package com.vungle.ads.internal.util;

import a2.d0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ThreadUtil {
    public static final ThreadUtil INSTANCE = new ThreadUtil();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m3671runOnUiThread$lambda0(a tmp0) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m3672runOnUiThread$lambda1(a tmp0) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(a block) {
        e0.checkNotNullParameter(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor != null) {
            executor.execute(new d0(1, block));
        } else {
            UI_HANDLER.post(new d0(2, block));
        }
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }
}
