package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"configuration"}, s = {"L$0"})
/* loaded from: classes8.dex */
public final class InitializeStateConfig$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, d<? super InitializeStateConfig$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        Object objMo3513invokegIAlus;
        Configuration configuration = "Unity Ads init: load configuration from ";
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    InitializeStateConfig.Params params = this.$params;
                    InitializeStateConfig initializeStateConfig = this.this$0;
                    int i11 = z.f87419c;
                    DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                    Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo3513invokegIAlus = initializeStateConfigWithLoader.mo3513invokegIAlus((BaseParams) params2, (d) this);
                    configuration = configuration2;
                    if (objMo3513invokegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Configuration configuration3 = (Configuration) this.L$0;
                    a0.throwOnFailure(obj);
                    objMo3513invokegIAlus = ((z) obj).m7139unboximpl();
                    configuration = configuration3;
                }
                a0.throwOnFailure(objMo3513invokegIAlus);
                objM7131constructorimpl = z.m7131constructorimpl((Configuration) objMo3513invokegIAlus);
            } catch (NetworkIOException e10) {
                throw new InitializationException(ErrorState.NetworkConfigRequest, e10, configuration);
            }
        } catch (CancellationException e11) {
            throw e11;
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
        return ((InitializeStateConfig$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
