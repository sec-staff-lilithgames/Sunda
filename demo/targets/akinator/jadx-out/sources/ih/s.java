package ih;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f59604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f59605c;

    public s(a aVar, HashSet hashSet) {
        this.f59605c = aVar;
        this.f59604b = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a aVar = this.f59605c;
            HashSet hashSet = this.f59604b;
            aVar.getClass();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                f.zzl(aVar.f59575a.zzg((String) it.next()));
            }
            aVar.f59576b.zzb();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
