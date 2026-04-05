package zn;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f98315a;

    static {
        int[] iArr = {3, 4};
        if (iArr.length == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
    }

    public a(kn.b bVar) {
        this(bVar, "");
    }

    public final void a() {
        synchronized (this.f98315a) {
            throw null;
        }
    }

    @Override // zn.v, zn.f
    public c getDownload(String str) throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v, zn.f
    public d getDownloads(int... iArr) throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v
    public void putDownload(c cVar) throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v
    public void removeDownload(String str) throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v
    public void setDownloadingStatesToQueued() throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v
    public void setStatesToRemoving() throws kn.a {
        a();
        throw null;
    }

    @Override // zn.v
    public void setStopReason(int i10) throws kn.a {
        a();
        throw null;
    }

    public a(kn.b bVar, String str) {
        this.f98315a = new Object();
    }

    @Override // zn.v
    public void setStopReason(String str, int i10) throws kn.a {
        a();
        throw null;
    }
}
