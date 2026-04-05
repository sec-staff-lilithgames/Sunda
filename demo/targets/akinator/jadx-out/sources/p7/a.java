package p7;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.u;
import l7.k;
import l7.s;
import p7.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f80715a;

    /* renamed from: b, reason: collision with root package name */
    public final k f80716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f80718d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C0760a implements c {

        /* renamed from: b, reason: collision with root package name */
        public final int f80719b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f80720c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0760a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        @Override // p7.c
        public d create(f fVar, k kVar) {
            boolean z10 = kVar instanceof s;
            b.a aVar = c.f80723a;
            return !z10 ? aVar.create(fVar, kVar) : ((s) kVar).getDataSource() == c7.f.f11833b ? aVar.create(fVar, kVar) : new a(fVar, kVar, this.f80719b, this.f80720c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0760a)) {
                return false;
            }
            C0760a c0760a = (C0760a) obj;
            return this.f80719b == c0760a.f80719b && this.f80720c == c0760a.f80720c;
        }

        public final int getDurationMillis() {
            return this.f80719b;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.f80720c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f80720c) + (this.f80719b * 31);
        }

        public C0760a(int i10) {
            this(i10, false, 2, null);
        }

        public C0760a(int i10, boolean z10) {
            this.f80719b = i10;
            this.f80720c = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public /* synthetic */ C0760a(int i10, boolean z10, int i11, u uVar) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    public a(f fVar, k kVar) {
        this(fVar, kVar, 0, false, 12, null);
    }

    public final int getDurationMillis() {
        return this.f80717c;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.f80718d;
    }

    @Override // p7.d
    public void transition() {
        f fVar = this.f80715a;
        Drawable drawable = fVar.getDrawable();
        k kVar = this.f80716b;
        boolean z10 = kVar instanceof s;
        e7.a aVar = new e7.a(drawable, kVar.getDrawable(), kVar.getRequest().getScale(), this.f80717c, (z10 && ((s) kVar).isPlaceholderCached()) ? false : true, this.f80718d);
        if (z10) {
            fVar.onSuccess(aVar);
        } else if (kVar instanceof l7.f) {
            fVar.onError(aVar);
        }
    }

    public a(f fVar, k kVar, int i10) {
        this(fVar, kVar, i10, false, 8, null);
    }

    public a(f fVar, k kVar, int i10, boolean z10) {
        this.f80715a = fVar;
        this.f80716b = kVar;
        this.f80717c = i10;
        this.f80718d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public /* synthetic */ a(f fVar, k kVar, int i10, boolean z10, int i11, u uVar) {
        this(fVar, kVar, (i11 & 4) != 0 ? 100 : i10, (i11 & 8) != 0 ? false : z10);
    }
}
