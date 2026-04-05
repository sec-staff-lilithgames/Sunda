package nh;

import java.util.EnumSet;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class x0 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76750a;

    public /* synthetic */ x0(int i10) {
        this.f76750a = i10;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f76750a) {
            case 0:
                ((x4) obj).add(obj2);
                break;
            case 1:
                ((k6) obj).add(obj2);
                break;
            case 2:
                ((h6) obj).add((ze) obj2);
                break;
            case 3:
                ((t6) obj).add(obj2);
                break;
            default:
                h1 h1Var = (h1) obj;
                Enum r32 = (Enum) obj2;
                EnumSet enumSet = h1Var.f76314a;
                if (enumSet != null) {
                    enumSet.add(r32);
                    break;
                } else {
                    h1Var.f76314a = EnumSet.of(r32);
                    break;
                }
        }
    }
}
