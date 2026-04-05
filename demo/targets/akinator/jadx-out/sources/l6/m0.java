package l6;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m0 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public final int f72468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72469c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f72470e;

    public m0(String str) {
        this.f72468b = 0;
        this.f72469c = str;
        this.f72470e = null;
    }

    public final void a(int i10) {
        int i11 = this.f72468b;
        if (i11 != i10) {
            throw new IllegalStateException(w0.i.a(i10, i11, "Expected ", ", but type is "));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f72470e;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        a(0);
        return this.f72469c;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f72468b;
    }

    public m0(byte[] bArr) {
        this.f72468b = 1;
        this.f72469c = null;
        this.f72470e = bArr;
    }
}
