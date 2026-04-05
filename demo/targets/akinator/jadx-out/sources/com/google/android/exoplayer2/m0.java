package com.google.android.exoplayer2;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.q0.o;
import java.util.ArrayList;
import o9.s;
import y9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class m0 implements com.google.android.exoplayer2.util.a0, rr.b, o.a, mt.r0, da.h, y3.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27674c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27675e;

    public /* synthetic */ m0(int i10, Object obj, int i11) {
        this.f27673b = i11;
        this.f27674c = i10;
        this.f27675e = obj;
    }

    @Override // rr.b
    public Object get() {
        return "Show wasn't tracked: ad view is covered by too many views (overlapping views count - " + this.f27674c + ", ad view - " + ((String) this.f27675e) + ")";
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        int i10 = this.f27673b;
        int i11 = this.f27674c;
        Object obj2 = this.f27675e;
        switch (i10) {
            case 0:
                int i12 = r0.f27961y0;
                ((p2) obj).onMediaItemTransition((u1) obj2, i11);
                break;
            default:
                ((l0.c) obj).onMediaItemTransition((io.odeeo.internal.b.z) obj2, i11);
                break;
        }
    }

    @Override // da.h
    public void onClickOk(int i10) {
        t9.a aVar = (t9.a) this.f27675e;
        ((b.a) aVar.f86587g.get(this.f27674c)).setAnswer(i10 - 1);
        y9.b bVar = aVar.f86588h;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    @Override // y3.x
    public boolean perform(View view, y3.p pVar) {
        ((SideSheetBehavior) this.f27675e).setState(this.f27674c);
        return true;
    }

    @Override // mt.r0
    public void subscribe(mt.p0 it) {
        o9.s sVar = (o9.s) this.f27675e;
        s.a aVar = o9.s.f78491t;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        int i10 = this.f27674c;
        ta.g gVar = ta.g.f86657a;
        ArrayList<ta.c> arrayListCall = i10 != -1 ? (i10 == 0 || i10 == 1) ? gVar.call(i10) : null : gVar.call();
        pt.c cVar = sVar.f78502n;
        Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.isDisposed()) : null;
        if (boolValueOf == null || boolValueOf.booleanValue()) {
            return;
        }
        if (arrayListCall == null) {
            ((du.g) it).onError(new Exception(lb.b1.f72741d.sharedInstance().getTraductionFromToken("CLASSEMENT_NON_DISPONIBLE")));
        } else {
            ((du.g) it).onSuccess(arrayListCall);
        }
    }

    public /* synthetic */ m0(Object obj, int i10, int i11) {
        this.f27673b = i11;
        this.f27675e = obj;
        this.f27674c = i10;
    }
}
