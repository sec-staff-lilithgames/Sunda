package com.sfbx.appconsentv3.ui.ui.notice;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardBannerActionBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardCopyrightBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardDisplayVendorsBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardHeaderConfigurationBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardHeaderSwitchBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardIllustratedBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardLabelBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardMandatoryBinding;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import com.sfbx.appconsentv3.ui.view.NoticeBannerView;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.o;
import tu.q;
import uu.y0;
import v3.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NoticeAdapter {
    private final o appTheme$delegate = q.lazy(NoticeAdapter$appTheme$2.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ButtonActionAdapter extends RecyclerView.a {
        private boolean enableBannerButtons;
        private final NoticeBannerView.OnClickButtonListener listener;
        final /* synthetic */ NoticeAdapter this$0;

        public ButtonActionAdapter(NoticeAdapter noticeAdapter, NoticeBannerView.OnClickButtonListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = noticeAdapter;
            this.listener = listener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_banner_action;
        }

        public final NoticeBannerView.OnClickButtonListener getListener() {
            return this.listener;
        }

        public final void updateBannerUI() {
            this.enableBannerButtons = true;
            notifyItemChanged(getItemCount() - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(ButtonActionViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.enableBannerButtons, this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public ButtonActionViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardBannerActionBinding appconsentV3CardBannerActionBindingInflate = AppconsentV3CardBannerActionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardBannerActionBindingInflate, "inflate(inflater, parent, false)");
            return new ButtonActionViewHolder(this.this$0, appconsentV3CardBannerActionBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ButtonActionViewHolder extends RecyclerView.n {
        private final AppconsentV3CardBannerActionBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonActionViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardBannerActionBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        public final void bind(boolean z10, NoticeBannerView.OnClickButtonListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.binding.layoutConsentActionBanner.setOnClickButtonListener(listener);
            if (z10) {
                this.binding.layoutConsentActionBanner.updateBannerUI();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CopyrightAdapter extends RecyclerView.a {
        public CopyrightAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_copyright;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(CopyrightViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public CopyrightViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardCopyrightBinding appconsentV3CardCopyrightBindingInflate = AppconsentV3CardCopyrightBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardCopyrightBindingInflate, "inflate(inflater, parent, false)");
            return new CopyrightViewHolder(NoticeAdapter.this, appconsentV3CardCopyrightBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CopyrightViewHolder extends RecyclerView.n {
        private final AppconsentV3CardCopyrightBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyrightViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardCopyrightBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        public final void bind() {
            this.binding.cardCopyrightText.setText(ExtensionKt.getCopyrights(this.this$0.getAppTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease()));
            this.binding.cardCopyrightText.setTextColor(this.this$0.getAppTheme().getCopyrightColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderAdapter extends RecyclerView.a {
        private final boolean displayHeader;
        private final DescriptionListener listener;
        final /* synthetic */ NoticeAdapter this$0;

        public DescriptionHeaderAdapter(NoticeAdapter noticeAdapter, boolean z10, DescriptionListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = noticeAdapter;
            this.displayHeader = z10;
            this.listener = listener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.displayHeader ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_header_configuration;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(DescriptionHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public DescriptionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardHeaderConfigurationBinding appconsentV3CardHeaderConfigurationBindingInflate = AppconsentV3CardHeaderConfigurationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardHeaderConfigurationBindingInflate, "inflate(inflater, parent, false)");
            return new DescriptionHeaderViewHolder(this.this$0, appconsentV3CardHeaderConfigurationBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3CardHeaderConfigurationBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionHeaderViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardHeaderConfigurationBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
            View view = this.itemView;
            if (noticeAdapter.getAppTheme().getNoticeInformationListTitleText$appconsent_ui_v3_prodXchangeRelease().length() == 0) {
                view.setVisibility(8);
                return;
            }
            binding.configCustomHeaderSeparator.setBackgroundColor(noticeAdapter.getAppTheme().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
            if (noticeAdapter.getAppTheme().getNoticeInformationListTitleText$appconsent_ui_v3_prodXchangeRelease().length() > 0) {
                binding.configHeaderDescription.setText(d.fromHtml(noticeAdapter.getAppTheme().getNoticeInformationListTitleText$appconsent_ui_v3_prodXchangeRelease(), 63));
                binding.configHeaderDescription.setMovementMethod(LinkMovementMethod.getInstance());
                binding.configHeaderDescription.setVisibility(0);
            }
            binding.configHeaderTitle.setTextColor(noticeAdapter.getAppTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            binding.configHeaderDescription.setTextColor(noticeAdapter.getAppTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            if (noticeAdapter.getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() != 0) {
                binding.configHeaderTitle.setLinkTextColor(noticeAdapter.getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
                binding.configHeaderDescription.setLinkTextColor(noticeAdapter.getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(DescriptionListener listener, View view) {
            e0.checkNotNullParameter(listener, "$listener");
            listener.displayHeader(false);
        }

        public final void bind(DescriptionListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.binding.configCustomHeaderSeparator.setVisibility(0);
            this.binding.configHeader.setVisibility(0);
            if (this.this$0.getAppTheme().getDisplayConfigCloseHeader$appconsent_ui_v3_prodXchangeRelease()) {
                this.binding.configCloseHeader.setVisibility(0);
                this.binding.configCloseHeader.setOnClickListener(new com.applovin.mediation.nativeAds.a(listener, 10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DescriptionListener {
        void displayHeader(boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DisplayMandatoryAdapter extends RecyclerView.a {
        private final List<Consentable> consentables;
        private final MandatoryListener listener;
        final /* synthetic */ NoticeAdapter this$0;

        public DisplayMandatoryAdapter(NoticeAdapter noticeAdapter, List<Consentable> consentables, MandatoryListener listener) {
            e0.checkNotNullParameter(consentables, "consentables");
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = noticeAdapter;
            this.consentables = consentables;
            this.listener = listener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return !this.consentables.isEmpty() ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_mandatory;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(MandatoryViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind((Consentable) y0.firstOrNull((List) this.consentables), this.listener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public MandatoryViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardMandatoryBinding appconsentV3CardMandatoryBindingInflate = AppconsentV3CardMandatoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardMandatoryBindingInflate, "inflate(inflater, parent, false)");
            return new MandatoryViewHolder(this.this$0, appconsentV3CardMandatoryBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DisplayVendorsAdapter extends RecyclerView.a {
        private final VendorsListener listener;
        final /* synthetic */ NoticeAdapter this$0;
        private final int vendors;

        public DisplayVendorsAdapter(NoticeAdapter noticeAdapter, VendorsListener listener, int i10) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = noticeAdapter;
            this.listener = listener;
            this.vendors = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_display_vendors;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(DisplayVendorsViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener, this.vendors);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public DisplayVendorsViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardDisplayVendorsBinding appconsentV3CardDisplayVendorsBindingInflate = AppconsentV3CardDisplayVendorsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardDisplayVendorsBindingInflate, "inflate(inflater, parent, false)");
            return new DisplayVendorsViewHolder(this.this$0, appconsentV3CardDisplayVendorsBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DisplayVendorsViewHolder extends RecyclerView.n {
        private final AppconsentV3CardDisplayVendorsBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayVendorsViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardDisplayVendorsBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(VendorsListener listener, View view) {
            e0.checkNotNullParameter(listener, "$listener");
            listener.onClickVendors();
        }

        public final void bind(VendorsListener listener, int i10) {
            e0.checkNotNullParameter(listener, "listener");
            AppCompatTextView bind$lambda$2 = this.binding.textVendors;
            NoticeAdapter noticeAdapter = this.this$0;
            bind$lambda$2.setText(noticeAdapter.getAppTheme().getButtonRefineByPartner$appconsent_ui_v3_prodXchangeRelease() + " (" + i10 + ')');
            bind$lambda$2.setOnClickListener(new com.applovin.mediation.nativeAds.a(listener, 11));
            e0.checkNotNullExpressionValue(bind$lambda$2, "bind$lambda$2");
            ViewExtsKt.underline(bind$lambda$2, noticeAdapter.getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HeaderSwitchAdapter extends RecyclerView.a {
        private ConsentStatus globalStatus;
        private final HeaderSwitchListener listener;
        final /* synthetic */ NoticeAdapter this$0;

        public HeaderSwitchAdapter(NoticeAdapter noticeAdapter, HeaderSwitchListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.this$0 = noticeAdapter;
            this.listener = listener;
            this.globalStatus = ConsentStatus.PENDING;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_header_switch;
        }

        public final void updateGlobalStatus(ConsentStatus newStatus) {
            e0.checkNotNullParameter(newStatus, "newStatus");
            this.globalStatus = newStatus;
            notifyItemChanged(getItemCount() - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(HeaderSwitchViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.listener, this.globalStatus);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public HeaderSwitchViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardHeaderSwitchBinding appconsentV3CardHeaderSwitchBindingInflate = AppconsentV3CardHeaderSwitchBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardHeaderSwitchBindingInflate, "inflate(inflater, parent, false)");
            return new HeaderSwitchViewHolder(this.this$0, appconsentV3CardHeaderSwitchBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HeaderSwitchListener {
        void globalStatusChanged(ConsentStatus consentStatus);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HeaderSwitchViewHolder extends RecyclerView.n {
        private final AppconsentV3CardHeaderSwitchBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderSwitchViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardHeaderSwitchBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        public final void bind(final HeaderSwitchListener listener, ConsentStatus globalStatus) {
            e0.checkNotNullParameter(listener, "listener");
            e0.checkNotNullParameter(globalStatus, "globalStatus");
            this.binding.globalSwitch.setSwitchListener(new SwitchViewListener() { // from class: com.sfbx.appconsentv3.ui.ui.notice.NoticeAdapter$HeaderSwitchViewHolder$bind$1
                @Override // com.sfbx.appconsentv3.ui.listener.SwitchViewListener
                public void onSwitchChanged(ConsentStatus newStatus) {
                    e0.checkNotNullParameter(newStatus, "newStatus");
                    listener.globalStatusChanged(newStatus);
                }
            });
            AppCompatTextView appCompatTextView = this.binding.globalLabel;
            NoticeAdapter noticeAdapter = this.this$0;
            appCompatTextView.setText(noticeAdapter.getAppTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_notice_global_switch));
            appCompatTextView.setTextColor(noticeAdapter.getAppTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.globalSwitch.setStatus(globalStatus, false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class IllustratedAdapter extends RecyclerView.a {
        private final boolean shouldDisplay;

        public IllustratedAdapter(boolean z10) {
            this.shouldDisplay = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.shouldDisplay ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_illustrated;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(IllustratedViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.shouldDisplay);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public IllustratedViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardIllustratedBinding appconsentV3CardIllustratedBindingInflate = AppconsentV3CardIllustratedBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardIllustratedBindingInflate, "inflate(inflater, parent, false)");
            return new IllustratedViewHolder(NoticeAdapter.this, appconsentV3CardIllustratedBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class IllustratedViewHolder extends RecyclerView.n {
        private final AppconsentV3CardIllustratedBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllustratedViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardIllustratedBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        public final void bind(boolean z10) {
            if (z10) {
                com.bumptech.glide.c.with(this.itemView.getContext()).clear(this.binding.imageBannerBackground);
                String illustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease = this.this$0.getAppTheme().getIllustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease();
                if (illustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease != null) {
                    com.bumptech.glide.c.with(this.itemView.getContext()).load(illustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease).into(this.binding.imageBannerBackground);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class LabelAdapter extends RecyclerView.a {
        private final String label;
        private final int labelOrder;
        private final boolean shouldDisplayLabel;
        final /* synthetic */ NoticeAdapter this$0;

        public LabelAdapter(NoticeAdapter noticeAdapter, String label, boolean z10, int i10) {
            e0.checkNotNullParameter(label, "label");
            this.this$0 = noticeAdapter;
            this.label = label;
            this.shouldDisplayLabel = z10;
            this.labelOrder = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.shouldDisplayLabel ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_card_label;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(LabelViewHolder holder, int i10) throws Resources.NotFoundException {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(this.label, this.labelOrder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public LabelViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3CardLabelBinding appconsentV3CardLabelBindingInflate = AppconsentV3CardLabelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3CardLabelBindingInflate, "inflate(inflater, parent, false)");
            return new LabelViewHolder(this.this$0, appconsentV3CardLabelBindingInflate);
        }

        public /* synthetic */ LabelAdapter(NoticeAdapter noticeAdapter, String str, boolean z10, int i10, int i11, u uVar) {
            this(noticeAdapter, str, z10, (i11 & 4) != 0 ? 0 : i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class LabelViewHolder extends RecyclerView.n {
        private final AppconsentV3CardLabelBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardLabelBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        public final void bind(String label, int i10) throws Resources.NotFoundException {
            int iDpToPx;
            int iDpToPx2;
            e0.checkNotNullParameter(label, "label");
            this.binding.cardLabelText.setText(label);
            this.binding.cardLabelText.setTextColor(this.this$0.getAppTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            if (i10 == 2) {
                try {
                    iDpToPx = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.appconsent_v3_padding_medium);
                } catch (Exception unused) {
                    Context context = this.itemView.getContext();
                    e0.checkNotNullExpressionValue(context, "itemView.context");
                    iDpToPx = ExtensionKt.dpToPx(16.0f, context);
                }
                LinearLayoutCompat linearLayoutCompat = this.binding.labelContainer;
                linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), iDpToPx, this.binding.labelContainer.getPaddingRight(), this.binding.labelContainer.getPaddingBottom());
                return;
            }
            if (i10 != 3) {
                return;
            }
            try {
                iDpToPx2 = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.appconsent_v3_padding_large);
            } catch (Exception unused2) {
                Context context2 = this.itemView.getContext();
                e0.checkNotNullExpressionValue(context2, "itemView.context");
                iDpToPx2 = ExtensionKt.dpToPx(42.0f, context2);
            }
            LinearLayoutCompat linearLayoutCompat2 = this.binding.labelContainer;
            linearLayoutCompat2.setPadding(linearLayoutCompat2.getPaddingLeft(), iDpToPx2, this.binding.labelContainer.getPaddingRight(), this.binding.labelContainer.getPaddingBottom());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MandatoryListener {
        void onClickMandatory(ConsentableType consentableType);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class MandatoryViewHolder extends RecyclerView.n {
        private Consentable aConsentable;
        private final AppconsentV3CardMandatoryBinding binding;
        final /* synthetic */ NoticeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MandatoryViewHolder(NoticeAdapter noticeAdapter, AppconsentV3CardMandatoryBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = noticeAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(MandatoryListener listener, MandatoryViewHolder this$0, View view) {
            e0.checkNotNullParameter(listener, "$listener");
            e0.checkNotNullParameter(this$0, "this$0");
            Consentable consentable = this$0.aConsentable;
            e0.checkNotNull(consentable);
            listener.onClickMandatory(consentable.getType());
        }

        public final void bind(Consentable consentable, MandatoryListener listener) {
            String buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease;
            e0.checkNotNullParameter(listener, "listener");
            this.aConsentable = consentable;
            if (consentable != null) {
                NoticeAdapter noticeAdapter = this.this$0;
                this.binding.textMandatory.setVisibility(0);
                AppCompatTextView appCompatTextView = this.binding.textMandatory;
                Consentable consentable2 = this.aConsentable;
                e0.checkNotNull(consentable2);
                if (consentable2.getType() == ConsentableType.SPECIAL_PURPOSE) {
                    buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease = noticeAdapter.getAppTheme().getButtonSeeMandatoryPurpose$appconsent_ui_v3_prodXchangeRelease();
                    if (buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease == null) {
                        buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease = noticeAdapter.getAppTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_list_see_mandatory_purpose);
                        e0.checkNotNullExpressionValue(buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease, "appTheme.contextLocalize…                        )");
                    }
                } else {
                    buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease = noticeAdapter.getAppTheme().getButtonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease();
                    if (buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease == null) {
                        buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease = noticeAdapter.getAppTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getString(R.string.appconsent_consentable_list_see_mandatory_feature);
                        e0.checkNotNullExpressionValue(buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease, "appTheme.contextLocalize…                        )");
                    }
                }
                appCompatTextView.setText(buttonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease);
                AppCompatTextView appCompatTextView2 = this.binding.textMandatory;
                e0.checkNotNullExpressionValue(appCompatTextView2, "binding.textMandatory");
                ViewExtsKt.underline(appCompatTextView2, noticeAdapter.getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
                this.binding.textMandatory.setOnClickListener(new f(2, listener, this));
            }
        }

        public final Consentable getAConsentable() {
            return this.aConsentable;
        }

        public final void setAConsentable(Consentable consentable) {
            this.aConsentable = consentable;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VendorsListener {
        void onClickVendors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppTheme() {
        return (AppConsentTheme) this.appTheme$delegate.getValue();
    }
}
