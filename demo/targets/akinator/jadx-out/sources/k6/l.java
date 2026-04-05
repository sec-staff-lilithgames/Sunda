package k6;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f70617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70618b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f70619c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70620d;

    public l(String str) {
        this(str, (m[]) null);
    }

    public final void a(int i10) {
        int i11 = this.f70620d;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        sb2.append(i11 != 0 ? i11 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb2.append(" expected, but got ");
        sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb2.toString());
    }

    public byte[] getArrayBuffer() {
        a(1);
        byte[] bArr = this.f70619c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    public String getData() {
        a(0);
        return this.f70618b;
    }

    public m[] getPorts() {
        return this.f70617a;
    }

    public int getType() {
        return this.f70620d;
    }

    public l(String str, m[] mVarArr) {
        this.f70618b = str;
        this.f70619c = null;
        this.f70617a = mVarArr;
        this.f70620d = 0;
    }

    public l(byte[] bArr) {
        this(bArr, (m[]) null);
    }

    public l(byte[] bArr, m[] mVarArr) {
        Objects.requireNonNull(bArr);
        this.f70619c = bArr;
        this.f70618b = null;
        this.f70617a = mVarArr;
        this.f70620d = 1;
    }
}
