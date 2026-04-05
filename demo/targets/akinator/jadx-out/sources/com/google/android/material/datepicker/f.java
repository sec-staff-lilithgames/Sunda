package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f29170f;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f29171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29172c;

    /* renamed from: e, reason: collision with root package name */
    public final int f29173e;

    static {
        f29170f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar calendarC = j0.c(null);
        this.f29171b = calendarC;
        this.f29172c = calendarC.getMaximum(7);
        this.f29173e = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f29172c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f29173e;
        int i12 = this.f29172c;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f29171b;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f29170f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    public Integer getItem(int i10) {
        int i11 = this.f29172c;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f29173e;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    public f(int i10) {
        Calendar calendarC = j0.c(null);
        this.f29171b = calendarC;
        this.f29172c = calendarC.getMaximum(7);
        this.f29173e = i10;
    }
}
