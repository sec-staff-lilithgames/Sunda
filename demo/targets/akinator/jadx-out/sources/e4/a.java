package e4;

import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f53705a;

    /* renamed from: b, reason: collision with root package name */
    public int f53706b;

    /* renamed from: c, reason: collision with root package name */
    public float f53707c;

    /* renamed from: d, reason: collision with root package name */
    public float f53708d;

    /* renamed from: e, reason: collision with root package name */
    public long f53709e;

    /* renamed from: f, reason: collision with root package name */
    public long f53710f;

    /* renamed from: g, reason: collision with root package name */
    public int f53711g;

    /* renamed from: h, reason: collision with root package name */
    public int f53712h;

    /* renamed from: i, reason: collision with root package name */
    public long f53713i;

    /* renamed from: j, reason: collision with root package name */
    public float f53714j;

    /* renamed from: k, reason: collision with root package name */
    public int f53715k;

    public final float a(long j10) {
        if (j10 < this.f53709e) {
            return 0.0f;
        }
        long j11 = this.f53713i;
        if (j11 < 0 || j10 < j11) {
            return c.b((j10 - r0) / this.f53705a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f53714j;
        return (c.b((j10 - j11) / this.f53715k, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }

    public void computeScrollDelta() {
        if (this.f53710f == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float fA = a(jCurrentAnimationTimeMillis);
        long j10 = jCurrentAnimationTimeMillis - this.f53710f;
        this.f53710f = jCurrentAnimationTimeMillis;
        float f10 = j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA));
        this.f53711g = (int) (this.f53707c * f10);
        this.f53712h = (int) (f10 * this.f53708d);
    }

    public int getDeltaX() {
        return this.f53711g;
    }

    public int getDeltaY() {
        return this.f53712h;
    }

    public int getHorizontalDirection() {
        float f10 = this.f53707c;
        return (int) (f10 / Math.abs(f10));
    }

    public int getVerticalDirection() {
        float f10 = this.f53708d;
        return (int) (f10 / Math.abs(f10));
    }

    public boolean isFinished() {
        return this.f53713i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f53713i + ((long) this.f53715k);
    }

    public void requestStop() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (jCurrentAnimationTimeMillis - this.f53709e);
        int i11 = this.f53706b;
        int i12 = c.f53717t;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f53715k = i10;
        this.f53714j = a(jCurrentAnimationTimeMillis);
        this.f53713i = jCurrentAnimationTimeMillis;
    }

    public void setRampDownDuration(int i10) {
        this.f53706b = i10;
    }

    public void setRampUpDuration(int i10) {
        this.f53705a = i10;
    }

    public void setTargetVelocity(float f10, float f11) {
        this.f53707c = f10;
        this.f53708d = f11;
    }

    public void start() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f53709e = jCurrentAnimationTimeMillis;
        this.f53713i = -1L;
        this.f53710f = jCurrentAnimationTimeMillis;
        this.f53714j = 0.5f;
        this.f53711g = 0;
        this.f53712h = 0;
    }
}
