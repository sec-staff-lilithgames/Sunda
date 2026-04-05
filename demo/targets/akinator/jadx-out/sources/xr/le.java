package xr;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class le implements pe {
    @Override // xr.pe
    public ScheduledExecutorService createScheduledExecutor() {
        return Executors.newSingleThreadScheduledExecutor(c5.getThreadFactory("grpc-shared-destroyer-%d", true));
    }
}
