package q;

import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f82201a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f82202b;

    public p0(TextView textView) {
        this.f82201a = (TextView) w3.i.checkNotNull(textView);
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.f82202b;
        return textClassifier == null ? o0.a(this.f82201a) : textClassifier;
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.f82202b = textClassifier;
    }
}
