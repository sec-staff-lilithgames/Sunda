package cq;

import dq.c0;
import dq.p0;
import kotlin.jvm.internal.e0;
import pq.g;
import pq.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50873c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f50872b = i10;
        this.f50873c = obj;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f50872b;
        Object obj = this.f50873c;
        switch (i10) {
            case 0:
                e this$0 = (e) obj;
                int i11 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                this$0.f50882c.removeAllViews();
                this$0.removeAllViews();
                break;
            case 1:
                ((g) obj).b();
                break;
            case 2:
                i iVar = (i) obj;
                iVar.d();
                iVar.onShown();
                break;
            case 3:
                ((p0) obj).a();
                break;
            default:
                ((dq.i) obj).a();
                break;
        }
    }
}
