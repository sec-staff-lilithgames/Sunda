package io.ktor.http.content;

import bv.f;
import bv.n;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.WriterScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {93, 95}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class OutgoingContent$ReadChannelContent$readFrom$1 extends n implements p {
    final /* synthetic */ qv.p $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OutgoingContent.ReadChannelContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(OutgoingContent.ReadChannelContent readChannelContent, qv.p pVar, d<? super OutgoingContent$ReadChannelContent$readFrom$1> dVar) {
        super(2, dVar);
        this.this$0 = readChannelContent;
        this.$range = pVar;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, dVar);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // kv.p
    public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelJVMKt.copyTo(r1, r9, r4, r8) == r0) goto L16;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            tu.a0.throwOnFailure(r9)
            goto L75
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            java.lang.Object r1 = r8.L$1
            io.ktor.utils.io.ByteReadChannel r1 = (io.ktor.utils.io.ByteReadChannel) r1
            java.lang.Object r3 = r8.L$0
            io.ktor.utils.io.WriterScope r3 = (io.ktor.utils.io.WriterScope) r3
            tu.a0.throwOnFailure(r9)
            goto L4b
        L26:
            tu.a0.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            io.ktor.utils.io.WriterScope r9 = (io.ktor.utils.io.WriterScope) r9
            io.ktor.http.content.OutgoingContent$ReadChannelContent r1 = r8.this$0
            io.ktor.utils.io.ByteReadChannel r1 = r1.readFrom()
            qv.p r4 = r8.$range
            java.lang.Long r4 = r4.getStart()
            long r4 = r4.longValue()
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r3 = r1.discard(r4, r8)
            if (r3 != r0) goto L4a
            goto L74
        L4a:
            r3 = r9
        L4b:
            qv.p r9 = r8.$range
            java.lang.Long r9 = r9.getEndInclusive()
            long r4 = r9.longValue()
            qv.p r9 = r8.$range
            java.lang.Long r9 = r9.getStart()
            long r6 = r9.longValue()
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            io.ktor.utils.io.ByteWriteChannel r9 = r3.getChannel()
            r3 = 0
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannelJVMKt.copyTo(r1, r9, r4, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
