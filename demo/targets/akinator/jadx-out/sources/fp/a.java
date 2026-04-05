package fp;

import com.inmobi.commons.core.configs.CrashConfig;
import io.bidmachine.media3.common.util.a1;
import java.math.BigInteger;
import ko.w0;
import ko.y0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f55930a;

    public a(b bVar) {
        this.f55930a = bVar;
    }

    @Override // ko.y0
    public long getDurationUs() {
        return (this.f55930a.f55936f * 1000000) / r0.f55934d.f55975i;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        b bVar = this.f55930a;
        long j11 = bVar.f55932b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((bVar.f55934d.f55975i * j10) / 1000000);
        long j12 = bVar.f55933c;
        return new w0(new z0(j10, a1.constrainValue((bigIntegerValueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f55936f)).longValue() + j11) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, bVar.f55932b, j12 - 1)));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }
}
