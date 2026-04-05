package ne;

import com.google.android.exoplayer2.util.n1;
import com.inmobi.commons.core.configs.CrashConfig;
import ee.g0;
import ee.i0;
import ee.j0;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f76003a;

    public a(b bVar) {
        this.f76003a = bVar;
    }

    @Override // ee.i0
    public long getDurationUs() {
        return (this.f76003a.f76009f * 1000000) / r0.f76007d.f76048i;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        b bVar = this.f76003a;
        long j11 = bVar.f76005b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((bVar.f76007d.f76048i * j10) / 1000000);
        long j12 = bVar.f76006c;
        return new g0(new j0(j10, n1.constrainValue((bigIntegerValueOf.multiply(BigInteger.valueOf(j12 - j11)).divide(BigInteger.valueOf(bVar.f76009f)).longValue() + j11) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, bVar.f76005b, j12 - 1)));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }
}
