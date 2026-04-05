package em;

import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class s0 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f54756c;

    public /* synthetic */ s0(w0 w0Var, int i10) {
        this.f54755b = i10;
        this.f54756c = w0Var;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f54755b) {
            case 0:
                w0 w0Var = this.f54756c;
                AdsFormat adsFormat = w0Var.f54775f;
                String str = w0Var.f54781l;
                int size = w0Var.f54782m.size();
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(adsFormat);
                sb2.append(") Polling started (waterfallId - ");
                sb2.append(str);
                sb2.append(", ad unit count - ");
                return a.b.f(size, ")", sb2);
            case 1:
                w0 w0Var2 = this.f54756c;
                AdsFormat adsFormat2 = w0Var2.f54775f;
                String str2 = w0Var2.f54781l;
                ConcurrentLinkedQueue concurrentLinkedQueue = w0Var2.f54783n;
                int size2 = concurrentLinkedQueue.size();
                StringBuilder sb3 = new StringBuilder("(");
                sb3.append(adsFormat2);
                sb3.append(") Polling completed (waterfallId - ");
                sb3.append(str2);
                sb3.append(", ad unit count - ");
                StringBuilder sb4 = new StringBuilder(a.b.f(size2, ")", sb3));
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    sb4.append("\n> " + s.toString((Waterfall.Result.AdUnit) it.next()));
                }
                return sb4.toString();
            case 2:
                return "(" + this.f54756c.f54775f + ") Stop polling. Waterfall already filled with expensive ads";
            default:
                return "(" + this.f54756c.f54775f + ") Can't create InternalAd";
        }
    }
}
