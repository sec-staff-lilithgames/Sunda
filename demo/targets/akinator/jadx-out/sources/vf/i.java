package vf;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f89254a;

    /* renamed from: b, reason: collision with root package name */
    public final long f89255b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f89256c;

    /* renamed from: d, reason: collision with root package name */
    public int f89257d;

    /* renamed from: e, reason: collision with root package name */
    public int f89258e;

    public i(long j10, long j11) {
        this.f89256c = null;
        this.f89257d = 0;
        this.f89258e = 1;
        this.f89254a = j10;
        this.f89255b = j11;
    }

    public void apply(Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (getDelay() == iVar.getDelay() && getDuration() == iVar.getDuration() && getRepeatCount() == iVar.getRepeatCount() && getRepeatMode() == iVar.getRepeatMode()) {
            return getInterpolator().getClass().equals(iVar.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.f89254a;
    }

    public long getDuration() {
        return this.f89255b;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f89256c;
        return timeInterpolator != null ? timeInterpolator : a.f89241b;
    }

    public int getRepeatCount() {
        return this.f89257d;
    }

    public int getRepeatMode() {
        return this.f89258e;
    }

    public int hashCode() {
        return getRepeatMode() + ((getRepeatCount() + ((getInterpolator().getClass().hashCode() + (((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "\n" + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f89257d = 0;
        this.f89258e = 1;
        this.f89254a = j10;
        this.f89255b = j11;
        this.f89256c = timeInterpolator;
    }
}
