package io.ktor.client.utils;

import bv.f;
import bv.n;
import com.ironsource.C3191e4;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import kv.q;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ByteChannelUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3}, l = {23, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", C3191e4.h.f36493l, "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", C3191e4.h.f36493l, "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", C3191e4.h.f36493l, "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.utils.ByteChannelUtilsKt$observable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Long $contentLength;
        final /* synthetic */ q $listener;
        final /* synthetic */ ByteReadChannel $this_observable;
        int I$0;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l9, ByteReadChannel byteReadChannel, q qVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$contentLength = l9;
            this.$this_observable = byteReadChannel;
            this.$listener = qVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contentLength, this.$this_observable, this.$listener, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x019c, code lost:
        
            if (r11.invoke(r6, r4, r22) == r0) goto L63;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:68:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016f A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:68:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0161 -> B:18:0x0059). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 425
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.ByteChannelUtilsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final ByteReadChannel observable(ByteReadChannel byteReadChannel, m context, Long l9, q listener) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(listener, "listener");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (p) new AnonymousClass1(l9, byteReadChannel, listener, null)).getChannel();
    }
}
