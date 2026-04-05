package qt;

import java.io.PrintStream;
import java.io.PrintWriter;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83489i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f83490j;

    public /* synthetic */ b(Object obj, int i10) {
        this.f83489i = i10;
        this.f83490j = obj;
    }

    @Override // kc.p
    public final void L(String str) {
        switch (this.f83489i) {
            case 0:
                ((PrintStream) this.f83490j).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f83490j).println((Object) str);
                break;
        }
    }
}
