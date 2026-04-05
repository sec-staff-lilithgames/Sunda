package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.B7;
import com.ironsource.C3191e4;
import com.ironsource.C3422r4;
import com.ironsource.C3488v2;
import com.ironsource.Mb;
import com.ironsource.Sc;
import com.ironsource.sdk.controller.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h extends FrameLayout implements Sc {

    /* renamed from: a, reason: collision with root package name */
    private Context f38572a;

    /* renamed from: b, reason: collision with root package name */
    private v f38573b;

    /* renamed from: c, reason: collision with root package name */
    private final B7 f38574c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(h.this);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(h.this);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f38574c = Mb.U().i();
        this.f38572a = context;
        setClickable(true);
    }

    private void b() {
        ((Activity) this.f38572a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f38572a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f38574c.z(activity) == 1) {
                int i10 = rect.bottom - rect2.bottom;
                if (i10 > 0) {
                    return i10;
                }
                return 0;
            }
            int i11 = rect.right - rect2.right;
            if (i11 > 0) {
                return i11;
            }
            return 0;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f38572a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f38572a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f38572a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f38572a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38573b.E();
        this.f38573b.a(true, C3191e4.h.Z);
    }

    @Override // com.ironsource.Sc
    public boolean onBackButtonPressed() {
        return C3488v2.a().a((Activity) this.f38572a);
    }

    @Override // com.ironsource.Sc
    public void onCloseRequested() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38573b.A();
        this.f38573b.a(false, C3191e4.h.Z);
        v vVar = this.f38573b;
        if (vVar != null) {
            vVar.a(v.u.Gone);
            this.f38573b.B();
            this.f38573b.C();
        }
        removeAllViews();
    }

    public void a(v vVar) {
        this.f38573b = vVar;
        vVar.a(this);
        this.f38573b.D();
        this.f38572a = this.f38573b.p();
        a(getStatusBarPadding(), getNavigationBarPadding());
        a();
    }

    private void a() {
        ((Activity) this.f38572a).runOnUiThread(new a());
    }

    private void a(int i10, int i11) {
        try {
            Context context = this.f38572a;
            if (context != null) {
                int iZ = this.f38574c.z(context);
                if (iZ == 1) {
                    setPadding(0, i10, 0, i11);
                } else if (iZ == 2) {
                    setPadding(0, i10, i11, 0);
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    @Override // com.ironsource.Sc
    public void onOrientationChanged(String str, int i10) {
    }
}
