package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelJVMKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends n implements p {
    final /* synthetic */ Object $body;
    final /* synthetic */ HttpResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, HttpResponse httpResponse, d<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> dVar) {
        super(2, dVar);
        this.$body = obj;
        this.$response = httpResponse;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, dVar);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // kv.p
    public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                try {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                } catch (Throwable th2) {
                    HttpResponseKt.complete(this.$response);
                    throw th2;
                }
            } else {
                a0.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.$body;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                if (ByteReadChannelJVMKt.copyTo(byteReadChannel, channel, Long.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HttpResponseKt.complete(this.$response);
            return x0.f87415a;
        } catch (CancellationException e10) {
            CoroutineScopeKt.cancel(this.$response, e10);
            throw e10;
        } catch (Throwable th3) {
            CoroutineScopeKt.cancel(this.$response, "Receive failed", th3);
            throw th3;
        }
    }
}
