package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.digidust.elokence.akinator.freemium.R;
import gn.b2;
import gn.v1;
import gn.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f61644p = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f61645b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f61646c;

    /* renamed from: e, reason: collision with root package name */
    public final CheckedTextView f61647e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckedTextView f61648f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f61649g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f61650h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f61651i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f61652j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f61653k;

    /* renamed from: l, reason: collision with root package name */
    public q0 f61654l;

    /* renamed from: m, reason: collision with root package name */
    public CheckedTextView[][] f61655m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f61656n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.exoplayer2.ui.v0 f61657o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b2.a f61658a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61659b;

        public a(b2.a aVar, int i10) {
            this.f61658a = aVar;
            this.f61659b = i10;
        }

        public io.bidmachine.media3.common.b getFormat() {
            return this.f61658a.getTrackFormat(this.f61659b);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static Map<v1, w1> filterOverrides(Map<v1, w1> map, List<b2.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            w1 w1Var = map.get(list.get(i10).getMediaTrackGroup());
            if (w1Var != null && (z10 || map2.isEmpty())) {
                map2.put(w1Var.f58240a, w1Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        CheckedTextView checkedTextView = this.f61647e;
        boolean z10 = true;
        HashMap map = this.f61651i;
        if (view == checkedTextView) {
            this.f61656n = true;
            map.clear();
        } else if (view == this.f61648f) {
            this.f61656n = false;
            map.clear();
        } else {
            this.f61656n = false;
            a aVar = (a) io.bidmachine.media3.common.util.a.checkNotNull(view.getTag());
            v1 mediaTrackGroup = aVar.f61658a.getMediaTrackGroup();
            int i10 = aVar.f61659b;
            w1 w1Var = (w1) map.get(mediaTrackGroup);
            if (w1Var == null) {
                if (!this.f61653k && map.size() > 0) {
                    map.clear();
                }
                map.put(mediaTrackGroup, new w1(mediaTrackGroup, b5.of(Integer.valueOf(i10))));
            } else {
                ArrayList arrayList = new ArrayList(w1Var.f58241b);
                boolean zIsChecked = ((CheckedTextView) view).isChecked();
                boolean z11 = this.f61652j && aVar.f61658a.isAdaptiveSupported();
                if (!z11 && (!this.f61653k || this.f61650h.size() <= 1)) {
                    z10 = false;
                }
                if (zIsChecked && z10) {
                    arrayList.remove(Integer.valueOf(i10));
                    if (arrayList.isEmpty()) {
                        map.remove(mediaTrackGroup);
                    } else {
                        map.put(mediaTrackGroup, new w1(mediaTrackGroup, arrayList));
                    }
                } else if (!zIsChecked) {
                    if (z11) {
                        arrayList.add(Integer.valueOf(i10));
                        map.put(mediaTrackGroup, new w1(mediaTrackGroup, arrayList));
                    } else {
                        map.put(mediaTrackGroup, new w1(mediaTrackGroup, b5.of(Integer.valueOf(i10))));
                    }
                }
            }
        }
        b();
    }

    public final void b() {
        this.f61647e.setChecked(this.f61656n);
        boolean z10 = this.f61656n;
        HashMap map = this.f61651i;
        this.f61648f.setChecked(!z10 && map.size() == 0);
        for (int i10 = 0; i10 < this.f61655m.length; i10++) {
            w1 w1Var = (w1) map.get(((b2.a) this.f61650h.get(i10)).getMediaTrackGroup());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f61655m[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (w1Var != null) {
                        this.f61655m[i10][i11].setChecked(w1Var.f58241b.contains(Integer.valueOf(((a) io.bidmachine.media3.common.util.a.checkNotNull(checkedTextViewArr[i11].getTag())).f61659b)));
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
        ArrayList arrayList = this.f61650h;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f61648f;
        CheckedTextView checkedTextView2 = this.f61647e;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f61655m = new CheckedTextView[arrayList.size()][];
        boolean z10 = this.f61653k && arrayList.size() > 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b2.a aVar = (b2.a) arrayList.get(i10);
            boolean z11 = this.f61652j && aVar.isAdaptiveSupported();
            CheckedTextView[][] checkedTextViewArr = this.f61655m;
            int i11 = aVar.f57825a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            a[] aVarArr = new a[i11];
            for (int i12 = 0; i12 < aVar.f57825a; i12++) {
                aVarArr[i12] = new a(aVar, i12);
            }
            com.google.android.exoplayer2.ui.v0 v0Var = this.f61657o;
            if (v0Var != null) {
                Arrays.sort(aVarArr, v0Var);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f61646c;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(R.layout.bm_exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z11 || z10) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f61645b);
                checkedTextView3.setText(this.f61654l.getTrackName(aVarArr[i13].getFormat()));
                checkedTextView3.setTag(aVarArr[i13]);
                if (aVar.isTrackSupported(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f61649g);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f61655m[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        b();
    }

    public boolean getIsDisabled() {
        return this.f61656n;
    }

    public Map<v1, w1> getOverrides() {
        return this.f61651i;
    }

    public void init(List<b2.a> list, boolean z10, Map<v1, w1> map, Comparator<io.bidmachine.media3.common.b> comparator, s0 s0Var) {
        this.f61656n = z10;
        this.f61657o = comparator == null ? null : new com.google.android.exoplayer2.ui.v0(comparator, 1);
        ArrayList arrayList = this.f61650h;
        arrayList.clear();
        arrayList.addAll(list);
        HashMap map2 = this.f61651i;
        map2.clear();
        map2.putAll(filterOverrides(map, list, this.f61653k));
        c();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f61652j != z10) {
            this.f61652j = z10;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f61653k != z10) {
            this.f61653k = z10;
            if (!z10) {
                HashMap map = this.f61651i;
                if (map.size() > 1) {
                    Map<v1, w1> mapFilterOverrides = filterOverrides(map, this.f61650h, false);
                    map.clear();
                    map.putAll(mapFilterOverrides);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f61647e.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(q0 q0Var) {
        this.f61654l = (q0) io.bidmachine.media3.common.util.a.checkNotNull(q0Var);
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
        this.f61645b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f61646c = layoutInflaterFrom;
        r0 r0Var = new r0(this);
        this.f61649g = r0Var;
        this.f61654l = new f(getResources());
        this.f61650h = new ArrayList();
        this.f61651i = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f61647e = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(r0Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.bm_exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f61648f = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(r0Var);
        addView(checkedTextView2);
    }
}
