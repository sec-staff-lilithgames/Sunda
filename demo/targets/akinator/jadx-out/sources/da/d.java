package da;

import android.graphics.Typeface;
import android.view.View;
import kotlin.jvm.internal.e0;
import o9.l7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f51959c;

    public /* synthetic */ d(f fVar, int i10) {
        this.f51958b = i10;
        this.f51959c = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f51958b;
        f fVar = this.f51959c;
        switch (i10) {
            case 0:
                Typeface typeface = f.f51960h;
                fVar.dismiss();
                g gVar = fVar.f51964e;
                if (gVar != null) {
                    e0.checkNotNull(gVar);
                    gVar.onCloseConfirme();
                    break;
                }
                break;
            case 1:
                Typeface typeface2 = f.f51960h;
                fVar.dismiss();
                g gVar2 = fVar.f51964e;
                if (gVar2 != null) {
                    e0.checkNotNull(gVar2);
                    gVar2.onCloseConfirme();
                    break;
                }
                break;
            case 2:
                Typeface typeface3 = f.f51960h;
                fVar.dismiss();
                g gVar3 = fVar.f51964e;
                if (gVar3 != null) {
                    e0.checkNotNull(gVar3);
                    gVar3.onClosedRefuse();
                    break;
                }
                break;
            case 3:
                Typeface typeface4 = f.f51960h;
                fVar.dismiss();
                j jVar = fVar.f51965f;
                if (jVar != null) {
                    e0.checkNotNull(jVar);
                    jVar.onOk();
                    break;
                }
                break;
            case 4:
                Typeface typeface5 = f.f51960h;
                fVar.dismiss();
                j jVar2 = fVar.f51965f;
                if (jVar2 != null) {
                    e0.checkNotNull(jVar2);
                    jVar2.onOk();
                    break;
                }
                break;
            case 5:
                Typeface typeface6 = f.f51960h;
                fVar.dismiss();
                g gVar4 = fVar.f51964e;
                if (gVar4 != null) {
                    e0.checkNotNull(gVar4);
                    gVar4.onCloseConfirme();
                    break;
                }
                break;
            case 6:
                Typeface typeface7 = f.f51960h;
                fVar.dismiss();
                j jVar3 = fVar.f51965f;
                if (jVar3 != null) {
                    e0.checkNotNull(jVar3);
                    jVar3.onOk();
                    break;
                }
                break;
            case 7:
                Typeface typeface8 = f.f51960h;
                fVar.dismiss();
                g gVar5 = fVar.f51964e;
                if (gVar5 != null) {
                    e0.checkNotNull(gVar5);
                    gVar5.onClosedRefuse();
                    break;
                }
                break;
            case 8:
                Typeface typeface9 = f.f51960h;
                fVar.dismiss();
                g gVar6 = fVar.f51964e;
                if (gVar6 != null) {
                    e0.checkNotNull(gVar6);
                    gVar6.onCloseConfirme();
                    break;
                }
                break;
            case 9:
                Typeface typeface10 = f.f51960h;
                fVar.dismiss();
                g gVar7 = fVar.f51964e;
                if (gVar7 != null) {
                    e0.checkNotNull(gVar7);
                    gVar7.onClosedRefuse();
                    break;
                }
                break;
            case 10:
                Typeface typeface11 = f.f51960h;
                fVar.dismiss();
                g gVar8 = fVar.f51964e;
                if (gVar8 != null) {
                    e0.checkNotNull(gVar8);
                    gVar8.onCloseConfirme();
                    break;
                }
                break;
            case 11:
                Typeface typeface12 = f.f51960h;
                fVar.dismiss();
                i iVar = fVar.f51966g;
                if (iVar != null) {
                    e0.checkNotNull(iVar);
                    ((l7) iVar).onFcmToken();
                    break;
                }
                break;
            case 12:
                Typeface typeface13 = f.f51960h;
                fVar.dismiss();
                i iVar2 = fVar.f51966g;
                if (iVar2 != null) {
                    e0.checkNotNull(iVar2);
                    ((l7) iVar2).onJetonId();
                    break;
                }
                break;
            case 13:
                Typeface typeface14 = f.f51960h;
                fVar.dismiss();
                j jVar4 = fVar.f51965f;
                if (jVar4 != null) {
                    e0.checkNotNull(jVar4);
                    jVar4.onOk();
                    break;
                }
                break;
            default:
                Typeface typeface15 = f.f51960h;
                fVar.dismiss();
                g gVar9 = fVar.f51964e;
                if (gVar9 != null) {
                    e0.checkNotNull(gVar9);
                    gVar9.onClosedRefuse();
                    break;
                }
                break;
        }
    }
}
