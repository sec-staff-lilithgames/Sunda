package zk;

import com.inmobi.media.Ve;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ve f98073c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f98074e;

    public /* synthetic */ c0(Ve ve2, Map map, int i10) {
        this.f98072b = i10;
        this.f98073c = ve2;
        this.f98074e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98072b) {
            case 0:
                Ve.a(this.f98073c, this.f98074e);
                break;
            default:
                Ve.b(this.f98073c, this.f98074e);
                break;
        }
    }
}
