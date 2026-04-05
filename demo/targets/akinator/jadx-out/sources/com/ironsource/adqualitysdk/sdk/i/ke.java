package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ke {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Rect f3142 = new Rect();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static View m3208(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> void m3211(Activity activity, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        m3217(activity, cls, -1, null, false, z10, list, list2, list3);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static <E extends View> void m3213(View view, Class<E> cls, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        m3218(view, cls, null, z10, z11, list, list2, list3);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m3215(Activity activity, Class<E> cls, int i10, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m3217(activity, cls, i10, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> boolean m3220(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m3221(list) || list.contains(Integer.valueOf(view.getId()))) && !m3219(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static View m3209(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static <E extends View> void m3212(View view, Class<E> cls, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m3218(view, cls, str, z10, z11, list, list2, list3);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m3214(View view) {
        view.getHitRect(f3142);
        return view.getGlobalVisibleRect(f3142);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Activity m3210(View view) {
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            View viewFindViewById = view.findViewById(R.id.content);
            if (viewFindViewById != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> void m3217(Activity activity, Class<E> cls, int i10, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        if (i10 != -1) {
            View viewFindViewById = activity.findViewById(i10);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z10) {
                    return;
                }
            }
            m3218(viewFindViewById, cls, str, z10, z11, list, list2, list3);
            if (list3.size() > 0 && z10) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m3212(viewFindViewById2, cls, str, z10, z11, list, list2, list3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m3221(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m3216(View view, Class<E> cls, boolean z10) {
        ArrayList arrayList = new ArrayList();
        m3213(view, cls, true, z10, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> void m3218(View view, Class<E> cls, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        List list4 = list3;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            while (i10 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i10);
                if (m3220(childAt, cls, str, list, list2)) {
                    list4.add(childAt);
                    if (z10) {
                        return;
                    }
                    if (z11) {
                        m3218(childAt, cls, str, z10, z11, list, list2, list4);
                    }
                } else {
                    m3218(childAt, cls, str, z10, z11, list, list2, list4);
                    if (list3 != null && list3.size() > 0 && z10) {
                        return;
                    }
                }
                i10++;
                list4 = list3;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m3219(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }
}
