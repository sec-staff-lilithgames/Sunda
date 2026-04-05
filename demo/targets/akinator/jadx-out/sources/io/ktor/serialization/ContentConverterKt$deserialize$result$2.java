package io.ktor.serialization;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import io.ktor.utils.io.ByteReadChannel;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ContentConverterKt$deserialize$result$2 extends n implements p {
    final /* synthetic */ ByteReadChannel $body;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterKt$deserialize$result$2(ByteReadChannel byteReadChannel, d<? super ContentConverterKt$deserialize$result$2> dVar) {
        super(2, dVar);
        this.$body = byteReadChannel;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(this.$body, dVar);
        contentConverterKt$deserialize$result$2.L$0 = obj;
        return contentConverterKt$deserialize$result$2;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        return b.boxBoolean(this.L$0 != null || this.$body.isClosedForRead());
    }

    @Override // kv.p
    public final Object invoke(Object obj, d<? super Boolean> dVar) {
        return ((ContentConverterKt$deserialize$result$2) create(obj, dVar)).invokeSuspend(x0.f87415a);
    }
}
