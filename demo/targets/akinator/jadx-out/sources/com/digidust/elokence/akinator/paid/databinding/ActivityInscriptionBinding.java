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
public final class ActivityInscriptionBinding implements a {
    public final ImageView bandeauConnexion;
    public final AkinatorAddMagicButton buttonContinueWithoutAccount;
    public final TextView connexionText;
    public final EditText emailEditText;
    public final TextView explicationConnexionText;
    public final ImageView eyeButton;
    public final TextView inscriptionText;
    public final RelativeLayout layoutTextBottom;
    public final ProgressBar loadingBarConnect;
    public final RelativeLayout mainLayoutInscription;
    public final EditText nameEditText;
    public final EditText passwordEditText;
    public final RelativeLayout passwordLayout;
    private final RelativeLayout rootView;
    public final AkinatorAddMagicButton sendButton;
    public final TextView textExplicationInscription;

    private ActivityInscriptionBinding(RelativeLayout relativeLayout, ImageView imageView, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView, EditText editText, TextView textView2, ImageView imageView2, TextView textView3, RelativeLayout relativeLayout2, ProgressBar progressBar, RelativeLayout relativeLayout3, EditText editText2, EditText editText3, RelativeLayout relativeLayout4, AkinatorAddMagicButton akinatorAddMagicButton2, TextView textView4) {
        this.rootView = relativeLayout;
        this.bandeauConnexion = imageView;
        this.buttonContinueWithoutAccount = akinatorAddMagicButton;
        this.connexionText = textView;
        this.emailEditText = editText;
        this.explicationConnexionText = textView2;
        this.eyeButton = imageView2;
        this.inscriptionText = textView3;
        this.layoutTextBottom = relativeLayout2;
        this.loadingBarConnect = progressBar;
        this.mainLayoutInscription = relativeLayout3;
        this.nameEditText = editText2;
        this.passwordEditText = editText3;
        this.passwordLayout = relativeLayout4;
        this.sendButton = akinatorAddMagicButton2;
        this.textExplicationInscription = textView4;
    }

    public static ActivityInscriptionBinding bind(View view) {
        int i10 = R.id.bandeauConnexion;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.bandeauConnexion);
        if (imageView != null) {
            i10 = R.id.buttonContinueWithoutAccount;
            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.buttonContinueWithoutAccount);
            if (akinatorAddMagicButton != null) {
                i10 = R.id.connexionText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.connexionText);
                if (textView != null) {
                    i10 = R.id.emailEditText;
                    EditText editText = (EditText) b.findChildViewById(view, R.id.emailEditText);
                    if (editText != null) {
                        i10 = R.id.explicationConnexionText;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.explicationConnexionText);
                        if (textView2 != null) {
                            i10 = R.id.eyeButton;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.eyeButton);
                            if (imageView2 != null) {
                                i10 = R.id.inscriptionText;
                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.inscriptionText);
                                if (textView3 != null) {
                                    i10 = R.id.layoutTextBottom;
                                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutTextBottom);
                                    if (relativeLayout != null) {
                                        i10 = R.id.loadingBarConnect;
                                        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarConnect);
                                        if (progressBar != null) {
                                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                            i10 = R.id.nameEditText;
                                            EditText editText2 = (EditText) b.findChildViewById(view, R.id.nameEditText);
                                            if (editText2 != null) {
                                                i10 = R.id.passwordEditText;
                                                EditText editText3 = (EditText) b.findChildViewById(view, R.id.passwordEditText);
                                                if (editText3 != null) {
                                                    i10 = R.id.passwordLayout;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.passwordLayout);
                                                    if (relativeLayout3 != null) {
                                                        i10 = R.id.sendButton;
                                                        AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.sendButton);
                                                        if (akinatorAddMagicButton2 != null) {
                                                            i10 = R.id.textExplicationInscription;
                                                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.textExplicationInscription);
                                                            if (textView4 != null) {
                                                                return new ActivityInscriptionBinding(relativeLayout2, imageView, akinatorAddMagicButton, textView, editText, textView2, imageView2, textView3, relativeLayout, progressBar, relativeLayout2, editText2, editText3, relativeLayout3, akinatorAddMagicButton2, textView4);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityInscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityInscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_inscription, viewGroup, false);
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
