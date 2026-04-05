package e4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c implements View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f53717t = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final a f53718b;

    /* renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f53719c;

    /* renamed from: e, reason: collision with root package name */
    public final View f53720e;

    /* renamed from: f, reason: collision with root package name */
    public b f53721f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f53722g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f53723h;

    /* renamed from: i, reason: collision with root package name */
    public int f53724i;

    /* renamed from: j, reason: collision with root package name */
    public int f53725j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f53726k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f53727l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f53728m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f53729n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f53730o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f53731p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f53732q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f53733r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f53734s;

    public c(View view) {
        a aVar = new a();
        aVar.f53709e = Long.MIN_VALUE;
        aVar.f53713i = -1L;
        aVar.f53710f = 0L;
        aVar.f53711g = 0;
        aVar.f53712h = 0;
        this.f53718b = aVar;
        this.f53719c = new AccelerateInterpolator();
        this.f53722g = new float[]{0.0f, 0.0f};
        this.f53723h = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f53726k = new float[]{0.0f, 0.0f};
        this.f53727l = new float[]{0.0f, 0.0f};
        this.f53728m = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f53720e = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        setMaximumVelocity(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        setMinimumVelocity(f12, f12);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(f53717t);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f53722g
            r0 = r0[r7]
            float[] r1 = r3.f53723h
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f53719c
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f53726k
            r0 = r0[r7]
            float[] r1 = r3.f53727l
            r1 = r1[r7]
            float[] r2 = r3.f53728m
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.f53724i;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f53732q && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public abstract boolean canTargetScrollHorizontally(int i10);

    public abstract boolean canTargetScrollVertically(int i10);

    public final boolean d() {
        a aVar = this.f53718b;
        int verticalDirection = aVar.getVerticalDirection();
        int horizontalDirection = aVar.getHorizontalDirection();
        if (verticalDirection == 0 || !canTargetScrollVertically(verticalDirection)) {
            return horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection);
        }
        return true;
    }

    public boolean isEnabled() {
        return this.f53733r;
    }

    public boolean isExclusive() {
        return this.f53734s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f53733r
            r1 = 0
            if (r0 != 0) goto L7
            goto L89
        L7:
            int r0 = r10.getActionMasked()
            e4.a r2 = r8.f53718b
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 == r3) goto L19
            r4 = 2
            if (r0 == r4) goto L28
            r9 = 3
            if (r0 == r9) goto L19
            goto L80
        L19:
            boolean r9 = r8.f53730o
            if (r9 == 0) goto L20
            r8.f53732q = r1
            goto L80
        L20:
            r2.requestStop()
            goto L80
        L24:
            r8.f53731p = r3
            r8.f53729n = r1
        L28:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f53720e
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            r2.setTargetVelocity(r0, r9)
            boolean r9 = r8.f53732q
            if (r9 != 0) goto L80
            boolean r9 = r8.d()
            if (r9 == 0) goto L80
            e4.b r9 = r8.f53721f
            if (r9 != 0) goto L66
            e4.b r9 = new e4.b
            r9.<init>(r8)
            r8.f53721f = r9
        L66:
            r8.f53732q = r3
            r8.f53730o = r3
            boolean r9 = r8.f53729n
            if (r9 != 0) goto L79
            int r9 = r8.f53725j
            if (r9 <= 0) goto L79
            e4.b r10 = r8.f53721f
            long r6 = (long) r9
            x3.z1.postOnAnimationDelayed(r5, r10, r6)
            goto L7e
        L79:
            e4.b r9 = r8.f53721f
            r9.run()
        L7e:
            r8.f53729n = r3
        L80:
            boolean r9 = r8.f53734s
            if (r9 == 0) goto L89
            boolean r9 = r8.f53732q
            if (r9 == 0) goto L89
            return r3
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i10, int i11);

    public c setActivationDelay(int i10) {
        this.f53725j = i10;
        return this;
    }

    public c setEdgeType(int i10) {
        this.f53724i = i10;
        return this;
    }

    public c setEnabled(boolean z10) {
        if (this.f53733r && !z10) {
            if (this.f53730o) {
                this.f53732q = false;
            } else {
                this.f53718b.requestStop();
            }
        }
        this.f53733r = z10;
        return this;
    }

    public c setExclusive(boolean z10) {
        this.f53734s = z10;
        return this;
    }

    public c setMaximumEdges(float f10, float f11) {
        float[] fArr = this.f53723h;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public c setMaximumVelocity(float f10, float f11) {
        float[] fArr = this.f53728m;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public c setMinimumVelocity(float f10, float f11) {
        float[] fArr = this.f53727l;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public c setRampDownDuration(int i10) {
        this.f53718b.setRampDownDuration(i10);
        return this;
    }

    public c setRampUpDuration(int i10) {
        this.f53718b.setRampUpDuration(i10);
        return this;
    }

    public c setRelativeEdges(float f10, float f11) {
        float[] fArr = this.f53722g;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public c setRelativeVelocity(float f10, float f11) {
        float[] fArr = this.f53726k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }
}
