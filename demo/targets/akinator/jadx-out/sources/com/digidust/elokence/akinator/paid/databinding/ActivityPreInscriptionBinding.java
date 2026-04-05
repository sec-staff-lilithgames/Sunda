package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPreInscriptionBinding implements a {
    public final ImageView bandeauConnexion;
    public final AkinatorAddMagicButton continueButton;
    public final TextView inscriptionText;
    public final EditText nameEditText;
    private final RelativeLayout rootView;
    public final TextView textRenseignementPseudo;

    private ActivityPreInscriptionBinding(RelativeLayout relativeLayout, ImageView imageView, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView, EditText editText, TextView textView2) {
        this.rootView = relativeLayout;
        this.bandeauConnexion = imageView;
        this.continueButton = akinatorAddMagicButton;
        this.inscriptionText = textView;
        this.nameEditText = editText;
        this.textRenseignementPseudo = textView2;
    }

    public static ActivityPreInscriptionBinding bind(View view) {
        int i10 = R.id.bandeauConnexion;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.bandeauConnexion);
        if (imageView != null) {
            i10 = R.id.continueButton;
            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.continueButton);
            if (akinatorAddMagicButton != null) {
                i10 = R.id.inscriptionText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.inscriptionText);
                if (textView != null) {
                    i10 = R.id.nameEditText;
                    EditText editText = (EditText) b.findChildViewById(view, R.id.nameEditText);
                    if (editText != null) {
                        i10 = R.id.textRenseignementPseudo;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textRenseignementPseudo);
                        if (textView2 != null) {
                            return new ActivityPreInscriptionBinding((RelativeLayout) view, imageView, akinatorAddMagicButton, textView, editText, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPreInscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPreInscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pre_inscription, viewGroup, false);
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
