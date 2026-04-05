package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@MetaExoPlayerCustomization("DoNotStrip")
/* renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2377kl implements GX {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final InterfaceC1223Gb A0M;
    public static final InterfaceC1250Hc A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public GY A07;
    public H1 A08;
    public H1 A09;
    public InterfaceC2376kk A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C4J A0F;
    public final C1230Gi A0G;
    public final C1232Gk A0H;
    public final C1233Gl A0I;
    public final H1 A0J;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, AbstractJsonLexerKt.TC_INVALID, -45, -50, -50, AbstractJsonLexerKt.TC_INVALID, -52, -64, -51, -40, AbstractJsonLexerKt.TC_INVALID, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.kn
            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final GX[] A5F() {
                return C2377kl.A0G();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1222Ga.A01(this, uri, map);
            }
        };
        A0N = new InterfaceC1250Hc() { // from class: com.facebook.ads.redexgen.X.km
            @Override // com.facebook.ads.redexgen.core.InterfaceC1250Hc
            public final boolean A6I(int i10, int i11, int i12, int i13, int i14) {
                return C2377kl.A0C(i10, i11, i12, i13, i14);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2377kl() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2377kl(int i10) {
        this(i10, C.TIME_UNSET);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2377kl(int i10, long j10) {
        this.A0D = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0E = j10;
        this.A0F = new C4J(10);
        this.A0I = new C1233Gl();
        this.A0G = new C1230Gi();
        this.A02 = C.TIME_UNSET;
        this.A0H = new C1232Gk();
        this.A0J = new C2404lO();
        this.A08 = this.A0J;
    }

    public static int A00(C4J c4j, int i10) {
        if (c4j.A0A() >= i10 + 4) {
            c4j.A0f(i10);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int iA0C = c4j.A0C();
            if (iA0C == 1483304551 || iA0C == 1231971951) {
                return iA0C;
            }
        }
        if (c4j.A0A() >= 40) {
            c4j.A0f(36);
            return c4j.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC2403lN, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC2403lN);
            this.A07.AIN(this.A0A);
            this.A08.A6W(new C2D().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC2403lN.A8f();
        } else if (this.A03 != 0) {
            long jA8f = interfaceC2403lN.A8f();
            if (jA8f < this.A03) {
                interfaceC2403lN.AJJ((int) (this.A03 - jA8f));
            }
        }
        return A02(interfaceC2403lN);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A00 == 0) {
            interfaceC2403lN.AI1();
            if (A0E(interfaceC2403lN)) {
                return -1;
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(iA0C, sampleHeaderData)) {
                int sampleHeaderData2 = AbstractC1234Gm.A00(iA0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(iA0C);
                    if (this.A02 == C.TIME_UNSET) {
                        this.A02 = this.A0A.A99(interfaceC2403lN.A8f());
                        if (this.A0E != C.TIME_UNSET) {
                            this.A02 += this.A0E - this.A0A.A99(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C10237t) {
                        C10237t c10237t = (C10237t) this.A0A;
                        long j10 = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long jA03 = A03(j10 + sampleHeaderData4);
                        long jA8f = interfaceC2403lN.A8f();
                        int sampleHeaderData5 = this.A0I.A02;
                        c10237t.A01(jA03, jA8f + sampleHeaderData5);
                        if (this.A0C && c10237t.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC2403lN.AJJ(1);
            this.A01 = 0;
            return 0;
        }
        int iAI5 = this.A08.AI5(interfaceC2403lN, this.A00, true);
        if (iAI5 == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAI5;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIA(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j11 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j11 + bytesAppended3;
        this.A00 = 0;
        return 0;
    }

    private long A03(long j10) {
        return this.A02 + ((1000000 * j10) / this.A0I.A03);
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i10 = 0; i10 < iA02; i10++) {
                Metadata.Entry entryA03 = metadata.A03(i10);
                if ((entryA03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) entryA03)).A00.equals(A09(24, 4, 101))) {
                    return AbstractC09264a.A0O(Long.parseLong(((TextInformationFrame) entryA03).A02.get(0)));
                }
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private C10247u A05(InterfaceC2403lN interfaceC2403lN, boolean z10) throws IOException {
        interfaceC2403lN.AG9(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C10247u(interfaceC2403lN.A8G(), interfaceC2403lN.A8f(), this.A0I, z10);
    }

    public static C10227s A06(Metadata metadata, long j10) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i10 = 0; i10 < iA02; i10++) {
                Metadata.Entry entry = metadata.A03(i10);
                if (entry instanceof MlltFrame) {
                    return C10227s.A01(j10, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.core.InterfaceC2376kk A07(com.facebook.ads.redexgen.core.InterfaceC2403lN r13) throws java.io.IOException {
        /*
            r12 = this;
            r3 = r12
            com.facebook.ads.redexgen.X.kk r4 = r12.A08(r13)
            com.facebook.ads.androidx.media3.common.Metadata r2 = r3.A06
            long r0 = r13.A8f()
            com.facebook.ads.redexgen.X.7s r1 = A06(r2, r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L19
            com.facebook.ads.redexgen.X.7r r0 = new com.facebook.ads.redexgen.X.7r
            r0.<init>()
            return r0
        L19:
            r5 = 0
            int r0 = r3.A0D
            r0 = r0 & 4
            if (r0 == 0) goto La9
            r10 = -1
            if (r1 == 0) goto L97
            long r6 = r1.A7l()
            long r10 = r1.A7b()
        L2c:
            com.facebook.ads.redexgen.X.7t r5 = new com.facebook.ads.redexgen.X.7t
            long r8 = r13.A8f()
            r5.<init>(r6, r8, r10)
        L35:
            r4 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2377kl.A0L
            r0 = 1
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2377kl.A0L
            java.lang.String r1 = "puIT5"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = ""
            r0 = 4
            r2[r0] = r1
            if (r5 == 0) goto L63
            boolean r0 = r5.AAa()
            if (r0 != 0) goto L88
            int r0 = r3.A0D
            r0 = r0 & r4
            if (r0 == 0) goto L88
        L63:
            int r5 = r3.A0D
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2377kl.A0L
            r0 = 5
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L89
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2377kl.A0L
            java.lang.String r1 = "yAfIM"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = ""
            r0 = 4
            r2[r0] = r1
            r0 = r5 & 2
            if (r0 == 0) goto L95
        L84:
            com.facebook.ads.redexgen.X.7u r5 = r3.A05(r13, r4)
        L88:
            return r5
        L89:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2377kl.A0L
            java.lang.String r1 = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi"
            r0 = 5
            r2[r0] = r1
            r0 = r5 & 2
            if (r0 == 0) goto L95
            goto L84
        L95:
            r4 = 0
            goto L84
        L97:
            if (r4 == 0) goto La2
            long r6 = r4.A7l()
            long r10 = r4.A7b()
            goto L2c
        La2:
            com.facebook.ads.androidx.media3.common.Metadata r0 = r3.A06
            long r6 = A04(r0)
            goto L2c
        La9:
            if (r1 == 0) goto Lad
            r5 = r1
            goto L35
        Lad:
            if (r4 == 0) goto L35
            r5 = r4
            goto L35
        Lb1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2377kl.A07(com.facebook.ads.redexgen.X.lN):com.facebook.ads.redexgen.X.kk");
    }

    private InterfaceC2376kk A08(InterfaceC2403lN interfaceC2403lN) throws IOException {
        C4J c4j = new C4J(this.A0I.A02);
        interfaceC2403lN.AG9(c4j.A0l(), 0, this.A0I.A02);
        int i10 = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i10 = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i10 = 13;
        }
        int iA00 = A00(c4j, i10);
        if (iA00 == 1483304551 || iA00 == 1231971951) {
            C10177n c10177nA01 = C10177n.A01(interfaceC2403lN.A8G(), interfaceC2403lN.A8f(), this.A0I, c4j);
            if (c10177nA01 != null && !this.A0G.A03()) {
                interfaceC2403lN.AI1();
                interfaceC2403lN.A3z(i10 + 141);
                C4J frame = this.A0F;
                interfaceC2403lN.AG9(frame.A0l(), 0, 3);
                C4J frame2 = this.A0F;
                frame2.A0f(0);
                C1230Gi c1230Gi = this.A0G;
                C4J frame3 = this.A0F;
                c1230Gi.A04(frame3.A0K());
            }
            interfaceC2403lN.AJJ(this.A0I.A02);
            if (c10177nA01 != null && !c10177nA01.AAa() && iA00 == 1231971951) {
                C10247u c10247uA05 = A05(interfaceC2403lN, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return c10247uA05;
            }
            return c10177nA01;
        }
        if (iA00 == 1447187017) {
            C10207q c10207qA00 = C10207q.A00(interfaceC2403lN.A8G(), interfaceC2403lN.A8f(), this.A0I, c4j);
            interfaceC2403lN.AJJ(this.A0I.A02);
            return c10207qA00;
        }
        interfaceC2403lN.AI1();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        C3M.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i12 != 76 || i13 != 76 || (i14 != 84 && i10 != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    private boolean A0E(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A0A != null) {
            long jA7b = this.A0A.A7b();
            if (jA7b != -1) {
                long dataEndPosition = interfaceC2403lN.A8a();
                if (dataEndPosition > jA7b - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC2403lN.AGA(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC2403lN interfaceC2403lN, boolean z10) throws IOException {
        int candidateSynchronizedHeaderData;
        int i10 = 0;
        int i11 = 0;
        int iA8a = 0;
        int searchedBytes = 0;
        int headerData = z10 ? 32768 : 131072;
        interfaceC2403lN.AI1();
        if (interfaceC2403lN.A8f() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC2403lN, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            iA8a = (int) interfaceC2403lN.A8a();
            if (!z10) {
                interfaceC2403lN.AJJ(iA8a);
            }
        }
        while (true) {
            if (A0E(interfaceC2403lN)) {
                if (i10 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.A0F.A0f(0);
                int iA0C = this.A0F.A0C();
                if ((i11 != 0 && !A0D(iA0C, i11)) || (candidateSynchronizedHeaderData = AbstractC1234Gm.A00(iA0C)) == -1) {
                    int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                    if (searchedBytes == headerData) {
                        if (z10) {
                            return false;
                        }
                        throw C08822i.A01(A09(0, 24, 51), null);
                    }
                    i10 = 0;
                    i11 = 0;
                    if (z10) {
                        interfaceC2403lN.AI1();
                        int validFrameCount3 = iA8a + candidateSynchronizedHeaderData2;
                        interfaceC2403lN.A3z(validFrameCount3);
                    } else {
                        interfaceC2403lN.AJJ(1);
                    }
                    searchedBytes = candidateSynchronizedHeaderData2;
                } else {
                    i10++;
                    if (i10 == 1) {
                        this.A0I.A00(iA0C);
                        i11 = iA0C;
                    } else if (i10 == 4) {
                        break;
                    }
                    int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                    interfaceC2403lN.A3z(validFrameCount4);
                }
            }
        }
        if (z10) {
            interfaceC2403lN.AJJ(iA8a + searchedBytes);
        } else {
            interfaceC2403lN.AI1();
        }
        this.A01 = i11;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ GX[] A0G() {
        return new GX[]{new C2377kl()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A07 = gy;
        this.A09 = this.A07.AJh(0, 1);
        this.A08 = this.A09;
        this.A07.A6G();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        A0A();
        int iA01 = A01(interfaceC2403lN);
        if (iA01 == -1 && (this.A0A instanceof C10237t)) {
            long jA03 = A03(this.A04);
            long durationUs = this.A0A.A7l();
            if (durationUs != jA03) {
                ((C10237t) this.A0A).A00(jA03);
                this.A07.AIN(this.A0A);
            }
        }
        return iA01;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A01 = 0;
        this.A02 = C.TIME_UNSET;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j11;
        if ((this.A0A instanceof C10237t) && !((C10237t) this.A0A).A02(j11)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2403lN interfaceC2403lN) throws IOException {
        return A0F(interfaceC2403lN, true);
    }
}
