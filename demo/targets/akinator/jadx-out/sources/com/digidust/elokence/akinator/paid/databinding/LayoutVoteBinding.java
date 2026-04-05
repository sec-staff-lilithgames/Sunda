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
public final class LayoutVoteBinding implements a {
    public final TextView currentVote;
    public final ImageView leftImage;
    public final RelativeLayout parent;
    public final TextView persoDescriptionVote;
    public final TextView persoNomVote;
    public final TextView persoTitreVote;
    public final ImageView rightImage;
    private final RelativeLayout rootView;
    public final TextView slashVote;
    public final TextView totalVote;

    private LayoutVoteBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6) {
        this.rootView = relativeLayout;
        this.currentVote = textView;
        this.leftImage = imageView;
        this.parent = relativeLayout2;
        this.persoDescriptionVote = textView2;
        this.persoNomVote = textView3;
        this.persoTitreVote = textView4;
        this.rightImage = imageView2;
        this.slashVote = textView5;
        this.totalVote = textView6;
    }

    public static LayoutVoteBinding bind(View view) {
        int i10 = R.id.currentVote;
        TextView textView = (TextView) b.findChildViewById(view, R.id.currentVote);
        if (textView != null) {
            i10 = R.id.left_image;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.left_image);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.persoDescriptionVote;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.persoDescriptionVote);
                if (textView2 != null) {
                    i10 = R.id.persoNomVote;
                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.persoNomVote);
                    if (textView3 != null) {
                        i10 = R.id.persoTitreVote;
                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.persoTitreVote);
                        if (textView4 != null) {
                            i10 = R.id.right_image;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.right_image);
                            if (imageView2 != null) {
                                i10 = R.id.slashVote;
                                TextView textView5 = (TextView) b.findChildViewById(view, R.id.slashVote);
                                if (textView5 != null) {
                                    i10 = R.id.totalVote;
                                    TextView textView6 = (TextView) b.findChildViewById(view, R.id.totalVote);
                                    if (textView6 != null) {
                                        return new LayoutVoteBinding(relativeLayout, textView, imageView, relativeLayout, textView2, textView3, textView4, imageView2, textView5, textView6);
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

    public static LayoutVoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_vote, viewGroup, false);
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
