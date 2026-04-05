package io.ktor.websocket;

import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RawWebSocketCommonKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {212, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 232, 233, 241, 249}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "fin", "length", "frameType", "flagsAndOpcode", "fin", "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$readFrame$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        byte B$0;
        byte B$1;
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {174, 184, 187, 188, 196, 201}, m = "writeFrame", n = {"$this$writeFrame", "frame", "masking", "length", "$this$writeFrame", "frame", "masking", "length", "formattedLength", "$this$writeFrame", "frame", "masking", "$this$writeFrame", "frame", "masking", "$this$writeFrame", "data", "maskKey"}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41071 extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C41071(zu.d<? super C41071> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.writeFrame(null, null, false, this);
        }
    }

    private static final ByteReadPacket mask(ByteReadPacket byteReadPacket, int i10) {
        DefaultAllocator defaultAllocator = DefaultAllocator.INSTANCE;
        ByteBuffer byteBufferMo4308allocgFvZug = defaultAllocator.mo4308allocgFvZug(4);
        try {
            byteBufferMo4308allocgFvZug.putInt(0, i10);
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                int remaining = (int) byteReadPacket.getRemaining();
                for (int i11 = 0; i11 < remaining; i11++) {
                    bytePacketBuilder.writeByte((byte) (byteReadPacket.readByte() ^ byteBufferMo4308allocgFvZug.get(i11 % 4)));
                }
                return bytePacketBuilder.build();
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        } finally {
            defaultAllocator.mo4309free3GNKZMM(byteBufferMo4308allocgFvZug);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    @io.ktor.util.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFrame(io.ktor.utils.io.ByteReadChannel r24, long r25, int r27, zu.d<? super io.ktor.websocket.Frame> r28) throws io.ktor.websocket.FrameTooBigException, io.ktor.websocket.ProtocolViolationException {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.readFrame(io.ktor.utils.io.ByteReadChannel, long, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        if (r5.writeLong(r11, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        r10 = r12;
        r11 = r2;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        if (r5.writeShort((short) r11, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        if (r5.writePacket(r11, r0) == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.util.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeFrame(io.ktor.utils.io.ByteWriteChannel r10, io.ktor.websocket.Frame r11, boolean r12, zu.d<? super tu.x0> r13) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.writeFrame(io.ktor.utils.io.ByteWriteChannel, io.ktor.websocket.Frame, boolean, zu.d):java.lang.Object");
    }
}
