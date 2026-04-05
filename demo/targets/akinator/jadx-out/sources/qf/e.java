package qf;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f82936a = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f82937a;

        /* renamed from: b, reason: collision with root package name */
        public final f f82938b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f82939c;

        public a(Handler handler, f fVar) {
            this.f82937a = handler;
            this.f82938b = fVar;
        }

        public void release() {
            this.f82939c = true;
        }
    }

    public void addListener(Handler handler, f fVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(fVar);
        removeListener(fVar);
        this.f82936a.add(new a(handler, fVar));
    }

    public void bandwidthSample(int i10, long j10, long j11) {
        int i11;
        long j12;
        long j13;
        Iterator it = this.f82936a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f82939c) {
                i11 = i10;
                j12 = j10;
                j13 = j11;
            } else {
                i11 = i10;
                j12 = j10;
                j13 = j11;
                aVar.f82937a.post(new at.a(aVar, j12, j13, i11, 5));
            }
            j10 = j12;
            j11 = j13;
            i10 = i11;
        }
    }

    public void removeListener(f fVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f82936a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f82938b == fVar) {
                aVar.release();
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }
}
