package com.sfbx.appconsentv3.ui.ui.vendor.refine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.j0;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardVendorBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.listener.VendorListener;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorAdapter extends f1 {
    private View.OnClickListener learnMoreListener;
    private final o theme$delegate;
    private VendorListener vendorListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VendorDiffCallback extends j0 {
        @Override // androidx.recyclerview.widget.j0
        public boolean areContentsTheSame(Vendor vendor1, Vendor vendor2) {
            e0.checkNotNullParameter(vendor1, "vendor1");
            e0.checkNotNullParameter(vendor2, "vendor2");
            return e0.areEqual(vendor1.getName(), vendor2.getName()) && vendor1.isExtraVendor() == vendor2.isExtraVendor() && vendor1.isLegVendor() == vendor2.isLegVendor() && vendor1.getStatus() == vendor2.getStatus();
        }

        @Override // androidx.recyclerview.widget.j0
        public boolean areItemsTheSame(Vendor vendor1, Vendor vendor2) {
            e0.checkNotNullParameter(vendor1, "vendor1");
            e0.checkNotNullParameter(vendor2, "vendor2");
            return vendor1.getId() == vendor2.getId();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorViewHolder extends RecyclerView.n {
        private final AppconsentV3CardVendorBinding binding;
        final /* synthetic */ VendorAdapter this$0;
        private int vendorId;
        private VendorListener vendorListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorViewHolder(VendorAdapter vendorAdapter, AppconsentV3CardVendorBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorAdapter;
            this.binding = binding;
            binding.vendorSwitch.setSwitchListener(new SwitchViewListener() { // from class: com.sfbx.appconsentv3.ui.ui.vendor.refine.VendorAdapter.VendorViewHolder.1
                @Override // com.sfbx.appconsentv3.ui.listener.SwitchViewListener
                public void onSwitchChanged(ConsentStatus newStatus) {
                    e0.checkNotNullParameter(newStatus, "newStatus");
                    VendorListener vendorListener = VendorViewHolder.this.vendorListener;
                    if (vendorListener != null) {
                        vendorListener.vendorStatusChanged(VendorViewHolder.this.getBindingAdapterPosition(), VendorViewHolder.this.vendorId, newStatus);
                    }
                }
            });
            binding.separator.setBackgroundColor(vendorAdapter.getTheme().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
        }

        public static /* synthetic */ void setStatus$default(VendorViewHolder vendorViewHolder, ConsentStatus consentStatus, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            vendorViewHolder.setStatus(consentStatus, z10);
        }

        public final void setLearnMoreListener(View.OnClickListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.binding.vendorLearnMore.setOnClickListener(listener);
        }

        public final void setStatus(ConsentStatus status, boolean z10) {
            e0.checkNotNullParameter(status, "status");
            this.binding.vendorSwitch.setStatus(status, z10);
        }

        public final void setSwitchVisibility(boolean z10) {
            this.binding.vendorSwitch.setVisibility(z10 ? 0 : 8);
        }

        public final void setVendorId(int i10) {
            this.vendorId = i10;
            AppCompatTextView setVendorId$lambda$0 = this.binding.vendorLearnMore;
            VendorAdapter vendorAdapter = this.this$0;
            setVendorId$lambda$0.setText(vendorAdapter.getTheme().getButtonLearnMoreText$appconsent_ui_v3_prodXchangeRelease());
            setVendorId$lambda$0.setTag(Integer.valueOf(i10));
            e0.checkNotNullExpressionValue(setVendorId$lambda$0, "setVendorId$lambda$0");
            ViewExtsKt.underline(setVendorId$lambda$0, vendorAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        }

        public final void setVendorListener(VendorListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.vendorListener = listener;
        }

        public final void setVendorName(String vendorName) {
            e0.checkNotNullParameter(vendorName, "vendorName");
            this.binding.vendorName.setText(vendorName);
            this.binding.vendorName.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    public VendorAdapter() {
        super(new VendorDiffCallback());
        this.theme$delegate = q.lazy(VendorAdapter$theme$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        return R.layout.appconsent_v3_card_vendor;
    }

    public final void setLearnMoreListener(View.OnClickListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.learnMoreListener = listener;
    }

    public final void setVendorListener(VendorListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.vendorListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(VendorViewHolder holder, int i10) {
        e0.checkNotNullParameter(holder, "holder");
        Vendor vendor = (Vendor) getItem(i10);
        holder.setVendorName(vendor.getName());
        holder.setVendorId(vendor.getId());
        View.OnClickListener onClickListener = this.learnMoreListener;
        VendorListener vendorListener = null;
        if (onClickListener == null) {
            e0.throwUninitializedPropertyAccessException("learnMoreListener");
            onClickListener = null;
        }
        holder.setLearnMoreListener(onClickListener);
        holder.setStatus(vendor.getStatus(), false);
        holder.setSwitchVisibility(vendor.getStatus() != ConsentStatus.UNDEFINED);
        VendorListener vendorListener2 = this.vendorListener;
        if (vendorListener2 == null) {
            e0.throwUninitializedPropertyAccessException("vendorListener");
        } else {
            vendorListener = vendorListener2;
        }
        holder.setVendorListener(vendorListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public VendorViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        e0.checkNotNullParameter(parent, "parent");
        AppconsentV3CardVendorBinding appconsentV3CardVendorBindingInflate = AppconsentV3CardVendorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        e0.checkNotNullExpressionValue(appconsentV3CardVendorBindingInflate, "inflate(inflater, parent, false)");
        return new VendorViewHolder(this, appconsentV3CardVendorBindingInflate);
    }
}
