package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import qg.t0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f29520h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f29521b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputLayout f29522c;

    /* renamed from: e, reason: collision with root package name */
    public final EditText f29523e;

    /* renamed from: f, reason: collision with root package name */
    public final a f29524f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f29525g;

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    public void addInputFilter(InputFilter inputFilter) {
        EditText editText = this.f29523e;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        editText.setFilters(inputFilterArr);
    }

    public TextInputLayout getTextInput() {
        return this.f29522c;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29521b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f29523e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        Chip chip = this.f29521b;
        chip.setChecked(z10);
        int i10 = z10 ? 0 : 4;
        EditText editText = this.f29523e;
        editText.setVisibility(i10);
        chip.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            t0.requestFocusAndShowKeyboard(editText, false);
        }
    }

    public void setChipDelegate(x3.b bVar) {
        z1.setAccessibilityDelegate(this.f29521b, bVar);
    }

    public void setCursorVisible(boolean z10) {
        this.f29523e.setCursorVisible(z10);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f29525g.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29521b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f29521b.setTag(i10, obj);
    }

    public void setText(CharSequence charSequence) {
        String text = TimeModel.formatText(getResources(), charSequence);
        this.f29521b.setText(text);
        if (TextUtils.isEmpty(text)) {
            return;
        }
        EditText editText = this.f29523e;
        a aVar = this.f29524f;
        editText.removeTextChangedListener(aVar);
        editText.setText(text);
        editText.addTextChangedListener(aVar);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f29521b.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f29521b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f29522c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f29523e = editText;
        editText.setVisibility(4);
        a aVar = new a(this);
        this.f29524f = aVar;
        editText.addTextChangedListener(aVar);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f29525g = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
