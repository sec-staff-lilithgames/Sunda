package kotlinx.coroutines.android;

import kotlin.jvm.internal.u;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(u uVar) {
        this();
    }

    @Override // kotlinx.coroutines.Delay
    @f
    public Object delay(long j10, d<? super x0> dVar) {
        return Delay.DefaultImpls.delay(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract HandlerDispatcher getImmediate();

    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j10, runnable, mVar);
    }

    private HandlerDispatcher() {
    }
}
