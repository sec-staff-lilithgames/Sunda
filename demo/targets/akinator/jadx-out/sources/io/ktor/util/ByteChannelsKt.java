package io.ktor.util;

import av.e;
import bv.f;
import bv.n;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.v;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ByteChannelsKt {
    private static final long CHUNK_BUFFER_SIZE = 4096;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1, 1, 1, 2, 2}, l = {61, 63, 64}, m = "invokeSuspend", n = {"$this$use$iv", "it", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$4", "I$0", "L$0", "I$0"})
    /* renamed from: io.ktor.util.ByteChannelsKt$copyToBoth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ByteWriteChannel $first;
        final /* synthetic */ ByteWriteChannel $second;
        final /* synthetic */ ByteReadChannel $this_copyToBoth;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_copyToBoth = byteReadChannel;
            this.$first = byteWriteChannel;
            this.$second = byteWriteChannel2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_copyToBoth, this.$first, this.$second, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
        
            if (r6.writePacket(r12, r11) != r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x005d, TryCatch #6 {all -> 0x005d, blocks: (B:42:0x00de, B:24:0x0063, B:26:0x006b, B:28:0x0073, B:30:0x007b, B:33:0x0092, B:51:0x00ed, B:52:0x00ee, B:55:0x0101, B:19:0x0059, B:34:0x009b, B:41:0x00d1, B:49:0x00eb, B:48:0x00e8, B:45:0x00e3), top: B:74:0x0059, inners: #2, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x0027, PHI: r1 r6 r7 r8 r10 r12
          0x00b8: PHI (r1v3 io.ktor.utils.io.ByteReadChannel) = (r1v4 io.ktor.utils.io.ByteReadChannel), (r1v7 io.ktor.utils.io.ByteReadChannel) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r6v2 io.ktor.utils.io.ByteWriteChannel) = (r6v3 io.ktor.utils.io.ByteWriteChannel), (r6v8 io.ktor.utils.io.ByteWriteChannel) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r7v2 io.ktor.utils.io.ByteWriteChannel) = (r7v3 io.ktor.utils.io.ByteWriteChannel), (r7v7 io.ktor.utils.io.ByteWriteChannel) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r8v3 java.io.Closeable) = (r8v5 java.io.Closeable), (r8v10 java.io.Closeable) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r10v0 int) = (r10v1 int), (r10v4 int) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r12v11 io.ktor.utils.io.core.ByteReadPacket) = (r12v16 io.ktor.utils.io.core.ByteReadPacket), (r12v28 io.ktor.utils.io.core.ByteReadPacket) binds: [B:36:0x00b5, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x0027, blocks: (B:8:0x0022, B:35:0x009e, B:38:0x00b8), top: B:71:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x005d, blocks: (B:42:0x00de, B:24:0x0063, B:26:0x006b, B:28:0x0073, B:30:0x007b, B:33:0x0092, B:51:0x00ed, B:52:0x00ee, B:55:0x0101, B:19:0x0059, B:34:0x009b, B:41:0x00d1, B:49:0x00eb, B:48:0x00e8, B:45:0x00e3), top: B:74:0x0059, inners: #2, #5 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ce -> B:42:0x00de). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d1 -> B:42:0x00de). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.ByteChannelsKt$copyToBoth$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ ByteWriteChannel $first;
        final /* synthetic */ ByteWriteChannel $second;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2) {
            super(1);
            this.$first = byteWriteChannel;
            this.$second = byteWriteChannel2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                return;
            }
            this.$first.close(th2);
            this.$second.close(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 31}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39871 extends n implements p {
        final /* synthetic */ ByteChannel $first;
        final /* synthetic */ ByteChannel $second;
        final /* synthetic */ ByteReadChannel $this_split;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.util.ByteChannelsKt$split$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05871 extends n implements p {
            final /* synthetic */ byte[] $buffer;
            final /* synthetic */ ByteChannel $first;
            final /* synthetic */ int $read;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05871(ByteChannel byteChannel, byte[] bArr, int i10, d<? super C05871> dVar) {
                super(2, dVar);
                this.$first = byteChannel;
                this.$buffer = bArr;
                this.$read = i10;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C05871(this.$first, this.$buffer, this.$read, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    ByteChannel byteChannel = this.$first;
                    byte[] bArr = this.$buffer;
                    int i11 = this.$read;
                    this.label = 1;
                    if (byteChannel.writeFully(bArr, 0, i11, this) == coroutine_suspended) {
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

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C05871) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.util.ByteChannelsKt$split$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ byte[] $buffer;
            final /* synthetic */ int $read;
            final /* synthetic */ ByteChannel $second;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ByteChannel byteChannel, byte[] bArr, int i10, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$second = byteChannel;
                this.$buffer = bArr;
                this.$read = i10;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.$second, this.$buffer, this.$read, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    ByteChannel byteChannel = this.$second;
                    byte[] bArr = this.$buffer;
                    int i11 = this.$read;
                    this.label = 1;
                    if (byteChannel.writeFully(bArr, 0, i11, this) == coroutine_suspended) {
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

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39871(ByteReadChannel byteReadChannel, ByteChannel byteChannel, ByteChannel byteChannel2, d<? super C39871> dVar) {
            super(2, dVar);
            this.$this_split = byteReadChannel;
            this.$first = byteChannel;
            this.$second = byteChannel2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            C39871 c39871 = new C39871(this.$this_split, this.$first, this.$second, dVar);
            c39871.L$0 = obj;
            return c39871;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:17:0x0044, B:19:0x004c, B:22:0x005b, B:25:0x009a, B:29:0x00b4, B:14:0x002e), top: B:37:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:7:0x0016, B:17:0x0044, B:19:0x004c, B:22:0x005b, B:25:0x009a, B:29:0x00b4, B:14:0x002e), top: B:37:0x0008 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v6, types: [byte[], java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:17:0x0044). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt.C39871.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C39871) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.ByteChannelsKt$split$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39882 extends f0 implements l {
        final /* synthetic */ ByteChannel $first;
        final /* synthetic */ ByteChannel $second;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39882(ByteChannel byteChannel, ByteChannel byteChannel2) {
            super(1);
            this.$first = byteChannel;
            this.$second = byteChannel2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                return;
            }
            this.$first.cancel(th2);
            this.$second.cancel(th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.ByteChannelsKt", f = "ByteChannels.kt", i = {}, l = {91}, m = "toByteArray", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$toByteArray$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39891 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public C39891(d<? super C39891> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelsKt.toByteArray(null, this);
        }
    }

    public static final void copyToBoth(ByteReadChannel byteReadChannel, ByteWriteChannel first, ByteWriteChannel second) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        e0.checkNotNullParameter(first, "first");
        e0.checkNotNullParameter(second, "second");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new AnonymousClass1(byteReadChannel, first, second, null), 2, null).invokeOnCompletion(new AnonymousClass2(first, second));
    }

    public static final v split(ByteReadChannel byteReadChannel, CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        ByteChannel ByteChannel = ByteChannelKt.ByteChannel(true);
        ByteChannel ByteChannel2 = ByteChannelKt.ByteChannel(true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C39871(byteReadChannel, ByteChannel, ByteChannel2, null), 3, null).invokeOnCompletion(new C39882(ByteChannel, ByteChannel2));
        return tu.e0.to(ByteChannel, ByteChannel2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel r8, zu.d<? super byte[]> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.util.ByteChannelsKt.C39891
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.util.ByteChannelsKt$toByteArray$1 r0 = (io.ktor.util.ByteChannelsKt.C39891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.util.ByteChannelsKt$toByteArray$1 r0 = new io.ktor.util.ByteChannelsKt$toByteArray$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            tu.a0.throwOnFailure(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r9)
            r4.label = r7
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L44
            return r0
        L44:
            io.ktor.utils.io.core.ByteReadPacket r9 = (io.ktor.utils.io.core.ByteReadPacket) r9
            r8 = 0
            r0 = 0
            byte[] r8 = io.ktor.utils.io.core.StringsKt.readBytes$default(r9, r8, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt.toByteArray(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }
}
