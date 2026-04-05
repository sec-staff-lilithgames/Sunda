package com.sfbx.appconsentv3.ui.ui.geolocation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.oa;
import com.bumptech.glide.c;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationFooterBinding;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ItemGeolocationHeaderBinding;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.o;
import tu.q;
import v3.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeolocationAdapter {
    private final o theme$delegate = q.lazy(GeolocationAdapter$theme$2.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class GeolocationFooterAdapter extends RecyclerView.a {
        public GeolocationFooterAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_geolocation_footer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(GeolocationFooterViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public GeolocationFooterViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationFooterBinding appconsentV3ItemGeolocationFooterBindingInflate = AppconsentV3ItemGeolocationFooterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemGeolocationFooterBindingInflate, "inflate(inflater, parent, false)");
            return new GeolocationFooterViewHolder(GeolocationAdapter.this, appconsentV3ItemGeolocationFooterBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class GeolocationFooterViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemGeolocationFooterBinding binding;
        final /* synthetic */ GeolocationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeolocationFooterViewHolder(GeolocationAdapter geolocationAdapter, AppconsentV3ItemGeolocationFooterBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationAdapter;
            this.binding = binding;
        }

        public final void bind() {
            this.binding.textFooter.setTextColor(this.this$0.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            this.binding.textFooter.setText(d.fromHtml(this.this$0.getTheme().getFinishDescriptionText$appconsent_ui_v3_prodXchangeRelease(), 63));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class GeolocationHeaderAdapter extends RecyclerView.a {
        public GeolocationHeaderAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemViewType(int i10) {
            return R.layout.appconsent_v3_item_geolocation_header;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(GeolocationHeaderViewHolder holder, int i10) {
            e0.checkNotNullParameter(holder, "holder");
            holder.bind();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public GeolocationHeaderViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
            e0.checkNotNullParameter(parent, "parent");
            AppconsentV3ItemGeolocationHeaderBinding appconsentV3ItemGeolocationHeaderBindingInflate = AppconsentV3ItemGeolocationHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            e0.checkNotNullExpressionValue(appconsentV3ItemGeolocationHeaderBindingInflate, "inflate(inflater, parent, false)");
            return new GeolocationHeaderViewHolder(GeolocationAdapter.this, appconsentV3ItemGeolocationHeaderBindingInflate);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class GeolocationHeaderViewHolder extends RecyclerView.n {
        private final AppconsentV3ItemGeolocationHeaderBinding binding;
        final /* synthetic */ GeolocationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeolocationHeaderViewHolder(GeolocationAdapter geolocationAdapter, AppconsentV3ItemGeolocationHeaderBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = geolocationAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1$lambda$0(GeolocationHeaderViewHolder this$0, AppCompatTextView this_apply, GeolocationAdapter this$1, View view) {
            int i10;
            e0.checkNotNullParameter(this$0, "this$0");
            e0.checkNotNullParameter(this_apply, "$this_apply");
            e0.checkNotNullParameter(this$1, "this$1");
            AppCompatTextView appCompatTextView = this$0.binding.textMessageHidden;
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
            AppconsentV3ItemGeolocationHeaderBinding appconsentV3ItemGeolocationHeaderBinding = this.binding;
            GeolocationAdapter geolocationAdapter = this.this$0;
            appconsentV3ItemGeolocationHeaderBinding.textSubtitle.setTextColor(geolocationAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appconsentV3ItemGeolocationHeaderBinding.textTitle.setTextColor(geolocationAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appconsentV3ItemGeolocationHeaderBinding.textMessage.setTextColor(geolocationAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appconsentV3ItemGeolocationHeaderBinding.textMessageHidden.setTextColor(geolocationAdapter.getTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            AppCompatTextView bind$lambda$2$lambda$1 = appconsentV3ItemGeolocationHeaderBinding.textSeeMore;
            bind$lambda$2$lambda$1.setText(geolocationAdapter.getTheme().getButtonSeeMoreLegalText$appconsent_ui_v3_prodXchangeRelease());
            bind$lambda$2$lambda$1.setOnClickListener(new oa(this, bind$lambda$2$lambda$1, geolocationAdapter, 1));
            e0.checkNotNullExpressionValue(bind$lambda$2$lambda$1, "bind$lambda$2$lambda$1");
            ViewExtsKt.underline(bind$lambda$2$lambda$1, geolocationAdapter.getTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
            if (n0.isBlank(this.this$0.getTheme().getGeoAdvertisingIconUrl$appconsent_ui_v3_prodXchangeRelease())) {
                this.binding.imageGeolocationHeader.setVisibility(8);
            } else {
                c.with(this.itemView).load(this.this$0.getTheme().getGeoAdvertisingIconUrl$appconsent_ui_v3_prodXchangeRelease()).into(this.binding.imageGeolocationHeader);
                this.binding.imageGeolocationHeader.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getTheme() {
        return (AppConsentTheme) this.theme$delegate.getValue();
    }
}
