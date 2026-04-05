package kotlinx.coroutines;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BlockingEventLoop extends EventLoopImplBase {
    private final Thread thread;

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    public Thread getThread() {
        return this.thread;
    }
}
