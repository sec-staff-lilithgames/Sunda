package x3;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f91583a = Collections.synchronizedMap(new WeakHashMap());

    public static void addMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = f91583a;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new h1());
            }
            h1 h1Var = (h1) map.get(velocityTracker);
            long[] jArr = h1Var.f91588b;
            long eventTime = motionEvent.getEventTime();
            if (h1Var.f91590d != 0 && eventTime - jArr[h1Var.f91591e] > 40) {
                h1Var.f91590d = 0;
                h1Var.f91589c = 0.0f;
            }
            int i10 = (h1Var.f91591e + 1) % 20;
            h1Var.f91591e = i10;
            int i11 = h1Var.f91590d;
            if (i11 != 20) {
                h1Var.f91590d = i11 + 1;
            }
            h1Var.f91587a[i10] = motionEvent.getAxisValue(26);
            jArr[h1Var.f91591e] = eventTime;
        }
    }

    public static void clear(VelocityTracker velocityTracker) {
        velocityTracker.clear();
        f91583a.remove(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i10, float f10) {
        long j10;
        float f11;
        velocityTracker.computeCurrentVelocity(i10, f10);
        h1 h1Var = (h1) f91583a.get(velocityTracker);
        if (h1Var != null) {
            float[] fArr = h1Var.f91587a;
            long[] jArr = h1Var.f91588b;
            int i11 = h1Var.f91590d;
            float fSqrt = 0.0f;
            if (i11 >= 2) {
                int i12 = h1Var.f91591e;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j11 = jArr[i12];
                while (true) {
                    j10 = jArr[i13];
                    if (j11 - j10 <= 100) {
                        break;
                    }
                    h1Var.f91590d--;
                    i13 = (i13 + 1) % 20;
                }
                int i14 = h1Var.f91590d;
                if (i14 >= 2) {
                    if (i14 == 2) {
                        int i15 = (i13 + 1) % 20;
                        if (j10 != jArr[i15]) {
                            fSqrt = fArr[i15] / (r5 - j10);
                        }
                    } else {
                        int i16 = 0;
                        int i17 = 0;
                        float fAbs = 0.0f;
                        while (true) {
                            if (i16 >= h1Var.f91590d - 1) {
                                break;
                            }
                            int i18 = i16 + i13;
                            long j12 = jArr[i18 % 20];
                            int i19 = (i18 + 1) % 20;
                            if (jArr[i19] == j12) {
                                f11 = fSqrt;
                            } else {
                                int i20 = i17 + 1;
                                f11 = fSqrt;
                                float fSqrt2 = (fAbs < fSqrt ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f12 = fArr[i19] / (jArr[i19] - j12);
                                fAbs += Math.abs(f12) * (f12 - fSqrt2);
                                if (i20 == 1) {
                                    fAbs *= 0.5f;
                                }
                                i17 = i20;
                            }
                            i16++;
                            fSqrt = f11;
                        }
                        fSqrt = (fAbs < fSqrt ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                    }
                }
            }
            float f13 = fSqrt * i10;
            h1Var.f91589c = f13;
            if (f13 < (-Math.abs(f10))) {
                h1Var.f91589c = -Math.abs(f10);
            } else if (h1Var.f91589c > Math.abs(f10)) {
                h1Var.f91589c = Math.abs(f10);
            }
        }
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.browser.customtabs.w.b(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        h1 h1Var = (h1) f91583a.get(velocityTracker);
        if (h1Var == null || i10 != 26) {
            return 0.0f;
        }
        return h1Var.f91589c;
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }

    public static boolean isAxisSupported(VelocityTracker velocityTracker, int i10) {
        return Build.VERSION.SDK_INT >= 34 ? androidx.browser.customtabs.w.g(velocityTracker, i10) : i10 == 26 || i10 == 0 || i10 == 1;
    }

    public static void recycle(VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        f91583a.remove(velocityTracker);
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.browser.customtabs.w.c(velocityTracker, i10, i11);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity(i11);
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity(i11);
        }
        return 0.0f;
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i10) {
        computeCurrentVelocity(velocityTracker, i10, Float.MAX_VALUE);
    }
}
