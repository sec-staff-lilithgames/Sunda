package kq;

import dq.c0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f71943c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f71944e;

    public /* synthetic */ b(c cVar, Integer num, int i10) {
        this.f71942b = i10;
        this.f71943c = cVar;
        this.f71944e = num;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f71942b;
        Integer num = this.f71944e;
        c this$0 = this.f71943c;
        switch (i10) {
            case 0:
                int i11 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar = this$0.f71947t;
                if (bVar != null) {
                    bVar.b(num);
                    break;
                }
                break;
            default:
                int i12 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar2 = this$0.f71947t;
                if (bVar2 != null) {
                    bVar2.a(num);
                    break;
                }
                break;
        }
    }
}
