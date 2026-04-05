package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class TimePickerView extends ConstraintLayout implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f29565h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f29566b;

    /* renamed from: c, reason: collision with root package name */
    public final Chip f29567c;

    /* renamed from: e, reason: collision with root package name */
    public final ClockHandView f29568e;

    /* renamed from: f, reason: collision with root package name */
    public final ClockFaceView f29569f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButtonToggleGroup f29570g;

    public TimePickerView(Context context) {
        this(context, null);
    }

    public void addOnRotateListener(g gVar) {
        this.f29568e.addOnRotateListener(gVar);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f29567c.sendAccessibilityEvent(8);
        }
    }

    @Override // com.google.android.material.timepicker.l
    public void setActiveSelection(int i10) {
        boolean z10 = i10 == 12;
        Chip chip = this.f29566b;
        chip.setChecked(z10);
        chip.setAccessibilityLiveRegion(z10 ? 2 : 0);
        boolean z11 = i10 == 10;
        Chip chip2 = this.f29567c;
        chip2.setChecked(z11);
        chip2.setAccessibilityLiveRegion(z11 ? 2 : 0);
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f29568e.setAnimateOnTouchUp(z10);
    }

    @Override // com.google.android.material.timepicker.l
    public void setHandRotation(float f10) {
        this.f29568e.setHandRotation(f10);
    }

    public void setHourClickDelegate(x3.b bVar) {
        z1.setAccessibilityDelegate(this.f29566b, bVar);
    }

    public void setMinuteHourDelegate(x3.b bVar) {
        z1.setAccessibilityDelegate(this.f29567c, bVar);
    }

    public void setOnActionUpListener(f fVar) {
        this.f29568e.setOnActionUpListener(fVar);
    }

    @Override // com.google.android.material.timepicker.l
    public void setValues(String[] strArr, int i10) throws Resources.NotFoundException {
        this.f29569f.setValues(strArr, i10);
    }

    public void showToggle() {
        this.f29570g.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.l
    public void updateTime(int i10, int i11, int i12) {
        this.f29570g.check(i10 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i12));
        String str2 = String.format(locale, "%02d", Integer.valueOf(i11));
        Chip chip = this.f29566b;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = this.f29567c;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f10, boolean z10) {
        this.f29568e.setHandRotation(f10, z10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n nVar = new n(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f29569f = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f29570g = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new m(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f29566b = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f29567c = chip2;
        this.f29568e = (ClockHandView) findViewById(R.id.material_clock_hand);
        p pVar = new p(new GestureDetector(getContext(), new o(this)));
        chip.setOnTouchListener(pVar);
        chip2.setOnTouchListener(pVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(nVar);
        chip2.setOnClickListener(nVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
