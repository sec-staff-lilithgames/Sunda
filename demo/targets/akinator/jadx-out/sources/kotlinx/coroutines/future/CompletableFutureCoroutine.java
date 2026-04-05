package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, x0> {
    private final CompletableFuture<T> future;

    public CompletableFutureCoroutine(m mVar, CompletableFuture<T> completableFuture) {
        super(mVar, true, true);
        this.future = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ x0 apply(Object obj, Throwable th2) {
        apply2((CompletableFutureCoroutine<T>) obj, th2);
        return x0.f87415a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th2, boolean z10) {
        this.future.completeExceptionally(th2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T t10) {
        this.future.complete(t10);
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t10, Throwable th2) {
        Job.DefaultImpls.cancel$default((Job) this, (CancellationException) null, 1, (Object) null);
    }
}
