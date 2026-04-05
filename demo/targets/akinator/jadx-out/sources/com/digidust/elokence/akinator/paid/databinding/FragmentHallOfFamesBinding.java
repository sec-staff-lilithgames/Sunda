package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.elokence.elokenceutils.AutoResizeTextView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentHallOfFamesBinding implements a {
    public final AutoResizeTextView blackDelay;
    public final ConstraintLayout blackLayout;
    public final View blackLayoutBack;
    public final AutoResizeTextView blackPerso;
    public final TextView blackPseudo;
    public final Guideline bottomBlack;
    public final Guideline bottomBlackDelay;
    public final Guideline bottomBlackPerso;
    public final Guideline bottomBlackPseudo;
    public final Guideline bottomGoldDelay;
    public final Guideline bottomGoldPerso;
    public final Guideline bottomGoldPseudo;
    public final Guideline bottomPlatinumDelay;
    public final Guideline bottomPlatinumPerso;
    public final Guideline bottomPlatinumPseudo;
    public final AutoResizeTextView goldDelay;
    public final ConstraintLayout goldLayout;
    public final View goldLayoutBack;
    public final AutoResizeTextView goldPerso;
    public final TextView goldPseudo;
    public final ImageView imageLauriers;
    public final ImageView imageLauriersFake;
    public final ConstraintLayout layoutHof;
    public final Guideline leftBlackDelay;
    public final Guideline leftGoldDelay;
    public final Guideline leftPlatinumDelay;
    public final Guideline leftPlatinumGuide;
    public final AutoResizeTextView platinumDelay;
    public final ConstraintLayout platinumLayout;
    public final View platinumLayoutBack;
    public final AutoResizeTextView platinumPerso;
    public final TextView platinumPseudo;
    public final Guideline rightBlackDelay;
    public final Guideline rightBlackPseudo;
    public final Guideline rightGoldDelay;
    public final Guideline rightGoldGuide;
    public final Guideline rightGoldPseudo;
    public final Guideline rightPlatinumDelay;
    public final Guideline rightPlatinumPseudo;
    private final ConstraintLayout rootView;
    public final Guideline space;
    public final Guideline top1pc;
    public final Guideline topBlackDelay;
    public final Guideline topBlackPerso;
    public final Guideline topBlackPseudo;
    public final Guideline topGoldDelay;
    public final Guideline topGoldPerso;
    public final Guideline topGoldPseudo;
    public final Guideline topPlatinumDelay;
    public final Guideline topPlatinumPerso;
    public final Guideline topPlatinumPseudo;

    private FragmentHallOfFamesBinding(ConstraintLayout constraintLayout, AutoResizeTextView autoResizeTextView, ConstraintLayout constraintLayout2, View view, AutoResizeTextView autoResizeTextView2, TextView textView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, Guideline guideline7, Guideline guideline8, Guideline guideline9, Guideline guideline10, AutoResizeTextView autoResizeTextView3, ConstraintLayout constraintLayout3, View view2, AutoResizeTextView autoResizeTextView4, TextView textView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout4, Guideline guideline11, Guideline guideline12, Guideline guideline13, Guideline guideline14, AutoResizeTextView autoResizeTextView5, ConstraintLayout constraintLayout5, View view3, AutoResizeTextView autoResizeTextView6, TextView textView3, Guideline guideline15, Guideline guideline16, Guideline guideline17, Guideline guideline18, Guideline guideline19, Guideline guideline20, Guideline guideline21, Guideline guideline22, Guideline guideline23, Guideline guideline24, Guideline guideline25, Guideline guideline26, Guideline guideline27, Guideline guideline28, Guideline guideline29, Guideline guideline30, Guideline guideline31, Guideline guideline32) {
        this.rootView = constraintLayout;
        this.blackDelay = autoResizeTextView;
        this.blackLayout = constraintLayout2;
        this.blackLayoutBack = view;
        this.blackPerso = autoResizeTextView2;
        this.blackPseudo = textView;
        this.bottomBlack = guideline;
        this.bottomBlackDelay = guideline2;
        this.bottomBlackPerso = guideline3;
        this.bottomBlackPseudo = guideline4;
        this.bottomGoldDelay = guideline5;
        this.bottomGoldPerso = guideline6;
        this.bottomGoldPseudo = guideline7;
        this.bottomPlatinumDelay = guideline8;
        this.bottomPlatinumPerso = guideline9;
        this.bottomPlatinumPseudo = guideline10;
        this.goldDelay = autoResizeTextView3;
        this.goldLayout = constraintLayout3;
        this.goldLayoutBack = view2;
        this.goldPerso = autoResizeTextView4;
        this.goldPseudo = textView2;
        this.imageLauriers = imageView;
        this.imageLauriersFake = imageView2;
        this.layoutHof = constraintLayout4;
        this.leftBlackDelay = guideline11;
        this.leftGoldDelay = guideline12;
        this.leftPlatinumDelay = guideline13;
        this.leftPlatinumGuide = guideline14;
        this.platinumDelay = autoResizeTextView5;
        this.platinumLayout = constraintLayout5;
        this.platinumLayoutBack = view3;
        this.platinumPerso = autoResizeTextView6;
        this.platinumPseudo = textView3;
        this.rightBlackDelay = guideline15;
        this.rightBlackPseudo = guideline16;
        this.rightGoldDelay = guideline17;
        this.rightGoldGuide = guideline18;
        this.rightGoldPseudo = guideline19;
        this.rightPlatinumDelay = guideline20;
        this.rightPlatinumPseudo = guideline21;
        this.space = guideline22;
        this.top1pc = guideline23;
        this.topBlackDelay = guideline24;
        this.topBlackPerso = guideline25;
        this.topBlackPseudo = guideline26;
        this.topGoldDelay = guideline27;
        this.topGoldPerso = guideline28;
        this.topGoldPseudo = guideline29;
        this.topPlatinumDelay = guideline30;
        this.topPlatinumPerso = guideline31;
        this.topPlatinumPseudo = guideline32;
    }

    public static FragmentHallOfFamesBinding bind(View view) {
        int i10 = R.id.blackDelay;
        AutoResizeTextView autoResizeTextView = (AutoResizeTextView) b.findChildViewById(view, R.id.blackDelay);
        if (autoResizeTextView != null) {
            i10 = R.id.blackLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, R.id.blackLayout);
            if (constraintLayout != null) {
                i10 = R.id.blackLayoutBack;
                View viewFindChildViewById = b.findChildViewById(view, R.id.blackLayoutBack);
                if (viewFindChildViewById != null) {
                    i10 = R.id.blackPerso;
                    AutoResizeTextView autoResizeTextView2 = (AutoResizeTextView) b.findChildViewById(view, R.id.blackPerso);
                    if (autoResizeTextView2 != null) {
                        i10 = R.id.blackPseudo;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.blackPseudo);
                        if (textView != null) {
                            i10 = R.id.bottom_black;
                            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_black);
                            if (guideline != null) {
                                i10 = R.id.bottom_black_delay;
                                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.bottom_black_delay);
                                if (guideline2 != null) {
                                    i10 = R.id.bottom_black_perso;
                                    Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.bottom_black_perso);
                                    if (guideline3 != null) {
                                        i10 = R.id.bottom_black_pseudo;
                                        Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.bottom_black_pseudo);
                                        if (guideline4 != null) {
                                            i10 = R.id.bottom_gold_delay;
                                            Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.bottom_gold_delay);
                                            if (guideline5 != null) {
                                                i10 = R.id.bottom_gold_perso;
                                                Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.bottom_gold_perso);
                                                if (guideline6 != null) {
                                                    i10 = R.id.bottom_gold_pseudo;
                                                    Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.bottom_gold_pseudo);
                                                    if (guideline7 != null) {
                                                        i10 = R.id.bottom_platinum_delay;
                                                        Guideline guideline8 = (Guideline) b.findChildViewById(view, R.id.bottom_platinum_delay);
                                                        if (guideline8 != null) {
                                                            i10 = R.id.bottom_platinum_perso;
                                                            Guideline guideline9 = (Guideline) b.findChildViewById(view, R.id.bottom_platinum_perso);
                                                            if (guideline9 != null) {
                                                                i10 = R.id.bottom_platinum_pseudo;
                                                                Guideline guideline10 = (Guideline) b.findChildViewById(view, R.id.bottom_platinum_pseudo);
                                                                if (guideline10 != null) {
                                                                    i10 = R.id.goldDelay;
                                                                    AutoResizeTextView autoResizeTextView3 = (AutoResizeTextView) b.findChildViewById(view, R.id.goldDelay);
                                                                    if (autoResizeTextView3 != null) {
                                                                        i10 = R.id.goldLayout;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.findChildViewById(view, R.id.goldLayout);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = R.id.goldLayoutBack;
                                                                            View viewFindChildViewById2 = b.findChildViewById(view, R.id.goldLayoutBack);
                                                                            if (viewFindChildViewById2 != null) {
                                                                                i10 = R.id.goldPerso;
                                                                                AutoResizeTextView autoResizeTextView4 = (AutoResizeTextView) b.findChildViewById(view, R.id.goldPerso);
                                                                                if (autoResizeTextView4 != null) {
                                                                                    i10 = R.id.goldPseudo;
                                                                                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.goldPseudo);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.imageLauriers;
                                                                                        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageLauriers);
                                                                                        if (imageView != null) {
                                                                                            i10 = R.id.imageLauriersFake;
                                                                                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageLauriersFake);
                                                                                            if (imageView2 != null) {
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                                                                i10 = R.id.left_black_delay;
                                                                                                Guideline guideline11 = (Guideline) b.findChildViewById(view, R.id.left_black_delay);
                                                                                                if (guideline11 != null) {
                                                                                                    i10 = R.id.left_gold_delay;
                                                                                                    Guideline guideline12 = (Guideline) b.findChildViewById(view, R.id.left_gold_delay);
                                                                                                    if (guideline12 != null) {
                                                                                                        i10 = R.id.left_platinum_delay;
                                                                                                        Guideline guideline13 = (Guideline) b.findChildViewById(view, R.id.left_platinum_delay);
                                                                                                        if (guideline13 != null) {
                                                                                                            i10 = R.id.left_platinum_guide;
                                                                                                            Guideline guideline14 = (Guideline) b.findChildViewById(view, R.id.left_platinum_guide);
                                                                                                            if (guideline14 != null) {
                                                                                                                i10 = R.id.platinumDelay;
                                                                                                                AutoResizeTextView autoResizeTextView5 = (AutoResizeTextView) b.findChildViewById(view, R.id.platinumDelay);
                                                                                                                if (autoResizeTextView5 != null) {
                                                                                                                    i10 = R.id.platinumLayout;
                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) b.findChildViewById(view, R.id.platinumLayout);
                                                                                                                    if (constraintLayout4 != null) {
                                                                                                                        i10 = R.id.platinumLayoutBack;
                                                                                                                        View viewFindChildViewById3 = b.findChildViewById(view, R.id.platinumLayoutBack);
                                                                                                                        if (viewFindChildViewById3 != null) {
                                                                                                                            i10 = R.id.platinumPerso;
                                                                                                                            AutoResizeTextView autoResizeTextView6 = (AutoResizeTextView) b.findChildViewById(view, R.id.platinumPerso);
                                                                                                                            if (autoResizeTextView6 != null) {
                                                                                                                                i10 = R.id.platinumPseudo;
                                                                                                                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.platinumPseudo);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    i10 = R.id.right_black_delay;
                                                                                                                                    Guideline guideline15 = (Guideline) b.findChildViewById(view, R.id.right_black_delay);
                                                                                                                                    if (guideline15 != null) {
                                                                                                                                        i10 = R.id.right_black_pseudo;
                                                                                                                                        Guideline guideline16 = (Guideline) b.findChildViewById(view, R.id.right_black_pseudo);
                                                                                                                                        if (guideline16 != null) {
                                                                                                                                            i10 = R.id.right_gold_delay;
                                                                                                                                            Guideline guideline17 = (Guideline) b.findChildViewById(view, R.id.right_gold_delay);
                                                                                                                                            if (guideline17 != null) {
                                                                                                                                                i10 = R.id.right_gold_guide;
                                                                                                                                                Guideline guideline18 = (Guideline) b.findChildViewById(view, R.id.right_gold_guide);
                                                                                                                                                if (guideline18 != null) {
                                                                                                                                                    i10 = R.id.right_gold_pseudo;
                                                                                                                                                    Guideline guideline19 = (Guideline) b.findChildViewById(view, R.id.right_gold_pseudo);
                                                                                                                                                    if (guideline19 != null) {
                                                                                                                                                        i10 = R.id.right_platinum_delay;
                                                                                                                                                        Guideline guideline20 = (Guideline) b.findChildViewById(view, R.id.right_platinum_delay);
                                                                                                                                                        if (guideline20 != null) {
                                                                                                                                                            i10 = R.id.right_platinum_pseudo;
                                                                                                                                                            Guideline guideline21 = (Guideline) b.findChildViewById(view, R.id.right_platinum_pseudo);
                                                                                                                                                            if (guideline21 != null) {
                                                                                                                                                                i10 = R.id.space;
                                                                                                                                                                Guideline guideline22 = (Guideline) b.findChildViewById(view, R.id.space);
                                                                                                                                                                if (guideline22 != null) {
                                                                                                                                                                    i10 = R.id.top_1pc;
                                                                                                                                                                    Guideline guideline23 = (Guideline) b.findChildViewById(view, R.id.top_1pc);
                                                                                                                                                                    if (guideline23 != null) {
                                                                                                                                                                        i10 = R.id.top_black_delay;
                                                                                                                                                                        Guideline guideline24 = (Guideline) b.findChildViewById(view, R.id.top_black_delay);
                                                                                                                                                                        if (guideline24 != null) {
                                                                                                                                                                            i10 = R.id.top_black_perso;
                                                                                                                                                                            Guideline guideline25 = (Guideline) b.findChildViewById(view, R.id.top_black_perso);
                                                                                                                                                                            if (guideline25 != null) {
                                                                                                                                                                                i10 = R.id.top_black_pseudo;
                                                                                                                                                                                Guideline guideline26 = (Guideline) b.findChildViewById(view, R.id.top_black_pseudo);
                                                                                                                                                                                if (guideline26 != null) {
                                                                                                                                                                                    i10 = R.id.top_gold_delay;
                                                                                                                                                                                    Guideline guideline27 = (Guideline) b.findChildViewById(view, R.id.top_gold_delay);
                                                                                                                                                                                    if (guideline27 != null) {
                                                                                                                                                                                        i10 = R.id.top_gold_perso;
                                                                                                                                                                                        Guideline guideline28 = (Guideline) b.findChildViewById(view, R.id.top_gold_perso);
                                                                                                                                                                                        if (guideline28 != null) {
                                                                                                                                                                                            i10 = R.id.top_gold_pseudo;
                                                                                                                                                                                            Guideline guideline29 = (Guideline) b.findChildViewById(view, R.id.top_gold_pseudo);
                                                                                                                                                                                            if (guideline29 != null) {
                                                                                                                                                                                                i10 = R.id.top_platinum_delay;
                                                                                                                                                                                                Guideline guideline30 = (Guideline) b.findChildViewById(view, R.id.top_platinum_delay);
                                                                                                                                                                                                if (guideline30 != null) {
                                                                                                                                                                                                    i10 = R.id.top_platinum_perso;
                                                                                                                                                                                                    Guideline guideline31 = (Guideline) b.findChildViewById(view, R.id.top_platinum_perso);
                                                                                                                                                                                                    if (guideline31 != null) {
                                                                                                                                                                                                        i10 = R.id.top_platinum_pseudo;
                                                                                                                                                                                                        Guideline guideline32 = (Guideline) b.findChildViewById(view, R.id.top_platinum_pseudo);
                                                                                                                                                                                                        if (guideline32 != null) {
                                                                                                                                                                                                            return new FragmentHallOfFamesBinding(constraintLayout3, autoResizeTextView, constraintLayout, viewFindChildViewById, autoResizeTextView2, textView, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, guideline8, guideline9, guideline10, autoResizeTextView3, constraintLayout2, viewFindChildViewById2, autoResizeTextView4, textView2, imageView, imageView2, constraintLayout3, guideline11, guideline12, guideline13, guideline14, autoResizeTextView5, constraintLayout4, viewFindChildViewById3, autoResizeTextView6, textView3, guideline15, guideline16, guideline17, guideline18, guideline19, guideline20, guideline21, guideline22, guideline23, guideline24, guideline25, guideline26, guideline27, guideline28, guideline29, guideline30, guideline31, guideline32);
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

    public static FragmentHallOfFamesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHallOfFamesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_hall_of_fames, viewGroup, false);
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
