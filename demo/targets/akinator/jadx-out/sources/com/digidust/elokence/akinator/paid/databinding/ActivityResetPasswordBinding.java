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
public final class ActivityResetPasswordBinding implements a {
    public final ImageView backImage;
    public final ImageView eyeButton;
    public final LinearLayout linearLayoutCompte;
    public final TextView modifyText;
    public final EditText newPasswordEditText;
    public final RelativeLayout relativeBackButton;
    private final RelativeLayout rootView;
    public final TextView saveText;
    public final TextView textPassword;
    public final RelativeLayout topTitle;

    private ActivityResetPasswordBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, EditText editText, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.eyeButton = imageView2;
        this.linearLayoutCompte = linearLayout;
        this.modifyText = textView;
        this.newPasswordEditText = editText;
        this.relativeBackButton = relativeLayout2;
        this.saveText = textView2;
        this.textPassword = textView3;
        this.topTitle = relativeLayout3;
    }

    public static ActivityResetPasswordBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.eyeButton;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.eyeButton);
            if (imageView2 != null) {
                i10 = R.id.linearLayoutCompte;
                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearLayoutCompte);
                if (linearLayout != null) {
                    i10 = R.id.modifyText;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.modifyText);
                    if (textView != null) {
                        i10 = R.id.newPasswordEditText;
                        EditText editText = (EditText) b.findChildViewById(view, R.id.newPasswordEditText);
                        if (editText != null) {
                            i10 = R.id.relativeBackButton;
                            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                            if (relativeLayout != null) {
                                i10 = R.id.saveText;
                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.saveText);
                                if (textView2 != null) {
                                    i10 = R.id.textPassword;
                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.textPassword);
                                    if (textView3 != null) {
                                        i10 = R.id.topTitle;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                        if (relativeLayout2 != null) {
                                            return new ActivityResetPasswordBinding((RelativeLayout) view, imageView, imageView2, linearLayout, textView, editText, relativeLayout, textView2, textView3, relativeLayout2);
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

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_reset_password, viewGroup, false);
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
