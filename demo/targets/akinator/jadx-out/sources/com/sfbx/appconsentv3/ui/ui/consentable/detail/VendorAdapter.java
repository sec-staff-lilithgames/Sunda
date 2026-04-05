package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.j0;
import com.google.android.exoplayer2.ui.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailVendorBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableEmptyDetailVendorBinding;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorAdapter extends f1 {
    private final o appConsentTheme$delegate;
    private final ConsentableType consentableType;
    private final boolean showAll;
    private final VendorListener vendorListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class EmptyVendorViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableEmptyDetailVendorBinding binding;
        final /* synthetic */ VendorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyVendorViewHolder(VendorAdapter vendorAdapter, AppconsentV3ItemConsentableEmptyDetailVendorBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(VendorListener vendorListener, Vendor vendor, View view) {
            e0.checkNotNullParameter(vendorListener, "$vendorListener");
            e0.checkNotNullParameter(vendor, "$vendor");
            vendorListener.onClickSeeAll(vendor.isLegVendor());
        }

        public final void bind(Vendor vendor, VendorListener vendorListener) {
            e0.checkNotNullParameter(vendor, "vendor");
            e0.checkNotNullParameter(vendorListener, "vendorListener");
            AppCompatTextView bind$lambda$1 = this.binding.appconsentClearItemConsentableEmptyTextDisplayAll;
            VendorAdapter vendorAdapter = this.this$0;
            bind$lambda$1.setText(new StringBuilder(vendorAdapter.getAppConsentTheme().getButtonDisplayAllPartners$appconsent_ui_v3_prodXchangeRelease() + ' ' + vendorAdapter.getAppConsentTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_details_see_all_number, Integer.valueOf(vendorAdapter.getCurrentList().size()))).toString());
            e0.checkNotNullExpressionValue(bind$lambda$1, "bind$lambda$1");
            ViewExtsKt.underline(bind$lambda$1, vendorAdapter.getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$1.setOnClickListener(new f(1, vendorListener, vendor));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VendorDiffCallback extends j0 {
        @Override // androidx.recyclerview.widget.j0
        public boolean areContentsTheSame(Vendor oldItem, Vendor newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return e0.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.j0
        public boolean areItemsTheSame(Vendor oldItem, Vendor newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VendorListener {
        void onClickPolicy(String str, String str2, String str3);

        void onClickSeeAll(boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableDetailVendorBinding binding;
        final /* synthetic */ VendorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorViewHolder(VendorAdapter vendorAdapter, AppconsentV3ItemConsentableDetailVendorBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = vendorAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(VendorListener vendorListener, String privacyPolicy, Vendor vendor, VendorAdapter this$0, View view) {
            e0.checkNotNullParameter(vendorListener, "$vendorListener");
            e0.checkNotNullParameter(privacyPolicy, "$privacyPolicy");
            e0.checkNotNullParameter(vendor, "$vendor");
            e0.checkNotNullParameter(this$0, "this$0");
            vendorListener.onClickPolicy(privacyPolicy, vendor.getName(), this$0.getAppConsentTheme().getConsentablePolicy$appconsent_ui_v3_prodXchangeRelease());
        }

        public final void bind(Vendor vendor, VendorListener vendorListener) {
            e0.checkNotNullParameter(vendor, "vendor");
            e0.checkNotNullParameter(vendorListener, "vendorListener");
            this.binding.textVendorName.setVisibility(0);
            this.binding.textVendorName.setText(vendor.getName());
            this.binding.textVendorName.setTextColor(this.this$0.getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            AppCompatTextView bind$lambda$1 = this.binding.textPolicy;
            VendorAdapter vendorAdapter = this.this$0;
            String privacyPolicy = vendor.getPrivacyPolicy(vendorAdapter.getAppConsentTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$1.setText(vendorAdapter.getAppConsentTheme().getConsentablePolicy$appconsent_ui_v3_prodXchangeRelease());
            e0.checkNotNullExpressionValue(bind$lambda$1, "bind$lambda$1");
            ViewExtsKt.underline(bind$lambda$1, vendorAdapter.getAppConsentTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$1.setOnClickListener(new x(1, vendorListener, privacyPolicy, vendor, vendorAdapter));
            bind$lambda$1.setVisibility((privacyPolicy.length() <= 0 || !URLUtil.isValidUrl(privacyPolicy)) ? 8 : 0);
            this.binding.iabLogo.setVisibility(vendor.isExtraVendor() ? 4 : 0);
            this.binding.separator.setBackgroundColor(this.this$0.getAppConsentTheme().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentableType.values().length];
            try {
                iArr[ConsentableType.FEATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ VendorAdapter(VendorListener vendorListener, ConsentableType consentableType, boolean z10, int i10, u uVar) {
        this(vendorListener, (i10 & 2) != 0 ? ConsentableType.UNKNOWN : consentableType, (i10 & 4) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppConsentTheme() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    @Override // androidx.recyclerview.widget.f1, androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.consentableType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 0;
        }
        if (this.showAll || getCurrentList().size() <= 3) {
            return getCurrentList().size();
        }
        return 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        return (this.showAll || i10 < 3) ? R.layout.appconsent_v3_item_consentable_detail_vendor : R.layout.appconsent_v3_item_consentable_empty_detail_vendor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.n holder, int i10) {
        e0.checkNotNullParameter(holder, "holder");
        Vendor vendor = (Vendor) getItem(i10);
        if (holder instanceof VendorViewHolder) {
            e0.checkNotNullExpressionValue(vendor, "vendor");
            ((VendorViewHolder) holder).bind(vendor, this.vendorListener);
        } else if (holder instanceof EmptyVendorViewHolder) {
            e0.checkNotNullExpressionValue(vendor, "vendor");
            ((EmptyVendorViewHolder) holder).bind(vendor, this.vendorListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.n onCreateViewHolder(ViewGroup parent, int i10) {
        e0.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == R.layout.appconsent_v3_item_consentable_detail_vendor) {
            AppconsentV3ItemConsentableDetailVendorBinding appconsentV3ItemConsentableDetailVendorBindingInflate = AppconsentV3ItemConsentableDetailVendorBinding.inflate(layoutInflaterFrom, parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailVendorBindingInflate, "inflate(inflater, parent, false)");
            return new VendorViewHolder(this, appconsentV3ItemConsentableDetailVendorBindingInflate);
        }
        if (i10 == R.layout.appconsent_v3_item_consentable_empty_detail_vendor) {
            AppconsentV3ItemConsentableEmptyDetailVendorBinding appconsentV3ItemConsentableEmptyDetailVendorBindingInflate = AppconsentV3ItemConsentableEmptyDetailVendorBinding.inflate(layoutInflaterFrom, parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemConsentableEmptyDetailVendorBindingInflate, "inflate(\n               …lse\n                    )");
            return new EmptyVendorViewHolder(this, appconsentV3ItemConsentableEmptyDetailVendorBindingInflate);
        }
        AppconsentV3ItemConsentableDetailVendorBinding appconsentV3ItemConsentableDetailVendorBindingInflate2 = AppconsentV3ItemConsentableDetailVendorBinding.inflate(layoutInflaterFrom, parent, false);
        e0.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailVendorBindingInflate2, "inflate(inflater, parent, false)");
        return new VendorViewHolder(this, appconsentV3ItemConsentableDetailVendorBindingInflate2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorAdapter(VendorListener vendorListener, ConsentableType consentableType, boolean z10) {
        super(new VendorDiffCallback());
        e0.checkNotNullParameter(vendorListener, "vendorListener");
        e0.checkNotNullParameter(consentableType, "consentableType");
        this.vendorListener = vendorListener;
        this.consentableType = consentableType;
        this.showAll = z10;
        this.appConsentTheme$delegate = q.lazy(VendorAdapter$appConsentTheme$2.INSTANCE);
    }
}
