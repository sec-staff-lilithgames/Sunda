package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdCridThreadHandler {
    private final String name;
    private final Runnable runnable;
    private final pr.n tag;
    private Thread thread;

    public AdCridThreadHandler(String crid) {
        kotlin.jvm.internal.e0.checkNotNullParameter(crid, "crid");
        this.tag = new pr.n("AdCridThreadManager");
        String strK = a.b.k("io.bidmachine.crid.", crid);
        this.name = strK;
        t0 t0Var = new t0(this, 1);
        this.runnable = t0Var;
        Thread thread = new Thread(t0Var, strK);
        thread.start();
        this.thread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AdCridThreadHandler this$0) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Thread threadCurrentThread = Thread.currentThread();
        try {
            nm.a.d(this$0.tag, this$0.name + " started");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException unused) {
            threadCurrentThread.interrupt();
        }
    }

    public final void destroy() {
        Thread thread = this.thread;
        if (thread != null) {
            thread.interrupt();
        }
        this.thread = null;
        nm.a.d(this.tag, this.name + " stopped");
    }
}
