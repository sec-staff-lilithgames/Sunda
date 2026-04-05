package zk;

import com.inmobi.media.R0;
import com.inmobi.media.U0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0 f98205c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WeakReference f98206e;

    public /* synthetic */ x(U0 u02, WeakReference weakReference, int i10) {
        this.f98204b = i10;
        this.f98205c = u02;
        this.f98206e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98204b) {
            case 0:
                R0.b(this.f98205c, this.f98206e);
                break;
            default:
                R0.a(this.f98205c, this.f98206e);
                break;
        }
    }
}
