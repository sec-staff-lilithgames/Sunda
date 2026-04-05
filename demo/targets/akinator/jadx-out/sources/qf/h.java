package qf;

import android.net.Uri;
import com.google.android.exoplayer2.util.n1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82941a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f82942b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f82943c;

    /* renamed from: d, reason: collision with root package name */
    public t f82944d;

    public h(boolean z10) {
        this.f82941a = z10;
    }

    public final void a(int i10) {
        t tVar = (t) n1.castNonNull(this.f82944d);
        for (int i11 = 0; i11 < this.f82943c; i11++) {
            ((x) ((c1) this.f82942b.get(i11))).onBytesTransferred(this, tVar, this.f82941a, i10);
        }
    }

    @Override // qf.p
    public final void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        ArrayList arrayList = this.f82942b;
        if (arrayList.contains(c1Var)) {
            return;
        }
        arrayList.add(c1Var);
        this.f82943c++;
    }

    public final void b() {
        t tVar = (t) n1.castNonNull(this.f82944d);
        for (int i10 = 0; i10 < this.f82943c; i10++) {
            ((x) ((c1) this.f82942b.get(i10))).onTransferEnd(this, tVar, this.f82941a);
        }
        this.f82944d = null;
    }

    public final void c(t tVar) {
        for (int i10 = 0; i10 < this.f82943c; i10++) {
            ((x) ((c1) this.f82942b.get(i10))).onTransferInitializing(this, tVar, this.f82941a);
        }
    }

    @Override // qf.p
    public abstract /* synthetic */ void close() throws IOException;

    public final void d(t tVar) {
        this.f82944d = tVar;
        for (int i10 = 0; i10 < this.f82943c; i10++) {
            ((x) ((c1) this.f82942b.get(i10))).onTransferStart(this, tVar, this.f82941a);
        }
    }

    @Override // qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.p
    public abstract /* synthetic */ Uri getUri();

    @Override // qf.p
    public abstract /* synthetic */ long open(t tVar) throws IOException;

    @Override // qf.p, qf.k
    public abstract /* synthetic */ int read(byte[] bArr, int i10, int i11) throws IOException;
}
