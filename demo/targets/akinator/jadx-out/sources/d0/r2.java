package d0;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import kotlinx.coroutines.CoroutineScope;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class r2 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.q f51589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f51590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(f0.q qVar, boolean z10) {
        super(3);
        this.f51589e = qVar;
        this.f51590f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$invoke$emitEnter(f0.q r4, p0.j2 r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof d0.p2
            if (r0 == 0) goto L13
            r0 = r6
            d0.p2 r0 = (d0.p2) r0
            int r1 = r0.f51563l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51563l = r1
            goto L18
        L13:
            d0.p2 r0 = new d0.p2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51562k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f51563l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            f0.i r4 = r0.f51561j
            p0.j2 r5 = r0.f51560i
            tu.a0.throwOnFailure(r6)
            goto L53
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            tu.a0.throwOnFailure(r6)
            java.lang.Object r6 = r5.getValue()
            f0.i r6 = (f0.i) r6
            if (r6 != 0) goto L56
            f0.i r6 = new f0.i
            r6.<init>()
            r0.f51560i = r5
            r0.f51561j = r6
            r0.f51563l = r3
            java.lang.Object r4 = r4.emit(r6, r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            r4 = r6
        L53:
            r5.setValue(r4)
        L56:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.r2.access$invoke$emitEnter(f0.q, p0.j2, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$invoke$emitExit(p0.j2 r4, f0.q r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof d0.q2
            if (r0 == 0) goto L13
            r0 = r6
            d0.q2 r0 = (d0.q2) r0
            int r1 = r0.f51574k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51574k = r1
            goto L18
        L13:
            d0.q2 r0 = new d0.q2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51573j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f51574k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p0.j2 r4 = r0.f51572i
            tu.a0.throwOnFailure(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            tu.a0.throwOnFailure(r6)
            java.lang.Object r6 = r4.getValue()
            f0.i r6 = (f0.i) r6
            if (r6 == 0) goto L52
            f0.j r2 = new f0.j
            r2.<init>(r6)
            r0.f51572i = r4
            r0.f51574k = r3
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = 0
            r4.setValue(r5)
        L52:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.r2.access$invoke$emitExit(p0.j2, f0.q, zu.d):java.lang.Object");
    }

    public static final void access$invoke$tryEmitExit(p0.j2 j2Var, f0.q qVar) {
        f0.i iVar = (f0.i) j2Var.getValue();
        if (iVar != null) {
            qVar.tryEmit(new f0.j(iVar));
            j2Var.setValue(null);
        }
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v vVar, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, PtLatqAYjEFT.buqYKA);
        wVar.startReplaceableGroup(1294013553);
        wVar.startReplaceableGroup(773894976);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar2 = p0.v.f80515a;
        if (objRememberedValue == vVar2.getEmpty()) {
            p0.s0 s0Var = new p0.s0(p0.k1.createCompositionCoroutineScope(zu.n.f98854b, wVar));
            wVar.updateRememberedValue(s0Var);
            objRememberedValue = s0Var;
        }
        wVar.endReplaceableGroup();
        CoroutineScope coroutineScope = ((p0.s0) objRememberedValue).getCoroutineScope();
        wVar.endReplaceableGroup();
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar2.getEmpty()) {
            objRememberedValue2 = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue2);
        }
        wVar.endReplaceableGroup();
        p0.j2 j2Var = (p0.j2) objRememberedValue2;
        f0.q qVar = this.f51589e;
        p0.k1.DisposableEffect(qVar, new j2(j2Var, qVar), wVar, 0);
        boolean z10 = this.f51590f;
        p0.k1.LaunchedEffect(Boolean.valueOf(z10), new k2(z10, j2Var, qVar, null), wVar, 0);
        e1.v vVarPointerInput = e1.t.f53496b;
        if (z10) {
            vVarPointerInput = u1.i1.pointerInput(vVarPointerInput, qVar, new o2(coroutineScope, qVar, j2Var, null));
        }
        wVar.endReplaceableGroup();
        return vVarPointerInput;
    }
}
