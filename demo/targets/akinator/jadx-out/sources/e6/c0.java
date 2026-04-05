package e6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.ironsource.C3352n2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 implements Cloneable {
    public static final Animator[] N = new Animator[0];
    public static final int[] O = {2, 1, 3, 4};
    public static final y P = new y();
    public static final ThreadLocal Q = new ThreadLocal();
    public n0 H;
    public a I;
    public long K;
    public f0 L;
    public long M;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f53779v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f53780w;

    /* renamed from: x, reason: collision with root package name */
    public g0[] f53781x;

    /* renamed from: b, reason: collision with root package name */
    public final String f53760b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f53761c = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f53762e = -1;

    /* renamed from: f, reason: collision with root package name */
    public TimeInterpolator f53763f = null;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f53764g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f53765h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f53766i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f53767j = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f53768k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f53769l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f53770m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f53771n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f53772o = null;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f53773p = null;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f53774q = null;

    /* renamed from: r, reason: collision with root package name */
    public w0 f53775r = new w0();

    /* renamed from: s, reason: collision with root package name */
    public w0 f53776s = new w0();

    /* renamed from: t, reason: collision with root package name */
    public s0 f53777t = null;

    /* renamed from: u, reason: collision with root package name */
    public int[] f53778u = O;

    /* renamed from: y, reason: collision with root package name */
    public boolean f53782y = false;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f53783z = new ArrayList();
    public Animator[] A = N;
    public int B = 0;
    public boolean C = false;
    public boolean D = false;
    public c0 E = null;
    public ArrayList F = null;
    public ArrayList G = new ArrayList();
    public u J = P;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract Rect onGetEpicenter(c0 c0Var);
    }

    public c0() {
    }

    public static void a(w0 w0Var, View view, v0 v0Var) {
        z.f fVar = (z.f) w0Var.f53883a;
        z.f fVar2 = (z.f) w0Var.f53884b;
        SparseArray sparseArray = (SparseArray) w0Var.f53885c;
        z.x xVar = (z.x) w0Var.f53886d;
        fVar.put(view, v0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        String transitionName = z1.getTransitionName(view);
        if (transitionName != null) {
            if (fVar2.containsKey(transitionName)) {
                fVar2.put(transitionName, null);
            } else {
                fVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (xVar.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    xVar.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) xVar.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    xVar.put(itemIdAtPosition, null);
                }
            }
        }
    }

    public static z.f j() {
        ThreadLocal threadLocal = Q;
        z.f fVar = (z.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        z.f fVar2 = new z.f();
        threadLocal.set(fVar2);
        return fVar2;
    }

    public c0 addListener(g0 g0Var) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(g0Var);
        return this;
    }

    public c0 addTarget(View view) {
        this.f53765h.add(view);
        return this;
    }

    public final void b(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f53768k;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f53769l;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f53770m;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f53770m.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    v0 v0Var = new v0(view);
                    if (z10) {
                        captureStartValues(v0Var);
                    } else {
                        captureEndValues(v0Var);
                    }
                    v0Var.f53876c.add(this);
                    c(v0Var);
                    if (z10) {
                        a(this.f53775r, view, v0Var);
                    } else {
                        a(this.f53776s, view, v0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f53772o;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f53773p;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f53774q;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f53774q.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                b(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void c(v0 v0Var) {
        String[] propagationProperties;
        HashMap map = v0Var.f53874a;
        if (this.H == null || map.isEmpty() || (propagationProperties = this.H.getPropagationProperties()) == null) {
            return;
        }
        for (String str : propagationProperties) {
            if (!map.containsKey(str)) {
                this.H.captureValues(v0Var);
                return;
            }
        }
    }

    public void cancel() {
        ArrayList arrayList = this.f53783z;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = N;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.A = animatorArr;
        m(this, i0.H8, false);
    }

    public abstract void captureEndValues(v0 v0Var);

    public abstract void captureStartValues(v0 v0Var);

    public Animator createAnimator(ViewGroup viewGroup, v0 v0Var, v0 v0Var2) {
        return null;
    }

    public final void d(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        e(z10);
        ArrayList arrayList3 = this.f53764g;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.f53765h;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f53766i) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f53767j) != null && !arrayList2.isEmpty()))) {
            b(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList3.get(i10)).intValue());
            if (viewFindViewById != null) {
                v0 v0Var = new v0(viewFindViewById);
                if (z10) {
                    captureStartValues(v0Var);
                } else {
                    captureEndValues(v0Var);
                }
                v0Var.f53876c.add(this);
                c(v0Var);
                if (z10) {
                    a(this.f53775r, viewFindViewById, v0Var);
                } else {
                    a(this.f53776s, viewFindViewById, v0Var);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            View view = (View) arrayList4.get(i11);
            v0 v0Var2 = new v0(view);
            if (z10) {
                captureStartValues(v0Var2);
            } else {
                captureEndValues(v0Var2);
            }
            v0Var2.f53876c.add(this);
            c(v0Var2);
            if (z10) {
                a(this.f53775r, view, v0Var2);
            } else {
                a(this.f53776s, view, v0Var2);
            }
        }
    }

    public final void e(boolean z10) {
        if (z10) {
            ((z.f) this.f53775r.f53883a).clear();
            ((SparseArray) this.f53775r.f53885c).clear();
            ((z.x) this.f53775r.f53886d).clear();
        } else {
            ((z.f) this.f53776s.f53883a).clear();
            ((SparseArray) this.f53776s.f53885c).clear();
            ((z.x) this.f53776s.f53886d).clear();
        }
    }

    public c0 excludeChildren(View view, boolean z10) {
        ArrayList arrayListA = this.f53773p;
        if (view != null) {
            arrayListA = z10 ? x.a(arrayListA, view) : x.b(arrayListA, view);
        }
        this.f53773p = arrayListA;
        return this;
    }

    public c0 excludeTarget(View view, boolean z10) {
        ArrayList arrayListA = this.f53769l;
        if (view != null) {
            arrayListA = z10 ? x.a(arrayListA, view) : x.b(arrayListA, view);
        }
        this.f53769l = arrayListA;
        return this;
    }

    public void f(ViewGroup viewGroup, w0 w0Var, w0 w0Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorCreateAnimator;
        int i10;
        boolean z10;
        int i11;
        View view;
        v0 v0Var;
        Animator animator;
        v0 v0Var2;
        int i12;
        z.f fVarJ = j();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = getRootTransition().L != null;
        long jMin = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            v0 v0Var3 = (v0) arrayList.get(i13);
            v0 v0Var4 = (v0) arrayList2.get(i13);
            if (v0Var3 != null && !v0Var3.f53876c.contains(this)) {
                v0Var3 = null;
            }
            if (v0Var4 != null && !v0Var4.f53876c.contains(this)) {
                v0Var4 = null;
            }
            if (!(v0Var3 == null && v0Var4 == null) && ((v0Var3 == null || v0Var4 == null || isTransitionRequired(v0Var3, v0Var4)) && (animatorCreateAnimator = createAnimator(viewGroup, v0Var3, v0Var4)) != null)) {
                if (v0Var4 != null) {
                    view = v0Var4.f53875b;
                    String[] transitionProperties = getTransitionProperties();
                    i10 = size;
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        v0Var2 = new v0(view);
                        z10 = z11;
                        i11 = i13;
                        v0 v0Var5 = (v0) ((z.f) w0Var2.f53883a).get(view);
                        if (v0Var5 != null) {
                            int i14 = 0;
                            while (i14 < transitionProperties.length) {
                                String str = transitionProperties[i14];
                                v0Var2.f53874a.put(str, v0Var5.f53874a.get(str));
                                i14++;
                                v0Var5 = v0Var5;
                            }
                        }
                        int size2 = fVarJ.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                animator = animatorCreateAnimator;
                                break;
                            }
                            b0 b0Var = (b0) fVarJ.get((Animator) fVarJ.keyAt(i15));
                            if (b0Var.f53754c != null && b0Var.f53752a == view) {
                                i12 = size2;
                                if (b0Var.f53753b.equals(getName()) && b0Var.f53754c.equals(v0Var2)) {
                                    animator = null;
                                    break;
                                }
                            } else {
                                i12 = size2;
                            }
                            i15++;
                            size2 = i12;
                        }
                    } else {
                        z10 = z11;
                        i11 = i13;
                        animator = animatorCreateAnimator;
                        v0Var2 = null;
                    }
                    animatorCreateAnimator = animator;
                    v0Var = v0Var2;
                } else {
                    i10 = size;
                    z10 = z11;
                    i11 = i13;
                    view = v0Var3.f53875b;
                    v0Var = null;
                }
                if (animatorCreateAnimator != null) {
                    n0 n0Var = this.H;
                    if (n0Var != null) {
                        long startDelay = n0Var.getStartDelay(viewGroup, this, v0Var3, v0Var4);
                        sparseIntArray.put(this.G.size(), (int) startDelay);
                        jMin = Math.min(startDelay, jMin);
                    }
                    String name = getName();
                    WindowId windowId = viewGroup.getWindowId();
                    b0 b0Var2 = new b0();
                    b0Var2.f53752a = view;
                    b0Var2.f53753b = name;
                    b0Var2.f53754c = v0Var;
                    b0Var2.f53755d = windowId;
                    b0Var2.f53756e = this;
                    b0Var2.f53757f = animatorCreateAnimator;
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animatorCreateAnimator);
                        animatorCreateAnimator = animatorSet;
                    }
                    fVarJ.put(animatorCreateAnimator, b0Var2);
                    this.G.add(animatorCreateAnimator);
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i13;
            }
            i13 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                b0 b0Var3 = (b0) fVarJ.get((Animator) this.G.get(sparseIntArray.keyAt(i16)));
                b0Var3.f53757f.setStartDelay(b0Var3.f53757f.getStartDelay() + (sparseIntArray.valueAt(i16) - jMin));
            }
        }
    }

    public final void g() {
        int i10 = this.B - 1;
        this.B = i10;
        if (i10 == 0) {
            m(this, i0.G8, false);
            for (int i11 = 0; i11 < ((z.x) this.f53775r.f53886d).size(); i11++) {
                View view = (View) ((z.x) this.f53775r.f53886d).valueAt(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((z.x) this.f53776s.f53886d).size(); i12++) {
                View view2 = (View) ((z.x) this.f53776s.f53886d).valueAt(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.D = true;
        }
    }

    public long getDuration() {
        return this.f53762e;
    }

    public Rect getEpicenter() {
        a aVar = this.I;
        if (aVar == null) {
            return null;
        }
        return aVar.onGetEpicenter(this);
    }

    public a getEpicenterCallback() {
        return this.I;
    }

    public TimeInterpolator getInterpolator() {
        return this.f53763f;
    }

    public String getName() {
        return this.f53760b;
    }

    public u getPathMotion() {
        return this.J;
    }

    public n0 getPropagation() {
        return this.H;
    }

    public final c0 getRootTransition() {
        s0 s0Var = this.f53777t;
        return s0Var != null ? s0Var.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.f53761c;
    }

    public List<Integer> getTargetIds() {
        return this.f53764g;
    }

    public List<String> getTargetNames() {
        return this.f53766i;
    }

    public List<Class<?>> getTargetTypes() {
        return this.f53767j;
    }

    public List<View> getTargets() {
        return this.f53765h;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public v0 getTransitionValues(View view, boolean z10) {
        s0 s0Var = this.f53777t;
        if (s0Var != null) {
            return s0Var.getTransitionValues(view, z10);
        }
        return (v0) ((z.f) (z10 ? this.f53775r : this.f53776s).f53883a).get(view);
    }

    public void h(ViewGroup viewGroup) {
        z.f fVarJ = j();
        int size = fVarJ.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        z.f fVar = new z.f(fVarJ);
        fVarJ.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            b0 b0Var = (b0) fVar.valueAt(i10);
            if (b0Var.f53752a != null && windowId.equals(b0Var.f53755d)) {
                ((Animator) fVar.keyAt(i10)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f53780w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f53779v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (e6.v0) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e6.v0 i(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            e6.s0 r0 = r4.f53777t
            if (r0 == 0) goto L9
            e6.v0 r5 = r0.i(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f53779v
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f53780w
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            e6.v0 r3 = (e6.v0) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f53875b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f53780w
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f53779v
        L35:
            java.lang.Object r5 = r5.get(r2)
            e6.v0 r5 = (e6.v0) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.c0.i(android.view.View, boolean):e6.v0");
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(v0 v0Var, v0 v0Var2) {
        if (v0Var != null) {
            HashMap map = v0Var.f53874a;
            if (v0Var2 != null) {
                HashMap map2 = v0Var2.f53874a;
                String[] transitionProperties = getTransitionProperties();
                if (transitionProperties != null) {
                    for (String str : transitionProperties) {
                        Object obj = map.get(str);
                        Object obj2 = map2.get(str);
                        if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                            return true;
                        }
                    }
                } else {
                    for (String str2 : map.keySet()) {
                        Object obj3 = map.get(str2);
                        Object obj4 = map2.get(str2);
                        if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean k() {
        return !this.f53783z.isEmpty();
    }

    public final boolean l(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f53768k;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f53769l;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f53770m;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f53770m.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f53771n != null && z1.getTransitionName(view) != null && this.f53771n.contains(z1.getTransitionName(view))) {
            return false;
        }
        ArrayList arrayList6 = this.f53764g;
        int size2 = arrayList6.size();
        ArrayList arrayList7 = this.f53765h;
        if ((size2 == 0 && arrayList7.size() == 0 && (((arrayList = this.f53767j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f53766i) == null || arrayList2.isEmpty()))) || arrayList6.contains(Integer.valueOf(id2)) || arrayList7.contains(view)) {
            return true;
        }
        ArrayList arrayList8 = this.f53766i;
        if (arrayList8 != null && arrayList8.contains(z1.getTransitionName(view))) {
            return true;
        }
        if (this.f53767j != null) {
            for (int i11 = 0; i11 < this.f53767j.size(); i11++) {
                if (((Class) this.f53767j.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m(c0 c0Var, i0 i0Var, boolean z10) {
        c0 c0Var2 = this.E;
        if (c0Var2 != null) {
            c0Var2.m(c0Var, i0Var, z10);
        }
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.F.size();
        g0[] g0VarArr = this.f53781x;
        if (g0VarArr == null) {
            g0VarArr = new g0[size];
        }
        this.f53781x = null;
        g0[] g0VarArr2 = (g0[]) this.F.toArray(g0VarArr);
        for (int i10 = 0; i10 < size; i10++) {
            i0Var.notifyListener(g0VarArr2[i10], c0Var, z10);
            g0VarArr2[i10] = null;
        }
        this.f53781x = g0VarArr2;
    }

    public void n() {
        z.f fVarJ = j();
        this.K = 0L;
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            Animator animator = (Animator) this.G.get(i10);
            b0 b0Var = (b0) fVarJ.get(animator);
            if (animator != null && b0Var != null) {
                Animator animator2 = b0Var.f53757f;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.f53783z.add(animator);
                this.K = Math.max(this.K, d0.a(animator));
            }
        }
        this.G.clear();
    }

    public void o() {
        r();
        z.f fVarJ = j();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (fVarJ.containsKey(animator)) {
                r();
                if (animator != null) {
                    animator.addListener(new z(this, fVarJ));
                    if (getDuration() >= 0) {
                        animator.setDuration(getDuration());
                    }
                    if (getStartDelay() >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + getStartDelay());
                    }
                    if (getInterpolator() != null) {
                        animator.setInterpolator(getInterpolator());
                    }
                    animator.addListener(new a0(this));
                    animator.start();
                }
            }
        }
        this.G.clear();
        g();
    }

    public void p() {
        this.f53782y = true;
    }

    public void pause(View view) {
        if (this.D) {
            return;
        }
        ArrayList arrayList = this.f53783z;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = N;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.A = animatorArr;
        m(this, i0.I8, false);
        this.C = true;
    }

    public void q(long j10, long j11) {
        long j12 = this.K;
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > j12 && j10 <= j12)) {
            this.D = false;
            m(this, i0.F8, z10);
        }
        ArrayList arrayList = this.f53783z;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
        this.A = N;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            d0.b(animator, Math.min(Math.max(0L, j10), d0.a(animator)));
            i10++;
            j12 = j12;
        }
        long j13 = j12;
        this.A = animatorArr;
        if ((j10 <= j13 || j11 > j13) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j13) {
            this.D = true;
        }
        m(this, i0.G8, z10);
    }

    public final void r() {
        if (this.B == 0) {
            m(this, i0.F8, false);
            this.D = false;
        }
        this.B++;
    }

    public c0 removeListener(g0 g0Var) {
        c0 c0Var;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            if (!arrayList.remove(g0Var) && (c0Var = this.E) != null) {
                c0Var.removeListener(g0Var);
            }
            if (this.F.size() == 0) {
                this.F = null;
            }
        }
        return this;
    }

    public c0 removeTarget(View view) {
        this.f53765h.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.C) {
            if (!this.D) {
                ArrayList arrayList = this.f53783z;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A);
                this.A = N;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.A = animatorArr;
                m(this, i0.J8, false);
            }
            this.C = false;
        }
    }

    public String s(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f53762e != -1) {
            sb2.append("dur(");
            sb2.append(this.f53762e);
            sb2.append(") ");
        }
        if (this.f53761c != -1) {
            sb2.append("dly(");
            sb2.append(this.f53761c);
            sb2.append(") ");
        }
        if (this.f53763f != null) {
            sb2.append("interp(");
            sb2.append(this.f53763f);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f53764g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f53765h;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public c0 setDuration(long j10) {
        this.f53762e = j10;
        return this;
    }

    public void setEpicenterCallback(a aVar) {
        this.I = aVar;
    }

    public c0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f53763f = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f53778u = O;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < 1 || i11 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i12 = 0; i12 < i10; i12++) {
                if (iArr[i12] == i11) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.f53778u = (int[]) iArr.clone();
    }

    public void setPathMotion(u uVar) {
        if (uVar == null) {
            this.J = P;
        } else {
            this.J = uVar;
        }
    }

    public void setPropagation(n0 n0Var) {
        this.H = n0Var;
    }

    public c0 setStartDelay(long j10) {
        this.f53761c = j10;
        return this;
    }

    public String toString() {
        return s("");
    }

    public c0 addTarget(int i10) {
        if (i10 != 0) {
            this.f53764g.add(Integer.valueOf(i10));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public c0 mo3832clone() {
        try {
            c0 c0Var = (c0) super.clone();
            c0Var.G = new ArrayList();
            c0Var.f53775r = new w0();
            c0Var.f53776s = new w0();
            c0Var.f53779v = null;
            c0Var.f53780w = null;
            c0Var.L = null;
            c0Var.E = this;
            c0Var.F = null;
            return c0Var;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public c0 removeTarget(int i10) {
        if (i10 != 0) {
            this.f53764g.remove(Integer.valueOf(i10));
        }
        return this;
    }

    public c0 addTarget(String str) {
        if (this.f53766i == null) {
            this.f53766i = new ArrayList();
        }
        this.f53766i.add(str);
        return this;
    }

    public c0 removeTarget(String str) {
        ArrayList arrayList = this.f53766i;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public c0 excludeChildren(int i10, boolean z10) {
        ArrayList arrayListB = this.f53772o;
        if (i10 > 0) {
            if (z10) {
                arrayListB = x.a(arrayListB, Integer.valueOf(i10));
            } else {
                arrayListB = x.b(arrayListB, Integer.valueOf(i10));
            }
        }
        this.f53772o = arrayListB;
        return this;
    }

    public c0 excludeTarget(int i10, boolean z10) {
        ArrayList arrayListB = this.f53768k;
        if (i10 > 0) {
            if (z10) {
                arrayListB = x.a(arrayListB, Integer.valueOf(i10));
            } else {
                arrayListB = x.b(arrayListB, Integer.valueOf(i10));
            }
        }
        this.f53768k = arrayListB;
        return this;
    }

    public c0 removeTarget(Class<?> cls) {
        ArrayList arrayList = this.f53767j;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public c0 addTarget(Class<?> cls) {
        if (this.f53767j == null) {
            this.f53767j = new ArrayList();
        }
        this.f53767j.add(cls);
        return this;
    }

    public c0 excludeChildren(Class<?> cls, boolean z10) {
        ArrayList arrayListB = this.f53774q;
        if (cls != null) {
            if (z10) {
                arrayListB = x.a(arrayListB, cls);
            } else {
                arrayListB = x.b(arrayListB, cls);
            }
        }
        this.f53774q = arrayListB;
        return this;
    }

    public c0 excludeTarget(String str, boolean z10) {
        ArrayList arrayListB = this.f53771n;
        if (str != null) {
            if (z10) {
                arrayListB = x.a(arrayListB, str);
            } else {
                arrayListB = x.b(arrayListB, str);
            }
        }
        this.f53771n = arrayListB;
        return this;
    }

    public c0 excludeTarget(Class<?> cls, boolean z10) {
        ArrayList arrayListB = this.f53770m;
        if (cls != null) {
            if (z10) {
                arrayListB = x.a(arrayListB, cls);
            } else {
                arrayListB = x.b(arrayListB, cls);
            }
        }
        this.f53770m = arrayListB;
        return this;
    }

    public c0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f53887a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = n3.q.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, IronSourceConstants.EVENTS_DURATION, 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = n3.q.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = n3.q.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = n3.q.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(namedString, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 3;
                } else if (C3352n2.f37922p.equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr[i10] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                    i10--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(a.b.l("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i10++;
            }
            setMatchOrder(iArr);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
