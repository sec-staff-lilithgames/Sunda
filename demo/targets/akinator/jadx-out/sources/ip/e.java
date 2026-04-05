package ip;

import hp.i;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public final List f68351b;

    public e(List<in.b> list) {
        this.f68351b = list;
    }

    @Override // hp.i
    public List<in.b> getCues(long j10) {
        return j10 >= 0 ? this.f68351b : Collections.EMPTY_LIST;
    }

    @Override // hp.i
    public long getEventTime(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 == 0);
        return 0L;
    }

    @Override // hp.i
    public int getEventTimeCount() {
        return 1;
    }

    @Override // hp.i
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
