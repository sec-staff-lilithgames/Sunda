package o5;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f77610a = new j(null);

    @tu.f
    public static final <R> Flow<R> createFlow(y0 y0Var, boolean z10, String[] strArr, Callable<R> callable) {
        return f77610a.createFlow(y0Var, z10, strArr, callable);
    }

    @tu.f
    public static final <R> Object execute(y0 y0Var, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, zu.d<? super R> dVar) {
        return f77610a.execute(y0Var, z10, cancellationSignal, callable, dVar);
    }

    @tu.f
    public static final <R> Object execute(y0 y0Var, boolean z10, Callable<R> callable, zu.d<? super R> dVar) {
        return f77610a.execute(y0Var, z10, callable, dVar);
    }
}
