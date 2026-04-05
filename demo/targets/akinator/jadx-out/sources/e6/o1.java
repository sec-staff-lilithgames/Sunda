package e6;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o1 extends c0 {
    public static final String[] S = {"android:visibility:visibility", "android:visibility:parent"};
    public int R;

    public o1() {
        this.R = 3;
    }

    public static void t(v0 v0Var) {
        int visibility = v0Var.f53875b.getVisibility();
        HashMap map = v0Var.f53874a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = v0Var.f53875b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e6.n1 u(e6.v0 r8, e6.v0 r9) {
        /*
            e6.n1 r0 = new e6.n1
            r0.<init>()
            r1 = 0
            r0.f53853a = r1
            r0.f53854b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f53874a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f53855c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f53857e = r6
            goto L33
        L2f:
            r0.f53855c = r3
            r0.f53857e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f53874a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f53856d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f53858f = r2
            goto L56
        L52:
            r0.f53856d = r3
            r0.f53858f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f53855c
            int r9 = r0.f53856d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f53857e
            android.view.ViewGroup r4 = r0.f53858f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f53854b = r1
            r0.f53853a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f53854b = r2
            r0.f53853a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f53858f
            if (r8 != 0) goto L81
            r0.f53854b = r1
            r0.f53853a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f53857e
            if (r8 != 0) goto L9f
            r0.f53854b = r2
            r0.f53853a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f53856d
            if (r8 != 0) goto L95
            r0.f53854b = r2
            r0.f53853a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f53855c
            if (r8 != 0) goto L9f
            r0.f53854b = r1
            r0.f53853a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.o1.u(e6.v0, e6.v0):e6.n1");
    }

    @Override // e6.c0
    public void captureEndValues(v0 v0Var) {
        t(v0Var);
    }

    @Override // e6.c0
    public void captureStartValues(v0 v0Var) {
        t(v0Var);
    }

    @Override // e6.c0
    public Animator createAnimator(ViewGroup viewGroup, v0 v0Var, v0 v0Var2) {
        n1 n1VarU = u(v0Var, v0Var2);
        if (!n1VarU.f53853a) {
            return null;
        }
        if (n1VarU.f53857e == null && n1VarU.f53858f == null) {
            return null;
        }
        return n1VarU.f53854b ? onAppear(viewGroup, v0Var, n1VarU.f53855c, v0Var2, n1VarU.f53856d) : onDisappear(viewGroup, v0Var, n1VarU.f53855c, v0Var2, n1VarU.f53856d);
    }

    public int getMode() {
        return this.R;
    }

    @Override // e6.c0
    public String[] getTransitionProperties() {
        return S;
    }

    @Override // e6.c0
    public boolean isTransitionRequired(v0 v0Var, v0 v0Var2) {
        if (v0Var == null && v0Var2 == null) {
            return false;
        }
        if (v0Var != null && v0Var2 != null && v0Var2.f53874a.containsKey("android:visibility:visibility") != v0Var.f53874a.containsKey("android:visibility:visibility")) {
            return false;
        }
        n1 n1VarU = u(v0Var, v0Var2);
        if (n1VarU.f53853a) {
            return n1VarU.f53855c == 0 || n1VarU.f53856d == 0;
        }
        return false;
    }

    public boolean isVisible(v0 v0Var) {
        if (v0Var == null) {
            return false;
        }
        HashMap map = v0Var.f53874a;
        return ((Integer) map.get("android:visibility:visibility")).intValue() == 0 && ((View) map.get("android:visibility:parent")) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, v0 v0Var, int i10, v0 v0Var2, int i11) {
        if ((this.R & 1) != 1 || v0Var2 == null) {
            return null;
        }
        View view = v0Var2.f53875b;
        if (v0Var == null) {
            View view2 = (View) view.getParent();
            if (u(i(view2, false), getTransitionValues(view2, false)).f53853a) {
                return null;
            }
        }
        return onAppear(viewGroup, view, v0Var, v0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r22, e6.v0 r23, int r24, e6.v0 r25, int r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.o1.onDisappear(android.view.ViewGroup, e6.v0, int, e6.v0, int):android.animation.Animator");
    }

    public void setMode(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.R = i10;
    }

    public o1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f53889c);
        int namedInt = n3.q.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public Animator onAppear(ViewGroup viewGroup, View view, v0 v0Var, v0 v0Var2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, v0 v0Var, v0 v0Var2) {
        return null;
    }
}
