package com.facebook.ads.redexgen.core;

import android.view.View;
import com.sfbx.appconsent.core.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnAttachStateChangeListenerC1606Va extends AbstractC2659ps implements View.OnAttachStateChangeListener {
    public static byte[] A02;
    public final View A00;
    public final C1911cu A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{AbstractJsonLexerKt.TC_INVALID, 64, 76, 94, 89, 70, 64, 71, 93, 9, AbstractJsonLexerKt.TC_INVALID, 64, 76, 94, 9, 69, 64, 79, 76, 74, 80, 74, 69, 76, 9, 74, 91, 72, 90, 65, 64, 71, 78, 9, 90, 93, 72, 91, 93, 122, 74, 72, 71, 9, 9, 11, 52, 56, 42, 45, 50, 52, 51, 41, 125, 11, 52, 56, 42, 125, 49, 52, 59, 56, 62, 36, 62, 49, 56, 125, 62, 47, 60, 46, 53, 52, 51, 58, 125, 46, 41, 60, 47, 41, 14, 62, 60, 51, 19, 50, 42, 125, 125, 103, 88, 84, 70, 65, 94, 88, 95, 69, 17, 103, 88, 84, 70, 17, 93, 88, 87, 84, 82, 72, 82, 93, 84, 17, 82, 67, 80, 66, 89, 88, 95, 86, 17, 66, 69, 94, 65, 98, 82, 80, 95, 17, 17, 8, 30, 24, 20, 21, 31, 36, 24, 19, 26, 21, 21, 30, 23};
    }

    public ViewOnAttachStateChangeListenerC1606Va(View view, C1911cu c1911cu) {
        this.A00 = view;
        this.A01 = c1911cu;
        this.A00.addOnAttachStateChangeListener(this);
        if (A05()) {
            try {
                A00();
            } catch (Throwable th2) {
                this.A01.A08().AAy(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), BuildConfig.VERSION_CODE, new C1551Sw(A00(0, 45, 1) + th2.getMessage()));
            }
        }
    }

    public final void A04() {
        try {
            A00();
        } catch (Throwable th2) {
            this.A01.A08().AAy(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), BuildConfig.VERSION_CODE, new C1551Sw(A00(45, 48, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) + th2.getMessage()));
        }
    }

    public final boolean A05() {
        return P3.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        try {
            A00();
        } catch (Throwable th2) {
            this.A01.A08().AAy(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), BuildConfig.VERSION_CODE, new C1551Sw(A00(0, 45, 1) + th2.getMessage()));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        try {
            A02();
        } catch (Throwable th2) {
            this.A01.A08().AAy(A00(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 14, 83), BuildConfig.VERSION_CODE, new C1551Sw(A00(93, 44, 25) + th2.getMessage()));
        }
    }
}
