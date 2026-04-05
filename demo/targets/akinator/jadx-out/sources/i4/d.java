package i4;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import x3.z1;
import y3.n;
import y3.o;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d extends x3.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f59386n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final a f59387o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f59388p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f59393h;

    /* renamed from: i, reason: collision with root package name */
    public final View f59394i;

    /* renamed from: j, reason: collision with root package name */
    public c f59395j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f59389d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f59390e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f59391f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f59392g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f59396k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f59397l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f59398m = Integer.MIN_VALUE;

    public d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f59394i = view;
        this.f59393h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (z1.getImportantForAccessibility(view) == 0) {
            z1.setImportantForAccessibility(view, 1);
        }
    }

    public final AccessibilityEvent a(int i10, int i11) {
        View view = this.f59394i;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        y3.c cVarF = f(i10);
        accessibilityEventObtain2.getText().add(cVarF.getText());
        accessibilityEventObtain2.setContentDescription(cVarF.getContentDescription());
        accessibilityEventObtain2.setScrollable(cVarF.isScrollable());
        accessibilityEventObtain2.setPassword(cVarF.isPassword());
        accessibilityEventObtain2.setEnabled(cVarF.isEnabled());
        accessibilityEventObtain2.setChecked(cVarF.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(cVarF.getClassName());
        o.setSource(accessibilityEventObtain2, view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final y3.c b(int i10) {
        y3.c cVarObtain = y3.c.obtain();
        cVarObtain.setEnabled(true);
        cVarObtain.setFocusable(true);
        cVarObtain.setClassName("android.view.View");
        Rect rect = f59386n;
        cVarObtain.setBoundsInParent(rect);
        cVarObtain.setBoundsInScreen(rect);
        View view = this.f59394i;
        cVarObtain.setParent(view);
        i(i10, cVarObtain);
        if (cVarObtain.getText() == null && cVarObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f59390e;
        cVarObtain.getBoundsInParent(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = cVarObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cVarObtain.setPackageName(view.getContext().getPackageName());
        cVarObtain.setSource(view, i10);
        if (this.f59396k == i10) {
            cVarObtain.setAccessibilityFocused(true);
            cVarObtain.addAction(128);
        } else {
            cVarObtain.setAccessibilityFocused(false);
            cVarObtain.addAction(64);
        }
        boolean z10 = this.f59397l == i10;
        if (z10) {
            cVarObtain.addAction(2);
        } else if (cVarObtain.isFocusable()) {
            cVarObtain.addAction(1);
        }
        cVarObtain.setFocused(z10);
        int[] iArr = this.f59392g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f59389d;
        cVarObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            cVarObtain.getBoundsInParent(rect3);
            if (cVarObtain.f94035b != -1) {
                y3.c cVarObtain2 = y3.c.obtain();
                for (int i11 = cVarObtain.f94035b; i11 != -1; i11 = cVarObtain2.f94035b) {
                    cVarObtain2.setParent(view, -1);
                    cVarObtain2.setBoundsInParent(rect);
                    i(i11, cVarObtain2);
                    cVarObtain2.getBoundsInParent(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
                cVarObtain2.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f59391f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                cVarObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            cVarObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return cVarObtain;
    }

    public abstract int c(float f10, float f11);

    public final boolean clearKeyboardFocusForVirtualView(int i10) {
        if (this.f59397l != i10) {
            return false;
        }
        this.f59397l = Integer.MIN_VALUE;
        j(i10, false);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public abstract void d(ArrayList arrayList);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f59393h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iC = c(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f59398m;
            if (i11 != iC) {
                this.f59398m = iC;
                sendEventForVirtualView(iC, 128);
                sendEventForVirtualView(i11, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            if (iC == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i10 = this.f59398m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f59398m = Integer.MIN_VALUE;
                sendEventForVirtualView(Integer.MIN_VALUE, 128);
                sendEventForVirtualView(i10, NotificationCompat.FLAG_LOCAL_ONLY);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L75
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L5e
            r3 = 66
            if (r0 == r3) goto L46
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L46;
                default: goto L18;
            }
        L18:
            goto L75
        L19:
            boolean r5 = r7.hasNoModifiers()
            if (r5 == 0) goto L75
            r5 = 19
            if (r0 == r5) goto L31
            r5 = 21
            if (r0 == r5) goto L2e
            r5 = 22
            if (r0 == r5) goto L33
            r3 = 130(0x82, float:1.82E-43)
            goto L33
        L2e:
            r3 = 17
            goto L33
        L31:
            r3 = 33
        L33:
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r0 = r1
        L39:
            if (r1 >= r7) goto L45
            boolean r5 = r6.e(r3, r4)
            if (r5 == 0) goto L45
            int r1 = r1 + 1
            r0 = r2
            goto L39
        L45:
            return r0
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L75
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L75
            int r7 = r6.f59397l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L5d
            r0 = 16
            r6.g(r7, r0)
        L5d:
            return r2
        L5e:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L6a
            r7 = 2
            boolean r7 = r6.e(r7, r4)
            return r7
        L6a:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L75
            boolean r7 = r6.e(r2, r4)
            return r7
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean e(int i10, Rect rect) {
        y3.c cVar;
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        u1 u1Var = new u1();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u1Var.put(((Integer) arrayList.get(i11)).intValue(), b(((Integer) arrayList.get(i11)).intValue()));
        }
        int i12 = this.f59397l;
        y3.c cVar2 = i12 == Integer.MIN_VALUE ? null : (y3.c) u1Var.get(i12);
        a aVar = f59387o;
        b bVar = f59388p;
        View view = this.f59394i;
        if (i10 == 1 || i10 == 2) {
            cVar = (y3.c) h.findNextFocusInRelativeDirection(u1Var, bVar, aVar, cVar2, i10, z1.getLayoutDirection(view) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f59397l;
            if (i13 != Integer.MIN_VALUE) {
                f(i13).getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i10 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i10 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i10 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            cVar = (y3.c) h.findNextFocusInAbsoluteDirection(u1Var, bVar, aVar, cVar2, rect2, i10);
        }
        return requestKeyboardFocusForVirtualView(cVar != null ? u1Var.keyAt(u1Var.indexOfValue(cVar)) : Integer.MIN_VALUE);
    }

    public final y3.c f(int i10) {
        if (i10 != -1) {
            return b(i10);
        }
        View view = this.f59394i;
        y3.c cVarObtain = y3.c.obtain(view);
        z1.onInitializeAccessibilityNodeInfo(view, cVarObtain);
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        if (cVarObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVarObtain.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return cVarObtain;
    }

    public abstract boolean g(int i10, int i11);

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f59396k;
    }

    @Override // x3.b
    public n getAccessibilityNodeProvider(View view) {
        if (this.f59395j == null) {
            this.f59395j = new c(this);
        }
        return this.f59395j;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f59397l;
    }

    public abstract void i(int i10, y3.c cVar);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i10) {
        invalidateVirtualView(i10, 0);
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.f59397l;
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (z10) {
            e(i10, rect);
        }
    }

    @Override // x3.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        h(cVar);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i10) {
        int i11;
        View view = this.f59394i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f59397l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f59397l = i10;
        j(i10, true);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f59393h.isEnabled() || (parent = (view = this.f59394i).getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(view, a(i10, i11));
    }

    public final void invalidateVirtualView(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f59393h.isEnabled() || (parent = (view = this.f59394i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventA = a(i10, 2048);
        y3.b.setContentChangeTypes(accessibilityEventA, i11);
        parent.requestSendAccessibilityEvent(view, accessibilityEventA);
    }

    public void h(y3.c cVar) {
    }

    public void j(int i10, boolean z10) {
    }
}
