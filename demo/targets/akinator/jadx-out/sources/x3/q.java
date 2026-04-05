package x3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f91655a;

    /* renamed from: b, reason: collision with root package name */
    public final r f91656b;

    /* renamed from: c, reason: collision with root package name */
    public final sn.t f91657c;

    /* renamed from: d, reason: collision with root package name */
    public final sn.t f91658d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f91659e;

    /* renamed from: f, reason: collision with root package name */
    public float f91660f;

    /* renamed from: g, reason: collision with root package name */
    public int f91661g;

    /* renamed from: h, reason: collision with root package name */
    public int f91662h;

    /* renamed from: i, reason: collision with root package name */
    public int f91663i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f91664j;

    public q(Context context, r rVar) {
        sn.t tVar = new sn.t(16);
        sn.t tVar2 = new sn.t(17);
        this.f91661g = -1;
        this.f91662h = -1;
        this.f91663i = -1;
        this.f91664j = new int[]{Integer.MAX_VALUE, 0};
        this.f91655a = context;
        this.f91656b = rVar;
        this.f91657c = tVar;
        this.f91658d = tVar2;
    }

    public void onMotionEvent(MotionEvent motionEvent, int i10) {
        boolean z10;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i11 = this.f91662h;
        int[] iArr = this.f91664j;
        if (i11 == source && this.f91663i == deviceId && this.f91661g == i10) {
            z10 = false;
        } else {
            this.f91657c.calculateFlingVelocityThresholds(this.f91655a, iArr, motionEvent, i10);
            this.f91662h = source;
            this.f91663i = deviceId;
            this.f91661g = i10;
            z10 = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f91659e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f91659e = null;
                return;
            }
            return;
        }
        if (this.f91659e == null) {
            this.f91659e = VelocityTracker.obtain();
        }
        float currentVelocity = this.f91658d.getCurrentVelocity(this.f91659e, motionEvent, i10);
        r rVar = this.f91656b;
        float scaledScrollFactor = rVar.getScaledScrollFactor() * currentVelocity;
        float fSignum = Math.signum(scaledScrollFactor);
        if (z10 || (fSignum != Math.signum(this.f91660f) && fSignum != 0.0f)) {
            rVar.stopDifferentialMotionFling();
        }
        if (Math.abs(scaledScrollFactor) < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r8, Math.min(scaledScrollFactor, iArr[1]));
        this.f91660f = rVar.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
    }
}
