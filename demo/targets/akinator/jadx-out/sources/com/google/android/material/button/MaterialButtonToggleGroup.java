package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import bg.f;
import bg.h;
import bg.i;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.timepicker.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qg.j0;
import x3.z1;
import y3.c;
import y3.j;
import yg.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends f {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f29061t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f29062n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29063o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29064p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29065q;

    /* renamed from: r, reason: collision with root package name */
    public final int f29066r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet f29067s;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private String getChildrenA11yClassName() {
        return (this.f29064p ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && getChildAt(i11).getVisibility() != 8) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public void addOnButtonCheckedListener(i iVar) {
        this.f29062n.add(iVar);
    }

    @Override // bg.f, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        z1.setAccessibilityDelegate(materialButton, new h(this));
    }

    public void check(int i10) {
        f(i10, true);
    }

    public void clearChecked() {
        g(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.f29062n.clear();
    }

    public final void f(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f29067s);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f29064p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f29065q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f29067s;
        this.f29067s = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f29063o = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f29063o = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                boolean zContains2 = set.contains(Integer.valueOf(id2));
                Iterator it = this.f29062n.iterator();
                while (it.hasNext()) {
                    ((m) ((i) it.next())).onButtonChecked(this, id2, zContains2);
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f29064p || this.f29067s.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f29067s.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f29067s.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public boolean isSelectionRequired() {
        return this.f29065q;
    }

    public boolean isSingleSelection() {
        return this.f29064p;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f29066r;
        if (i10 != -1) {
            g(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.wrap(accessibilityNodeInfo).setCollectionInfo(j.obtain(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    public void removeOnButtonCheckedListener(i iVar) {
        this.f29062n.remove(iVar);
    }

    public void setSelectionRequired(boolean z10) {
        this.f29065q = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f29064p != z10) {
            this.f29064p = z10;
            clearChecked();
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void uncheck(int i10) {
        f(i10, false);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i10);
        this.f29062n = new LinkedHashSet();
        this.f29063o = false;
        this.f29067s = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(getContext(), attributeSet, uf.a.f88473u, i10, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(7, false));
        this.f29066r = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f29065q = typedArrayObtainStyledAttributes.getBoolean(4, false);
        if (this.f9504h == null) {
            this.f9504h = z.create(new yg.a(0.0f));
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
