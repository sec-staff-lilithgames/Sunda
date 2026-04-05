package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1617Vm<T> implements InterfaceC1574Tu<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public C1566Tm A00;
    public C1566Tm A01;
    public List<C1617Vm<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C1565Tl A04;
    public final U1 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {68, 102, 105, 39, 104, 105, 107, 126, 39, 99, 98, 107, 98, 115, 98, 39, 100, 114, 117, 116, 104, 117, 116, 39, 119, 104, 110, 105, 115, 110, 105, 96, 39, 102, 115, 39, 115, 111, 98, 39, 99, 102, 115, 102, 101, 102, 116, 98, 39, 116, 115, 102, 117, 115, 87, 97, 102, 103, 123, 102, 52, 100, 123, 103, 125, 96, 125, 123, 122, 52, 125, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 56, 52, 117, 122, 112, 52, 102, 113, 119, 123, 102, 112, 52, 114, 125, 120, 113, 52, 103, 113, 101, 97, 113, 122, 119, 113, 52, 103, 96, 117, 102, 96, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 46, 52, 112, 117, 96, 117, 52, 124, 117, 103, 52, 100, 102, 123, 118, 117, 118, 120, 109, 52, 118, 113, 113, 122, 52, 120, 123, 103, 96, 28, 42, 45, 44, 48, 45, AbstractJsonLexerKt.TC_INVALID, 47, 48, 44, 54, 43, 54, 48, 49, AbstractJsonLexerKt.TC_INVALID, 54, 44, AbstractJsonLexerKt.TC_INVALID, 62, 43, AbstractJsonLexerKt.TC_INVALID, 119, 122, 59, 115, 122, 59, 118, 115, AbstractJsonLexerKt.TC_INVALID, 61, 42, 43, AbstractJsonLexerKt.TC_INVALID, 45, 58, 60, 48, 45, 59, AbstractJsonLexerKt.TC_INVALID, 57, 54, 51, 58, AbstractJsonLexerKt.TC_INVALID, 44, 58, 46, 42, 58, 49, 60, 58, AbstractJsonLexerKt.TC_INVALID, 48, 49, 51, 38, AbstractJsonLexerKt.TC_INVALID, 55, 62, 44, AbstractJsonLexerKt.TC_INVALID, 57, 54, 51, 58, AbstractJsonLexerKt.TC_INVALID, 122, 59, 101, AbstractJsonLexerKt.TC_INVALID, 59, 62, 43, 62, AbstractJsonLexerKt.TC_INVALID, 55, 62, 44, AbstractJsonLexerKt.TC_INVALID, 47, 45, 48, 61, 62, 61, 51, 38, AbstractJsonLexerKt.TC_INVALID, 61, 58, 58, 49, AbstractJsonLexerKt.TC_INVALID, 51, 48, 44, 43, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 70, 67, 67, 7, 67, 70, 83, 70, 7, 83, 72, 7, 75, 72, 64, 8, 47, 39, 34, 43, 42, 110, 58, 33, 110, 45, 34, 43, 47, 60, 110, 42, 47, 58, 47, 44, 47, 61, 43, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 43, 40, 57, 46, 37, 109, 41, 44, 57, 44, 109, 43, Utf8.REPLACEMENT_BYTE, 34, 32, 109, 33, 34, 42, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 71, 69, 84, 0, 82, 69, 67, 79, 82, 68, 0, 67, 79, 85, 78, 84, 73, 110, 102, 99, 106, 107, 47, 123, 96, 47, 122, AbstractJsonLexerKt.TC_INVALID, 107, 110, 123, 106, 47, 105, 102, 99, 106, 47, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, 16, 6, 36, 11, 14, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, 16, 6, 38, 3, 22, 3, 0, 3, 17, 7, 66, 1, 14, 13, 17, 7, 6, 119, 64, 70, 74, 87, 65, 99, 76, 73, 64, 103, 68, 86, 64, 65, 119, 64, 70, 74, 87, 65, 97, 68, 81, 68, 71, 68, 86, 64, 5, 76, 86, 5, 70, 73, 74, 86, 64, 65, 119, 76, 73, 76, 77, 85, 76, 2, 112, 71, 65, 77, 80, 70, 100, 75, 78, 71, 96, 67, 81, 71, 70, 112, 71, 65, 77, 80, 70, 102, 67, 86, 67, 64, 67, 81, 71, 2, 68, 71, 86, 65, 74, 70, 80, 87, 86, 74, 87, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(C1618Vn c1618Vn) {
        if (!this.A02.remove(c1618Vn)) {
            return false;
        }
        if (c1618Vn.A6P() > 0 && c1618Vn.A01().A02.A05(c1618Vn.A01().A01).equals(this.A01)) {
            this.A01 = c1618Vn.A00().A02;
        }
        return true;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public C1617Vm(C1571Tr c1571Tr, InterfaceC1579Tz interfaceC1579Tz) throws IOException {
        this.A05 = new U1(c1571Tr.A04(A00(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE, 4, 103)), interfaceC1579Tz);
        this.A04 = new C1565Tl(new File(c1571Tr.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(interfaceC1579Tz);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i10, int i11) throws IOException {
        this.A00 = new C1566Tm(i10, i11);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Vm<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(C1618Vn c1618Vn) throws U3 {
        if (!this.A03) {
            if (A06(c1618Vn)) {
                if (c1618Vn.A6P() == 0) {
                    return;
                }
                if (this.A00.A04(c1618Vn.A00().A02) == 0) {
                    try {
                        Iterator<C1578Ty> it = c1618Vn.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), c1618Vn.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e10) {
                        throw new U3(A00(361, 30, 22), e10);
                    }
                }
                throw new U3(A00(0, 54, 30));
            }
            throw new U3(A00(466, 43, 59));
        }
        throw new U3(A00(427, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(com.facebook.ads.redexgen.core.InterfaceC1579Tz r13) throws java.io.IOException {
        /*
            r12 = this;
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.Tm r3 = new com.facebook.ads.redexgen.X.Tm
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r11 = 2
            r10 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r9
            r6[r10] = r8
            r6[r11] = r2
            r6[r4] = r1
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AHs(r0)
            r12.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.Tm r3 = new com.facebook.ads.redexgen.X.Tm
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r2
            r6[r10] = r1
            r6[r11] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 70
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AHs(r0)
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.U1 r0 = r12.A05
            int r1 = r0.A07()
            com.facebook.ads.redexgen.X.Tm r0 = new com.facebook.ads.redexgen.X.Tm
            r0.<init>(r2, r1)
            r12.A00 = r0
            com.facebook.ads.redexgen.X.Tl r1 = r12.A04
            com.facebook.ads.redexgen.X.Tm r0 = r12.A00
            r1.A04(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1617Vm.A05(com.facebook.ads.redexgen.X.Tz):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1574Tu
    public final synchronized InterfaceC1573Tt A6O(byte[] bArr, int[] iArr) throws U3 {
        C1617Vm<T>.RecordFileBasedFetch c1618Vn;
        if (!this.A03) {
            int i10 = 0;
            int i11 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    C1569Tp c1569TpA0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i10, iArr, i11);
                    int iA00 = c1569TpA0A.A01().A00();
                    int storageOffset = c1569TpA0A.A01().A01();
                    int i12 = iA00 - storageOffset;
                    int storageOffset2 = c1569TpA0A.A01().A02();
                    i10 += storageOffset2;
                    i11 += i12;
                    if (c1569TpA0A.A01().A03() == EnumC1567Tn.A03) {
                        arrayList.add(c1569TpA0A);
                    }
                    if (c1569TpA0A.A01().A03() == EnumC1567Tn.A04) {
                        break;
                    }
                    if (c1569TpA0A.A01().A03() == EnumC1567Tn.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C1566Tm(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i12);
                    }
                }
                c1618Vn = new C1618Vn(this, arrayList, mayHaveMoreData);
                this.A02.add(c1618Vn);
                if (!arrayList.isEmpty()) {
                    C1566Tm c1566Tm = c1618Vn.A01().A02;
                    int storageOffset6 = c1618Vn.A01().A01;
                    this.A01 = c1566Tm.A05(storageOffset6);
                }
            } catch (IOException e10) {
                throw new U3(A00(306, 29, 84), e10);
            }
        } else {
            throw new U3(A00(391, 36, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        }
        return c1618Vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1574Tu
    public final synchronized int A8k() throws U3 {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                int iA02 = this.A00.A02();
                int count = this.A05.A06();
                if (iA02 == count) {
                    int count2 = this.A00.A03();
                    iA09 -= count2;
                }
            } catch (IOException e10) {
                throw new U3(A00(335, 26, 57), e10);
            }
        } else {
            throw new U3(A00(427, 39, 60));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1574Tu
    public final synchronized void AJW(byte[] bArr) throws U3 {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e10) {
                throw new U3(A00(257, 25, 62), e10);
            }
        } else {
            throw new U3(A00(427, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1574Tu
    public final synchronized void clear() throws U3 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e10) {
            throw new U3(A00(282, 24, 87), e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vm != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
