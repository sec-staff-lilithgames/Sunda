package zk;

import android.net.Uri;
import com.inmobi.media.C2897n2;
import com.inmobi.media.C3039v9;
import com.inmobi.media.C3100z2;
import com.inmobi.media.F5;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import io.bidmachine.media3.exoplayer.offline.DownloadService;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98106c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98107e;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        this.f98105b = i10;
        this.f98106c = obj;
        this.f98107e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f98105b;
        Object obj = this.f98107e;
        Object obj2 = this.f98106c;
        switch (i10) {
            case 0:
                C3039v9.a((C3039v9) obj2, (Uri) obj);
                break;
            case 1:
                GestureDetectorOnGestureListenerC3093yc.b((GestureDetectorOnGestureListenerC3093yc) obj2, (String) obj);
                break;
            case 2:
                C3100z2.a((C2897n2) obj2, (F5) obj);
                break;
            default:
                ((zn.l) obj2).f98373b.getCurrentDownloads();
                HashMap map = DownloadService.f61512g;
                ((DownloadService) obj).getClass();
                break;
        }
    }
}
