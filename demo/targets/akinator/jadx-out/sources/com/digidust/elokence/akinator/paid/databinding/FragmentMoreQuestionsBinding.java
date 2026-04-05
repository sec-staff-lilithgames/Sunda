package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorLoadingBar;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentMoreQuestionsBinding implements a {
    public final ImageView akinatorImage;
    public final TextView bulleText;
    public final Button dontknowQuestionButton;
    public final ImageView imageSubjectIconQuestion;
    public final RelativeLayout layoutAkinator;
    public final RelativeLayout layoutBulleQuestion;
    public final RelativeLayout layoutQCM;
    public final AkinatorLoadingBar loadingBar;
    public final RelativeLayout mainLayout;
    public final Button noQuestionButton;
    public final LinearLayout probablyButtons;
    public final Button probablyNotQuestionButton;
    public final Button probablyQuestionButton;
    private final RelativeLayout rootView;
    public final LinearLayout yesDontknowNoButtons;
    public final Button yesQuestionButton;
    public final RelativeLayout zoneBulle;

    private FragmentMoreQuestionsBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, Button button, ImageView imageView2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, AkinatorLoadingBar akinatorLoadingBar, RelativeLayout relativeLayout5, Button button2, LinearLayout linearLayout, Button button3, Button button4, LinearLayout linearLayout2, Button button5, RelativeLayout relativeLayout6) {
        this.rootView = relativeLayout;
        this.akinatorImage = imageView;
        this.bulleText = textView;
        this.dontknowQuestionButton = button;
        this.imageSubjectIconQuestion = imageView2;
        this.layoutAkinator = relativeLayout2;
        this.layoutBulleQuestion = relativeLayout3;
        this.layoutQCM = relativeLayout4;
        this.loadingBar = akinatorLoadingBar;
        this.mainLayout = relativeLayout5;
        this.noQuestionButton = button2;
        this.probablyButtons = linearLayout;
        this.probablyNotQuestionButton = button3;
        this.probablyQuestionButton = button4;
        this.yesDontknowNoButtons = linearLayout2;
        this.yesQuestionButton = button5;
        this.zoneBulle = relativeLayout6;
    }

    public static FragmentMoreQuestionsBinding bind(View view) {
        int i10 = R.id.akinatorImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
        if (imageView != null) {
            i10 = R.id.bulleText;
            TextView textView = (TextView) b.findChildViewById(view, R.id.bulleText);
            if (textView != null) {
                i10 = R.id.dontknowQuestionButton;
                Button button = (Button) b.findChildViewById(view, R.id.dontknowQuestionButton);
                if (button != null) {
                    i10 = R.id.imageSubjectIconQuestion;
                    ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageSubjectIconQuestion);
                    if (imageView2 != null) {
                        i10 = R.id.layoutAkinator;
                        RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                        if (relativeLayout != null) {
                            i10 = R.id.layoutBulleQuestion;
                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutBulleQuestion);
                            if (relativeLayout2 != null) {
                                i10 = R.id.layoutQCM;
                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutQCM);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.loadingBar;
                                    AkinatorLoadingBar akinatorLoadingBar = (AkinatorLoadingBar) b.findChildViewById(view, R.id.loadingBar);
                                    if (akinatorLoadingBar != null) {
                                        RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                        i10 = R.id.noQuestionButton;
                                        Button button2 = (Button) b.findChildViewById(view, R.id.noQuestionButton);
                                        if (button2 != null) {
                                            i10 = R.id.probablyButtons;
                                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.probablyButtons);
                                            if (linearLayout != null) {
                                                i10 = R.id.probablyNotQuestionButton;
                                                Button button3 = (Button) b.findChildViewById(view, R.id.probablyNotQuestionButton);
                                                if (button3 != null) {
                                                    i10 = R.id.probablyQuestionButton;
                                                    Button button4 = (Button) b.findChildViewById(view, R.id.probablyQuestionButton);
                                                    if (button4 != null) {
                                                        i10 = R.id.yesDontknowNoButtons;
                                                        LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.yesDontknowNoButtons);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.yesQuestionButton;
                                                            Button button5 = (Button) b.findChildViewById(view, R.id.yesQuestionButton);
                                                            if (button5 != null) {
                                                                i10 = R.id.zoneBulle;
                                                                RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.zoneBulle);
                                                                if (relativeLayout5 != null) {
                                                                    return new FragmentMoreQuestionsBinding(relativeLayout4, imageView, textView, button, imageView2, relativeLayout, relativeLayout2, relativeLayout3, akinatorLoadingBar, relativeLayout4, button2, linearLayout, button3, button4, linearLayout2, button5, relativeLayout5);
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

    public static FragmentMoreQuestionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMoreQuestionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_questions, viewGroup, false);
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
