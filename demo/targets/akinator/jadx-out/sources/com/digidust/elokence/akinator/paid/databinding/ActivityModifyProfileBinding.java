package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityModifyProfileBinding implements a {
    public final ImageView backImage;
    public final EditText firstEditText;
    public final ImageView firstEyeButton;
    public final LinearLayout linearLayoutCompte;
    public final TextView modifyText;
    public final RelativeLayout relativeBackButton;
    private final RelativeLayout rootView;
    public final TextView saveText;
    public final EditText secondEditText;
    public final ImageView secondEyeButton;
    public final TextView textFirstLabel;
    public final TextView textSecondLabel;
    public final RelativeLayout topTitle;

    private ActivityModifyProfileBinding(RelativeLayout relativeLayout, ImageView imageView, EditText editText, ImageView imageView2, LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout2, TextView textView2, EditText editText2, ImageView imageView3, TextView textView3, TextView textView4, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.firstEditText = editText;
        this.firstEyeButton = imageView2;
        this.linearLayoutCompte = linearLayout;
        this.modifyText = textView;
        this.relativeBackButton = relativeLayout2;
        this.saveText = textView2;
        this.secondEditText = editText2;
        this.secondEyeButton = imageView3;
        this.textFirstLabel = textView3;
        this.textSecondLabel = textView4;
        this.topTitle = relativeLayout3;
    }

    public static ActivityModifyProfileBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.firstEditText;
            EditText editText = (EditText) b.findChildViewById(view, R.id.firstEditText);
            if (editText != null) {
                i10 = R.id.firstEyeButton;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.firstEyeButton);
                if (imageView2 != null) {
                    i10 = R.id.linearLayoutCompte;
                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearLayoutCompte);
                    if (linearLayout != null) {
                        i10 = R.id.modifyText;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.modifyText);
                        if (textView != null) {
                            i10 = R.id.relativeBackButton;
                            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                            if (relativeLayout != null) {
                                i10 = R.id.saveText;
                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.saveText);
                                if (textView2 != null) {
                                    i10 = R.id.secondEditText;
                                    EditText editText2 = (EditText) b.findChildViewById(view, R.id.secondEditText);
                                    if (editText2 != null) {
                                        i10 = R.id.secondEyeButton;
                                        ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.secondEyeButton);
                                        if (imageView3 != null) {
                                            i10 = R.id.textFirstLabel;
                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textFirstLabel);
                                            if (textView3 != null) {
                                                i10 = R.id.textSecondLabel;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textSecondLabel);
                                                if (textView4 != null) {
                                                    i10 = R.id.topTitle;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                                    if (relativeLayout2 != null) {
                                                        return new ActivityModifyProfileBinding((RelativeLayout) view, imageView, editText, imageView2, linearLayout, textView, relativeLayout, textView2, editText2, imageView3, textView3, textView4, relativeLayout2);
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

    public static ActivityModifyProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityModifyProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_modify_profile, viewGroup, false);
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
