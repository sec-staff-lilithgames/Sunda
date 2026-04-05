package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemReportBinding implements a {
    public final LinearLayout layoutAnswerWrapper;
    public final LinearLayout layoutExpectedAnswer;
    public final LinearLayout layoutGivenAnswer;
    public final RelativeLayout layoutReportMain;
    public final TextView reportAnswer;
    public final TextView reportExpectedAnswerLabel;
    public final TextView reportExpectedAnswerResponse;
    public final TextView reportGivenAnswerResponse;
    private final RelativeLayout rootView;

    private ItemReportBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.layoutAnswerWrapper = linearLayout;
        this.layoutExpectedAnswer = linearLayout2;
        this.layoutGivenAnswer = linearLayout3;
        this.layoutReportMain = relativeLayout2;
        this.reportAnswer = textView;
        this.reportExpectedAnswerLabel = textView2;
        this.reportExpectedAnswerResponse = textView3;
        this.reportGivenAnswerResponse = textView4;
    }

    public static ItemReportBinding bind(View view) {
        int i10 = R.id.layoutAnswerWrapper;
        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutAnswerWrapper);
        if (linearLayout != null) {
            i10 = R.id.layoutExpectedAnswer;
            LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.layoutExpectedAnswer);
            if (linearLayout2 != null) {
                i10 = R.id.layoutGivenAnswer;
                LinearLayout linearLayout3 = (LinearLayout) b.findChildViewById(view, R.id.layoutGivenAnswer);
                if (linearLayout3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.reportAnswer;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.reportAnswer);
                    if (textView != null) {
                        i10 = R.id.report_expectedAnswerLabel;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.report_expectedAnswerLabel);
                        if (textView2 != null) {
                            i10 = R.id.report_expectedAnswerResponse;
                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.report_expectedAnswerResponse);
                            if (textView3 != null) {
                                i10 = R.id.report_givenAnswerResponse;
                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.report_givenAnswerResponse);
                                if (textView4 != null) {
                                    return new ItemReportBinding(relativeLayout, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_report, viewGroup, false);
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
