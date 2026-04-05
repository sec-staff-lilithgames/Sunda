package a2;

import com.inmobi.media.C2777g0;
import com.vungle.ads.internal.util.ThreadUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f3490c;

    public /* synthetic */ d0(int i10, kv.a aVar) {
        this.f3489b = i10;
        this.f3490c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3489b) {
            case 0:
                kv.a tmp0 = this.f3490c;
                kotlin.jvm.internal.e0.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 1:
                ThreadUtil.m3671runOnUiThread$lambda0(this.f3490c);
                break;
            case 2:
                ThreadUtil.m3672runOnUiThread$lambda1(this.f3490c);
                break;
            case 3:
                kv.a tmp02 = this.f3490c;
                kotlin.jvm.internal.e0.checkNotNullParameter(tmp02, "$tmp0");
                tmp02.invoke();
                break;
            case 4:
                kv.a tmp03 = this.f3490c;
                kotlin.jvm.internal.e0.checkNotNullParameter(tmp03, "$tmp0");
                tmp03.invoke();
                break;
            case 5:
                this.f3490c.invoke();
                break;
            case 6:
                C2777g0.b(this.f3490c);
                break;
            default:
                C2777g0.a(this.f3490c);
                break;
        }
    }
}
