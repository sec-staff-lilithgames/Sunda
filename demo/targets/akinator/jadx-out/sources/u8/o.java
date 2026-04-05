package u8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements m0, s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88098a;

    public o(Context context) {
        this.f88098a = context;
    }

    @Override // u8.m0
    public l0 build(t0 t0Var) {
        return new t(this.f88098a, this);
    }

    @Override // u8.s
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }

    @Override // u8.s
    public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // u8.s
    public AssetFileDescriptor open(Resources.Theme theme, Resources resources, int i10) {
        return resources.openRawResourceFd(i10);
    }

    @Override // u8.m0
    public void teardown() {
    }
}
