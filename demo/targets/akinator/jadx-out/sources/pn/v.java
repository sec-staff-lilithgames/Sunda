package pn;

import android.os.Handler;
import android.os.Message;
import io.bidmachine.media3.common.util.a1;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final go.c f81578b;

    /* renamed from: c, reason: collision with root package name */
    public final w f81579c;

    /* renamed from: h, reason: collision with root package name */
    public qn.c f81583h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f81584i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81585j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f81586k;

    /* renamed from: g, reason: collision with root package name */
    public final TreeMap f81582g = new TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public final Handler f81581f = a1.createHandlerForCurrentLooper(this);

    /* renamed from: e, reason: collision with root package name */
    public final vo.b f81580e = new vo.b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f81587a;

        /* renamed from: b, reason: collision with root package name */
        public final long f81588b;

        public a(long j10, long j11) {
            this.f81587a = j10;
            this.f81588b = j11;
        }
    }

    public v(qn.c cVar, w wVar, go.c cVar2) {
        this.f81583h = cVar;
        this.f81579c = wVar;
        this.f81578b = cVar2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (!this.f81586k) {
            if (message.what != 1) {
                return false;
            }
            a aVar = (a) message.obj;
            long j10 = aVar.f81587a;
            long j11 = aVar.f81588b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f81582g;
            Long l9 = (Long) treeMap.get(lValueOf);
            if (l9 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l9.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }

    public x newPlayerTrackEmsgHandler() {
        return new x(this, this.f81578b);
    }

    public void release() {
        this.f81586k = true;
        this.f81581f.removeCallbacksAndMessages(null);
    }

    public void updateManifest(qn.c cVar) {
        this.f81585j = false;
        this.f81583h = cVar;
        Iterator it = this.f81582g.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f81583h.f83312h) {
                it.remove();
            }
        }
    }
}
