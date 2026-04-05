package io.ktor.util.cio;

import av.e;
import bv.f;
import bv.n;
import io.ktor.util.BufferViewJvmKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.WriterSuspendSession;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.util.cio.FileChannelsKt$readChannel$1$3$1", f = "FileChannels.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"$this$writeSuspendSession"}, s = {"L$0"})
/* loaded from: classes8.dex */
public final class FileChannelsKt$readChannel$1$3$1 extends n implements p {
    final /* synthetic */ WriterScope $$this$writer;
    final /* synthetic */ FileChannel $fileChannel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$1$3$1(WriterScope writerScope, FileChannel fileChannel, d<? super FileChannelsKt$readChannel$1$3$1> dVar) {
        super(2, dVar);
        this.$$this$writer = writerScope;
        this.$fileChannel = fileChannel;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        FileChannelsKt$readChannel$1$3$1 fileChannelsKt$readChannel$1$3$1 = new FileChannelsKt$readChannel$1$3$1(this.$$this$writer, this.$fileChannel, dVar);
        fileChannelsKt$readChannel$1$3$1.L$0 = obj;
        return fileChannelsKt$readChannel$1$3$1;
    }

    @Override // kv.p
    public final Object invoke(WriterSuspendSession writerSuspendSession, d<? super x0> dVar) {
        return ((FileChannelsKt$readChannel$1$3$1) create(writerSuspendSession, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws IOException {
        WriterSuspendSession writerSuspendSession;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            writerSuspendSession = (WriterSuspendSession) this.L$0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            writerSuspendSession = (WriterSuspendSession) this.L$0;
            a0.throwOnFailure(obj);
        }
        while (true) {
            ChunkBuffer chunkBufferRequest = writerSuspendSession.request(1);
            if (chunkBufferRequest == null) {
                this.$$this$writer.getChannel().flush();
                this.L$0 = writerSuspendSession;
                this.label = 1;
                if (writerSuspendSession.tryAwait(1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                int i11 = BufferViewJvmKt.read(this.$fileChannel, chunkBufferRequest);
                if (i11 == -1) {
                    return x0.f87415a;
                }
                writerSuspendSession.written(i11);
            }
        }
    }
}
