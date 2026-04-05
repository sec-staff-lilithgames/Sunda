package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;
import kotlin.jvm.internal.e0;
import n6.c0;
import t6.e;
import t6.f;
import x6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker extends f {

    /* renamed from: f, reason: collision with root package name */
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f7507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public BroadcastReceiverConstraintTracker(Context context, b taskExecutor) {
        super(context, taskExecutor);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f7507f = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                VMRunner.invoke("rDouhG30x6aNrhrR", new Object[]{this, context2, intent});
            }
        };
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Intent intent);

    @Override // t6.f
    public void startTracking() {
        c0.get().debug(e.f86391a, getClass().getSimpleName().concat(": registering receiver"));
        this.f86393b.registerReceiver(this.f7507f, getIntentFilter());
    }

    @Override // t6.f
    public void stopTracking() {
        c0.get().debug(e.f86391a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f86393b.unregisterReceiver(this.f7507f);
    }
}
