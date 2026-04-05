package bq;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import br.p1;
import br.z;
import cr.q;
import dq.c0;
import dq.d0;
import kotlin.jvm.internal.e0;
import pq.i;
import tm.g;
import yq.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9728c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9729e;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f9727b = i10;
        this.f9728c = obj;
        this.f9729e = obj2;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        int i10 = this.f9727b;
        Object obj = this.f9729e;
        Object obj2 = this.f9728c;
        switch (i10) {
            case 0:
                e this$0 = (e) obj2;
                p1 privacySheetParams = (p1) obj;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
                f fVar = this$0.f9735c;
                if (fVar != null) {
                    fVar.onOpenPrivacySheet(this$0, privacySheetParams);
                    break;
                }
                break;
            case 1:
                e this$02 = (e) obj2;
                z brokenCreativeEvent = (z) obj;
                e0.checkNotNullParameter(this$02, "this$0");
                e0.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
                f fVar2 = this$02.f9735c;
                if (fVar2 != null) {
                    fVar2.onBrokenCreativeEvent(this$02, brokenCreativeEvent);
                    break;
                }
                break;
            case 2:
                i adPhaseController = (i) obj2;
                cq.e this$03 = (cq.e) obj;
                int i11 = cq.e.f50880m;
                e0.checkNotNullParameter(adPhaseController, "$adPhaseController");
                e0.checkNotNullParameter(this$03, "this$0");
                if (adPhaseController.a(this$03.f50882c)) {
                    this$03.f50886h.a();
                    this$03.c();
                    break;
                }
                break;
            case 3:
                dr.e eVar = q.f50924a;
                ((ir.d) obj2).execute(obj);
                break;
            case 4:
                er.f this$04 = (er.f) obj2;
                int i12 = er.f.f55012b;
                e0.checkNotNullParameter(this$04, "this$0");
                this$04.setBackground((Drawable) obj);
                break;
            case 5:
                gq.b this$05 = (gq.b) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                int i13 = gq.b.f58390u;
                e0.checkNotNullParameter(this$05, "this$0");
                e0.checkNotNullParameter(viewGroup, "$viewGroup");
                g gVar = this$05.f58392t;
                ar.d dVar = this$05.f58391s;
                if (dVar != null && gVar != null) {
                    dVar.onViewAddedToContainer(gVar.getWebView(), viewGroup);
                    break;
                }
                break;
            case 6:
                kq.c this$06 = (kq.c) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                int i14 = kq.c.f71945u;
                e0.checkNotNullParameter(this$06, "this$0");
                e0.checkNotNullParameter(viewGroup2, "$viewGroup");
                lq.b bVar = this$06.f71947t;
                ar.g gVar2 = this$06.f71946s;
                if (gVar2 != null && bVar != null) {
                    gVar2.onViewAddedToContainer(bVar.n(), viewGroup2);
                    break;
                }
                break;
            case 7:
                pq.e eVar2 = (pq.e) obj2;
                br.e eVar3 = (br.e) obj;
                if (eVar2.f81638k == null) {
                    o oVar = new o(eVar2.f81629b, eVar3, eVar2.f81632e);
                    eVar2.f81638k = oVar;
                    oVar.setListener(new pq.f(eVar2));
                    eVar2.f81638k.e();
                    break;
                }
                break;
            default:
                pq.e eVar4 = (pq.e) obj2;
                i iVar = (i) obj;
                d0.b(eVar4.f81628a, "removeAndDestroyAdPhaseController (%s)", iVar);
                ir.q.ifNotNull(iVar, new pq.b(eVar4, 0));
                eVar4.c(iVar);
                break;
        }
    }
}
