package o9;

import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f78206c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f78207e;

    public /* synthetic */ i(ViewGroup viewGroup, j jVar, int i10) {
        this.f78205b = i10;
        this.f78206c = viewGroup;
        this.f78207e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78205b) {
            case 0:
                this.f78206c.addView(this.f78207e.f78238i);
                break;
            default:
                this.f78206c.addView(this.f78207e.f78238i);
                break;
        }
    }
}
