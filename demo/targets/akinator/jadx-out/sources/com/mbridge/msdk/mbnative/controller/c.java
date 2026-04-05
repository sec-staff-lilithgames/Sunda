package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.d1;
import com.mbridge.msdk.foundation.tools.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f41715a;

    /* renamed from: b, reason: collision with root package name */
    private List<View> f41716b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f41717c;

    /* renamed from: d, reason: collision with root package name */
    private d f41718d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f41719e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41720f;

    /* renamed from: g, reason: collision with root package name */
    private int f41721g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    public class RunnableC0291c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f41724a;

        public RunnableC0291c(View view) {
            this.f41724a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f41724a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f41715a = new WeakReference(viewTreeObserver);
                if (c.this.f41717c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f41717c);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f41716b = arrayList;
        this.f41717c = null;
        this.f41718d = dVar;
        this.f41719e = handler;
        this.f41721g = i10;
        if (list != null) {
            this.f41716b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f41720f = false;
            List<View> list = this.f41716b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f41716b.size(); i10++) {
                View view = this.f41716b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f41718d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f41720f) {
            return;
        }
        Handler handler = this.f41719e;
        if (handler != null) {
            if (this.f41721g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f41720f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            p0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f41717c = new a();
        } catch (Throwable th3) {
            p0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f41716b.add(view);
        } else {
            List<View> list = this.f41716b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f41716b.size() && ((view2 = this.f41716b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0291c(viewA));
    }

    private boolean b(View view) {
        return !d1.a(view, this.f41721g);
    }

    public void a() {
        try {
            this.f41720f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f41715a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f41715a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f41717c);
                }
                this.f41715a.clear();
            }
            this.f41718d = null;
            this.f41717c = null;
            List<View> list = this.f41716b;
            if (list != null) {
                list.clear();
            }
            this.f41716b = null;
        } catch (Throwable unused) {
        }
    }
}
