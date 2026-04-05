package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.mV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2471mV implements InterfaceC1099Bf {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public InterfaceC1098Be A00;
    public final AnonymousClass31 A01;
    public final AnonymousClass56 A02;
    public final C7S A03;
    public final M2 A04;
    public final Executor A05;
    public volatile C4M<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
            i13++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1099Bf
    public final void A5v(InterfaceC1098Be interfaceC1098Be) throws InterruptedException, IOException {
        this.A00 = interfaceC1098Be;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2472mW(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) C3M.A01(e10.getCause());
                    if (0 == 0) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        AbstractC09264a.A11(th2);
                        throw null;
                    }
                }
            } catch (Throwable th3) {
                ((C4M) C3M.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th3;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((C4M) C3M.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2471mV(C2605oi c2605oi, C2267ix c2267ix, Executor executor) {
        this.A05 = (Executor) C3M.A01(executor);
        C3M.A01(c2605oi.A03);
        this.A02 = new AnonymousClass53().A06(c2605oi.A03.A00).A08(c2605oi.A03.A04).A02(4).A09();
        this.A03 = c2267ix.A07();
        this.A04 = new M2(this.A03, this.A02, null, new M1() { // from class: com.facebook.ads.redexgen.X.mX
            @Override // com.facebook.ads.redexgen.core.M1
            public final void AEp(long j10, long j11, long j12) {
                this.A00.A03(j10, j11, j12);
            }
        });
        this.A01 = c2267ix.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j10, long j11, long j12) {
        float f10;
        if (this.A00 == null) {
            return;
        }
        if (j10 == -1 || j10 == 0) {
            f10 = -1.0f;
        } else {
            f10 = (j11 * 100.0f) / j10;
        }
        this.A00.AEo(j10, j11, f10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4M != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1099Bf
    public final void cancel() {
        this.A07 = true;
        C4M<Void, IOException> c4m = this.A06;
        if (c4m != null) {
            c4m.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1099Bf
    public final void remove() {
        this.A03.A0E().AHk(this.A03.A0F().A4d(this.A02));
    }
}
