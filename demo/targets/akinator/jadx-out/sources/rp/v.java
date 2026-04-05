package rp;

import gn.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class v {
    public static int a(io.bidmachine.media3.common.util.l0 l0Var, int i10, int i11, int i12) {
        io.bidmachine.media3.common.util.a.checkArgument(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        qh.f.checkedAdd(qh.f.checkedAdd(i13, i14), 1 << i12);
        if (l0Var.bitsLeft() < i10) {
            return -1;
        }
        int bits = l0Var.readBits(i10);
        if (bits == i13) {
            if (l0Var.bitsLeft() < i11) {
                return -1;
            }
            int bits2 = l0Var.readBits(i11);
            bits += bits2;
            if (bits2 == i14) {
                if (l0Var.bitsLeft() < i12) {
                    return -1;
                }
                return l0Var.readBits(i12) + bits;
            }
        }
        return bits;
    }

    public static void b(io.bidmachine.media3.common.util.l0 l0Var) {
        l0Var.skipBits(3);
        l0Var.skipBits(8);
        boolean bit = l0Var.readBit();
        boolean bit2 = l0Var.readBit();
        if (bit) {
            l0Var.skipBits(5);
        }
        if (bit2) {
            l0Var.skipBits(6);
        }
    }

    public static void c(io.bidmachine.media3.common.util.l0 l0Var) {
        int bits;
        int bits2 = l0Var.readBits(2);
        if (bits2 == 0) {
            l0Var.skipBits(6);
            return;
        }
        int iA = a(l0Var, 5, 8, 16) + 1;
        if (bits2 == 1) {
            l0Var.skipBits(iA * 7);
            return;
        }
        if (bits2 == 2) {
            boolean bit = l0Var.readBit();
            int i10 = bit ? 1 : 5;
            int i11 = bit ? 7 : 5;
            int i12 = bit ? 8 : 6;
            int i13 = 0;
            while (i13 < iA) {
                if (l0Var.readBit()) {
                    l0Var.skipBits(7);
                    bits = 0;
                } else {
                    if (l0Var.readBits(2) == 3 && l0Var.readBits(i11) * i10 != 0) {
                        l0Var.skipBit();
                    }
                    bits = l0Var.readBits(i12) * i10;
                    if (bits != 0 && bits != 180) {
                        l0Var.skipBit();
                    }
                    l0Var.skipBit();
                }
                if (bits != 0 && bits != 180 && l0Var.readBit()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    public static boolean isSyncWord(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int parseAudioTruncationInfo(io.bidmachine.media3.common.util.l0 l0Var) {
        if (!l0Var.readBit()) {
            return 0;
        }
        l0Var.skipBits(2);
        return l0Var.readBits(13);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean parseMhasPacketHeader(io.bidmachine.media3.common.util.l0 r18, rp.t r19) throws gn.z0 {
        /*
            r0 = r18
            r1 = r19
            r0.getBytePosition()
            r2 = 3
            r3 = 8
            int r2 = a(r0, r2, r3, r3)
            r1.f84910a = r2
            r4 = 0
            r5 = -1
            if (r2 != r5) goto L15
            return r4
        L15:
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L27
            r6 = r9
            goto L28
        L27:
            r6 = r4
        L28:
            io.bidmachine.media3.common.util.a.checkArgument(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = qh.h.checkedAdd(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            qh.h.checkedAdd(r14, r10)
            int r6 = r0.bitsLeft()
            r10 = -1
            if (r6 >= r2) goto L47
        L45:
            r14 = r10
            goto L6c
        L47:
            long r14 = r0.readBitsToLong(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6c
            int r6 = r0.bitsLeft()
            if (r6 >= r3) goto L56
            goto L45
        L56:
            long r16 = r0.readBitsToLong(r3)
            long r14 = r14 + r16
            int r3 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r3 != 0) goto L6c
            int r3 = r0.bitsLeft()
            if (r3 >= r7) goto L67
            goto L45
        L67:
            long r6 = r0.readBitsToLong(r7)
            long r14 = r14 + r6
        L6c:
            r1.f84911b = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L73
            return r4
        L73:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lae
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La0
            int r3 = r1.f84910a
            r6 = 0
            if (r3 == r9) goto L99
            if (r3 == r2) goto L92
            r2 = 17
            if (r3 == r2) goto L8b
            goto La0
        L8b:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            gn.z0 r0 = gn.z0.createForMalformedContainer(r0, r6)
            throw r0
        L92:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            gn.z0 r0 = gn.z0.createForMalformedContainer(r0, r6)
            throw r0
        L99:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            gn.z0 r0 = gn.z0.createForMalformedContainer(r0, r6)
            throw r0
        La0:
            r2 = 11
            r3 = 24
            int r0 = a(r0, r2, r3, r3)
            r1.f84912c = r0
            if (r0 == r5) goto Lad
            return r9
        Lad:
            return r4
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r2)
            long r1 = r1.f84911b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            gn.z0 r0 = gn.z0.createForUnsupportedContainerFeature(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.v.parseMhasPacketHeader(io.bidmachine.media3.common.util.l0, rp.t):boolean");
    }

    public static u parseMpegh3daConfig(io.bidmachine.media3.common.util.l0 l0Var) throws z0 {
        int bits;
        int i10;
        char c10;
        int i11;
        int i12;
        int bits2;
        int bits3 = l0Var.readBits(8);
        int bits4 = l0Var.readBits(5);
        if (bits4 != 31) {
            switch (bits4) {
                case 0:
                    bits = 96000;
                    break;
                case 1:
                    bits = 88200;
                    break;
                case 2:
                    bits = 64000;
                    break;
                case 3:
                    bits = 48000;
                    break;
                case 4:
                    bits = 44100;
                    break;
                case 5:
                    bits = 32000;
                    break;
                case 6:
                    bits = 24000;
                    break;
                case 7:
                    bits = 22050;
                    break;
                case 8:
                    bits = 16000;
                    break;
                case 9:
                    bits = 12000;
                    break;
                case 10:
                    bits = 11025;
                    break;
                case 11:
                    bits = 8000;
                    break;
                case 12:
                    bits = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw z0.createForUnsupportedContainerFeature("Unsupported sampling rate index " + bits4);
                case 15:
                    bits = 57600;
                    break;
                case 16:
                    bits = 51200;
                    break;
                case 17:
                    bits = 40000;
                    break;
                case 18:
                    bits = 38400;
                    break;
                case 19:
                    bits = 34150;
                    break;
                case 20:
                    bits = 28800;
                    break;
                case 21:
                    bits = 25600;
                    break;
                case 22:
                    bits = 20000;
                    break;
                case 23:
                    bits = 19200;
                    break;
                case 24:
                    bits = 17075;
                    break;
                case 25:
                    bits = 14400;
                    break;
                case 26:
                    bits = 12800;
                    break;
                case 27:
                    bits = 9600;
                    break;
            }
        } else {
            bits = l0Var.readBits(24);
        }
        int bits5 = l0Var.readBits(3);
        int i13 = 1;
        if (bits5 == 0) {
            i10 = 768;
        } else if (bits5 == 1) {
            i10 = 1024;
        } else if (bits5 == 2 || bits5 == 3) {
            i10 = 2048;
        } else {
            if (bits5 != 4) {
                throw z0.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + bits5);
            }
            i10 = 4096;
        }
        if (bits5 == 0 || bits5 == 1) {
            c10 = 0;
        } else if (bits5 == 2) {
            c10 = 2;
        } else if (bits5 == 3) {
            c10 = 3;
        } else {
            if (bits5 != 4) {
                throw z0.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + bits5);
            }
            c10 = 1;
        }
        l0Var.skipBits(2);
        c(l0Var);
        int bits6 = l0Var.readBits(5);
        int i14 = 0;
        int iA = 0;
        while (true) {
            int i15 = 16;
            if (i14 < bits6 + 1) {
                int bits7 = l0Var.readBits(3);
                iA += a(l0Var, 5, 8, 16) + 1;
                if ((bits7 == 0 || bits7 == 2) && l0Var.readBit()) {
                    c(l0Var);
                }
                i14++;
            } else {
                int iA2 = a(l0Var, 4, 8, 16) + 1;
                l0Var.skipBit();
                int i16 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i16 >= iA2) {
                        byte[] bArr = null;
                        if (l0Var.readBit()) {
                            int iA3 = a(l0Var, 2, 4, 8) + 1;
                            for (int i17 = 0; i17 < iA3; i17++) {
                                int iA4 = a(l0Var, 4, 8, 16);
                                int iA5 = a(l0Var, 4, 8, 16);
                                if (iA4 == 7) {
                                    int bits8 = l0Var.readBits(4) + 1;
                                    l0Var.skipBits(4);
                                    byte[] bArr2 = new byte[bits8];
                                    for (int i18 = 0; i18 < bits8; i18++) {
                                        bArr2[i18] = (byte) l0Var.readBits(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    l0Var.skipBits(iA5 * 8);
                                }
                            }
                        }
                        switch (bits) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw z0.createForUnsupportedContainerFeature("Unsupported sampling rate " + bits);
                        }
                        return new u(bits3, (int) (bits * d10), (int) (i10 * d10), bArr);
                    }
                    int bits9 = l0Var.readBits(2);
                    if (bits9 == 0) {
                        i11 = i13;
                        i12 = i16;
                        l0Var.skipBits(3);
                        if (l0Var.readBit()) {
                            l0Var.skipBits(13);
                        }
                        if (c10 > 0) {
                            b(l0Var);
                        }
                    } else if (bits9 != i13) {
                        if (bits9 == 3) {
                            a(l0Var, 4, 8, i15);
                            int iA6 = a(l0Var, 4, 8, i15);
                            if (l0Var.readBit()) {
                                a(l0Var, 8, i15, 0);
                            }
                            l0Var.skipBit();
                            if (iA6 > 0) {
                                l0Var.skipBits(iA6 * 8);
                            }
                        }
                        i11 = i13;
                        i12 = i16;
                    } else {
                        l0Var.skipBits(3);
                        boolean bit = l0Var.readBit();
                        if (bit) {
                            l0Var.skipBits(13);
                        }
                        if (bit) {
                            l0Var.skipBit();
                        }
                        if (c10 > 0) {
                            b(l0Var);
                            bits2 = l0Var.readBits(2);
                        } else {
                            bits2 = 0;
                        }
                        i11 = i13;
                        if (bits2 > 0) {
                            l0Var.skipBits(6);
                            int bits10 = l0Var.readBits(2);
                            l0Var.skipBits(4);
                            if (l0Var.readBit()) {
                                l0Var.skipBits(5);
                            }
                            if (bits2 == 2 || bits2 == 3) {
                                l0Var.skipBits(6);
                            }
                            if (bits10 == 2) {
                                l0Var.skipBit();
                            }
                        }
                        i12 = i16;
                        int iFloor = ((int) Math.floor(Math.log(iA - 1) / Math.log(2.0d))) + 1;
                        int bits11 = l0Var.readBits(2);
                        if (bits11 > 0 && l0Var.readBit()) {
                            l0Var.skipBits(iFloor);
                        }
                        if (l0Var.readBit()) {
                            l0Var.skipBits(iFloor);
                        }
                        if (c10 == 0 && bits11 == 0) {
                            l0Var.skipBit();
                        }
                    }
                    i16 = i12 + 1;
                    i13 = i11;
                    i15 = 16;
                }
            }
        }
    }
}
