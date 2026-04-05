package n0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import c0.h3;
import java.util.List;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f75200a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75201b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75202c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75203d;

    /* renamed from: e, reason: collision with root package name */
    public final float f75204e;

    public v(float f10, float f11, float f12, float f13, float f14, kotlin.jvm.internal.u uVar) {
        this.f75200a = f10;
        this.f75201b = f11;
        this.f75202c = f12;
        this.f75203d = f13;
        this.f75204e = f14;
    }

    @Override // n0.c
    public v5 elevation(boolean z10, f0.o interactionSource, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        wVar.startReplaceableGroup(-1588756907);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        p0.v vVar = p0.v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = z4.mutableStateListOf();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        p0.k1.LaunchedEffect(interactionSource, new s(interactionSource, snapshotStateList, null), wVar, (i10 >> 3) & 14);
        f0.n nVar = (f0.n) uu.y0.lastOrNull((List) snapshotStateList);
        float f10 = !z10 ? this.f75202c : nVar instanceof f0.t ? this.f75201b : nVar instanceof f0.i ? this.f75203d : nVar instanceof f0.d ? this.f75204e : this.f75200a;
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = wVar.rememberedValue();
        if (objRememberedValue2 == vVar.getEmpty()) {
            c0.e eVar = new c0.e(s2.i.m6815boximpl(f10), h3.getVectorConverter(s2.i.f85335c), null, 4, null);
            wVar.updateRememberedValue(eVar);
            objRememberedValue2 = eVar;
        }
        wVar.endReplaceableGroup();
        c0.e eVar2 = (c0.e) objRememberedValue2;
        if (z10) {
            wVar.startReplaceableGroup(-1598807310);
            p0.k1.LaunchedEffect(s2.i.m6815boximpl(f10), new u(eVar2, this, f10, nVar, null), wVar, 0);
            wVar.endReplaceableGroup();
        } else {
            wVar.startReplaceableGroup(-1598807481);
            p0.k1.LaunchedEffect(s2.i.m6815boximpl(f10), new t(eVar2, f10, null), wVar, 0);
            wVar.endReplaceableGroup();
        }
        v5 v5VarAsState = eVar2.asState();
        wVar.endReplaceableGroup();
        return v5VarAsState;
    }
}
