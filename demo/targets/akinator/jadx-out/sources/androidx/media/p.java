package androidx.media;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f6848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6849c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f6851f;

    public p(q qVar, l0 l0Var, String str, Bundle bundle) {
        this.f6851f = qVar;
        this.f6848b = l0Var;
        this.f6849c = str;
        this.f6850e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = 0;
        while (true) {
            q qVar = this.f6851f;
            if (i10 >= qVar.f6858d.f6775f.size()) {
                return;
            }
            k kVar = (k) qVar.f6858d.f6775f.valueAt(i10);
            if (kVar.f6834d.equals(this.f6848b)) {
                qVar.a(kVar, this.f6849c, this.f6850e);
            }
            i10++;
        }
    }
}
