package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityCreditsBinding implements a {
    public final ImageView backImage;
    public final RelativeLayout mainLayout;
    public final ImageView movieDatabaseLogo;
    public final RelativeLayout relativeBackButton;
    private final RelativeLayout rootView;
    public final TextView textData;
    public final TextView textDataExplicit;
    public final TextView textGraphics;
    public final TextView textGraphicsExplicit;
    public final TextView textIntroduction;
    public final TextView textLibraries;
    public final TextView textLibrariesExplicit;
    public final TextView textMusic;
    public final TextView textMusicExplicit;
    public final TextView textPhoto;
    public final TextView textPhotoExplicit;
    public final TextView textTitleCredit;
    public final RelativeLayout topTitle;

    private ActivityCreditsBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, RelativeLayout relativeLayout4) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.mainLayout = relativeLayout2;
        this.movieDatabaseLogo = imageView2;
        this.relativeBackButton = relativeLayout3;
        this.textData = textView;
        this.textDataExplicit = textView2;
        this.textGraphics = textView3;
        this.textGraphicsExplicit = textView4;
        this.textIntroduction = textView5;
        this.textLibraries = textView6;
        this.textLibrariesExplicit = textView7;
        this.textMusic = textView8;
        this.textMusicExplicit = textView9;
        this.textPhoto = textView10;
        this.textPhotoExplicit = textView11;
        this.textTitleCredit = textView12;
        this.topTitle = relativeLayout4;
    }

    public static ActivityCreditsBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.movieDatabaseLogo;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.movieDatabaseLogo);
            if (imageView2 != null) {
                i10 = R.id.relativeBackButton;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                if (relativeLayout2 != null) {
                    i10 = R.id.textData;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.textData);
                    if (textView != null) {
                        i10 = R.id.textDataExplicit;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textDataExplicit);
                        if (textView2 != null) {
                            i10 = R.id.textGraphics;
                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textGraphics);
                            if (textView3 != null) {
                                i10 = R.id.textGraphicsExplicit;
                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textGraphicsExplicit);
                                if (textView4 != null) {
                                    i10 = R.id.textIntroduction;
                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textIntroduction);
                                    if (textView5 != null) {
                                        i10 = R.id.textLibraries;
                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textLibraries);
                                        if (textView6 != null) {
                                            i10 = R.id.textLibrariesExplicit;
                                            TextView textView7 = (TextView) b.findChildViewById(view, R.id.textLibrariesExplicit);
                                            if (textView7 != null) {
                                                i10 = R.id.textMusic;
                                                TextView textView8 = (TextView) b.findChildViewById(view, R.id.textMusic);
                                                if (textView8 != null) {
                                                    i10 = R.id.textMusicExplicit;
                                                    TextView textView9 = (TextView) b.findChildViewById(view, R.id.textMusicExplicit);
                                                    if (textView9 != null) {
                                                        i10 = R.id.textPhoto;
                                                        TextView textView10 = (TextView) b.findChildViewById(view, R.id.textPhoto);
                                                        if (textView10 != null) {
                                                            i10 = R.id.textPhotoExplicit;
                                                            TextView textView11 = (TextView) b.findChildViewById(view, R.id.textPhotoExplicit);
                                                            if (textView11 != null) {
                                                                i10 = R.id.textTitleCredit;
                                                                TextView textView12 = (TextView) b.findChildViewById(view, R.id.textTitleCredit);
                                                                if (textView12 != null) {
                                                                    i10 = R.id.topTitle;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                                                    if (relativeLayout3 != null) {
                                                                        return new ActivityCreditsBinding(relativeLayout, imageView, relativeLayout, imageView2, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, relativeLayout3);
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

    public static ActivityCreditsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCreditsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_credits, viewGroup, false);
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
