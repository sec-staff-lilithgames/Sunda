package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a0 extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f29153f = j0.c(null).getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f29154g = (j0.c(null).getMaximum(7) + j0.c(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final Month f29155b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f29156c;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f29157e;

    public a0(Month month, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f29155b = month;
        this.f29157e = calendarConstraints;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f29157e.f29134g;
        Month month = this.f29155b;
        Calendar calendar = month.f29146b;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + month.f29149f : i11;
    }

    public final int b() {
        return (a() + this.f29155b.f29150g) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f29154g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f29155b.f29149f;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        throw null;
    }

    @Override // android.widget.Adapter
    public Long getItem(int i10) {
        if (i10 < a() || i10 > b()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = j0.a(this.f29155b.f29146b);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            androidx.localbroadcastmanager.content.b r1 = r4.f29156c
            if (r1 != 0) goto L10
            androidx.localbroadcastmanager.content.b r1 = new androidx.localbroadcastmanager.content.b
            r2 = 3
            r1.<init>(r0, r2)
            r4.f29156c = r1
        L10:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L28
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131624308(0x7f0e0174, float:1.8875792E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L28:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5e
            com.google.android.material.datepicker.Month r7 = r4.f29155b
            int r2 = r7.f29150g
            if (r6 < r2) goto L37
            goto L5e
        L37:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5e:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6d
            goto L6f
        L6d:
            if (r0 != 0) goto L70
        L6f:
            return r0
        L70:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.j0.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.a0.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
