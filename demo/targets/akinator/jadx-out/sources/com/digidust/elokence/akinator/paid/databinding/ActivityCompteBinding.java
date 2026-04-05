package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAccountButton;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityCompteBinding implements a {
    public final ImageView backImage;
    public final AkinatorAddMagicButton deconnexionButton;
    public final AkinatorAccountButton deleteAccountButton;
    public final LinearLayout linearLayoutCompte;
    public final RelativeLayout mainLayout;
    public final TextView paramCompteText;
    public final RelativeLayout relativeBackButton;
    public final RelativeLayout relativeLayoutEmail;
    public final RelativeLayout relativeLayoutPassword;
    private final RelativeLayout rootView;
    public final TextView saveText;
    public final TextView textEmail;
    public final TextView textNomLabel;
    public final TextView textPassword;
    public final RelativeLayout topTitle;
    public final EditText usernameEditText;

    private ActivityCompteBinding(RelativeLayout relativeLayout, ImageView imageView, AkinatorAddMagicButton akinatorAddMagicButton, AkinatorAccountButton akinatorAccountButton, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView2, TextView textView3, TextView textView4, TextView textView5, RelativeLayout relativeLayout6, EditText editText) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.deconnexionButton = akinatorAddMagicButton;
        this.deleteAccountButton = akinatorAccountButton;
        this.linearLayoutCompte = linearLayout;
        this.mainLayout = relativeLayout2;
        this.paramCompteText = textView;
        this.relativeBackButton = relativeLayout3;
        this.relativeLayoutEmail = relativeLayout4;
        this.relativeLayoutPassword = relativeLayout5;
        this.saveText = textView2;
        this.textEmail = textView3;
        this.textNomLabel = textView4;
        this.textPassword = textView5;
        this.topTitle = relativeLayout6;
        this.usernameEditText = editText;
    }

    public static ActivityCompteBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.deconnexionButton;
            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.deconnexionButton);
            if (akinatorAddMagicButton != null) {
                i10 = R.id.deleteAccountButton;
                AkinatorAccountButton akinatorAccountButton = (AkinatorAccountButton) b.findChildViewById(view, R.id.deleteAccountButton);
                if (akinatorAccountButton != null) {
                    i10 = R.id.linearLayoutCompte;
                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearLayoutCompte);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.paramCompteText;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.paramCompteText);
                        if (textView != null) {
                            i10 = R.id.relativeBackButton;
                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                            if (relativeLayout2 != null) {
                                i10 = R.id.relativeLayoutEmail;
                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.relativeLayoutEmail);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.relativeLayoutPassword;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.relativeLayoutPassword);
                                    if (relativeLayout4 != null) {
                                        i10 = R.id.saveText;
                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.saveText);
                                        if (textView2 != null) {
                                            i10 = R.id.textEmail;
                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textEmail);
                                            if (textView3 != null) {
                                                i10 = R.id.textNomLabel;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textNomLabel);
                                                if (textView4 != null) {
                                                    i10 = R.id.textPassword;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textPassword);
                                                    if (textView5 != null) {
                                                        i10 = R.id.topTitle;
                                                        RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                                        if (relativeLayout5 != null) {
                                                            i10 = R.id.usernameEditText;
                                                            EditText editText = (EditText) b.findChildViewById(view, R.id.usernameEditText);
                                                            if (editText != null) {
                                                                return new ActivityCompteBinding(relativeLayout, imageView, akinatorAddMagicButton, akinatorAccountButton, linearLayout, relativeLayout, textView, relativeLayout2, relativeLayout3, relativeLayout4, textView2, textView3, textView4, textView5, relativeLayout5, editText);
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

    public static ActivityCompteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCompteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_compte, viewGroup, false);
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
