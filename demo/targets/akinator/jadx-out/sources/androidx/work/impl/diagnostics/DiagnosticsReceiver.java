package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import n6.b0;
import n6.c0;
import n6.f0;
import n6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7509a = c0.tagWithPrefix("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        c0 c0Var = c0.get();
        String str = f7509a;
        c0Var.debug(str, "Requesting diagnostics");
        try {
            y0.getInstance(context).enqueue(f0.from((Class<? extends b0>) DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            c0.get().error(str, "WorkManager is not initialized", e10);
        }
    }
}
