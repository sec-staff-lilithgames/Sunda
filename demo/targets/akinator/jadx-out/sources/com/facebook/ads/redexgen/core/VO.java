package com.facebook.ads.redexgen.core;

import android.view.View;
import com.sfbx.appconsent.core.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class VO implements InterfaceC1584Ue {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC1606Va A00;
    public C2661pu<UE, UJ> A01;
    public final C1911cu A02;
    public final A8 A03 = A8.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, AbstractJsonLexerKt.TC_INVALID, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, 64, 64, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = VO.class.getSimpleName();
    }

    public VO(C1911cu c1911cu) {
        this.A02 = c1911cu;
    }

    private void A01() {
        this.A02.A08().AAy(A00(89, 14, 19), BuildConfig.VERSION_CODE, new C1551Sw(A00(67, 22, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void ACx() {
        if (this.A01 != null) {
            this.A01.A07.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void AFs() {
        if (this.A01 != null) {
            this.A01.A07.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void AJj(View view) {
        if (this.A01 == null) {
            this.A02.A08().AAy(A00(89, 14, 19), BuildConfig.VERSION_CODE, new C1551Sw(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void AK2(View view, String str, boolean z10) {
        AK3(view, str, z10, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void AK3(View view, String str, boolean z10, boolean z11) {
        AK4(view, str, z10, z11, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1584Ue
    public final void AK4(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            this.A00 = new ViewOnAttachStateChangeListenerC1606Va(view, this.A02);
            this.A03.A0A(this.A00, view);
            if (z11) {
                this.A00.A04();
            }
            this.A01 = C2661pu.A00(new UE(this.A02, view, str, z10, z12), new UJ(), A06).A06(new C1610Vf(new VN())).A07();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A08().AAy(A00(89, 14, 19), BuildConfig.VERSION_CODE, new C1551Sw(A00(0, 32, 98)));
    }
}
