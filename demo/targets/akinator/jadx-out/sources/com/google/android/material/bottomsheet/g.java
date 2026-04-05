package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class g extends w0 {
    private boolean waitingForDismissAllowingStateLoss;

    public g() {
    }

    public static void access$100(g gVar) {
        if (gVar.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final boolean b(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof e)) {
            return false;
        }
        e eVar = (e) dialog;
        BottomSheetBehavior<FrameLayout> behavior = eVar.getBehavior();
        if (!behavior.isHideable() || !eVar.getDismissWithAnimation()) {
            return false;
        }
        this.waitingForDismissAllowingStateLoss = z10;
        if (behavior.getState() == 5) {
            if (this.waitingForDismissAllowingStateLoss) {
                super.dismissAllowingStateLoss();
                return true;
            }
            super.dismiss();
            return true;
        }
        if (getDialog() instanceof e) {
            e eVar2 = (e) getDialog();
            eVar2.f29026h.removeBottomSheetCallback(eVar2.f29037s);
        }
        behavior.addBottomSheetCallback(new f(this));
        behavior.setState(5);
        return true;
    }

    @Override // androidx.fragment.app.w
    public void dismiss() {
        if (b(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.w
    public void dismissAllowingStateLoss() {
        if (b(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.w0, androidx.fragment.app.w
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getContext(), getTheme());
    }

    public g(int i10) {
        super(i10);
    }
}
