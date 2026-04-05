package u4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f87840a;

    /* renamed from: b, reason: collision with root package name */
    public e f87841b;

    public f(TextView textView) {
        this.f87840a = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f87840a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int loadState = s.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return s.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        s sVar = s.get();
        if (this.f87841b == null) {
            this.f87841b = new e(textView, this);
        }
        sVar.registerInitCallback(this.f87841b);
        return charSequence;
    }
}
