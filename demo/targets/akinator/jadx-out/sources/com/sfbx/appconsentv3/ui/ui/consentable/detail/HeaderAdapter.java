package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailVendorHeaderBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemConsentableDetailVendorLitHeaderBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.HeaderAdapter;
import com.sfbx.appconsentv3.ui.util.AlertDialogUtil;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.o;
import tu.q;
import uu.y0;
import v3.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HeaderAdapter {
    private final Map<String, String> description;
    private final Map<String, String> descriptionLegal;
    private final ConsentStatus legIntStatus;
    private final List<Vendor> legVendors;
    private final Boolean mIsLegitimateInteresetMustBeDisplayed;
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
            return new DescriptionHeaderViewHolder(HeaderAdapter.this, appconsentV3ItemConsentableDetailHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableDetailHeaderBinding binding;
        final /* synthetic */ HeaderAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionHeaderViewHolder(HeaderAdapter headerAdapter, AppconsentV3ItemConsentableDetailHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = headerAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(HeaderAdapter this$0, DescriptionHeaderViewHolder this$1, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            e0.checkNotNullParameter(this$1, "this$1");
            this$0.clickOnExamplesOfUsage(this$1.binding);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$4$lambda$3(HeaderAdapter this$0, DescriptionHeaderViewHolder this$1, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            e0.checkNotNullParameter(this$1, "this$1");
            this$0.clickOnExamplesOfUsage(this$1.binding);
        }

        public final void bind() {
            AppCompatTextView appCompatTextView = this.binding.textConsentableDetailHeader;
            HeaderAdapter headerAdapter = this.this$0;
            String str = (String) headerAdapter.description.get(headerAdapter.getTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease());
            if (str == null && (str = (String) y0.firstOrNull(headerAdapter.description.values())) == null) {
                str = "";
            }
            appCompatTextView.setText(d.fromHtml(str, 63));
            appCompatTextView.setTextColor(headerAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appCompatTextView.setLinkTextColor(headerAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            String str2 = (String) this.this$0.descriptionLegal.get(this.this$0.getTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease());
            if (str2 == null) {
                str2 = (String) y0.firstOrNull(this.this$0.descriptionLegal.values());
            }
            this.binding.textConsentableDetailAdditionnalText.setText(d.fromHtml(str2 != null ? str2 : "", 63));
            this.binding.textConsentableDetailAdditionnalText.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textConsentableDetailAdditionnalText.setLinkTextColor(this.this$0.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textConsentableDetailHeader.setMovementMethod(LinkMovementMethod.getInstance());
            this.binding.textConsentableDetailAdditionnalText.setMovementMethod(LinkMovementMethod.getInstance());
            AppCompatTextView appCompatTextView2 = this.binding.textConsentableDetailSeeMore;
            final HeaderAdapter headerAdapter2 = this.this$0;
            appCompatTextView2.setText(headerAdapter2.getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_application_examples));
            int i10 = 8;
            appCompatTextView2.setVisibility((str2 == null || !(n0.isBlank(str2) ^ true)) ? 8 : 0);
            final int i11 = 0;
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.detail.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            HeaderAdapter.DescriptionHeaderViewHolder.bind$lambda$2$lambda$1(headerAdapter2, this, view);
                            break;
                        default:
                            HeaderAdapter.DescriptionHeaderViewHolder.bind$lambda$4$lambda$3(headerAdapter2, this, view);
                            break;
                    }
                }
            });
            if (headerAdapter2.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() != 0) {
                appCompatTextView2.setTextColor(headerAdapter2.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            }
            ImageView imageView = this.binding.imageConsentableDetailApplicationExample;
            final HeaderAdapter headerAdapter3 = this.this$0;
            if (str2 != null && (!n0.isBlank(str2))) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            final int i12 = 1;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sfbx.appconsentv3.ui.ui.consentable.detail.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            HeaderAdapter.DescriptionHeaderViewHolder.bind$lambda$2$lambda$1(headerAdapter3, this, view);
                            break;
                        default:
                            HeaderAdapter.DescriptionHeaderViewHolder.bind$lambda$4$lambda$3(headerAdapter3, this, view);
                            break;
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorHeaderAdapter extends RecyclerView.a {
        private final SwitchViewListener listener;
        final /* synthetic */ HeaderAdapter this$0;

        public VendorHeaderAdapter(HeaderAdapter headerAdapter, SwitchViewListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = headerAdapter;
            this.listener = listener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.this$0.vendors.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_consentable_detail_vendor_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(VendorHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public VendorHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemConsentableDetailVendorHeaderBinding appconsentV3ItemConsentableDetailVendorHeaderBindingInflate = AppconsentV3ItemConsentableDetailVendorHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemConsentableDetailVendorHeaderBindingInflate, "inflate(\n               …      false\n            )");
            return new VendorHeaderViewHolder(this.this$0, appconsentV3ItemConsentableDetailVendorHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemConsentableDetailVendorHeaderBinding binding;
        final /* synthetic */ HeaderAdapter this$0;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorHeaderViewHolder(HeaderAdapter headerAdapter, AppconsentV3ItemConsentableDetailVendorHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = headerAdapter;
            this.binding = binding;
        }

        public final void bind(SwitchViewListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.binding.switchVendorHeader.setStatus(this.this$0.status, false);
            this.binding.switchVendorHeader.setSwitchListener(listener);
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.this$0.type.ordinal()];
            if (i10 == 1 || i10 == 2) {
                this.binding.switchVendorHeader.setVisibility(8);
                this.binding.textVendorHeader.setText(this.this$0.getTheme().getMandatorySectionVendors$appconsent_ui_v3_prodXchangeRelease());
            } else {
                this.binding.switchVendorHeader.setVisibility(0);
                this.binding.textVendorHeader.setText(this.this$0.getTheme().getNoticeConsentableDetailLabel1$appconsent_ui_v3_prodXchangeRelease());
            }
            this.binding.textVendorHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VendorLITHeaderAdapter extends RecyclerView.a {
        private final RejectButtonView.RejectButtonListener listener;
        private ConsentStatus litStatus;
        final /* synthetic */ HeaderAdapter this$0;

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

        public VendorLITHeaderAdapter(HeaderAdapter headerAdapter, RejectButtonView.RejectButtonListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = headerAdapter;
            this.listener = listener;
            this.litStatus = headerAdapter.legIntStatus;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.this$0.type.ordinal()];
            return (i10 == 1 || i10 == 2 || this.this$0.legVendors.isEmpty() || !e0.areEqual(Boolean.TRUE, this.this$0.mIsLegitimateInteresetMustBeDisplayed)) ? 0 : 1;
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
        final /* synthetic */ HeaderAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VendorLITHeaderViewHolder(HeaderAdapter headerAdapter, AppconsentV3ItemConsentableDetailVendorLitHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = headerAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(HeaderAdapter this$0, View view) {
            e0.checkNotNullParameter(this$0, "this$0");
            Context context = view.getContext();
            e0.checkNotNullExpressionValue(context, "it.context");
            this$0.buildAlertDialog(context);
        }

        public final void bind(RejectButtonView.RejectButtonListener listener, ConsentStatus litStatus) {
            e0.checkNotNullParameter(listener, "listener");
            e0.checkNotNullParameter(litStatus, "litStatus");
            this.binding.textVendorLitHeader.setOnClickListener(new com.applovin.mediation.nativeAds.a(this.this$0, 8));
            this.binding.textVendorLitHeader.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textVendorLitHeader.setText(this.this$0.getTheme().getVendorLegInt$appconsent_ui_v3_prodXchangeRelease());
            this.binding.rejectButton.reject(litStatus == ConsentStatus.DISALLOWED);
            this.binding.rejectButton.setRejectButtonListener(listener);
        }
    }

    public HeaderAdapter(Consentable consentable, Boolean bool) {
        e0.checkNotNullParameter(consentable, "consentable");
        this.mIsLegitimateInteresetMustBeDisplayed = bool;
        this.descriptionLegal = consentable.getIllustrations();
        this.description = consentable.getDescription();
        List<Vendor> vendors = consentable.getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (!((Vendor) obj).isLegVendor()) {
                arrayList.add(obj);
            }
        }
        this.vendors = arrayList;
        List<Vendor> vendors2 = consentable.getVendors();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : vendors2) {
            if (((Vendor) obj2).isLegVendor()) {
                arrayList2.add(obj2);
            }
        }
        this.legVendors = arrayList2;
        this.theme$delegate = q.lazy(HeaderAdapter$theme$2.INSTANCE);
        this.type = consentable.getType();
        this.status = consentable.getStatus();
        this.legIntStatus = consentable.getLegIntStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildAlertDialog(Context context) {
        String string = getTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_details_dialog_message);
        e0.checkNotNullExpressionValue(string, "theme.contextLocalized.g…e_details_dialog_message)");
        m mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease = AlertDialogUtil.INSTANCE.buildAlertDialog$appconsent_ui_v3_prodXchangeRelease(context, getTheme(), string);
        if (mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease != null) {
            mVarBuildAlertDialog$appconsent_ui_v3_prodXchangeRelease.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickOnExamplesOfUsage(AppconsentV3ItemConsentableDetailHeaderBinding appconsentV3ItemConsentableDetailHeaderBinding) {
        AppCompatTextView appCompatTextView = appconsentV3ItemConsentableDetailHeaderBinding.textConsentableDetailAdditionnalText;
        appCompatTextView.setVisibility(appCompatTextView.getVisibility() == 0 ? 8 : 0);
        appconsentV3ItemConsentableDetailHeaderBinding.imageConsentableDetailApplicationExample.animate().rotationBy(180.0f).setDuration(100L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }
}
