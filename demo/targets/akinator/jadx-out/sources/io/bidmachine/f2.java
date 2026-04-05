package io.bidmachine;

import io.bidmachine.ExpirationHandler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f2 implements ExpirationHandler.TaskScheduler {
    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public void cancelTask(tr.b bVar) {
        bVar.setCancel(true);
        nm.j.cancelBackgroundThreadTask(bVar);
    }

    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public void scheduleTask(tr.b bVar, long j10) {
        bVar.setCancel(false);
        nm.j.onBackgroundThread(bVar, j10);
    }
}
