package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadPacketExtensionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.core.ByteReadPacketExtensionsKt$ByteReadPacket$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ byte[] $array;
        final /* synthetic */ l $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, byte[] bArr) {
            super(1);
            this.$block = lVar;
            this.$array = bArr;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ByteBuffer) obj);
            return x0.f87415a;
        }

        public final void invoke(ByteBuffer it) {
            e0.checkNotNullParameter(it, "it");
            this.$block.invoke(this.$array);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.core.ByteReadPacketExtensionsKt$ByteReadPacket$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(ByteBuffer it) {
            e0.checkNotNullParameter(it, "it");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ByteBuffer) obj);
            return x0.f87415a;
        }
    }

    public static final ByteReadPacket ByteReadPacket(byte[] array, int i10, int i11, l block) {
        e0.checkNotNullParameter(array, "array");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
        return ByteReadPacket(byteBufferWrap, new AnonymousClass1(block, array));
    }

    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(ByteBuffer byteBuffer, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        return ByteReadPacket(byteBuffer, lVar);
    }

    private static final ObjectPool<ChunkBuffer> poolFor(ByteBuffer byteBuffer, l lVar) {
        return new SingleByteBufferPool(byteBuffer, lVar);
    }

    public static final ByteReadPacket ByteReadPacket(ByteBuffer bb2, l release) {
        e0.checkNotNullParameter(bb2, "bb");
        e0.checkNotNullParameter(release, "release");
        ObjectPool<ChunkBuffer> objectPoolPoolFor = poolFor(bb2, release);
        ChunkBuffer chunkBufferBorrow = objectPoolPoolFor.borrow();
        chunkBufferBorrow.resetForRead();
        return new ByteReadPacket(chunkBufferBorrow, objectPoolPoolFor);
    }

    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(byte[] array, int i10, int i11, l block, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = array.length;
        }
        e0.checkNotNullParameter(array, "array");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
        return ByteReadPacket(byteBufferWrap, new AnonymousClass1(block, array));
    }
}
