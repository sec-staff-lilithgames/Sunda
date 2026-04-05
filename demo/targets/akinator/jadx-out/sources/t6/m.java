package t6;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f86403a;

    /* renamed from: b, reason: collision with root package name */
    public final f f86404b;

    /* renamed from: c, reason: collision with root package name */
    public final c f86405c;

    /* renamed from: d, reason: collision with root package name */
    public final f f86406d;

    /* renamed from: e, reason: collision with root package name */
    public final f f86407e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, x6.b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    public final f getBatteryChargingTracker() {
        return this.f86404b;
    }

    public final c getBatteryNotLowTracker() {
        return this.f86405c;
    }

    public final Context getContext() {
        return this.f86403a;
    }

    public final f getNetworkStateTracker() {
        return this.f86406d;
    }

    public final f getStorageNotLowTracker() {
        return this.f86407e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, x6.b taskExecutor, f batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        e0.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, x6.b taskExecutor, f batteryChargingTracker, c batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        e0.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        e0.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, x6.b taskExecutor, f batteryChargingTracker, c batteryNotLowTracker, f networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        e0.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        e0.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        e0.checkNotNullParameter(networkStateTracker, "networkStateTracker");
    }

    public m(Context context, x6.b taskExecutor, f batteryChargingTracker, c batteryNotLowTracker, f networkStateTracker, f storageNotLowTracker) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        e0.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        e0.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        e0.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        e0.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f86403a = context;
        this.f86404b = batteryChargingTracker;
        this.f86405c = batteryNotLowTracker;
        this.f86406d = networkStateTracker;
        this.f86407e = storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ m(android.content.Context r8, x6.b r9, t6.f r10, t6.c r11, t6.f r12, t6.f r13, int r14, kotlin.jvm.internal.u r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "getApplicationContext(...)"
            if (r0 == 0) goto L14
            t6.a r0 = new t6.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            t6.c r0 = new t6.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            t6.f r0 = t6.j.NetworkStateTracker(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            t6.k r0 = new t6.k
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.<init>(android.content.Context, x6.b, t6.f, t6.c, t6.f, t6.f, int, kotlin.jvm.internal.u):void");
    }
}
