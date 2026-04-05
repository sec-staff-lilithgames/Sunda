package em;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b0.e2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.AdsFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class o0 implements rr.b, vd.n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f54717c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54718e;

    public /* synthetic */ o0(Object obj, long j10, int i10) {
        this.f54716b = i10;
        this.f54718e = obj;
        this.f54717c = j10;
    }

    @Override // vd.n
    public Object apply(Object obj) {
        md.d0 d0Var = (md.d0) this.f54718e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f54717c));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{d0Var.getBackendName(), String.valueOf(yd.a.toInt(d0Var.getPriority()))}) < 1) {
            contentValues.put("backend_name", d0Var.getBackendName());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(yd.a.toInt(d0Var.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // rr.b
    public Object get() {
        switch (this.f54716b) {
            case 0:
                r0 r0Var = (r0) this.f54718e;
                AdsFormat adsFormat = r0Var.f54734d;
                int i10 = r0Var.f54744n.get();
                int i11 = r0Var.f54749s;
                int i12 = r0Var.f54748r;
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(adsFormat);
                sb2.append(") Execution waterfall load started after - ");
                sb2.append(this.f54717c);
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, " ms (failedAttempts - ", ", maxRetryDegree - ", sb2);
                return e2.n(sb2, ", retryBase - ", i12, " sec)");
            default:
                return "(" + ((w0) this.f54718e).f54775f + ") Execution ad unit load started after " + this.f54717c + " ms";
        }
    }

    public /* synthetic */ o0(md.d0 d0Var, long j10) {
        this.f54716b = 2;
        this.f54717c = j10;
        this.f54718e = d0Var;
    }
}
