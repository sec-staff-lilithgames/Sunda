package go;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f58301a = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f58302a;

        /* renamed from: b, reason: collision with root package name */
        public final e f58303b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f58304c;

        public a(Handler handler, e eVar) {
            this.f58302a = handler;
            this.f58303b = eVar;
        }

        public void release() {
            this.f58304c = true;
        }
    }

    public void addListener(Handler handler, e eVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(eVar);
        removeListener(eVar);
        this.f58301a.add(new a(handler, eVar));
    }

    public void bandwidthSample(int i10, long j10, long j11) {
        int i11;
        long j12;
        long j13;
        Iterator it = this.f58301a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f58304c) {
                i11 = i10;
                j12 = j10;
                j13 = j11;
            } else {
                i11 = i10;
                j12 = j10;
                j13 = j11;
                aVar.f58302a.post(new at.a(aVar, j12, j13, i11, 2));
            }
            j10 = j12;
            j11 = j13;
            i10 = i11;
        }
    }

    public void removeListener(e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f58301a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f58303b == eVar) {
                aVar.release();
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }
}
