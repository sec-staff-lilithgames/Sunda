package xn;

import android.content.Context;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f92090a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f92091b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f92092c;

    /* renamed from: d, reason: collision with root package name */
    public int f92093d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92094e;

    @Deprecated
    public h() {
        this.f92093d = 0;
        this.f92094e = false;
        this.f92090a = null;
        this.f92091b = null;
        this.f92092c = null;
    }

    @Override // xn.m
    public p createAdapter(l lVar) throws IOException {
        int i10;
        v2 v2Var;
        Context context;
        int i11 = a1.f60679a;
        if (i11 < 23 || ((i10 = this.f92093d) != 1 && (i10 != 0 || (i11 < 31 && ((context = this.f92090a) == null || i11 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))))) {
            return new i0().createAdapter(lVar);
        }
        int trackType = x0.getTrackType(lVar.f92106c.f60665o);
        io.bidmachine.media3.common.util.b0.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + a1.getTrackTypeString(trackType));
        v2 v2Var2 = this.f92091b;
        a aVar = (v2Var2 == null || (v2Var = this.f92092c) == null) ? new a(trackType) : new a(v2Var2, v2Var);
        aVar.experimentalSetAsyncCryptoFlagEnabled(this.f92094e);
        return aVar.createAdapter(lVar);
    }

    public h experimentalSetAsyncCryptoFlagEnabled(boolean z10) {
        this.f92094e = z10;
        return this;
    }

    public h forceDisableAsynchronous() {
        this.f92093d = 2;
        return this;
    }

    public h forceEnableAsynchronous() {
        this.f92093d = 1;
        return this;
    }

    public h(Context context) {
        this(context, null, null);
    }

    public h(Context context, v2 v2Var, v2 v2Var2) {
        this.f92090a = context;
        this.f92093d = 0;
        this.f92094e = false;
        this.f92091b = v2Var;
        this.f92092c = v2Var2;
    }
}
