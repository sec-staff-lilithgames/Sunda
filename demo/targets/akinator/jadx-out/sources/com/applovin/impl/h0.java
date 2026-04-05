package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14024a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14025b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14026c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14027d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14028e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14029f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14030g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14031h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14032i;

    /* renamed from: k, reason: collision with root package name */
    private int f14034k;

    /* renamed from: l, reason: collision with root package name */
    private int f14035l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f14036m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f14037n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f14038o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f14039p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f14040q;

    /* renamed from: s, reason: collision with root package name */
    private c f14042s;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f14033j = new WeakReference(null);

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f14041r = new g9(this, 2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f14044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f14045b;

        public b(d dVar, Bitmap bitmap) {
            this.f14044a = dVar;
            this.f14045b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f14044a.a(this.f14045b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f14025b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f14025b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f14044a.a(true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f14024a = kVar;
        this.f14025b = kVar.O();
        this.f14026c = ((Long) kVar.a(v4.X5)).longValue();
        this.f14027d = ((Long) kVar.a(v4.W5)).longValue();
        this.f14030g = ((Integer) kVar.a(v4.Y5)).intValue();
        this.f14031h = ((Integer) kVar.a(v4.Z5)).intValue();
        this.f14032i = ((Integer) kVar.a(v4.f15884a6)).intValue();
        this.f14028e = ((Integer) kVar.a(v4.f15934g6)).intValue();
        this.f14029f = ((Integer) kVar.a(v4.f15942h6)).intValue();
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i10 = h0Var.f14035l;
        h0Var.f14035l = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i10 = h0Var.f14034k;
        h0Var.f14034k = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f14034k >= this.f14029f && !this.f14038o) {
            this.f14038o = true;
            h();
        }
        if (this.f14034k < this.f14028e || this.f14037n) {
            return;
        }
        this.f14037n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f14042s;
        if (cVar != null) {
            cVar.a(this.f14028e, this.f14034k, this.f14035l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f14042s;
        if (cVar != null) {
            cVar.a(this.f14034k, this.f14035l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f14042s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f14026c <= 0) {
            if (this.f14034k == 1) {
                if (!this.f14038o) {
                    this.f14038o = true;
                    h();
                }
                if (!this.f14037n) {
                    this.f14037n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f14039p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14025b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f14037n && this.f14038o) {
            k();
        } else {
            this.f14039p.postDelayed(this.f14041r, this.f14026c);
        }
    }

    private void h() {
        View view = (View) this.f14033j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14025b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new g9(this, 3));
    }

    private void i() {
        View view = (View) this.f14033j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14025b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new g9(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f14034k = 0;
        this.f14036m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f14033j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14025b.a("BlackViewDetector", "Stopped monitoring view: " + this.f14033j.get());
            }
            this.f14033j.clear();
        }
        Handler handler = this.f14039p;
        if (handler != null) {
            handler.removeCallbacks(this.f14041r);
            this.f14039p = null;
        }
        if (this.f14042s != null) {
            AppLovinSdkUtils.runOnUiThread(new g9(this, 1));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f14040q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f14040q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f14024a.a(v4.V5)).booleanValue()) {
            View view2 = (View) this.f14033j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14025b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14025b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f14040q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f14040q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f14024a.E().a(c2.f13748y0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f14042s = cVar;
                this.f14033j = new WeakReference(view);
                j();
                this.f14037n = false;
                this.f14038o = false;
                Handler handler = new Handler(this.f14040q.getLooper());
                this.f14039p = handler;
                handler.postDelayed(this.f14041r, this.f14027d);
            } catch (Throwable th2) {
                k();
                this.f14024a.E().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / h0.this.f14030g;
                int i11 = height / h0.this.f14030g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f14036m == null) {
                            h0.this.f14036m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e10) {
                h0.this.f14024a.E().a("BlackViewDetector", "onScreenshotCaptured", e10);
                h0.this.k();
            }
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z10) {
            if (z10) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f14033j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14025b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l9 = (Long) this.f14024a.a(v4.f15918e6);
        if (l9.longValue() > 0 && (memoryInfoA = k7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l9.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14025b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14025b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14025b.k("BlackViewDetector", p0.o2.i(measuredWidth, measuredHeight, "Monitored view is not visible due to dimensions (width = ", ", height = ", ")"));
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f14036m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f14036m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f14036m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f14032i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f14032i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f14032i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f14031h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (o0.h()) {
            Activity activityA = this.f14024a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14025b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14025b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14025b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
