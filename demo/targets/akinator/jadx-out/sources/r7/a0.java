package r7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a0 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean X;
    public static final List Y;
    public static final ThreadPoolExecutor Z;
    public boolean A;
    public final Matrix B;
    public Bitmap C;
    public Canvas D;
    public Rect E;
    public RectF F;
    public s7.a G;
    public Rect H;
    public Rect I;
    public RectF J;
    public RectF K;
    public Matrix L;
    public final float[] M;
    public Matrix N;
    public boolean O;
    public a P;
    public final com.google.android.exoplayer2.ui.g Q;
    public final Semaphore R;
    public Handler S;
    public v T;
    public final v U;
    public float V;
    public int W;

    /* renamed from: b, reason: collision with root package name */
    public h f83847b;

    /* renamed from: c, reason: collision with root package name */
    public final e8.h f83848c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83849e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83850f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83851g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f83852h;

    /* renamed from: i, reason: collision with root package name */
    public w7.b f83853i;

    /* renamed from: j, reason: collision with root package name */
    public String f83854j;

    /* renamed from: k, reason: collision with root package name */
    public w7.a f83855k;

    /* renamed from: l, reason: collision with root package name */
    public Map f83856l;

    /* renamed from: m, reason: collision with root package name */
    public String f83857m;

    /* renamed from: n, reason: collision with root package name */
    public b f83858n;

    /* renamed from: o, reason: collision with root package name */
    public s0 f83859o;

    /* renamed from: p, reason: collision with root package name */
    public final c0 f83860p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f83861q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f83862r;

    /* renamed from: s, reason: collision with root package name */
    public a8.b f83863s;

    /* renamed from: t, reason: collision with root package name */
    public int f83864t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f83865u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f83866v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f83867w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f83868x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f83869y;

    /* renamed from: z, reason: collision with root package name */
    public q0 f83870z;

    static {
        X = Build.VERSION.SDK_INT <= 25;
        Y = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        Z = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new e8.f());
    }

    public a0() {
        e8.h hVar = new e8.h();
        this.f83848c = hVar;
        this.f83849e = true;
        this.f83850f = false;
        this.f83851g = false;
        this.W = 1;
        this.f83852h = new ArrayList();
        this.f83860p = new c0();
        this.f83861q = false;
        this.f83862r = true;
        this.f83864t = 255;
        this.f83869y = false;
        this.f83870z = q0.f83984b;
        this.A = false;
        this.B = new Matrix();
        this.M = new float[9];
        this.O = false;
        com.google.android.exoplayer2.ui.g gVar = new com.google.android.exoplayer2.ui.g(this, 6);
        this.Q = gVar;
        this.R = new Semaphore(1);
        this.U = new v(this, 1);
        this.V = -3.4028235E38f;
        hVar.addUpdateListener(gVar);
    }

    public static void c(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean h(float f10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? false : true;
    }

    public final void a() {
        h hVar = this.f83847b;
        if (hVar == null) {
            return;
        }
        a8.b bVar = new a8.b(this, c8.v.parse(hVar), hVar.getLayers(), hVar);
        this.f83863s = bVar;
        if (this.f83866v) {
            bVar.setOutlineMasksAndMattes(true);
        }
        this.f83863s.setClipToCompositionBounds(this.f83862r);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f83848c.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f83848c.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f83848c.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final x7.f fVar, final T t10, final f8.c cVar) {
        a8.b bVar = this.f83863s;
        if (bVar == null) {
            this.f83852h.add(new z() { // from class: r7.t
                @Override // r7.z
                public final void run(h hVar) {
                    boolean z10 = a0.X;
                    this.f83998a.addValueCallback(fVar, (x7.f) t10, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fVar == x7.f.f91781c) {
            bVar.addValueCallback(t10, cVar);
        } else if (fVar.getResolvedElement() != null) {
            fVar.getResolvedElement().addValueCallback(t10, cVar);
        } else {
            List<x7.f> listResolveKeyPath = resolveKeyPath(fVar);
            for (int i10 = 0; i10 < listResolveKeyPath.size(); i10++) {
                listResolveKeyPath.get(i10).getResolvedElement().addValueCallback(t10, cVar);
            }
            zIsEmpty = true ^ listResolveKeyPath.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == h0.C) {
                setProgress(getProgress());
            }
        }
    }

    public boolean animationsEnabled(Context context) {
        if (this.f83850f) {
            return true;
        }
        return this.f83849e && d.getReducedMotionOption().getCurrentReducedMotionMode(context) == v7.a.f89166b;
    }

    public final void b() {
        h hVar = this.f83847b;
        if (hVar == null) {
            return;
        }
        this.A = this.f83870z.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.hasDashPattern(), hVar.getMaskAndMatteCount());
    }

    public void cancelAnimation() {
        this.f83852h.clear();
        this.f83848c.cancel();
        if (isVisible()) {
            return;
        }
        this.W = 1;
    }

    public void clearComposition() {
        e8.h hVar = this.f83848c;
        if (hVar.isRunning()) {
            hVar.cancel();
            if (!isVisible()) {
                this.W = 1;
            }
        }
        this.f83847b = null;
        this.f83863s = null;
        this.f83853i = null;
        this.V = -3.4028235E38f;
        hVar.clearComposition();
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        a8.b bVar = this.f83863s;
        h hVar = this.f83847b;
        if (bVar == null || hVar == null) {
            return;
        }
        Matrix matrix = this.B;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / hVar.getBounds().width(), r3.height() / hVar.getBounds().height());
        }
        bVar.draw(canvas, matrix, this.f83864t, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a8.b bVar = this.f83863s;
        if (bVar == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        v vVar = this.U;
        ThreadPoolExecutor threadPoolExecutor = Z;
        e8.h hVar = this.f83848c;
        Semaphore semaphore = this.R;
        if (asyncUpdatesEnabled) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (d.isTraceEnabled()) {
                    d.endSection("Drawable#draw");
                }
                if (!asyncUpdatesEnabled) {
                    return;
                }
                semaphore.release();
                if (bVar.getProgress() == hVar.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th2) {
                if (d.isTraceEnabled()) {
                    d.endSection("Drawable#draw");
                }
                if (asyncUpdatesEnabled) {
                    semaphore.release();
                    if (bVar.getProgress() != hVar.getAnimatedValueAbsolute()) {
                        threadPoolExecutor.execute(vVar);
                    }
                }
                throw th2;
            }
        }
        if (d.isTraceEnabled()) {
            d.beginSection("Drawable#draw");
        }
        if (asyncUpdatesEnabled && j()) {
            setProgress(hVar.getAnimatedValueAbsolute());
        }
        if (this.f83851g) {
            try {
                if (this.A) {
                    i(canvas, bVar);
                } else {
                    d(canvas);
                }
            } catch (Throwable th3) {
                e8.e.error("Lottie crashed in draw!", th3);
            }
        } else if (this.A) {
            i(canvas, bVar);
        } else {
            d(canvas);
        }
        this.O = false;
        if (d.isTraceEnabled()) {
            d.endSection("Drawable#draw");
        }
        if (asyncUpdatesEnabled) {
            semaphore.release();
            if (bVar.getProgress() == hVar.getAnimatedValueAbsolute()) {
                return;
            }
            threadPoolExecutor.execute(vVar);
        }
    }

    public final Context e() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void enableFeatureFlag(b0 b0Var, boolean z10) {
        boolean zEnableFlag = this.f83860p.enableFlag(b0Var, z10);
        if (this.f83847b == null || !zEnableFlag) {
            return;
        }
        a();
    }

    @Deprecated
    public boolean enableMergePathsForKitKatAndAbove() {
        return this.f83860p.isFlagEnabled(b0.f83871b);
    }

    public void endAnimation() {
        this.f83852h.clear();
        this.f83848c.endAnimation();
        if (isVisible()) {
            return;
        }
        this.W = 1;
    }

    public final w7.a f() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f83855k == null) {
            w7.a aVar = new w7.a(getCallback(), this.f83858n);
            this.f83855k = aVar;
            String str = this.f83857m;
            if (str != null) {
                aVar.setDefaultFontFileExtension(str);
            }
        }
        return this.f83855k;
    }

    public final w7.b g() {
        w7.b bVar = this.f83853i;
        if (bVar != null && !bVar.hasSameContext(e())) {
            this.f83853i = null;
        }
        if (this.f83853i == null) {
            this.f83853i = new w7.b(getCallback(), this.f83854j, null, this.f83847b.getImages());
        }
        return this.f83853i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f83864t;
    }

    public a getAsyncUpdates() {
        a aVar = this.P;
        return aVar != null ? aVar : d.getDefaultAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return getAsyncUpdates() == a.f83845c;
    }

    public Bitmap getBitmapForId(String str) {
        w7.b bVarG = g();
        if (bVarG != null) {
            return bVarG.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f83869y;
    }

    public boolean getClipToCompositionBounds() {
        return this.f83862r;
    }

    public h getComposition() {
        return this.f83847b;
    }

    public int getFrame() {
        return (int) this.f83848c.getFrame();
    }

    @Deprecated
    public Bitmap getImageAsset(String str) {
        w7.b bVarG = g();
        if (bVarG != null) {
            return bVarG.bitmapForId(str);
        }
        h hVar = this.f83847b;
        d0 d0Var = hVar == null ? null : hVar.getImages().get(str);
        if (d0Var != null) {
            return d0Var.getBitmap();
        }
        return null;
    }

    public String getImageAssetsFolder() {
        return this.f83854j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        h hVar = this.f83847b;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        h hVar = this.f83847b;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().width();
    }

    public d0 getLottieImageAssetForId(String str) {
        h hVar = this.f83847b;
        if (hVar == null) {
            return null;
        }
        return hVar.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f83861q;
    }

    public x7.i getMarkerForAnimationsDisabled() {
        Iterator it = Y.iterator();
        x7.i marker = null;
        while (it.hasNext()) {
            marker = this.f83847b.getMarker((String) it.next());
            if (marker != null) {
                break;
            }
        }
        return marker;
    }

    public float getMaxFrame() {
        return this.f83848c.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f83848c.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public o0 getPerformanceTracker() {
        h hVar = this.f83847b;
        if (hVar != null) {
            return hVar.getPerformanceTracker();
        }
        return null;
    }

    public float getProgress() {
        return this.f83848c.getAnimatedValueAbsolute();
    }

    public q0 getRenderMode() {
        return this.A ? q0.f83986e : q0.f83985c;
    }

    public int getRepeatCount() {
        return this.f83848c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f83848c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f83848c.getSpeed();
    }

    public s0 getTextDelegate() {
        return this.f83859o;
    }

    public Typeface getTypeface(x7.d dVar) {
        Map map = this.f83856l;
        if (map != null) {
            String family = dVar.getFamily();
            if (map.containsKey(family)) {
                return (Typeface) map.get(family);
            }
            String name = dVar.getName();
            if (map.containsKey(name)) {
                return (Typeface) map.get(name);
            }
            String str = dVar.getFamily() + "-" + dVar.getStyle();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        w7.a aVarF = f();
        if (aVarF != null) {
            return aVarF.getTypeface(dVar);
        }
        return null;
    }

    public boolean hasMasks() {
        a8.b bVar = this.f83863s;
        return bVar != null && bVar.hasMasks();
    }

    public boolean hasMatte() {
        a8.b bVar = this.f83863s;
        return bVar != null && bVar.hasMatte();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r12, a8.b r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.a0.i(android.graphics.Canvas, a8.b):void");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.O) {
            return;
        }
        this.O = true;
        if ((!X || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        e8.h hVar = this.f83848c;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.f83867w;
    }

    public boolean isApplyingShadowToLayersEnabled() {
        return this.f83868x;
    }

    public boolean isFeatureFlagEnabled(b0 b0Var) {
        return this.f83860p.isFlagEnabled(b0Var);
    }

    public boolean isLooping() {
        return this.f83848c.getRepeatCount() == -1;
    }

    @Deprecated
    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f83860p.isFlagEnabled(b0.f83871b);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    public final boolean j() {
        h hVar = this.f83847b;
        if (hVar == null) {
            return false;
        }
        float f10 = this.V;
        float animatedValueAbsolute = this.f83848c.getAnimatedValueAbsolute();
        this.V = animatedValueAbsolute;
        return Math.abs(animatedValueAbsolute - f10) * hVar.getDuration() >= 50.0f;
    }

    @Deprecated
    public void loop(boolean z10) {
        this.f83848c.setRepeatCount(z10 ? -1 : 0);
    }

    public void pauseAnimation() {
        this.f83852h.clear();
        this.f83848c.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.W = 1;
    }

    public void playAnimation() {
        if (this.f83863s == null) {
            this.f83852h.add(new w(this, 1));
            return;
        }
        b();
        boolean zAnimationsEnabled = animationsEnabled(e());
        e8.h hVar = this.f83848c;
        if (zAnimationsEnabled || getRepeatCount() == 0) {
            if (isVisible()) {
                hVar.playAnimation();
                this.W = 1;
            } else {
                this.W = 2;
            }
        }
        if (animationsEnabled(e())) {
            return;
        }
        x7.i markerForAnimationsDisabled = getMarkerForAnimationsDisabled();
        if (markerForAnimationsDisabled != null) {
            setFrame((int) markerForAnimationsDisabled.f91787b);
        } else {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
        hVar.endAnimation();
        if (isVisible()) {
            return;
        }
        this.W = 1;
    }

    public void removeAllAnimatorListeners() {
        this.f83848c.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        e8.h hVar = this.f83848c;
        hVar.removeAllUpdateListeners();
        hVar.addUpdateListener(this.Q);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f83848c.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f83848c.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f83848c.removeUpdateListener(animatorUpdateListener);
    }

    public List<x7.f> resolveKeyPath(x7.f fVar) {
        if (this.f83863s == null) {
            e8.e.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f83863s.resolveKeyPath(fVar, 0, arrayList, new x7.f(new String[0]));
        return arrayList;
    }

    public void resumeAnimation() {
        if (this.f83863s == null) {
            this.f83852h.add(new w(this, 0));
            return;
        }
        b();
        boolean zAnimationsEnabled = animationsEnabled(e());
        e8.h hVar = this.f83848c;
        if (zAnimationsEnabled || getRepeatCount() == 0) {
            if (isVisible()) {
                hVar.resumeAnimation();
                this.W = 1;
            } else {
                this.W = 3;
            }
        }
        if (animationsEnabled(e())) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        hVar.endAnimation();
        if (isVisible()) {
            return;
        }
        this.W = 1;
    }

    public void reverseAnimationSpeed() {
        this.f83848c.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f83864t = i10;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f83867w = z10;
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f83868x = z10;
    }

    public void setAsyncUpdates(a aVar) {
        this.P = aVar;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        if (z10 != this.f83869y) {
            this.f83869y = z10;
            invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        if (z10 != this.f83862r) {
            this.f83862r = z10;
            a8.b bVar = this.f83863s;
            if (bVar != null) {
                bVar.setClipToCompositionBounds(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        e8.e.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(h hVar) {
        if (this.f83847b == hVar) {
            return false;
        }
        this.O = true;
        clearComposition();
        this.f83847b = hVar;
        a();
        e8.h hVar2 = this.f83848c;
        hVar2.setComposition(hVar);
        setProgress(hVar2.getAnimatedFraction());
        ArrayList arrayList = this.f83852h;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar != null) {
                zVar.run(hVar);
            }
            it.remove();
        }
        arrayList.clear();
        hVar.setPerformanceTrackingEnabled(this.f83865u);
        b();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f83857m = str;
        w7.a aVarF = f();
        if (aVarF != null) {
            aVarF.setDefaultFontFileExtension(str);
        }
    }

    public void setFontAssetDelegate(b bVar) {
        this.f83858n = bVar;
        w7.a aVar = this.f83855k;
        if (aVar != null) {
            aVar.setDelegate(bVar);
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        if (map == this.f83856l) {
            return;
        }
        this.f83856l = map;
        invalidateSelf();
    }

    public void setFrame(int i10) {
        if (this.f83847b != null) {
            this.f83848c.setFrame(i10);
        } else {
            this.f83852h.add(new q(this, i10, 0));
        }
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f83850f = z10;
    }

    public void setImageAssetDelegate(c cVar) {
        w7.b bVar = this.f83853i;
        if (bVar != null) {
            bVar.setDelegate(cVar);
        }
    }

    public void setImagesAssetsFolder(String str) {
        this.f83854j = str;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f83861q = z10;
    }

    public void setMaxFrame(int i10) {
        if (this.f83847b == null) {
            this.f83852h.add(new q(this, i10, 1));
        } else {
            this.f83848c.setMaxFrame(i10 + 0.99f);
        }
    }

    public void setMaxProgress(float f10) {
        h hVar = this.f83847b;
        if (hVar == null) {
            this.f83852h.add(new u(this, f10, 0));
        } else {
            this.f83848c.setMaxFrame(e8.j.lerp(hVar.getStartFrame(), this.f83847b.getEndFrame(), f10));
        }
    }

    public void setMinAndMaxFrame(String str) {
        h hVar = this.f83847b;
        if (hVar == null) {
            this.f83852h.add(new p(this, str, 0));
            return;
        }
        x7.i marker = hVar.getMarker(str);
        if (marker == null) {
            throw new IllegalArgumentException(a.b.l("Cannot find marker with name ", str, "."));
        }
        int i10 = (int) marker.f91787b;
        setMinAndMaxFrame(i10, ((int) marker.f91788c) + i10);
    }

    public void setMinAndMaxProgress(final float f10, final float f11) {
        h hVar = this.f83847b;
        if (hVar != null) {
            setMinAndMaxFrame((int) e8.j.lerp(hVar.getStartFrame(), this.f83847b.getEndFrame(), f10), (int) e8.j.lerp(this.f83847b.getStartFrame(), this.f83847b.getEndFrame(), f11));
        } else {
            this.f83852h.add(new z() { // from class: r7.r
                @Override // r7.z
                public final void run(h hVar2) {
                    boolean z10 = a0.X;
                    this.f83988a.setMinAndMaxProgress(f10, f11);
                }
            });
        }
    }

    public void setMinFrame(int i10) {
        if (this.f83847b != null) {
            this.f83848c.setMinFrame(i10);
        } else {
            this.f83852h.add(new q(this, i10, 2));
        }
    }

    public void setMinProgress(float f10) {
        h hVar = this.f83847b;
        if (hVar != null) {
            setMinFrame((int) e8.j.lerp(hVar.getStartFrame(), this.f83847b.getEndFrame(), f10));
        } else {
            this.f83852h.add(new u(this, f10, 1));
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        if (this.f83866v == z10) {
            return;
        }
        this.f83866v = z10;
        a8.b bVar = this.f83863s;
        if (bVar != null) {
            bVar.setOutlineMasksAndMattes(z10);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f83865u = z10;
        h hVar = this.f83847b;
        if (hVar != null) {
            hVar.setPerformanceTrackingEnabled(z10);
        }
    }

    public void setProgress(float f10) {
        if (this.f83847b == null) {
            this.f83852h.add(new u(this, f10, 2));
            return;
        }
        if (d.isTraceEnabled()) {
            d.beginSection("Drawable#setProgress");
        }
        this.f83848c.setFrame(this.f83847b.getFrameForProgress(f10));
        if (d.isTraceEnabled()) {
            d.endSection("Drawable#setProgress");
        }
    }

    public void setRenderMode(q0 q0Var) {
        this.f83870z = q0Var;
        b();
    }

    public void setRepeatCount(int i10) {
        this.f83848c.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f83848c.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f83851g = z10;
    }

    public void setSpeed(float f10) {
        this.f83848c.setSpeed(f10);
    }

    @Deprecated
    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.f83849e = bool.booleanValue();
    }

    public void setTextDelegate(s0 s0Var) {
        this.f83859o = s0Var;
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f83848c.setUseCompositionFrameRate(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.W;
            if (i10 == 2) {
                playAnimation();
                return visible;
            }
            if (i10 == 3) {
                resumeAnimation();
                return visible;
            }
        } else {
            if (this.f83848c.isRunning()) {
                pauseAnimation();
                this.W = 3;
                return visible;
            }
            if (zIsVisible) {
                this.W = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        w7.b bVarG = g();
        if (bVarG == null) {
            e8.e.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapUpdateBitmap = bVarG.updateBitmap(str, bitmap);
        invalidateSelf();
        return bitmapUpdateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.f83856l == null && this.f83859o == null && this.f83847b.getCharacters().size() > 0;
    }

    @Deprecated
    public void enableMergePathsForKitKatAndAbove(boolean z10) {
        boolean zEnableFlag = this.f83860p.enableFlag(b0.f83871b, z10);
        if (this.f83847b == null || !zEnableFlag) {
            return;
        }
        a();
    }

    public void setMaxFrame(String str) {
        h hVar = this.f83847b;
        if (hVar == null) {
            this.f83852h.add(new p(this, str, 1));
        } else {
            x7.i marker = hVar.getMarker(str);
            if (marker != null) {
                setMaxFrame((int) (marker.f91787b + marker.f91788c));
                return;
            }
            throw new IllegalArgumentException(a.b.l("Cannot find marker with name ", str, "."));
        }
    }

    public void setMinFrame(String str) {
        h hVar = this.f83847b;
        if (hVar == null) {
            this.f83852h.add(new p(this, str, 2));
        } else {
            x7.i marker = hVar.getMarker(str);
            if (marker != null) {
                setMinFrame((int) marker.f91787b);
                return;
            }
            throw new IllegalArgumentException(a.b.l("Cannot find marker with name ", str, "."));
        }
    }

    public <T> void addValueCallback(x7.f fVar, T t10, f8.e eVar) {
        addValueCallback(fVar, (x7.f) t10, (f8.c) new y());
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z10) {
        h hVar = this.f83847b;
        if (hVar == null) {
            this.f83852h.add(new z() { // from class: r7.x
                @Override // r7.z
                public final void run(h hVar2) {
                    boolean z11 = a0.X;
                    this.f84009a.setMinAndMaxFrame(str, str2, z10);
                }
            });
            return;
        }
        x7.i marker = hVar.getMarker(str);
        if (marker != null) {
            int i10 = (int) marker.f91787b;
            x7.i marker2 = this.f83847b.getMarker(str2);
            if (marker2 != null) {
                setMinAndMaxFrame(i10, (int) (marker2.f91787b + (z10 ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException(a.b.l("Cannot find marker with name ", str2, "."));
        }
        throw new IllegalArgumentException(a.b.l("Cannot find marker with name ", str, "."));
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    public void draw(Canvas canvas, Matrix matrix) {
        a8.b bVar = this.f83863s;
        h hVar = this.f83847b;
        if (bVar == null || hVar == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        v vVar = this.U;
        ThreadPoolExecutor threadPoolExecutor = Z;
        e8.h hVar2 = this.f83848c;
        Semaphore semaphore = this.R;
        if (asyncUpdatesEnabled) {
            try {
                semaphore.acquire();
                if (j()) {
                    setProgress(hVar2.getAnimatedValueAbsolute());
                }
            } catch (InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                }
                semaphore.release();
                if (bVar.getProgress() == hVar2.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (Throwable th2) {
                if (asyncUpdatesEnabled) {
                    semaphore.release();
                    if (bVar.getProgress() != hVar2.getAnimatedValueAbsolute()) {
                        threadPoolExecutor.execute(vVar);
                    }
                }
                throw th2;
            }
        }
        if (this.f83851g) {
            try {
                int i10 = this.f83864t;
                if (this.A) {
                    canvas.save();
                    canvas.concat(matrix);
                    i(canvas, bVar);
                    canvas.restore();
                } else {
                    bVar.draw(canvas, matrix, i10, null);
                }
            } catch (Throwable th3) {
                e8.e.error("Lottie crashed in draw!", th3);
            }
        } else {
            int i11 = this.f83864t;
            if (this.A) {
                canvas.save();
                canvas.concat(matrix);
                i(canvas, bVar);
                canvas.restore();
            } else {
                bVar.draw(canvas, matrix, i11, null);
            }
        }
        this.O = false;
        if (asyncUpdatesEnabled) {
            semaphore.release();
            if (bVar.getProgress() == hVar2.getAnimatedValueAbsolute()) {
                return;
            }
            threadPoolExecutor.execute(vVar);
        }
    }

    public void setMinAndMaxFrame(final int i10, final int i11) {
        if (this.f83847b == null) {
            this.f83852h.add(new z() { // from class: r7.s
                @Override // r7.z
                public final void run(h hVar) {
                    boolean z10 = a0.X;
                    this.f83991a.setMinAndMaxFrame(i10, i11);
                }
            });
        } else {
            this.f83848c.setMinAndMaxFrames(i10, i11 + 0.99f);
        }
    }
}
