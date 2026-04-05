package xr;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n implements ue {
    public abstract r4 a();

    public abstract m b();

    @Override // xr.ue
    public final void flush() {
        if (a().isClosed()) {
            return;
        }
        a().flush();
    }

    @Override // xr.ue, xr.k1
    public boolean isReady() {
        return b().b();
    }

    @Override // xr.ue
    public void optimizeForDirectExecutor() {
        m mVarB = b();
        p9 p9Var = mVarB.f92781e;
        p9Var.f92881b = mVarB;
        mVarB.f92777a = p9Var;
    }

    @Override // xr.ue
    public final void request(int i10) {
        m mVarB = b();
        mVarB.getClass();
        mVarB.runOnTransportThread(new l(mVarB, lt.c.linkOut(), i10));
    }

    @Override // xr.ue
    public final void setCompressor(wr.d0 d0Var) {
        a().setCompressor((wr.d0) mh.p1.checkNotNull(d0Var, "compressor"));
    }

    @Override // xr.ue
    public final void setMessageCompression(boolean z10) {
        a().setMessageCompression(z10);
    }

    @Override // xr.ue
    public final void writeMessage(InputStream inputStream) throws IOException {
        mh.p1.checkNotNull(inputStream, PglCryptUtils.KEY_MESSAGE);
        try {
            if (!a().isClosed()) {
                a().writePayload(inputStream);
            }
        } finally {
            c5.closeQuietly(inputStream);
        }
    }
}
