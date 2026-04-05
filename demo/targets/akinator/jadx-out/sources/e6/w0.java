package e6;

import android.util.SparseArray;
import java.util.HashSet;
import wr.m6;
import xr.u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f53883a;

    /* renamed from: b, reason: collision with root package name */
    public Object f53884b;

    /* renamed from: c, reason: collision with root package name */
    public Object f53885c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f53886d;

    public w0() {
        this.f53883a = new z.f();
        this.f53885c = new SparseArray();
        this.f53886d = new z.x();
        this.f53884b = new z.f();
    }

    public void a(m6 m6Var) {
        synchronized (this.f53883a) {
            try {
                if (((m6) this.f53885c) != null) {
                    return;
                }
                this.f53885c = m6Var;
                boolean zIsEmpty = ((HashSet) this.f53884b).isEmpty();
                if (zIsEmpty) {
                    ((u8) this.f53886d).L.shutdown(m6Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w0(u8 u8Var) {
        this.f53886d = u8Var;
        this.f53883a = new Object();
        this.f53884b = new HashSet();
    }
}
