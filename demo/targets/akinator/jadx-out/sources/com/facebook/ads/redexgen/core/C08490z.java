package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* renamed from: com.facebook.ads.redexgen.X.0z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08490z extends C9Z implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C2614or A05;
    public InterfaceC2353kN A06;
    public C10137j A07;
    public AbstractC10127i A08;
    public AbstractC10127i A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C6N A0E;
    public final InterfaceC1157Dn A0F;
    public final InterfaceC1160Dq A0G;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            i13++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, AbstractJsonLexerKt.TC_INVALID, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, Utf8.REPLACEMENT_BYTE, 8, 3, 9, 8, 31, 8, 31};
    }

    static {
        A09();
    }

    public C08490z(InterfaceC1160Dq interfaceC1160Dq, Looper looper, InterfaceC1157Dn interfaceC1157Dn) {
        super(3);
        this.A0G = (InterfaceC1160Dq) C3M.A01(interfaceC1160Dq);
        this.A0D = looper == null ? null : AbstractC09264a.A0c(looper, this);
        this.A0F = interfaceC1157Dn;
        this.A0E = new C6N();
        this.A02 = C.TIME_UNSET;
        this.A04 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        C3M.A01(this.A09);
        if (this.A01 >= this.A09.A7w()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7v(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j10) {
        int iA8S = this.A09.A8S(j10);
        if (iA8S != 0) {
            int nextEventTimeIndex = this.A09.A7w();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (iA8S == -1) {
                    AbstractC10127i abstractC10127i = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A7w();
                        return abstractC10127i.A7v(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A7w();
                    return abstractC10127i.A7v(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = iA8S - 1;
                return this.A09.A7v(nextEventTimeIndex5);
            }
        }
        return ((AbstractC2535nX) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j10) {
        boolean z10 = true;
        C3M.A08(j10 != C.TIME_UNSET);
        if (this.A04 == C.TIME_UNSET) {
            z10 = false;
        }
        C3M.A08(z10);
        return j10 - this.A04;
    }

    private void A04() {
        A0B(new C2563o0(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5C((C2614or) C3M.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC2353kN) C3M.A01(this.A06)).AGr();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C2563o0 c2563o0) {
        this.A0G.ACw(c2563o0.A01);
        this.A0G.ACv(c2563o0);
    }

    private void A0B(C2563o0 c2563o0) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c2563o0).sendToTarget();
        } else {
            A0A(c2563o0);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C1159Dp c1159Dp) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c1159Dp).sendToTarget();
        }
    }

    private void A0D(C2352kM c2352kM) {
        AnonymousClass44.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c2352kM);
        A0C(new C1159Dp(this.A05, c2352kM));
        A04();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1Z() {
        this.A05 = null;
        this.A02 = C.TIME_UNSET;
        A04();
        this.A04 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1a(long j10, boolean z10) {
        this.A03 = j10;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = C.TIME_UNSET;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC2353kN) C3M.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1c(C2614or[] c2614orArr, long j10, long j11) {
        this.A04 = j11;
        this.A05 = c2614orArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean AAG() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean AAV() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AHn(long r10, long r12) throws com.facebook.ads.redexgen.core.C5P {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C08490z.AHn(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.core.C7D
    public final int AJb(C2614or c2614or) {
        if (this.A0F.AJc(c2614or)) {
            return AnonymousClass76.A00(4);
        }
        if (AbstractC08812h.A0E(c2614or.A0W)) {
            return AnonymousClass76.A00(1);
        }
        return AnonymousClass76.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM, com.facebook.ads.redexgen.core.C7D
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C2563o0) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
