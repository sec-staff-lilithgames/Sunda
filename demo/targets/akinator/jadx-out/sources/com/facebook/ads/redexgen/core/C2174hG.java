package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.hG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2174hG implements InterfaceC1402Na {
    public static byte[] A05;
    public static String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public AdError A00;
    public NZ A01 = NZ.A02;
    public NZ A02 = NZ.A02;
    public final AbstractC2171hD A03;
    public final C1937dL A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, 12, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, 64, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, 12, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, 11, 37, 33, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 65, 117, 104, 106, 39, 90, AbstractJsonLexerKt.TC_INVALID, 98, 99, 106, 45, 100, 99, 121, 104, AbstractJsonLexerKt.TC_INVALID, 99, 108, 97, 45, 121, AbstractJsonLexerKt.TC_INVALID, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, AbstractJsonLexerKt.TC_INVALID, 44, 109, 96, 126, 105, 109, 104, 117, 44, 64, 67, 77, 72, 69, 66, 75, 32, 44, 64, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, 64, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C2174hG(C1937dL c1937dL, AbstractC2171hD abstractC2171hD) {
        this.A04 = c1937dL;
        this.A03 = abstractC2171hD;
    }

    private void A02(NZ nz, NZ nz2) {
        String strA00 = A00(113, 26, 44);
        StringBuilder sb2 = new StringBuilder();
        String errorTitle = A00(108, 5, 38);
        StringBuilder sbAppend = sb2.append(errorTitle).append(nz);
        String errorTitle2 = A00(0, 4, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        String string = sbAppend.append(errorTitle2).append(nz2).toString();
        InterfaceC1549Su interfaceC1549SuA08 = this.A04.A08();
        int i10 = AbstractC1550Sv.A0e;
        C1551Sw c1551Sw = new C1551Sw(strA00, string);
        String errorTitle3 = A00(139, 3, 61);
        interfaceC1549SuA08.AAy(errorTitle3, i10, c1551Sw);
        String errorTitle4 = strA00 + ' ' + string;
        this.A04.A0F().AKP(errorTitle4);
    }

    private void A03(String str, String str2, boolean z10) {
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = NW.A00(this.A04);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(139, 3, 61);
        String strA002 = A00(91, 17, 66);
        if (!z10) {
            Log.e(strA002, str3);
            this.A04.A08().AAy(strA00, AbstractC1550Sv.A0c, new C1551Sw(str3));
            this.A04.A0F().AKO(str3);
            return;
        }
        switch (NY.A00[integrationErrorModeA00.ordinal()]) {
            case 1:
                String errorMessage = str3 + A00(4, 87, 3);
                throw new C1403Nb(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A04.A0F().AKO(str3);
                Log.e(strA002, str3);
                this.A04.A08().AAy(strA00, AbstractC1550Sv.A0c, new C1551Sw(str3));
                break;
        }
        Log.e(strA002, str3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final boolean A6M() {
        boolean z10 = (this.A01 == NZ.A02 || this.A01 == NZ.A04) && this.A02 != NZ.A07;
        if (z10) {
            this.A01 = NZ.A06;
        } else {
            A03(A00(142, 6, 39), A00(154, 42, 45), false);
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final boolean A6N() {
        if (this.A01 == NZ.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0F().AHL();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        NZ nz = this.A01;
        NZ nz2 = NZ.A05;
        String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z10 = nz == nz2 && (this.A02 != NZ.A07 || U7.A0i(this.A04));
        if (z10) {
            this.A01 = NZ.A02;
            this.A02 = NZ.A07;
        } else {
            NZ nz3 = this.A01;
            NZ nz4 = NZ.A05;
            String strA00 = A00(148, 6, 43);
            if (nz3 != nz4) {
                A03(strA00, A00(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 18, 44), true);
            } else {
                A03(strA00, A00(196, 23, 46), false);
            }
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final NZ A6h() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final NZ A6i() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final void AAn() {
        this.A01 = NZ.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final void AIc(NZ nz) {
        this.A01 = nz;
        this.A02 = nz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final void AIh(AdError adError) {
        this.A01 = NZ.A04;
        this.A02 = NZ.A04;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final void AIm() {
        if (this.A01 != NZ.A06) {
            A02(this.A01, NZ.A05);
        }
        NZ nz = NZ.A05;
        String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = nz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1402Na
    public final void AJ2() {
        if (this.A02 != NZ.A07) {
            A02(this.A01, NZ.A08);
        }
        this.A02 = NZ.A08;
    }
}
