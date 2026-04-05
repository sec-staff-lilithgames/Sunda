package io.bidmachine.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n0 {
    public static void removeAllEmbeddedStyling(in.a aVar) {
        aVar.clearWindowColor();
        if (aVar.getText() instanceof Spanned) {
            if (!(aVar.getText() instanceof Spannable)) {
                aVar.setText(SpannableString.valueOf(aVar.getText()));
            }
            Spannable spannable = (Spannable) io.bidmachine.media3.common.util.a.checkNotNull(aVar.getText());
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof in.g)) {
                    spannable.removeSpan(obj);
                }
            }
        }
        removeEmbeddedFontSizes(aVar);
    }

    public static void removeEmbeddedFontSizes(in.a aVar) {
        aVar.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (aVar.getText() instanceof Spanned) {
            if (!(aVar.getText() instanceof Spannable)) {
                aVar.setText(SpannableString.valueOf(aVar.getText()));
            }
            Spannable spannable = (Spannable) io.bidmachine.media3.common.util.a.checkNotNull(aVar.getText());
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float resolveTextSize(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
