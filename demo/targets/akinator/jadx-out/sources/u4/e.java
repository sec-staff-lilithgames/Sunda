package u4;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends s4.n {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f87838a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f87839b;

    public e(TextView textView, f fVar) {
        this.f87838a = new WeakReference(textView);
        this.f87839b = new WeakReference(fVar);
    }

    @Override // s4.n
    public void onInitialized() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceProcess;
        super.onInitialized();
        TextView textView = (TextView) this.f87838a.get();
        InputFilter inputFilter = (InputFilter) this.f87839b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceProcess = s.get().process((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceProcess);
                int selectionEnd = Selection.getSelectionEnd(charSequenceProcess);
                textView.setText(charSequenceProcess);
                if (charSequenceProcess instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceProcess;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                        return;
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                        return;
                    } else {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
