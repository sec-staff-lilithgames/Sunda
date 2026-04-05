package com.unity3d.services.core.domain.task;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateComplete$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, d<? super InitializeStateComplete$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                int i11 = z.f87419c;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                e0.checkNotNullExpressionValue(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        b.boxBoolean(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                k4.n nVar = initializeStateComplete.dataStore;
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (nVar.updateData(initializeStateComplete$doWork$2$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            int i12 = z.f87419c;
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
        return ((InitializeStateComplete$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
