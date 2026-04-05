package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentSoundlikeDescriptionBinding implements a {
    public final RelativeLayout mainLayout;
    public final AkinatorAddMagicButton nextButton;
    public final AkinatorAddMagicButton previousButton;
    private final RelativeLayout rootView;
    public final RelativeLayout soundLike4ContentContainer;
    public final TextView soundlike4ContentText;
    public final TextView soundlike4FieldDescriptionText;
    public final EditText soundlike4FieldDescriptionValue;
    public final TextView soundlike4Message;

    private FragmentSoundlikeDescriptionBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AkinatorAddMagicButton akinatorAddMagicButton, AkinatorAddMagicButton akinatorAddMagicButton2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, EditText editText, TextView textView3) {
        this.rootView = relativeLayout;
        this.mainLayout = relativeLayout2;
        this.nextButton = akinatorAddMagicButton;
        this.previousButton = akinatorAddMagicButton2;
        this.soundLike4ContentContainer = relativeLayout3;
        this.soundlike4ContentText = textView;
        this.soundlike4FieldDescriptionText = textView2;
        this.soundlike4FieldDescriptionValue = editText;
        this.soundlike4Message = textView3;
    }

    public static FragmentSoundlikeDescriptionBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.nextButton;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.nextButton);
        if (akinatorAddMagicButton != null) {
            i10 = R.id.previousButton;
            AkinatorAddMagicButton akinatorAddMagicButton2 = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.previousButton);
            if (akinatorAddMagicButton2 != null) {
                i10 = R.id.soundLike4ContentContainer;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.soundLike4ContentContainer);
                if (relativeLayout2 != null) {
                    i10 = R.id.soundlike4ContentText;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.soundlike4ContentText);
                    if (textView != null) {
                        i10 = R.id.soundlike4FieldDescriptionText;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.soundlike4FieldDescriptionText);
                        if (textView2 != null) {
                            i10 = R.id.soundlike4FieldDescriptionValue;
                            EditText editText = (EditText) b.findChildViewById(view, R.id.soundlike4FieldDescriptionValue);
                            if (editText != null) {
                                i10 = R.id.soundlike4Message;
                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.soundlike4Message);
                                if (textView3 != null) {
                                    return new FragmentSoundlikeDescriptionBinding(relativeLayout, relativeLayout, akinatorAddMagicButton, akinatorAddMagicButton2, relativeLayout2, textView, textView2, editText, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_description, viewGroup, false);
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
