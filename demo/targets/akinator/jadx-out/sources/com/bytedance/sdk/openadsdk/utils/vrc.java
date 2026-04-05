package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class vrc {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jd();

        void jpo();

        void jpo(View view, boolean z10);

        void jpo(boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: jd, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21623jd;
        View jpo = null;
        final /* synthetic */ boolean wqx;

        public jpo(ViewGroup viewGroup, boolean z10) {
            this.f21623jd = viewGroup;
            this.wqx = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                jd jdVar = (jd) this.f21623jd.getTag(520093765);
                if (this.jpo == null) {
                    ViewGroup viewGroup = this.f21623jd;
                    vrc.jd(viewGroup, jdVar, (Integer) viewGroup.getTag(520093766), this.wqx);
                    return;
                }
                Rect rect = new Rect();
                this.jpo.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f21623jd.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (jdVar != null) {
                        jdVar.jpo(this.f21623jd, false);
                    }
                    this.f21623jd.setTag(520093763, Boolean.FALSE);
                } else {
                    if (jdVar != null) {
                        jdVar.jpo(this.f21623jd, true);
                    }
                    this.f21623jd.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f21623jd.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(View view, jd jdVar, Integer num, boolean z10) {
        if (jdVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        jdVar.jpo(view, jpo(view, num.intValue(), z10));
    }

    public static void jpo(final ViewGroup viewGroup, boolean z10, int i10, final boolean z11, jd jdVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, jdVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final jpo jpoVar = new jpo(viewGroup, z11);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vrc.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        jpoVar.jpo = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        jpoVar.jpo = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(jpoVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.vrc.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        jd jdVar2 = (jd) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        vrc.jd(viewGroup2, jdVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vrc.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z12) {
                try {
                    jd jdVar2 = (jd) viewGroup.getTag(520093765);
                    if (jdVar2 != null) {
                        jdVar2.jpo(z12);
                        ViewGroup viewGroup2 = viewGroup;
                        vrc.jd(viewGroup2, jdVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vrc.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                jd jdVar2 = (jd) viewGroup.getTag(520093765);
                if (jdVar2 != null) {
                    jdVar2.jpo();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                jd jdVar2 = (jd) viewGroup.getTag(520093765);
                if (jdVar2 != null) {
                    jdVar2.jd();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean jpo(View view, int i10, boolean z10) {
        return com.bytedance.sdk.openadsdk.core.nzb.jpo(view, 20, i10, z10);
    }

    public static ArrayList<View> jpo(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(jpo((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View jpo(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return jpo((View) parent, cls);
    }
}
