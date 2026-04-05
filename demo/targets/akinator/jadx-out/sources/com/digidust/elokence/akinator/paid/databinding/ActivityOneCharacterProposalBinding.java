package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityOneCharacterProposalBinding implements a {
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final View backButtonImage;
    public final RelativeLayout bulleProposal;
    public final TextView bulleProposalText1;
    public final TextView bulleProposalText2;
    public final TextView bulleProposalText3;
    public final FrameLayout container;
    public final TextView copyrightLabel;
    public final LayoutGenizBinding genizLayout;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView imageBackground;
    public final RelativeLayout layoutAkinator;
    public final RelativeLayout layoutOneCharacterFound;
    public final ProgressBar loadingBarAward;
    public final RelativeLayout mainLayout;
    public final AkinatorSmallButton noProposalButton;
    public final View partageButton;
    public final LinearLayout proposalButtons;
    public final ImageView proposalImage;
    public final AkinatorSmallButton replayButton;
    private final RelativeLayout rootView;
    public final ImageView virgule;
    public final AkinatorSmallButton yesProposalButton;
    public final RelativeLayout zoneProposal;

    private ActivityOneCharacterProposalBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, TextView textView4, LayoutGenizBinding layoutGenizBinding, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView4, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, ProgressBar progressBar, RelativeLayout relativeLayout5, AkinatorSmallButton akinatorSmallButton, View view2, LinearLayout linearLayout, ImageView imageView5, AkinatorSmallButton akinatorSmallButton2, ImageView imageView6, AkinatorSmallButton akinatorSmallButton3, RelativeLayout relativeLayout6) {
        this.rootView = relativeLayout;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.backButtonImage = view;
        this.bulleProposal = relativeLayout2;
        this.bulleProposalText1 = textView;
        this.bulleProposalText2 = textView2;
        this.bulleProposalText3 = textView3;
        this.container = frameLayout;
        this.copyrightLabel = textView4;
        this.genizLayout = layoutGenizBinding;
        this.homeButton = layoutHomeButtonBinding;
        this.imageBackground = imageView4;
        this.layoutAkinator = relativeLayout3;
        this.layoutOneCharacterFound = relativeLayout4;
        this.loadingBarAward = progressBar;
        this.mainLayout = relativeLayout5;
        this.noProposalButton = akinatorSmallButton;
        this.partageButton = view2;
        this.proposalButtons = linearLayout;
        this.proposalImage = imageView5;
        this.replayButton = akinatorSmallButton2;
        this.virgule = imageView6;
        this.yesProposalButton = akinatorSmallButton3;
        this.zoneProposal = relativeLayout6;
    }

    public static ActivityOneCharacterProposalBinding bind(View view) {
        int i10 = R.id.akinatorChapeau;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorChapeau);
        if (imageView != null) {
            i10 = R.id.akinatorImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
            if (imageView2 != null) {
                i10 = R.id.akinatorTenue;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTenue);
                if (imageView3 != null) {
                    i10 = R.id.backButtonImage;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.backButtonImage);
                    if (viewFindChildViewById != null) {
                        i10 = R.id.bulleProposal;
                        RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.bulleProposal);
                        if (relativeLayout != null) {
                            i10 = R.id.bulleProposalText1;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.bulleProposalText1);
                            if (textView != null) {
                                i10 = R.id.bulleProposalText2;
                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.bulleProposalText2);
                                if (textView2 != null) {
                                    i10 = R.id.bulleProposalText3;
                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.bulleProposalText3);
                                    if (textView3 != null) {
                                        i10 = R.id.container;
                                        FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.container);
                                        if (frameLayout != null) {
                                            i10 = R.id.copyrightLabel;
                                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.copyrightLabel);
                                            if (textView4 != null) {
                                                i10 = R.id.genizLayout;
                                                View viewFindChildViewById2 = b.findChildViewById(view, R.id.genizLayout);
                                                if (viewFindChildViewById2 != null) {
                                                    LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById2);
                                                    i10 = R.id.homeButton;
                                                    View viewFindChildViewById3 = b.findChildViewById(view, R.id.homeButton);
                                                    if (viewFindChildViewById3 != null) {
                                                        LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById3);
                                                        i10 = R.id.imageBackground;
                                                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.imageBackground);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.layoutAkinator;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                                                            if (relativeLayout2 != null) {
                                                                i10 = R.id.layoutOneCharacterFound;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutOneCharacterFound);
                                                                if (relativeLayout3 != null) {
                                                                    i10 = R.id.loadingBarAward;
                                                                    ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarAward);
                                                                    if (progressBar != null) {
                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                                                        i10 = R.id.noProposalButton;
                                                                        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.noProposalButton);
                                                                        if (akinatorSmallButton != null) {
                                                                            i10 = R.id.partageButton;
                                                                            View viewFindChildViewById4 = b.findChildViewById(view, R.id.partageButton);
                                                                            if (viewFindChildViewById4 != null) {
                                                                                i10 = R.id.proposalButtons;
                                                                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.proposalButtons);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.proposalImage;
                                                                                    ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.proposalImage);
                                                                                    if (imageView5 != null) {
                                                                                        i10 = R.id.replayButton;
                                                                                        AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.replayButton);
                                                                                        if (akinatorSmallButton2 != null) {
                                                                                            i10 = R.id.virgule;
                                                                                            ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.virgule);
                                                                                            if (imageView6 != null) {
                                                                                                i10 = R.id.yesProposalButton;
                                                                                                AkinatorSmallButton akinatorSmallButton3 = (AkinatorSmallButton) b.findChildViewById(view, R.id.yesProposalButton);
                                                                                                if (akinatorSmallButton3 != null) {
                                                                                                    i10 = R.id.zoneProposal;
                                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.zoneProposal);
                                                                                                    if (relativeLayout5 != null) {
                                                                                                        return new ActivityOneCharacterProposalBinding(relativeLayout4, imageView, imageView2, imageView3, viewFindChildViewById, relativeLayout, textView, textView2, textView3, frameLayout, textView4, layoutGenizBindingBind, layoutHomeButtonBindingBind, imageView4, relativeLayout2, relativeLayout3, progressBar, relativeLayout4, akinatorSmallButton, viewFindChildViewById4, linearLayout, imageView5, akinatorSmallButton2, imageView6, akinatorSmallButton3, relativeLayout5);
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

    public static ActivityOneCharacterProposalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOneCharacterProposalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_one_character_proposal, viewGroup, false);
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
