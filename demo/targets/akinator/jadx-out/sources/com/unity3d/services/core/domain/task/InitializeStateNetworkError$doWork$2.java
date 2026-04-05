package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateNetworkError$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, d<? super InitializeStateNetworkError$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        InitializeStateNetworkError initializeStateNetworkError;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                int i11 = z.f87419c;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objWithTimeoutOrNull;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                a0.throwOnFailure(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (((x0) obj) == null) {
            ConnectivityMonitor.removeListener(initializeStateNetworkError);
            throw new Exception("No connected events within the timeout!");
        }
        objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        if (z.m7137isSuccessimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = z.m7131constructorimpl(objM7131constructorimpl);
        } else {
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl));
            }
        }
        return z.m7130boximpl(objM7131constructorimpl);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super z> dVar) {
        return ((InitializeStateNetworkError$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
