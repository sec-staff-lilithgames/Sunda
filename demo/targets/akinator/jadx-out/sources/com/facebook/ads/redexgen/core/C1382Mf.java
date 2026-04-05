package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1382Mf extends BroadcastReceiver {
    public static byte[] A04;
    public static String[] A05 = {"Y8Z1", "Gib9", "71bezSKIJxKufdL13ppDGQvN3l", "amgHka60jBO0VGEiDWjvaQpooGEX1vUM", "ttT0jofZ4zWB5Dwx3mPNIXc", "eyh0I6c0vYFaGMFwnoeMEbyGHh2pIYmK", "GRZnv0m", "VfIH6aQ48NmkLcOtEQWPZe5uGeHooIii"};
    public C2233iN A00;
    public InterfaceC1381Me A01;
    public C1937dL A02;
    public String A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-12, -58, -46, -48, -111, -55, -60, -58, -56, -59, -46, -46, -50, -111, -60, -57, -42, -111, -47, -60, -41, -52, -39, -56, -111, -60, -57, -62, -58, -49, -52, -58, -50};
    }

    static {
        A01();
    }

    public C1382Mf(C1937dL c1937dL, String str, C2233iN c2233iN, InterfaceC1381Me interfaceC1381Me) {
        this.A02 = c1937dL;
        this.A03 = str;
        this.A01 = interfaceC1381Me;
        this.A00 = c2233iN;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 32, 35) + A00(0, 1, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        String[] strArrSplit = action.split(intentAction);
        if (strArrSplit.length >= 1 && (str = strArrSplit[0]) != null) {
            String[] strArr = A05;
            String str2 = strArr[0];
            String intentAction2 = strArr[1];
            if (str2.length() != intentAction2.length()) {
                throw new RuntimeException();
            }
            A05[7] = "UAhxU8HTiJONxaKo3zNJYg3uL8StvHDr";
            String intentAction3 = A00(1, 32, 35);
            if (intentAction3.equals(str)) {
                InterfaceC1381Me interfaceC1381Me = this.A01;
                C2233iN c2233iN = this.A00;
                String[] strArr2 = A05;
                String str3 = strArr2[0];
                String intentAction4 = strArr2[1];
                if (str3.length() != intentAction4.length()) {
                    throw new RuntimeException();
                }
                A05[6] = "";
                interfaceC1381Me.AEG(c2233iN);
            }
        }
    }
}
