package com.inmobi.media;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2744e1 extends I3 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f32793b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32795d;

    /* renamed from: e, reason: collision with root package name */
    public final ActivityManager f32796e;

    /* renamed from: f, reason: collision with root package name */
    public final I6 f32797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2744e1(Context context, J3 listener, long j10, int i10) {
        super(listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f32793b = context;
        this.f32794c = j10;
        this.f32795d = i10;
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f32796e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        this.f32797f = H6.a(context, "appClose");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Type inference failed for: r17v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.inmobi.media.C2744e1 r16, android.app.ApplicationExitInfo r17) {
        /*
            r0 = r16
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            com.inmobi.media.J3 r1 = r0.f31864a
            com.inmobi.media.f1 r2 = new com.inmobi.media.f1
            int r3 = r17.getReason()
            java.lang.String r4 = r17.getDescription()
            java.io.InputStream r5 = r17.getTraceInputStream()
            int r0 = r0.f32795d
            java.lang.String r6 = "startMarker"
            java.lang.String r7 = "\"main\""
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r6)
            java.lang.String r6 = "endMarker"
            java.lang.String r8 = "ZygoteInit.java"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            if (r5 == 0) goto L9e
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.io.IOException -> L93
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L93
            r11.<init>(r5)     // Catch: java.io.IOException -> L93
            r10.<init>(r11)     // Catch: java.io.IOException -> L93
            r5 = 0
            r11 = r0
            r12 = r5
        L40:
            java.lang.String r13 = r10.readLine()     // Catch: java.lang.Throwable -> L55
            if (r13 == 0) goto L87
            java.lang.String r14 = "\n"
            if (r0 <= 0) goto L59
            if (r12 != 0) goto L59
            r9.append(r13)     // Catch: java.lang.Throwable -> L55
            r9.append(r14)     // Catch: java.lang.Throwable -> L55
            int r0 = r0 + (-1)
            goto L59
        L55:
            r0 = move-exception
            r17 = r9
            goto L8f
        L59:
            r15 = 0
            r16 = r0
            r0 = 2
            r17 = r9
            boolean r9 = sv.k0.startsWith$default(r13, r7, r5, r0, r15)     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            if (r9 != r0) goto L6d
            sv.g0.clear(r17)     // Catch: java.lang.Throwable -> L6b
            r12 = r0
            goto L6d
        L6b:
            r0 = move-exception
            goto L8f
        L6d:
            if (r12 == 0) goto L77
            int r11 = r11 + (-1)
            r6.append(r13)     // Catch: java.lang.Throwable -> L6b
            r6.append(r14)     // Catch: java.lang.Throwable -> L6b
        L77:
            r9 = 2
            boolean r9 = sv.n0.contains$default(r13, r8, r5, r9, r15)     // Catch: java.lang.Throwable -> L6b
            if (r9 != r0) goto L7f
            goto L89
        L7f:
            if (r11 > 0) goto L82
            goto L89
        L82:
            r0 = r16
            r9 = r17
            goto L40
        L87:
            r17 = r9
        L89:
            r10.close()     // Catch: java.io.IOException -> L8d
            goto La0
        L8d:
            r0 = move-exception
            goto L96
        L8f:
            r10.close()     // Catch: java.io.IOException -> L8d
            throw r0     // Catch: java.io.IOException -> L8d
        L93:
            r0 = move-exception
            r17 = r9
        L96:
            java.lang.String r5 = "CommonExt"
            java.lang.String r7 = "Error reading from input stream"
            android.util.Log.e(r5, r7, r0)
            goto La0
        L9e:
            r17 = r9
        La0:
            int r0 = r6.length()
            java.lang.String r5 = "toString(...)"
            if (r0 != 0) goto Lb0
            java.lang.String r0 = r17.toString()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r5)
            goto Lb7
        Lb0:
            java.lang.String r0 = r6.toString()
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r5)
        Lb7:
            r2.<init>(r4, r3, r0)
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2744e1.a(com.inmobi.media.e1, android.app.ApplicationExitInfo):void");
    }

    @Override // com.inmobi.media.I3
    public final void b() {
    }

    @Override // com.inmobi.media.I3
    public final void a() {
        zg.h runnable = new zg.h(this, 13);
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2809hf.f32906a.execute(runnable);
    }

    public static final void a(C2744e1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        List<ApplicationExitInfo> historicalProcessExitReasons = this$0.f32796e.getHistoricalProcessExitReasons(this$0.f32793b.getPackageName(), 0, 10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        I6 i62 = this$0.f32797f;
        i62.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter("exitReasonTimestamp", C3191e4.h.W);
        long j10 = i62.f31866a.getLong("exitReasonTimestamp", 0L);
        Iterator<T> it = historicalProcessExitReasons.iterator();
        long timestamp = j10;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoB = sn.t.b(it.next());
            if (applicationExitInfoB.getTimestamp() > j10) {
                long j11 = this$0.f32794c;
                zk.n runnable = new zk.n(23, this$0, applicationExitInfoB);
                ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
                kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
                AbstractC2809hf.f32906a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
                if (applicationExitInfoB.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfoB.getTimestamp();
                }
            }
        }
        I6.a(this$0.f32797f, "exitReasonTimestamp", timestamp, false, 4, (Object) null);
    }
}
