package androidx.appcompat.app;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: d, reason: collision with root package name */
    public static i1 f4753d;

    /* renamed from: a, reason: collision with root package name */
    public Object f4754a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4755b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4756c;

    public static void b() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public void a(p8.o oVar, n8.v vVar) {
        k9.i.beginSection("DecodeJob.encode");
        try {
            ((p8.c0) oVar).getDiskCache().put((n8.q) this.f4754a, new p8.i((n8.y) this.f4755b, (p8.u0) this.f4756c, vVar));
        } finally {
            ((p8.u0) this.f4756c).a();
            k9.i.endSection();
        }
    }
}
