package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f29190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f29191c;

    public q(s sVar, d0 d0Var) {
        this.f29191c = sVar;
        this.f29190b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s sVar = this.f29191c;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) sVar.f29199k.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        Calendar calendarA = j0.a(this.f29190b.f29166i.f29130b.f29146b);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        sVar.a(new Month(calendarA));
    }
}
