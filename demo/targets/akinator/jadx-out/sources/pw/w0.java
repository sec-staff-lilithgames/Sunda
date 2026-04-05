package pw;

import com.applovin.shadow.okio.Segment;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f81994a;

    /* renamed from: b, reason: collision with root package name */
    public int f81995b;

    /* renamed from: c, reason: collision with root package name */
    public int f81996c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f81997d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f81998e;

    /* renamed from: f, reason: collision with root package name */
    public w0 f81999f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f82000g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public w0() {
        this.f81994a = new byte[Segment.SIZE];
        this.f81998e = true;
        this.f81997d = false;
    }

    public final void compact() {
        int i10;
        w0 w0Var = this.f82000g;
        if (w0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        if (w0Var.f81998e) {
            int i11 = this.f81996c - this.f81995b;
            w0 w0Var2 = this.f82000g;
            kotlin.jvm.internal.e0.checkNotNull(w0Var2);
            int i12 = 8192 - w0Var2.f81996c;
            w0 w0Var3 = this.f82000g;
            kotlin.jvm.internal.e0.checkNotNull(w0Var3);
            if (w0Var3.f81997d) {
                i10 = 0;
            } else {
                w0 w0Var4 = this.f82000g;
                kotlin.jvm.internal.e0.checkNotNull(w0Var4);
                i10 = w0Var4.f81995b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            w0 w0Var5 = this.f82000g;
            kotlin.jvm.internal.e0.checkNotNull(w0Var5);
            writeTo(w0Var5, i11);
            pop();
            x0.recycle(this);
        }
    }

    public final w0 pop() {
        w0 w0Var = this.f81999f;
        if (w0Var == this) {
            w0Var = null;
        }
        w0 w0Var2 = this.f82000g;
        kotlin.jvm.internal.e0.checkNotNull(w0Var2);
        w0Var2.f81999f = this.f81999f;
        w0 w0Var3 = this.f81999f;
        kotlin.jvm.internal.e0.checkNotNull(w0Var3);
        w0Var3.f82000g = this.f82000g;
        this.f81999f = null;
        this.f82000g = null;
        return w0Var;
    }

    public final w0 push(w0 segment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(segment, "segment");
        segment.f82000g = this;
        segment.f81999f = this.f81999f;
        w0 w0Var = this.f81999f;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        w0Var.f82000g = segment;
        this.f81999f = segment;
        return segment;
    }

    public final w0 sharedCopy() {
        this.f81997d = true;
        return new w0(this.f81994a, this.f81995b, this.f81996c, true, false);
    }

    public final w0 split(int i10) {
        w0 w0VarTake;
        if (i10 <= 0 || i10 > this.f81996c - this.f81995b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            w0VarTake = sharedCopy();
        } else {
            w0VarTake = x0.take();
            byte[] bArr = w0VarTake.f81994a;
            int i11 = this.f81995b;
            uu.f0.copyInto$default(this.f81994a, bArr, 0, i11, i11 + i10, 2, (Object) null);
        }
        w0VarTake.f81996c = w0VarTake.f81995b + i10;
        this.f81995b += i10;
        w0 w0Var = this.f82000g;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        w0Var.push(w0VarTake);
        return w0VarTake;
    }

    public final w0 unsharedCopy() {
        byte[] bArr = this.f81994a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new w0(bArrCopyOf, this.f81995b, this.f81996c, false, true);
    }

    public final void writeTo(w0 sink, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (!sink.f81998e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f81996c;
        if (i11 + i10 > 8192) {
            if (sink.f81997d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f81995b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f81994a;
            uu.f0.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f81996c -= sink.f81995b;
            sink.f81995b = 0;
        }
        byte[] bArr2 = sink.f81994a;
        int i13 = sink.f81996c;
        int i14 = this.f81995b;
        uu.f0.copyInto(this.f81994a, bArr2, i13, i14, i14 + i10);
        sink.f81996c += i10;
        this.f81995b += i10;
    }

    public w0(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        this.f81994a = data;
        this.f81995b = i10;
        this.f81996c = i11;
        this.f81997d = z10;
        this.f81998e = z11;
    }
}
