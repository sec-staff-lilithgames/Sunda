package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q1;
import com.google.android.material.button.MaterialButton;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class s<S> extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public int f29192c;

    /* renamed from: e, reason: collision with root package name */
    public CalendarConstraints f29193e;

    /* renamed from: f, reason: collision with root package name */
    public DayViewDecorator f29194f;

    /* renamed from: g, reason: collision with root package name */
    public Month f29195g;

    /* renamed from: h, reason: collision with root package name */
    public int f29196h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f29197i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f29198j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f29199k;

    /* renamed from: l, reason: collision with root package name */
    public View f29200l;

    /* renamed from: m, reason: collision with root package name */
    public View f29201m;

    /* renamed from: n, reason: collision with root package name */
    public View f29202n;

    /* renamed from: o, reason: collision with root package name */
    public View f29203o;

    /* renamed from: p, reason: collision with root package name */
    public MaterialButton f29204p;

    /* renamed from: q, reason: collision with root package name */
    public AccessibilityManager f29205q;

    public static <T> s<T> newInstance(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i10, calendarConstraints, null);
    }

    public final void a(Month month) {
        d0 d0Var = (d0) this.f29199k.getAdapter();
        int iD = d0Var.f29166i.f29130b.d(month);
        AccessibilityManager accessibilityManager = this.f29205q;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - d0Var.f29166i.f29130b.d(this.f29195g);
            boolean z10 = Math.abs(iD2) > 3;
            boolean z11 = iD2 > 0;
            this.f29195g = month;
            if (z10 && z11) {
                this.f29199k.scrollToPosition(iD - 3);
                this.f29199k.post(new h(this, iD));
            } else if (z10) {
                this.f29199k.scrollToPosition(iD + 3);
                this.f29199k.post(new h(this, iD));
            } else {
                this.f29199k.post(new h(this, iD));
            }
        } else {
            this.f29195g = month;
            this.f29199k.scrollToPosition(iD);
        }
        c(iD);
    }

    public boolean addOnSelectionChangedListener(e0 e0Var) {
        return this.f29174b.add(e0Var);
    }

    public final void b(int i10) {
        this.f29196h = i10;
        if (i10 == 2) {
            this.f29198j.getLayoutManager().scrollToPosition(this.f29195g.f29148e - ((l0) this.f29198j.getAdapter()).f29184i.f29193e.f29130b.f29148e);
            this.f29202n.setVisibility(0);
            this.f29203o.setVisibility(8);
            this.f29200l.setVisibility(8);
            this.f29201m.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f29202n.setVisibility(8);
            this.f29203o.setVisibility(0);
            this.f29200l.setVisibility(0);
            this.f29201m.setVisibility(0);
            a(this.f29195g);
        }
    }

    public final void c(int i10) {
        this.f29201m.setEnabled(i10 + 1 < this.f29199k.getAdapter().getItemCount());
        this.f29200l.setEnabled(i10 - 1 >= 0);
    }

    public DateSelector<S> getDateSelector() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f29192c = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f29193e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f29194f = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f29195g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f29192c);
        this.f29197i = new androidx.localbroadcastmanager.content.b(contextThemeWrapper, 3);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f29205q = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.f29193e.f29130b;
        if (v.d(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.digidust.elokence.akinator.freemium.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.digidust.elokence.akinator.freemium.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = a0.f29153f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.mtrl_calendar_days_of_week);
        z1.setAccessibilityDelegate(gridView, new i());
        int i13 = this.f29193e.f29134g;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new f(i13) : new f()));
        gridView.setNumColumns(month.f29149f);
        gridView.setEnabled(false);
        this.f29199k = (RecyclerView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.mtrl_calendar_months);
        this.f29199k.setLayoutManager(new j(this, getContext(), i11, i11));
        this.f29199k.setTag("MONTHS_VIEW_GROUP_TAG");
        d0 d0Var = new d0(contextThemeWrapper, this.f29193e, this.f29194f, new k(this));
        this.f29199k.setAdapter(d0Var);
        int integer = contextThemeWrapper.getResources().getInteger(com.digidust.elokence.akinator.freemium.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.mtrl_calendar_year_selector_frame);
        this.f29198j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f29198j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f29198j.setAdapter(new l0(this));
            this.f29198j.addItemDecoration(new m(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = d0Var.f29166i;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.month_navigation_fragment_toggle);
            this.f29204p = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            z1.setAccessibilityDelegate(this.f29204p, new n(this));
            View viewFindViewById2 = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.month_navigation_previous);
            this.f29200l = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.month_navigation_next);
            this.f29201m = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f29202n = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.mtrl_calendar_year_selector_frame);
            this.f29203o = viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.mtrl_calendar_day_selector_frame);
            b(1);
            this.f29204p.setText(this.f29195g.c());
            this.f29199k.addOnScrollListener(new o(this, d0Var));
            this.f29204p.setOnClickListener(new p(this));
            this.f29201m.setOnClickListener(new q(this, d0Var));
            this.f29200l.setOnClickListener(new g(this, d0Var));
            c(calendarConstraints.f29130b.d(this.f29195g));
        }
        if (!v.d(contextThemeWrapper, R.attr.windowFullscreen)) {
            new q1().attachToRecyclerView(this.f29199k);
        }
        this.f29199k.scrollToPosition(calendarConstraints.f29130b.d(this.f29195g));
        z1.setAccessibilityDelegate(this.f29199k, new l());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f29192c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f29193e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f29194f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f29195g);
    }

    public static <T> s<T> newInstance(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        s<T> sVar = new s<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f29133f);
        sVar.setArguments(bundle);
        return sVar;
    }
}
