package a2;

import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m6 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6 f3729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f3730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, kv.p pVar) {
        super(2);
        this.f3729e = o6Var;
        this.f3730f = pVar;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        o6 o6Var = this.f3729e;
        Object tag = o6Var.getOwner().getTag(R.id.inspection_slot_table_set);
        Set set = kotlin.jvm.internal.h1.isMutableSet(tag) ? (Set) tag : null;
        if (set == null) {
            Object parent = o6Var.getOwner().getParent();
            View view = parent instanceof View ? (View) parent : null;
            Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
            set = kotlin.jvm.internal.h1.isMutableSet(tag2) ? (Set) tag2 : null;
        }
        if (set != null) {
            set.add(wVar.getCompositionData());
            wVar.collectParameterInformation();
        }
        p0.k1.LaunchedEffect(o6Var.getOwner(), new j6(o6Var, null), wVar, 8);
        p0.k1.LaunchedEffect(o6Var.getOwner(), new k6(o6Var, null), wVar, 8);
        p0.o0.CompositionLocalProvider(new p0.h3[]{d1.p.getLocalInspectionTables().provides(set)}, z0.u.composableLambda(wVar, -1193460702, true, new l6(o6Var, this.f3730f)), wVar, 56);
    }
}
