package io.ktor.websocket;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.m;
import uu.j1;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum FrameType {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);

    public static final Companion Companion = new Companion(null);
    private static final FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final FrameType get(int i10) {
            if (i10 < 0 || i10 > FrameType.maxOpcode) {
                return null;
            }
            return FrameType.byOpcodeArray[i10];
        }

        private Companion() {
        }
    }

    static {
        FrameType frameType;
        FrameType[] frameTypeArrValues = values();
        if (frameTypeArrValues.length == 0) {
            frameType = null;
        } else {
            frameType = frameTypeArrValues[0];
            int lastIndex = k0.getLastIndex(frameTypeArrValues);
            if (lastIndex != 0) {
                int i10 = frameType.opcode;
                j1 it = new m(1, lastIndex).iterator();
                while (it.hasNext()) {
                    FrameType frameType2 = frameTypeArrValues[it.nextInt()];
                    int i11 = frameType2.opcode;
                    if (i10 < i11) {
                        frameType = frameType2;
                        i10 = i11;
                    }
                }
            }
        }
        e0.checkNotNull(frameType);
        int i12 = frameType.opcode;
        maxOpcode = i12;
        int i13 = i12 + 1;
        FrameType[] frameTypeArr = new FrameType[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            FrameType[] frameTypeArrValues2 = values();
            int length = frameTypeArrValues2.length;
            FrameType frameType3 = null;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                if (i15 >= length) {
                    if (!z10) {
                        break;
                    }
                } else {
                    FrameType frameType4 = frameTypeArrValues2[i15];
                    if (frameType4.opcode == i14) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        frameType3 = frameType4;
                    }
                    i15++;
                }
            }
            frameType3 = null;
            frameTypeArr[i14] = frameType3;
        }
        byOpcodeArray = frameTypeArr;
    }

    FrameType(boolean z10, int i10) {
        this.controlFrame = z10;
        this.opcode = i10;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}
