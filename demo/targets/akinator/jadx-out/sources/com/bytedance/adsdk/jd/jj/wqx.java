package com.bytedance.adsdk.jd.jj;

import android.view.Choreographer;
import com.bytedance.adsdk.jd.qk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo implements Choreographer.FrameCallback {

    /* renamed from: yd, reason: collision with root package name */
    private qk f17276yd;

    /* renamed from: jd, reason: collision with root package name */
    private float f17272jd = 1.0f;
    private boolean wqx = false;

    /* renamed from: cm, reason: collision with root package name */
    private long f17271cm = 0;
    private float my = 0.0f;

    /* renamed from: jj, reason: collision with root package name */
    private float f17273jj = 0.0f;

    /* renamed from: qk, reason: collision with root package name */
    private int f17275qk = 0;
    private float xyk = -2.1474836E9f;
    private float zz = 2.1474836E9f;
    protected boolean jpo = false;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f17274ju = false;

    private float jr() {
        qk qkVar = this.f17276yd;
        if (qkVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / qkVar.m380if()) / Math.abs(this.f17272jd);
    }

    private boolean nmd() {
        return yd() < 0.0f;
    }

    private void rq() {
        if (this.f17276yd == null) {
            return;
        }
        float f10 = this.f17273jj;
        if (f10 < this.xyk || f10 > this.zz) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.xyk), Float.valueOf(this.zz), Float.valueOf(this.f17273jj)));
        }
    }

    public void au() {
        opi();
        cm();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        jd();
        opi();
    }

    public void cm(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.jpo = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        sq();
        if (this.f17276yd == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.jd.my.jpo("LottieValueAnimator#doFrame");
        float fJr = (this.f17271cm != 0 ? j10 - r1 : 0L) / jr();
        float f10 = this.my;
        if (nmd()) {
            fJr = -fJr;
        }
        float f11 = f10 + fJr;
        boolean zWqx = my.wqx(f11, prr(), hna());
        float f12 = this.my;
        float fJd = my.jd(f11, prr(), hna());
        this.my = fJd;
        if (this.f17274ju) {
            fJd = (float) Math.floor(fJd);
        }
        this.f17273jj = fJd;
        this.f17271cm = j10;
        if (!this.f17274ju || this.my != f12) {
            wqx();
        }
        if (!zWqx) {
            if (getRepeatCount() == -1 || this.f17275qk < getRepeatCount()) {
                jpo();
                this.f17275qk++;
                if (getRepeatMode() == 2) {
                    this.wqx = !this.wqx;
                    zz();
                } else {
                    float fHna = nmd() ? hna() : prr();
                    this.my = fHna;
                    this.f17273jj = fHna;
                }
                this.f17271cm = j10;
            } else {
                float fPrr = this.f17272jd < 0.0f ? prr() : hna();
                this.my = fPrr;
                this.f17273jj = fPrr;
                opi();
                jd(nmd());
            }
        }
        rq();
        com.bytedance.adsdk.jd.my.jd("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fPrr;
        float fHna;
        float fPrr2;
        if (this.f17276yd == null) {
            return 0.0f;
        }
        if (nmd()) {
            fPrr = hna() - this.f17273jj;
            fHna = hna();
            fPrr2 = prr();
        } else {
            fPrr = this.f17273jj - prr();
            fHna = hna();
            fPrr2 = prr();
        }
        return fPrr / (fHna - fPrr2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(jj());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        qk qkVar = this.f17276yd;
        if (qkVar == null) {
            return 0L;
        }
        return (long) qkVar.my();
    }

    public float hna() {
        qk qkVar = this.f17276yd;
        if (qkVar == null) {
            return 0.0f;
        }
        float f10 = this.zz;
        return f10 == 2.1474836E9f ? qkVar.qk() : f10;
    }

    /* renamed from: if, reason: not valid java name */
    public void m379if() {
        opi();
        jd(nmd());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.jpo;
    }

    public void jd(float f10) {
        jpo(this.xyk, f10);
    }

    public float jj() {
        qk qkVar = this.f17276yd;
        if (qkVar == null) {
            return 0.0f;
        }
        return (this.f17273jj - qkVar.jj()) / (this.f17276yd.qk() - this.f17276yd.jj());
    }

    public void jpo(qk qkVar) {
        boolean z10 = this.f17276yd == null;
        this.f17276yd = qkVar;
        if (z10) {
            jpo(Math.max(this.xyk, qkVar.jj()), Math.min(this.zz, qkVar.qk()));
        } else {
            jpo((int) qkVar.jj(), (int) qkVar.qk());
        }
        float f10 = this.f17273jj;
        this.f17273jj = 0.0f;
        this.my = 0.0f;
        jpo((int) f10);
        wqx();
    }

    public void ju() {
        this.jpo = true;
        jpo(nmd());
        jpo((int) (nmd() ? hna() : prr()));
        this.f17271cm = 0L;
        this.f17275qk = 0;
        sq();
    }

    public void opi() {
        cm(true);
    }

    public void oya() {
        this.jpo = true;
        sq();
        this.f17271cm = 0L;
        if (nmd() && qk() == prr()) {
            jpo(hna());
        } else if (!nmd() && qk() == hna()) {
            jpo(prr());
        }
        my();
    }

    public float prr() {
        qk qkVar = this.f17276yd;
        if (qkVar == null) {
            return 0.0f;
        }
        float f10 = this.xyk;
        return f10 == -2.1474836E9f ? qkVar.jj() : f10;
    }

    public float qk() {
        return this.f17273jj;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.wqx) {
            return;
        }
        this.wqx = false;
        zz();
    }

    public void sq() {
        if (isRunning()) {
            cm(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void wqx(boolean z10) {
        this.f17274ju = z10;
    }

    public void xyk() {
        this.f17276yd = null;
        this.xyk = -2.1474836E9f;
        this.zz = 2.1474836E9f;
    }

    public float yd() {
        return this.f17272jd;
    }

    public void zz() {
        wqx(-yd());
    }

    @Override // com.bytedance.adsdk.jd.jj.jpo
    public void jd() {
        super.jd();
        jd(nmd());
    }

    public void wqx(float f10) {
        this.f17272jd = f10;
    }

    public void jpo(float f10) {
        if (this.my == f10) {
            return;
        }
        float fJd = my.jd(f10, prr(), hna());
        this.my = fJd;
        if (this.f17274ju) {
            fJd = (float) Math.floor(fJd);
        }
        this.f17273jj = fJd;
        this.f17271cm = 0L;
        wqx();
    }

    public void jpo(int i10) {
        jpo(i10, (int) this.zz);
    }

    public void jpo(float f10, float f11) {
        if (f10 <= f11) {
            qk qkVar = this.f17276yd;
            float fJj = qkVar == null ? -3.4028235E38f : qkVar.jj();
            qk qkVar2 = this.f17276yd;
            float fQk = qkVar2 == null ? Float.MAX_VALUE : qkVar2.qk();
            float fJd = my.jd(f10, fJj, fQk);
            float fJd2 = my.jd(f11, fJj, fQk);
            if (fJd == this.xyk && fJd2 == this.zz) {
                return;
            }
            this.xyk = fJd;
            this.zz = fJd2;
            jpo((int) my.jd(this.f17273jj, fJd, fJd2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
    }
}
