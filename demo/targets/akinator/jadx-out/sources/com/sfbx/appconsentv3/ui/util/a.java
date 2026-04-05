package com.sfbx.appconsentv3.ui.util;

import android.view.View;
import androidx.appcompat.app.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f50572c;

    public /* synthetic */ a(m mVar, int i10) {
        this.f50571b = i10;
        this.f50572c = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50571b) {
            case 0:
                AlertDialogUtil.buildAlertDialog$lambda$4$lambda$3$lambda$2(this.f50572c, view);
                break;
            default:
                AlertDialogUtil.buildQrCode$lambda$16$lambda$15$lambda$14(this.f50572c, view);
                break;
        }
    }
}
