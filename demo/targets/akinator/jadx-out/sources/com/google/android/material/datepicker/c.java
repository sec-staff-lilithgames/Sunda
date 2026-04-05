package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import o9.d8;
import o9.g8;
import o9.p8;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29161b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f29160a = i10;
        this.f29161b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f29160a;
        Object obj = this.f29161b;
        switch (i10) {
            case 0:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                t0.hideKeyboard(view, false);
                break;
            case 1:
                dh.d dVar = (dh.d) obj;
                dVar.n(dVar.o());
                break;
            case 2:
                dh.l lVar = (dh.l) obj;
                lVar.f52240l = z10;
                lVar.k();
                if (!z10) {
                    lVar.n(false);
                    lVar.f52241m = false;
                    break;
                }
                break;
            case 3:
                SendFormActivity sendFormActivity = (SendFormActivity) obj;
                int i11 = SendFormActivity.O;
                if (z10) {
                    sendFormActivity.getClass();
                    break;
                } else {
                    sendFormActivity.hideKeyboard(view);
                    break;
                }
            case 4:
                d8 d8Var = (d8) obj;
                if (z10) {
                    d8Var.getClass();
                    break;
                } else {
                    d8Var.hideKeyboard(view);
                    break;
                }
            case 5:
                g8 g8Var = (g8) obj;
                if (z10) {
                    g8Var.getClass();
                    break;
                } else {
                    g8Var.hideKeyboard(view);
                    break;
                }
            default:
                p8 p8Var = (p8) obj;
                if (z10) {
                    p8Var.getClass();
                    break;
                } else {
                    p8Var.hideKeyboard(view);
                    break;
                }
        }
    }
}
