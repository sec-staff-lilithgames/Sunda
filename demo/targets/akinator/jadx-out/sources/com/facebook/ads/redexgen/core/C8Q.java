package com.facebook.ads.redexgen.core;

import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Q {
    public static String[] A06 = {"", "nhk", "6wGu", "R2WrInr05AqD6", "BdEvLx16NkmWuQrDJldKvob3T9iK8w4Y", "M6vHIG3eEec4aewABnTFZg6yiBplWKQQ", "QcLcQkrsijLVHbF72gur0", "onHOAzLdE60eB9RAzeJwCwAMM5cMFU2V"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C8O A05;

    public C8Q(AudioTrack audioTrack) {
        if (AbstractC09264a.A02 >= 19) {
            this.A05 = new C8O(audioTrack);
            A05();
        } else {
            this.A05 = null;
            A00(3);
        }
    }

    private void A00(int i10) {
        this.A00 = i10;
        switch (i10) {
            case 0:
                this.A03 = 0L;
                this.A01 = -1L;
                this.A02 = System.nanoTime() / 1000;
                this.A04 = 5000L;
                return;
            case 1:
                this.A04 = 5000L;
                return;
            case 2:
            case 3:
                this.A04 = 10000000L;
                return;
            case 4:
                this.A04 = 500000L;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A01() {
        if (this.A05 == null) {
            return -1L;
        }
        C8O c8o = this.A05;
        String[] strArr = A06;
        if (strArr[3].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "Fw4LpErMEjjeSvAcoNX9TuPtkznMdbTC";
        strArr2[7] = "f0n5p1oCE9LYQx7aTjfY3rJEatpCWuo0";
        return c8o.A00();
    }

    public final long A02() {
        return this.A05 != null ? this.A05.A01() : C.TIME_UNSET;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        return this.A00 == 2;
    }

    public final boolean A07(long j10) {
        if (this.A05 == null) {
            return false;
        }
        long j11 = this.A03;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[7].charAt(8)) {
            A06[0] = "";
            if (j10 - j11 < this.A04) {
                return false;
            }
            this.A03 = j10;
            boolean zA02 = this.A05.A02();
            int i10 = this.A00;
            String[] strArr2 = A06;
            if (strArr2[3].length() != strArr2[2].length()) {
                A06[0] = "";
                switch (i10) {
                    case 0:
                        if (!zA02) {
                            if (j10 - this.A02 <= 500000) {
                                return zA02;
                            }
                            A00(3);
                            return zA02;
                        }
                        long jA01 = this.A05.A01();
                        long timestampPositionFrames = this.A02;
                        if (jA01 >= timestampPositionFrames) {
                            long jA00 = this.A05.A00();
                            String[] strArr3 = A06;
                            if (strArr3[6].length() != strArr3[1].length()) {
                                A06[4] = "9pDihLuu39ZUNEKcmAfhT2ejMoup6027";
                                this.A01 = jA00;
                                A00(1);
                                return zA02;
                            }
                        } else {
                            return false;
                        }
                        break;
                    case 1:
                        if (zA02) {
                            long jA002 = this.A05.A00();
                            long timestampPositionFrames2 = this.A01;
                            if (jA002 > timestampPositionFrames2) {
                                A00(2);
                                return zA02;
                            }
                            return zA02;
                        }
                        A05();
                        return zA02;
                    case 2:
                        if (!zA02) {
                            A05();
                            return zA02;
                        }
                        return zA02;
                    case 3:
                        if (zA02) {
                            A05();
                            return zA02;
                        }
                        return zA02;
                    case 4:
                        return zA02;
                    default:
                        throw new IllegalStateException();
                }
            } else {
                throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }
}
