package kotlinx.coroutines.internal;

import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import tu.f;
import tu.k;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    private final Throwable cause;
    private final String errorHint;

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th2, String str, int i10, u uVar) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    private final Void missing() {
        String strConcat;
        if (this.cause == null) {
            MainDispatchersKt.throwMissingMainDispatcherException();
            throw new k();
        }
        String str = this.errorHint;
        if (str == null || (strConcat = ". ".concat(str)) == null) {
            strConcat = "";
        }
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(strConcat), this.cause);
    }

    @Override // kotlinx.coroutines.Delay
    @f
    public Object delay(long j10, d<? super x0> dVar) {
        return Delay.DefaultImpls.delay(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j10, Runnable runnable, m mVar) {
        missing();
        throw new k();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(m mVar) {
        missing();
        throw new k();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        missing();
        throw new k();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo5198scheduleResumeAfterDelay(long j10, CancellableContinuation cancellableContinuation) {
        scheduleResumeAfterDelay(j10, (CancellableContinuation<? super x0>) cancellableContinuation);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        return o2.q(sb2, str, AbstractJsonLexerKt.END_LIST);
    }

    public MissingMainCoroutineDispatcher(Throwable th2, String str) {
        this.cause = th2;
        this.errorHint = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo5197dispatch(m mVar, Runnable runnable) {
        missing();
        throw new k();
    }

    public Void scheduleResumeAfterDelay(long j10, CancellableContinuation<? super x0> cancellableContinuation) {
        missing();
        throw new k();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }
}
