package pw;

import com.applovin.shadow.okio.Segment;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f82006a = new w0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f82007b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f82008c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f82007b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f82008c = atomicReferenceArr;
    }

    public static AtomicReference a() {
        return f82008c[(int) (Thread.currentThread().getId() & (f82007b - 1))];
    }

    public static final void recycle(w0 segment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(segment, "segment");
        if (segment.f81999f != null || segment.f82000g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f81997d) {
            return;
        }
        AtomicReference atomicReferenceA = a();
        w0 w0Var = f82006a;
        w0 w0Var2 = (w0) atomicReferenceA.getAndSet(w0Var);
        if (w0Var2 == w0Var) {
            return;
        }
        int i10 = w0Var2 != null ? w0Var2.f81996c : 0;
        if (i10 >= 65536) {
            atomicReferenceA.set(w0Var2);
            return;
        }
        segment.f81999f = w0Var2;
        segment.f81995b = 0;
        segment.f81996c = i10 + Segment.SIZE;
        atomicReferenceA.set(segment);
    }

    public static final w0 take() {
        AtomicReference atomicReferenceA = a();
        w0 w0Var = f82006a;
        w0 w0Var2 = (w0) atomicReferenceA.getAndSet(w0Var);
        if (w0Var2 == w0Var) {
            return new w0();
        }
        if (w0Var2 == null) {
            atomicReferenceA.set(null);
            return new w0();
        }
        atomicReferenceA.set(w0Var2.f81999f);
        w0Var2.f81999f = null;
        w0Var2.f81996c = 0;
        return w0Var2;
    }
}
