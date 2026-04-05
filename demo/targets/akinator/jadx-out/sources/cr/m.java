package cr;

import br.h0;
import java.net.HttpURLConnection;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends dr.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f50920c;

    public m(f fVar) {
        this.f50920c = fVar;
    }

    @Override // dr.b
    public void runTask() {
        HttpURLConnection httpURLConnectionB;
        f fVar = this.f50920c;
        h hVar = fVar.f50904h;
        nr.c cVar = f.f50896k;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionB = fVar.b(f.a(fVar.f50897a, fVar.f50900d));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int responseCode = httpURLConnectionB.getResponseCode();
            if (responseCode == 200) {
                j jVar = fVar.f50903g;
                if (jVar == null) {
                    if (hVar != null) {
                        hVar.onSuccess(null);
                    }
                    lr.a.disconnectSafely(httpURLConnectionB);
                    return;
                } else {
                    try {
                        Object objProcess = jVar.process(httpURLConnectionB);
                        if (hVar != null) {
                            hVar.onSuccess(objProcess);
                        }
                    } catch (Throwable th3) {
                        h0 h0VarCreate = h0.create(th3);
                        if (hVar != null) {
                            hVar.onError(h0VarCreate);
                        }
                    }
                }
            } else if (responseCode != 204) {
                h0 h0Var = new h0("Server response code - " + responseCode + QpyI.kza + httpURLConnectionB.getResponseMessage());
                if (hVar != null) {
                    hVar.onError(h0Var);
                }
            } else if (hVar != null) {
                hVar.onSuccess(null);
            }
            lr.a.disconnectSafely(httpURLConnectionB);
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = httpURLConnectionB;
            try {
                h0 h0VarCreate2 = h0.create(th);
                if (hVar != null) {
                    hVar.onError(h0VarCreate2);
                }
            } finally {
                lr.a.disconnectSafely(httpURLConnection);
            }
        }
    }
}
