package zk;

import com.inmobi.media.M0;
import com.inmobi.media.U0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0 f98178c;

    public /* synthetic */ r(U0 u02, int i10) {
        this.f98177b = i10;
        this.f98178c = u02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98177b) {
            case 0:
                M0.a(this.f98178c);
                break;
            case 1:
                M0.b(this.f98178c);
                break;
            default:
                U0.e(this.f98178c);
                break;
        }
    }
}
