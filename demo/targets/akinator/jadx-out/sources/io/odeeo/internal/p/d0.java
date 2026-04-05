package io.odeeo.internal.p;

import android.util.SparseArray;
import io.odeeo.internal.b.g0;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65292a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65293b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f65294c;

        public a(String str, int i10, byte[] bArr) {
            this.f65292a = str;
            this.f65293b = i10;
            this.f65294c = bArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f65295a;

        /* renamed from: b, reason: collision with root package name */
        public final String f65296b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f65297c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f65298d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f65295a = i10;
            this.f65296b = str;
            this.f65297c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f65298d = bArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        SparseArray<d0> createInitialPayloadReaders();

        d0 createPayloadReader(int i10, b bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f65299a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65300b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65301c;

        /* renamed from: d, reason: collision with root package name */
        public int f65302d;

        /* renamed from: e, reason: collision with root package name */
        public String f65303e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public final void a() {
            if (this.f65302d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void generateNewId() {
            int i10 = this.f65302d;
            this.f65302d = i10 == Integer.MIN_VALUE ? this.f65300b : i10 + this.f65301c;
            this.f65303e = this.f65299a + this.f65302d;
        }

        public String getFormatId() {
            a();
            return this.f65303e;
        }

        public int getTrackId() {
            a();
            return this.f65302d;
        }

        public d(int i10, int i11, int i12) {
            this.f65299a = i10 != Integer.MIN_VALUE ? o2.j(i10, "/") : "";
            this.f65300b = i11;
            this.f65301c = i12;
            this.f65302d = Integer.MIN_VALUE;
            this.f65303e = "";
        }
    }

    void consume(io.odeeo.internal.q0.x xVar, int i10) throws g0;

    void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d dVar);

    void seek();
}
