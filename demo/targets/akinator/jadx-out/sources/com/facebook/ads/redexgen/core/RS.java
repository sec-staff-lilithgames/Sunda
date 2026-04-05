package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class RS implements NativeBannerAdApi {
    public static byte[] A01;
    public static String[] A02 = {"068yMtBHtCdtzUYBTQD9IwnMWW1doBJF", "2l8Hok5ewW", "SqMVYGMc7AyphtDxx4DkXGESiOtqp3Wk", "n7xht10RjuH04nLwyOxbbpbZUJ6bFNP5", "hemUdCIRyaFDmP64bLQtQG29khNbMpFH", "0krrnlsRXu", "j9YMm5Kfv7iMZif7VGfsQGY8YQ9Z0I42", "SiUubuHC3Y"};
    public final C1480Qc A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A02[0].charAt(2) != '8') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "SDJ7CqIuYGJEmotuvG7btG7Q2tCK4c6p";
            strArr[6] = "3TZdd6KNeaSFSkmrHNZK7GULPPfkGOEa";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13};
    }

    static {
        A01();
    }

    public RS(NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = C1480Qc.A0L(nativeAdBaseApi);
        this.A00.A1b(V6.A05);
    }

    private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi) {
        C1480Qc c1480QcA0L = C1480Qc.A0L(nativeAdBaseApi);
        C2073fZ c2073fZ = new C2073fZ(this, imageView, c1480QcA0L);
        C1595Up adIcon = c1480QcA0L.getAdIcon();
        if (adIcon != null) {
            Bitmap bitmapA0N = c1480QcA0L.A11().A0N(adIcon.getUrl());
            Context context = imageView.getContext();
            String[] strArr = A02;
            if (strArr[2].charAt(21) == strArr[6].charAt(21)) {
                A02[4] = "oesEo3u5gOmbsNZfXjsimFyw8pPXYbZZ";
                C1937dL c1937dLA03 = RB.A03(context);
                if (bitmapA0N != null) {
                    Drawable drawableA05 = C1480Qc.A05(c1937dLA03, bitmapA0N, c1480QcA0L.A1g(), c1480QcA0L.A1D());
                    C1480Qc.A0f(drawableA05, imageView);
                    imageView.post(new C2072fY(this, c1480QcA0L, drawableA05));
                    return;
                } else {
                    C2073fZ c2073fZ2 = null;
                    RP loadImageTask = new RP(c1937dLA03, c2073fZ, c1480QcA0L.A1g(), c2073fZ2);
                    loadImageTask.execute(new RR(adIcon.getUrl(), c1480QcA0L.A1D(), c2073fZ2));
                    return;
                }
            }
        } else {
            QQ qqA16 = c1480QcA0L.A16();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            if (A02[4].charAt(17) != 't') {
                A02[4] = "aFZFEDb6phUkMJAuumeHd9ws0nVx9tBY";
                c1480QcA0L.A12().A0F().A3F(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (qqA16 != null) {
                    qqA16.ADB(V1.A00(adErrorType));
                }
                Log.e(A00(0, 17, 86), adErrorType.getDefaultErrorMessage());
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, ImageView imageView) {
        registerViewForInteraction(view, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, ImageView imageView, List<View> list) {
        if (imageView != null) {
            A02(imageView, this.A00);
        }
        if (list != null) {
            C1480Qc c1480Qc = this.A00;
            if (A02[1].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "ll9cTRtW3a";
            strArr[7] = "WGLVGgKdvO";
            c1480Qc.A1N(view, imageView, list);
            return;
        }
        this.A00.A1M(view, imageView);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, List<View> clickableViews) {
        if (mediaView != null) {
            ((C2081fh) mediaView.getMediaViewApi()).A0M(this.A00, true);
        }
        if (clickableViews != null) {
            this.A00.A1Q(view, mediaView, clickableViews, true);
        } else {
            this.A00.A1R(view, mediaView, true);
        }
    }
}
