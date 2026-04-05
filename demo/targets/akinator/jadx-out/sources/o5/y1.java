package o5;

import java.util.Set;
import o5.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 extends y.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f77847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(String[] strArr, b2 b2Var) {
        super(strArr);
        this.f77847b = b2Var;
    }

    @Override // o5.y.b
    public void onInvalidated(Set<String> tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        r.a.getInstance().executeOnMainThread(new ji.t(this.f77847b, 22));
    }
}
