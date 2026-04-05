package com.sfbx.appconsentv3.ui.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.AppConsentTheme;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3ViewRejectButtonBinding;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m3.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RejectButtonView extends LinearLayoutCompat implements CompoundButton.OnCheckedChangeListener {
    private final o appConsentTheme$delegate;
    private final AppconsentV3ViewRejectButtonBinding binding;
    private RejectButtonListener rejectButtonListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface RejectButtonListener {
        void onClick(boolean z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RejectButtonView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final AppConsentTheme getAppConsentTheme() {
        return (AppConsentTheme) this.appConsentTheme$delegate.getValue();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        RejectButtonListener rejectButtonListener = this.rejectButtonListener;
        if (rejectButtonListener != null) {
            rejectButtonListener.onClick(z10);
        }
    }

    public final void reject(boolean z10) {
        if (z10) {
            this.binding.rejectCheckBox.setChecked(true);
        } else {
            this.binding.rejectCheckBox.setChecked(false);
        }
    }

    public final void setRejectButtonListener(RejectButtonListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.rejectButtonListener = listener;
    }

    public /* synthetic */ RejectButtonView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RejectButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.appConsentTheme$delegate = q.lazy(RejectButtonView$appConsentTheme$2.INSTANCE);
        AppconsentV3ViewRejectButtonBinding appconsentV3ViewRejectButtonBindingInflate = AppconsentV3ViewRejectButtonBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3ViewRejectButtonBindingInflate, "inflate(inflater, this, true)");
        this.binding = appconsentV3ViewRejectButtonBindingInflate;
        setBackgroundColor(a.getColor(context, R.color.transparent));
        appconsentV3ViewRejectButtonBindingInflate.rejectCheckBox.setOnCheckedChangeListener(this);
        appconsentV3ViewRejectButtonBindingInflate.rejectLabel.setText(getAppConsentTheme().getButtonOpposeLegint$appconsent_ui_v3_prodXchangeRelease());
        if (getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease() != a.getColor(context, com.sfbx.appconsentv3.ui.R.color.appconsent_v3_dark_blue)) {
            appconsentV3ViewRejectButtonBindingInflate.rejectLabel.setTextColor(getAppConsentTheme().getTextColor$appconsent_ui_v3_prodXchangeRelease());
        }
    }
}
