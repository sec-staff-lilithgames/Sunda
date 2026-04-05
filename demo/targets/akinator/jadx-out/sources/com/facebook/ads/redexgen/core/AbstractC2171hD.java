package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2171hD implements InterfaceC1420Ns {
    public static byte[] A06;
    public final InterfaceC1402Na A00;
    public final HandlerC1409Nh A01;
    public final C1937dL A02;
    public final Handler A03;
    public final String A04;
    public final InterfaceC1414Nm A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, 21, 22, 20, 33, 7, 20, 20, 17, 20, 33, 15, 7, 21, 21, 3, 9, 7, 33, 13, 7, 27};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z10);

    public AbstractC2171hD(C1937dL c1937dL, String str, InterfaceC1415Nn interfaceC1415Nn) {
        this.A02 = c1937dL;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C2174hG(c1937dL, this);
        this.A01 = new HandlerC1409Nh(c1937dL, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = interfaceC1415Nn.A5K(this.A00, this, this.A01);
    }

    public final InterfaceC1402Na A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AHG();
            A06();
        } else {
            this.A02.A0F().AH8();
            this.A01.A02 = true;
            this.A01.A0E(UA.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AHM();
        if (!this.A01.A0F(this.A05.A8H(), this.A05.A5J(this.A04))) {
            A09();
            this.A02.A0F().AHE();
        }
    }

    public final void A07() {
        if (!U7.A0u(this.A02)) {
            return;
        }
        XJ.A00(new C2172hE(this));
    }

    public final void A0A(int i10) {
        this.A01.A0D(this.A02, i10);
    }

    public final void A0B(int i10, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String strA01 = A01(48, 21, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        if (str != null) {
            bundle.putString(strA01, str);
        } else {
            bundle.putString(strA01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AED(i10, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A9b(message);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1420Ns
    public final void AED(int i10, String str, Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i10);
        messageObtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C2173hF(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
