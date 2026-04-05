package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import x3.m2;
import x3.n2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f77281c;

    /* renamed from: d, reason: collision with root package name */
    public n2 f77282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77283e;

    /* renamed from: b, reason: collision with root package name */
    public long f77280b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f77284f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f77279a = new ArrayList();

    public void cancel() {
        if (this.f77283e) {
            Iterator it = this.f77279a.iterator();
            while (it.hasNext()) {
                ((m2) it.next()).cancel();
            }
            this.f77283e = false;
        }
    }

    public j play(m2 m2Var) {
        if (!this.f77283e) {
            this.f77279a.add(m2Var);
        }
        return this;
    }

    public j playSequentially(m2 m2Var, m2 m2Var2) {
        ArrayList arrayList = this.f77279a;
        arrayList.add(m2Var);
        m2Var2.setStartDelay(m2Var.getDuration());
        arrayList.add(m2Var2);
        return this;
    }

    public j setDuration(long j10) {
        if (!this.f77283e) {
            this.f77280b = j10;
        }
        return this;
    }

    public j setInterpolator(Interpolator interpolator) {
        if (!this.f77283e) {
            this.f77281c = interpolator;
        }
        return this;
    }

    public j setListener(n2 n2Var) {
        if (!this.f77283e) {
            this.f77282d = n2Var;
        }
        return this;
    }

    public void start() {
        if (this.f77283e) {
            return;
        }
        Iterator it = this.f77279a.iterator();
        while (it.hasNext()) {
            m2 m2Var = (m2) it.next();
            long j10 = this.f77280b;
            if (j10 >= 0) {
                m2Var.setDuration(j10);
            }
            Interpolator interpolator = this.f77281c;
            if (interpolator != null) {
                m2Var.setInterpolator(interpolator);
            }
            if (this.f77282d != null) {
                m2Var.setListener(this.f77284f);
            }
            m2Var.start();
        }
        this.f77283e = true;
    }
}
