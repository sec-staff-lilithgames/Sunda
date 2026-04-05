package io.odeeo.internal.g;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64179a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f64180b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64181c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64182d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f64179a = i10;
            this.f64180b = bArr;
            this.f64181c = i11;
            this.f64182d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f64179a == aVar.f64179a && this.f64181c == aVar.f64181c && this.f64182d == aVar.f64182d && Arrays.equals(this.f64180b, aVar.f64180b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f64180b) + (this.f64179a * 31)) * 31) + this.f64181c) * 31) + this.f64182d;
        }
    }

    void format(io.odeeo.internal.b.t tVar);

    default int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10) throws IOException {
        return sampleData(gVar, i10, z10, 0);
    }

    int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10, int i11) throws IOException;

    void sampleData(io.odeeo.internal.q0.x xVar, int i10, int i11);

    void sampleMetadata(long j10, int i10, int i11, int i12, a aVar);

    default void sampleData(io.odeeo.internal.q0.x xVar, int i10) {
        sampleData(xVar, i10, 0);
    }
}
