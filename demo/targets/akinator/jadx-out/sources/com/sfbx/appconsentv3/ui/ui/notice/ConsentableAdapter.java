package com.sfbx.appconsentv3.ui.ui.notice;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.j0;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3CardConsentableBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.view.ConsentableCardView;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableAdapter extends f1 {
    private final o appTheme$delegate;
    private final ConsentableListener consentableListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentableDiffCallback extends j0 {
        @Override // androidx.recyclerview.widget.j0
        public boolean areContentsTheSame(Consentable oldItem, Consentable newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return oldItem.getType() == newItem.getType() && oldItem.getStatus() == newItem.getStatus() && oldItem.getName().values().containsAll(newItem.getName().values()) && oldItem.getName().keySet().containsAll(newItem.getName().keySet());
        }

        @Override // androidx.recyclerview.widget.j0
        public boolean areItemsTheSame(Consentable oldItem, Consentable newItem) {
            e0.checkNotNullParameter(oldItem, "oldItem");
            e0.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId() && oldItem.getType() == newItem.getType();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ConsentableViewHolder extends RecyclerView.n {
        public Consentable aConsentable;
        private final AppconsentV3CardConsentableBinding binding;
        final /* synthetic */ ConsentableAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentableViewHolder(ConsentableAdapter consentableAdapter, AppconsentV3CardConsentableBinding binding) {
            super(binding.getRoot());
            e0.checkNotNullParameter(binding, "binding");
            this.this$0 = consentableAdapter;
            this.binding = binding;
        }

        public final void bind(Consentable consentable) throws Resources.NotFoundException {
            e0.checkNotNullParameter(consentable, "consentable");
            setAConsentable(consentable);
            ConsentableCardView consentableCardView = this.binding.cpConsentable;
            ConsentableAdapter consentableAdapter = this.this$0;
            consentableCardView.setVisibility(0);
            consentableCardView.setConsentable(consentable);
            ExtensionKt.notNull(consentableAdapter.consentableListener, new ConsentableAdapter$ConsentableViewHolder$bind$1$1(consentableCardView));
            this.binding.configCustomConsentableSeparator.setBackgroundColor(this.this$0.getAppTheme().getSeparatorColor$appconsent_ui_v3_prodXchangeRelease());
        }

        public final Consentable getAConsentable() {
            Consentable consentable = this.aConsentable;
            if (consentable != null) {
                return consentable;
            }
            e0.throwUninitializedPropertyAccessException("aConsentable");
            return null;
        }

        public final void setAConsentable(Consentable consentable) {
            e0.checkNotNullParameter(consentable, "<set-?>");
            this.aConsentable = consentable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableAdapter(ConsentableListener consentableListener) {
        super(new ConsentableDiffCallback());
        e0.checkNotNullParameter(consentableListener, "consentableListener");
        this.consentableListener = consentableListener;
        this.appTheme$delegate = q.lazy(ConsentableAdapter$appTheme$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppConsentTheme getAppTheme() {
        return (AppConsentTheme) this.appTheme$delegate.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        return R.layout.appconsent_v3_card_consentable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(ConsentableViewHolder holder, int i10) throws Resources.NotFoundException {
        e0.checkNotNullParameter(holder, "holder");
        Consentable consentable = (Consentable) getItem(i10);
        e0.checkNotNullExpressionValue(consentable, "consentable");
        holder.bind(consentable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public ConsentableViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        e0.checkNotNullParameter(parent, "parent");
        AppconsentV3CardConsentableBinding appconsentV3CardConsentableBindingInflate = AppconsentV3CardConsentableBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        e0.checkNotNullExpressionValue(appconsentV3CardConsentableBindingInflate, "inflate(layoutInflater, parent, false)");
        return new ConsentableViewHolder(this, appconsentV3CardConsentableBindingInflate);
    }
}
