package t1;

import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineScope;
import kv.q;
import p0.k1;
import p0.s0;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f86260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f86261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar) {
        super(3);
        this.f86260e = eVar;
        this.f86261f = aVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(410346167);
        wVar.startReplaceableGroup(773894976);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            Object s0Var = new s0(k1.createCompositionCoroutineScope(zu.n.f98854b, wVar));
            wVar.updateRememberedValue(s0Var);
            objRememberedValue = s0Var;
        }
        wVar.endReplaceableGroup();
        CoroutineScope coroutineScope = ((s0) objRememberedValue).getCoroutineScope();
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(100475938);
        e eVar = this.f86260e;
        if (eVar == null) {
            wVar.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new e();
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            eVar = (e) objRememberedValue2;
        }
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(1618982084);
        a aVar = this.f86261f;
        boolean zChanged = wVar.changed(aVar) | wVar.changed(eVar) | wVar.changed(coroutineScope);
        Object objRememberedValue3 = wVar.rememberedValue();
        if (zChanged || objRememberedValue3 == vVar.getEmpty()) {
            eVar.setOriginNestedScrollScope$ui_release(coroutineScope);
            objRememberedValue3 = new k(eVar, aVar);
            wVar.updateRememberedValue(objRememberedValue3);
        }
        wVar.endReplaceableGroup();
        k kVar = (k) objRememberedValue3;
        wVar.endReplaceableGroup();
        return kVar;
    }
}
