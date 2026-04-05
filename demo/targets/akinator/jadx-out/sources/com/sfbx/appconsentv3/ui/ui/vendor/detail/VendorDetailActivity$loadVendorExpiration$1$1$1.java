package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailActivity$loadVendorExpiration$1$1$1 extends f0 implements l {
    final /* synthetic */ VendorDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorDetailActivity$loadVendorExpiration$1$1$1(VendorDetailActivity vendorDetailActivity) {
        super(1);
        this.this$0 = vendorDetailActivity;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Response<String>) obj);
        return x0.f87415a;
    }

    public final void invoke(Response<String> response) {
        if (response instanceof Response.Success) {
            VendorDetailAdapter.HeaderAdapter headerAdapter = this.this$0.headerAdapter;
            VendorDetailAdapter.HeaderAdapter headerAdapter2 = null;
            if (headerAdapter == null) {
                e0.throwUninitializedPropertyAccessException("headerAdapter");
                headerAdapter = null;
            }
            headerAdapter.setExpiration((String) ((Response.Success) response).getData());
            VendorDetailAdapter.HeaderAdapter headerAdapter3 = this.this$0.headerAdapter;
            if (headerAdapter3 == null) {
                e0.throwUninitializedPropertyAccessException("headerAdapter");
                headerAdapter3 = null;
            }
            Vendor vendor = this.this$0.mVendor;
            if (vendor == null) {
                e0.throwUninitializedPropertyAccessException("mVendor");
                vendor = null;
            }
            headerAdapter3.setPolicyUrl(vendor.getPrivacyPolicy(this.this$0.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease().getLanguage$appconsent_ui_v3_prodXchangeRelease()));
            VendorDetailAdapter.HeaderAdapter headerAdapter4 = this.this$0.headerAdapter;
            if (headerAdapter4 == null) {
                e0.throwUninitializedPropertyAccessException("headerAdapter");
            } else {
                headerAdapter2 = headerAdapter4;
            }
            headerAdapter2.notifyDataSetChanged();
        }
    }
}
