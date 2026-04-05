package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;
import com.digidust.elokence.akinator.graphic.vote.SwipeRelativeLayout;
import com.digidust.elokence.akinator.views.DarkAutoButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityVoteBinding implements a {
    public final TextView didacVote1;
    public final TextView didacVote2;
    public final TextView fakeLastVote;
    public final ImageView iconeReponse;
    public final DarkAutoButton imageFlecheDroite;
    public final LinearLayout layoutButtonsVote;
    public final LinearLayout layoutScore;
    public final SwipeRelativeLayout mainLayout;
    public final DarkAutoButton refaireTuto;
    public final ImageView retourButton;
    private final SwipeRelativeLayout rootView;
    public final TextView scoreVoteInt;
    public final TextView scoreVoteText;
    public final SwipeDeck swipeDeck;
    public final TextView textExplicatifVote;
    public final RelativeLayout viewDidacAnswer;
    public final AkinatorSmallButton vote;
    public final View voteNon;
    public final View voteNsp;
    public final View voteOui;
    public final RelativeLayout zoneExplicative;

    private ActivityVoteBinding(SwipeRelativeLayout swipeRelativeLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, DarkAutoButton darkAutoButton, LinearLayout linearLayout, LinearLayout linearLayout2, SwipeRelativeLayout swipeRelativeLayout2, DarkAutoButton darkAutoButton2, ImageView imageView2, TextView textView4, TextView textView5, SwipeDeck swipeDeck, TextView textView6, RelativeLayout relativeLayout, AkinatorSmallButton akinatorSmallButton, View view, View view2, View view3, RelativeLayout relativeLayout2) {
        this.rootView = swipeRelativeLayout;
        this.didacVote1 = textView;
        this.didacVote2 = textView2;
        this.fakeLastVote = textView3;
        this.iconeReponse = imageView;
        this.imageFlecheDroite = darkAutoButton;
        this.layoutButtonsVote = linearLayout;
        this.layoutScore = linearLayout2;
        this.mainLayout = swipeRelativeLayout2;
        this.refaireTuto = darkAutoButton2;
        this.retourButton = imageView2;
        this.scoreVoteInt = textView4;
        this.scoreVoteText = textView5;
        this.swipeDeck = swipeDeck;
        this.textExplicatifVote = textView6;
        this.viewDidacAnswer = relativeLayout;
        this.vote = akinatorSmallButton;
        this.voteNon = view;
        this.voteNsp = view2;
        this.voteOui = view3;
        this.zoneExplicative = relativeLayout2;
    }

    public static ActivityVoteBinding bind(View view) {
        int i10 = R.id.didacVote1;
        TextView textView = (TextView) b.findChildViewById(view, R.id.didacVote1);
        if (textView != null) {
            i10 = R.id.didacVote2;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.didacVote2);
            if (textView2 != null) {
                i10 = R.id.fakeLastVote;
                TextView textView3 = (TextView) b.findChildViewById(view, R.id.fakeLastVote);
                if (textView3 != null) {
                    i10 = R.id.iconeReponse;
                    ImageView imageView = (ImageView) b.findChildViewById(view, R.id.iconeReponse);
                    if (imageView != null) {
                        i10 = R.id.imageFlecheDroite;
                        DarkAutoButton darkAutoButton = (DarkAutoButton) b.findChildViewById(view, R.id.imageFlecheDroite);
                        if (darkAutoButton != null) {
                            i10 = R.id.layoutButtonsVote;
                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutButtonsVote);
                            if (linearLayout != null) {
                                i10 = R.id.layoutScore;
                                LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.layoutScore);
                                if (linearLayout2 != null) {
                                    SwipeRelativeLayout swipeRelativeLayout = (SwipeRelativeLayout) view;
                                    i10 = R.id.refaireTuto;
                                    DarkAutoButton darkAutoButton2 = (DarkAutoButton) b.findChildViewById(view, R.id.refaireTuto);
                                    if (darkAutoButton2 != null) {
                                        i10 = R.id.retourButton;
                                        ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.retourButton);
                                        if (imageView2 != null) {
                                            i10 = R.id.scoreVoteInt;
                                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.scoreVoteInt);
                                            if (textView4 != null) {
                                                i10 = R.id.scoreVoteText;
                                                TextView textView5 = (TextView) b.findChildViewById(view, R.id.scoreVoteText);
                                                if (textView5 != null) {
                                                    i10 = R.id.swipe_deck;
                                                    SwipeDeck swipeDeck = (SwipeDeck) b.findChildViewById(view, R.id.swipe_deck);
                                                    if (swipeDeck != null) {
                                                        i10 = R.id.textExplicatifVote;
                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textExplicatifVote);
                                                        if (textView6 != null) {
                                                            i10 = R.id.viewDidacAnswer;
                                                            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.viewDidacAnswer);
                                                            if (relativeLayout != null) {
                                                                i10 = R.id.vote;
                                                                AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.vote);
                                                                if (akinatorSmallButton != null) {
                                                                    i10 = R.id.voteNon;
                                                                    View viewFindChildViewById = b.findChildViewById(view, R.id.voteNon);
                                                                    if (viewFindChildViewById != null) {
                                                                        i10 = R.id.voteNsp;
                                                                        View viewFindChildViewById2 = b.findChildViewById(view, R.id.voteNsp);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i10 = R.id.voteOui;
                                                                            View viewFindChildViewById3 = b.findChildViewById(view, R.id.voteOui);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i10 = R.id.zoneExplicative;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.zoneExplicative);
                                                                                if (relativeLayout2 != null) {
                                                                                    return new ActivityVoteBinding(swipeRelativeLayout, textView, textView2, textView3, imageView, darkAutoButton, linearLayout, linearLayout2, swipeRelativeLayout, darkAutoButton2, imageView2, textView4, textView5, swipeDeck, textView6, relativeLayout, akinatorSmallButton, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, relativeLayout2);
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

    public static ActivityVoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vote, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public SwipeRelativeLayout getRoot() {
        return this.rootView;
    }
}
