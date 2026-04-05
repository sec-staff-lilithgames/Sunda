package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f29187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f29188b;

    public o(s sVar, d0 d0Var) {
        this.f29188b = sVar;
        this.f29187a = d0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        CalendarConstraints calendarConstraints = this.f29187a.f29166i;
        s sVar = this.f29188b;
        int iFindFirstVisibleItemPosition = i10 < 0 ? ((LinearLayoutManager) sVar.f29199k.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) sVar.f29199k.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarA = j0.a(calendarConstraints.f29130b.f29146b);
        calendarA.add(2, iFindFirstVisibleItemPosition);
        Month month = new Month(calendarA);
        sVar.f29195g = month;
        MaterialButton materialButton = sVar.f29204p;
        Calendar calendarA2 = j0.a(calendarConstraints.f29130b.f29146b);
        calendarA2.add(2, iFindFirstVisibleItemPosition);
        materialButton.setText(new Month(calendarA2).c());
        sVar.c(calendarConstraints.f29130b.d(month));
    }
}
