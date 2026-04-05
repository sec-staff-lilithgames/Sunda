package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29145b;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a0 adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.a(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.b(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(getAdapter().b());
        } else if (i10 == 130) {
            setSelection(getAdapter().a());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().a() && selectedItemPosition <= getAdapter().b())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f29145b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof a0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), a0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.c(null);
        if (v.d(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.digidust.elokence.akinator.freemium.R.id.cancel_button);
            setNextFocusRightId(com.digidust.elokence.akinator.freemium.R.id.confirm_button);
        }
        this.f29145b = v.d(getContext(), com.digidust.elokence.akinator.freemium.R.attr.nestedScrollable);
        z1.setAccessibilityDelegate(this, new t());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public a0 getAdapter() {
        return (a0) super.getAdapter();
    }
}
