package com.google.android.material.datepicker;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f29165c;

    public /* synthetic */ d(View view, int i10) {
        this.f29164b = i10;
        this.f29165c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29164b;
        View view = this.f29165c;
        switch (i10) {
            case 0:
                t0.requestFocusAndShowKeyboard(view, false);
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                int i11 = BottomAppBar.f28949x0;
                view.requestLayout();
                break;
        }
    }
}
