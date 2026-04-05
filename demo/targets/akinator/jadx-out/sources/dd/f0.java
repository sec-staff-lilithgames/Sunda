package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f52006a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f52007b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f52008c;

    /* renamed from: d, reason: collision with root package name */
    public int f52009d;

    public abstract Object _constructArray(int i10);

    public final Object appendCompletedChunk(Object obj, int i10) {
        e0 e0Var = new e0(obj, i10);
        if (this.f52007b == null) {
            this.f52008c = e0Var;
            this.f52007b = e0Var;
        } else {
            this.f52008c.linkNext(e0Var);
            this.f52008c = e0Var;
        }
        this.f52009d += i10;
        return _constructArray(i10 < 16384 ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int bufferedSize() {
        return this.f52009d;
    }

    public Object completeAndClearBuffer(Object obj, int i10) {
        int i11 = this.f52009d + i10;
        Object obj_constructArray = _constructArray(i11);
        int iCopyData = 0;
        for (e0 next = this.f52007b; next != null; next = next.next()) {
            iCopyData = next.copyData(obj_constructArray, iCopyData);
        }
        System.arraycopy(obj, 0, obj_constructArray, iCopyData, i10);
        int i12 = iCopyData + i10;
        if (i12 == i11) {
            return obj_constructArray;
        }
        throw new IllegalStateException(w0.i.a(i11, i12, "Should have gotten ", " entries, got "));
    }

    public Object resetAndStart() {
        e0 e0Var = this.f52008c;
        if (e0Var != null) {
            this.f52006a = e0Var.getData();
        }
        this.f52008c = null;
        this.f52007b = null;
        this.f52009d = 0;
        Object obj = this.f52006a;
        return obj == null ? _constructArray(12) : obj;
    }
}
