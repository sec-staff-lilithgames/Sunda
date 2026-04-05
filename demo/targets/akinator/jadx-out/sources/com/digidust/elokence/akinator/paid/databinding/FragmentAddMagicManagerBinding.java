package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentAddMagicManagerBinding implements a {
    public final ImageView backgroundImage;
    public final LinearLayout buttonsPS;
    public final LayoutCloseAddmagicBinding closeAddMagic;
    public final FrameLayout containerFragmentAddMagic;
    public final AkinatorAddMagicButton precedant;
    private final RelativeLayout rootView;
    public final AkinatorAddMagicButton suivant;
    public final TextView titleCorrect;

    private FragmentAddMagicManagerBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LayoutCloseAddmagicBinding layoutCloseAddmagicBinding, FrameLayout frameLayout, AkinatorAddMagicButton akinatorAddMagicButton, AkinatorAddMagicButton akinatorAddMagicButton2, TextView textView) {
        this.rootView = relativeLayout;
        this.backgroundImage = imageView;
        this.buttonsPS = linearLayout;
        this.closeAddMagic = layoutCloseAddmagicBinding;
        this.containerFragmentAddMagic = frameLayout;
        this.precedant = akinatorAddMagicButton;
        this.suivant = akinatorAddMagicButton2;
        this.titleCorrect = textView;
    }

    public static FragmentAddMagicManagerBinding bind(View view) {
        int i10 = R.id.backgroundImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backgroundImage);
        if (imageView != null) {
            i10 = R.id.buttonsPS;
            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.buttonsPS);
            if (linearLayout != null) {
                i10 = R.id.closeAddMagic;
                View viewFindChildViewById = b.findChildViewById(view, R.id.closeAddMagic);
                if (viewFindChildViewById != null) {
                    LayoutCloseAddmagicBinding layoutCloseAddmagicBindingBind = LayoutCloseAddmagicBinding.bind(viewFindChildViewById);
                    i10 = R.id.containerFragmentAddMagic;
                    FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.containerFragmentAddMagic);
                    if (frameLayout != null) {
                        i10 = R.id.precedant;
                        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.precedant);
                        if (akinatorAddMagicButton != null) {
                            i10 = R.id.suivant;
                            AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.suivant);
                            if (akinatorAddMagicButton2 != null) {
                                i10 = R.id.titleCorrect;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.titleCorrect);
                                if (textView != null) {
                                    return new FragmentAddMagicManagerBinding((RelativeLayout) view, imageView, linearLayout, layoutCloseAddmagicBindingBind, frameLayout, akinatorAddMagicButton, akinatorAddMagicButton2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAddMagicManagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddMagicManagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_magic_manager, viewGroup, false);
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
