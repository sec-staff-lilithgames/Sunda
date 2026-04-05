package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d0 extends RecyclerView.a {

    /* renamed from: i, reason: collision with root package name */
    public final CalendarConstraints f29166i;

    /* renamed from: j, reason: collision with root package name */
    public final DayViewDecorator f29167j;

    /* renamed from: k, reason: collision with root package name */
    public final k f29168k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29169l;

    public d0(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, k kVar) {
        Month month = calendarConstraints.f29130b;
        Month month2 = calendarConstraints.f29131c;
        Month month3 = calendarConstraints.f29133f;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f29169l = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * a0.f29153f) + (v.d(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f29166i = calendarConstraints;
        this.f29167j = dayViewDecorator;
        this.f29168k = kVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f29166i.f29136i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i10) {
        Calendar calendarA = j0.a(this.f29166i.f29130b.f29146b);
        calendarA.add(2, i10);
        return new Month(calendarA).f29146b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(c0 c0Var, int i10) {
        CalendarConstraints calendarConstraints = this.f29166i;
        Calendar calendarA = j0.a(calendarConstraints.f29130b.f29146b);
        calendarA.add(2, i10);
        Month month = new Month(calendarA);
        c0Var.f29162c.setText(month.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0Var.f29163d.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().f29155b)) {
            new a0(month, calendarConstraints, this.f29167j);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        materialCalendarGridView.setOnItemClickListener(new b0(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!v.d(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new c0(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.g(-1, this.f29169l));
        return new c0(linearLayout, true);
    }
}
