package com.google.android.material.datepicker;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f29189b;

    public p(s sVar) {
        this.f29189b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s sVar = this.f29189b;
        int i10 = sVar.f29196h;
        if (i10 == 2) {
            sVar.b(1);
            sVar.f29199k.announceForAccessibility(sVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
        } else if (i10 == 1) {
            sVar.b(2);
            sVar.f29198j.announceForAccessibility(sVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
        }
    }
}
