package go;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58330a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f58331b;

    /* renamed from: c, reason: collision with root package name */
    public int f58332c;

    /* renamed from: d, reason: collision with root package name */
    public io.bidmachine.media3.common.util.g f58333d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58334e;

    public n(Context context) {
        Long lValueOf = Long.valueOf(C.TIME_UNSET);
        this.f58330a = context == null ? null : context.getApplicationContext();
        this.f58332c = 2000;
        this.f58333d = io.bidmachine.media3.common.util.g.f60717a;
        this.f58334e = true;
        HashMap map = new HashMap(8);
        this.f58331b = map;
        map.put(0, 1000000L);
        map.put(2, lValueOf);
        map.put(3, lValueOf);
        map.put(4, lValueOf);
        map.put(5, lValueOf);
        map.put(10, lValueOf);
        map.put(9, lValueOf);
        map.put(7, lValueOf);
    }

    public o build() {
        return new o(this.f58330a, this.f58331b, this.f58332c, this.f58333d, this.f58334e);
    }

    public n setClock(io.bidmachine.media3.common.util.g gVar) {
        this.f58333d = gVar;
        return this;
    }

    public n setInitialBitrateEstimate(long j10) {
        Iterator it = this.f58331b.keySet().iterator();
        while (it.hasNext()) {
            setInitialBitrateEstimate(((Integer) it.next()).intValue(), j10);
        }
        return this;
    }

    public n setResetOnNetworkTypeChange(boolean z10) {
        this.f58334e = z10;
        return this;
    }

    public n setSlidingWindowMaxWeight(int i10) {
        this.f58332c = i10;
        return this;
    }

    public n setInitialBitrateEstimate(int i10, long j10) {
        this.f58331b.put(Integer.valueOf(i10), Long.valueOf(j10));
        return this;
    }

    public n setInitialBitrateEstimate(String str) {
        String upperCase = mh.c.toUpperCase(str);
        for (Integer num : this.f58331b.keySet()) {
            setInitialBitrateEstimate(num.intValue(), o.b(num.intValue(), upperCase));
        }
        return this;
    }
}
