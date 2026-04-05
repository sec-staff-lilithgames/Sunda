package com.unity3d.ads.core.domain;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$2$httpClient$config$1", f = "AndroidHttpClientProvider.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidHttpClientProvider$invoke$2$httpClient$config$1 extends n implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$2$httpClient$config$1(AndroidHttpClientProvider androidHttpClientProvider, d<? super AndroidHttpClientProvider$invoke$2$httpClient$config$1> dVar) {
        super(2, dVar);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        AndroidHttpClientProvider$invoke$2$httpClient$config$1 androidHttpClientProvider$invoke$2$httpClient$config$1 = new AndroidHttpClientProvider$invoke$2$httpClient$config$1(this.this$0, dVar);
        androidHttpClientProvider$invoke$2$httpClient$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$2$httpClient$config$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        Object objMo3513invokegIAlus;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                int i11 = z.f87419c;
                ConfigFileFromLocalStorage configFileFromLocalStorage = androidHttpClientProvider.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                objMo3513invokegIAlus = configFileFromLocalStorage.mo3513invokegIAlus(params, this);
                if (objMo3513invokegIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                objMo3513invokegIAlus = ((z) obj).m7139unboximpl();
            }
            objM7131constructorimpl = z.m7131constructorimpl(z.m7130boximpl(objMo3513invokegIAlus));
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        z zVar = (z) objM7131constructorimpl;
        if (zVar == null) {
            return null;
        }
        Object objM7139unboximpl = zVar.m7139unboximpl();
        return (Configuration) (z.m7136isFailureimpl(objM7139unboximpl) ? null : objM7139unboximpl);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Configuration> dVar) {
        return ((AndroidHttpClientProvider$invoke$2$httpClient$config$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
