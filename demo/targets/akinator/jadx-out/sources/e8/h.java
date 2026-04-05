package e8;

import android.animation.Animator;
import android.view.Choreographer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* renamed from: n, reason: collision with root package name */
    public r7.h f53936n;

    /* renamed from: f, reason: collision with root package name */
    public float f53928f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53929g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f53930h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f53931i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f53932j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f53933k = 0;

    /* renamed from: l, reason: collision with root package name */
    public float f53934l = -2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public float f53935m = 2.1474836E9f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f53937o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f53938p = false;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        Iterator it = this.f53911c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(e());
        g(true);
    }

    public void clearComposition() {
        this.f53936n = null;
        this.f53934l = -2.1474836E9f;
        this.f53935m = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        f();
        if (this.f53936n == null || !isRunning()) {
            return;
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("LottieValueAnimator#doFrame");
        }
        long j11 = this.f53930h;
        long j12 = j11 != 0 ? j10 - j11 : 0L;
        r7.h hVar = this.f53936n;
        float frameRate = j12 / (hVar == null ? Float.MAX_VALUE : (1.0E9f / hVar.getFrameRate()) / Math.abs(this.f53928f));
        float f10 = this.f53931i;
        if (e()) {
            frameRate = -frameRate;
        }
        float f11 = f10 + frameRate;
        boolean zContains = j.contains(f11, getMinFrame(), getMaxFrame());
        float f12 = this.f53931i;
        float fClamp = j.clamp(f11, getMinFrame(), getMaxFrame());
        this.f53931i = fClamp;
        if (this.f53938p) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.f53932j = fClamp;
        this.f53930h = j10;
        if (zContains) {
            if (!this.f53938p || this.f53931i != f12) {
                c();
            }
        } else if (getRepeatCount() == -1 || this.f53933k < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f53929g = !this.f53929g;
                reverseAnimationSpeed();
            } else {
                float maxFrame = e() ? getMaxFrame() : getMinFrame();
                this.f53931i = maxFrame;
                this.f53932j = maxFrame;
            }
            this.f53930h = j10;
            if (!this.f53938p || this.f53931i != f12) {
                c();
            }
            Iterator it = this.f53911c.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f53933k++;
        } else {
            float minFrame = this.f53928f < 0.0f ? getMinFrame() : getMaxFrame();
            this.f53931i = minFrame;
            this.f53932j = minFrame;
            g(true);
            if (!this.f53938p || this.f53931i != f12) {
                c();
            }
            a(e());
        }
        if (this.f53936n != null) {
            float f13 = this.f53932j;
            if (f13 < this.f53934l || f13 > this.f53935m) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f53934l), Float.valueOf(this.f53935m), Float.valueOf(this.f53932j)));
            }
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("LottieValueAnimator#doFrame");
        }
    }

    public final boolean e() {
        return getSpeed() < 0.0f;
    }

    public void endAnimation() {
        g(true);
        a(e());
    }

    public final void f() {
        if (isRunning()) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f53937o = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.f53936n == null) {
            return 0.0f;
        }
        if (e()) {
            minFrame = getMaxFrame() - this.f53932j;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f53932j - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        r7.h hVar = this.f53936n;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.f53932j - hVar.getStartFrame()) / (this.f53936n.getEndFrame() - this.f53936n.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        r7.h hVar = this.f53936n;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.getDuration();
    }

    public float getFrame() {
        return this.f53932j;
    }

    public float getMaxFrame() {
        r7.h hVar = this.f53936n;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.f53935m;
        return f10 == 2.1474836E9f ? hVar.getEndFrame() : f10;
    }

    public float getMinFrame() {
        r7.h hVar = this.f53936n;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.f53934l;
        return f10 == -2.1474836E9f ? hVar.getStartFrame() : f10;
    }

    public float getSpeed() {
        return this.f53928f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f53937o;
    }

    public void pauseAnimation() {
        g(true);
        Iterator it = this.f53912e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(this);
        }
    }

    public void playAnimation() {
        this.f53937o = true;
        b(e());
        setFrame((int) (e() ? getMaxFrame() : getMinFrame()));
        this.f53930h = 0L;
        this.f53933k = 0;
        f();
    }

    public void resumeAnimation() {
        this.f53937o = true;
        f();
        this.f53930h = 0L;
        if (e() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!e() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        Iterator it = this.f53912e.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(this);
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(r7.h hVar) {
        boolean z10 = this.f53936n == null;
        this.f53936n = hVar;
        if (z10) {
            setMinAndMaxFrames(Math.max(this.f53934l, hVar.getStartFrame()), Math.min(this.f53935m, hVar.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) hVar.getStartFrame(), (int) hVar.getEndFrame());
        }
        float f10 = this.f53932j;
        this.f53932j = 0.0f;
        this.f53931i = 0.0f;
        setFrame((int) f10);
        c();
    }

    public void setFrame(float f10) {
        if (this.f53931i == f10) {
            return;
        }
        float fClamp = j.clamp(f10, getMinFrame(), getMaxFrame());
        this.f53931i = fClamp;
        if (this.f53938p) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.f53932j = fClamp;
        this.f53930h = 0L;
        c();
    }

    public void setMaxFrame(float f10) {
        setMinAndMaxFrames(this.f53934l, f10);
    }

    public void setMinAndMaxFrames(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        r7.h hVar = this.f53936n;
        float startFrame = hVar == null ? -3.4028235E38f : hVar.getStartFrame();
        r7.h hVar2 = this.f53936n;
        float endFrame = hVar2 == null ? Float.MAX_VALUE : hVar2.getEndFrame();
        float fClamp = j.clamp(f10, startFrame, endFrame);
        float fClamp2 = j.clamp(f11, startFrame, endFrame);
        if (fClamp == this.f53934l && fClamp2 == this.f53935m) {
            return;
        }
        this.f53934l = fClamp;
        this.f53935m = fClamp2;
        setFrame((int) j.clamp(this.f53932j, fClamp, fClamp2));
    }

    public void setMinFrame(int i10) {
        setMinAndMaxFrames(i10, (int) this.f53935m);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f53929g) {
            return;
        }
        this.f53929g = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f10) {
        this.f53928f = f10;
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f53938p = z10;
    }
}
