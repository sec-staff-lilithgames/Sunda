package kotlinx.coroutines;

import f.j0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.u;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    public static final Key Key = new Key(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key extends zu.b {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExecutorCoroutineDispatcher _init_$lambda$0(k kVar) {
            if (kVar instanceof ExecutorCoroutineDispatcher) {
                return (ExecutorCoroutineDispatcher) kVar;
            }
            return null;
        }

        private Key() {
            super(CoroutineDispatcher.Key, new j0(2));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();
}
