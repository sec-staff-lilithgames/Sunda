package df;

import com.google.android.exoplayer2.z0;
import java.io.IOException;
import qf.p;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends a {

    /* renamed from: g, reason: collision with root package name */
    public final long f52176g;

    public b(p pVar, t tVar, z0 z0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(pVar, tVar, 1, z0Var, i10, obj, j10, j11);
        com.google.android.exoplayer2.util.a.checkNotNull(z0Var);
        this.f52176g = j12;
    }

    @Override // df.a, qf.s0
    public abstract /* synthetic */ void cancelLoad();

    public long getNextChunkIndex() {
        long j10 = this.f52176g;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();

    @Override // df.a, qf.s0
    public abstract /* synthetic */ void load() throws IOException;
}
