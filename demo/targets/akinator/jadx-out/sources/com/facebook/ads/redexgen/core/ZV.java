package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class ZV extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"Mfdbn5Fl8k5qESsaG0tegRjcib9VHyOt", "n0hxWP15hSbsHLgypwcG0GAEv81vEzmV", "Vpnz2oFEzE2IYGPVAE8ZMW29wyhZcEwz", "XXuq8LnmLUMAtFguuOE2ao", "65dSWN68FJcVNMzXlJchEDZxxrt4hqBN", "4lVNSswaDDObG8m1C4PrWCxrHhrY", "bBsj4v6TxeKFgxIfhKXDpm0rApYDu", "O9LsOEgR32mEkKEZI9qaQe7VINaI1GfC"};

    @Nullable
    public Drawable A00;
    public TextView A01;
    public TextView A02;
    public final C1937dL A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "BgS7v0vuK4FmmS5TgN4Oq9qrsj8N";
            strArr2[6] = "egQQbAPCKiEugSC3TXQQi3lfGkkhl";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 88);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{6, 26, 26, 30, 29};
    }

    static {
        A02();
    }

    public ZV(C1937dL c1937dL) {
        super(c1937dL);
        this.A03 = c1937dL;
        A01();
    }

    private void A01() {
        float f10 = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams = new LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(-16777216);
        this.A02.setTextSize(2, 20.0f);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        this.A02.setGravity(17);
        addView(this.A02, titleTextViewParams);
        this.A01 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(-16777216);
        this.A01.setTextSize(2, 15.0f);
        float density = 5.0f * f10;
        this.A01.setCompoundDrawablePadding((int) density);
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        this.A01.setGravity(17);
        addView(this.A01, titleTextViewParams2);
        if (U7.A2o(this.A03)) {
            TextView textView = this.A02;
            String[] strArr = A05;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[1] = "YCLa9ko3h9BxKjOoBFpqdrzQ8S4ZW0px";
            textView.setVisibility(4);
            this.A01.setVisibility(4);
        }
    }

    private Drawable getPadlockDrawable() {
        if (this.A00 == null) {
            this.A00 = XY.A03(this.A03, XX.BROWSER_PADLOCK);
        }
        return this.A00;
    }

    public void setSubtitle(String str) throws SecurityException {
        if (TextUtils.isEmpty(str)) {
            this.A01.setText((CharSequence) null);
            this.A01.setVisibility(4);
        } else {
            Uri uriA00 = WQ.A00(str);
            this.A01.setText(uriA00.getHost());
            this.A01.setCompoundDrawablesRelativeWithIntrinsicBounds(A00(0, 5, 54).equals(uriA00.getScheme()) ? getPadlockDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.A01.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A02.setText((CharSequence) null);
            this.A02.setVisibility(4);
        } else {
            this.A02.setText(str);
            this.A02.setVisibility(0);
        }
    }
}
