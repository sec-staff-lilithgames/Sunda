package com.sfbx.appconsentv3.ui.ui.notice;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.g;
import com.sfbx.appconsentv3.ui.ui.vendor.list.VendorListFragment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class b implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f50559b;

    public /* synthetic */ b(g gVar, int i10) {
        this.f50558a = i10;
        this.f50559b = gVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50558a) {
            case 0:
                NoticeUserFragment.onCreateDialog$lambda$1((NoticeUserFragment) this.f50559b, dialogInterface);
                break;
            default:
                VendorListFragment.onCreateDialog$lambda$1((VendorListFragment) this.f50559b, dialogInterface);
                break;
        }
    }
}
