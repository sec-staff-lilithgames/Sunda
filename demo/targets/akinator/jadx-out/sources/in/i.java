package in;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i {
    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f10, int i10, int i11, int i12) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i10, i11, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i10 && spannable.getSpanEnd(relativeSizeSpan) >= i11) {
                f10 = relativeSizeSpan.getSizeChange() * f10;
            }
            if (spannable.getSpanStart(relativeSizeSpan) == i10 && spannable.getSpanEnd(relativeSizeSpan) == i11 && spannable.getSpanFlags(relativeSizeSpan) == i12) {
                spannable.removeSpan(relativeSizeSpan);
            }
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i10, i11, i12);
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i10, int i11, int i12) {
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == i12) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, i12);
    }
}
