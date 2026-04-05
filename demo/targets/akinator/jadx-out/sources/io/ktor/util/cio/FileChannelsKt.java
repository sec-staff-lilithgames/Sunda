package io.ktor.util.cio;

import av.e;
import bv.f;
import bv.n;
import com.ironsource.C3191e4;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.jvm.nio.WritingKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FileChannelsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.cio.FileChannelsKt$readChannel$1", f = "FileChannels.kt", i = {0, 0, 1, 1}, l = {44, 63}, m = "invokeSuspend", n = {"$this$use$iv", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: io.ktor.util.cio.FileChannelsKt$readChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ long $endInclusive;
        final /* synthetic */ long $fileLength;
        final /* synthetic */ long $start;
        final /* synthetic */ File $this_readChannel;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, long j11, long j12, File file, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$start = j10;
            this.$endInclusive = j11;
            this.$fileLength = j12;
            this.$this_readChannel = file;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        
            if (r14.writeWhile(r4, r13) == r0) goto L37;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$use$iv", C3191e4.h.f36473b, "closed$iv"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.util.cio.FileChannelsKt$writeChannel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39981 extends n implements p {
        final /* synthetic */ File $this_writeChannel;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39981(File file, d<? super C39981> dVar) {
            super(2, dVar);
            this.$this_writeChannel = file;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C39981 c39981 = new C39981(this.$this_writeChannel, dVar);
            c39981.L$0 = obj;
            return c39981;
        }

        @Override // kv.p
        public final Object invoke(ReaderScope readerScope, d<? super x0> dVar) {
            return ((C39981) create(readerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            RandomAccessFile randomAccessFile;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            ?? r12 = this.label;
            try {
                if (r12 == 0) {
                    a0.throwOnFailure(obj);
                    ReaderScope readerScope = (ReaderScope) this.L$0;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.$this_writeChannel, "rw");
                    ByteReadChannel channel = readerScope.getChannel();
                    FileChannel channel2 = randomAccessFile2.getChannel();
                    e0.checkNotNullExpressionValue(channel2, "file.channel");
                    this.L$0 = randomAccessFile2;
                    this.L$1 = randomAccessFile2;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = WritingKt.copyTo$default(channel, channel2, 0L, this, 2, (Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    randomAccessFile = randomAccessFile2;
                    r12 = randomAccessFile2;
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    randomAccessFile = (RandomAccessFile) this.L$1;
                    Closeable closeable = (Closeable) this.L$0;
                    a0.throwOnFailure(obj);
                    r12 = closeable;
                }
                randomAccessFile.setLength(((Number) obj).longValue());
                r12.close();
                return x0.f87415a;
            } finally {
            }
        }
    }

    public static final ByteReadChannel readChannel(File file, long j10, long j11, m coroutineContext) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.writer(CoroutineScopeKt.CoroutineScope(coroutineContext), new CoroutineName("file-reader").plus(coroutineContext), false, (p) new AnonymousClass1(j10, j11, file.length(), file, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel readChannel$default(File file, long j10, long j11, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = -1;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            mVar = Dispatchers.getIO();
        }
        return readChannel(file, j12, j13, mVar);
    }

    public static final ByteWriteChannel writeChannel(File file, m coroutineContext) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.reader((CoroutineScope) GlobalScope.INSTANCE, new CoroutineName("file-writer").plus(coroutineContext), true, (p) new C39981(file, null)).getChannel();
    }

    public static /* synthetic */ ByteWriteChannel writeChannel$default(File file, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getIO();
        }
        return writeChannel(file, mVar);
    }
}
