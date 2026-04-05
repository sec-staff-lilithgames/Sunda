package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class C9 implements InterfaceC2015ec {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{72, 99, 114, 113, 105, 116, 109, 38, 99, 116, 116, 105, 116};
    }

    public C9(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e10) {
            Log.e(getClass().getSimpleName(), A00(0, 13, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), e10);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2015ec
    public final byte[] A6u() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2015ec
    public final String A6v() {
        if (this.A03 != null) {
            return new String(this.A03);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2015ec
    public final Map<String, List<String>> A86() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2015ec
    public final int A94() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2015ec
    public final String getUrl() {
        return this.A01;
    }
}
