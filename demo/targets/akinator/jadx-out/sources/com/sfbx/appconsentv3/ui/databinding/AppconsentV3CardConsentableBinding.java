package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.ConsentableCardView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3CardConsentableBinding implements a {
    public final View configCustomConsentableSeparator;
    public final ConsentableCardView cpConsentable;
    private final LinearLayoutCompat rootView;

    private AppconsentV3CardConsentableBinding(LinearLayoutCompat linearLayoutCompat, View view, ConsentableCardView consentableCardView) {
        this.rootView = linearLayoutCompat;
        this.configCustomConsentableSeparator = view;
        this.cpConsentable = consentableCardView;
    }

    public static AppconsentV3CardConsentableBinding bind(View view) {
        int i10 = R.id.config_custom_consentable_separator;
        View viewFindChildViewById = b.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.cp_consentable;
            ConsentableCardView consentableCardView = (ConsentableCardView) b.findChildViewById(view, i10);
            if (consentableCardView != null) {
                return new AppconsentV3CardConsentableBinding((LinearLayoutCompat) view, viewFindChildViewById, consentableCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3CardConsentableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardConsentableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_consentable, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
