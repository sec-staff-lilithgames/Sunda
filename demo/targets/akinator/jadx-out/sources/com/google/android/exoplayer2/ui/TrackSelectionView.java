package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import bf.m1;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.n3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f28146p = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f28147b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f28148c;

    /* renamed from: e, reason: collision with root package name */
    public final CheckedTextView f28149e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckedTextView f28150f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f28151g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f28152h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f28153i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28154j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28155k;

    /* renamed from: l, reason: collision with root package name */
    public u0 f28156l;

    /* renamed from: m, reason: collision with root package name */
    public CheckedTextView[][] f28157m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28158n;

    /* renamed from: o, reason: collision with root package name */
    public v0 f28159o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n3.a f28160a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28161b;

        public a(n3.a aVar, int i10) {
            this.f28160a = aVar;
            this.f28161b = i10;
        }

        public com.google.android.exoplayer2.z0 getFormat() {
            return this.f28160a.getTrackFormat(this.f28161b);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static Map<m1, pf.q> filterOverrides(Map<m1, pf.q> map, List<n3.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            pf.q qVar = map.get(list.get(i10).getMediaTrackGroup());
            if (qVar != null && (z10 || map2.isEmpty())) {
                map2.put(qVar.f81137b, qVar);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        CheckedTextView checkedTextView = this.f28149e;
        boolean z10 = true;
        HashMap map = this.f28153i;
        if (view == checkedTextView) {
            this.f28158n = true;
            map.clear();
        } else if (view == this.f28150f) {
            this.f28158n = false;
            map.clear();
        } else {
            this.f28158n = false;
            a aVar = (a) com.google.android.exoplayer2.util.a.checkNotNull(view.getTag());
            m1 mediaTrackGroup = aVar.f28160a.getMediaTrackGroup();
            int i10 = aVar.f28161b;
            pf.q qVar = (pf.q) map.get(mediaTrackGroup);
            if (qVar == null) {
                if (!this.f28155k && map.size() > 0) {
                    map.clear();
                }
                map.put(mediaTrackGroup, new pf.q(mediaTrackGroup, b5.of(Integer.valueOf(i10))));
            } else {
                ArrayList arrayList = new ArrayList(qVar.f81138c);
                boolean zIsChecked = ((CheckedTextView) view).isChecked();
                boolean z11 = this.f28154j && aVar.f28160a.isAdaptiveSupported();
                if (!z11 && (!this.f28155k || this.f28152h.size() <= 1)) {
                    z10 = false;
                }
                if (zIsChecked && z10) {
                    arrayList.remove(Integer.valueOf(i10));
                    if (arrayList.isEmpty()) {
                        map.remove(mediaTrackGroup);
                    } else {
                        map.put(mediaTrackGroup, new pf.q(mediaTrackGroup, arrayList));
                    }
                } else if (!zIsChecked) {
                    if (z11) {
                        arrayList.add(Integer.valueOf(i10));
                        map.put(mediaTrackGroup, new pf.q(mediaTrackGroup, arrayList));
                    } else {
                        map.put(mediaTrackGroup, new pf.q(mediaTrackGroup, b5.of(Integer.valueOf(i10))));
                    }
                }
            }
        }
        b();
    }

    public final void b() {
        this.f28149e.setChecked(this.f28158n);
        boolean z10 = this.f28158n;
        HashMap map = this.f28153i;
        this.f28150f.setChecked(!z10 && map.size() == 0);
        for (int i10 = 0; i10 < this.f28157m.length; i10++) {
            pf.q qVar = (pf.q) map.get(((n3.a) this.f28152h.get(i10)).getMediaTrackGroup());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f28157m[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (qVar != null) {
                        this.f28157m[i10][i11].setChecked(qVar.f81138c.contains(Integer.valueOf(((a) com.google.android.exoplayer2.util.a.checkNotNull(checkedTextViewArr[i11].getTag())).f28161b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void c() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f28152h;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f28150f;
        CheckedTextView checkedTextView2 = this.f28149e;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f28157m = new CheckedTextView[arrayList.size()][];
        boolean z10 = this.f28155k && arrayList.size() > 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n3.a aVar = (n3.a) arrayList.get(i10);
            boolean z11 = this.f28154j && aVar.isAdaptiveSupported();
            CheckedTextView[][] checkedTextViewArr = this.f28157m;
            int i11 = aVar.f27838b;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            a[] aVarArr = new a[i11];
            for (int i12 = 0; i12 < aVar.f27838b; i12++) {
                aVarArr[i12] = new a(aVar, i12);
            }
            v0 v0Var = this.f28159o;
            if (v0Var != null) {
                Arrays.sort(aVarArr, v0Var);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f28148c;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z11 || z10) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f28147b);
                checkedTextView3.setText(this.f28156l.getTrackName(aVarArr[i13].getFormat()));
                checkedTextView3.setTag(aVarArr[i13]);
                if (aVar.isTrackSupported(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f28151g);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f28157m[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        b();
    }

    public boolean getIsDisabled() {
        return this.f28158n;
    }

    public Map<m1, pf.q> getOverrides() {
        return this.f28153i;
    }

    public void init(List<n3.a> list, boolean z10, Map<m1, pf.q> map, Comparator<com.google.android.exoplayer2.z0> comparator, x0 x0Var) {
        this.f28158n = z10;
        this.f28159o = comparator == null ? null : new v0(comparator, 0);
        ArrayList arrayList = this.f28152h;
        arrayList.clear();
        arrayList.addAll(list);
        HashMap map2 = this.f28153i;
        map2.clear();
        map2.putAll(filterOverrides(map, list, this.f28155k));
        c();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f28154j != z10) {
            this.f28154j = z10;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f28155k != z10) {
            this.f28155k = z10;
            if (!z10) {
                HashMap map = this.f28153i;
                if (map.size() > 1) {
                    Map<m1, pf.q> mapFilterOverrides = filterOverrides(map, this.f28152h, false);
                    map.clear();
                    map.putAll(mapFilterOverrides);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f28149e.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(u0 u0Var) {
        this.f28156l = (u0) com.google.android.exoplayer2.util.a.checkNotNull(u0Var);
        c();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f28147b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f28148c = layoutInflaterFrom;
        w0 w0Var = new w0(this);
        this.f28151g = w0Var;
        this.f28156l = new i(getResources());
        this.f28152h = new ArrayList();
        this.f28153i = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28149e = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(w0Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28150f = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(w0Var);
        addView(checkedTextView2);
    }
}
