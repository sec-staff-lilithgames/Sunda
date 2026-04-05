package p;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;
import p.h;
import q.k2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f79989b;

    public g(h hVar) {
        this.f79989b = hVar;
    }

    @Override // q.k2
    public void onItemHoverEnter(m mVar, MenuItem menuItem) {
        h hVar = this.f79989b;
        Handler handler = hVar.f79996i;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = hVar.f79998k;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((h.a) arrayList.get(i10)).f80015b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new f(this, i11 < arrayList.size() ? (h.a) arrayList.get(i11) : null, menuItem, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // q.k2
    public void onItemHoverExit(m mVar, MenuItem menuItem) {
        this.f79989b.f79996i.removeCallbacksAndMessages(mVar);
    }
}
