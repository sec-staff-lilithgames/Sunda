package jm;

import android.content.Context;
import br.p1;
import io.bidmachine.Executable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements Executable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f69680c;

    public /* synthetic */ e(p1 p1Var, int i10) {
        this.f69679b = i10;
        this.f69680c = p1Var;
    }

    @Override // io.bidmachine.Executable
    public final void execute(Object obj) {
        switch (this.f69679b) {
            case 0:
                er.a.show((Context) obj, this.f69680c);
                break;
            default:
                er.a.show((Context) obj, this.f69680c);
                break;
        }
    }
}
