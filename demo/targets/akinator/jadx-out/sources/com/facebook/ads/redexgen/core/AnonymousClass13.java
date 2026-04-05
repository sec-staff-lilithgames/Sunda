package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.13, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass13 extends C9Z implements Handler.Callback {
    public static byte[] A0C;
    public static String[] A0D = {"NK", "vMUMQm9t3PVEHAhulw0MAIkQwbUiUT4C", "VzHAp2e3DLoJMdzQNED0QcuPK7cYUDq5", "FnbOiwq", "xIduLB4T8250", "Cs28mBuu0mG0MZGGLuKaoZOHc13snW3U", "yvPpy336WGNf4g7OJVDaRPYRY7Bcuv5q", "KVpXSq2ZIE7gcar9k8WJ"};
    public int A00;
    public int A01;
    public long A02;
    public HK A03;
    public List<ImfDataTrack> A04;
    public boolean A05;
    public final Handler A06;
    public final B1 A07;
    public final B3 A08;
    public final C10428z A09;
    public final long[] A0A;
    public final Metadata[] A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{86, 97, 97, 124, 97, 51, 122, 125, 51, 99, 114, 97, 96, 122, 125, 116, 51, 90, 94, 85, 51, 96, 99, 118, 112, 124, 84, 69, 80, 85, 80, 69, 80, 99, 84, 95, 85, 84, 67, 84, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.A02(); i10++) {
            C2614or c2614orA9T = metadata.A03(i10).A9T();
            if (c2614orA9T == null || !this.A07.AJc(c2614orA9T)) {
                list.add(metadata.A03(i10));
            } else {
                HK hkA5B = this.A07.A5B(c2614orA9T);
                byte[] bArr = (byte[]) C3M.A01(metadata.A03(i10).A9S());
                this.A09.A0A();
                this.A09.A0C(bArr.length);
                ((ByteBuffer) AbstractC09264a.A0f(this.A09.A02)).put(bArr);
                this.A09.A0B();
                Metadata metadataA5g = hkA5B.A5g(this.A09);
                if (metadataA5g != null) {
                    A07(metadataA5g, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public AnonymousClass13(B3 b32, Looper looper) {
        this(b32, looper, B1.A00, null);
    }

    public AnonymousClass13(B3 b32, Looper looper, B1 b12, String str) {
        super(5);
        this.A08 = (B3) C3M.A01(b32);
        this.A06 = looper == null ? null : AbstractC09264a.A0c(looper, this);
        this.A07 = (B1) C3M.A01(b12);
        this.A09 = new C10428z();
        this.A0B = new Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j10) {
        if (this.A04 == null) {
            return;
        }
        for (ImfDataTrack imfDataTrack : this.A04) {
            if (imfDataTrack.A01 > j10 || imfDataTrack.A00 >= j10) {
            }
        }
    }

    private void A04(long j10) {
        if (this.A04 == null) {
            return;
        }
        long jA01 = AbstractC08721w.A01(j10);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, Long.valueOf(jA01)).sendToTarget();
        } else {
            A03(jA01);
        }
    }

    private void A05(Metadata metadata, long j10) {
        if (this.A06 != null) {
            Handler handler = this.A06;
            String[] strArr = A0D;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "4kdXpcjsywiaLxx0LOctAJHWIf081Tdg";
            handler.obtainMessage(0, new Object[]{metadata, Long.valueOf(j10)}).sendToTarget();
            return;
        }
        A06(metadata, j10);
    }

    private void A06(Metadata metadata, long j10) {
        this.A08.AEE(metadata, j10);
    }

    private void A08(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = ImfSpecParser.A01(str);
            } catch (JSONException unused) {
                AnonymousClass44.A05(A00(25, 16, 46), A00(0, 25, 12));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1a(long j10, boolean z10) {
        A01();
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1c(C2614or[] c2614orArr, long j10, long j11) {
        this.A03 = this.A07.A5B(c2614orArr[0]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean AAG() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean AAV() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void AHn(long j10, long j11) {
        A04(j10);
        if (!this.A05) {
            int i10 = this.A00;
            String[] strArr = A0D;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[6] = "1aiib0Ku6fHDvKwfwiyuvRv8M83XUpBK";
            if (i10 < 5) {
                this.A09.A0A();
                C6N c6nA1U = A1U();
                int iA1R = A1R(c6nA1U, this.A09, 0);
                if (iA1R == -4) {
                    if (this.A09.A05()) {
                        this.A05 = true;
                    } else if (!this.A09.A04()) {
                        this.A09.A00 = this.A02;
                        this.A09.A0B();
                        Metadata metadataA5g = ((HK) AbstractC09264a.A0f(this.A03)).A5g(this.A09);
                        if (metadataA5g != null) {
                            ArrayList arrayList = new ArrayList(metadataA5g.A02());
                            A07(metadataA5g, arrayList);
                            if (!arrayList.isEmpty()) {
                                Metadata metadata = new Metadata(arrayList);
                                int i11 = (this.A01 + this.A00) % 5;
                                this.A0B[i11] = metadata;
                                this.A0A[i11] = this.A09.A01;
                                this.A00++;
                            }
                        }
                    }
                } else if (iA1R == -5) {
                    this.A02 = ((C2614or) C3M.A01(c6nA1U.A00)).A0M;
                }
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j10) {
            A05((Metadata) AbstractC09264a.A0f(this.A0B[this.A01]), AbstractC08721w.A01(j10 - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C7D
    public final int AJb(C2614or c2614or) {
        int i10;
        if (this.A07.AJc(c2614or)) {
            if (AnonymousClass14.A1G(c2614or)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return AnonymousClass76.A00(i10);
        }
        return AnonymousClass76.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM, com.facebook.ads.redexgen.core.C7D
    public final String getName() {
        return A00(25, 16, 46);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                A06((Metadata) objArr[0], ((Long) objArr[1]).longValue());
                return true;
            case 1:
                A03(((Long) message.obj).longValue());
                String[] strArr = A0D;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new RuntimeException();
                }
                A0D[5] = "UckPrHUV0DeFsLdW0mSA3sL7bYTaY94z";
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
