package com.sfbx.appconsentv3.ui.ui.vendor.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.j0;
import com.google.android.material.chip.Chip;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailCategoriesHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailConsentableBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailConsentableHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailConsentableLitHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailConsentableMandatoryHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemVendorDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import java.util.List;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailAdapter {
    private final o theme$delegate = q.lazy(VendorDetailAdapter$theme$2.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CategoriesHeaderAdapter extends RecyclerView.a {
        private final List<String> categories;
        final /* synthetic */ VendorDetailAdapter this$0;

        public CategoriesHeaderAdapter(VendorDetailAdapter vendorDetailAdapter, List<String> categories) {
            e0.checkNotNullParameter(categories, "categories");
            this.this$0 = vendorDetailAdapter;
            this.categories = categories;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.categories.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_categories_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(CategoriesHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.categories);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public CategoriesHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailCategoriesHeaderBinding appconsentV3ItemVendorDetailCategoriesHeaderBindingInflate = AppconsentV3ItemVendorDetailCategoriesHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailCategoriesHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new CategoriesHeaderViewHolder(this.this$0, appconsentV3ItemVendorDetailCategoriesHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CategoriesHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailCategoriesHeaderBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoriesHeaderViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailCategoriesHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        public final void bind(List<String> categories) {
            e0.checkNotNullParameter(categories, "categories");
            this.binding.appconsentclearVendorDetailCategoriesTitle.setText(this.this$0.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_vendor_categories_title));
            this.binding.appconsentclearVendorDetailCategoriesTitle.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.appconsentclearVendorDetailCategoriesGroup.removeAllViews();
            b1 b1Var = new b1();
            VendorDetailAdapter vendorDetailAdapter = this.this$0;
            for (String str : categories) {
                Chip chip = new Chip(this.binding.appconsentclearVendorDetailCategoriesGroup.getContext(), null, R.attr.CustomChipChoiceStyle);
                chip.setText(str);
                chip.setTextColor(vendorDetailAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
                b1Var.f71816b = chip;
                this.binding.appconsentclearVendorDetailCategoriesGroup.addView(chip);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableAdapter extends f1 {
        public ConsentableAdapter() {
            super(new ConsentableDiffCallback());
        }

        @Override // androidx.recyclerview.widget.f1, androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return getCurrentList().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_consentable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(ConsentableViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            ConsentableAdapterItem consentable = (ConsentableAdapterItem) getItem(i10);
            e0.checkNotNullExpressionValue(consentable, "consentable");
            holder.bind(consentable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public ConsentableViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailConsentableBinding appconsentV3ItemVendorDetailConsentableBindingInflate = AppconsentV3ItemVendorDetailConsentableBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailConsentableBindingInflate, "inflate(inflater, parent, false)");
            return new ConsentableViewHolder(VendorDetailAdapter.this, appconsentV3ItemVendorDetailConsentableBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentableAdapterItem {
        private final Consentable consentable;
        private final Vendor vendor;

        public ConsentableAdapterItem(Consentable consentable, Vendor vendor) {
            e0.checkNotNullParameter(consentable, "consentable");
            e0.checkNotNullParameter(vendor, "vendor");
            this.consentable = consentable;
            this.vendor = vendor;
        }

        public static /* synthetic */ ConsentableAdapterItem copy$default(ConsentableAdapterItem consentableAdapterItem, Consentable consentable, Vendor vendor, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                consentable = consentableAdapterItem.consentable;
            }
            if ((i10 & 2) != 0) {
                vendor = consentableAdapterItem.vendor;
            }
            return consentableAdapterItem.copy(consentable, vendor);
        }

        public final Consentable component1() {
            return this.consentable;
        }

        public final Vendor component2() {
            return this.vendor;
        }

        public final ConsentableAdapterItem copy(Consentable consentable, Vendor vendor) {
            e0.checkNotNullParameter(consentable, "consentable");
            e0.checkNotNullParameter(vendor, "vendor");
            return new ConsentableAdapterItem(consentable, vendor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConsentableAdapterItem)) {
                return false;
            }
            ConsentableAdapterItem consentableAdapterItem = (ConsentableAdapterItem) obj;
            return e0.areEqual(this.consentable, consentableAdapterItem.consentable) && e0.areEqual(this.vendor, consentableAdapterItem.vendor);
        }

        public final Consentable getConsentable() {
            return this.consentable;
        }

        public final Vendor getVendor() {
            return this.vendor;
        }

        public int hashCode() {
            return this.vendor.hashCode() + (this.consentable.hashCode() * 31);
        }

        public String toString() {
            return "ConsentableAdapterItem(consentable=" + this.consentable + ", vendor=" + this.vendor + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentableDiffCallback extends j0 {
        @Override // androidx.recyclerview.widget.j0
        public boolean areContentsTheSame(ConsentableAdapterItem oldItem, ConsentableAdapterItem newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return e0.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.j0
        public boolean areItemsTheSame(ConsentableAdapterItem oldItem, ConsentableAdapterItem newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return oldItem.getConsentable().getId() == newItem.getConsentable().getId() && oldItem.getConsentable().getType() == newItem.getConsentable().getType();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableHeaderAdapter extends RecyclerView.a {
        private final List<Consentable> consentables;
        private final SwitchViewListener listener;
        private ConsentStatus status;
        final /* synthetic */ VendorDetailAdapter this$0;

        public ConsentableHeaderAdapter(VendorDetailAdapter vendorDetailAdapter, List<Consentable> consentables, SwitchViewListener listener) {
            e0.checkNotNullParameter(consentables, "consentables");
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = vendorDetailAdapter;
            this.consentables = consentables;
            this.listener = listener;
            this.status = ConsentStatus.UNDEFINED;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.consentables.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_consentable_header;
        }

        public final void submitStatus(ConsentStatus newStatus) {
            e0.checkNotNullParameter(newStatus, "newStatus");
            this.status = newStatus;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(ConsentableHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.status, this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public ConsentableHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailConsentableHeaderBinding appconsentV3ItemVendorDetailConsentableHeaderBindingInflate = AppconsentV3ItemVendorDetailConsentableHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailConsentableHeaderBindingInflate, "inflate(\n               …      false\n            )");
            return new ConsentableHeaderViewHolder(this.this$0, appconsentV3ItemVendorDetailConsentableHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailConsentableHeaderBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableHeaderViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailConsentableHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        public final void bind(ConsentStatus status, SwitchViewListener listener) {
            e0.checkNotNullParameter(status, "status");
            e0.checkNotNullParameter(listener, "listener");
            this.binding.switchConsentableHeader.setStatus(status, false);
            this.binding.switchConsentableHeader.setSwitchListener(listener);
            this.binding.textVendorHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textVendorHeader.setText(this.this$0.getTheme().getVendorUnderConsent$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableLITHeaderAdapter extends RecyclerView.a {
        private final List<Consentable> legConsentables;
        private final RejectButtonView.RejectButtonListener listener;
        private ConsentStatus status;
        final /* synthetic */ VendorDetailAdapter this$0;
        private final VendorListener vendorListener;

        public ConsentableLITHeaderAdapter(VendorDetailAdapter vendorDetailAdapter, List<Consentable> legConsentables, RejectButtonView.RejectButtonListener listener, VendorListener vendorListener) {
            e0.checkNotNullParameter(legConsentables, "legConsentables");
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = vendorDetailAdapter;
            this.legConsentables = legConsentables;
            this.listener = listener;
            this.vendorListener = vendorListener;
            this.status = ConsentStatus.PENDING;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.legConsentables.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_consentable_lit_header;
        }

        public final void submitStatus(ConsentStatus newStatus) {
            e0.checkNotNullParameter(newStatus, "newStatus");
            this.status = newStatus;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(ConsentableLITHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.status, this.listener, this.vendorListener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public ConsentableLITHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailConsentableLitHeaderBinding appconsentV3ItemVendorDetailConsentableLitHeaderBindingInflate = AppconsentV3ItemVendorDetailConsentableLitHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailConsentableLitHeaderBindingInflate, "inflate(\n               …  false\n                )");
            return new ConsentableLITHeaderViewHolder(this.this$0, appconsentV3ItemVendorDetailConsentableLitHeaderBindingInflate);
        }

        public /* synthetic */ ConsentableLITHeaderAdapter(VendorDetailAdapter vendorDetailAdapter, List list, RejectButtonView.RejectButtonListener rejectButtonListener, VendorListener vendorListener, int i10, u uVar) {
            this(vendorDetailAdapter, list, rejectButtonListener, (i10 & 4) != 0 ? null : vendorListener);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableLITHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailConsentableLitHeaderBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableLITHeaderViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailConsentableLitHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(VendorDetailAdapter this$0, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            String string = this$0.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_details_dialog_message);
            e0.checkNotNullExpressionValue(string, "theme.contextLocalized.g…e_details_dialog_message)");
            AlertDialogUtil alertDialogUtil = AlertDialogUtil.INSTANCE;
            Context context = view.getContext();
            e0.checkNotNullExpressionValue(context, "it.context");
            m mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease = alertDialogUtil.buildAlertDialog$appconsent_ui_v3_prodXchangeRelease(context, this$0.getTheme(), string);
            if (mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease != null) {
                mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(VendorListener vendorListener, VendorDetailAdapter this$0, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            if (vendorListener != null) {
                String string = this$0.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_vendor_legitimate_interest);
                e0.checkNotNullExpressionValue(string, "theme.contextLocalized.g…ndor_legitimate_interest)");
                vendorListener.onClickLegitimateInterest(string);
            }
        }

        public final void bind(ConsentStatus status, RejectButtonView.RejectButtonListener listener, VendorListener vendorListener) {
            e0.checkNotNullParameter(status, "status");
            e0.checkNotNullParameter(listener, "listener");
            this.binding.textVendorLitHeader.setOnClickListener(new com.applovin.mediation.nativeAds.a(this.this$0, 12));
            this.binding.textVendorLitHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textVendorLitHeader.setText(this.this$0.getTheme().getVendorUnderLegInt$appconsent_ui_v3_prodXchangeRelease());
            AppCompatTextView bind$lambda$2 = this.binding.vendorLitHeaderUrl;
            VendorDetailAdapter vendorDetailAdapter = this.this$0;
            bind$lambda$2.setText(vendorDetailAdapter.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_vendor_legitimate_interest));
            bind$lambda$2.setVisibility(0);
            e0.checkNotNullExpressionValue(bind$lambda$2, "bind$lambda$2");
            ViewExtsKt.underline(bind$lambda$2, vendorDetailAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$2.setOnClickListener(new a(vendorListener, vendorDetailAdapter, 0));
            this.binding.rejectButton.reject(status == ConsentStatus.DISALLOWED);
            this.binding.rejectButton.setRejectButtonListener(listener);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableMandatoryHeaderAdapter extends RecyclerView.a {
        private final List<Consentable> mandatoryConsentables;
        final /* synthetic */ VendorDetailAdapter this$0;

        public ConsentableMandatoryHeaderAdapter(VendorDetailAdapter vendorDetailAdapter, List<Consentable> mandatoryConsentables) {
            e0.checkNotNullParameter(mandatoryConsentables, "mandatoryConsentables");
            this.this$0 = vendorDetailAdapter;
            this.mandatoryConsentables = mandatoryConsentables;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.mandatoryConsentables.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_consentable_mandatory_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(ConsentableMandatoryHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public ConsentableMandatoryHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailConsentableMandatoryHeaderBinding appconsentV3ItemVendorDetailConsentableMandatoryHeaderBindingInflate = AppconsentV3ItemVendorDetailConsentableMandatoryHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailConsentableMandatoryHeaderBindingInflate, "inflate(\n               …  false\n                )");
            return new ConsentableMandatoryHeaderViewHolder(this.this$0, appconsentV3ItemVendorDetailConsentableMandatoryHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableMandatoryHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailConsentableMandatoryHeaderBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableMandatoryHeaderViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailConsentableMandatoryHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        public final void bind() {
            this.binding.textVendorHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textVendorHeader.setText(this.this$0.getTheme().getVendorCompulsory$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailConsentableBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.PURPOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConsentableType.EXTRA_PURPOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ConsentableType.FEATURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ConsentableType.SPECIAL_FEATURE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ConsentableType.STACK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailConsentableBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        public final void bind(ConsentableAdapterItem consentableItem) {
            String vendorPurpose$appconsent_ui_v3_prodXchangeRelease;
            int stdRetention;
            e0.checkNotNullParameter(consentableItem, "consentableItem");
            Consentable consentable = consentableItem.getConsentable();
            Vendor vendor = consentableItem.getVendor();
            AppCompatImageView appCompatImageView = this.binding.consentableLogo;
            Context context = this.itemView.getContext();
            e0.checkNotNullExpressionValue(context, "itemView.context");
            appCompatImageView.setImageDrawable(ExtensionKt.getConsentableLogo(consentable, context));
            Context contextLocalized$appconsent_ui_v3_prodXchangeRelease = this.this$0.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease();
            ConsentableType type = consentable.getType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    vendorPurpose$appconsent_ui_v3_prodXchangeRelease = this.this$0.getTheme().getVendorPurpose$appconsent_ui_v3_prodXchangeRelease();
                    break;
                case 4:
                case 5:
                    vendorPurpose$appconsent_ui_v3_prodXchangeRelease = this.this$0.getTheme().getVendorFeature$appconsent_ui_v3_prodXchangeRelease();
                    break;
                case 6:
                    vendorPurpose$appconsent_ui_v3_prodXchangeRelease = contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_details_type_stack);
                    e0.checkNotNullExpressionValue(vendorPurpose$appconsent_ui_v3_prodXchangeRelease, "contextLocalized.getStri…e_stack\n                )");
                    break;
                default:
                    vendorPurpose$appconsent_ui_v3_prodXchangeRelease = contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_details_type_unknown);
                    e0.checkNotNullExpressionValue(vendorPurpose$appconsent_ui_v3_prodXchangeRelease, "contextLocalized.getStri…unknown\n                )");
                    break;
            }
            if (consentable.getType() == ConsentableType.PURPOSE && vendor.getDataRetention().getPurposes().containsKey(String.valueOf(consentable.getId()))) {
                Integer num = vendor.getDataRetention().getPurposes().get(String.valueOf(consentable.getId()));
                e0.checkNotNull(num);
                stdRetention = num.intValue();
            } else if (consentable.getType() == ConsentableType.SPECIAL_PURPOSE && vendor.getDataRetention().getSpecialPurposes().containsKey(String.valueOf(consentable.getIabId()))) {
                Integer num2 = vendor.getDataRetention().getSpecialPurposes().get(String.valueOf(consentable.getIabId()));
                e0.checkNotNull(num2);
                stdRetention = num2.intValue();
            } else {
                stdRetention = vendor.getDataRetention().getStdRetention();
            }
            String string = stdRetention <= 0 ? contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_consentable_type_and_retention, vendorPurpose$appconsent_ui_v3_prodXchangeRelease, contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_details_type_retention_delay_less_than_one_day)) : contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_consentable_type_and_retention, vendorPurpose$appconsent_ui_v3_prodXchangeRelease, contextLocalized$appconsent_ui_v3_prodXchangeRelease.getString(R.string.appconsent_vendor_details_type_retention_delay_more_than_one_day, Integer.valueOf(stdRetention)));
            e0.checkNotNullExpressionValue(string, "if (delayRetention <= 0)…          )\n            }");
            int i10 = iArr[consentable.getType().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.binding.textConsentableType.setText(string);
            } else {
                this.binding.textConsentableType.setText(vendorPurpose$appconsent_ui_v3_prodXchangeRelease);
            }
            this.binding.textConsentableName.setText(consentable.getNameAsString(this.this$0.getTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease()));
            this.binding.textConsentableName.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            if (this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease() != m3.a.getColor(this.itemView.getContext(), R.color.appconsent_v3_dark_blue)) {
                this.binding.textConsentableType.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            }
            this.binding.vendorConsentableSeparator.setBackgroundColor(this.this$0.getTheme().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HeaderAdapter extends RecyclerView.a {
        private String expiration;
        private String policyUrl;
        private final VendorListener vendorListener;

        public HeaderAdapter(VendorListener vendorListener) {
            this.vendorListener = vendorListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_vendor_detail_header;
        }

        public final void setExpiration(String expiration) {
            e0.checkNotNullParameter(expiration, "expiration");
            this.expiration = expiration;
        }

        public final void setPolicyUrl(String policyUrl) {
            e0.checkNotNullParameter(policyUrl, "policyUrl");
            this.policyUrl = policyUrl;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(HeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.vendorListener, this.expiration, this.policyUrl);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public HeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemVendorDetailHeaderBinding appconsentV3ItemVendorDetailHeaderBindingInflate = AppconsentV3ItemVendorDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemVendorDetailHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new HeaderViewHolder(VendorDetailAdapter.this, appconsentV3ItemVendorDetailHeaderBindingInflate);
        }

        public /* synthetic */ HeaderAdapter(VendorDetailAdapter vendorDetailAdapter, VendorListener vendorListener, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : vendorListener);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemVendorDetailHeaderBinding binding;
        final /* synthetic */ VendorDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(VendorDetailAdapter vendorDetailAdapter, AppconsentV3ItemVendorDetailHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorDetailAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(VendorListener vendorListener, VendorDetailAdapter this$0, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            if (vendorListener != null) {
                vendorListener.onClickPolicy(this$0.getTheme().getVendorPolicy$appconsent_ui_v3_prodXchangeRelease());
            }
        }

        public final void bind(VendorListener vendorListener, String str, String str2) {
            AppCompatTextView bind$lambda$1 = this.binding.textVendorDetailHeader;
            VendorDetailAdapter vendorDetailAdapter = this.this$0;
            bind$lambda$1.setText(vendorDetailAdapter.getTheme().getVendorPolicy$appconsent_ui_v3_prodXchangeRelease());
            e0.checkNotNullExpressionValue(bind$lambda$1, "bind$lambda$1");
            ViewExtsKt.underline(bind$lambda$1, vendorDetailAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$1.setOnClickListener(new a(vendorListener, vendorDetailAdapter, 1));
            bind$lambda$1.setVisibility((str2 == null || n0.isBlank(str2)) ? 8 : 0);
            ExtensionKt.notNullOrEmpty(str, new VendorDetailAdapter$HeaderViewHolder$bind$2(this, str, this.this$0));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VendorListener {
        void onClickLegitimateInterest(String str);

        void onClickPolicy(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }
}
