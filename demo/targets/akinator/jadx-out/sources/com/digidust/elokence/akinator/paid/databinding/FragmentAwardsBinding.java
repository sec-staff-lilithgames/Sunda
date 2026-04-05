package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.elokence.elokenceutils.AutoResizeTextView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentAwardsBinding implements a {
    public final Button buttonShowBlackAwards;
    public final Button buttonShowGoldAwards;
    public final Button buttonShowPlatinumAwards;
    public final ConstraintLayout constraintDdj;
    public final Guideline decalageFirst;
    public final Guideline decalageFirstBonus;
    public final Guideline decalageFourth;
    public final Guideline decalageFourthBonus;
    public final Guideline decalageSecond;
    public final Guideline decalageSecondBonus;
    public final Guideline decalageThird;
    public final Guideline decalageThirdBonus;
    public final View fakeViewBronze;
    public final View fakeViewDDJ;
    public final View fakeViewDdjFull;
    public final View fakeViewSilver;
    public final View fakeViewStandard;
    public final ImageView imageNbBadgeBlack;
    public final ImageView imageNbBadgeBronze;
    public final ImageView imageNbBadgeDDJ;
    public final ImageView imageNbBadgeDdjFull;
    public final ImageView imageNbBadgeGold;
    public final ImageView imageNbBadgePlatinum;
    public final ImageView imageNbBadgeSilver;
    public final ImageView imageNbBadgeStandard;
    public final RelativeLayout layoutAwards;
    public final LinearLayout layoutAwardsDetails;
    public final RelativeLayout layoutBlack;
    public final RelativeLayout layoutBronze;
    public final RelativeLayout layoutPlatinum;
    public final RelativeLayout layoutSilver;
    public final ImageView layoutTitre;
    public final ProgressBar loadingBarAward;
    private final RelativeLayout rootView;
    public final AutoResizeTextView textNbBadgeBlack;
    public final AutoResizeTextView textNbBadgeBronze;
    public final AutoResizeTextView textNbBadgeDDJ;
    public final AutoResizeTextView textNbBadgeDdjFull;
    public final AutoResizeTextView textNbBadgeGold;
    public final AutoResizeTextView textNbBadgePlatinum;
    public final AutoResizeTextView textNbBadgeSilver;
    public final AutoResizeTextView textNbBadgeStandard;
    public final Button whatIsAkiAward;

    private FragmentAwardsBinding(RelativeLayout relativeLayout, Button button, Button button2, Button button3, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, Guideline guideline7, Guideline guideline8, View view, View view2, View view3, View view4, View view5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, ImageView imageView9, ProgressBar progressBar, AutoResizeTextView autoResizeTextView, AutoResizeTextView autoResizeTextView2, AutoResizeTextView autoResizeTextView3, AutoResizeTextView autoResizeTextView4, AutoResizeTextView autoResizeTextView5, AutoResizeTextView autoResizeTextView6, AutoResizeTextView autoResizeTextView7, AutoResizeTextView autoResizeTextView8, Button button4) {
        this.rootView = relativeLayout;
        this.buttonShowBlackAwards = button;
        this.buttonShowGoldAwards = button2;
        this.buttonShowPlatinumAwards = button3;
        this.constraintDdj = constraintLayout;
        this.decalageFirst = guideline;
        this.decalageFirstBonus = guideline2;
        this.decalageFourth = guideline3;
        this.decalageFourthBonus = guideline4;
        this.decalageSecond = guideline5;
        this.decalageSecondBonus = guideline6;
        this.decalageThird = guideline7;
        this.decalageThirdBonus = guideline8;
        this.fakeViewBronze = view;
        this.fakeViewDDJ = view2;
        this.fakeViewDdjFull = view3;
        this.fakeViewSilver = view4;
        this.fakeViewStandard = view5;
        this.imageNbBadgeBlack = imageView;
        this.imageNbBadgeBronze = imageView2;
        this.imageNbBadgeDDJ = imageView3;
        this.imageNbBadgeDdjFull = imageView4;
        this.imageNbBadgeGold = imageView5;
        this.imageNbBadgePlatinum = imageView6;
        this.imageNbBadgeSilver = imageView7;
        this.imageNbBadgeStandard = imageView8;
        this.layoutAwards = relativeLayout2;
        this.layoutAwardsDetails = linearLayout;
        this.layoutBlack = relativeLayout3;
        this.layoutBronze = relativeLayout4;
        this.layoutPlatinum = relativeLayout5;
        this.layoutSilver = relativeLayout6;
        this.layoutTitre = imageView9;
        this.loadingBarAward = progressBar;
        this.textNbBadgeBlack = autoResizeTextView;
        this.textNbBadgeBronze = autoResizeTextView2;
        this.textNbBadgeDDJ = autoResizeTextView3;
        this.textNbBadgeDdjFull = autoResizeTextView4;
        this.textNbBadgeGold = autoResizeTextView5;
        this.textNbBadgePlatinum = autoResizeTextView6;
        this.textNbBadgeSilver = autoResizeTextView7;
        this.textNbBadgeStandard = autoResizeTextView8;
        this.whatIsAkiAward = button4;
    }

    public static FragmentAwardsBinding bind(View view) {
        int i10 = R.id.buttonShowBlackAwards;
        Button button = (Button) b.findChildViewById(view, R.id.buttonShowBlackAwards);
        if (button != null) {
            i10 = R.id.buttonShowGoldAwards;
            Button button2 = (Button) b.findChildViewById(view, R.id.buttonShowGoldAwards);
            if (button2 != null) {
                i10 = R.id.buttonShowPlatinumAwards;
                Button button3 = (Button) b.findChildViewById(view, R.id.buttonShowPlatinumAwards);
                if (button3 != null) {
                    i10 = R.id.constraintDdj;
                    ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, R.id.constraintDdj);
                    if (constraintLayout != null) {
                        i10 = R.id.decalage_first;
                        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.decalage_first);
                        if (guideline != null) {
                            i10 = R.id.decalage_first_bonus;
                            Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.decalage_first_bonus);
                            if (guideline2 != null) {
                                i10 = R.id.decalage_fourth;
                                Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.decalage_fourth);
                                if (guideline3 != null) {
                                    i10 = R.id.decalage_fourth_bonus;
                                    Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.decalage_fourth_bonus);
                                    if (guideline4 != null) {
                                        i10 = R.id.decalage_second;
                                        Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.decalage_second);
                                        if (guideline5 != null) {
                                            i10 = R.id.decalage_second_bonus;
                                            Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.decalage_second_bonus);
                                            if (guideline6 != null) {
                                                i10 = R.id.decalage_third;
                                                Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.decalage_third);
                                                if (guideline7 != null) {
                                                    i10 = R.id.decalage_third_bonus;
                                                    Guideline guideline8 = (Guideline) b.findChildViewById(view, R.id.decalage_third_bonus);
                                                    if (guideline8 != null) {
                                                        i10 = R.id.fakeViewBronze;
                                                        View viewFindChildViewById = b.findChildViewById(view, R.id.fakeViewBronze);
                                                        if (viewFindChildViewById != null) {
                                                            i10 = R.id.fakeViewDDJ;
                                                            View viewFindChildViewById2 = b.findChildViewById(view, R.id.fakeViewDDJ);
                                                            if (viewFindChildViewById2 != null) {
                                                                i10 = R.id.fakeViewDdjFull;
                                                                View viewFindChildViewById3 = b.findChildViewById(view, R.id.fakeViewDdjFull);
                                                                if (viewFindChildViewById3 != null) {
                                                                    i10 = R.id.fakeViewSilver;
                                                                    View viewFindChildViewById4 = b.findChildViewById(view, R.id.fakeViewSilver);
                                                                    if (viewFindChildViewById4 != null) {
                                                                        i10 = R.id.fakeViewStandard;
                                                                        View viewFindChildViewById5 = b.findChildViewById(view, R.id.fakeViewStandard);
                                                                        if (viewFindChildViewById5 != null) {
                                                                            i10 = R.id.imageNbBadgeBlack;
                                                                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeBlack);
                                                                            if (imageView != null) {
                                                                                i10 = R.id.imageNbBadgeBronze;
                                                                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeBronze);
                                                                                if (imageView2 != null) {
                                                                                    i10 = R.id.imageNbBadgeDDJ;
                                                                                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeDDJ);
                                                                                    if (imageView3 != null) {
                                                                                        i10 = R.id.imageNbBadgeDdjFull;
                                                                                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeDdjFull);
                                                                                        if (imageView4 != null) {
                                                                                            i10 = R.id.imageNbBadgeGold;
                                                                                            ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeGold);
                                                                                            if (imageView5 != null) {
                                                                                                i10 = R.id.imageNbBadgePlatinum;
                                                                                                ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgePlatinum);
                                                                                                if (imageView6 != null) {
                                                                                                    i10 = R.id.imageNbBadgeSilver;
                                                                                                    ImageView imageView7 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeSilver);
                                                                                                    if (imageView7 != null) {
                                                                                                        i10 = R.id.imageNbBadgeStandard;
                                                                                                        ImageView imageView8 = (ImageView) b.findChildViewById(view, R.id.imageNbBadgeStandard);
                                                                                                        if (imageView8 != null) {
                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                                                            i10 = R.id.layoutAwardsDetails;
                                                                                                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutAwardsDetails);
                                                                                                            if (linearLayout != null) {
                                                                                                                i10 = R.id.layoutBlack;
                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutBlack);
                                                                                                                if (relativeLayout2 != null) {
                                                                                                                    i10 = R.id.layoutBronze;
                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutBronze);
                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                        i10 = R.id.layoutPlatinum;
                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.layoutPlatinum);
                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                            i10 = R.id.layoutSilver;
                                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.layoutSilver);
                                                                                                                            if (relativeLayout5 != null) {
                                                                                                                                i10 = R.id.layoutTitre;
                                                                                                                                ImageView imageView9 = (ImageView) b.findChildViewById(view, R.id.layoutTitre);
                                                                                                                                if (imageView9 != null) {
                                                                                                                                    i10 = R.id.loadingBarAward;
                                                                                                                                    ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarAward);
                                                                                                                                    if (progressBar != null) {
                                                                                                                                        i10 = R.id.textNbBadgeBlack;
                                                                                                                                        AutoResizeTextView autoResizeTextView = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeBlack);
                                                                                                                                        if (autoResizeTextView != null) {
                                                                                                                                            i10 = R.id.textNbBadgeBronze;
                                                                                                                                            AutoResizeTextView autoResizeTextView2 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeBronze);
                                                                                                                                            if (autoResizeTextView2 != null) {
                                                                                                                                                i10 = R.id.textNbBadgeDDJ;
                                                                                                                                                AutoResizeTextView autoResizeTextView3 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeDDJ);
                                                                                                                                                if (autoResizeTextView3 != null) {
                                                                                                                                                    i10 = R.id.textNbBadgeDdjFull;
                                                                                                                                                    AutoResizeTextView autoResizeTextView4 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeDdjFull);
                                                                                                                                                    if (autoResizeTextView4 != null) {
                                                                                                                                                        i10 = R.id.textNbBadgeGold;
                                                                                                                                                        AutoResizeTextView autoResizeTextView5 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeGold);
                                                                                                                                                        if (autoResizeTextView5 != null) {
                                                                                                                                                            i10 = R.id.textNbBadgePlatinum;
                                                                                                                                                            AutoResizeTextView autoResizeTextView6 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgePlatinum);
                                                                                                                                                            if (autoResizeTextView6 != null) {
                                                                                                                                                                i10 = R.id.textNbBadgeSilver;
                                                                                                                                                                AutoResizeTextView autoResizeTextView7 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeSilver);
                                                                                                                                                                if (autoResizeTextView7 != null) {
                                                                                                                                                                    i10 = R.id.textNbBadgeStandard;
                                                                                                                                                                    AutoResizeTextView autoResizeTextView8 = (AutoResizeTextView) b.findChildViewById(view, R.id.textNbBadgeStandard);
                                                                                                                                                                    if (autoResizeTextView8 != null) {
                                                                                                                                                                        i10 = R.id.whatIsAkiAward;
                                                                                                                                                                        Button button4 = (Button) b.findChildViewById(view, R.id.whatIsAkiAward);
                                                                                                                                                                        if (button4 != null) {
                                                                                                                                                                            return new FragmentAwardsBinding(relativeLayout, button, button2, button3, constraintLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, guideline8, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, imageView9, progressBar, autoResizeTextView, autoResizeTextView2, autoResizeTextView3, autoResizeTextView4, autoResizeTextView5, autoResizeTextView6, autoResizeTextView7, autoResizeTextView8, button4);
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

    public static FragmentAwardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAwardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_awards, viewGroup, false);
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
