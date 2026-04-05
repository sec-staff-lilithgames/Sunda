package ci;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface v extends ScheduledExecutorService, t, AutoCloseable {
    @Override // ci.t, ci.r
    /* synthetic */ boolean isPaused();

    @Override // ci.t, ci.r
    /* synthetic */ void pause();

    @Override // ci.t, ci.r
    /* synthetic */ void resume();
}
