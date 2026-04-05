package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b0 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f29158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f29159c;

    public b0(d0 d0Var, MaterialCalendarGridView materialCalendarGridView) {
        this.f29159c = d0Var;
        this.f29158b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f29158b;
        a0 adapter = materialCalendarGridView.getAdapter();
        if (i10 < adapter.a() || i10 > adapter.b()) {
            return;
        }
        this.f29159c.f29168k.onDayClick(materialCalendarGridView.getAdapter().getItem(i10).longValue());
    }
}
