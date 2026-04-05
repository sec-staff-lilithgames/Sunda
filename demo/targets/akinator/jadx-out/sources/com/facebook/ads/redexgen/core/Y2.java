package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y2 extends RelativeLayout {
    public static byte[] A03;
    public static String[] A04 = {"1ndtPHkCNG2MrcfU", "OkotuIrDHFdt3GuHIAQXgGngH1IosrSP", "w1znC0uCczOhgZoOcmgh63wQHQC04hJe", "LpK8hBAwmPAdG3KY0YfFHbQT3q40mu0e", "O8GEFlZj6nQCoGB8qsscGdpyRLKvgqm0", "WaIEcxX", "XMBXBBLBPjQfoEVhqbgB7WanyEloQPjm", "KaNBEQe5mownSAjOblO08Wd4OxcuEM8d"};
    public static final int A05;
    public static final int A06;
    public final ImageView A00;
    public final ImageView A01;
    public final C1937dL A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[0].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "ULiiLRGxcEAphtP2D4AjLhxKdPtmqQZf";
            strArr2[3] = "IodoKdznfIBMKrNK9oRp1NZvy6AtC0Mf";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
            i13++;
        }
    }

    public static void A02() {
        String[] strArr = A04;
        if (strArr[4].charAt(18) == strArr[3].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "AIVPcyptJR7BDqEaYBWxJso7N9d0VHMs";
        strArr2[3] = "PIjuROse392MLv7GhU36YdX9Z5SxUZMR";
        A03 = new byte[]{-128, -109, -98, -99, -96, -94, 78, 111, -110};
    }

    static {
        A02();
        A06 = (int) (AbstractC1640Wl.A02 * 4.0f);
        A05 = (int) (AbstractC1640Wl.A02 * 6.0f);
    }

    public Y2(C1937dL c1937dL) {
        super(c1937dL);
        this.A02 = c1937dL;
        XP.A0Q(this, XP.A06(855638016, A05));
        this.A01 = A00(XX.DEFAULT_INFO_ICON);
        this.A00 = A00(XX.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 31));
        LinearLayout linearLayout = new LinearLayout(c1937dL);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
        setClickable(true);
        setFocusable(true);
    }

    private ImageView A00(XX xx) {
        ImageView imageView = new ImageView(this.A02);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(0, A06, 0, A06);
        imageView.setImageBitmap(XY.A01(xx));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams iconLayoutParams = new LinearLayout.LayoutParams(0, -1);
        iconLayoutParams.weight = 1.0f;
        imageView.setLayoutParams(iconLayoutParams);
        return imageView;
    }
}
