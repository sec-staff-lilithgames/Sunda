package ih;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f59603b;

    public r(a aVar) {
        this.f59603b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f59603b.f59575a.zzk();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
