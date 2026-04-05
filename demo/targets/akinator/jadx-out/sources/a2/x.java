package a2;

import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar) {
        super(1);
        this.f3879e = tVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m62invokeZmokQxo(((s1.c) obj).m6702unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m62invokeZmokQxo(KeyEvent it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        t tVar = this.f3879e;
        h1.f fVarMo56getFocusDirectionP8AzH3I = tVar.mo56getFocusDirectionP8AzH3I(it);
        return (fVarMo56getFocusDirectionP8AzH3I == null || !s1.e.m6709equalsimpl0(s1.f.m6714getTypeZmokQxo(it), s1.e.f85306b.m6703getKeyDownCS__XNY())) ? Boolean.FALSE : Boolean.valueOf(tVar.getFocusManager().mo4142moveFocus3ESFkO8(fVarMo56getFocusDirectionP8AzH3I.m4139unboximpl()));
    }
}
