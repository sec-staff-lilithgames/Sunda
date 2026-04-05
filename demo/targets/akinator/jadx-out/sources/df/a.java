package df;

import android.net.Uri;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import qf.a1;
import qf.p;
import qf.s0;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f52170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52171b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f52172c;

    /* renamed from: d, reason: collision with root package name */
    public final long f52173d;

    /* renamed from: e, reason: collision with root package name */
    public final long f52174e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f52175f;

    public a(p pVar, t tVar, int i10, z0 z0Var, int i11, Object obj, long j10, long j11) {
        this.f52175f = new a1(pVar);
        this.f52170a = z0Var;
        this.f52171b = i11;
        this.f52172c = obj;
        this.f52173d = j10;
        this.f52174e = j11;
        bf.t.getNewId();
    }

    public final long bytesLoaded() {
        return this.f52175f.getBytesRead();
    }

    @Override // qf.s0
    public abstract /* synthetic */ void cancelLoad();

    public final long getDurationUs() {
        return this.f52174e - this.f52173d;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.f52175f.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.f52175f.getLastOpenedUri();
    }

    @Override // qf.s0
    public abstract /* synthetic */ void load() throws IOException;
}
