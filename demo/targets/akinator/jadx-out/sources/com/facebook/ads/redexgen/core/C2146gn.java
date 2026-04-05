package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2146gn implements InterfaceC1414Nm {
    public static byte[] A06;
    public static String[] A07 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public boolean A00;
    public final AbstractC2171hD A01;
    public final InterfaceC1402Na A02;
    public final HandlerC1409Nh A03;
    public final C2145gm A04;
    public final C1937dL A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, AbstractJsonLexerKt.TC_INVALID, 101, 54, 120, 99, 122, 122, 3, 20, 15, 5, 13, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, AbstractJsonLexerKt.TC_INVALID, 118, AbstractJsonLexerKt.TC_INVALID, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, 64, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, 64, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, 14, 8, 10, 85, 79, AbstractJsonLexerKt.TC_INVALID, 91, 65, 65, 91, 92, 85, 18, 80, 71, 92, 86, 94, 87, 18, 84, 93, 64, 18, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, 32, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, 46, 32, 60, 5, 20, 13};
    }

    static {
        A01();
    }

    public C2146gn(C1937dL c1937dL, C2145gm c2145gm, InterfaceC1402Na interfaceC1402Na, AbstractC2171hD abstractC2171hD, HandlerC1409Nh handlerC1409Nh) {
        this.A05 = c1937dL;
        this.A04 = c2145gm;
        this.A02 = interfaceC1402Na;
        this.A01 = abstractC2171hD;
        this.A03 = handlerC1409Nh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1414Nm
    public final Bundle A5J(String str) {
        return AbstractC1421Nt.A03(str, this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1414Nm
    public final void A5n() {
        this.A03.A0F(2002, null);
        this.A03.A0C();
        this.A04.A02(null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1414Nm
    public final int A8H() {
        return 2000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014c, code lost:
    
        r9.A04.A04.onAdLoaded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015e, code lost:
    
        r9.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1414Nm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9b(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2146gn.A9b(android.os.Message):void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1414Nm
    public final void AJ3(boolean z10) {
        this.A00 = z10;
    }
}
