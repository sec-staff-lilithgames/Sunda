package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateLoadCache$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, d<? super InitializeStateLoadCache$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object objM7131constructorimpl;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        InitializeStateLoadCache.Params params = this.$params;
        try {
            int i10 = z.f87419c;
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] webViewData = initializeStateLoadCache.getWebViewData();
            boolean z10 = true;
            if (webViewData == null) {
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                String strSha256 = Utilities.Sha256(webViewData);
                Charset charsetForName = Charset.forName(C.UTF8_NAME);
                e0.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
                String str = new String(webViewData, charsetForName);
                if (strSha256 != null && e0.areEqual(strSha256, params.getConfig().getWebViewHash())) {
                    z10 = false;
                }
                if (!z10) {
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(z10, str);
            }
            objM7131constructorimpl = z.m7131constructorimpl(loadCacheResult);
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
        return ((InitializeStateLoadCache$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
