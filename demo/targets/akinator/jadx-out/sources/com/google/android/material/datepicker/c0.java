package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c0 extends RecyclerView.n {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f29162c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCalendarGridView f29163d;

    public c0(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f29162c = textView;
        z1.setAccessibilityHeading(textView, true);
        this.f29163d = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z10) {
            return;
        }
        textView.setVisibility(8);
    }
}
