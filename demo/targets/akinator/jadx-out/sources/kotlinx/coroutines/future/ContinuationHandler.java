package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, x0> {
    public volatile d<? super T> cont;

    public ContinuationHandler(d<? super T> dVar) {
        this.cont = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ x0 apply(Object obj, Throwable th2) {
        apply2((ContinuationHandler<T>) obj, th2);
        return x0.f87415a;
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t10, Throwable th2) {
        Throwable cause;
        d<? super T> dVar = this.cont;
        if (dVar == null) {
            return;
        }
        if (th2 == null) {
            dVar.resumeWith(z.m7131constructorimpl(t10));
            return;
        }
        CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th2 = cause;
        }
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
    }
}
