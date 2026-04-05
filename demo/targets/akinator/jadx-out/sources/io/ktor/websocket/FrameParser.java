package io.ktor.websocket;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.t;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FrameParser {
    private boolean fin;
    private int lastOpcode;
    private long length;
    private int lengthLength;
    private boolean mask;
    private Integer maskKey;
    private int opcode;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;
    private final AtomicReference<State> state = new AtomicReference<>(State.HEADER0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum State {
        HEADER0,
        LENGTH,
        MASK_KEY,
        BODY
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MASK_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean handleStep(ByteBuffer byteBuffer) {
        State state = this.state.get();
        e0.checkNotNull(state);
        int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i10 == 1) {
            return parseHeader1(byteBuffer);
        }
        if (i10 == 2) {
            return parseLength(byteBuffer);
        }
        if (i10 == 3) {
            return parseMaskKey(byteBuffer);
        }
        if (i10 == 4) {
            return false;
        }
        throw new t();
    }

    private final boolean parseHeader1(ByteBuffer byteBuffer) throws ProtocolViolationException {
        int i10 = 0;
        if (byteBuffer.remaining() < 2) {
            return false;
        }
        byte b10 = byteBuffer.get();
        byte b11 = byteBuffer.get();
        this.fin = (b10 & 128) != 0;
        this.rsv1 = (b10 & 64) != 0;
        this.rsv2 = (b10 & 32) != 0;
        this.rsv3 = (b10 & 16) != 0;
        int i11 = b10 & 15;
        this.opcode = i11;
        if (i11 == 0 && this.lastOpcode == 0) {
            throw new ProtocolViolationException("Can't continue finished frames");
        }
        if (i11 == 0) {
            this.opcode = this.lastOpcode;
        } else if (this.lastOpcode != 0 && !getFrameType().getControlFrame()) {
            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
        }
        if (!getFrameType().getControlFrame()) {
            this.lastOpcode = this.fin ? 0 : this.opcode;
        } else if (!this.fin) {
            throw new ProtocolViolationException("control frames can't be fragmented");
        }
        this.mask = (b11 & 128) != 0;
        int i12 = b11 & AbstractJsonLexerKt.TC_INVALID;
        if (getFrameType().getControlFrame() && i12 > 125) {
            throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
        }
        if (i12 == 126) {
            i10 = 2;
        } else if (i12 == 127) {
            i10 = 8;
        }
        this.lengthLength = i10;
        this.length = i10 == 0 ? i12 : 0L;
        if (i10 > 0) {
            this.state.set(State.LENGTH);
        } else if (this.mask) {
            this.state.set(State.MASK_KEY);
        } else {
            this.state.set(State.BODY);
        }
        return true;
    }

    private final boolean parseLength(ByteBuffer byteBuffer) {
        long j10;
        int iRemaining = byteBuffer.remaining();
        int i10 = this.lengthLength;
        if (iRemaining < i10) {
            return false;
        }
        if (i10 == 2) {
            j10 = byteBuffer.getShort() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        } else {
            if (i10 != 8) {
                throw new IllegalStateException();
            }
            j10 = byteBuffer.getLong();
        }
        this.length = j10;
        this.state.set(this.mask ? State.MASK_KEY : State.BODY);
        return true;
    }

    private final boolean parseMaskKey(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            return false;
        }
        this.maskKey = Integer.valueOf(byteBuffer.getInt());
        this.state.set(State.BODY);
        return true;
    }

    public final void bodyComplete() {
        AtomicReference<State> atomicReference = this.state;
        State state = State.BODY;
        State state2 = State.HEADER0;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                throw new IllegalStateException("It should be state BODY but it is " + this.state.get());
            }
        }
        this.opcode = 0;
        this.length = 0L;
        this.lengthLength = 0;
        this.maskKey = null;
    }

    public final void frame(ByteBuffer bb2) {
        e0.checkNotNullParameter(bb2, "bb");
        if (e0.areEqual(bb2.order(), ByteOrder.BIG_ENDIAN)) {
            while (handleStep(bb2)) {
            }
        } else {
            throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb2.order()).toString());
        }
    }

    public final boolean getBodyReady() {
        return this.state.get() == State.BODY;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final FrameType getFrameType() {
        FrameType frameType = FrameType.Companion.get(this.opcode);
        if (frameType != null) {
            return frameType;
        }
        throw new IllegalStateException(i.b(this.opcode, new StringBuilder("Unsupported opcode ")));
    }

    public final long getLength() {
        return this.length;
    }

    public final boolean getMask() {
        return this.mask;
    }

    public final Integer getMaskKey() {
        return this.maskKey;
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
}
