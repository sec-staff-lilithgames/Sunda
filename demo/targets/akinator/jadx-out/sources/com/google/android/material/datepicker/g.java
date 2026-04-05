package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f29175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f29176c;

    public g(s sVar, d0 d0Var) {
        this.f29176c = sVar;
        this.f29175b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s sVar = this.f29176c;
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) sVar.f29199k.getLayoutManager()).findLastVisibleItemPosition() - 1;
        Calendar calendarA = j0.a(this.f29175b.f29166i.f29130b.f29146b);
        calendarA.add(2, iFindLastVisibleItemPosition);
        sVar.a(new Month(calendarA));
    }
}
