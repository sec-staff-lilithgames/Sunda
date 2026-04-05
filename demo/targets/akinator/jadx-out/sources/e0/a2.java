package e0;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f52962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.q f52963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.a f52964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f52965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.q f52966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.q f52967j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m2 f52968k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f52969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f52970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kv.l lVar, m2 m2Var, boolean z10, boolean z11, f0.q qVar, kv.a aVar, kv.q qVar2, kv.q qVar3, kv.p pVar) {
        super(3);
        this.f52962e = pVar;
        this.f52963f = qVar;
        this.f52964g = aVar;
        this.f52965h = lVar;
        this.f52966i = qVar2;
        this.f52967j = qVar3;
        this.f52968k = m2Var;
        this.f52969l = z10;
        this.f52970m = z11;
    }

    /* renamed from: access$invoke$lambda-2, reason: not valid java name */
    public static final h1 m3744access$invoke$lambda2(v5 v5Var) {
        return (h1) v5Var.getValue();
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1487259950);
        o2 o2Var = (o2) this.f52962e.invoke(wVar, 0);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue;
        f0.q qVar = this.f52963f;
        p0.k1.DisposableEffect(qVar, new u1(j2Var, qVar), wVar, 0);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        Channel channel = (Channel) objRememberedValue2;
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(this.f52964g, wVar, 0);
        v5 v5VarRememberUpdatedState2 = z4.rememberUpdatedState(this.f52965h, wVar, 0);
        p0.k1.LaunchedEffect(o2Var, new w1(channel, o2Var, z4.rememberUpdatedState(new h1(this.f52966i, this.f52967j, j2Var, qVar), wVar, 0), null), wVar, 0);
        e1.v vVarPointerInput = u1.i1.pointerInput((e1.v) e1.t.f53496b, new Object[]{this.f52968k, Boolean.valueOf(this.f52969l), Boolean.valueOf(this.f52970m)}, (kv.p) new z1(this.f52969l, v5VarRememberUpdatedState2, v5VarRememberUpdatedState, this.f52968k, channel, this.f52970m, null));
        wVar.endReplaceableGroup();
        return vVarPointerInput;
    }
}
