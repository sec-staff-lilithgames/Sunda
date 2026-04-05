package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class j extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public final i f29577b;

    /* renamed from: c, reason: collision with root package name */
    public int f29578c;

    /* renamed from: e, reason: collision with root package name */
    public final yg.j f29579e;

    public j(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            i iVar = this.f29577b;
            handler.removeCallbacks(iVar);
            handler.post(iVar);
        }
    }

    public void c() {
        androidx.constraintlayout.widget.k kVar = new androidx.constraintlayout.widget.k();
        kVar.clone(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f29578c * 0.66f) : this.f29578c;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                kVar.constrainCircle(((View) it.next()).getId(), R.id.circle_center, iRound, size);
                size += 360.0f / list.size();
            }
        }
        kVar.applyTo(this);
    }

    public int getRadius() {
        return this.f29578c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            i iVar = this.f29577b;
            handler.removeCallbacks(iVar);
            handler.post(iVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f29579e.setFillColor(ColorStateList.valueOf(i10));
    }

    public void setRadius(int i10) {
        this.f29578c = i10;
        c();
    }

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.material.timepicker.i] */
    public j(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        yg.j jVar = new yg.j();
        this.f29579e = jVar;
        jVar.setCornerSize(new yg.n(0.5f));
        this.f29579e.setFillColor(ColorStateList.valueOf(-1));
        setBackground(this.f29579e);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.G, i10, 0);
        this.f29578c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f29577b = new Runnable() { // from class: com.google.android.material.timepicker.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f29576b.c();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
