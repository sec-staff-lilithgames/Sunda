package x3;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import android.view.contentcapture.ContentCaptureSession;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.C3191e4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import x3.s2;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f91713a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Method f91714b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Field f91715c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f91716d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f91717e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f91718f = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: g, reason: collision with root package name */
    public static final i1 f91719g = new i1();

    /* renamed from: h, reason: collision with root package name */
    public static final k1 f91720h = new k1();

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = y1.f91708d;
        y1 y1Var = (y1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (y1Var == null) {
            y1Var = new y1();
            y1Var.f91709a = null;
            y1Var.f91710b = null;
            y1Var.f91711c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, y1Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = y1Var.f91709a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = y1.f91708d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (y1Var.f91709a == null) {
                            y1Var.f91709a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = y1.f91708d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                y1Var.f91709a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    y1Var.f91709a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = y1Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (y1Var.f91710b == null) {
                    y1Var.f91710b = new SparseArray();
                }
                y1Var.f91710b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static int addAccessibilityAction(View view, CharSequence charSequence, y3.x xVar) {
        int id2;
        ArrayList arrayListD = d(view);
        int i10 = 0;
        while (true) {
            if (i10 >= arrayListD.size()) {
                int i11 = -1;
                for (int i12 = 0; i12 < 32 && i11 == -1; i12++) {
                    int i13 = f91718f[i12];
                    boolean z10 = true;
                    for (int i14 = 0; i14 < arrayListD.size(); i14++) {
                        z10 &= ((c.a) arrayListD.get(i14)).getId() != i13;
                    }
                    if (z10) {
                        i11 = i13;
                    }
                }
                id2 = i11;
            } else {
                if (TextUtils.equals(charSequence, ((c.a) arrayListD.get(i10)).getLabel())) {
                    id2 = ((c.a) arrayListD.get(i10)).getId();
                    break;
                }
                i10++;
            }
        }
        if (id2 != -1) {
            c.a aVar = new c.a(id2, charSequence, xVar);
            b accessibilityDelegate = getAccessibilityDelegate(view);
            if (accessibilityDelegate == null) {
                accessibilityDelegate = new b();
            }
            setAccessibilityDelegate(view, accessibilityDelegate);
            f(aVar.getId(), view);
            d(view).add(aVar);
            e(0, view);
        }
        return id2;
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.a(view, collection, i10);
        }
    }

    public static void addOnUnhandledKeyEventListener(View view, x1 x1Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1.a(view, x1Var);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(x1Var);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = y1.f91708d;
            synchronized (arrayList2) {
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    y1.f91708d.add(new WeakReference(view));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void addOverlayView(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        d4.a.setViewTreeDisjointParent((View) view.getParent(), viewGroup);
    }

    @Deprecated
    public static m2 animate(View view) {
        if (f91713a == null) {
            f91713a = new WeakHashMap();
        }
        m2 m2Var = (m2) f91713a.get(view);
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2Var2 = new m2(view);
        f91713a.put(view, m2Var2);
        return m2Var2;
    }

    public static void b(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            b((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return t1.a(view);
        }
        if (f91716d) {
            return null;
        }
        if (f91715c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f91715c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f91716d = true;
                return null;
            }
        }
        try {
            Object obj = f91715c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f91716d = true;
            return null;
        }
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static void cancelDragAndDrop(View view) {
        p1.a(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    public static e3 computeSystemWindowInsets(View view, e3 e3Var, Rect rect) {
        return n1.b(view, e3Var, rect);
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static e3 dispatchApplyWindowInsets(View view, e3 e3Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = e3Var.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? u1.a(view, windowInsets) : l1.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return e3.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return e3Var;
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        p1.b(view);
    }

    public static boolean dispatchNestedFling(View view, float f10, float f11, boolean z10) {
        return n1.c(view, f10, f11, z10);
    }

    public static boolean dispatchNestedPreFling(View view, float f10, float f11) {
        return n1.d(view, f10, f11);
    }

    public static boolean dispatchNestedPreScroll(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return n1.e(view, i10, i11, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return n1.f(view, i10, i11, i12, i13, iArr);
    }

    public static void dispatchStartTemporaryDetach(View view) {
        p1.c(view);
    }

    public static void e(int i10, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        b accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new b();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    public static void f(int i10, View view) {
        ArrayList arrayListD = d(view);
        for (int i11 = 0; i11 < arrayListD.size(); i11++) {
            if (((c.a) arrayListD.get(i11)).getId() == i10) {
                arrayListD.remove(i11);
                return;
            }
        }
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    public static b getAccessibilityDelegate(View view) {
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            return null;
        }
        return accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f91533a : new b(accessibilityDelegateC);
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static y3.n getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new y3.n(accessibilityNodeProvider);
        }
        return null;
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = s1.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    public static a4.a getAutofillId(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a4.a.toAutofillIdCompat(q1.getAutofillId(view));
        }
        return null;
    }

    public static ColorStateList getBackgroundTintList(View view) {
        return n1.g(view);
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        return n1.h(view);
    }

    @Deprecated
    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    public static b4.b getContentCaptureSession(View view) {
        ContentCaptureSession contentCaptureSessionB;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionB = t1.b(view)) == null) {
            return null;
        }
        return b4.b.toContentCaptureSessionCompat(contentCaptureSessionB, view);
    }

    @Deprecated
    public static Display getDisplay(View view) {
        return view.getDisplay();
    }

    public static float getElevation(View view) {
        return n1.i(view);
    }

    @Deprecated
    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static int getImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.b(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return u1.b(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(View view) {
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.c(view);
        }
        return -1;
    }

    public static String[] getOnReceiveContentMimeTypes(View view) {
        return Build.VERSION.SDK_INT >= 31 ? v1.getReceiveContentMimeTypes(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static int getPaddingEnd(View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    public static int getPaddingStart(View view) {
        return view.getPaddingStart();
    }

    @Deprecated
    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    public static e3 getRootWindowInsets(View view) {
        return o1.getRootWindowInsets(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(View view) {
        return o1.a(view);
    }

    public static CharSequence getStateDescription(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = u1.c(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        return Build.VERSION.SDK_INT >= 29 ? t1.c(view) : Collections.EMPTY_LIST;
    }

    public static String getTransitionName(View view) {
        return n1.j(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(View view) {
        return n1.k(view);
    }

    @Deprecated
    public static d4 getWindowInsetsController(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return u1.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return r2.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(View view) {
        return n1.l(view);
    }

    public static boolean hasAccessibilityDelegate(View view) {
        return c(view) != null;
    }

    public static boolean hasExplicitFocusable(View view) {
        return Build.VERSION.SDK_INT >= 26 ? q1.d(view) : view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(View view) {
        return n1.m(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    public static boolean isAccessibilityHeading(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(s1.c(view));
        } else {
            tag = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.e(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(View view) {
        return n1.n(view);
    }

    public static boolean isImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.f(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return u1.d(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.g(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isLaidOut(View view) {
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(View view) {
        return n1.o(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(View view) {
        return view.isPaddingRelative();
    }

    public static boolean isScreenReaderFocusable(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(s1.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static View keyboardNavigationClusterSearch(View view, View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return q1.h(view, view2, i10);
        }
        return null;
    }

    public static void offsetLeftAndRight(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void offsetTopAndBottom(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static e3 onApplyWindowInsets(View view, e3 e3Var) {
        WindowInsets windowInsets = e3Var.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = l1.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return e3.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return e3Var;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static boolean performHapticFeedback(View view, int i10) {
        int iR = kc.p.r(i10);
        if (iR == -1) {
            return false;
        }
        return view.performHapticFeedback(iR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n performReceiveContent(View view, n nVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + nVar + ", view=" + view.getClass().getSimpleName() + C3191e4.i.f36529d + view.getId() + C3191e4.i.f36531e);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return v1.performReceiveContent(view, nVar);
        }
        r0 r0Var = (r0) view.getTag(R.id.tag_on_receive_content_listener);
        s0 s0Var = f91719g;
        if (r0Var == null) {
            if (view instanceof s0) {
                s0Var = (s0) view;
            }
            return s0Var.onReceiveContent(nVar);
        }
        n nVarOnReceiveContent = r0Var.onReceiveContent(view, nVar);
        if (nVarOnReceiveContent == null) {
            return null;
        }
        if (view instanceof s0) {
            s0Var = (s0) view;
        }
        return s0Var.onReceiveContent(nVarOnReceiveContent);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static void postOnAnimationDelayed(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static void removeAccessibilityAction(View view, int i10) {
        f(i10, view);
        e(0, view);
    }

    public static void removeOnUnhandledKeyEventListener(View view, x1 x1Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1.e(view, x1Var);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(x1Var);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (y1.f91708d) {
            int i10 = 0;
            while (true) {
                try {
                    ArrayList arrayList2 = y1.f91708d;
                    if (i10 >= arrayList2.size()) {
                        return;
                    }
                    if (((WeakReference) arrayList2.get(i10)).get() == view) {
                        arrayList2.remove(i10);
                        return;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void replaceAccessibilityAction(View view, c.a aVar, CharSequence charSequence, y3.x xVar) {
        if (xVar == null && charSequence == null) {
            removeAccessibilityAction(view, aVar.getId());
            return;
        }
        c.a aVarCreateReplacementAction = aVar.createReplacementAction(charSequence, xVar);
        b accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new b();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
        f(aVarCreateReplacementAction.getId(), view);
        d(view).add(aVarCreateReplacementAction);
        e(0, view);
    }

    public static void requestApplyInsets(View view) {
        l1.c(view);
    }

    public static <T extends View> T requireViewById(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) s1.f(view, i10);
        }
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static boolean restoreDefaultFocus(View view) {
        return Build.VERSION.SDK_INT >= 26 ? q1.i(view) : view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            t1.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void setAccessibilityDelegate(View view, b bVar) {
        if (bVar == null && (c(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f91538b);
    }

    public static void setAccessibilityHeading(View view, boolean z10) {
        new j1(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).a(view, Boolean.valueOf(z10));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
        new j1(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).a(view, charSequence);
        k1 k1Var = f91720h;
        if (charSequence == null) {
            k1Var.f91616b.remove(view);
            view.removeOnAttachStateChangeListener(k1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(k1Var);
        } else {
            k1Var.f91616b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(k1Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(k1Var);
            }
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z10) {
        view.setActivated(z10);
    }

    @Deprecated
    public static void setAlpha(View view, float f10) {
        view.setAlpha(f10);
    }

    public static void setAutofillHints(View view, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.j(view, strArr);
        }
    }

    public static void setAutofillId(View view, a4.a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1.setAutofillId(view, aVar);
        }
    }

    @Deprecated
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        n1.p(view, colorStateList);
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        n1.q(view, mode);
    }

    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z10) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f91714b == null) {
            try {
                f91714b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e10);
            }
            f91714b.setAccessible(true);
        }
        try {
            f91714b.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException e11) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e11);
        } catch (IllegalArgumentException e12) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e12);
        } catch (InvocationTargetException e13) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e13);
        }
    }

    @Deprecated
    public static void setClipBounds(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(View view, b4.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            t1.e(view, bVar);
        }
    }

    public static void setElevation(View view, float f10) {
        n1.r(view, f10);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    public static void setFocusedByDefault(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.k(view, z10);
        }
    }

    @Deprecated
    public static void setHasTransientState(View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    @Deprecated
    public static void setImportantForAccessibility(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static void setImportantForAutofill(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.l(view, i10);
        }
    }

    public static void setImportantForContentCapture(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            u1.e(view, i10);
        }
    }

    public static void setKeyboardNavigationCluster(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.m(view, z10);
        }
    }

    @Deprecated
    public static void setLabelFor(View view, int i10) {
        view.setLabelFor(i10);
    }

    @Deprecated
    public static void setLayerPaint(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    @Deprecated
    public static void setLayoutDirection(View view, int i10) {
        view.setLayoutDirection(i10);
    }

    public static void setNestedScrollingEnabled(View view, boolean z10) {
        n1.s(view, z10);
    }

    public static void setNextClusterForwardId(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.n(view, i10);
        }
    }

    public static void setOnApplyWindowInsetsListener(View view, q0 q0Var) {
        n1.t(view, q0Var);
    }

    public static void setOnReceiveContentListener(View view, String[] strArr, r0 r0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            v1.setOnReceiveContentListener(view, strArr, r0Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (r0Var != null) {
            w3.i.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (strArr[i10].startsWith("*")) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            w3.i.checkArgument(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, r0Var);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    @Deprecated
    public static void setPaddingRelative(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    @Deprecated
    public static void setPivotX(View view, float f10) {
        view.setPivotX(f10);
    }

    @Deprecated
    public static void setPivotY(View view, float f10) {
        view.setPivotY(f10);
    }

    public static void setPointerIcon(View view, u0 u0Var) {
        p1.d(view, (PointerIcon) (u0Var != null ? u0Var.getPointerIcon() : null));
    }

    @Deprecated
    public static void setRotation(View view, float f10) {
        view.setRotation(f10);
    }

    @Deprecated
    public static void setRotationX(View view, float f10) {
        view.setRotationX(f10);
    }

    @Deprecated
    public static void setRotationY(View view, float f10) {
        view.setRotationY(f10);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    @Deprecated
    public static void setScaleX(View view, float f10) {
        view.setScaleX(f10);
    }

    @Deprecated
    public static void setScaleY(View view, float f10) {
        view.setScaleY(f10);
    }

    public static void setScreenReaderFocusable(View view, boolean z10) {
        new j1(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).a(view, Boolean.valueOf(z10));
    }

    public static void setScrollIndicators(View view, int i10) {
        o1.b(view, i10);
    }

    public static void setStateDescription(View view, CharSequence charSequence) {
        new j1(R.id.tag_state_description, CharSequence.class, 64, 30, 2).a(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            t1.f(view, list);
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            q1.o(view, charSequence);
        }
    }

    public static void setTransitionName(View view, String str) {
        n1.u(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f10) {
        view.setTranslationX(f10);
    }

    @Deprecated
    public static void setTranslationY(View view, float f10) {
        view.setTranslationY(f10);
    }

    public static void setTranslationZ(View view, float f10) {
        n1.v(view, f10);
    }

    public static void setWindowInsetsAnimationCallback(View view, s2.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            a3.setCallback(view, bVar);
            return;
        }
        PathInterpolator pathInterpolator = x2.f91704f;
        View.OnApplyWindowInsetsListener w2Var = bVar != null ? new w2(view, bVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, w2Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(w2Var);
        }
    }

    @Deprecated
    public static void setX(View view, float f10) {
        view.setX(f10);
    }

    @Deprecated
    public static void setY(View view, float f10) {
        view.setY(f10);
    }

    public static void setZ(View view, float f10) {
        n1.w(view, f10);
    }

    public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
        return p1.e(view, clipData, dragShadowBuilder, obj, i10);
    }

    public static boolean startNestedScroll(View view, int i10) {
        return n1.x(view, i10);
    }

    public static void stopNestedScroll(View view) {
        n1.y(view);
    }

    public static void transformMatrixToGlobal(View view, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            t1.g(view, matrix);
            return;
        }
        if (f91717e) {
            try {
                t1.g(view, matrix);
                return;
            } catch (NoSuchMethodError unused) {
                f91717e = false;
            }
        }
        b(view, matrix);
    }

    public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
        p1.f(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(View view, int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        if (view instanceof i0) {
            return ((i0) view).dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return dispatchNestedPreScroll(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(View view, int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (view instanceof j0) {
            ((j0) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            dispatchNestedScroll(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(View view, int i10) {
        if (view instanceof i0) {
            ((i0) view).hasNestedScrollingParent(i10);
            return false;
        }
        if (i10 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view, int i10, int i11, int i12, int i13) {
        view.postInvalidateOnAnimation(i10, i11, i12, i13);
    }

    public static void setScrollIndicators(View view, int i10, int i11) {
        o1.c(view, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(View view, int i10, int i11) {
        if (view instanceof i0) {
            return ((i0) view).startNestedScroll(i10, i11);
        }
        if (i11 == 0) {
            return startNestedScroll(view, i10);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(View view, int i10) {
        if (view instanceof i0) {
            ((i0) view).stopNestedScroll(i10);
        } else if (i10 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(View view, int i10, int i11) {
        int iR = kc.p.r(i10);
        if (iR == -1) {
            return false;
        }
        return view.performHapticFeedback(iR, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(View view, int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        if (view instanceof i0) {
            return ((i0) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return dispatchNestedScroll(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }
}
