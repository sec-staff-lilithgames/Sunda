package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w0 extends androidx.fragment.app.w {
    public w0() {
    }

    @Override // androidx.fragment.app.w
    public Dialog onCreateDialog(Bundle bundle) {
        return new v0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.w
    public void setupDialog(Dialog dialog, int i10) {
        if (!(dialog instanceof v0)) {
            super.setupDialog(dialog, i10);
            return;
        }
        v0 v0Var = (v0) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        v0Var.supportRequestWindowFeature(1);
    }

    public w0(int i10) {
        super(i10);
    }
}
