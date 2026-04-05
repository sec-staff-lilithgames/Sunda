package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f31883a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f31884b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31885c;

    /* renamed from: d, reason: collision with root package name */
    public final C2890mc f31886d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f31887e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f31888f;

    /* renamed from: g, reason: collision with root package name */
    public B f31889g;

    /* renamed from: h, reason: collision with root package name */
    public G4 f31890h;

    /* renamed from: i, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f31891i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f31892j;

    /* renamed from: k, reason: collision with root package name */
    public ScheduledFuture f31893k;

    /* renamed from: l, reason: collision with root package name */
    public cg f31894l;

    /* renamed from: m, reason: collision with root package name */
    public final D f31895m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f31896n;

    /* renamed from: o, reason: collision with root package name */
    public final I f31897o;

    public J(GestureDetectorOnGestureListenerC3093yc adView, Set friendlyViews, long j10, C2890mc listener, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.e0.checkNotNullParameter(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f31883a = adView;
        this.f31884b = friendlyViews;
        this.f31885c = j10;
        this.f31886d = listener;
        this.f31887e = f52;
        this.f31888f = adView.getContext();
        this.f31891i = (ScheduledThreadPoolExecutor) F4.f31771c.getValue();
        this.f31892j = new AtomicBoolean(false);
        this.f31895m = new D(this);
        this.f31897o = new I(this);
    }

    public static final C a(J j10) {
        tu.v vVar;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        j10.getClass();
        Rect rect = new Rect();
        if (j10.f31883a.getRootView() != null && j10.f31883a.getVisibility() == 0 && j10.f31896n && j10.f31883a.getGlobalVisibleRect(rect)) {
            Context context = j10.f31888f;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                vVar = new tu.v(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
            } catch (Exception unused) {
                vVar = new tu.v(0, 0);
            }
            int iIntValue = ((Number) vVar.component1()).intValue();
            int iIntValue2 = ((Number) vVar.component2()).intValue();
            Rect rect2 = new Rect();
            if (j10.f31883a.getLocalVisibleRect(rect2) && !rect2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                View rootView = j10.f31883a.getRootView();
                Set set = j10.f31884b;
                if (rootView instanceof ViewGroup) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(rootView);
                    boolean z10 = false;
                    while (!arrayDeque.isEmpty()) {
                        View view = (View) arrayDeque.pop();
                        if (view.getVisibility() == 0) {
                            if (kotlin.jvm.internal.e0.areEqual(view, j10.f31883a)) {
                                z10 = true;
                            } else if (!set.contains(view)) {
                                Rect rect3 = new Rect();
                                if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                                    Rect rect4 = new Rect();
                                    boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                                    if (kotlin.jvm.internal.e0.areEqual(view, j10.f31883a) || (globalVisibleRect && rect4.intersect(rect))) {
                                        boolean z11 = !R3.f32183a.R() || view.getZ() >= j10.f31883a.getZ();
                                        if (z10 && z11) {
                                            arrayList2.add(rect4);
                                        }
                                        if (view instanceof ViewGroup) {
                                            ViewGroup viewGroup = (ViewGroup) view;
                                            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                                arrayDeque.push(viewGroup.getChildAt(childCount));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    B b10 = j10.f31889g;
                    if (b10 != null && (rectF4 = b10.f31642b) != null) {
                        a(rect, arrayList2, rectF4);
                    }
                    B b11 = j10.f31889g;
                    if (b11 != null && (rectF3 = b11.f31642b) != null) {
                        a(rect, arrayList2, rectF3);
                    }
                    B b12 = j10.f31889g;
                    if (b12 != null && (rectF2 = b12.f31643c) != null) {
                        a(rect, arrayList2, rectF2);
                    }
                    B b13 = j10.f31889g;
                    if (b13 != null && (rectF = b13.f31644d) != null) {
                        a(rect, arrayList2, rectF);
                    }
                    if (arrayList2.size() == 1) {
                        arrayList.add(new RectF((Rect) arrayList2.get(0)));
                    } else {
                        Region region = new Region();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            region.op((Rect) it.next(), Region.Op.UNION);
                        }
                        RegionIterator regionIterator = new RegionIterator(region);
                        Rect rect5 = new Rect();
                        while (regionIterator.next(rect5)) {
                            arrayList.add(new RectF(rect5));
                        }
                    }
                }
                return new C(new RectF(rect2), arrayList, iIntValue, iIntValue2);
            }
        }
        return null;
    }

    public final void b(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31887e;
        if (f52 != null) {
            ((G5) f52).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.f31884b.remove(view);
    }

    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31887e;
        if (f52 != null) {
            ((G5) f52).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.f31884b.add(view);
    }

    public static final void a(J j10, G4 metrics) {
        if (kotlin.jvm.internal.e0.areEqual(metrics, j10.f31890h)) {
            return;
        }
        C2890mc c2890mc = j10.f31886d;
        c2890mc.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(metrics, "metrics");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = c2890mc.f33096a;
        StringBuilder sb2 = new StringBuilder("window.mraidview.broadcastEvent('exposureChange', ");
        sb2.append(metrics.f31813a);
        sb2.append(", ");
        H4 h42 = metrics.f31814b;
        Object jSONArray = AbstractJsonLexerKt.NULL;
        sb2.append(h42 != null ? I4.a(h42) : AbstractJsonLexerKt.NULL);
        sb2.append(", ");
        ArrayList arrayList = metrics.f31815c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(I4.a((H4) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        sb2.append(jSONArray);
        sb2.append(");");
        gestureDetectorOnGestureListenerC3093yc.c(sb2.toString());
        j10.f31890h = metrics;
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(D2.b(rectF.left), D2.b(rectF.top), D2.b(rectF.right), D2.b(rectF.bottom)));
        }
    }
}
