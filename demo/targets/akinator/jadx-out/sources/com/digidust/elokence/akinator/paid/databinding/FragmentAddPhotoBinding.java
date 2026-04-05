package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
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
public final class FragmentAddPhotoBinding implements a {
    public final AkinatorAddMagicButton customizeButtonLoadPicture;
    public final AkinatorAddMagicButton customizeButtonSendPicture;
    public final CheckBox customizeCheckBoxPseudo;
    public final TextView customizeLabelText;
    public final ProgressBar loadingBarAward;
    public final RelativeLayout mainLayout;
    public final ImageView proposalImage;
    private final RelativeLayout rootView;

    private FragmentAddPhotoBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, AkinatorAddMagicButton akinatorAddMagicButton2, CheckBox checkBox, TextView textView, ProgressBar progressBar, RelativeLayout relativeLayout2, ImageView imageView) {
        this.rootView = relativeLayout;
        this.customizeButtonLoadPicture = akinatorAddMagicButton;
        this.customizeButtonSendPicture = akinatorAddMagicButton2;
        this.customizeCheckBoxPseudo = checkBox;
        this.customizeLabelText = textView;
        this.loadingBarAward = progressBar;
        this.mainLayout = relativeLayout2;
        this.proposalImage = imageView;
    }

    public static FragmentAddPhotoBinding bind(View view) {
        int i10 = R.id.customizeButtonLoadPicture;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.customizeButtonLoadPicture);
        if (akinatorAddMagicButton != null) {
            i10 = R.id.customizeButtonSendPicture;
            AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.customizeButtonSendPicture);
            if (akinatorAddMagicButton2 != null) {
                i10 = R.id.customizeCheckBoxPseudo;
                CheckBox checkBox = (CheckBox) b.findChildViewById(view, R.id.customizeCheckBoxPseudo);
                if (checkBox != null) {
                    i10 = R.id.customizeLabelText;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.customizeLabelText);
                    if (textView != null) {
                        i10 = R.id.loadingBarAward;
                        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarAward);
                        if (progressBar != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i10 = R.id.proposalImage;
                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.proposalImage);
                            if (imageView != null) {
                                return new FragmentAddPhotoBinding(relativeLayout, akinatorAddMagicButton, akinatorAddMagicButton2, checkBox, textView, progressBar, relativeLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAddPhotoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddPhotoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_photo, viewGroup, false);
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
