package com.sfbx.appconsentv3.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewConsentableBinding;
import com.sfbx.appconsentv3.ui.listener.ConsentableListener;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import com.sfbx.appconsentv3.ui.util.ViewExtsKt;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m3.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableCardView extends LinearLayoutCompat implements View.OnClickListener {
    private final o appTheme$delegate;
    private final AppconsentV3ViewConsentableBinding binding;
    private Consentable consentable;
    private ConsentableListener consentableListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentableCardView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final AppConsentTheme getAppTheme() {
        return (AppConsentTheme) this.appTheme$delegate.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        e0.checkNotNullParameter(v10, "v");
        ConsentableListener consentableListener = this.consentableListener;
        if (consentableListener != null) {
            Consentable consentable = this.consentable;
            if (consentable == null) {
                e0.throwUninitializedPropertyAccessException("consentable");
                consentable = null;
            }
            consentableListener.seeMore(consentable);
        }
    }

    public final void setConsentable(Consentable consentable) throws Resources.NotFoundException {
        e0.checkNotNullParameter(consentable, "consentable");
        this.consentable = consentable;
        this.binding.consentableName.setText(consentable.getNameAsString(getAppTheme().getLanguage$appconsent_ui_v3_prodXchangeRelease()));
        Integer vendorsNumber = consentable.getVendorsNumber();
        int i10 = 8;
        if (vendorsNumber == null || vendorsNumber.intValue() <= 0) {
            this.binding.consentableNumberVendors.setVisibility(8);
        } else {
            AppCompatTextView appCompatTextView = this.binding.consentableNumberVendors;
            String quantityString = getAppTheme().getContextLocalized$appconsent_ui_v3_prodXchangeRelease().getResources().getQuantityString(R.plurals.appconsent_quantity_partner, vendorsNumber.intValue(), vendorsNumber);
            e0.checkNotNullExpressionValue(quantityString, "appTheme.contextLocalize…sNumber\n                )");
            String lowerCase = quantityString.toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            appCompatTextView.setText(lowerCase);
            this.binding.consentableNumberVendors.setVisibility(0);
        }
        this.binding.consentableSwitch.setStatus(consentable.getStatus(), false);
        SwitchView switchView = this.binding.consentableSwitch;
        if (consentable.getType() != ConsentableType.SPECIAL_PURPOSE && consentable.getType() != ConsentableType.FEATURE) {
            i10 = 0;
        }
        switchView.setVisibility(i10);
        this.binding.consentableMore.setOnClickListener(this);
        this.binding.consentableMore.setText(consentable.getType() == ConsentableType.STACK ? getAppTheme().getButtonConfigureText$appconsent_ui_v3_prodXchangeRelease() : getAppTheme().getButtonLearnMoreText$appconsent_ui_v3_prodXchangeRelease());
        AppCompatTextView appCompatTextView2 = this.binding.consentableMore;
        e0.checkNotNullExpressionValue(appCompatTextView2, "binding.consentableMore");
        ViewExtsKt.underline(appCompatTextView2, getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        AppCompatImageView appCompatImageView = this.binding.consentableLogo;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        appCompatImageView.setImageDrawable(ExtensionKt.getConsentableLogo(consentable, context));
    }

    public final void setConsentableListener(ConsentableListener consentableListener) {
        e0.checkNotNullParameter(consentableListener, "consentableListener");
        this.consentableListener = consentableListener;
    }

    public /* synthetic */ ConsentableCardView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.appTheme$delegate = q.lazy(ConsentableCardView$appTheme$2.INSTANCE);
        setOrientation(0);
        setGravity(16);
        setBackgroundColor(a.getColor(context, android.R.color.transparent));
        AppconsentV3ViewConsentableBinding appconsentV3ViewConsentableBindingInflate = AppconsentV3ViewConsentableBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3ViewConsentableBindingInflate, "inflate(inflater, this, true)");
        this.binding = appconsentV3ViewConsentableBindingInflate;
        if (getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() != 0) {
            appconsentV3ViewConsentableBindingInflate.consentableMore.setTextColor(getAppTheme().getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease());
        }
        appconsentV3ViewConsentableBindingInflate.consentableMore.setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConsentableCardView);
            e0.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…able.ConsentableCardView)");
            appconsentV3ViewConsentableBindingInflate.consentableName.setText(typedArrayObtainStyledAttributes.getText(R.styleable.ConsentableCardView_consentable_name));
            appconsentV3ViewConsentableBindingInflate.consentableName.setTextColor(getAppTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
            appconsentV3ViewConsentableBindingInflate.consentableSwitch.setSwitchListener(new SwitchViewListener() { // from class: com.sfbx.appconsentv3.ui.view.ConsentableCardView.1
                @Override // com.sfbx.appconsentv3.ui.listener.SwitchViewListener
                public void onSwitchChanged(ConsentStatus newStatus) {
                    e0.checkNotNullParameter(newStatus, "newStatus");
                    ConsentableListener consentableListener = ConsentableCardView.this.consentableListener;
                    Consentable consentable = null;
                    if (consentableListener != null) {
                        Consentable consentable2 = ConsentableCardView.this.consentable;
                        if (consentable2 == null) {
                            e0.throwUninitializedPropertyAccessException("consentable");
                            consentable2 = null;
                        }
                        int id2 = consentable2.getId();
                        Consentable consentable3 = ConsentableCardView.this.consentable;
                        if (consentable3 == null) {
                            e0.throwUninitializedPropertyAccessException("consentable");
                            consentable3 = null;
                        }
                        consentableListener.consentableStatusChanged(id2, consentable3.getType(), newStatus);
                    }
                    Consentable consentable4 = ConsentableCardView.this.consentable;
                    if (consentable4 == null) {
                        e0.throwUninitializedPropertyAccessException("consentable");
                    } else {
                        consentable = consentable4;
                    }
                    consentable.setStatus(newStatus);
                }
            });
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
