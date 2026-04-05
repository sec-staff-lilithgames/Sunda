package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC1657Xc implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1438Om A01;

    public DialogInterfaceOnClickListenerC1657Xc(C1438Om c1438Om, EditText editText) {
        this.A01 = c1438Om;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A01.A03.execute(new C1441Op(this, dialogInterface));
    }
}
