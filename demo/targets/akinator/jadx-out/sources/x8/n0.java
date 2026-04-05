package x8;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n0 implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f91851a;

    public n0(a0 a0Var) {
        this.f91851a = a0Var;
    }

    @Override // n8.x
    public p8.v0 decode(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, n8.v vVar) throws IOException {
        return this.f91851a.decode(parcelFileDescriptor, i10, i11, vVar);
    }

    @Override // n8.x
    public boolean handles(ParcelFileDescriptor parcelFileDescriptor, n8.v vVar) {
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && this.f91851a.handles(parcelFileDescriptor);
    }
}
