package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f26793b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f26792a = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final j f26794c = new j(16, new i0());

    /* renamed from: d, reason: collision with root package name */
    public final j f26795d = new j(16, new j0());

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r6, android.view.View r7, com.fyber.inneractive.sdk.util.m0 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "IAVisibilityTracker: "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6, r7}
            java.lang.String r1 = "%strackView called with context: %s view: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            if (r6 == 0) goto L63
            android.content.Context r0 = r6.getApplicationContext()
            java.util.WeakHashMap r1 = r5.f26793b
            java.lang.Object r1 = r1.get(r0)
            java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1
            if (r1 != 0) goto L5c
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.WeakHashMap r2 = r5.f26793b
            r2.put(r0, r1)
            boolean r2 = r6 instanceof android.app.Activity
            if (r2 == 0) goto L3a
            android.app.Activity r6 = (android.app.Activity) r6
            android.view.Window r2 = r6.getWindow()
            if (r2 == 0) goto L3a
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            goto L3e
        L3a:
            android.view.View r6 = r7.getRootView()
        L3e:
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            if (r6 == 0) goto L5c
            boolean r2 = r6.isAlive()
            if (r2 == 0) goto L5c
            com.fyber.inneractive.sdk.util.k0 r2 = new com.fyber.inneractive.sdk.util.k0
            r2.<init>(r5, r0)
            r6.addOnPreDrawListener(r2)
            java.util.WeakHashMap r3 = r5.f26792a
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r6, r2)
            r3.put(r0, r4)
        L5c:
            r1.put(r7, r8)
            r5.b()
            return
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "View must be attached to an Activity context"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.n0.a(android.content.Context, android.view.View, com.fyber.inneractive.sdk.util.m0):void");
    }

    public final void b() {
        for (Context context : this.f26793b.keySet()) {
            IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.f26793b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    public final void a(View view) {
        IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.f26793b.get(context);
        if (map != null) {
            a(context, map, view);
        } else {
            Iterator it = new HashSet(this.f26793b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = (WeakHashMap) this.f26793b.get(context2);
                if (weakHashMap != null) {
                    a(context2, weakHashMap, view);
                }
            }
        }
        b();
    }

    public final void a(Context context, Map map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f26748a <= 2) {
                IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f26793b.remove(context);
                Pair pair = (Pair) this.f26792a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f26792a.remove(context);
                }
            }
        }
    }

    public final void a() {
        this.f26793b.clear();
        Iterator it = this.f26792a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.f26792a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f26792a.clear();
    }

    public final void a(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.f26793b.get(context)) == null) {
            return;
        }
        j jVar = this.f26795d;
        Object objPoll = jVar.f26782a.poll();
        if (objPoll == null) {
            objPoll = jVar.f26783b.a();
        }
        HashSet hashSet = (HashSet) objPoll;
        hashSet.addAll(weakHashMap.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            m0 m0Var = (m0) weakHashMap.get(view);
            if (m0Var != null) {
                j jVar2 = this.f26794c;
                Object objPoll2 = jVar2.f26782a.poll();
                if (objPoll2 == null) {
                    objPoll2 = jVar2.f26783b.a();
                }
                Rect rect = (Rect) objPoll2;
                m0Var.a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? 0.0f : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.f26794c.f26782a.offer(rect);
            }
        }
        hashSet.clear();
        this.f26795d.f26782a.offer(hashSet);
    }
}
