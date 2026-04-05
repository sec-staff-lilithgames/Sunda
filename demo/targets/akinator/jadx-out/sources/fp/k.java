package fp;

import io.bidmachine.media3.common.util.m0;
import ko.c0;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public e1 f55968b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f55969c;

    /* renamed from: d, reason: collision with root package name */
    public h f55970d;

    /* renamed from: e, reason: collision with root package name */
    public long f55971e;

    /* renamed from: f, reason: collision with root package name */
    public long f55972f;

    /* renamed from: g, reason: collision with root package name */
    public long f55973g;

    /* renamed from: h, reason: collision with root package name */
    public int f55974h;

    /* renamed from: i, reason: collision with root package name */
    public int f55975i;

    /* renamed from: k, reason: collision with root package name */
    public long f55977k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f55978l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f55979m;

    /* renamed from: a, reason: collision with root package name */
    public final f f55967a = new f();

    /* renamed from: j, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f55976j = new androidx.localbroadcastmanager.content.b();

    public void a(long j10) {
        this.f55973g = j10;
    }

    public abstract long b(m0 m0Var);

    public abstract boolean c(m0 m0Var, long j10, androidx.localbroadcastmanager.content.b bVar);

    public void d(boolean z10) {
        if (z10) {
            this.f55976j = new androidx.localbroadcastmanager.content.b();
            this.f55972f = 0L;
            this.f55974h = 0;
        } else {
            this.f55974h = 1;
        }
        this.f55971e = -1L;
        this.f55973g = 0L;
    }
}
