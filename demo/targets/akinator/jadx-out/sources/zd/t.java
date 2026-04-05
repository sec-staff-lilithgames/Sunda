package zd;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n3;
import io.bidmachine.NetworkAdUnit;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class t implements com.google.android.exoplayer2.util.a0, rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97865c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f97866e;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f97864b = i10;
        this.f97865c = obj;
        this.f97866e = obj2;
    }

    @Override // rr.b
    public Object get() {
        NetworkAdUnit networkAdUnit = (NetworkAdUnit) this.f97865c;
        return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), (zl.t) this.f97866e);
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        switch (this.f97864b) {
            case 0:
                ((z) ((d) obj)).onCues((b) this.f97865c, (List) this.f97866e);
                break;
            case 1:
                ((z) ((d) obj)).onTracksChanged((b) this.f97865c, (n3) this.f97866e);
                break;
            case 2:
                ((z) ((d) obj)).onDeviceInfoChanged((b) this.f97865c, (com.google.android.exoplayer2.q) this.f97866e);
                break;
            case 3:
                ((z) ((d) obj)).onMetadata((b) this.f97865c, (Metadata) this.f97866e);
                break;
            default:
                b bVar = (b) this.f97865c;
                sf.x xVar = (sf.x) this.f97866e;
                z zVar = (z) ((d) obj);
                zVar.onVideoSizeChanged(bVar, xVar);
                zVar.onVideoSizeChanged(bVar, xVar.f85739b, xVar.f85740c, xVar.f85741e, xVar.f85742f);
                break;
        }
    }
}
