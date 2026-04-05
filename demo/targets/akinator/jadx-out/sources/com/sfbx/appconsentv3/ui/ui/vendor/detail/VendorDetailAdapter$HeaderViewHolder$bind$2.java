package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailAdapter;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailAdapter$HeaderViewHolder$bind$2 extends f0 implements l {
    final /* synthetic */ String $expiration;
    final /* synthetic */ VendorDetailAdapter.HeaderViewHolder this$0;
    final /* synthetic */ VendorDetailAdapter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorDetailAdapter$HeaderViewHolder$bind$2(VendorDetailAdapter.HeaderViewHolder headerViewHolder, String str, VendorDetailAdapter vendorDetailAdapter) {
        super(1);
        this.this$0 = headerViewHolder;
        this.$expiration = str;
        this.this$1 = vendorDetailAdapter;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return x0.f87415a;
    }

    public final void invoke(String it) {
        e0.checkNotNullParameter(it, "it");
        this.this$0.binding.textExpiration.setText(this.$expiration);
        this.this$0.binding.textExpiration.setTextColor(this.this$1.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        this.this$0.binding.textExpiration.setVisibility(0);
    }
}
