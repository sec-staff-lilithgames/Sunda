package com.google.android.material.datepicker;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class n extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f29186d;

    public n(s sVar) {
        this.f29186d = sVar;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        s sVar = this.f29186d;
        cVar.addAction(new c.a(16, sVar.f29203o.getVisibility() == 0 ? sVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : sVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
