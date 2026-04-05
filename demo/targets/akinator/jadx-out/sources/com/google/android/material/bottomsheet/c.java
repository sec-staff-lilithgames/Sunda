package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c extends BottomSheetBehavior.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f29021a;

    public c(e eVar) {
        this.f29021a = eVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public void onStateChanged(View view, int i10) {
        if (i10 == 5) {
            this.f29021a.cancel();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public void onSlide(View view, float f10) {
    }
}
