package io.bidmachine.media3.ui;

import android.os.Handler;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import io.bidmachine.media3.exoplayer.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceSyncGroup f61753a;

    public static /* synthetic */ void a(f0 f0Var, SurfaceView surfaceView, Runnable runnable) {
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        f0Var.f61753a = surfaceSyncGroup;
        io.bidmachine.media3.common.util.a.checkState(surfaceSyncGroup.add(rootSurfaceControl, new al.b(6)));
        runnable.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    public void maybeMarkSyncReadyAndClear() {
        SurfaceSyncGroup surfaceSyncGroup = this.f61753a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.f61753a = null;
        }
    }

    public void postRegister(Handler handler, SurfaceView surfaceView, Runnable runnable) {
        handler.post(new b1(this, 3, surfaceView, runnable));
    }
}
