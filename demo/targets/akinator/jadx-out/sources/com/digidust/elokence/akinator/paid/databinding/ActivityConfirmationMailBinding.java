package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityConfirmationMailBinding implements a {
    public final ImageView bandeauConnexion;
    public final TextView confirmationMailExplication;
    public final TextView confirmationMailLik;
    public final TextView confirmationMailTitle;
    public final ProgressBar loadingBarConnect;
    public final RelativeLayout mainLayoutInscription;
    private final RelativeLayout rootView;

    private ActivityConfirmationMailBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.bandeauConnexion = imageView;
        this.confirmationMailExplication = textView;
        this.confirmationMailLik = textView2;
        this.confirmationMailTitle = textView3;
        this.loadingBarConnect = progressBar;
        this.mainLayoutInscription = relativeLayout2;
    }

    public static ActivityConfirmationMailBinding bind(View view) {
        int i10 = R.id.bandeauConnexion;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.bandeauConnexion);
        if (imageView != null) {
            i10 = R.id.confirmationMailExplication;
            TextView textView = (TextView) b.findChildViewById(view, R.id.confirmationMailExplication);
            if (textView != null) {
                i10 = R.id.confirmationMailLik;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.confirmationMailLik);
                if (textView2 != null) {
                    i10 = R.id.confirmationMailTitle;
                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.confirmationMailTitle);
                    if (textView3 != null) {
                        i10 = R.id.loadingBarConnect;
                        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarConnect);
                        if (progressBar != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new ActivityConfirmationMailBinding(relativeLayout, imageView, textView, textView2, textView3, progressBar, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityConfirmationMailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityConfirmationMailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_confirmation_mail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
