package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmt implements GestureDetector.OnGestureListener {
    private final zzdll zza;
    private final zzdml zzb;

    public zzdmt(zzdll zzdllVar, zzdml zzdmlVar) {
        this.zza = zzdllVar;
        this.zzb = zzdmlVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:23:0x0064, B:25:0x006a, B:15:0x0030, B:19:0x0044, B:22:0x0057), top: B:32:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdll r0 = r6.zza     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L8
            goto L75
        L8:
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2a
            float r3 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L2a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            if (r2 <= 0) goto L40
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2c
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 1
            goto L64
        L2a:
            r7 = move-exception
            goto L77
        L2c:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L3e
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            goto L64
        L3e:
            r7 = r1
            goto L64
        L40:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L53
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 8
            goto L64
        L53:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L3e
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 4
        L64:
            int r8 = r0.zzG()     // Catch: java.lang.Throwable -> L2a
            if (r3 != r8) goto L75
            com.google.android.gms.internal.ads.zzdml r8 = r6.zzb     // Catch: java.lang.Throwable -> L2a
            android.widget.FrameLayout r8 = r8.zzr()     // Catch: java.lang.Throwable -> L2a
            r0.zzE(r8, r7)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            return r1
        L75:
            monitor-exit(r6)
            return r1
        L77:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmt.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
