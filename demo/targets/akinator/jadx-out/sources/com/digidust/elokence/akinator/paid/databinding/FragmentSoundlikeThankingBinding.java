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
public final class FragmentSoundlikeThankingBinding implements a {
    public final AkinatorAddMagicButton buttonOk;
    public final RelativeLayout mainLayout;
    public final TextView remerciementText;
    private final RelativeLayout rootView;
    public final RelativeLayout soundLike3ContentContainer;

    private FragmentSoundlikeThankingBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, RelativeLayout relativeLayout2, TextView textView, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.buttonOk = akinatorAddMagicButton;
        this.mainLayout = relativeLayout2;
        this.remerciementText = textView;
        this.soundLike3ContentContainer = relativeLayout3;
    }

    public static FragmentSoundlikeThankingBinding bind(View view) {
        int i10 = R.id.buttonOk;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.buttonOk);
        if (akinatorAddMagicButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.remerciementText;
            TextView textView = (TextView) b.findChildViewById(view, R.id.remerciementText);
            if (textView != null) {
                i10 = R.id.soundLike3ContentContainer;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.soundLike3ContentContainer);
                if (relativeLayout2 != null) {
                    return new FragmentSoundlikeThankingBinding(relativeLayout, akinatorAddMagicButton, relativeLayout, textView, relativeLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeThankingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeThankingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_thanking, viewGroup, false);
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
