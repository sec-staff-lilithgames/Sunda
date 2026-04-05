package dh;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public int f52212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f52213c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f52214e;

    public a0(TextInputLayout textInputLayout, EditText editText) {
        this.f52214e = textInputLayout;
        this.f52213c = editText;
        this.f52212b = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f52214e;
        textInputLayout.w(!textInputLayout.D0, false);
        if (textInputLayout.f29491n) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f29507v) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f52213c;
        int lineCount = editText.getLineCount();
        int i10 = this.f52212b;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.f29510w0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f52212b = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
