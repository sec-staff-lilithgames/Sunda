package com.bytedance.adsdk.jd;

import a.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.jd.my.tu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: au, reason: collision with root package name */
    private String f17608au;

    /* renamed from: cm, reason: collision with root package name */
    private qk f17609cm;

    /* renamed from: dm, reason: collision with root package name */
    private RectF f17610dm;

    /* renamed from: dt, reason: collision with root package name */
    private boolean f17611dt;
    private RectF duq;

    /* renamed from: ef, reason: collision with root package name */
    private Rect f17612ef;
    private boolean hmu;
    private Map<String, Typeface> hna;

    /* renamed from: hx, reason: collision with root package name */
    private final Matrix f17613hx;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.adsdk.jd.jd.jd f23if;

    /* renamed from: jd, reason: collision with root package name */
    wqx f17614jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f17615jj;
    String jpo;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f17616jr;

    /* renamed from: ju, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f17617ju;
    private Paint kln;
    private final com.bytedance.adsdk.jd.jj.wqx my;
    private com.bytedance.adsdk.jd.wqx.wqx.jd nmd;

    /* renamed from: nq, reason: collision with root package name */
    private jr f17618nq;
    private Rect nzb;
    private boolean opi;
    private cm oya;
    private Bitmap pdm;
    private com.bytedance.adsdk.jd.jd.jpo prr;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f17619qk;
    private boolean roc;

    /* renamed from: rq, reason: collision with root package name */
    private int f17620rq;

    /* renamed from: rv, reason: collision with root package name */
    private Canvas f17621rv;

    /* renamed from: se, reason: collision with root package name */
    private boolean f17622se;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f17623sq;
    private RectF sz;
    private Matrix tic;

    /* renamed from: tu, reason: collision with root package name */
    private boolean f17624tu;

    /* renamed from: uu, reason: collision with root package name */
    private Rect f17625uu;

    /* renamed from: va, reason: collision with root package name */
    private Matrix f17626va;
    private View vrc;
    nmd wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final ArrayList<jpo> f17627yd;
    private jd zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jd {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(qk qkVar);
    }

    public zz() {
        com.bytedance.adsdk.jd.jj.wqx wqxVar = new com.bytedance.adsdk.jd.jj.wqx();
        this.my = wqxVar;
        this.f17615jj = true;
        this.f17619qk = false;
        this.xyk = false;
        this.zz = jd.NONE;
        this.f17627yd = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.jd.zz.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (zz.this.nmd != null) {
                    zz.this.nmd.jpo(zz.this.my.jj());
                }
            }
        };
        this.f17617ju = animatorUpdateListener;
        this.opi = false;
        this.f17616jr = true;
        this.f17620rq = 255;
        this.f17618nq = jr.AUTOMATIC;
        this.f17622se = false;
        this.f17613hx = new Matrix();
        this.roc = false;
        wqxVar.addUpdateListener(animatorUpdateListener);
    }

    private void dm() {
        if (this.f17621rv != null) {
            return;
        }
        this.f17621rv = new Canvas();
        this.f17610dm = new RectF();
        this.tic = new Matrix();
        this.f17626va = new Matrix();
        this.f17625uu = new Rect();
        this.sz = new RectF();
        this.kln = new com.bytedance.adsdk.jd.jpo.jpo();
        this.f17612ef = new Rect();
        this.nzb = new Rect();
        this.duq = new RectF();
    }

    private Context duq() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.bytedance.adsdk.jd.jd.jd ef() {
        com.bytedance.adsdk.jd.jd.jd jdVar = this.f23if;
        if (jdVar != null && !jdVar.jpo(duq())) {
            this.f23if = null;
        }
        if (this.f23if == null) {
            this.f23if = new com.bytedance.adsdk.jd.jd.jd(getCallback(), this.f17608au, this.oya, this.f17609cm.hna());
        }
        return this.f23if;
    }

    private boolean kln() {
        return this.f17615jj || this.f17619qk;
    }

    private com.bytedance.adsdk.jd.jd.jpo nzb() {
        if (getCallback() == null) {
            return null;
        }
        if (this.prr == null) {
            com.bytedance.adsdk.jd.jd.jpo jpoVar = new com.bytedance.adsdk.jd.jd.jpo(getCallback(), this.f17614jd);
            this.prr = jpoVar;
            String str = this.jpo;
            if (str != null) {
                jpoVar.jpo(str);
            }
        }
        return this.prr;
    }

    private void sz() {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            return;
        }
        this.f17622se = this.f17618nq.jpo(Build.VERSION.SDK_INT, qkVar.jpo(), qkVar.jd());
    }

    private boolean tic() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    public void au() {
        if (this.nmd == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.7
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.au();
                }
            });
            return;
        }
        sz();
        if (kln() || rq() == 0) {
            if (isVisible()) {
                this.my.oya();
                this.zz = jd.NONE;
            } else {
                this.zz = jd.RESUME;
            }
        }
        if (kln()) {
            return;
        }
        wqx((int) (hna() < 0.0f ? oya() : prr()));
        this.my.m379if();
        if (isVisible()) {
            return;
        }
        this.zz = jd.NONE;
    }

    public String cm() {
        return this.f17608au;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        my.jpo("Drawable#draw");
        try {
            if (this.f17622se) {
                jpo(canvas, this.nmd);
            } else {
                jpo(canvas);
            }
        } catch (Throwable unused) {
        }
        this.roc = false;
        my.jd("Drawable#draw");
    }

    public boolean dt() {
        if (isVisible()) {
            return this.my.isRunning();
        }
        jd jdVar = this.zz;
        return jdVar == jd.PLAY || jdVar == jd.RESUME;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17620rq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            return -1;
        }
        return qkVar.cm().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            return -1;
        }
        return qkVar.cm().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public nmd hmu() {
        return this.wqx;
    }

    public float hna() {
        return this.my.yd();
    }

    public void hx() {
        this.f17627yd.clear();
        this.my.cancel();
        if (isVisible()) {
            return;
        }
        this.zz = jd.NONE;
    }

    /* renamed from: if, reason: not valid java name */
    public void m387if() {
        this.f17627yd.clear();
        this.my.m379if();
        if (isVisible()) {
            return;
        }
        this.zz = jd.NONE;
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
        if (this.roc) {
            return;
        }
        this.roc = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return tu();
    }

    public jr jj() {
        return this.f17622se ? jr.SOFTWARE : jr.HARDWARE;
    }

    public int jr() {
        return (int) this.my.qk();
    }

    public void ju() {
        if (this.nmd == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.6
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.ju();
                }
            });
            return;
        }
        sz();
        if (kln() || rq() == 0) {
            if (isVisible()) {
                this.my.ju();
                this.zz = jd.NONE;
            } else {
                this.zz = jd.PLAY;
            }
        }
        if (kln()) {
            return;
        }
        wqx((int) (hna() < 0.0f ? oya() : prr()));
        this.my.m379if();
        if (isVisible()) {
            return;
        }
        this.zz = jd.NONE;
    }

    public boolean my() {
        return this.opi;
    }

    public int nmd() {
        return this.my.getRepeatMode();
    }

    public boolean nq() {
        return this.hna == null && this.wqx == null && this.f17609cm.oya().size() > 0;
    }

    public void opi() {
        this.my.removeAllListeners();
    }

    public float oya() {
        return this.my.prr();
    }

    public void pdm() {
        this.f17627yd.clear();
        this.my.au();
        if (isVisible()) {
            return;
        }
        this.zz = jd.NONE;
    }

    public float prr() {
        return this.my.hna();
    }

    public boolean qk() {
        return this.f17622se;
    }

    public int rq() {
        return this.my.getRepeatCount();
    }

    public float rv() {
        return this.my.jj();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    public qk se() {
        return this.f17609cm;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f17620rq = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            jd jdVar = this.zz;
            if (jdVar == jd.PLAY) {
                ju();
                return visible;
            }
            if (jdVar == jd.RESUME) {
                au();
                return visible;
            }
        } else {
            if (this.my.isRunning()) {
                pdm();
                this.zz = jd.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.zz = jd.NONE;
            }
        }
        return visible;
    }

    public void sq() {
        this.my.removeAllUpdateListeners();
        this.my.addUpdateListener(this.f17617ju);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        ju();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m387if();
    }

    public boolean tu() {
        com.bytedance.adsdk.jd.jj.wqx wqxVar = this.my;
        if (wqxVar == null) {
            return false;
        }
        return wqxVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public RectF uu() {
        return this.f17610dm;
    }

    public boolean wqx() {
        return this.f17616jr;
    }

    public opi xyk() {
        qk qkVar = this.f17609cm;
        if (qkVar != null) {
            return qkVar.wqx();
        }
        return null;
    }

    public void yd() {
        if (this.my.isRunning()) {
            this.my.cancel();
            if (!isVisible()) {
                this.zz = jd.NONE;
            }
        }
        this.f17609cm = null;
        this.nmd = null;
        this.f23if = null;
        this.my.xyk();
        invalidateSelf();
    }

    public boolean zz() {
        return this.hmu;
    }

    public void cm(boolean z10) {
        if (this.f17611dt == z10) {
            return;
        }
        this.f17611dt = z10;
        com.bytedance.adsdk.jd.wqx.wqx.jd jdVar = this.nmd;
        if (jdVar != null) {
            jdVar.jpo(z10);
        }
    }

    public com.bytedance.adsdk.jd.wqx.wqx.jd jd() {
        return this.nmd;
    }

    public void jj(boolean z10) {
        this.xyk = z10;
    }

    public void jpo(View view) {
        this.vrc = view;
    }

    public void my(boolean z10) {
        this.hmu = z10;
    }

    public void qk(boolean z10) {
        this.f17619qk = z10;
    }

    public void wqx(boolean z10) {
        this.f17624tu = z10;
        qk qkVar = this.f17609cm;
        if (qkVar != null) {
            qkVar.jd(z10);
        }
    }

    public void jd(boolean z10) {
        this.opi = z10;
    }

    public yd jj(String str) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            return null;
        }
        return qkVar.hna().get(str);
    }

    public View jpo() {
        return this.vrc;
    }

    public void my(int i10) {
        this.my.setRepeatCount(i10);
    }

    public void qk(String str) {
        this.jpo = str;
        com.bytedance.adsdk.jd.jd.jpo jpoVarNzb = nzb();
        if (jpoVarNzb != null) {
            jpoVarNzb.jpo(str);
        }
    }

    public void xyk(boolean z10) {
        this.my.wqx(z10);
    }

    public void jd(final int i10) {
        if (this.f17609cm == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.10
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.jd(i10);
                }
            });
        } else {
            this.my.jd(i10 + 0.99f);
        }
    }

    public void jpo(boolean z10, Context context) {
        if (this.f17623sq == z10) {
            return;
        }
        this.f17623sq = z10;
        if (this.f17609cm != null) {
            jpo(context);
        }
    }

    public Bitmap my(String str) {
        com.bytedance.adsdk.jd.jd.jd jdVarEf = ef();
        if (jdVarEf != null) {
            return jdVarEf.jpo(str);
        }
        return null;
    }

    public void wqx(final String str) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.13
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar2) {
                    zz.this.wqx(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.jd.wqx.jj jjVarWqx = qkVar.wqx(str);
        if (jjVarWqx != null) {
            jd((int) (jjVarWqx.jpo + jjVarWqx.f17513jd));
            return;
        }
        throw new IllegalArgumentException(b.l("Cannot find marker with name ", str, "."));
    }

    public void cm(final String str) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.2
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar2) {
                    zz.this.cm(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.jd.wqx.jj jjVarWqx = qkVar.wqx(str);
        if (jjVarWqx != null) {
            int i10 = (int) jjVarWqx.jpo;
            jpo(i10, ((int) jjVarWqx.f17513jd) + i10);
            return;
        }
        throw new IllegalArgumentException(b.l("Cannot find marker with name ", str, "."));
    }

    public void jd(final float f10) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.11
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar2) {
                    zz.this.jd(f10);
                }
            });
        } else {
            this.my.jd(com.bytedance.adsdk.jd.jj.my.jpo(qkVar.jj(), this.f17609cm.qk(), f10));
        }
    }

    public void jpo(boolean z10) {
        if (z10 != this.f17616jr) {
            this.f17616jr = z10;
            com.bytedance.adsdk.jd.wqx.wqx.jd jdVar = this.nmd;
            if (jdVar != null) {
                jdVar.jd(z10);
            }
            invalidateSelf();
        }
    }

    public void jd(final String str) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.12
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar2) {
                    zz.this.jd(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.jd.wqx.jj jjVarWqx = qkVar.wqx(str);
        if (jjVarWqx != null) {
            jpo((int) jjVarWqx.jpo);
            return;
        }
        throw new IllegalArgumentException(b.l("Cannot find marker with name ", str, "."));
    }

    public void jpo(String str) {
        this.f17608au = str;
    }

    public boolean jpo(qk qkVar, Context context) {
        if (this.f17609cm == qkVar) {
            return false;
        }
        this.roc = true;
        yd();
        this.f17609cm = qkVar;
        jpo(context);
        this.my.jpo(qkVar);
        cm(this.my.getAnimatedFraction());
        Iterator it = new ArrayList(this.f17627yd).iterator();
        while (it.hasNext()) {
            jpo jpoVar = (jpo) it.next();
            if (jpoVar != null) {
                jpoVar.jpo(qkVar);
            }
            it.remove();
        }
        this.f17627yd.clear();
        qkVar.jd(this.f17624tu);
        sz();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void wqx(float f10) {
        this.my.wqx(f10);
    }

    public void wqx(final int i10) {
        if (this.f17609cm == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.4
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.wqx(i10);
                }
            });
        } else {
            this.my.jpo(i10);
        }
    }

    public void cm(final float f10) {
        if (this.f17609cm == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.5
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.cm(f10);
                }
            });
            return;
        }
        my.jpo("Drawable#setProgress");
        this.my.jpo(this.f17609cm.jpo(f10));
        my.jd("Drawable#setProgress");
    }

    public void jd(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.my.removeUpdateListener(animatorUpdateListener);
    }

    public void jd(Animator.AnimatorListener animatorListener) {
        this.my.removeListener(animatorListener);
    }

    private void jd(int i10, int i11) {
        Bitmap bitmap = this.pdm;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.pdm.getHeight() >= i11) {
            if (this.pdm.getWidth() > i10 || this.pdm.getHeight() > i11) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.pdm, 0, 0, i10, i11);
                this.pdm = bitmapCreateBitmap;
                this.f17621rv.setBitmap(bitmapCreateBitmap);
                this.roc = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.pdm = bitmapCreateBitmap2;
        this.f17621rv.setBitmap(bitmapCreateBitmap2);
        this.roc = true;
    }

    public void cm(int i10) {
        this.my.setRepeatMode(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void jpo(jr jrVar) {
        this.f17618nq = jrVar;
        sz();
    }

    private void jpo(Context context) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            return;
        }
        com.bytedance.adsdk.jd.wqx.wqx.jd jdVar = new com.bytedance.adsdk.jd.wqx.wqx.jd(this, tu.jpo(qkVar), qkVar.au(), qkVar, context);
        this.nmd = jdVar;
        if (this.f17611dt) {
            jdVar.jpo(true);
        }
        this.nmd.jd(this.f17616jr);
    }

    public void jpo(final int i10) {
        if (this.f17609cm == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.8
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.jpo(i10);
                }
            });
        } else {
            this.my.jpo(i10);
        }
    }

    public void jpo(final float f10) {
        qk qkVar = this.f17609cm;
        if (qkVar == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.9
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar2) {
                    zz.this.jpo(f10);
                }
            });
        } else {
            jpo((int) com.bytedance.adsdk.jd.jj.my.jpo(qkVar.jj(), this.f17609cm.qk(), f10));
        }
    }

    public void jpo(final int i10, final int i11) {
        if (this.f17609cm == null) {
            this.f17627yd.add(new jpo() { // from class: com.bytedance.adsdk.jd.zz.3
                @Override // com.bytedance.adsdk.jd.zz.jpo
                public void jpo(qk qkVar) {
                    zz.this.jpo(i10, i11);
                }
            });
        } else {
            this.my.jpo(i10, i11 + 0.99f);
        }
    }

    public void jpo(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.my.addUpdateListener(animatorUpdateListener);
    }

    public void jpo(Animator.AnimatorListener animatorListener) {
        this.my.addListener(animatorListener);
    }

    public void jpo(Boolean bool) {
        this.f17615jj = bool.booleanValue();
    }

    public void jpo(cm cmVar) {
        this.oya = cmVar;
        com.bytedance.adsdk.jd.jd.jd jdVar = this.f23if;
        if (jdVar != null) {
            jdVar.jpo(cmVar);
        }
    }

    public void jpo(wqx wqxVar) {
        this.f17614jd = wqxVar;
        com.bytedance.adsdk.jd.jd.jpo jpoVar = this.prr;
        if (jpoVar != null) {
            jpoVar.jpo(wqxVar);
        }
    }

    public void jpo(Map<String, Typeface> map) {
        if (map == this.hna) {
            return;
        }
        this.hna = map;
        invalidateSelf();
    }

    public void jpo(nmd nmdVar) {
        this.wqx = nmdVar;
    }

    public Bitmap jpo(String str, Bitmap bitmap) {
        com.bytedance.adsdk.jd.jd.jd jdVarEf = ef();
        if (jdVarEf == null) {
            return null;
        }
        Bitmap bitmapJpo = jdVarEf.jpo(str, bitmap);
        invalidateSelf();
        return bitmapJpo;
    }

    public Typeface jpo(com.bytedance.adsdk.jd.wqx.wqx wqxVar) {
        Map<String, Typeface> map = this.hna;
        if (map != null) {
            String strJpo = wqxVar.jpo();
            if (map.containsKey(strJpo)) {
                return map.get(strJpo);
            }
            String strJd = wqxVar.jd();
            if (map.containsKey(strJd)) {
                return map.get(strJd);
            }
            String str = wqxVar.jpo() + "-" + wqxVar.wqx();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.jd.jd.jpo jpoVarNzb = nzb();
        if (jpoVarNzb != null) {
            return jpoVarNzb.jpo(wqxVar);
        }
        return null;
    }

    private void jpo(Canvas canvas) {
        com.bytedance.adsdk.jd.wqx.wqx.jd jdVar = this.nmd;
        qk qkVar = this.f17609cm;
        if (jdVar == null || qkVar == null) {
            return;
        }
        this.f17613hx.reset();
        if (!getBounds().isEmpty()) {
            this.f17613hx.preScale(r2.width() / qkVar.cm().width(), r2.height() / qkVar.cm().height());
            this.f17613hx.preTranslate(r2.left, r2.top);
        }
        jdVar.jpo(canvas, this.f17613hx, this.f17620rq);
    }

    private void jpo(Canvas canvas, com.bytedance.adsdk.jd.wqx.wqx.jd jdVar) {
        if (this.f17609cm == null || jdVar == null) {
            return;
        }
        dm();
        canvas.getMatrix(this.tic);
        canvas.getClipBounds(this.f17625uu);
        jpo(this.f17625uu, this.sz);
        this.tic.mapRect(this.sz);
        jpo(this.sz, this.f17625uu);
        if (this.f17616jr) {
            this.f17610dm.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            jdVar.jpo(this.f17610dm, (Matrix) null, false);
        }
        this.tic.mapRect(this.f17610dm);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        jpo(this.f17610dm, fWidth, fHeight);
        if (!tic()) {
            RectF rectF = this.f17610dm;
            Rect rect = this.f17625uu;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f17610dm.width());
        int iCeil2 = (int) Math.ceil(this.f17610dm.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        jd(iCeil, iCeil2);
        if (this.roc) {
            this.f17613hx.set(this.tic);
            this.f17613hx.preScale(fWidth, fHeight);
            Matrix matrix = this.f17613hx;
            RectF rectF2 = this.f17610dm;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.pdm.eraseColor(0);
            jdVar.jpo(this.f17621rv, this.f17613hx, this.f17620rq);
            this.tic.invert(this.f17626va);
            this.f17626va.mapRect(this.duq, this.f17610dm);
            jpo(this.duq, this.nzb);
        }
        this.f17612ef.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.pdm, this.f17612ef, this.nzb, this.kln);
    }

    private void jpo(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void jpo(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void jpo(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
