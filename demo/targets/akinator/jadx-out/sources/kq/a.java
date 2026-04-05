package kq;

import dq.c0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f71941c;

    public /* synthetic */ a(c cVar, int i10) {
        this.f71940b = i10;
        this.f71941c = cVar;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f71940b;
        c this$0 = this.f71941c;
        switch (i10) {
            case 0:
                int i11 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar = this$0.f71947t;
                if (bVar != null) {
                    bVar.e();
                    break;
                }
                break;
            case 1:
                int i12 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                this$0.C();
                break;
            case 2:
                int i13 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar2 = this$0.f71947t;
                if (bVar2 != null) {
                    bVar2.a();
                }
                this$0.f71947t = null;
                break;
            case 3:
                int i14 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar3 = this$0.f71947t;
                if (bVar3 != null) {
                    bVar3.pause();
                    break;
                }
                break;
            case 4:
                int i15 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar4 = this$0.f71947t;
                if (bVar4 != null) {
                    bVar4.play();
                    break;
                }
                break;
            default:
                int i16 = c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                lq.b bVar5 = this$0.f71947t;
                if (bVar5 != null) {
                    bVar5.k();
                    break;
                }
                break;
        }
    }
}
