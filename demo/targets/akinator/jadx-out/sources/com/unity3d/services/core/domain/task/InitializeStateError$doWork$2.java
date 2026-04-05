package com.unity3d.services.core.domain.task;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateError$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateError.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$2(InitializeStateError.Params params, d<? super InitializeStateError$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateError$doWork$2(this.$params, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        InitializeStateError.Params params = this.$params;
        try {
            int i10 = z.f87419c;
            DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    b.boxBoolean(moduleConfiguration.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage()));
                }
            }
            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
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
        return ((InitializeStateError$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
