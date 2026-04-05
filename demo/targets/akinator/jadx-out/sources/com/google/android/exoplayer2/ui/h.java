package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends View implements t0 {
    public static final /* synthetic */ int R = 0;
    public final Point A;
    public final float B;
    public int C;
    public long D;
    public int E;
    public Rect F;
    public final ValueAnimator G;
    public float H;
    public boolean I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long[] P;
    public boolean[] Q;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f28199b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f28200c;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f28201e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f28202f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f28203g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f28204h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f28205i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f28206j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f28207k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f28208l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f28209m;

    /* renamed from: n, reason: collision with root package name */
    public final int f28210n;

    /* renamed from: o, reason: collision with root package name */
    public final int f28211o;

    /* renamed from: p, reason: collision with root package name */
    public final int f28212p;

    /* renamed from: q, reason: collision with root package name */
    public final int f28213q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28214r;

    /* renamed from: s, reason: collision with root package name */
    public final int f28215s;

    /* renamed from: t, reason: collision with root package name */
    public final int f28216t;

    /* renamed from: u, reason: collision with root package name */
    public final int f28217u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28218v;

    /* renamed from: w, reason: collision with root package name */
    public final StringBuilder f28219w;

    /* renamed from: x, reason: collision with root package name */
    public final Formatter f28220x;

    /* renamed from: y, reason: collision with root package name */
    public final a2.s f28221y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet f28222z;

    public h(Context context) {
        this(context, null);
    }

    public static int a(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.D;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        long j11 = this.L;
        if (j11 == C.TIME_UNSET) {
            return 0L;
        }
        return j11 / this.C;
    }

    private String getProgressText() {
        return n1.getStringForTime(this.f28219w, this.f28220x, this.M);
    }

    private long getScrubberPosition() {
        if (this.f28200c.width() <= 0 || this.L == C.TIME_UNSET) {
            return 0L;
        }
        return (this.f28202f.width() * this.L) / r0.width();
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void addListener(s0 s0Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(s0Var);
        this.f28222z.add(s0Var);
    }

    public final boolean b(long j10) {
        long j11 = this.L;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.J ? this.K : this.M;
        long jConstrainValue = n1.constrainValue(j12 + j10, 0L, j11);
        if (jConstrainValue == j12) {
            return false;
        }
        if (this.J) {
            f(jConstrainValue);
        } else {
            c(jConstrainValue);
        }
        e();
        return true;
    }

    public final void c(long j10) {
        this.K = j10;
        this.J = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f28222z.iterator();
        while (it.hasNext()) {
            ((r) ((s0) it.next())).onScrubStart(this, j10);
        }
    }

    public final void d(boolean z10) {
        removeCallbacks(this.f28221y);
        this.J = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f28222z.iterator();
        while (it.hasNext()) {
            ((r) ((s0) it.next())).onScrubStop(this, this.K, z10);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f28209m;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f28201e;
        Rect rect2 = this.f28200c;
        rect.set(rect2);
        Rect rect3 = this.f28202f;
        rect3.set(rect2);
        long j10 = this.J ? this.K : this.M;
        if (this.L > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.N) / this.L)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j10) / this.L)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f28199b);
    }

    public final void f(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        Iterator it = this.f28222z.iterator();
        while (it.hasNext()) {
            ((r) ((s0) it.next())).onScrubMove(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f28200c.width() / this.B);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.L;
        if (j10 == 0 || j10 == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j10 / iWidth;
    }

    public void hideScrubber(boolean z10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.I = z10;
        this.H = 0.0f;
        invalidate(this.f28199b);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f28209m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f28200c;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i10 = iCenterY + iHeight;
        long j10 = this.L;
        Paint paint = this.f28205i;
        Rect rect2 = this.f28202f;
        if (j10 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i10, paint);
        } else {
            Rect rect3 = this.f28201e;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (iMax < i13) {
                canvas.drawRect(iMax, iCenterY, i13, i10, paint);
            }
            int iMax2 = Math.max(i11, rect2.right);
            if (i12 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i12, i10, this.f28204h);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i10, this.f28203g);
            }
            if (this.O != 0) {
                long[] jArr = (long[]) com.google.android.exoplayer2.util.a.checkNotNull(this.P);
                boolean[] zArr = (boolean[]) com.google.android.exoplayer2.util.a.checkNotNull(this.Q);
                int i14 = this.f28213q;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.O) {
                    int i18 = i17;
                    canvas.drawRect(Math.min(rect.width() - i14, Math.max(i16, ((int) ((rect.width() * n1.constrainValue(jArr[i17], 0L, this.L)) / this.L)) - i15)) + rect.left, iCenterY, r3 + i14, i10, zArr[i17] ? this.f28207k : this.f28206j);
                    i17 = i18 + 1;
                    i16 = i16;
                }
            }
            canvas2 = canvas;
        }
        if (this.L > 0) {
            int iConstrainValue = n1.constrainValue(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f28209m;
            if (drawable == null) {
                canvas2.drawCircle(iConstrainValue, iCenterY2, (int) ((((this.J || isFocused()) ? this.f28216t : isEnabled() ? this.f28214r : this.f28215s) * this.H) / 2.0f), this.f28208l);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.H)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.H)) / 2;
                drawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY2 - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.J || z10) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.L <= 0) {
            return;
        }
        if (n1.f28506a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            a2.s r5 = r4.f28221y
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.J
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.I ? 0 : this.f28217u;
        int i17 = this.f28212p;
        int i18 = this.f28210n;
        int i19 = this.f28211o;
        if (i17 == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - i19;
            paddingBottom2 = ((i15 - getPaddingBottom()) - i18) - Math.max(i16 - (i18 / 2), 0);
        } else {
            paddingBottom = (i15 - i19) / 2;
            paddingBottom2 = (i15 - i18) / 2;
        }
        Rect rect2 = this.f28199b;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i19 + paddingBottom);
        this.f28200c.set(rect2.left + i16, paddingBottom2, rect2.right - i16, i18 + paddingBottom2);
        if (n1.f28506a >= 29 && ((rect = this.F) == null || rect.width() != i14 || this.F.height() != i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.F = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f28211o;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.f28209m;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f28209m;
        if (drawable == null || n1.f28506a < 23 || !drawable.setLayoutDirection(i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.L
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.A
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f28200c
            android.graphics.Rect r5 = r9.f28202f
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.J
            if (r10 == 0) goto La1
            int r10 = r9.f28218v
            if (r2 >= r10) goto L52
            int r10 = r9.E
            int r0 = r0 - r10
            int r0 = r0 / r7
            int r0 = r0 + r10
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = com.google.android.exoplayer2.util.n1.constrainValue(r10, r0, r1)
            r5.right = r10
            goto L60
        L52:
            r9.E = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = com.google.android.exoplayer2.util.n1.constrainValue(r10, r0, r1)
            r5.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.J
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f28199b
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r4.left
            int r1 = r4.right
            int r10 = com.google.android.exoplayer2.util.n1.constrainValue(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.L <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void removeListener(s0 s0Var) {
        this.f28222z.remove(s0Var);
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 == 0 || !(jArr == null || zArr == null));
        this.O = i10;
        this.P = jArr;
        this.Q = zArr;
        e();
    }

    public void setAdMarkerColor(int i10) {
        this.f28206j.setColor(i10);
        invalidate(this.f28199b);
    }

    public void setBufferedColor(int i10) {
        this.f28204h.setColor(i10);
        invalidate(this.f28199b);
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setBufferedPosition(long j10) {
        if (this.N == j10) {
            return;
        }
        this.N = j10;
        e();
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setDuration(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        if (this.J && j10 == C.TIME_UNSET) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.t0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.J || z10) {
            return;
        }
        d(true);
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setKeyCountIncrement(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0);
        this.C = i10;
        this.D = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setKeyTimeIncrement(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0);
        this.C = -1;
        this.D = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f28207k.setColor(i10);
        invalidate(this.f28199b);
    }

    public void setPlayedColor(int i10) {
        this.f28203g.setColor(i10);
        invalidate(this.f28199b);
    }

    @Override // com.google.android.exoplayer2.ui.t0
    public void setPosition(long j10) {
        if (this.M == j10) {
            return;
        }
        this.M = j10;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.f28208l.setColor(i10);
        invalidate(this.f28199b);
    }

    public void setUnplayedColor(int i10) {
        this.f28205i.setColor(i10);
        invalidate(this.f28199b);
    }

    public void showScrubber() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.I = false;
        this.H = 1.0f;
        invalidate(this.f28199b);
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public h(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f28199b = new Rect();
        this.f28200c = new Rect();
        this.f28201e = new Rect();
        this.f28202f = new Rect();
        Paint paint = new Paint();
        this.f28203g = paint;
        Paint paint2 = new Paint();
        this.f28204h = paint2;
        Paint paint3 = new Paint();
        this.f28205i = paint3;
        Paint paint4 = new Paint();
        this.f28206j = paint4;
        Paint paint5 = new Paint();
        this.f28207k = paint5;
        Paint paint6 = new Paint();
        this.f28208l = paint6;
        paint6.setAntiAlias(true);
        this.f28222z = new CopyOnWriteArraySet();
        this.A = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B = f10;
        this.f28218v = a(f10, -50);
        int iA = a(f10, 4);
        int iA2 = a(f10, 26);
        int iA3 = a(f10, 4);
        int iA4 = a(f10, 12);
        int iA5 = a(f10, 0);
        int iA6 = a(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.f28228b, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f28209m = drawable;
                if (drawable != null) {
                    int i12 = n1.f28506a;
                    if (i12 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i12 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.f28210n = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.f28211o = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.f28212p = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f28213q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.f28214r = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.f28215s = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.f28216t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i13 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f28210n = iA;
            this.f28211o = iA2;
            this.f28212p = 0;
            this.f28213q = iA3;
            this.f28214r = iA4;
            this.f28215s = iA5;
            this.f28216t = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f28209m = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f28219w = sb2;
        this.f28220x = new Formatter(sb2, Locale.getDefault());
        this.f28221y = new a2.s(this, 19);
        Drawable drawable2 = this.f28209m;
        if (drawable2 != null) {
            this.f28217u = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f28217u = (Math.max(this.f28215s, Math.max(this.f28214r, this.f28216t)) + 1) / 2;
        }
        this.H = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.G = valueAnimator;
        valueAnimator.addUpdateListener(new g(this, 0));
        this.L = C.TIME_UNSET;
        this.D = C.TIME_UNSET;
        this.C = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long j10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.H, 0.0f);
        valueAnimator.setDuration(j10);
        valueAnimator.start();
    }

    public void showScrubber(long j10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.I = false;
        valueAnimator.setFloatValues(this.H, 1.0f);
        valueAnimator.setDuration(j10);
        valueAnimator.start();
    }
}
