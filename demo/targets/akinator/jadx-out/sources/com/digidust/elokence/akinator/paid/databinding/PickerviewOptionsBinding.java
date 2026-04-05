package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.pickerview.lib.WheelView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PickerviewOptionsBinding implements a {
    public final Button btnCancel;
    public final Button btnSubmit;
    public final WheelView options1;
    public final WheelView options2;
    public final WheelView options3;
    public final WheelView options4;
    public final WheelView options5;
    public final WheelView options6;
    public final LinearLayout optionspicker;
    private final LinearLayout rootView;
    public final TextView tvTitle;

    private PickerviewOptionsBinding(LinearLayout linearLayout, Button button, Button button2, WheelView wheelView, WheelView wheelView2, WheelView wheelView3, WheelView wheelView4, WheelView wheelView5, WheelView wheelView6, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.btnCancel = button;
        this.btnSubmit = button2;
        this.options1 = wheelView;
        this.options2 = wheelView2;
        this.options3 = wheelView3;
        this.options4 = wheelView4;
        this.options5 = wheelView5;
        this.options6 = wheelView6;
        this.optionspicker = linearLayout2;
        this.tvTitle = textView;
    }

    public static PickerviewOptionsBinding bind(View view) {
        int i10 = R.id.btnCancel;
        Button button = (Button) b.findChildViewById(view, R.id.btnCancel);
        if (button != null) {
            i10 = R.id.btnSubmit;
            Button button2 = (Button) b.findChildViewById(view, R.id.btnSubmit);
            if (button2 != null) {
                i10 = R.id.options1;
                WheelView wheelView = (WheelView) b.findChildViewById(view, R.id.options1);
                if (wheelView != null) {
                    i10 = R.id.options2;
                    WheelView wheelView2 = (WheelView) b.findChildViewById(view, R.id.options2);
                    if (wheelView2 != null) {
                        i10 = R.id.options3;
                        WheelView wheelView3 = (WheelView) b.findChildViewById(view, R.id.options3);
                        if (wheelView3 != null) {
                            i10 = R.id.options4;
                            WheelView wheelView4 = (WheelView) b.findChildViewById(view, R.id.options4);
                            if (wheelView4 != null) {
                                i10 = R.id.options5;
                                WheelView wheelView5 = (WheelView) b.findChildViewById(view, R.id.options5);
                                if (wheelView5 != null) {
                                    i10 = R.id.options6;
                                    WheelView wheelView6 = (WheelView) b.findChildViewById(view, R.id.options6);
                                    if (wheelView6 != null) {
                                        i10 = R.id.optionspicker;
                                        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.optionspicker);
                                        if (linearLayout != null) {
                                            i10 = R.id.tvTitle;
                                            TextView textView = (TextView) b.findChildViewById(view, R.id.tvTitle);
                                            if (textView != null) {
                                                return new PickerviewOptionsBinding((LinearLayout) view, button, button2, wheelView, wheelView2, wheelView3, wheelView4, wheelView5, wheelView6, linearLayout, textView);
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

    public static PickerviewOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PickerviewOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.pickerview_options, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
