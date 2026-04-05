package af;

import af.h;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.util.c0;
import io.bidmachine.media3.common.util.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import zn.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4326c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f4325b = i10;
        this.f4326c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f4325b) {
            case 0:
                h hVar = (h) this.f4326c;
                CopyOnWriteArraySet copyOnWriteArraySet = hVar.f4335f;
                int i10 = message.what;
                if (i10 == 0) {
                    List list = (List) message.obj;
                    hVar.f4338i = true;
                    hVar.f4344o = Collections.unmodifiableList(list);
                    boolean zD = hVar.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((o) ((j) it.next())).onInitialized(hVar);
                    }
                    if (zD) {
                        hVar.a();
                    }
                } else if (i10 == 1) {
                    int i11 = message.arg1;
                    int i12 = message.arg2;
                    hVar.f4336g -= i11;
                    hVar.f4337h = i12;
                    if (hVar.isIdle()) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((o) ((j) it2.next())).onIdle(hVar);
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    h.a aVar = (h.a) message.obj;
                    hVar.f4344o = Collections.unmodifiableList(aVar.f4348c);
                    c cVar = aVar.f4346a;
                    boolean zD2 = hVar.d();
                    if (aVar.f4347b) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((o) ((j) it3.next())).onDownloadRemoved(hVar, cVar);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((o) ((j) it4.next())).onDownloadChanged(hVar, cVar, aVar.f4349d);
                        }
                    }
                    if (zD2) {
                        hVar.a();
                    }
                }
                return true;
            case 1:
                c0 c0Var = (c0) this.f4326c;
                Iterator it5 = c0Var.f28422d.iterator();
                while (it5.hasNext()) {
                    ((c0.a) it5.next()).iterationFinished(c0Var.f28421c);
                    if (c0Var.f28420b.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 2:
                return ((io.odeeo.internal.q0.o) this.f4326c).a(message);
            case 3:
                y yVar = (y) this.f4326c;
                Iterator it6 = yVar.f60810d.iterator();
                while (it6.hasNext()) {
                    ((y.a) it6.next()).iterationFinished(yVar.f60809c);
                    if (yVar.f60808b.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                zn.g gVar = (zn.g) this.f4326c;
                CopyOnWriteArraySet copyOnWriteArraySet2 = gVar.f98332f;
                int i13 = message.what;
                if (i13 == 1) {
                    List list2 = (List) message.obj;
                    gVar.f98335i = true;
                    gVar.f98341o = Collections.unmodifiableList(list2);
                    boolean zD3 = gVar.d();
                    Iterator it7 = copyOnWriteArraySet2.iterator();
                    while (it7.hasNext()) {
                        ((zn.l) ((zn.h) it7.next())).onInitialized(gVar);
                    }
                    if (zD3) {
                        gVar.a();
                    }
                } else if (i13 == 2) {
                    int i14 = message.arg1;
                    int i15 = message.arg2;
                    gVar.f98333g -= i14;
                    gVar.f98334h = i15;
                    if (gVar.isIdle()) {
                        Iterator it8 = copyOnWriteArraySet2.iterator();
                        while (it8.hasNext()) {
                            ((zn.l) ((zn.h) it8.next())).onIdle(gVar);
                        }
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    g.a aVar2 = (g.a) message.obj;
                    gVar.f98341o = Collections.unmodifiableList(aVar2.f98345c);
                    zn.c cVar2 = aVar2.f98343a;
                    boolean zD4 = gVar.d();
                    if (aVar2.f98344b) {
                        Iterator it9 = copyOnWriteArraySet2.iterator();
                        while (it9.hasNext()) {
                            ((zn.l) ((zn.h) it9.next())).onDownloadRemoved(gVar, cVar2);
                        }
                    } else {
                        Iterator it10 = copyOnWriteArraySet2.iterator();
                        while (it10.hasNext()) {
                            ((zn.l) ((zn.h) it10.next())).onDownloadChanged(gVar, cVar2, aVar2.f98346d);
                        }
                    }
                    if (zD4) {
                        gVar.a();
                    }
                }
                return true;
        }
    }
}
