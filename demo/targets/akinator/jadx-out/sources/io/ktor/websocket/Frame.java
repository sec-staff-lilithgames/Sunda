package io.ktor.websocket;

import io.ktor.util.NIOKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.OutputPrimitivesKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.DisposableHandle;
import sv.g;
import sv.k0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class Frame {
    public static final Companion Companion = new Companion(null);
    private static final byte[] Empty = new byte[0];
    private final ByteBuffer buffer;
    private final byte[] data;
    private final DisposableHandle disposableHandle;
    private final boolean fin;
    private final FrameType frameType;
    private final boolean rsv1;
    private final boolean rsv2;
    private final boolean rsv3;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Binary extends Frame {
        public /* synthetic */ Binary(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13, int i10, u uVar) {
            this(z10, bArr, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z10, byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, FrameType.BINARY, data, NonDisposableHandle.INSTANCE, z11, z12, z13, null);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z10, ByteBuffer buffer) {
            this(z10, NIOKt.moveToByteArray(buffer));
            e0.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z10, byte[] data) {
            this(z10, data, false, false, false);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z10, ByteReadPacket packet) {
            this(z10, StringsKt.readBytes$default(packet, 0, 1, null));
            e0.checkNotNullParameter(packet, "packet");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Close extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(byte[] data) {
            super(true, FrameType.CLOSE, data, NonDisposableHandle.INSTANCE, false, false, false, null);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(ByteReadPacket packet) {
            this(StringsKt.readBytes$default(packet, 0, 1, null));
            e0.checkNotNullParameter(packet, "packet");
        }

        public Close() {
            this(Frame.Empty);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(ByteBuffer buffer) {
            this(NIOKt.moveToByteArray(buffer));
            e0.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Close(CloseReason reason) {
            e0.checkNotNullParameter(reason, "reason");
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
            try {
                OutputPrimitivesKt.writeShort(bytePacketBuilder, reason.getCode());
                StringsKt.writeText$default(bytePacketBuilder, reason.getMessage(), 0, 0, (Charset) null, 14, (Object) null);
                this(bytePacketBuilder.build());
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FrameType.values().length];
                try {
                    iArr[FrameType.BINARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FrameType.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FrameType.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FrameType.PING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FrameType.PONG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Frame byType(boolean z10, FrameType frameType, byte[] data, boolean z11, boolean z12, boolean z13) {
            e0.checkNotNullParameter(frameType, "frameType");
            e0.checkNotNullParameter(data, "data");
            int i10 = WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
            if (i10 == 1) {
                return new Binary(z10, data, z11, z12, z13);
            }
            if (i10 == 2) {
                return new Text(z10, data, z11, z12, z13);
            }
            if (i10 == 3) {
                return new Close(data);
            }
            if (i10 == 4) {
                return new Ping(data);
            }
            if (i10 == 5) {
                return new Pong(data, NonDisposableHandle.INSTANCE);
            }
            throw new t();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Ping extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(byte[] data) {
            super(true, FrameType.PING, data, NonDisposableHandle.INSTANCE, false, false, false, null);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(ByteReadPacket packet) {
            this(StringsKt.readBytes$default(packet, 0, 1, null));
            e0.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(ByteBuffer buffer) {
            this(NIOKt.moveToByteArray(buffer));
            e0.checkNotNullParameter(buffer, "buffer");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Text extends Frame {
        public /* synthetic */ Text(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13, int i10, u uVar) {
            this(z10, bArr, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z10, byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, FrameType.TEXT, data, NonDisposableHandle.INSTANCE, z11, z12, z13, null);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z10, byte[] data) {
            this(z10, data, false, false, false);
            e0.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z10, ByteReadPacket packet) {
            this(z10, StringsKt.readBytes$default(packet, 0, 1, null));
            e0.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z10, ByteBuffer buffer) {
            this(z10, NIOKt.moveToByteArray(buffer));
            e0.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Text(String text) {
            byte[] bArrEncodeToByteArray;
            e0.checkNotNullParameter(text, "text");
            Charset charset = g.f86134b;
            if (e0.areEqual(charset, charset)) {
                bArrEncodeToByteArray = k0.encodeToByteArray(text);
            } else {
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
                bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, text, 0, text.length());
            }
            this(true, bArrEncodeToByteArray);
        }
    }

    public /* synthetic */ Frame(boolean z10, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z11, boolean z12, boolean z13, u uVar) {
        this(z10, frameType, bArr, disposableHandle, z11, z12, z13);
    }

    public final Frame copy() {
        Companion companion = Companion;
        boolean z10 = this.fin;
        FrameType frameType = this.frameType;
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return companion.byType(z10, frameType, bArrCopyOf, this.rsv1, this.rsv2, this.rsv3);
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final DisposableHandle getDisposableHandle() {
        return this.disposableHandle;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final FrameType getFrameType() {
        return this.frameType;
    }

    public final boolean getRsv1() {
        return this.rsv1;
    }

    public final boolean getRsv2() {
        return this.rsv2;
    }

    public final boolean getRsv3() {
        return this.rsv3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Frame ");
        sb2.append(this.frameType);
        sb2.append(" (fin=");
        sb2.append(this.fin);
        sb2.append(", buffer len = ");
        return e3.g.m(sb2, this.data.length, ')');
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Pong extends Frame {
        public /* synthetic */ Pong(byte[] bArr, DisposableHandle disposableHandle, int i10, u uVar) {
            this(bArr, (i10 & 2) != 0 ? NonDisposableHandle.INSTANCE : disposableHandle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(byte[] data, DisposableHandle disposableHandle) {
            super(true, FrameType.PONG, data, disposableHandle, false, false, false, null);
            e0.checkNotNullParameter(data, "data");
            e0.checkNotNullParameter(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteReadPacket packet) {
            this(StringsKt.readBytes$default(packet, 0, 1, null), NonDisposableHandle.INSTANCE);
            e0.checkNotNullParameter(packet, "packet");
        }

        public /* synthetic */ Pong(ByteBuffer byteBuffer, DisposableHandle disposableHandle, int i10, u uVar) {
            this(byteBuffer, (i10 & 2) != 0 ? NonDisposableHandle.INSTANCE : disposableHandle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer buffer, DisposableHandle disposableHandle) {
            this(NIOKt.moveToByteArray(buffer), disposableHandle);
            e0.checkNotNullParameter(buffer, "buffer");
            e0.checkNotNullParameter(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer buffer) {
            this(NIOKt.moveToByteArray(buffer), NonDisposableHandle.INSTANCE);
            e0.checkNotNullParameter(buffer, "buffer");
        }
    }

    private Frame(boolean z10, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z11, boolean z12, boolean z13) {
        this.fin = z10;
        this.frameType = frameType;
        this.data = bArr;
        this.disposableHandle = disposableHandle;
        this.rsv1 = z11;
        this.rsv2 = z12;
        this.rsv3 = z13;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(data)");
        this.buffer = byteBufferWrap;
    }

    public /* synthetic */ Frame(boolean z10, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z11, boolean z12, boolean z13, int i10, u uVar) {
        this(z10, frameType, bArr, (i10 & 8) != 0 ? NonDisposableHandle.INSTANCE : disposableHandle, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, null);
    }
}
