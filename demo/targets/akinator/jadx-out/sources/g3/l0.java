package g3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.core.app.NotificationCompat;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f57064a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.w f57065b;

    /* renamed from: c, reason: collision with root package name */
    public a f57066c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57067d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f57068e;

    /* renamed from: f, reason: collision with root package name */
    public final a f57069f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f57070g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f57071h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f57072i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseIntArray f57073j;

    /* renamed from: k, reason: collision with root package name */
    public int f57074k;

    /* renamed from: l, reason: collision with root package name */
    public int f57075l;

    /* renamed from: m, reason: collision with root package name */
    public MotionEvent f57076m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f57077n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f57078o;

    /* renamed from: p, reason: collision with root package name */
    public e0 f57079p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f57080q;

    /* renamed from: r, reason: collision with root package name */
    public final u0 f57081r;

    /* renamed from: s, reason: collision with root package name */
    public float f57082s;

    /* renamed from: t, reason: collision with root package name */
    public float f57083t;

    public l0(i0 i0Var) {
        this.f57065b = null;
        this.f57066c = null;
        this.f57067d = false;
        this.f57068e = new ArrayList();
        this.f57069f = null;
        this.f57070g = new ArrayList();
        this.f57071h = new SparseArray();
        this.f57072i = new HashMap();
        this.f57073j = new SparseIntArray();
        this.f57074k = 400;
        this.f57075l = 0;
        this.f57077n = false;
        this.f57078o = false;
        this.f57064a = i0Var;
        this.f57081r = new u0(i0Var);
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public final boolean a(i0 i0Var, int i10) {
        a aVar;
        int i11;
        int i12;
        if (this.f57079p != null || this.f57067d) {
            return false;
        }
        Iterator it = this.f57068e.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f57097n != 0 && ((aVar = this.f57066c) != aVar2 || !aVar.isTransitionFlag(2))) {
                int i13 = aVar2.f57087d;
                h0 h0Var = h0.f56976f;
                h0 h0Var2 = h0.f56975e;
                h0 h0Var3 = h0.f56974c;
                if (i10 == i13 && ((i12 = aVar2.f57097n) == 4 || i12 == 2)) {
                    i0Var.setState(h0Var);
                    i0Var.setTransition(aVar2);
                    if (aVar2.f57097n == 4) {
                        i0Var.transitionToEnd();
                        i0Var.setState(h0Var3);
                        i0Var.setState(h0Var2);
                        return true;
                    }
                    i0Var.setProgress(1.0f);
                    i0Var.j(true);
                    i0Var.setState(h0Var3);
                    i0Var.setState(h0Var2);
                    i0Var.setState(h0Var);
                    i0Var.p();
                    return true;
                }
                if (i10 == aVar2.f57086c && ((i11 = aVar2.f57097n) == 3 || i11 == 1)) {
                    i0Var.setState(h0Var);
                    i0Var.setTransition(aVar2);
                    if (aVar2.f57097n == 3) {
                        i0Var.transitionToStart();
                        i0Var.setState(h0Var3);
                        i0Var.setState(h0Var2);
                        return true;
                    }
                    i0Var.setProgress(0.0f);
                    i0Var.j(true);
                    i0Var.setState(h0Var3);
                    i0Var.setState(h0Var2);
                    i0Var.setState(h0Var);
                    i0Var.p();
                    return true;
                }
            }
        }
        return false;
    }

    public void addOnClickListeners(i0 i0Var, int i10) {
        ArrayList arrayList = this.f57068e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f57096m.size() > 0) {
                Iterator it2 = aVar.f57096m.iterator();
                while (it2.hasNext()) {
                    ((a.ViewOnClickListenerC0571a) it2.next()).removeOnClickListeners(i0Var);
                }
            }
        }
        ArrayList arrayList2 = this.f57070g;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            a aVar2 = (a) it3.next();
            if (aVar2.f57096m.size() > 0) {
                Iterator it4 = aVar2.f57096m.iterator();
                while (it4.hasNext()) {
                    ((a.ViewOnClickListenerC0571a) it4.next()).removeOnClickListeners(i0Var);
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            a aVar3 = (a) it5.next();
            if (aVar3.f57096m.size() > 0) {
                Iterator it6 = aVar3.f57096m.iterator();
                while (it6.hasNext()) {
                    ((a.ViewOnClickListenerC0571a) it6.next()).addOnClickListeners(i0Var, i10, aVar3);
                }
            }
        }
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            a aVar4 = (a) it7.next();
            if (aVar4.f57096m.size() > 0) {
                Iterator it8 = aVar4.f57096m.iterator();
                while (it8.hasNext()) {
                    ((a.ViewOnClickListenerC0571a) it8.next()).addOnClickListeners(i0Var, i10, aVar4);
                }
            }
        }
    }

    public void addTransition(a aVar) {
        int iD = d(aVar);
        ArrayList arrayList = this.f57068e;
        if (iD == -1) {
            arrayList.add(aVar);
        } else {
            arrayList.set(iD, aVar);
        }
    }

    public boolean applyViewTransition(int i10, s sVar) {
        Iterator it = this.f57081r.f57278b.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (s0Var.f57246a == i10) {
                s0Var.f57251f.addAllFrames(sVar);
                return true;
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.k b(int i10) {
        int iStateGetConstraintID;
        androidx.constraintlayout.widget.w wVar = this.f57065b;
        if (wVar != null && (iStateGetConstraintID = wVar.stateGetConstraintID(i10, -1, -1)) != -1) {
            i10 = iStateGetConstraintID;
        }
        SparseArray sparseArray = this.f57071h;
        if (sparseArray.get(i10) != null) {
            return (androidx.constraintlayout.widget.k) sparseArray.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + b.getName(this.f57064a.getContext(), i10) + " In MotionScene");
        return (androidx.constraintlayout.widget.k) sparseArray.get(sparseArray.keyAt(0));
    }

    public a bestTransitionFor(int i10, float f10, float f11, MotionEvent motionEvent) {
        p0 p0Var;
        if (i10 == -1) {
            return this.f57066c;
        }
        List<a> transitionsWithState = getTransitionsWithState(i10);
        RectF rectF = new RectF();
        float f12 = 0.0f;
        a aVar = null;
        for (a aVar2 : transitionsWithState) {
            if (!aVar2.f57098o && (p0Var = aVar2.f57095l) != null) {
                p0Var.setRTL(this.f57080q);
                p0 p0Var2 = aVar2.f57095l;
                i0 i0Var = this.f57064a;
                RectF rectFB = p0Var2.b(i0Var, rectF);
                if (rectFB == null || motionEvent == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFA = aVar2.f57095l.a(i0Var, rectF);
                    if (rectFA == null || motionEvent == null || rectFA.contains(motionEvent.getX(), motionEvent.getY())) {
                        p0 p0Var3 = aVar2.f57095l;
                        float fAtan2 = (p0Var3.f57173l * f11) + (p0Var3.f57172k * f10);
                        if (p0Var3.f57171j && motionEvent != null) {
                            float x10 = motionEvent.getX();
                            aVar2.f57095l.getClass();
                            float y10 = motionEvent.getY();
                            aVar2.f57095l.getClass();
                            fAtan2 = ((float) (Math.atan2(f11 + r7, f10 + r5) - Math.atan2(x10 - 0.5f, y10 - 0.5f))) * 10.0f;
                        }
                        float f13 = fAtan2 * (aVar2.f57086c == i10 ? -1.0f : 1.1f);
                        if (f13 > f12) {
                            aVar = aVar2;
                            f12 = f13;
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public final int d(a aVar) {
        int i10 = aVar.f57084a;
        if (i10 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57068e;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((a) arrayList.get(i11)).f57084a == i10) {
                return i11;
            }
            i11++;
        }
    }

    public void disableAutoTransition(boolean z10) {
        this.f57067d = z10;
    }

    public final d e(int i10, int i11, int i12) {
        a aVar = this.f57066c;
        if (aVar == null) {
            return null;
        }
        Iterator it = aVar.f57094k.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            for (Integer num : iVar.getKeys()) {
                if (i11 == num.intValue()) {
                    Iterator<d> it2 = iVar.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        d next = it2.next();
                        if (next.f56925a == i12 && next.f56928d == i10) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void enableViewTransition(int i10, boolean z10) {
        Iterator it = this.f57081r.f57278b.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (s0Var.f57246a == i10) {
                s0Var.f57248c = !z10;
                return;
            }
        }
    }

    public final float f() {
        p0 p0Var;
        a aVar = this.f57066c;
        if (aVar == null || (p0Var = aVar.f57095l) == null) {
            return 0.0f;
        }
        return p0Var.f57181t;
    }

    public final int g() {
        a aVar = this.f57066c;
        if (aVar == null) {
            return -1;
        }
        return aVar.f57087d;
    }

    public int gatPathMotionArc() {
        a aVar = this.f57066c;
        if (aVar != null) {
            return aVar.f57099p;
        }
        return -1;
    }

    public androidx.constraintlayout.widget.k getConstraintSet(Context context, String str) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f57071h;
            if (i10 >= sparseArray.size()) {
                return null;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            if (str.equals(context.getResources().getResourceName(iKeyAt))) {
                return (androidx.constraintlayout.widget.k) sparseArray.get(iKeyAt);
            }
            i10++;
        }
    }

    public int[] getConstraintSetIds() {
        SparseArray sparseArray = this.f57071h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList<a> getDefinedTransitions() {
        return this.f57068e;
    }

    public int getDuration() {
        a aVar = this.f57066c;
        return aVar != null ? aVar.f57091h : this.f57074k;
    }

    public Interpolator getInterpolator() {
        a aVar = this.f57066c;
        int i10 = aVar.f57088e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f57064a.getContext(), this.f57066c.f57090g);
        }
        if (i10 == -1) {
            return new k0(a3.g.getInterpolator(aVar.f57089f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void getKeyFrames(s sVar) {
        a aVar = this.f57066c;
        if (aVar != null) {
            Iterator it = aVar.f57094k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).addFrames(sVar);
            }
        } else {
            a aVar2 = this.f57069f;
            if (aVar2 != null) {
                Iterator it2 = aVar2.f57094k.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).addFrames(sVar);
                }
            }
        }
    }

    public int[] getMatchingStateLabels(String... strArr) {
        SparseArray sparseArray = this.f57071h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.constraintlayout.widget.k kVar = (androidx.constraintlayout.widget.k) sparseArray.valueAt(i11);
            int iKeyAt = sparseArray.keyAt(i11);
            if (kVar.matchesLabels(strArr)) {
                kVar.getStateLabels();
                iArr[i10] = iKeyAt;
                i10++;
            }
        }
        return Arrays.copyOf(iArr, i10);
    }

    public float getPathPercent(View view, int i10) {
        return 0.0f;
    }

    public float getStaggered() {
        a aVar = this.f57066c;
        if (aVar != null) {
            return aVar.f57092i;
        }
        return 0.0f;
    }

    public a getTransitionById(int i10) {
        Iterator it = this.f57068e.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f57084a == i10) {
                return aVar;
            }
        }
        return null;
    }

    public List<a> getTransitionsWithState(int i10) {
        int iStateGetConstraintID;
        androidx.constraintlayout.widget.w wVar = this.f57065b;
        if (wVar != null && (iStateGetConstraintID = wVar.stateGetConstraintID(i10, -1, -1)) != -1) {
            i10 = iStateGetConstraintID;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f57068e.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f57087d == i10 || aVar.f57086c == i10) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.content.Context r14, android.content.res.XmlResourceParser r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.l0.h(android.content.Context, android.content.res.XmlResourceParser):int");
    }

    public final int i(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
            return -1;
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
            return -1;
        }
    }

    public boolean isViewTransitionEnabled(int i10) {
        Iterator it = this.f57081r.f57278b.iterator();
        while (it.hasNext()) {
            if (((s0) it.next()).f57246a == i10) {
                return !r1.f57248c;
            }
        }
        return false;
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.f5567z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.f5557p);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f57074k);
                this.f57074k = i11;
                if (i11 < 8) {
                    this.f57074k = 8;
                }
            } else if (index == 1) {
                this.f57075l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int lookUpConstraintId(String str) {
        Integer num = (Integer) this.f57072i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i10) {
        for (Map.Entry entry : this.f57072i.entrySet()) {
            Integer num = (Integer) entry.getValue();
            if (num != null && num.intValue() == i10) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public final void m(i0 i0Var) {
        int i10 = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.f57071h;
            if (i10 >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            SparseIntArray sparseIntArray = this.f57073j;
            int i11 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i11 > 0) {
                if (i11 == iKeyAt) {
                    break loop0;
                }
                int i12 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i11 = sparseIntArray.get(i11);
                size = i12;
            }
            l(i0Var, iKeyAt);
            i10++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r9, int r10) {
        /*
            r8 = this;
            r0 = -1
            androidx.constraintlayout.widget.w r1 = r8.f57065b
            if (r1 == 0) goto L18
            int r1 = r1.stateGetConstraintID(r9, r0, r0)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r9
        Ld:
            androidx.constraintlayout.widget.w r2 = r8.f57065b
            int r2 = r2.stateGetConstraintID(r10, r0, r0)
            if (r2 == r0) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r1 = r9
            goto L16
        L1a:
            g3.l0$a r3 = r8.f57066c
            if (r3 == 0) goto L27
            int r4 = r3.f57086c
            if (r4 != r10) goto L27
            int r3 = r3.f57087d
            if (r3 != r9) goto L27
            goto L52
        L27:
            java.util.ArrayList r3 = r8.f57068e
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            g3.l0$a r5 = (g3.l0.a) r5
            int r6 = r5.f57086c
            if (r6 != r2) goto L41
            int r7 = r5.f57087d
            if (r7 == r1) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.f57087d
            if (r6 != r9) goto L2d
        L47:
            r8.f57066c = r5
            g3.p0 r9 = r5.f57095l
            if (r9 == 0) goto L52
            boolean r10 = r8.f57080q
            r9.setRTL(r10)
        L52:
            return
        L53:
            java.util.ArrayList r9 = r8.f57070g
            java.util.Iterator r9 = r9.iterator()
            g3.l0$a r4 = r8.f57069f
        L5b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            g3.l0$a r5 = (g3.l0.a) r5
            int r6 = r5.f57086c
            if (r6 != r10) goto L5b
            r4 = r5
            goto L5b
        L6d:
            g3.l0$a r9 = new g3.l0$a
            r9.<init>(r8, r4)
            r9.f57087d = r1
            r9.f57086c = r2
            if (r1 == r0) goto L7b
            r3.add(r9)
        L7b:
            r8.f57066c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.l0.n(int, int):void");
    }

    public final boolean o() {
        Iterator it = this.f57068e.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f57095l != null) {
                return true;
            }
        }
        a aVar = this.f57066c;
        return (aVar == null || aVar.f57095l == null) ? false : true;
    }

    public void removeTransition(a aVar) {
        int iD = d(aVar);
        if (iD != -1) {
            this.f57068e.remove(iD);
        }
    }

    public void setConstraintSet(int i10, androidx.constraintlayout.widget.k kVar) {
        this.f57071h.put(i10, kVar);
    }

    public void setDuration(int i10) {
        a aVar = this.f57066c;
        if (aVar != null) {
            aVar.setDuration(i10);
        } else {
            this.f57074k = i10;
        }
    }

    public void setKeyframe(View view, int i10, String str, Object obj) {
        a aVar = this.f57066c;
        if (aVar == null) {
            return;
        }
        Iterator it = aVar.f57094k.iterator();
        while (it.hasNext()) {
            Iterator<d> it2 = ((i) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f56925a == i10 && obj != null) {
                }
            }
        }
    }

    public void setRtl(boolean z10) {
        p0 p0Var;
        this.f57080q = z10;
        a aVar = this.f57066c;
        if (aVar == null || (p0Var = aVar.f57095l) == null) {
            return;
        }
        p0Var.setRTL(z10);
    }

    public void setTransition(a aVar) {
        p0 p0Var;
        this.f57066c = aVar;
        if (aVar == null || (p0Var = aVar.f57095l) == null) {
            return;
        }
        p0Var.setRTL(this.f57080q);
    }

    public boolean validateLayout(i0 i0Var) {
        return i0Var == this.f57064a && i0Var.f56982b == this;
    }

    public void viewTransition(int i10, View... viewArr) {
        u0 u0Var = this.f57081r;
        String str = u0Var.f57280d;
        ArrayList arrayList = new ArrayList();
        Iterator it = u0Var.f57278b.iterator();
        s0 s0Var = null;
        while (it.hasNext()) {
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.f57246a == i10) {
                for (View view : viewArr) {
                    if (s0Var2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0Var = s0Var2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    i0 i0Var = u0Var.f57277a;
                    int currentState = i0Var.getCurrentState();
                    if (s0Var2.f57250e != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + i0Var.toString());
                        } else {
                            androidx.constraintlayout.widget.k constraintSet = i0Var.getConstraintSet(currentState);
                            if (constraintSet != null) {
                                s0Var = s0Var2;
                                s0Var.a(u0Var, u0Var.f57277a, currentState, constraintSet, viewArr2);
                            }
                        }
                        s0Var = s0Var2;
                    } else {
                        s0Var = s0Var2;
                        s0Var.a(u0Var, u0Var.f57277a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (s0Var == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    public final void l(i0 i0Var, int i10) {
        SparseArray sparseArray = this.f57071h;
        androidx.constraintlayout.widget.k kVar = (androidx.constraintlayout.widget.k) sparseArray.get(i10);
        kVar.f5430c = kVar.f5429b;
        int i11 = this.f57073j.get(i10);
        if (i11 > 0) {
            l(i0Var, i11);
            androidx.constraintlayout.widget.k kVar2 = (androidx.constraintlayout.widget.k) sparseArray.get(i11);
            if (kVar2 == null) {
                Log.e(KGUkpTlXZlJLy.sXan, "ERROR! invalid deriveConstraintsFrom: @id/" + b.getName(this.f57064a.getContext(), i11));
                return;
            }
            kVar.f5430c += "/" + kVar2.f5430c;
            kVar.readFallback(kVar2);
        } else {
            kVar.f5430c = o2.o(new StringBuilder(), kVar.f5430c, "  layout");
            kVar.readFallback(i0Var);
        }
        kVar.applyDeltaFrom(kVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f57084a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57085b;

        /* renamed from: c, reason: collision with root package name */
        public int f57086c;

        /* renamed from: d, reason: collision with root package name */
        public int f57087d;

        /* renamed from: e, reason: collision with root package name */
        public int f57088e;

        /* renamed from: f, reason: collision with root package name */
        public String f57089f;

        /* renamed from: g, reason: collision with root package name */
        public int f57090g;

        /* renamed from: h, reason: collision with root package name */
        public int f57091h;

        /* renamed from: i, reason: collision with root package name */
        public float f57092i;

        /* renamed from: j, reason: collision with root package name */
        public final l0 f57093j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f57094k;

        /* renamed from: l, reason: collision with root package name */
        public p0 f57095l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f57096m;

        /* renamed from: n, reason: collision with root package name */
        public int f57097n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f57098o;

        /* renamed from: p, reason: collision with root package name */
        public int f57099p;

        /* renamed from: q, reason: collision with root package name */
        public int f57100q;

        /* renamed from: r, reason: collision with root package name */
        public int f57101r;

        public a(l0 l0Var, a aVar) {
            this.f57084a = -1;
            this.f57085b = false;
            this.f57086c = -1;
            this.f57087d = -1;
            this.f57088e = 0;
            this.f57089f = null;
            this.f57090g = -1;
            this.f57091h = 400;
            this.f57092i = 0.0f;
            this.f57094k = new ArrayList();
            this.f57095l = null;
            this.f57096m = new ArrayList();
            this.f57097n = 0;
            this.f57098o = false;
            this.f57099p = -1;
            this.f57100q = 0;
            this.f57101r = 0;
            this.f57093j = l0Var;
            this.f57091h = l0Var.f57074k;
            if (aVar != null) {
                this.f57099p = aVar.f57099p;
                this.f57088e = aVar.f57088e;
                this.f57089f = aVar.f57089f;
                this.f57090g = aVar.f57090g;
                this.f57091h = aVar.f57091h;
                this.f57094k = aVar.f57094k;
                this.f57092i = aVar.f57092i;
                this.f57100q = aVar.f57100q;
            }
        }

        public void addKeyFrame(i iVar) {
            this.f57094k.add(iVar);
        }

        public void addOnClick(int i10, int i11) {
            ArrayList arrayList = this.f57096m;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewOnClickListenerC0571a viewOnClickListenerC0571a = (ViewOnClickListenerC0571a) it.next();
                if (viewOnClickListenerC0571a.f57103c == i10) {
                    viewOnClickListenerC0571a.f57104e = i11;
                    return;
                }
            }
            arrayList.add(new ViewOnClickListenerC0571a(this, i10, i11));
        }

        public String debugString(Context context) {
            String resourceEntryName = this.f57087d == -1 ? AbstractJsonLexerKt.NULL : context.getResources().getResourceEntryName(this.f57087d);
            if (this.f57086c == -1) {
                return o2.l(resourceEntryName, " -> null");
            }
            StringBuilder sbT = a.b.t(resourceEntryName, " -> ");
            sbT.append(context.getResources().getResourceEntryName(this.f57086c));
            return sbT.toString();
        }

        public int getAutoTransition() {
            return this.f57097n;
        }

        public int getDuration() {
            return this.f57091h;
        }

        public int getEndConstraintSetId() {
            return this.f57086c;
        }

        public int getId() {
            return this.f57084a;
        }

        public List<i> getKeyFrameList() {
            return this.f57094k;
        }

        public int getLayoutDuringTransition() {
            return this.f57100q;
        }

        public List<ViewOnClickListenerC0571a> getOnClickList() {
            return this.f57096m;
        }

        public int getPathMotionArc() {
            return this.f57099p;
        }

        public float getStagger() {
            return this.f57092i;
        }

        public int getStartConstraintSetId() {
            return this.f57087d;
        }

        public p0 getTouchResponse() {
            return this.f57095l;
        }

        public boolean isEnabled() {
            return !this.f57098o;
        }

        public boolean isTransitionFlag(int i10) {
            return (i10 & this.f57101r) != 0;
        }

        public void removeOnClick(int i10) {
            ViewOnClickListenerC0571a viewOnClickListenerC0571a;
            ArrayList arrayList = this.f57096m;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    viewOnClickListenerC0571a = null;
                    break;
                } else {
                    viewOnClickListenerC0571a = (ViewOnClickListenerC0571a) it.next();
                    if (viewOnClickListenerC0571a.f57103c == i10) {
                        break;
                    }
                }
            }
            if (viewOnClickListenerC0571a != null) {
                arrayList.remove(viewOnClickListenerC0571a);
            }
        }

        public void setAutoTransition(int i10) {
            this.f57097n = i10;
        }

        public void setDuration(int i10) {
            this.f57091h = Math.max(i10, 8);
        }

        public void setEnabled(boolean z10) {
            this.f57098o = !z10;
        }

        public void setInterpolatorInfo(int i10, String str, int i11) {
            this.f57088e = i10;
            this.f57089f = str;
            this.f57090g = i11;
        }

        public void setLayoutDuringTransition(int i10) {
            this.f57100q = i10;
        }

        public void setOnSwipe(m0 m0Var) {
            this.f57095l = m0Var == null ? null : new p0(this.f57093j.f57064a, m0Var);
        }

        public void setOnTouchUp(int i10) {
            p0 touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i10);
            }
        }

        public void setPathMotionArc(int i10) {
            this.f57099p = i10;
        }

        public void setStagger(float f10) {
            this.f57092i = f10;
        }

        public void setTransitionFlag(int i10) {
            this.f57101r = i10;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.f57096m.add(new ViewOnClickListenerC0571a(context, this, xmlPullParser));
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: g3.l0$a$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0571a implements View.OnClickListener {

            /* renamed from: b, reason: collision with root package name */
            public final a f57102b;

            /* renamed from: c, reason: collision with root package name */
            public final int f57103c;

            /* renamed from: e, reason: collision with root package name */
            public int f57104e;

            public ViewOnClickListenerC0571a(Context context, a aVar, XmlPullParser xmlPullParser) {
                this.f57103c = -1;
                this.f57104e = 17;
                this.f57102b = aVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.r.f5558q);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f57103c = typedArrayObtainStyledAttributes.getResourceId(index, this.f57103c);
                    } else if (index == 0) {
                        this.f57104e = typedArrayObtainStyledAttributes.getInt(index, this.f57104e);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void addOnClickListeners(i0 i0Var, int i10, a aVar) {
                int i11 = this.f57103c;
                i0 i0VarFindViewById = i0Var;
                if (i11 != -1) {
                    i0VarFindViewById = i0Var.findViewById(i11);
                }
                if (i0VarFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i11);
                    return;
                }
                int i12 = aVar.f57087d;
                int i13 = aVar.f57086c;
                if (i12 == -1) {
                    i0VarFindViewById.setOnClickListener(this);
                    return;
                }
                int i14 = this.f57104e;
                boolean z10 = false;
                boolean z11 = ((i14 & 1) != 0 && i10 == i12) | ((i14 & 1) != 0 && i10 == i12) | ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z10 = true;
                }
                if (z11 || z10) {
                    i0VarFindViewById.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = this.f57102b;
                i0 i0Var = aVar.f57093j.f57064a;
                if (i0Var.isInteractionEnabled()) {
                    if (aVar.f57087d == -1) {
                        int currentState = i0Var.getCurrentState();
                        if (currentState == -1) {
                            i0Var.transitionToState(aVar.f57086c);
                            return;
                        }
                        a aVar2 = new a(aVar.f57093j, aVar);
                        aVar2.f57087d = currentState;
                        aVar2.f57086c = aVar.f57086c;
                        i0Var.setTransition(aVar2);
                        i0Var.transitionToEnd();
                        return;
                    }
                    a aVar3 = aVar.f57093j.f57066c;
                    int i10 = this.f57104e;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        if (aVar3 != aVar) {
                            i0Var.setTransition(aVar);
                        }
                        if (i0Var.getCurrentState() != i0Var.getEndState() && i0Var.getProgress() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (aVar != aVar3) {
                        int i11 = aVar.f57086c;
                        int i12 = aVar.f57087d;
                        if (i12 != -1) {
                            int i13 = i0Var.f56993h;
                            if (i13 != i12 && i13 != i11) {
                                return;
                            }
                        } else if (i0Var.f56993h == i11) {
                            return;
                        }
                    }
                    if (z10 && (this.f57104e & 1) != 0) {
                        i0Var.setTransition(aVar);
                        i0Var.transitionToEnd();
                        return;
                    }
                    if (z12 && (this.f57104e & 16) != 0) {
                        i0Var.setTransition(aVar);
                        i0Var.transitionToStart();
                    } else if (z10 && (this.f57104e & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                        i0Var.setTransition(aVar);
                        i0Var.setProgress(1.0f);
                    } else {
                        if (!z12 || (this.f57104e & 4096) == 0) {
                            return;
                        }
                        i0Var.setTransition(aVar);
                        i0Var.setProgress(0.0f);
                    }
                }
            }

            public void removeOnClickListeners(i0 i0Var) {
                int i10 = this.f57103c;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = i0Var.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i10);
            }

            public ViewOnClickListenerC0571a(a aVar, int i10, int i11) {
                this.f57102b = aVar;
                this.f57103c = i10;
                this.f57104e = i11;
            }
        }

        public a(int i10, l0 l0Var, int i11, int i12) {
            this.f57084a = -1;
            this.f57085b = false;
            this.f57086c = -1;
            this.f57087d = -1;
            this.f57088e = 0;
            this.f57089f = null;
            this.f57090g = -1;
            this.f57091h = 400;
            this.f57092i = 0.0f;
            this.f57094k = new ArrayList();
            this.f57095l = null;
            this.f57096m = new ArrayList();
            this.f57097n = 0;
            this.f57098o = false;
            this.f57099p = -1;
            this.f57100q = 0;
            this.f57101r = 0;
            this.f57084a = i10;
            this.f57093j = l0Var;
            this.f57087d = i11;
            this.f57086c = i12;
            this.f57091h = l0Var.f57074k;
            this.f57100q = l0Var.f57075l;
        }

        public a(l0 l0Var, Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f57084a = -1;
            this.f57085b = false;
            this.f57086c = -1;
            this.f57087d = -1;
            this.f57088e = 0;
            this.f57089f = null;
            this.f57090g = -1;
            this.f57091h = 400;
            this.f57092i = 0.0f;
            this.f57094k = new ArrayList();
            this.f57095l = null;
            this.f57096m = new ArrayList();
            this.f57097n = 0;
            this.f57098o = false;
            this.f57099p = -1;
            this.f57101r = 0;
            int i10 = l0Var.f57074k;
            SparseArray sparseArray = l0Var.f57071h;
            this.f57091h = i10;
            this.f57100q = l0Var.f57075l;
            this.f57093j = l0Var;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.f5564w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f57086c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f57086c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.k kVar = new androidx.constraintlayout.widget.k();
                        kVar.load(context, this.f57086c);
                        sparseArray.append(this.f57086c, kVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f57086c = l0Var.i(context, this.f57086c);
                    }
                } else if (index == 3) {
                    this.f57087d = typedArrayObtainStyledAttributes.getResourceId(index, this.f57087d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f57087d);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.k kVar2 = new androidx.constraintlayout.widget.k();
                        kVar2.load(context, this.f57087d);
                        sparseArray.append(this.f57087d, kVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f57087d = l0Var.i(context, this.f57087d);
                    }
                } else if (index == 6) {
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f57090g = resourceId;
                        if (resourceId != -1) {
                            this.f57088e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f57089f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f57090g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f57088e = -2;
                            } else {
                                this.f57088e = -1;
                            }
                        }
                    } else {
                        this.f57088e = typedArrayObtainStyledAttributes.getInteger(index, this.f57088e);
                    }
                } else if (index == 4) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f57091h);
                    this.f57091h = i13;
                    if (i13 < 8) {
                        this.f57091h = 8;
                    }
                } else if (index == 8) {
                    this.f57092i = typedArrayObtainStyledAttributes.getFloat(index, this.f57092i);
                } else if (index == 1) {
                    this.f57097n = typedArrayObtainStyledAttributes.getInteger(index, this.f57097n);
                } else if (index == 0) {
                    this.f57084a = typedArrayObtainStyledAttributes.getResourceId(index, this.f57084a);
                } else if (index == 9) {
                    this.f57098o = typedArrayObtainStyledAttributes.getBoolean(index, this.f57098o);
                } else if (index == 7) {
                    this.f57099p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f57100q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f57101r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f57087d == -1) {
                this.f57085b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public l0(Context context, i0 i0Var, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        a aVar = null;
        this.f57065b = null;
        this.f57066c = null;
        this.f57067d = false;
        ArrayList arrayList = new ArrayList();
        this.f57068e = arrayList;
        this.f57069f = null;
        this.f57070g = new ArrayList();
        this.f57071h = new SparseArray();
        this.f57072i = new HashMap();
        this.f57073j = new SparseIntArray();
        this.f57074k = 400;
        this.f57075l = 0;
        this.f57077n = false;
        this.f57078o = false;
        this.f57064a = i0Var;
        this.f57081r = new u0(i0Var);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                i iVar = new i(context, xml);
                                if (aVar != null) {
                                    aVar.f57094k.add(iVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (name.equals("Include")) {
                                j(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                this.f57081r.add(new s0(context, xml));
                                break;
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                aVar = new a(this, context, xml);
                                arrayList.add(aVar);
                                if (this.f57066c == null && !aVar.f57085b) {
                                    this.f57066c = aVar;
                                    p0 p0Var = aVar.f57095l;
                                    if (p0Var != null) {
                                        p0Var.setRTL(this.f57080q);
                                    }
                                }
                                if (aVar.f57085b) {
                                    if (aVar.f57086c == -1) {
                                        this.f57069f = aVar;
                                    } else {
                                        this.f57070g.add(aVar);
                                    }
                                    arrayList.remove(aVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && aVar != null && !i0Var.isInEditMode()) {
                                aVar.addOnClick(context, xml);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (aVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (aVar != null) {
                                    aVar.f57095l = new p0(context, i0Var, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f57065b = new androidx.constraintlayout.widget.w(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
        }
        this.f57071h.put(R.id.motion_base, new androidx.constraintlayout.widget.k());
        this.f57072i.put("motion_base", Integer.valueOf(R.id.motion_base));
    }
}
