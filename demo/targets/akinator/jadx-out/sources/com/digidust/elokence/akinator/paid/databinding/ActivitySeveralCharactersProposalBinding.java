package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorNormalButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivitySeveralCharactersProposalBinding implements a {
    public final AkinatorNormalButton characterNotInListButton;
    public final ListView charactersList;
    public final LayoutGenizBinding genizLayout;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView imageBackground;
    public final TextView listCharactersTitle;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final AkinatorNormalButton validateButton;

    private ActivitySeveralCharactersProposalBinding(RelativeLayout relativeLayout, AkinatorNormalButton akinatorNormalButton, ListView listView, LayoutGenizBinding layoutGenizBinding, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView, TextView textView, RelativeLayout relativeLayout2, AkinatorNormalButton akinatorNormalButton2) {
        this.rootView = relativeLayout;
        this.characterNotInListButton = akinatorNormalButton;
        this.charactersList = listView;
        this.genizLayout = layoutGenizBinding;
        this.homeButton = layoutHomeButtonBinding;
        this.imageBackground = imageView;
        this.listCharactersTitle = textView;
        this.mainLayout = relativeLayout2;
        this.validateButton = akinatorNormalButton2;
    }

    public static ActivitySeveralCharactersProposalBinding bind(View view) {
        int i10 = R.id.characterNotInListButton;
        AkinatorNormalButton akinatorNormalButton = (AkinatorNormalButton) b.findChildViewById(view, R.id.characterNotInListButton);
        if (akinatorNormalButton != null) {
            i10 = R.id.charactersList;
            ListView listView = (ListView) b.findChildViewById(view, R.id.charactersList);
            if (listView != null) {
                i10 = R.id.genizLayout;
                View viewFindChildViewById = b.findChildViewById(view, R.id.genizLayout);
                if (viewFindChildViewById != null) {
                    LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById);
                    i10 = R.id.homeButton;
                    View viewFindChildViewById2 = b.findChildViewById(view, R.id.homeButton);
                    if (viewFindChildViewById2 != null) {
                        LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById2);
                        i10 = R.id.imageBackground;
                        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageBackground);
                        if (imageView != null) {
                            i10 = R.id.listCharactersTitle;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.listCharactersTitle);
                            if (textView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i10 = R.id.validateButton;
                                AkinatorNormalButton akinatorNormalButton2 = (AkinatorNormalButton) b.findChildViewById(view, R.id.validateButton);
                                if (akinatorNormalButton2 != null) {
                                    return new ActivitySeveralCharactersProposalBinding(relativeLayout, akinatorNormalButton, listView, layoutGenizBindingBind, layoutHomeButtonBindingBind, imageView, textView, relativeLayout, akinatorNormalButton2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySeveralCharactersProposalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySeveralCharactersProposalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_several_characters_proposal, viewGroup, false);
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
