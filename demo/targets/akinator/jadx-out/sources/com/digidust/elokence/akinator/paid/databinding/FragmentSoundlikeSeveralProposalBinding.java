package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentSoundlikeSeveralProposalBinding implements a {
    public final AkinatorAddMagicButton characterNotInListButton;
    public final ListView charactersList;
    public final TextView listCharactersTitle;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final AkinatorAddMagicButton validateButton;

    private FragmentSoundlikeSeveralProposalBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, ListView listView, TextView textView, RelativeLayout relativeLayout2, AkinatorAddMagicButton akinatorAddMagicButton2) {
        this.rootView = relativeLayout;
        this.characterNotInListButton = akinatorAddMagicButton;
        this.charactersList = listView;
        this.listCharactersTitle = textView;
        this.mainLayout = relativeLayout2;
        this.validateButton = akinatorAddMagicButton2;
    }

    public static FragmentSoundlikeSeveralProposalBinding bind(View view) {
        int i10 = R.id.characterNotInListButton;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.characterNotInListButton);
        if (akinatorAddMagicButton != null) {
            i10 = R.id.charactersList;
            ListView listView = (ListView) b.findChildViewById(view, R.id.charactersList);
            if (listView != null) {
                i10 = R.id.listCharactersTitle;
                TextView textView = (TextView) b.findChildViewById(view, R.id.listCharactersTitle);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.validateButton;
                    AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.validateButton);
                    if (akinatorAddMagicButton2 != null) {
                        return new FragmentSoundlikeSeveralProposalBinding(relativeLayout, akinatorAddMagicButton, listView, textView, relativeLayout, akinatorAddMagicButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeSeveralProposalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeSeveralProposalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_several_proposal, viewGroup, false);
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
