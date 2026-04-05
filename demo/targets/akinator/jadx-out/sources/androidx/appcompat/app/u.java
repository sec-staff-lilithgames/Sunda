package androidx.appcompat.app;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
