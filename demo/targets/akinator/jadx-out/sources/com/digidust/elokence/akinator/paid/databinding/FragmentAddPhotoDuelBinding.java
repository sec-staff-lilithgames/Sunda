package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentAddPhotoDuelBinding implements a {
    public final ImageView duelPhotoButtonValide1;
    public final ImageView duelPhotoButtonValide2;
    public final ImageView duelPhotoImage1;
    public final ImageView duelPhotoImage2;
    public final TextView duelPhotoTextNbVotes1;
    public final TextView duelPhotoTextNbVotes2;
    public final TextView duelPhotoTextProposePar1;
    public final TextView duelPhotoTextProposePar2;
    public final TextView duelPhotoTextVotes1;
    public final TextView duelPhotoTextVotes2;
    public final ProgressBar loadingBarAward;
    private final RelativeLayout rootView;
    public final TextView textNomPersonnage;
    public final TextView textQuelleMeilleurePhoto;

    private FragmentAddPhotoDuelBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ProgressBar progressBar, TextView textView7, TextView textView8) {
        this.rootView = relativeLayout;
        this.duelPhotoButtonValide1 = imageView;
        this.duelPhotoButtonValide2 = imageView2;
        this.duelPhotoImage1 = imageView3;
        this.duelPhotoImage2 = imageView4;
        this.duelPhotoTextNbVotes1 = textView;
        this.duelPhotoTextNbVotes2 = textView2;
        this.duelPhotoTextProposePar1 = textView3;
        this.duelPhotoTextProposePar2 = textView4;
        this.duelPhotoTextVotes1 = textView5;
        this.duelPhotoTextVotes2 = textView6;
        this.loadingBarAward = progressBar;
        this.textNomPersonnage = textView7;
        this.textQuelleMeilleurePhoto = textView8;
    }

    public static FragmentAddPhotoDuelBinding bind(View view) {
        int i10 = R.id.duelPhotoButtonValide1;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.duelPhotoButtonValide1);
        if (imageView != null) {
            i10 = R.id.duelPhotoButtonValide2;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.duelPhotoButtonValide2);
            if (imageView2 != null) {
                i10 = R.id.duelPhotoImage1;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.duelPhotoImage1);
                if (imageView3 != null) {
                    i10 = R.id.duelPhotoImage2;
                    ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.duelPhotoImage2);
                    if (imageView4 != null) {
                        i10 = R.id.duelPhotoTextNbVotes1;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.duelPhotoTextNbVotes1);
                        if (textView != null) {
                            i10 = R.id.duelPhotoTextNbVotes2;
                            TextView textView2 = (TextView) b.findChildViewById(view, R.id.duelPhotoTextNbVotes2);
                            if (textView2 != null) {
                                i10 = R.id.duelPhotoTextProposePar1;
                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.duelPhotoTextProposePar1);
                                if (textView3 != null) {
                                    i10 = R.id.duelPhotoTextProposePar2;
                                    TextView textView4 = (TextView) b.findChildViewById(view, R.id.duelPhotoTextProposePar2);
                                    if (textView4 != null) {
                                        i10 = R.id.duelPhotoTextVotes1;
                                        TextView textView5 = (TextView) b.findChildViewById(view, R.id.duelPhotoTextVotes1);
                                        if (textView5 != null) {
                                            i10 = R.id.duelPhotoTextVotes2;
                                            TextView textView6 = (TextView) b.findChildViewById(view, R.id.duelPhotoTextVotes2);
                                            if (textView6 != null) {
                                                i10 = R.id.loadingBarAward;
                                                ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarAward);
                                                if (progressBar != null) {
                                                    i10 = R.id.textNomPersonnage;
                                                    TextView textView7 = (TextView) b.findChildViewById(view, R.id.textNomPersonnage);
                                                    if (textView7 != null) {
                                                        i10 = R.id.textQuelleMeilleurePhoto;
                                                        TextView textView8 = (TextView) b.findChildViewById(view, R.id.textQuelleMeilleurePhoto);
                                                        if (textView8 != null) {
                                                            return new FragmentAddPhotoDuelBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, progressBar, textView7, textView8);
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

    public static FragmentAddPhotoDuelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddPhotoDuelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_photo_duel, viewGroup, false);
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
