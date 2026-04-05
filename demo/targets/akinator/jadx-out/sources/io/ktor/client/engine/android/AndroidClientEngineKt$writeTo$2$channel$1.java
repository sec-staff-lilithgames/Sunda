package io.ktor.client.engine.android;

import av.e;
import bv.f;
import bv.n;
import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1", f = "AndroidClientEngine.kt", i = {}, l = {AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AndroidClientEngineKt$writeTo$2$channel$1 extends n implements p {
    final /* synthetic */ OutgoingContent $this_writeTo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngineKt$writeTo$2$channel$1(OutgoingContent outgoingContent, d<? super AndroidClientEngineKt$writeTo$2$channel$1> dVar) {
        super(2, dVar);
        this.$this_writeTo = outgoingContent;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        AndroidClientEngineKt$writeTo$2$channel$1 androidClientEngineKt$writeTo$2$channel$1 = new AndroidClientEngineKt$writeTo$2$channel$1(this.$this_writeTo, dVar);
        androidClientEngineKt$writeTo$2$channel$1.L$0 = obj;
        return androidClientEngineKt$writeTo$2$channel$1;
    }

    @Override // kv.p
    public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
        return ((AndroidClientEngineKt$writeTo$2$channel$1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            WriterScope writerScope = (WriterScope) this.L$0;
            OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.$this_writeTo;
            ByteWriteChannel channel = writerScope.getChannel();
            this.label = 1;
            if (writeChannelContent.writeTo(channel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }
}
