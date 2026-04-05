package com.facebook.ads.redexgen.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ApicFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.GeobFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.PrivFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.8i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10348i extends AbstractC2384l4 {
    public static byte[] A01;
    public static String[] A02 = {"dfkl9gE5OREu5AXL5lY0ohuUUe3SXBJr", "hKeIXQ7stisHjmNWZz70dNldldiAaQvi", "Ev47ZYJBP4qmoN0JeJrCKxe3cHeEd2Mz", "un9uiXmeOTgIIo", "Wd16eevQjbu9Ian59LTBbcV1NeBW6y6R", "QoAdFFIsNXY7HGA7Qc965AL0CxX7pFDa", "35FvwnlVw7oPAj", "U3kKyqEMJJ2afey5JgaPdqN5tYmvQhts"};
    public static final InterfaceC1250Hc A03;
    public final InterfaceC1250Hc A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ApicFrame A04(C4J c4j, int i10, int i11) {
        int iA02;
        String strA01;
        int iA0I = c4j.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        String strA0J = A0J(TTAdConstant.AD_ID_IS_NULL_CODE, 6, 90);
        if (i11 == 2) {
            iA02 = 2;
            strA01 = strA0J + AbstractC2244iY.A01(new String(bArr, 0, 3, AbstractC2246ia.A01));
            if (A0J(418, 9, 47).equals(strA01)) {
                strA01 = A0J(408, 10, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA01 = AbstractC2244iY.A01(new String(bArr, 0, iA02, AbstractC2246ia.A01));
            if (strA01.indexOf(47) == -1) {
                strA01 = strA0J + strA01;
            }
        }
        int i12 = bArr[iA02 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = iA02 + 2;
        int iA03 = A03(bArr, i13, iA0I);
        return new ApicFrame(strA01, new String(bArr, i13, iA03 - i13, charsetA0M), i12, A0Q(bArr, A00(iA0I) + iA03, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ChapterFrame A06(C4J c4j, int i10, int i11, boolean z10, int i12, InterfaceC1250Hc interfaceC1250Hc) {
        int iA09 = c4j.A09();
        int iA02 = A02(c4j.A0l(), iA09);
        String str = new String(c4j.A0l(), iA09, iA02 - iA09, AbstractC2246ia.A01);
        c4j.A0f(iA02 + 1);
        int iA0C = c4j.A0C();
        int iA0C2 = c4j.A0C();
        long jA0Q = c4j.A0Q();
        if (jA0Q == 4294967295L) {
            jA0Q = -1;
        }
        long jA0Q2 = c4j.A0Q();
        if (jA0Q2 == 4294967295L) {
            jA0Q2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iA09 + i10;
        while (true) {
            int iA092 = c4j.A09();
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "yxJytYiELIVuKxluLLGjsQCljTQ6t8ax";
            strArr[0] = "riKuEgzQ5i9bwl4lr9MCLXtR5zTvU4EY";
            if (iA092 >= i13) {
                return new ChapterFrame(str, iA0C, iA0C2, jA0Q, jA0Q2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
            }
            Id3Frame id3FrameA0B = A0B(i11, c4j, z10, i12, interfaceC1250Hc);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static GeobFrame A09(C4J c4j, int i10) {
        int iA0I = c4j.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i10 - 1];
        c4j.A0k(bArr, 0, i10 - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, AbstractC2246ia.A01);
        int i11 = iA02 + 1;
        int iA03 = A03(bArr, i11, iA0I);
        String strA0L = A0L(bArr, i11, iA03, charsetA0M);
        int iA00 = A00(iA0I) + iA03;
        int iA032 = A03(bArr, iA00, iA0I);
        return new GeobFrame(str, strA0L, A0L(bArr, iA00, iA032, charsetA0M), A0Q(bArr, A00(iA0I) + iA032, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static MlltFrame A0C(C4J c4j, int i10) {
        int iA0M = c4j.A0M();
        int iA0K = c4j.A0K();
        int iA0K2 = c4j.A0K();
        int iA0I = c4j.A0I();
        int iA0I2 = c4j.A0I();
        C4I c4i = new C4I();
        c4i.A0C(c4j);
        int i11 = ((i10 - 10) * 8) / (iA0I + iA0I2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iA04 = c4i.A04(iA0I);
            int iA042 = c4i.A04(iA0I2);
            iArr[i12] = iA04;
            iArr2[i12] = iA042;
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            A02[4] = "fcLz7frwMRu6ITyb";
        }
        return new MlltFrame(iA0M, iA0K, iA0K2, iArr, iArr2);
    }

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A01 = new byte[]{26, 15, 9, 103, 109, 43, 109, 43, 109, 43, 41, 111, 41, 111, 41, 111, 41, 111, 6, 10, 76, 88, 75, 71, 79, 121, 67, 80, 79, 23, 37, 0, 21, 0, 65, 21, 14, 14, 65, 18, 9, 14, 19, 21, 65, 21, 14, 65, 3, 4, 65, 0, 15, 65, 40, 37, 82, 65, 21, 0, 6, 76, 107, 99, 102, 111, 110, 42, 126, 101, 42, 110, 111, 105, 101, 110, 111, 42, 108, 120, 107, 103, 111, 48, 42, 99, 110, 55, 114, 85, 93, 88, 81, 80, 20, 64, 91, 20, 66, 85, 88, 93, 80, 85, 64, 81, 20, 125, 112, 7, 20, 64, 85, 83, 20, 67, 93, 64, 92, 20, 89, 85, 94, 91, 70, 98, 81, 70, 71, 93, 91, 90, 9, 39, 19, 0, 12, 4, 65, 18, 8, 27, 4, 65, 4, 25, 2, 4, 4, 5, 18, 65, 19, 4, 12, 0, 8, 15, 8, 15, 6, 65, 21, 0, 6, 65, 5, 0, 21, 0, 74, 103, 48, 71, 102, 96, 108, 103, 102, 113, 85, 109, 111, 118, 118, 99, 98, 38, 79, 66, 53, 38, 114, 103, 97, 38, 113, 111, 114, 110, 38, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 52, 38, 103, 104, 98, 38, 115, 104, 98, 99, 96, 111, 104, 99, 98, 38, 101, 105, 107, 118, 116, 99, 117, 117, 111, 105, 104, 38, 117, 101, 110, 99, 107, 99, 104, 80, 82, 75, 75, 94, 95, 27, 114, AbstractJsonLexerKt.TC_INVALID, 8, 27, 79, 90, 92, 27, 76, 82, 79, 83, 27, 78, 85, 72, 78, 75, 75, 84, 73, 79, 94, 95, 27, 86, 90, 81, 84, 73, 109, 94, 73, 72, 82, 84, 85, 6, 42, 18, 16, 9, 9, 16, 23, 30, 89, 12, 23, 10, 12, 9, 9, 22, 11, 13, 28, 29, 89, 26, 22, 20, 9, 11, 28, 10, 10, 28, 29, 89, 22, 11, 89, 28, 23, 26, 11, 0, 9, 13, 28, 29, 89, 31, 11, 24, 20, 28, 62, 50, 50, 50, 119, 76, 71, 90, 82, 71, 65, 86, 71, 70, 2, 68, 75, 80, 81, 86, 2, 86, 74, 80, 71, 71, 2, 64, 91, 86, 71, 81, 2, 77, 68, 2, 107, 102, 17, 2, 86, 67, 69, 2, 74, 71, 67, 70, 71, 80, 24, 2, 18, 90, 121, 118, 118, 118, 62, 58, 54, 48, 50, 120, 30, 26, 22, 16, 18, 88, 29, 7, 18, 16, 75, 79, 67, 69, 71, 13, 72, 82, 69};
    }

    static {
        A0N();
        A03 = new InterfaceC1250Hc() { // from class: com.facebook.ads.redexgen.X.ky
            @Override // com.facebook.ads.redexgen.core.InterfaceC1250Hc
            public final boolean A6I(int i10, int i11, int i12, int i13, int i14) {
                return C10348i.A0O(i10, i11, i12, i13, i14);
            }
        };
    }

    public C10348i() {
        this(null);
    }

    public C10348i(InterfaceC1250Hc interfaceC1250Hc) {
        this.A00 = interfaceC1250Hc;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.core.C4J r8, int r9) {
        /*
            byte[] r6 = r8.A0l()
            int r8 = r8.A09()
            r7 = r8
        L9:
            int r1 = r7 + 1
            int r0 = r8 + r9
            if (r1 >= r0) goto L54
            r1 = r6[r7]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L51
            int r0 = r7 + 1
            r0 = r6[r0]
            if (r0 != 0) goto L51
            int r0 = r7 - r8
            int r5 = r7 + 2
            int r4 = r7 + 1
            int r0 = r9 - r0
            int r3 = r0 + (-2)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10348i.A02
            r0 = 1
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10348i.A02
            java.lang.String r1 = "XZV6e8MYnWgHLOD3ZLXsdTcFpPsY6V3F"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "PRKMokf209xLCZShYH0Zduqvqdx50TVA"
            r0 = 7
            r2[r0] = r1
            java.lang.System.arraycopy(r6, r5, r6, r4, r3)
            int r9 = r9 + (-1)
        L51:
            int r7 = r7 + 1
            goto L9
        L54:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10348i.A01(com.facebook.ads.redexgen.X.4J, int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10348i.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L23
            int r0 = r1 - r3
            int r0 = r0 % 2
            if (r0 != 0) goto L1c
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1c
            return r1
        L1c:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L23:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10348i.A03(byte[], int, int):int");
    }

    public static BinaryFrame A05(C4J c4j, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C4J c4j, int i10, int i11, boolean z10, int elementIdEndIndex, InterfaceC1250Hc interfaceC1250Hc) {
        int iA09 = c4j.A09();
        int iA02 = A02(c4j.A0l(), iA09);
        String str = new String(c4j.A0l(), iA09, iA02 - iA09, AbstractC2246ia.A01);
        c4j.A0f(iA02 + 1);
        int framePosition = c4j.A0I();
        boolean z11 = (framePosition & 2) != 0;
        boolean z12 = (framePosition & 1) != 0;
        int iA0I = c4j.A0I();
        String[] strArr = new String[iA0I];
        for (int i12 = 0; i12 < iA0I; i12++) {
            int startIndex = c4j.A09();
            int iA022 = A02(c4j.A0l(), startIndex);
            int elementIdEndIndex2 = iA022 - startIndex;
            strArr[i12] = new String(c4j.A0l(), startIndex, elementIdEndIndex2, AbstractC2246ia.A01);
            c4j.A0f(iA022 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iA09 + i10;
        while (c4j.A09() < i13) {
            Id3Frame id3FrameA0B = A0B(i11, c4j, z10, elementIdEndIndex, interfaceC1250Hc);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame A08(C4J c4j, int i10) {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = c4j.A0I();
        Charset charsetA0M = A0M(textStartIndex);
        byte[] bArr = new byte[3];
        c4j.A0k(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        c4j.A0k(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, charsetA0M);
        int iA00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, textStartIndex);
        return new CommentFrame(description, language, A0L(data, iA00, encoding4, charsetA0M));
    }

    public static C1251Hd A0A(C4J c4j) {
        int iA07 = c4j.A07();
        String strA0J = A0J(170, 10, 14);
        if (iA07 < 10) {
            AnonymousClass44.A07(strA0J, A0J(30, 31, 108));
            return null;
        }
        int iA0K = c4j.A0K();
        boolean z10 = false;
        if (iA0K != 4801587) {
            AnonymousClass44.A07(strA0J, A0J(348, 50, 47) + String.format(A0J(0, 4, 50), Integer.valueOf(iA0K)));
            return null;
        }
        int iA0I = c4j.A0I();
        c4j.A0g(1);
        int flags = c4j.A0I();
        int iA0H = c4j.A0H();
        if (iA0I == 2) {
            int id2 = flags & 64;
            int id3 = id2 != 0 ? 1 : 0;
            if (id3 != 0) {
                AnonymousClass44.A07(strA0J, A0J(180, 68, 11));
                return null;
            }
        } else if (iA0I == 3) {
            int id4 = flags & 64;
            int id5 = id4 != 0 ? 1 : 0;
            if (id5 != 0) {
                int id6 = c4j.A0C();
                c4j.A0g(id6);
                iA0H -= id6 + 4;
            }
        } else if (iA0I == 4) {
            int id7 = flags & 64;
            int id8 = id7 != 0 ? 1 : 0;
            if (id8 != 0) {
                int majorVersion = c4j.A0H();
                int id9 = majorVersion - 4;
                c4j.A0g(id9);
                iA0H -= majorVersion;
            }
            int id10 = flags & 16;
            int id11 = id10 != 0 ? 1 : 0;
            if (id11 != 0) {
                iA0H -= 10;
            }
        } else {
            AnonymousClass44.A07(strA0J, A0J(248, 46, 54) + iA0I);
            return null;
        }
        if (iA0I < 4) {
            int id12 = flags & 128;
            if (id12 != 0) {
                z10 = true;
            }
        }
        return new C1251Hd(iA0I, z10, iA0H);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0232 A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:99:0x0169, B:168:0x023c, B:101:0x0171, B:108:0x0187, B:110:0x018f, B:118:0x01a9, B:127:0x01c1, B:138:0x01db, B:145:0x01ec, B:152:0x01fd, B:158:0x0214, B:165:0x022d, B:166:0x0232), top: B:174:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame A0B(int r21, com.facebook.ads.redexgen.core.C4J r22, boolean r23, int r24, com.facebook.ads.redexgen.core.InterfaceC1250Hc r25) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10348i.A0B(int, com.facebook.ads.redexgen.X.4J, boolean, int, com.facebook.ads.redexgen.X.Hc):com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0D(C4J c4j, int i10) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, AbstractC2246ia.A01), A0Q(bArr, iA02 + 1, bArr.length));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0E(C4J c4j, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c4j.A0k(bArr, 0, encoding2);
        int iA03 = A03(bArr, 0, iA0I);
        String str = new String(bArr, 0, iA03, A0M(iA0I));
        int encoding3 = A00(iA0I);
        return new TextInformationFrame(A0J(344, 4, 103), str, A0I(bArr, iA0I, encoding3 + iA03));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0F(C4J c4j, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        c4j.A0k(data, 0, i10 - 1);
        return new TextInformationFrame(str, null, A0I(data, iA0I, 0));
    }

    public static UrlLinkFrame A0G(C4J c4j, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iA0I = c4j.A0I();
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c4j.A0k(bArr, 0, encoding2);
        int iA03 = A03(bArr, 0, iA0I);
        String str = new String(bArr, 0, iA03, A0M(iA0I));
        int descriptionEndIndex = A00(iA0I) + iA03;
        String description = A0L(bArr, descriptionEndIndex, A02(bArr, descriptionEndIndex), AbstractC2246ia.A01);
        return new UrlLinkFrame(A0J(398, 4, 35), str, description);
    }

    public static UrlLinkFrame A0H(C4J c4j, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4j.A0k(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), AbstractC2246ia.A01));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<java.lang.String> */
    public static AbstractC1081Am<String> A0I(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        String strA0J = A0J(0, 0, 108);
        if (i11 >= length) {
            return AbstractC1081Am.A04(strA0J);
        }
        C08571h c08571hA01 = AbstractC1081Am.A01();
        int valueEndIndex = A03(bArr, i11, i10);
        while (i11 < valueEndIndex) {
            int valueStartIndex = valueEndIndex - i11;
            c08571hA01.A04(new String(bArr, i11, valueStartIndex, A0M(i10)));
            i11 = valueEndIndex + A00(i10);
            valueEndIndex = A03(bArr, i11, i10);
        }
        AbstractC1081Am<String> abstractC1081AmA05 = c08571hA01.A05();
        return abstractC1081AmA05.isEmpty() ? AbstractC1081Am.A04(strA0J) : abstractC1081AmA05;
    }

    public static String A0K(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0J(4, 6, 69), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0J(10, 8, 1), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0L(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 <= i10 || i11 > bArr.length) {
            return A0J(0, 0, 108);
        }
        return new String(bArr, i10, i11 - i10, charset);
    }

    public static Charset A0M(int i10) {
        switch (i10) {
            case 1:
                return AbstractC2246ia.A03;
            case 2:
                return AbstractC2246ia.A04;
            case 3:
                return AbstractC2246ia.A06;
            default:
                Charset charset = AbstractC2246ia.A01;
                if (A02[5].charAt(22) == 'F') {
                    throw new RuntimeException();
                }
                A02[5] = "KvSqsioCKy57forlhJv7i4SYYwwKGyHr";
                return charset;
        }
    }

    public static /* synthetic */ boolean A0O(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060 A[EDGE_INSN: B:84:0x0060->B:23:0x0060 BREAK  A[LOOP:0: B:77:0x0006->B:67:0x0108], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0P(com.facebook.ads.redexgen.core.C4J r18, int r19, int r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10348i.A0P(com.facebook.ads.redexgen.X.4J, int, int, boolean):boolean");
    }

    public static byte[] A0Q(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return AbstractC09264a.A07;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2384l4
    public final Metadata A0R(C10428z c10428z, ByteBuffer byteBuffer) {
        return A0S(byteBuffer.array(), byteBuffer.limit());
    }

    public final Metadata A0S(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C4J c4j = new C4J(bArr, i10);
        C1251Hd c1251HdA0A = A0A(c4j);
        if (c1251HdA0A == null) {
            return null;
        }
        int startPosition = c4j.A09();
        int frameHeaderSize = c1251HdA0A.A01 == 2 ? 6 : 10;
        int iA01 = c1251HdA0A.A00;
        if (c1251HdA0A.A02) {
            iA01 = A01(c4j, c1251HdA0A.A00);
        }
        c4j.A0e(startPosition + iA01);
        boolean z10 = false;
        if (!A0P(c4j, c1251HdA0A.A01, frameHeaderSize, false)) {
            if (c1251HdA0A.A01 == 4 && A0P(c4j, 4, frameHeaderSize, true)) {
                z10 = true;
            } else {
                AnonymousClass44.A07(A0J(170, 10, 14), A0J(88, 45, 57) + c1251HdA0A.A01);
                return null;
            }
        }
        while (c4j.A07() >= frameHeaderSize) {
            Id3Frame id3FrameA0B = A0B(c1251HdA0A.A01, c4j, z10, frameHeaderSize, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }
}
