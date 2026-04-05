package com.sfbx.appconsentv3.ui.ui.geolocation;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.oa;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailVendorLitHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationDetailVendorHeaderBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.o;
import tu.q;
import uu.y0;
import v3.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationDetailAdapter {
    private final Consentable consentable;
    private final Map<String, String> description;
    private final Map<String, String> descriptionLegal;
    private final ConsentStatus legIntStatus;
    private final List<Vendor> legVendors;
    private final SwitchViewListener listener;
    private final boolean mIsLegitimateInterestMustBeDisplayed;
    private final ConsentStatus status;
    private final o theme$delegate;
    private final ConsentableType type;
    private final List<Vendor> vendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderAdapter extends RecyclerView.a {
        public DescriptionHeaderAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_consentable_detail_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(DescriptionHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public DescriptionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemConsentableDetailHeaderBinding appconsentV3ItemConsentableDetailHeaderBindingInflate = AppconsentV3ItemConsentableDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new DescriptionHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemConsentableDetailHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableDetailHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemConsentableDetailHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(DescriptionHeaderViewHolder this$0, AppCompatTextView this_apply, GeolocationDetailAdapter this$1, View view) {
            int i10;
            e0.checkNotNullParameter(this$0, "this$0");
            e0.checkNotNullParameter(this_apply, "$this_apply");
            e0.checkNotNullParameter(this$1, "this$1");
            AppCompatTextView appCompatTextView = this$0.binding.textConsentableDetailAdditionnalText;
            if (appCompatTextView.getVisibility() == 0) {
                this_apply.setText(this$1.getTheme().getButtonSeeMoreLegalText$appconsent_ui_v3_prodXchangeRelease());
                i10 = 8;
            } else {
                this_apply.setText(this$1.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_see_less_button));
                i10 = 0;
            }
            appCompatTextView.setVisibility(i10);
        }

        public final void bind() {
            String language = Locale.getDefault().getLanguage();
            AppCompatTextView appCompatTextView = this.binding.textConsentableDetailHeader;
            GeolocationDetailAdapter geolocationDetailAdapter = this.this$0;
            String str = (String) geolocationDetailAdapter.description.get(language);
            if (str == null && (str = (String) y0.firstOrNull(geolocationDetailAdapter.description.values())) == null) {
                str = "";
            }
            appCompatTextView.setText(d.fromHtml(str, 63));
            appCompatTextView.setTextColor(geolocationDetailAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appCompatTextView.setLinkTextColor(geolocationDetailAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
            String str2 = (String) this.this$0.descriptionLegal.get(language);
            if (str2 == null) {
                str2 = (String) y0.firstOrNull(this.this$0.descriptionLegal.values());
            }
            this.binding.textConsentableDetailAdditionnalText.setText(d.fromHtml(str2 != null ? str2 : "", 63));
            this.binding.textConsentableDetailAdditionnalText.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textConsentableDetailAdditionnalText.setLinkTextColor(this.this$0.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textConsentableDetailAdditionnalText.setMovementMethod(LinkMovementMethod.getInstance());
            AppCompatTextView bind$lambda$2 = this.binding.textConsentableDetailSeeMore;
            GeolocationDetailAdapter geolocationDetailAdapter2 = this.this$0;
            bind$lambda$2.setText(geolocationDetailAdapter2.getTheme().getButtonSeeMoreLegalText$appconsent_ui_v3_prodXchangeRelease());
            e0.checkNotNullExpressionValue(bind$lambda$2, "bind$lambda$2");
            ViewExtsKt.underline(bind$lambda$2, geolocationDetailAdapter2.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            int i10 = 8;
            bind$lambda$2.setVisibility((str2 == null || !(n0.isBlank(str2) ^ true)) ? 8 : 0);
            ImageView imageView = this.binding.imageConsentableDetailApplicationExample;
            if (str2 != null && (!n0.isBlank(str2))) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            bind$lambda$2.setOnClickListener(new oa(this, bind$lambda$2, geolocationDetailAdapter2, 2));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class TitleHeaderAdapter extends RecyclerView.a {
        public TitleHeaderAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_geolocation_detail_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(TitleHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(GeolocationDetailAdapter.this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public TitleHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationDetailHeaderBinding appconsentV3ItemGeolocationDetailHeaderBindingInflate = AppconsentV3ItemGeolocationDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemGeolocationDetailHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new TitleHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemGeolocationDetailHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class TitleHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemGeolocationDetailHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemGeolocationDetailHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = binding;
        }

        public final void bind(SwitchViewListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            String nameAsString = this.this$0.consentable.getNameAsString(this.this$0.getTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease());
            this.binding.consentableSwitch.setStatus(this.this$0.status, false);
            this.binding.consentableSwitch.setSwitchListener(listener);
            this.binding.consentableName.setText(nameAsString);
            this.binding.consentableName.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            AppCompatImageView appCompatImageView = this.binding.consentableLogo;
            Consentable consentable = this.this$0.consentable;
            Context context = this.itemView.getContext();
            e0.checkNotNullExpressionValue(context, "itemView.context");
            appCompatImageView.setImageDrawable(ExtensionKt.getConsentableLogo(consentable, context));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorHeaderAdapter extends RecyclerView.a {
        public VendorHeaderAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !GeolocationDetailAdapter.this.vendors.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_geolocation_detail_vendor_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(VendorHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public VendorHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationDetailVendorHeaderBinding appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate = AppconsentV3ItemGeolocationDetailVendorHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate, "inflate(\n               …      false\n            )");
            return new VendorHeaderViewHolder(GeolocationDetailAdapter.this, appconsentV3ItemGeolocationDetailVendorHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemGeolocationDetailVendorHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemGeolocationDetailVendorHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = binding;
        }

        public final void bind() {
            this.binding.textVendorHeader.setText(this.this$0.getTheme().getNoticeConsentableDetailLabel1$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textVendorHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorLITHeaderAdapter extends RecyclerView.a {
        private final RejectButtonView.RejectButtonListener listener;
        private ConsentStatus litStatus;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConsentableType.values().length];
                try {
                    iArr[ConsentableType.SPECIAL_PURPOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConsentableType.FEATURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public VendorLITHeaderAdapter(GeolocationDetailAdapter geolocationDetailAdapter, RejectButtonView.RejectButtonListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = geolocationDetailAdapter;
            this.listener = listener;
            this.litStatus = geolocationDetailAdapter.legIntStatus;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.this$0.type.ordinal()];
            return (i10 == 1 || i10 == 2 || this.this$0.legVendors.isEmpty() || true != this.this$0.mIsLegitimateInterestMustBeDisplayed) ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_consentable_detail_vendor_lit_header;
        }

        public final void submitStatus(ConsentStatus newStatus) {
            e0.checkNotNullParameter(newStatus, "newStatus");
            this.litStatus = newStatus;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(VendorLITHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener, this.litStatus);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public VendorLITHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemConsentableDetailVendorLitHeaderBinding appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate = AppconsentV3ItemConsentableDetailVendorLitHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate, "inflate(\n               …  false\n                )");
            return new VendorLITHeaderViewHolder(this.this$0, appconsentV3ItemConsentableDetailVendorLitHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorLITHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableDetailVendorLitHeaderBinding binding;
        final /* synthetic */ GeolocationDetailAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorLITHeaderViewHolder(GeolocationDetailAdapter geolocationDetailAdapter, AppconsentV3ItemConsentableDetailVendorLitHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationDetailAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(GeolocationDetailAdapter this$0, View view) {
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

        public final void bind(RejectButtonView.RejectButtonListener listener, ConsentStatus litStatus) {
            e0.checkNotNullParameter(listener, "listener");
            e0.checkNotNullParameter(litStatus, "litStatus");
            this.binding.textVendorLitHeader.setOnClickListener(new com.applovin.mediation.nativeAds.a(this.this$0, 9));
            this.binding.textVendorLitHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.rejectButton.reject(litStatus == ConsentStatus.DISALLOWED);
            this.binding.rejectButton.setRejectButtonListener(listener);
        }
    }

    public GeolocationDetailAdapter(Consentable consentable, SwitchViewListener listener, boolean z10) {
        e0.checkNotNullParameter(consentable, "consentable");
        e0.checkNotNullParameter(listener, "listener");
        this.consentable = consentable;
        this.listener = listener;
        this.mIsLegitimateInterestMustBeDisplayed = z10;
        this.descriptionLegal = consentable.getDescriptionLegal();
        this.description = consentable.getDescription();
        List<Vendor> vendors = consentable.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (!((Vendor) obj).isLegVendor()) {
                arrayList.add(obj);
            }
        }
        this.vendors = arrayList;
        List<Vendor> vendors2 = this.consentable.getVendors();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : vendors2) {
            if (((Vendor) obj2).isLegVendor()) {
                arrayList2.add(obj2);
            }
        }
        this.legVendors = arrayList2;
        this.theme$delegate = q.lazy(GeolocationDetailAdapter$theme$2.INSTANCE);
        this.type = this.consentable.getType();
        this.status = this.consentable.getStatus();
        this.legIntStatus = this.consentable.getLegIntStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }
}
