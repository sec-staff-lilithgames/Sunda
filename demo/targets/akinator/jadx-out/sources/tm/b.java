package tm;

import android.text.TextUtils;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f86991b;

    public b(c cVar) {
        this.f86991b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f86991b.f86997c.f87004h;
        String str = gVar.f87041f;
        if (gVar.isRedirectProcessed() || TextUtils.isEmpty(str)) {
            return;
        }
        gVar.c(str, new b3(gVar, 15));
    }
}
