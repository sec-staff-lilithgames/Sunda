package zk;

import com.inmobi.media.C0;
import com.inmobi.media.D0;
import com.inmobi.media.Fe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte f98133c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98134e;

    public /* synthetic */ k(Object obj, byte b10, int i10) {
        this.f98132b = i10;
        this.f98134e = obj;
        this.f98133c = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98132b) {
            case 0:
                C0.a((D0) this.f98134e, this.f98133c);
                break;
            default:
                Fe.a((Fe) this.f98134e, this.f98133c);
                break;
        }
    }
}
