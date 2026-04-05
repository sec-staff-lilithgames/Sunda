package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPostInscriptionBinding implements a {
    public final AkinatorAddMagicButton connectButton;
    public final TextView explicationPostInscriptionText;
    private final RelativeLayout rootView;

    private ActivityPostInscriptionBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView) {
        this.rootView = relativeLayout;
        this.connectButton = akinatorAddMagicButton;
        this.explicationPostInscriptionText = textView;
    }

    public static ActivityPostInscriptionBinding bind(View view) {
        int i10 = R.id.connectButton;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.connectButton);
        if (akinatorAddMagicButton != null) {
            i10 = R.id.explicationPostInscriptionText;
            TextView textView = (TextView) b.findChildViewById(view, R.id.explicationPostInscriptionText);
            if (textView != null) {
                return new ActivityPostInscriptionBinding((RelativeLayout) view, akinatorAddMagicButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPostInscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPostInscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_post_inscription, viewGroup, false);
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
