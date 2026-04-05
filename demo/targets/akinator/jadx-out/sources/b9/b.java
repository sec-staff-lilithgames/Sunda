package b9;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements m8.a {

    /* renamed from: a, reason: collision with root package name */
    public final q8.d f8931a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f8932b;

    public b(q8.d dVar) {
        this(dVar, null);
    }

    @Override // m8.a
    public Bitmap obtain(int i10, int i11, Bitmap.Config config) {
        return this.f8931a.getDirty(i10, i11, config);
    }

    @Override // m8.a
    public byte[] obtainByteArray(int i10) {
        q8.b bVar = this.f8932b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.get(i10, byte[].class);
    }

    @Override // m8.a
    public int[] obtainIntArray(int i10) {
        q8.b bVar = this.f8932b;
        return bVar == null ? new int[i10] : (int[]) bVar.get(i10, int[].class);
    }

    @Override // m8.a
    public void release(Bitmap bitmap) {
        this.f8931a.put(bitmap);
    }

    public b(q8.d dVar, q8.b bVar) {
        this.f8931a = dVar;
        this.f8932b = bVar;
    }

    @Override // m8.a
    public void release(byte[] bArr) {
        q8.b bVar = this.f8932b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // m8.a
    public void release(int[] iArr) {
        q8.b bVar = this.f8932b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
