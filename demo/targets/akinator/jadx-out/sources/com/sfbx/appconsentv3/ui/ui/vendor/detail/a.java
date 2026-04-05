package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import android.view.View;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VendorDetailAdapter.VendorListener f50569c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VendorDetailAdapter f50570e;

    public /* synthetic */ a(VendorDetailAdapter.VendorListener vendorListener, VendorDetailAdapter vendorDetailAdapter, int i10) {
        this.f50568b = i10;
        this.f50569c = vendorListener;
        this.f50570e = vendorDetailAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50568b) {
            case 0:
                VendorDetailAdapter.ConsentableLITHeaderViewHolder.bind$lambda$2$lambda$1(this.f50569c, this.f50570e, view);
                break;
            default:
                VendorDetailAdapter.HeaderViewHolder.bind$lambda$1$lambda$0(this.f50569c, this.f50570e, view);
                break;
        }
    }
}
