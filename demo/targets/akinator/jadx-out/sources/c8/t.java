package c8;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.ref.WeakReference;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: b, reason: collision with root package name */
    public static u1 f11916b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f11915a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final d8.a f11917c = d8.a.of(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "e", "o", "i", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final d8.a f11918d = d8.a.of("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorCreate;
        pointF.x = e8.j.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = e8.j.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = e8.j.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = e8.j.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = e8.n.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        if (r7.d.getDisablePathInterpolatorCache()) {
            weakReference = null;
        } else {
            synchronized (t.class) {
                if (f11916b == null) {
                    f11916b = new u1();
                }
                weakReference = (WeakReference) f11916b.get(iHashFor);
            }
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorCreate = z3.a.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorCreate = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? z3.a.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!r7.d.getDisablePathInterpolatorCache()) {
            try {
                WeakReference weakReference2 = new WeakReference(interpolatorCreate);
                synchronized (t.class) {
                    f11916b.put(iHashFor, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f8.a b(d8.c r24, r7.h r25, float r26, c8.l0 r27, boolean r28, boolean r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.t.b(d8.c, r7.h, float, c8.l0, boolean, boolean):f8.a");
    }
}
