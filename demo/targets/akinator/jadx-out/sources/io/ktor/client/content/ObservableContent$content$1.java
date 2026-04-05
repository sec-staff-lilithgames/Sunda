package io.ktor.client.content;

import av.e;
import bv.f;
import bv.n;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ObservableContent$content$1 extends n implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObservableContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableContent$content$1(ObservableContent observableContent, d<? super ObservableContent$content$1> dVar) {
        super(2, dVar);
        this.this$0 = observableContent;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        ObservableContent$content$1 observableContent$content$1 = new ObservableContent$content$1(this.this$0, dVar);
        observableContent$content$1.L$0 = obj;
        return observableContent$content$1;
    }

    @Override // kv.p
    public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
        return ((ObservableContent$content$1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            WriterScope writerScope = (WriterScope) this.L$0;
            OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.this$0.delegate;
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
