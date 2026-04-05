package g3;

import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import g3.l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f56911f;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f56912g;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f56913a;

    /* renamed from: b, reason: collision with root package name */
    public String f56914b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f56915c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f56916d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f56917e = -1;

    static {
        HashMap map = new HashMap();
        f56911f = map;
        HashMap map2 = new HashMap();
        f56912g = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public c(i0 i0Var) {
        this.f56913a = i0Var;
    }

    public static void a(int i10, androidx.constraintlayout.widget.k kVar, View view, HashMap map, int i11, int i12) {
        String str = (String) f56911f.get(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        String str2 = (String) map.get(str);
        if (str2 != null) {
            String str3 = (String) f56912g.get(str);
            kVar.connect(view.getId(), i11, Integer.parseInt(str2), i12, str3 != null ? b(i10, (String) map.get(str3)) : 0);
        }
    }

    public static int b(int i10, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i10) / 160.0f);
    }

    public static void c(androidx.constraintlayout.widget.k kVar, View view, HashMap map, int i10) {
        String str = (String) map.get(i10 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i10 == 0) {
                kVar.setHorizontalBias(view.getId(), Float.parseFloat(str));
            } else if (i10 == 1) {
                kVar.setVerticalBias(view.getId(), Float.parseFloat(str));
            }
        }
    }

    public static void d(int i10, androidx.constraintlayout.widget.k kVar, View view, HashMap map, int i11) {
        String str = (String) map.get(i11 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iB = !str.equalsIgnoreCase("wrap_content") ? b(i10, str) : -2;
            if (i11 == 0) {
                kVar.constrainWidth(view.getId(), iB);
            } else {
                kVar.constrainHeight(view.getId(), iB);
            }
        }
    }

    public int designAccess(int i10, String str, Object obj, float[] fArr, int i11, float[] fArr2, int i12) {
        s sVar;
        View view = (View) obj;
        i0 i0Var = this.f56913a;
        if (i10 == 0) {
            sVar = null;
        } else if (i0Var.f56982b == null || view == null || (sVar = (s) i0Var.f57003m.get(view)) == null) {
            return -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            int duration = i0Var.f56982b.getDuration() / 16;
            sVar.b(fArr2, duration);
            return duration;
        }
        if (i10 == 2) {
            int duration2 = i0Var.f56982b.getDuration() / 16;
            sVar.a(fArr2, null);
            return duration2;
        }
        if (i10 != 3) {
            return -1;
        }
        i0Var.f56982b.getDuration();
        a3.x xVar = (a3.x) sVar.f57244y.get(str);
        if (xVar == null) {
            return -1;
        }
        for (int i13 = 0; i13 < fArr2.length; i13++) {
            fArr2[i13] = xVar.get(i13 / (fArr2.length - 1));
        }
        return fArr2.length;
    }

    public void disableAutoTransition(boolean z10) {
        l0 l0Var = this.f56913a.f56982b;
        if (l0Var == null) {
            return;
        }
        l0Var.disableAutoTransition(z10);
    }

    public void dumpConstraintSet(String str) {
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            i0Var.f56982b = null;
        }
        l0 l0Var = i0Var.f56982b;
        int iLookUpConstraintId = l0Var == null ? 0 : l0Var.lookUpConstraintId(str);
        System.out.println(" dumping  " + str + " (" + iLookUpConstraintId + ")");
        try {
            i0Var.f56982b.b(iLookUpConstraintId).dump(i0Var.f56982b, new int[0]);
        } catch (Exception e10) {
            Log.e("DesignTool", "Error while dumping: " + str + " (" + iLookUpConstraintId + ")", e10);
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        i0 i0Var = this.f56913a;
        l0 l0Var = i0Var.f56982b;
        if (l0Var == null) {
            return -1;
        }
        int duration = l0Var.getDuration() / 16;
        s sVar = (s) i0Var.f57003m.get(obj);
        if (sVar == null) {
            return 0;
        }
        sVar.a(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i10) {
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            return -1;
        }
        s sVar = (s) i0Var.f57003m.get(obj);
        if (sVar == null) {
            return 0;
        }
        sVar.b(fArr, i10);
        return i10;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        i0 i0Var = this.f56913a;
        l0 l0Var = i0Var.f56982b;
        if (l0Var == null) {
            return;
        }
        int duration = l0Var.getDuration() / 16;
        s sVar = (s) i0Var.f57003m.get(obj);
        if (sVar == null) {
            return;
        }
        float f10 = 1.0f / (duration - 1);
        for (int i10 = 0; i10 < duration; i10++) {
            sVar.f57229j[0].getPos(sVar.c(i10 * f10, null), sVar.f57235p);
            sVar.f57225f.c(sVar.f57234o, sVar.f57235p, fArr, i10 * 8);
        }
    }

    public String getEndState() {
        i0 i0Var = this.f56913a;
        int endState = i0Var.getEndState();
        if (this.f56917e == endState) {
            return this.f56915c;
        }
        l0 l0Var = i0Var.f56982b;
        String strLookUpConstraintName = l0Var == null ? null : l0Var.lookUpConstraintName(endState);
        if (strLookUpConstraintName != null) {
            this.f56915c = strLookUpConstraintName;
            this.f56917e = endState;
        }
        return strLookUpConstraintName;
    }

    public int getKeyFrameInfo(Object obj, int i10, int[] iArr) {
        s sVar = (s) this.f56913a.f57003m.get((View) obj);
        if (sVar == null) {
            return 0;
        }
        return sVar.getKeyFrameInfo(i10, iArr);
    }

    public float getKeyFramePosition(Object obj, int i10, float f10, float f11) {
        s sVar;
        if ((obj instanceof View) && (sVar = (s) this.f56913a.f57003m.get((View) obj)) != null) {
            return sVar.e(f10, i10, f11);
        }
        return 0.0f;
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        s sVar = (s) this.f56913a.f57003m.get((View) obj);
        if (sVar == null) {
            return 0;
        }
        return sVar.getKeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i10, int i11, int i12) {
        i0 i0Var = this.f56913a;
        l0 l0Var = i0Var.f56982b;
        if (l0Var == null) {
            return null;
        }
        i0Var.getContext();
        return l0Var.e(i10, i11, i12);
    }

    public Object getKeyframeAtLocation(Object obj, float f10, float f11) {
        s sVar;
        float f12;
        float f13;
        View view = (View) obj;
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            return -1;
        }
        if (view == null || (sVar = (s) i0Var.f57003m.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        RectF rectF = new RectF();
        j0 j0Var = sVar.f57225f;
        float f14 = j0Var.f57036g;
        rectF.left = f14;
        float f15 = j0Var.f57037h;
        rectF.top = f15;
        rectF.right = f14 + j0Var.f57038i;
        rectF.bottom = f15 + j0Var.f57039j;
        RectF rectF2 = new RectF();
        j0 j0Var2 = sVar.f57226g;
        float f16 = j0Var2.f57036g;
        rectF2.left = f16;
        float f17 = j0Var2.f57037h;
        rectF2.top = f17;
        rectF2.right = f16 + j0Var2.f57038i;
        rectF2.bottom = f17 + j0Var2.f57039j;
        Iterator it = sVar.f57242w.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof l) {
                l lVar = (l) dVar;
                f12 = f10;
                f13 = f11;
                if (lVar.intersects(width, height, rectF, rectF2, f12, f13)) {
                    return lVar;
                }
            } else {
                f12 = f10;
                f13 = f11;
            }
            f10 = f12;
            f11 = f13;
        }
        return null;
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f10, float f11, String[] strArr, float[] fArr) {
        if (!(obj instanceof l)) {
            return Boolean.FALSE;
        }
        l lVar = (l) obj;
        i0 i0Var = this.f56913a;
        View view = (View) obj2;
        s sVar = (s) i0Var.f57003m.get(view);
        sVar.getClass();
        RectF rectF = new RectF();
        j0 j0Var = sVar.f57225f;
        float f12 = j0Var.f57036g;
        rectF.left = f12;
        float f13 = j0Var.f57037h;
        rectF.top = f13;
        rectF.right = f12 + j0Var.f57038i;
        rectF.bottom = f13 + j0Var.f57039j;
        RectF rectF2 = new RectF();
        j0 j0Var2 = sVar.f57226g;
        float f14 = j0Var2.f57036g;
        rectF2.left = f14;
        float f15 = j0Var2.f57037h;
        rectF2.top = f15;
        rectF2.right = f14 + j0Var2.f57038i;
        rectF2.bottom = f15 + j0Var2.f57039j;
        lVar.positionAttributes(view, rectF, rectF2, f10, f11, strArr, fArr);
        i0Var.rebuildScene();
        i0Var.f57019u = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        return this.f56913a.getProgress();
    }

    public String getStartState() {
        i0 i0Var = this.f56913a;
        int startState = i0Var.getStartState();
        if (this.f56916d == startState) {
            return this.f56914b;
        }
        l0 l0Var = i0Var.f56982b;
        String strLookUpConstraintName = l0Var == null ? null : l0Var.lookUpConstraintName(startState);
        if (strLookUpConstraintName != null) {
            this.f56914b = strLookUpConstraintName;
            this.f56916d = startState;
        }
        l0 l0Var2 = i0Var.f56982b;
        if (l0Var2 == null) {
            return null;
        }
        return l0Var2.lookUpConstraintName(startState);
    }

    public String getState() {
        if (this.f56914b != null && this.f56915c != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f56914b;
            }
            if (progress >= 0.99f) {
                return this.f56915c;
            }
        }
        return this.f56914b;
    }

    public long getTransitionTimeMs() {
        return this.f56913a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return (this.f56914b == null || this.f56915c == null) ? false : true;
    }

    public void setAttributes(int i10, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = obj2 instanceof HashMap ? (HashMap) obj2 : new HashMap();
        i0 i0Var = this.f56913a;
        l0 l0Var = i0Var.f56982b;
        int iLookUpConstraintId = l0Var == null ? 0 : l0Var.lookUpConstraintId(str);
        androidx.constraintlayout.widget.k kVarB = i0Var.f56982b.b(iLookUpConstraintId);
        if (kVarB == null) {
            return;
        }
        kVarB.clear(view.getId());
        d(i10, kVarB, view, map, 0);
        d(i10, kVarB, view, map, 1);
        a(i10, kVarB, view, map, 6, 6);
        a(i10, kVarB, view, map, 6, 7);
        a(i10, kVarB, view, map, 7, 7);
        a(i10, kVarB, view, map, 7, 6);
        a(i10, kVarB, view, map, 1, 1);
        a(i10, kVarB, view, map, 1, 2);
        a(i10, kVarB, view, map, 2, 2);
        a(i10, kVarB, view, map, 2, 1);
        a(i10, kVarB, view, map, 3, 3);
        a(i10, kVarB, view, map, 3, 4);
        a(i10, kVarB, view, map, 4, 3);
        a(i10, kVarB, view, map, 4, 4);
        a(i10, kVarB, view, map, 5, 5);
        c(kVarB, view, map, 0);
        c(kVarB, view, map, 1);
        String str2 = (String) map.get("layout_editor_absoluteX");
        if (str2 != null) {
            kVarB.setEditorAbsoluteX(view.getId(), b(i10, str2));
        }
        String str3 = (String) map.get("layout_editor_absoluteY");
        if (str3 != null) {
            kVarB.setEditorAbsoluteY(view.getId(), b(i10, str3));
        }
        i0Var.updateState(iLookUpConstraintId, kVarB);
        i0Var.requestLayout();
    }

    public void setKeyFrame(Object obj, int i10, String str, Object obj2) {
        i0 i0Var = this.f56913a;
        l0 l0Var = i0Var.f56982b;
        if (l0Var != null) {
            l0Var.setKeyframe((View) obj, i10, str, obj2);
            i0Var.f57015s = i10 / 100.0f;
            i0Var.f57011q = 0.0f;
            i0Var.rebuildScene();
            i0Var.j(true);
        }
    }

    public boolean setKeyFramePosition(Object obj, int i10, int i11, float f10, float f11) {
        if (!(obj instanceof View)) {
            return false;
        }
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b != null) {
            s sVar = (s) i0Var.f57003m.get(obj);
            int i12 = (int) (i0Var.f57009p * 100.0f);
            if (sVar != null) {
                View view = (View) obj;
                l0.a aVar = i0Var.f56982b.f57066c;
                if (aVar != null) {
                    Iterator it = aVar.f57094k.iterator();
                    while (it.hasNext()) {
                        Iterator<d> it2 = ((i) it.next()).getKeyFramesForView(view.getId()).iterator();
                        while (it2.hasNext()) {
                            if (it2.next().f56925a == i12) {
                                float fE = sVar.e(f10, 2, f11);
                                float fE2 = sVar.e(f10, 5, f11);
                                i0Var.f56982b.setKeyframe(view, i12, "motion:percentX", Float.valueOf(fE));
                                i0Var.f56982b.setKeyframe(view, i12, "motion:percentY", Float.valueOf(fE2));
                                i0Var.rebuildScene();
                                i0Var.j(true);
                                i0Var.invalidate();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof d) {
            ((d) obj).setValue(str, obj2);
            i0 i0Var = this.f56913a;
            i0Var.rebuildScene();
            i0Var.f57019u = true;
        }
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (Objects.equals(this.f56914b, str)) {
            return;
        }
        this.f56914b = str;
        this.f56915c = null;
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            i0Var.f56982b = null;
        }
        l0 l0Var = i0Var.f56982b;
        int iLookUpConstraintId = l0Var == null ? 0 : l0Var.lookUpConstraintId(str);
        this.f56916d = iLookUpConstraintId;
        if (iLookUpConstraintId != 0) {
            if (iLookUpConstraintId == i0Var.getStartState()) {
                i0Var.setProgress(0.0f);
            } else if (iLookUpConstraintId == i0Var.getEndState()) {
                i0Var.setProgress(1.0f);
            } else {
                i0Var.transitionToState(iLookUpConstraintId);
                i0Var.setProgress(1.0f);
            }
        }
        i0Var.requestLayout();
    }

    public void setToolPosition(float f10) {
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            i0Var.f56982b = null;
        }
        i0Var.setProgress(f10);
        i0Var.j(true);
        i0Var.requestLayout();
        i0Var.invalidate();
    }

    public void setTransition(String str, String str2) {
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            i0Var.f56982b = null;
        }
        l0 l0Var = i0Var.f56982b;
        int iLookUpConstraintId = l0Var == null ? 0 : l0Var.lookUpConstraintId(str);
        l0 l0Var2 = i0Var.f56982b;
        int iLookUpConstraintId2 = l0Var2 != null ? l0Var2.lookUpConstraintId(str2) : 0;
        i0Var.setTransition(iLookUpConstraintId, iLookUpConstraintId2);
        this.f56916d = iLookUpConstraintId;
        this.f56917e = iLookUpConstraintId2;
        this.f56914b = str;
        this.f56915c = str2;
    }

    public void setViewDebug(Object obj, int i10) {
        if (obj instanceof View) {
            i0 i0Var = this.f56913a;
            s sVar = (s) i0Var.f57003m.get(obj);
            if (sVar != null) {
                sVar.setDrawPath(i10);
                i0Var.invalidate();
            }
        }
    }

    public Object getKeyframe(Object obj, int i10, int i11) {
        i0 i0Var = this.f56913a;
        if (i0Var.f56982b == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        l0 l0Var = i0Var.f56982b;
        i0Var.getContext();
        return l0Var.e(i10, id2, i11);
    }
}
