package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorNormalButton;
import com.digidust.elokence.akinator.views.FireworksView;
import com.elokence.elokenceutils.AutoResizeTextView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityDefiDuJourBinding implements a {
    public final ImageView akinatorImage;
    public final Guideline bottomBandeauDefiGuide;
    public final Guideline bottomGuide;
    public final Guideline bottomTitleDefiGuide;
    public final AkinatorNormalButton cadeauRV;
    public final FrameLayout container;
    public final LayoutGenizBinding genizLayout;
    public final ImageView imageCharacterWon;
    public final ImageView imageFlecheDroite;
    public final ImageView imageTitre;
    public final ConstraintLayout imageTitreBandeau;
    public final RelativeLayout layoutAkinatorDefiOk;
    public final View layoutBlack;
    public final RelativeLayout layoutFireworks;
    public final LinearLayout layoutInfosFelicitations;
    public final RelativeLayout layoutOneCharacterFound;
    public final FireworksView layoutSurfaceView;
    public final Guideline leftGuide;
    public final LinearLayout listViewDefi;
    public final ConstraintLayout mainLayout;
    public final Button partageButton;
    public final TextView prochainGain;
    public final Guideline rightGuide;
    private final ConstraintLayout rootView;
    public final TextView textFelicitations;
    public final TextView textGz;
    public final TextView textRemporte;
    public final AutoResizeTextView titreDefi;
    public final Guideline topBandeauDefiGuide;
    public final Guideline topGuide;

    private ActivityDefiDuJourBinding(ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, AkinatorNormalButton akinatorNormalButton, FrameLayout frameLayout, LayoutGenizBinding layoutGenizBinding, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout, View view, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, FireworksView fireworksView, Guideline guideline4, LinearLayout linearLayout2, ConstraintLayout constraintLayout3, Button button, TextView textView, Guideline guideline5, TextView textView2, TextView textView3, TextView textView4, AutoResizeTextView autoResizeTextView, Guideline guideline6, Guideline guideline7) {
        this.rootView = constraintLayout;
        this.akinatorImage = imageView;
        this.bottomBandeauDefiGuide = guideline;
        this.bottomGuide = guideline2;
        this.bottomTitleDefiGuide = guideline3;
        this.cadeauRV = akinatorNormalButton;
        this.container = frameLayout;
        this.genizLayout = layoutGenizBinding;
        this.imageCharacterWon = imageView2;
        this.imageFlecheDroite = imageView3;
        this.imageTitre = imageView4;
        this.imageTitreBandeau = constraintLayout2;
        this.layoutAkinatorDefiOk = relativeLayout;
        this.layoutBlack = view;
        this.layoutFireworks = relativeLayout2;
        this.layoutInfosFelicitations = linearLayout;
        this.layoutOneCharacterFound = relativeLayout3;
        this.layoutSurfaceView = fireworksView;
        this.leftGuide = guideline4;
        this.listViewDefi = linearLayout2;
        this.mainLayout = constraintLayout3;
        this.partageButton = button;
        this.prochainGain = textView;
        this.rightGuide = guideline5;
        this.textFelicitations = textView2;
        this.textGz = textView3;
        this.textRemporte = textView4;
        this.titreDefi = autoResizeTextView;
        this.topBandeauDefiGuide = guideline6;
        this.topGuide = guideline7;
    }

    public static ActivityDefiDuJourBinding bind(View view) {
        int i10 = R.id.akinatorImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
        if (imageView != null) {
            i10 = R.id.bottom_bandeau_defi_guide;
            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_bandeau_defi_guide);
            if (guideline != null) {
                i10 = R.id.bottom_guide;
                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.bottom_guide);
                if (guideline2 != null) {
                    i10 = R.id.bottom_title_defi_guide;
                    Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.bottom_title_defi_guide);
                    if (guideline3 != null) {
                        i10 = R.id.cadeauRV;
                        AkinatorNormalButton akinatorNormalButton = (AkinatorNormalButton) b.findChildViewById(view, R.id.cadeauRV);
                        if (akinatorNormalButton != null) {
                            i10 = R.id.container;
                            FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.container);
                            if (frameLayout != null) {
                                i10 = R.id.genizLayout;
                                View viewFindChildViewById = b.findChildViewById(view, R.id.genizLayout);
                                if (viewFindChildViewById != null) {
                                    LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById);
                                    i10 = R.id.imageCharacterWon;
                                    ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageCharacterWon);
                                    if (imageView2 != null) {
                                        i10 = R.id.imageFlecheDroite;
                                        ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.imageFlecheDroite);
                                        if (imageView3 != null) {
                                            i10 = R.id.imageTitre;
                                            ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.imageTitre);
                                            if (imageView4 != null) {
                                                i10 = R.id.imageTitreBandeau;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, R.id.imageTitreBandeau);
                                                if (constraintLayout != null) {
                                                    i10 = R.id.layoutAkinatorDefiOk;
                                                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinatorDefiOk);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.layoutBlack;
                                                        View viewFindChildViewById2 = b.findChildViewById(view, R.id.layoutBlack);
                                                        if (viewFindChildViewById2 != null) {
                                                            i10 = R.id.layoutFireworks;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutFireworks);
                                                            if (relativeLayout2 != null) {
                                                                i10 = R.id.layoutInfosFelicitations;
                                                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutInfosFelicitations);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.layoutOneCharacterFound;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutOneCharacterFound);
                                                                    if (relativeLayout3 != null) {
                                                                        i10 = R.id.layoutSurfaceView;
                                                                        FireworksView fireworksView = (FireworksView) b.findChildViewById(view, R.id.layoutSurfaceView);
                                                                        if (fireworksView != null) {
                                                                            i10 = R.id.left_guide;
                                                                            Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.left_guide);
                                                                            if (guideline4 != null) {
                                                                                i10 = R.id.listViewDefi;
                                                                                LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.listViewDefi);
                                                                                if (linearLayout2 != null) {
                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                                    i10 = R.id.partageButton;
                                                                                    Button button = (Button) b.findChildViewById(view, R.id.partageButton);
                                                                                    if (button != null) {
                                                                                        i10 = R.id.prochainGain;
                                                                                        TextView textView = (TextView) b.findChildViewById(view, R.id.prochainGain);
                                                                                        if (textView != null) {
                                                                                            i10 = R.id.right_guide;
                                                                                            Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.right_guide);
                                                                                            if (guideline5 != null) {
                                                                                                i10 = R.id.textFelicitations;
                                                                                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textFelicitations);
                                                                                                if (textView2 != null) {
                                                                                                    i10 = R.id.textGz;
                                                                                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.textGz);
                                                                                                    if (textView3 != null) {
                                                                                                        i10 = R.id.textRemporte;
                                                                                                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.textRemporte);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = R.id.titreDefi;
                                                                                                            AutoResizeTextView autoResizeTextView = (AutoResizeTextView) b.findChildViewById(view, R.id.titreDefi);
                                                                                                            if (autoResizeTextView != null) {
                                                                                                                i10 = R.id.top_bandeau_defi_guide;
                                                                                                                Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.top_bandeau_defi_guide);
                                                                                                                if (guideline6 != null) {
                                                                                                                    i10 = R.id.top_guide;
                                                                                                                    Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.top_guide);
                                                                                                                    if (guideline7 != null) {
                                                                                                                        return new ActivityDefiDuJourBinding(constraintLayout2, imageView, guideline, guideline2, guideline3, akinatorNormalButton, frameLayout, layoutGenizBindingBind, imageView2, imageView3, imageView4, constraintLayout, relativeLayout, viewFindChildViewById2, relativeLayout2, linearLayout, relativeLayout3, fireworksView, guideline4, linearLayout2, constraintLayout2, button, textView, guideline5, textView2, textView3, textView4, autoResizeTextView, guideline6, guideline7);
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

    public static ActivityDefiDuJourBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDefiDuJourBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_defi_du_jour, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
