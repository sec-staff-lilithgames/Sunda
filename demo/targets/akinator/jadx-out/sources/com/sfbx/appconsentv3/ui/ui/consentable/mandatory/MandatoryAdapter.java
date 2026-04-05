package com.sfbx.appconsentv3.ui.ui.consentable.mandatory;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemMandatoryHeaderBinding;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MandatoryAdapter {
    private final ConsentableType consentableType;
    private final o theme$delegate;

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
            return R.layout.appconsent_v3_item_mandatory_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(DescriptionHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind(MandatoryAdapter.this.consentableType);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public DescriptionHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemMandatoryHeaderBinding appconsentV3ItemMandatoryHeaderBindingInflate = AppconsentV3ItemMandatoryHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemMandatoryHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new DescriptionHeaderViewHolder(MandatoryAdapter.this, appconsentV3ItemMandatoryHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class DescriptionHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemMandatoryHeaderBinding binding;
        final /* synthetic */ MandatoryAdapter this$0;

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
        public DescriptionHeaderViewHolder(MandatoryAdapter mandatoryAdapter, AppconsentV3ItemMandatoryHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = mandatoryAdapter;
            this.binding = binding;
        }

        public final void bind(ConsentableType consentableType) {
            e0.checkNotNullParameter(consentableType, "consentableType");
            AppCompatTextView appCompatTextView = this.binding.mandatoryHeaderText;
            int i10 = WhenMappings.$EnumSwitchMapping$0[consentableType.ordinal()];
            appCompatTextView.setText(i10 != 1 ? i10 != 2 ? "" : this.this$0.getTheme().getNoticeMandatoryFeatureDesc$appconsent_ui_v3_prodXchangeRelease() : this.this$0.getTheme().getNoticeMandatoryPurposeDesc$appconsent_ui_v3_prodXchangeRelease());
            this.binding.mandatoryHeaderText.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }

    public MandatoryAdapter(ConsentableType consentableType) {
        e0.checkNotNullParameter(consentableType, "consentableType");
        this.consentableType = consentableType;
        this.theme$delegate = q.lazy(MandatoryAdapter$theme$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }
}
