package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2364kY implements GX, InterfaceC1244Gw {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC1223Gb A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public MotionPhotoMetadata A0F;
    public C1275Ic[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C4J A0J;
    public final C4J A0K;
    public final C4J A0L;
    public final C4J A0M;
    public final C1282Ij A0N;
    public final ArrayDeque<C2375kj> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A03(com.facebook.ads.redexgen.core.InterfaceC2403lN r22, com.facebook.ads.redexgen.core.C1241Gt r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2364kY.A03(com.facebook.ads.redexgen.X.lN, com.facebook.ads.redexgen.X.Gt):int");
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, Utf8.REPLACEMENT_BYTE, 42, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, Utf8.REPLACEMENT_BYTE, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.kZ
            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final GX[] A5F() {
                return C2364kY.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1222Ga.A01(this, uri, map);
            }
        };
    }

    public C2364kY() {
        this(0);
    }

    public C2364kY(int i10) {
        this.A0I = i10;
        this.A04 = (i10 & 4) != 0 ? 3 : 0;
        this.A0N = new C1282Ij();
        this.A0P = new ArrayList();
        this.A0J = new C4J(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C4J(AbstractC1238Gq.A03);
        this.A0K = new C4J(4);
        this.A0M = new C4J();
        this.A08 = -1;
        this.A0E = GY.A00;
        this.A0G = new C1275Ic[0];
    }

    public static int A00(int i10) {
        switch (i10) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j10) {
        long j11 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i10 = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        int i11 = 1;
        int trackIndex = -1;
        int i12 = 0;
        while (true) {
            C1275Ic[] c1275IcArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i12 >= c1275IcArr.length) {
                if (j12 == Long.MAX_VALUE || i11 == 0) {
                    return i10;
                }
                long j13 = 10485760 + j12;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j13) {
                        return i10;
                    }
                } else if (sampleOffset < j13) {
                    return i10;
                }
                return trackIndex;
            }
            C1275Ic c1275Ic = this.A0G[i12];
            int i13 = c1275Ic.A00;
            if (i13 != c1275Ic.A04.A01) {
                long j14 = c1275Ic.A04.A06[i13];
                long minAccumulatedBytes = ((long[][]) AbstractC09264a.A0f(this.A0H))[i12][i13];
                long j15 = j14 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && preferredTrackIndex != 0) || (i14 == preferredTrackIndex && j15 < j11)) {
                    preferredTrackIndex = i14;
                    j11 = j15;
                    i10 = i12;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j12) {
                    j12 = minAccumulatedBytes;
                    i11 = i14;
                    trackIndex = i12;
                }
            }
            i12++;
        }
    }

    public static int A02(C4J c4j) {
        c4j.A0f(8);
        int majorBrand = A00(c4j.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c4j.A0g(4);
        while (c4j.A07() > 0) {
            int majorBrand2 = A00(c4j.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        int iA07 = this.A0N.A07(interfaceC2403lN, c1241Gt, this.A0P);
        if (iA07 == 1 && c1241Gt.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C1288Ip c1288Ip, long j10) {
        int iA00 = c1288Ip.A00(j10);
        if (iA00 == -1) {
            return c1288Ip.A01(j10);
        }
        return iA00;
    }

    public static long A06(C1288Ip c1288Ip, long j10, long j11) {
        int iA05 = A05(c1288Ip, j10);
        if (iA05 == -1) {
            return j11;
        }
        return Math.min(c1288Ip.A06[iA05], j11);
    }

    private final C1243Gv A07(long j10, int i10) {
        long jA06;
        long j11;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new C1243Gv(C1245Gx.A04);
        }
        long j12 = C.TIME_UNSET;
        long jA062 = -1;
        int i11 = i10 != -1 ? i10 : this.A03;
        if (i11 != -1) {
            C1288Ip c1288Ip = this.A0G[i11].A04;
            int iA05 = A05(c1288Ip, j10);
            if (iA05 == -1) {
                return new C1243Gv(C1245Gx.A04);
            }
            j11 = c1288Ip.A07[iA05];
            jA06 = c1288Ip.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j11 < j10 && iA05 < c1288Ip.A01 - 1 && (mainTrackIndex = c1288Ip.A01(j10)) != -1 && mainTrackIndex != iA05) {
                j12 = c1288Ip.A07[mainTrackIndex];
                jA062 = c1288Ip.A06[mainTrackIndex];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j11 = j10;
            } else {
                A0R[2] = "SenK5aC";
                j11 = j10;
            }
        }
        if (i10 == -1) {
            for (int i12 = 0; i12 < this.A0G.length; i12++) {
                if (i12 != this.A03) {
                    C1288Ip sampleTable = this.A0G[i12].A04;
                    jA06 = A06(sampleTable, j11, jA06);
                    if (j12 != C.TIME_UNSET) {
                        jA062 = A06(sampleTable, j12, jA062);
                    }
                }
            }
        }
        C1245Gx c1245Gx = new C1245Gx(j11, jA06);
        if (j12 == C.TIME_UNSET) {
            return new C1243Gv(c1245Gx);
        }
        return new C1243Gv(c1245Gx, new C1245Gx(j12, jA062));
    }

    public static /* synthetic */ C1285Im A08(C1285Im c1285Im) {
        return c1285Im;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AJh(0, 4).A6W(new C2D().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6G();
            this.A0E.AIN(new C2398lI(C.TIME_UNSET));
        }
    }

    private void A0D(long j10) throws C08822i {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j10) {
            C2375kj c2375kjPop = this.A0O.pop();
            if (((II) c2375kjPop).A00 == 1836019574) {
                A0G(c2375kjPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C2375kj containerAtom = this.A0O.peek();
                containerAtom.A08(c2375kjPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j10) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j10, C.TIME_UNSET, j10 + this.A00, this.A09 - this.A00);
        }
    }

    private void A0F(InterfaceC2403lN interfaceC2403lN) throws IOException {
        this.A0M.A0d(8);
        interfaceC2403lN.AG9(this.A0M.A0l(), 0, 8);
        IO.A0Q(this.A0M);
        interfaceC2403lN.AJJ(this.A0M.A09());
        interfaceC2403lN.AI1();
    }

    /* JADX WARN: Incorrect condition in loop: B:58:0x0138 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(com.facebook.ads.redexgen.core.C2375kj r36) throws com.facebook.ads.redexgen.core.C08822i {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2364kY.A0G(com.facebook.ads.redexgen.X.kj):void");
    }

    private void A0H(C1275Ic c1275Ic, long j10) {
        C1288Ip c1288Ip = c1275Ic.A04;
        int sampleIndex = c1288Ip.A00(j10);
        if (sampleIndex == -1) {
            sampleIndex = c1288Ip.A01(j10);
        }
        c1275Ic.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0J(int r4) {
        /*
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r4 == r0) goto L8d
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r4 == r0) goto L8d
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2364kY.A0R
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2364kY.A0R
            java.lang.String r1 = "UHuXZ9PGVGxrhu"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "Sv1JTBT1egKeuo"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L8d
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r4 == r0) goto L8d
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r4 == r0) goto L8d
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r4 == r0) goto L8d
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r4 == r0) goto L8d
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r4 == r0) goto L8d
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r4 == r0) goto L8d
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r4 == r0) goto L8d
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r4 == r0) goto L8d
            r3 = 1937007471(0x7374636f, float:1.9362445E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2364kY.A0R
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L91
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2364kY.A0R
            java.lang.String r1 = "0EWWhWMRQ7MgS85x4CKboIorprSqD"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L8d
        L6f:
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r4 == r0) goto L8d
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r4 == r0) goto L8d
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 == r0) goto L8d
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r4 == r0) goto L8d
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r4 == r0) goto L8d
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r4 != r0) goto L8f
        L8d:
            r0 = 1
        L8e:
            return r0
        L8f:
            r0 = 0
            goto L8e
        L91:
            if (r4 == r3) goto L8d
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2364kY.A0J(int):boolean");
    }

    private boolean A0K(InterfaceC2403lN interfaceC2403lN) throws IOException {
        C2375kj containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC2403lN.AGh(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC2403lN.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8G = interfaceC2403lN.A8G();
            if (jA8G == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8G = containerAtom.A00;
            }
            if (jA8G != -1) {
                this.A09 = (jA8G - interfaceC2403lN.A8f()) + this.A00;
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8f = (interfaceC2403lN.A8f() + this.A09) - this.A00;
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC2403lN);
                }
                this.A0O.push(new C2375kj(this.A01, jA8f));
                if (this.A09 == this.A00) {
                    A0D(jA8f);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                C3M.A08(this.A00 == 8);
                C3M.A08(this.A09 <= 2147483647L);
                C4J c4j = new C4J((int) this.A09);
                C4J atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c4j.A0l(), 0, 8);
                this.A0D = c4j;
                this.A04 = 1;
            } else {
                A0E(interfaceC2403lN.A8f() - this.A00);
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C08822i.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        long j10 = this.A09 - this.A00;
        long atomEndPosition = interfaceC2403lN.A8f() + j10;
        boolean z10 = false;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC2403lN.readFully(c4j.A0l(), this.A00, (int) j10);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c4j);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C2374ki(this.A01, c4j));
            }
        } else if (j10 < 262144) {
            interfaceC2403lN.AJJ((int) j10);
        } else {
            long atomPayloadSize = interfaceC2403lN.A8f();
            c1241Gt.A00 = atomPayloadSize + j10;
            z10 = true;
        }
        A0D(atomEndPosition);
        return z10 && this.A04 != 2;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C2364kY()};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[][] A0N(com.facebook.ads.redexgen.core.C1275Ic[] r16) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2364kY.A0N(com.facebook.ads.redexgen.X.Ic[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        return A07(j10, -1);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC2403lN)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0L(interfaceC2403lN, c1241Gt)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A03(interfaceC2403lN, c1241Gt);
                case 3:
                    return A04(interfaceC2403lN, c1241Gt);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j10 == 0) {
            int i10 = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i10 != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (C1275Ic c1275Ic : this.A0G) {
            A0H(c1275Ic, j11);
            if (c1275Ic.A02 != null) {
                c1275Ic.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2403lN interfaceC2403lN) throws IOException {
        return AbstractC1283Ik.A02(interfaceC2403lN, (this.A0I & 2) != 0);
    }
}
