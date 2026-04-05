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
public final class FragmentSoundlikeRetryBinding implements a {
    public final AkinatorAddMagicButton finishedButton;
    public final RelativeLayout mainLayout;
    public final AkinatorAddMagicButton newSearchButton;
    public final TextView remerciementText;
    private final RelativeLayout rootView;
    public final RelativeLayout soundLike3ContentContainer;

    private FragmentSoundlikeRetryBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, RelativeLayout relativeLayout2, AkinatorAddMagicButton akinatorAddMagicButton2, TextView textView, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.finishedButton = akinatorAddMagicButton;
        this.mainLayout = relativeLayout2;
        this.newSearchButton = akinatorAddMagicButton2;
        this.remerciementText = textView;
        this.soundLike3ContentContainer = relativeLayout3;
    }

    public static FragmentSoundlikeRetryBinding bind(View view) {
        int i10 = R.id.finishedButton;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.finishedButton);
        if (akinatorAddMagicButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.newSearchButton;
            AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.newSearchButton);
            if (akinatorAddMagicButton2 != null) {
                i10 = R.id.remerciementText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.remerciementText);
                if (textView != null) {
                    i10 = R.id.soundLike3ContentContainer;
                    RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.soundLike3ContentContainer);
                    if (relativeLayout2 != null) {
                        return new FragmentSoundlikeRetryBinding(relativeLayout, akinatorAddMagicButton, relativeLayout, akinatorAddMagicButton2, textView, relativeLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeRetryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeRetryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_retry, viewGroup, false);
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
