package ji;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f69608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f69609b;

    public p(byte[] bArr, int[] iArr) {
        this.f69608a = bArr;
        this.f69609b = iArr;
    }

    @Override // ji.n
    public void read(InputStream inputStream, int i10) throws IOException {
        int[] iArr = this.f69609b;
        try {
            inputStream.read(this.f69608a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            inputStream.close();
        }
    }
}
