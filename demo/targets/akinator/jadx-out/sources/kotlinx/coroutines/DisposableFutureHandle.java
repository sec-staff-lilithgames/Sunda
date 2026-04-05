package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class DisposableFutureHandle implements DisposableHandle {
    private final Future<?> future;

    public DisposableFutureHandle(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        this.future.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.future + AbstractJsonLexerKt.END_LIST;
    }
}
