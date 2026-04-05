package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityConnectBinding implements a {
    public final ImageView bandeauConnexion;
    public final AkinatorAddMagicButton connectButton;
    public final TextView connectText;
    public final TextView connexionText;
    public final EditText emailEditText;
    public final TextView explicationConnexionText;
    public final ImageView eyeButton;
    public final ProgressBar loadingBarConnect;
    public final RelativeLayout mainLayoutConnect;
    public final EditText passwordEditText;
    public final TextView passwordForgetText;
    public final RelativeLayout passwordLayout;
    private final RelativeLayout rootView;
    public final TextView textPopupComptePasActive;

    private ActivityConnectBinding(RelativeLayout relativeLayout, ImageView imageView, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView, TextView textView2, EditText editText, TextView textView3, ImageView imageView2, ProgressBar progressBar, RelativeLayout relativeLayout2, EditText editText2, TextView textView4, RelativeLayout relativeLayout3, TextView textView5) {
        this.rootView = relativeLayout;
        this.bandeauConnexion = imageView;
        this.connectButton = akinatorAddMagicButton;
        this.connectText = textView;
        this.connexionText = textView2;
        this.emailEditText = editText;
        this.explicationConnexionText = textView3;
        this.eyeButton = imageView2;
        this.loadingBarConnect = progressBar;
        this.mainLayoutConnect = relativeLayout2;
        this.passwordEditText = editText2;
        this.passwordForgetText = textView4;
        this.passwordLayout = relativeLayout3;
        this.textPopupComptePasActive = textView5;
    }

    public static ActivityConnectBinding bind(View view) {
        int i10 = R.id.bandeauConnexion;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.bandeauConnexion);
        if (imageView != null) {
            i10 = R.id.connectButton;
            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.connectButton);
            if (akinatorAddMagicButton != null) {
                i10 = R.id.connectText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.connectText);
                if (textView != null) {
                    i10 = R.id.connexionText;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.connexionText);
                    if (textView2 != null) {
                        i10 = R.id.emailEditText;
                        EditText editText = (EditText) b.findChildViewById(view, R.id.emailEditText);
                        if (editText != null) {
                            i10 = R.id.explicationConnexionText;
                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.explicationConnexionText);
                            if (textView3 != null) {
                                i10 = R.id.eyeButton;
                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.eyeButton);
                                if (imageView2 != null) {
                                    i10 = R.id.loadingBarConnect;
                                    ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarConnect);
                                    if (progressBar != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i10 = R.id.passwordEditText;
                                        EditText editText2 = (EditText) b.findChildViewById(view, R.id.passwordEditText);
                                        if (editText2 != null) {
                                            i10 = R.id.passwordForgetText;
                                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.passwordForgetText);
                                            if (textView4 != null) {
                                                i10 = R.id.passwordLayout;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.passwordLayout);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.textPopupComptePasActive;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textPopupComptePasActive);
                                                    if (textView5 != null) {
                                                        return new ActivityConnectBinding(relativeLayout, imageView, akinatorAddMagicButton, textView, textView2, editText, textView3, imageView2, progressBar, relativeLayout, editText2, textView4, relativeLayout2, textView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityConnectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityConnectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_connect, viewGroup, false);
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
