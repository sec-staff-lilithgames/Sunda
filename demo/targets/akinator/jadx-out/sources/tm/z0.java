package tm;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public a f87160a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final View[] f87161a;

        /* renamed from: b, reason: collision with root package name */
        public final y0 f87162b = new y0(this);

        /* renamed from: c, reason: collision with root package name */
        public Runnable f87163c;

        /* renamed from: d, reason: collision with root package name */
        public int f87164d;

        public a(View[] viewArr) {
            this.f87161a = viewArr;
        }

        public void start(Runnable runnable) {
            this.f87163c = runnable;
            this.f87164d = this.f87161a.length;
            um.h0.postOnUiThread(this.f87162b);
        }
    }

    public void cancelLastRequest() {
        a aVar = this.f87160a;
        if (aVar != null) {
            um.h0.cancelOnUiThread(aVar.f87162b);
            aVar.f87163c = null;
            this.f87160a = null;
        }
    }

    public a wait(View... viewArr) {
        cancelLastRequest();
        a aVar = new a(viewArr);
        this.f87160a = aVar;
        return aVar;
    }
}
