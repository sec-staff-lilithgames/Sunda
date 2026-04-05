package yr;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xr.c5;
import xr.oe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements oe {
    @Override // xr.oe
    public void close(Executor executor) {
        ((ExecutorService) executor).shutdown();
    }

    @Override // xr.oe
    public Executor create() {
        return Executors.newCachedThreadPool(c5.getThreadFactory("grpc-okhttp-%d", true));
    }
}
