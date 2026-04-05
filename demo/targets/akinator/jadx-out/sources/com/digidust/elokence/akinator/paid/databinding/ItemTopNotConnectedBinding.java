package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemTopNotConnectedBinding implements a {
    public final AkinatorAddMagicButton createAccountButton;
    public final LinearLayout layoutTopNotConnected;
    private final LinearLayout rootView;
    public final TextView textConnexion;
    public final TextView textCreateAccount;
    public final TextView textPseudoNotConnected;
    public final TextView textTitlePseudo;

    private ItemTopNotConnectedBinding(LinearLayout linearLayout, AkinatorAddMagicButton akinatorAddMagicButton, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.createAccountButton = akinatorAddMagicButton;
        this.layoutTopNotConnected = linearLayout2;
        this.textConnexion = textView;
        this.textCreateAccount = textView2;
        this.textPseudoNotConnected = textView3;
        this.textTitlePseudo = textView4;
    }

    public static ItemTopNotConnectedBinding bind(View view) {
        int i10 = R.id.createAccountButton;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.createAccountButton);
        if (akinatorAddMagicButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = R.id.textConnexion;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textConnexion);
            if (textView != null) {
                i10 = R.id.textCreateAccount;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textCreateAccount);
                if (textView2 != null) {
                    i10 = R.id.textPseudoNotConnected;
                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.textPseudoNotConnected);
                    if (textView3 != null) {
                        i10 = R.id.textTitlePseudo;
                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.textTitlePseudo);
                        if (textView4 != null) {
                            return new ItemTopNotConnectedBinding(linearLayout, akinatorAddMagicButton, linearLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemTopNotConnectedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTopNotConnectedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_top_not_connected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
