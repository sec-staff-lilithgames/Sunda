package ca;

import android.util.Pair;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import java.util.BitSet;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import nh.jh;
import nh.l1;
import nh.r1;
import nh.xh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11999b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f11998a = i10;
        this.f11999b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f11998a;
        Object obj2 = this.f11999b;
        switch (i10) {
            case 0:
                Pair pair = (Pair) obj;
                ((r) obj2).f12006b.putBoolean(((String) pair.first) + "_" + ((String) pair.second), true);
                break;
            case 1:
                ((BitSet) obj2).set(((Integer) obj).intValue());
                break;
            case 2:
                ((Collection) obj2).add(obj);
                break;
            case 3:
                l1 l1Var = (l1) obj2;
                l1Var.f76434a = (Spliterator) l1Var.f76436c.apply(obj);
                break;
            case 4:
                r1 r1Var = (r1) obj2;
                r1Var.f76434a = (Spliterator) r1Var.f76436c.apply(obj);
                break;
            case 5:
                xh xhVar = (xh) obj;
                ((BiConsumer) obj2).accept(xhVar.f76773a, xhVar.f76774b);
                break;
            case 6:
                jh jhVar = (jh) obj2;
                jhVar.f76405a = true;
                jhVar.f76406b = obj;
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i11 = OptionRareCharacterActivity.N;
                ((OptionRareCharacterActivity) obj2).u(zBooleanValue);
                break;
        }
    }
}
