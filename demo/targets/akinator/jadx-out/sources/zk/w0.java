package zk;

import com.inmobi.media.C2721cc;
import com.inmobi.media.C2978s;
import com.inmobi.media.F5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F5 f98202c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2721cc f98203e;

    public /* synthetic */ w0(F5 f52, C2721cc c2721cc, int i10) {
        this.f98201b = i10;
        this.f98202c = f52;
        this.f98203e = c2721cc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98201b) {
            case 0:
                C2978s.d(this.f98202c, this.f98203e);
                break;
            default:
                C2978s.b(this.f98202c, this.f98203e);
                break;
        }
    }
}
