package zo;

import gn.r0;
import gn.t0;
import io.bidmachine.media3.common.util.a1;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f98417a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f98418a;

        /* renamed from: b, reason: collision with root package name */
        public final long f98419b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98420c;

        public a(long j10, long j11, int i10) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 < j11);
            this.f98418a = j10;
            this.f98419b = j11;
            this.f98420c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f98418a == aVar.f98418a && this.f98419b == aVar.f98419b && this.f98420c == aVar.f98420c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f98418a), Long.valueOf(this.f98419b), Integer.valueOf(this.f98420c));
        }

        public String toString() {
            return a1.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f98418a), Long.valueOf(this.f98419b), Integer.valueOf(this.f98420c));
        }
    }

    public b(List<a> list) {
        this.f98417a = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = list.get(0).f98419b;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).f98418a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = list.get(i10).f98419b;
                    i10++;
                }
            }
        }
        io.bidmachine.media3.common.util.a.checkArgument(!z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f98417a.equals(((b) obj).f98417a);
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return this.f98417a.hashCode();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f98417a;
    }
}
