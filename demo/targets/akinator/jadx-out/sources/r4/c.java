package r4;

import android.animation.ValueAnimator;
import android.os.Build;
import androidx.recyclerview.widget.l1;
import java.util.ArrayList;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f83734i = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public final d0 f83739e;

    /* renamed from: h, reason: collision with root package name */
    public a f83742h;

    /* renamed from: a, reason: collision with root package name */
    public final t1 f83735a = new t1();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f83736b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final l1 f83737c = new l1(this);

    /* renamed from: d, reason: collision with root package name */
    public final on.w f83738d = new on.w(this, 5);

    /* renamed from: f, reason: collision with root package name */
    public boolean f83740f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f83741g = 1.0f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public b f83743a;

        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.animation.ValueAnimator$DurationScaleChangeListener, r4.b] */
        @Override // r4.d
        public boolean register() {
            if (this.f83743a != null) {
                return true;
            }
            ?? r02 = new ValueAnimator.DurationScaleChangeListener() { // from class: r4.b
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    c.this.f83741g = f10;
                }
            };
            this.f83743a = r02;
            return ValueAnimator.registerDurationScaleChangeListener(r02);
        }

        @Override // r4.d
        public boolean unregister() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f83743a);
            this.f83743a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    public c(d0 d0Var) {
        this.f83739e = d0Var;
    }

    public final void a(y yVar) {
        ArrayList arrayList = this.f83736b;
        if (arrayList.size() == 0) {
            ((e) this.f83739e).postFrameCallback(this.f83738d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f83741g = ValueAnimator.getDurationScale();
                if (this.f83742h == null) {
                    this.f83742h = new a();
                }
                this.f83742h.register();
            }
        }
        if (arrayList.contains(yVar)) {
            return;
        }
        arrayList.add(yVar);
    }

    public float getDurationScale() {
        return this.f83741g;
    }
}
