package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityOptionRareCharacterBinding implements a {
    public final ImageView bannierePersoRare;
    public final Button buttonInApp;
    public final Button buttonNo;
    public final Button buttonRewarded;
    public final Button buttonSondage;
    public final TextView freemiumPopularityDescriptionText;
    public final ImageView iconeThemeChoosen;
    public final LinearLayout layoutChoice;
    public final RelativeLayout mainLayout;
    public final TextView personnageRareBanniereText;
    public final RelativeLayout relativeTopIconeChoosen;
    private final RelativeLayout rootView;

    private ActivityOptionRareCharacterBinding(RelativeLayout relativeLayout, ImageView imageView, Button button, Button button2, Button button3, Button button4, TextView textView, ImageView imageView2, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView2, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.bannierePersoRare = imageView;
        this.buttonInApp = button;
        this.buttonNo = button2;
        this.buttonRewarded = button3;
        this.buttonSondage = button4;
        this.freemiumPopularityDescriptionText = textView;
        this.iconeThemeChoosen = imageView2;
        this.layoutChoice = linearLayout;
        this.mainLayout = relativeLayout2;
        this.personnageRareBanniereText = textView2;
        this.relativeTopIconeChoosen = relativeLayout3;
    }

    public static ActivityOptionRareCharacterBinding bind(View view) {
        int i10 = R.id.bannierePersoRare;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.bannierePersoRare);
        if (imageView != null) {
            i10 = R.id.buttonInApp;
            Button button = (Button) b.findChildViewById(view, R.id.buttonInApp);
            if (button != null) {
                i10 = R.id.buttonNo;
                Button button2 = (Button) b.findChildViewById(view, R.id.buttonNo);
                if (button2 != null) {
                    i10 = R.id.buttonRewarded;
                    Button button3 = (Button) b.findChildViewById(view, R.id.buttonRewarded);
                    if (button3 != null) {
                        i10 = R.id.buttonSondage;
                        Button button4 = (Button) b.findChildViewById(view, R.id.buttonSondage);
                        if (button4 != null) {
                            i10 = R.id.freemiumPopularityDescriptionText;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.freemiumPopularityDescriptionText);
                            if (textView != null) {
                                i10 = R.id.iconeThemeChoosen;
                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.iconeThemeChoosen);
                                if (imageView2 != null) {
                                    i10 = R.id.layoutChoice;
                                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutChoice);
                                    if (linearLayout != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i10 = R.id.personnageRareBanniereText;
                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.personnageRareBanniereText);
                                        if (textView2 != null) {
                                            i10 = R.id.relativeTopIconeChoosen;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.relativeTopIconeChoosen);
                                            if (relativeLayout2 != null) {
                                                return new ActivityOptionRareCharacterBinding(relativeLayout, imageView, button, button2, button3, button4, textView, imageView2, linearLayout, relativeLayout, textView2, relativeLayout2);
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

    public static ActivityOptionRareCharacterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOptionRareCharacterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_option_rare_character, viewGroup, false);
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
