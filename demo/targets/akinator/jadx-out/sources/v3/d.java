package v3;

import android.text.Html;
import android.text.Spanned;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static Spanned fromHtml(String str, int i10) {
        return Html.fromHtml(str, i10);
    }

    public static String toHtml(Spanned spanned, int i10) {
        return Html.toHtml(spanned, i10);
    }

    public static Spanned fromHtml(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i10, imageGetter, tagHandler);
    }
}
