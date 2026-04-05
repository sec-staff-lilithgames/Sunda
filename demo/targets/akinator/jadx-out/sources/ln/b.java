package ln;

import android.net.Uri;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73419a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f73420b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f73421c;

    /* renamed from: d, reason: collision with root package name */
    public m f73422d;

    public b(boolean z10) {
        this.f73419a = z10;
    }

    public final void a(int i10) {
        m mVar = (m) a1.castNonNull(this.f73422d);
        for (int i11 = 0; i11 < this.f73421c; i11++) {
            ((go.o) ((g0) this.f73420b.get(i11))).onBytesTransferred(this, mVar, this.f73419a, i10);
        }
    }

    @Override // ln.i
    public final void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        ArrayList arrayList = this.f73420b;
        if (arrayList.contains(g0Var)) {
            return;
        }
        arrayList.add(g0Var);
        this.f73421c++;
    }

    public final void b() {
        m mVar = (m) a1.castNonNull(this.f73422d);
        for (int i10 = 0; i10 < this.f73421c; i10++) {
            ((go.o) ((g0) this.f73420b.get(i10))).onTransferEnd(this, mVar, this.f73419a);
        }
        this.f73422d = null;
    }

    public final void c(m mVar) {
        for (int i10 = 0; i10 < this.f73421c; i10++) {
            ((go.o) ((g0) this.f73420b.get(i10))).onTransferInitializing(this, mVar, this.f73419a);
        }
    }

    @Override // ln.i
    public abstract /* synthetic */ void close() throws IOException;

    public final void d(m mVar) {
        this.f73422d = mVar;
        for (int i10 = 0; i10 < this.f73421c; i10++) {
            ((go.o) ((g0) this.f73420b.get(i10))).onTransferStart(this, mVar, this.f73419a);
        }
    }

    @Override // ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.i
    public abstract /* synthetic */ Uri getUri();

    @Override // ln.i
    public abstract /* synthetic */ long open(m mVar) throws IOException;

    @Override // ln.i, gn.o
    public abstract /* synthetic */ int read(byte[] bArr, int i10, int i11) throws IOException;
}
