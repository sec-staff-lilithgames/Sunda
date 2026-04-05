package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorLoadingBar;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityQuestionBinding implements a {
    public final LayoutAdBannerBinding adBanner;
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final ImageView approvedImage;
    public final TextView approvedText;
    public final LinearLayout avoidedTrapGroup;
    public final ImageView backButtonImage;
    public final TextView bravoMessage;
    public final TextView bulleContinueText;
    public final TextView bulleProposalText1;
    public final TextView bulleProposalText2;
    public final TextView bulleProposalText3;
    public final TextView bulleText;
    public final TextView copyrightLabel;
    public final Button dontknowQuestionButton;
    public final TextView explicationPiege;
    public final LayoutGenizBinding genizLayout;
    public final Guideline guidelineBottomLimit;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView imageFiltreEnfantIngame;
    public final ImageView imageFond;
    public final ImageView imageSubjectIconQuestion;
    public final LinearLayout inTrapGroup;
    public final RelativeLayout layoutAkinator;
    public final ConstraintLayout layoutAnimatedAkinator;
    public final RelativeLayout layoutBulleQuestion;
    public final RelativeLayout layoutBulleQuestionQCM;
    public final RelativeLayout layoutOneCharacterFound;
    public final RelativeLayout layoutProposal;
    public final RelativeLayout layoutQCM;
    public final AkinatorLoadingBar loadingBar;
    public final ProgressBar loadingBarAward;
    public final ProgressBar loadingBarQuestions;
    public final LottieAnimationView lottieAnimationView;
    public final ConstraintLayout mainLayout;
    public final AkinatorSmallButton noProposalButton;
    public final Button noQuestionButton;
    public final AkinatorSmallButton okButton;
    public final View partageButton;
    public final LinearLayout probablyButtons;
    public final Button probablyNotQuestionButton;
    public final Button probablyQuestionButton;
    public final LinearLayout proposalButtons;
    public final LinearLayout proposalGroup;
    public final ImageView proposalImage;
    public final View proposalOverlay;
    public final TextView questionCounterText;
    public final ImageView rejectedImage;
    public final TextView rejectedText;
    public final AkinatorSmallButton replayButton;
    public final TextView reprimandText;
    private final ConstraintLayout rootView;
    public final ImageView virguleProposal;
    public final ImageView virguleQCM;
    public final LinearLayout yesDontknowNoButtons;
    public final AkinatorSmallButton yesProposalButton;
    public final Button yesQuestionButton;
    public final RelativeLayout zoneBulle;
    public final RelativeLayout zoneProposal;

    private ActivityQuestionBinding(ConstraintLayout constraintLayout, LayoutAdBannerBinding layoutAdBannerBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, LinearLayout linearLayout, ImageView imageView5, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, Button button, TextView textView9, LayoutGenizBinding layoutGenizBinding, Guideline guideline, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView6, ImageView imageView7, ImageView imageView8, LinearLayout linearLayout2, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, AkinatorLoadingBar akinatorLoadingBar, ProgressBar progressBar, ProgressBar progressBar2, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout3, AkinatorSmallButton akinatorSmallButton, Button button2, AkinatorSmallButton akinatorSmallButton2, View view, LinearLayout linearLayout3, Button button3, Button button4, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView9, View view2, TextView textView10, ImageView imageView10, TextView textView11, AkinatorSmallButton akinatorSmallButton3, TextView textView12, ImageView imageView11, ImageView imageView12, LinearLayout linearLayout6, AkinatorSmallButton akinatorSmallButton4, Button button5, RelativeLayout relativeLayout7, RelativeLayout relativeLayout8) {
        this.rootView = constraintLayout;
        this.adBanner = layoutAdBannerBinding;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.approvedImage = imageView4;
        this.approvedText = textView;
        this.avoidedTrapGroup = linearLayout;
        this.backButtonImage = imageView5;
        this.bravoMessage = textView2;
        this.bulleContinueText = textView3;
        this.bulleProposalText1 = textView4;
        this.bulleProposalText2 = textView5;
        this.bulleProposalText3 = textView6;
        this.bulleText = textView7;
        this.copyrightLabel = textView8;
        this.dontknowQuestionButton = button;
        this.explicationPiege = textView9;
        this.genizLayout = layoutGenizBinding;
        this.guidelineBottomLimit = guideline;
        this.homeButton = layoutHomeButtonBinding;
        this.imageFiltreEnfantIngame = imageView6;
        this.imageFond = imageView7;
        this.imageSubjectIconQuestion = imageView8;
        this.inTrapGroup = linearLayout2;
        this.layoutAkinator = relativeLayout;
        this.layoutAnimatedAkinator = constraintLayout2;
        this.layoutBulleQuestion = relativeLayout2;
        this.layoutBulleQuestionQCM = relativeLayout3;
        this.layoutOneCharacterFound = relativeLayout4;
        this.layoutProposal = relativeLayout5;
        this.layoutQCM = relativeLayout6;
        this.loadingBar = akinatorLoadingBar;
        this.loadingBarAward = progressBar;
        this.loadingBarQuestions = progressBar2;
        this.lottieAnimationView = lottieAnimationView;
        this.mainLayout = constraintLayout3;
        this.noProposalButton = akinatorSmallButton;
        this.noQuestionButton = button2;
        this.okButton = akinatorSmallButton2;
        this.partageButton = view;
        this.probablyButtons = linearLayout3;
        this.probablyNotQuestionButton = button3;
        this.probablyQuestionButton = button4;
        this.proposalButtons = linearLayout4;
        this.proposalGroup = linearLayout5;
        this.proposalImage = imageView9;
        this.proposalOverlay = view2;
        this.questionCounterText = textView10;
        this.rejectedImage = imageView10;
        this.rejectedText = textView11;
        this.replayButton = akinatorSmallButton3;
        this.reprimandText = textView12;
        this.virguleProposal = imageView11;
        this.virguleQCM = imageView12;
        this.yesDontknowNoButtons = linearLayout6;
        this.yesProposalButton = akinatorSmallButton4;
        this.yesQuestionButton = button5;
        this.zoneBulle = relativeLayout7;
        this.zoneProposal = relativeLayout8;
    }

    public static ActivityQuestionBinding bind(View view) {
        int i10 = R.id.adBanner;
        View viewFindChildViewById = b.findChildViewById(view, R.id.adBanner);
        if (viewFindChildViewById != null) {
            LayoutAdBannerBinding layoutAdBannerBindingBind = LayoutAdBannerBinding.bind(viewFindChildViewById);
            i10 = R.id.akinatorChapeau;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorChapeau);
            if (imageView != null) {
                i10 = R.id.akinatorImage;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
                if (imageView2 != null) {
                    i10 = R.id.akinatorTenue;
                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTenue);
                    if (imageView3 != null) {
                        i10 = R.id.approvedImage;
                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.approvedImage);
                        if (imageView4 != null) {
                            i10 = R.id.approvedText;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.approvedText);
                            if (textView != null) {
                                i10 = R.id.avoidedTrapGroup;
                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.avoidedTrapGroup);
                                if (linearLayout != null) {
                                    i10 = R.id.backButtonImage;
                                    ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.backButtonImage);
                                    if (imageView5 != null) {
                                        i10 = R.id.bravoMessage;
                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.bravoMessage);
                                        if (textView2 != null) {
                                            i10 = R.id.bulleContinueText;
                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.bulleContinueText);
                                            if (textView3 != null) {
                                                i10 = R.id.bulleProposalText1;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.bulleProposalText1);
                                                if (textView4 != null) {
                                                    i10 = R.id.bulleProposalText2;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.bulleProposalText2);
                                                    if (textView5 != null) {
                                                        i10 = R.id.bulleProposalText3;
                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.bulleProposalText3);
                                                        if (textView6 != null) {
                                                            i10 = R.id.bulleText;
                                                            TextView textView7 = (TextView) b.findChildViewById(view, R.id.bulleText);
                                                            if (textView7 != null) {
                                                                i10 = R.id.copyrightLabel;
                                                                TextView textView8 = (TextView) b.findChildViewById(view, R.id.copyrightLabel);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.dontknowQuestionButton;
                                                                    Button button = (Button) b.findChildViewById(view, R.id.dontknowQuestionButton);
                                                                    if (button != null) {
                                                                        i10 = R.id.explicationPiege;
                                                                        TextView textView9 = (TextView) b.findChildViewById(view, R.id.explicationPiege);
                                                                        if (textView9 != null) {
                                                                            i10 = R.id.genizLayout;
                                                                            View viewFindChildViewById2 = b.findChildViewById(view, R.id.genizLayout);
                                                                            if (viewFindChildViewById2 != null) {
                                                                                LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById2);
                                                                                i10 = R.id.guidelineBottomLimit;
                                                                                Guideline guideline = (Guideline) b.findChildViewById(view, R.id.guidelineBottomLimit);
                                                                                if (guideline != null) {
                                                                                    i10 = R.id.homeButton;
                                                                                    View viewFindChildViewById3 = b.findChildViewById(view, R.id.homeButton);
                                                                                    if (viewFindChildViewById3 != null) {
                                                                                        LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById3);
                                                                                        i10 = R.id.image_filtre_enfant_ingame;
                                                                                        ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.image_filtre_enfant_ingame);
                                                                                        if (imageView6 != null) {
                                                                                            i10 = R.id.imageFond;
                                                                                            ImageView imageView7 = (ImageView) b.findChildViewById(view, R.id.imageFond);
                                                                                            if (imageView7 != null) {
                                                                                                i10 = R.id.imageSubjectIconQuestion;
                                                                                                ImageView imageView8 = (ImageView) b.findChildViewById(view, R.id.imageSubjectIconQuestion);
                                                                                                if (imageView8 != null) {
                                                                                                    i10 = R.id.inTrapGroup;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.inTrapGroup);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i10 = R.id.layoutAkinator;
                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                                                                                                        if (relativeLayout != null) {
                                                                                                            i10 = R.id.layoutAnimatedAkinator;
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, R.id.layoutAnimatedAkinator);
                                                                                                            if (constraintLayout != null) {
                                                                                                                i10 = R.id.layoutBulleQuestion;
                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutBulleQuestion);
                                                                                                                if (relativeLayout2 != null) {
                                                                                                                    i10 = R.id.layoutBulleQuestionQCM;
                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutBulleQuestionQCM);
                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                        i10 = R.id.layoutOneCharacterFound;
                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.layoutOneCharacterFound);
                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                            i10 = R.id.layoutProposal;
                                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.layoutProposal);
                                                                                                                            if (relativeLayout5 != null) {
                                                                                                                                i10 = R.id.layoutQCM;
                                                                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) b.findChildViewById(view, R.id.layoutQCM);
                                                                                                                                if (relativeLayout6 != null) {
                                                                                                                                    i10 = R.id.loadingBar;
                                                                                                                                    AkinatorLoadingBar akinatorLoadingBar = (AkinatorLoadingBar) b.findChildViewById(view, R.id.loadingBar);
                                                                                                                                    if (akinatorLoadingBar != null) {
                                                                                                                                        i10 = R.id.loadingBarAward;
                                                                                                                                        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarAward);
                                                                                                                                        if (progressBar != null) {
                                                                                                                                            i10 = R.id.loadingBarQuestions;
                                                                                                                                            ProgressBar progressBar2 = (ProgressBar) b.findChildViewById(view, R.id.loadingBarQuestions);
                                                                                                                                            if (progressBar2 != null) {
                                                                                                                                                i10 = R.id.lottieAnimationView;
                                                                                                                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) b.findChildViewById(view, R.id.lottieAnimationView);
                                                                                                                                                if (lottieAnimationView != null) {
                                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                                                                                                    i10 = R.id.noProposalButton;
                                                                                                                                                    AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.noProposalButton);
                                                                                                                                                    if (akinatorSmallButton != null) {
                                                                                                                                                        i10 = R.id.noQuestionButton;
                                                                                                                                                        Button button2 = (Button) b.findChildViewById(view, R.id.noQuestionButton);
                                                                                                                                                        if (button2 != null) {
                                                                                                                                                            i10 = R.id.okButton;
                                                                                                                                                            AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
                                                                                                                                                            if (akinatorSmallButton2 != null) {
                                                                                                                                                                i10 = R.id.partageButton;
                                                                                                                                                                View viewFindChildViewById4 = b.findChildViewById(view, R.id.partageButton);
                                                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                                                    i10 = R.id.probablyButtons;
                                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) b.findChildViewById(view, R.id.probablyButtons);
                                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                                        i10 = R.id.probablyNotQuestionButton;
                                                                                                                                                                        Button button3 = (Button) b.findChildViewById(view, R.id.probablyNotQuestionButton);
                                                                                                                                                                        if (button3 != null) {
                                                                                                                                                                            i10 = R.id.probablyQuestionButton;
                                                                                                                                                                            Button button4 = (Button) b.findChildViewById(view, R.id.probablyQuestionButton);
                                                                                                                                                                            if (button4 != null) {
                                                                                                                                                                                i10 = R.id.proposalButtons;
                                                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) b.findChildViewById(view, R.id.proposalButtons);
                                                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                                                    i10 = R.id.proposalGroup;
                                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) b.findChildViewById(view, R.id.proposalGroup);
                                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                                        i10 = R.id.proposalImage;
                                                                                                                                                                                        ImageView imageView9 = (ImageView) b.findChildViewById(view, R.id.proposalImage);
                                                                                                                                                                                        if (imageView9 != null) {
                                                                                                                                                                                            i10 = R.id.proposalOverlay;
                                                                                                                                                                                            View viewFindChildViewById5 = b.findChildViewById(view, R.id.proposalOverlay);
                                                                                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                                                                                i10 = R.id.questionCounterText;
                                                                                                                                                                                                TextView textView10 = (TextView) b.findChildViewById(view, R.id.questionCounterText);
                                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                                    i10 = R.id.rejectedImage;
                                                                                                                                                                                                    ImageView imageView10 = (ImageView) b.findChildViewById(view, R.id.rejectedImage);
                                                                                                                                                                                                    if (imageView10 != null) {
                                                                                                                                                                                                        i10 = R.id.rejectedText;
                                                                                                                                                                                                        TextView textView11 = (TextView) b.findChildViewById(view, R.id.rejectedText);
                                                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                                                            i10 = R.id.replayButton;
                                                                                                                                                                                                            AkinatorSmallButton akinatorSmallButton3 = (AkinatorSmallButton) b.findChildViewById(view, R.id.replayButton);
                                                                                                                                                                                                            if (akinatorSmallButton3 != null) {
                                                                                                                                                                                                                i10 = R.id.reprimandText;
                                                                                                                                                                                                                TextView textView12 = (TextView) b.findChildViewById(view, R.id.reprimandText);
                                                                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                                                                    i10 = R.id.virguleProposal;
                                                                                                                                                                                                                    ImageView imageView11 = (ImageView) b.findChildViewById(view, R.id.virguleProposal);
                                                                                                                                                                                                                    if (imageView11 != null) {
                                                                                                                                                                                                                        i10 = R.id.virguleQCM;
                                                                                                                                                                                                                        ImageView imageView12 = (ImageView) b.findChildViewById(view, R.id.virguleQCM);
                                                                                                                                                                                                                        if (imageView12 != null) {
                                                                                                                                                                                                                            i10 = R.id.yesDontknowNoButtons;
                                                                                                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) b.findChildViewById(view, R.id.yesDontknowNoButtons);
                                                                                                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                                                                                                i10 = R.id.yesProposalButton;
                                                                                                                                                                                                                                AkinatorSmallButton akinatorSmallButton4 = (AkinatorSmallButton) b.findChildViewById(view, R.id.yesProposalButton);
                                                                                                                                                                                                                                if (akinatorSmallButton4 != null) {
                                                                                                                                                                                                                                    i10 = R.id.yesQuestionButton;
                                                                                                                                                                                                                                    Button button5 = (Button) b.findChildViewById(view, R.id.yesQuestionButton);
                                                                                                                                                                                                                                    if (button5 != null) {
                                                                                                                                                                                                                                        i10 = R.id.zoneBulle;
                                                                                                                                                                                                                                        RelativeLayout relativeLayout7 = (RelativeLayout) b.findChildViewById(view, R.id.zoneBulle);
                                                                                                                                                                                                                                        if (relativeLayout7 != null) {
                                                                                                                                                                                                                                            i10 = R.id.zoneProposal;
                                                                                                                                                                                                                                            RelativeLayout relativeLayout8 = (RelativeLayout) b.findChildViewById(view, R.id.zoneProposal);
                                                                                                                                                                                                                                            if (relativeLayout8 != null) {
                                                                                                                                                                                                                                                return new ActivityQuestionBinding(constraintLayout2, layoutAdBannerBindingBind, imageView, imageView2, imageView3, imageView4, textView, linearLayout, imageView5, textView2, textView3, textView4, textView5, textView6, textView7, textView8, button, textView9, layoutGenizBindingBind, guideline, layoutHomeButtonBindingBind, imageView6, imageView7, imageView8, linearLayout2, relativeLayout, constraintLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, akinatorLoadingBar, progressBar, progressBar2, lottieAnimationView, constraintLayout2, akinatorSmallButton, button2, akinatorSmallButton2, viewFindChildViewById4, linearLayout3, button3, button4, linearLayout4, linearLayout5, imageView9, viewFindChildViewById5, textView10, imageView10, textView11, akinatorSmallButton3, textView12, imageView11, imageView12, linearLayout6, akinatorSmallButton4, button5, relativeLayout7, relativeLayout8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_question, viewGroup, false);
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
