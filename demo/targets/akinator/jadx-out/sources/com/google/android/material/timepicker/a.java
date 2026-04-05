package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import qg.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f29571b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f29571b = chipTextInputComboView;
    }

    @Override // qg.i0, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ChipTextInputComboView chipTextInputComboView = this.f29571b;
        Chip chip = chipTextInputComboView.f29521b;
        if (TextUtils.isEmpty(editable)) {
            chip.setText(TimeModel.formatText(chipTextInputComboView.getResources(), "00"));
            return;
        }
        int i10 = ChipTextInputComboView.f29520h;
        String text = TimeModel.formatText(chipTextInputComboView.getResources(), editable);
        if (TextUtils.isEmpty(text)) {
            text = TimeModel.formatText(chipTextInputComboView.getResources(), "00");
        }
        chip.setText(text);
    }
}
