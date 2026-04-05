package s4;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f85428b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f85429c;

    /* renamed from: e, reason: collision with root package name */
    public final int f85430e;

    public o(List list, int i10, Throwable th2) {
        w3.i.checkNotNull(list, "initCallbacks cannot be null");
        this.f85428b = new ArrayList(list);
        this.f85430e = i10;
        this.f85429c = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f85428b;
        int size = arrayList.size();
        int i10 = 0;
        if (this.f85430e != 1) {
            while (i10 < size) {
                ((n) arrayList.get(i10)).onFailed(this.f85429c);
                i10++;
            }
        } else {
            while (i10 < size) {
                ((n) arrayList.get(i10)).onInitialized();
                i10++;
            }
        }
    }
}
