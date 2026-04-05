package gq;

import dq.c0;
import kotlin.jvm.internal.e0;
import tm.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f58389c;

    public /* synthetic */ a(b bVar, int i10) {
        this.f58388b = i10;
        this.f58389c = bVar;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f58388b;
        b this$0 = this.f58389c;
        switch (i10) {
            case 0:
                int i11 = b.f58390u;
                e0.checkNotNullParameter(this$0, "this$0");
                g gVar = this$0.f58392t;
                if (gVar != null) {
                    gVar.destroy();
                }
                this$0.f58392t = null;
                break;
            case 1:
                int i12 = b.f58390u;
                e0.checkNotNullParameter(this$0, "this$0");
                g gVar2 = this$0.f58392t;
                if (gVar2 != null) {
                    gVar2.show();
                    this$0.z();
                    break;
                }
                break;
            default:
                int i13 = b.f58390u;
                e0.checkNotNullParameter(this$0, "this$0");
                this$0.C();
                break;
        }
    }
}
