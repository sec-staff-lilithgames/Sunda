package ne;

import com.google.android.exoplayer2.util.v0;
import ee.l0;
import ee.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public l0 f76041b;

    /* renamed from: c, reason: collision with root package name */
    public s f76042c;

    /* renamed from: d, reason: collision with root package name */
    public h f76043d;

    /* renamed from: e, reason: collision with root package name */
    public long f76044e;

    /* renamed from: f, reason: collision with root package name */
    public long f76045f;

    /* renamed from: g, reason: collision with root package name */
    public long f76046g;

    /* renamed from: h, reason: collision with root package name */
    public int f76047h;

    /* renamed from: i, reason: collision with root package name */
    public int f76048i;

    /* renamed from: k, reason: collision with root package name */
    public long f76050k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f76051l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f76052m;

    /* renamed from: a, reason: collision with root package name */
    public final f f76040a = new f();

    /* renamed from: j, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f76049j = new androidx.localbroadcastmanager.content.b();

    public void a(long j10) {
        this.f76046g = j10;
    }

    public abstract long b(v0 v0Var);

    public abstract boolean c(v0 v0Var, long j10, androidx.localbroadcastmanager.content.b bVar);

    public void d(boolean z10) {
        if (z10) {
            this.f76049j = new androidx.localbroadcastmanager.content.b();
            this.f76045f = 0L;
            this.f76047h = 0;
        } else {
            this.f76047h = 1;
        }
        this.f76044e = -1L;
        this.f76046g = 0L;
    }
}
