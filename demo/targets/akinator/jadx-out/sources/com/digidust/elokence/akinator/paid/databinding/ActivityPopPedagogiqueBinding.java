package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPopPedagogiqueBinding implements a {
    public final ImageView closePopUp;
    public final Guideline decalageColonneDroite;
    public final Guideline decalageColonneGauche;
    public final LayoutGenizBinding genizLayout;
    public final ImageView imageVideoTapJoy;
    public final LinearLayout layoutGetGz;
    public final LinearLayout layoutGetGzInapp;
    public final LinearLayout layoutGetGzTapjoy;
    public final RelativeLayout layoutPostPedagogique;
    private final RelativeLayout rootView;
    public final TextView textAwardBlackPoints;
    public final TextView textAwardBronzePoints;
    public final TextView textAwardDDJDesc;
    public final TextView textAwardDDJDescFull;
    public final TextView textAwardDDJFullPoints;
    public final TextView textAwardDDJPoints;
    public final TextView textAwardGoldPoints;
    public final TextView textAwardPlatinumPoints;
    public final TextView textAwardSilverPoints;
    public final TextView textAwardStandardPoints;
    public final TextView textBuyPack;
    public final TextView textDescription;
    public final TextView textObtenirAk;
    public final TextView textTimeBlack;
    public final TextView textTimeBronze;
    public final TextView textTimeGold;
    public final TextView textTimePlatinum;
    public final TextView textTimeSilver;
    public final TextView textTimeStandard;
    public final TextView textWatchVideo;
    public final TextView textWinAward;
    public final LinearLayout zone1;
    public final LinearLayout zone2;
    public final LinearLayout zone3;
    public final LinearLayout zone4;
    public final LinearLayout zone5;
    public final LinearLayout zone6;
    public final LinearLayout zone7;
    public final LinearLayout zone8;

    private ActivityPopPedagogiqueBinding(RelativeLayout relativeLayout, ImageView imageView, Guideline guideline, Guideline guideline2, LayoutGenizBinding layoutGenizBinding, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11) {
        this.rootView = relativeLayout;
        this.closePopUp = imageView;
        this.decalageColonneDroite = guideline;
        this.decalageColonneGauche = guideline2;
        this.genizLayout = layoutGenizBinding;
        this.imageVideoTapJoy = imageView2;
        this.layoutGetGz = linearLayout;
        this.layoutGetGzInapp = linearLayout2;
        this.layoutGetGzTapjoy = linearLayout3;
        this.layoutPostPedagogique = relativeLayout2;
        this.textAwardBlackPoints = textView;
        this.textAwardBronzePoints = textView2;
        this.textAwardDDJDesc = textView3;
        this.textAwardDDJDescFull = textView4;
        this.textAwardDDJFullPoints = textView5;
        this.textAwardDDJPoints = textView6;
        this.textAwardGoldPoints = textView7;
        this.textAwardPlatinumPoints = textView8;
        this.textAwardSilverPoints = textView9;
        this.textAwardStandardPoints = textView10;
        this.textBuyPack = textView11;
        this.textDescription = textView12;
        this.textObtenirAk = textView13;
        this.textTimeBlack = textView14;
        this.textTimeBronze = textView15;
        this.textTimeGold = textView16;
        this.textTimePlatinum = textView17;
        this.textTimeSilver = textView18;
        this.textTimeStandard = textView19;
        this.textWatchVideo = textView20;
        this.textWinAward = textView21;
        this.zone1 = linearLayout4;
        this.zone2 = linearLayout5;
        this.zone3 = linearLayout6;
        this.zone4 = linearLayout7;
        this.zone5 = linearLayout8;
        this.zone6 = linearLayout9;
        this.zone7 = linearLayout10;
        this.zone8 = linearLayout11;
    }

    public static ActivityPopPedagogiqueBinding bind(View view) {
        int i10 = R.id.closePopUp;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.closePopUp);
        if (imageView != null) {
            i10 = R.id.decalage_colonne_droite;
            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.decalage_colonne_droite);
            if (guideline != null) {
                i10 = R.id.decalage_colonne_gauche;
                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.decalage_colonne_gauche);
                if (guideline2 != null) {
                    i10 = R.id.genizLayout;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.genizLayout);
                    if (viewFindChildViewById != null) {
                        LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById);
                        i10 = R.id.imageVideoTapJoy;
                        ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageVideoTapJoy);
                        if (imageView2 != null) {
                            i10 = R.id.layoutGetGz;
                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutGetGz);
                            if (linearLayout != null) {
                                i10 = R.id.layoutGetGzInapp;
                                LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.layoutGetGzInapp);
                                if (linearLayout2 != null) {
                                    i10 = R.id.layoutGetGzTapjoy;
                                    LinearLayout linearLayout3 = (LinearLayout) b.findChildViewById(view, R.id.layoutGetGzTapjoy);
                                    if (linearLayout3 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i10 = R.id.textAwardBlackPoints;
                                        TextView textView = (TextView) b.findChildViewById(view, R.id.textAwardBlackPoints);
                                        if (textView != null) {
                                            i10 = R.id.textAwardBronzePoints;
                                            TextView textView2 = (TextView) b.findChildViewById(view, R.id.textAwardBronzePoints);
                                            if (textView2 != null) {
                                                i10 = R.id.textAwardDDJDesc;
                                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.textAwardDDJDesc);
                                                if (textView3 != null) {
                                                    i10 = R.id.textAwardDDJDescFull;
                                                    TextView textView4 = (TextView) b.findChildViewById(view, R.id.textAwardDDJDescFull);
                                                    if (textView4 != null) {
                                                        i10 = R.id.textAwardDDJFullPoints;
                                                        TextView textView5 = (TextView) b.findChildViewById(view, R.id.textAwardDDJFullPoints);
                                                        if (textView5 != null) {
                                                            i10 = R.id.textAwardDDJPoints;
                                                            TextView textView6 = (TextView) b.findChildViewById(view, R.id.textAwardDDJPoints);
                                                            if (textView6 != null) {
                                                                i10 = R.id.textAwardGoldPoints;
                                                                TextView textView7 = (TextView) b.findChildViewById(view, R.id.textAwardGoldPoints);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.textAwardPlatinumPoints;
                                                                    TextView textView8 = (TextView) b.findChildViewById(view, R.id.textAwardPlatinumPoints);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.textAwardSilverPoints;
                                                                        TextView textView9 = (TextView) b.findChildViewById(view, R.id.textAwardSilverPoints);
                                                                        if (textView9 != null) {
                                                                            i10 = R.id.textAwardStandardPoints;
                                                                            TextView textView10 = (TextView) b.findChildViewById(view, R.id.textAwardStandardPoints);
                                                                            if (textView10 != null) {
                                                                                i10 = R.id.textBuyPack;
                                                                                TextView textView11 = (TextView) b.findChildViewById(view, R.id.textBuyPack);
                                                                                if (textView11 != null) {
                                                                                    i10 = R.id.textDescription;
                                                                                    TextView textView12 = (TextView) b.findChildViewById(view, R.id.textDescription);
                                                                                    if (textView12 != null) {
                                                                                        i10 = R.id.textObtenirAk;
                                                                                        TextView textView13 = (TextView) b.findChildViewById(view, R.id.textObtenirAk);
                                                                                        if (textView13 != null) {
                                                                                            i10 = R.id.textTimeBlack;
                                                                                            TextView textView14 = (TextView) b.findChildViewById(view, R.id.textTimeBlack);
                                                                                            if (textView14 != null) {
                                                                                                i10 = R.id.textTimeBronze;
                                                                                                TextView textView15 = (TextView) b.findChildViewById(view, R.id.textTimeBronze);
                                                                                                if (textView15 != null) {
                                                                                                    i10 = R.id.textTimeGold;
                                                                                                    TextView textView16 = (TextView) b.findChildViewById(view, R.id.textTimeGold);
                                                                                                    if (textView16 != null) {
                                                                                                        i10 = R.id.textTimePlatinum;
                                                                                                        TextView textView17 = (TextView) b.findChildViewById(view, R.id.textTimePlatinum);
                                                                                                        if (textView17 != null) {
                                                                                                            i10 = R.id.textTimeSilver;
                                                                                                            TextView textView18 = (TextView) b.findChildViewById(view, R.id.textTimeSilver);
                                                                                                            if (textView18 != null) {
                                                                                                                i10 = R.id.textTimeStandard;
                                                                                                                TextView textView19 = (TextView) b.findChildViewById(view, R.id.textTimeStandard);
                                                                                                                if (textView19 != null) {
                                                                                                                    i10 = R.id.textWatchVideo;
                                                                                                                    TextView textView20 = (TextView) b.findChildViewById(view, R.id.textWatchVideo);
                                                                                                                    if (textView20 != null) {
                                                                                                                        i10 = R.id.textWinAward;
                                                                                                                        TextView textView21 = (TextView) b.findChildViewById(view, R.id.textWinAward);
                                                                                                                        if (textView21 != null) {
                                                                                                                            i10 = R.id.zone1;
                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) b.findChildViewById(view, R.id.zone1);
                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                i10 = R.id.zone2;
                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) b.findChildViewById(view, R.id.zone2);
                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                    i10 = R.id.zone3;
                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) b.findChildViewById(view, R.id.zone3);
                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                        i10 = R.id.zone4;
                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) b.findChildViewById(view, R.id.zone4);
                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                            i10 = R.id.zone5;
                                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) b.findChildViewById(view, R.id.zone5);
                                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                                i10 = R.id.zone6;
                                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) b.findChildViewById(view, R.id.zone6);
                                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                                    i10 = R.id.zone7;
                                                                                                                                                    LinearLayout linearLayout10 = (LinearLayout) b.findChildViewById(view, R.id.zone7);
                                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                                        i10 = R.id.zone8;
                                                                                                                                                        LinearLayout linearLayout11 = (LinearLayout) b.findChildViewById(view, R.id.zone8);
                                                                                                                                                        if (linearLayout11 != null) {
                                                                                                                                                            return new ActivityPopPedagogiqueBinding(relativeLayout, imageView, guideline, guideline2, layoutGenizBindingBind, imageView2, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11);
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

    public static ActivityPopPedagogiqueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPopPedagogiqueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pop_pedagogique, viewGroup, false);
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
