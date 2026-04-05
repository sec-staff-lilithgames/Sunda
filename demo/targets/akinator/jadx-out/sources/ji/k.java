package ji;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f69593a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f69594b;

    public k(StringBuilder sb2) {
        this.f69594b = sb2;
    }

    @Override // ji.n
    public void read(InputStream inputStream, int i10) throws IOException {
        boolean z10 = this.f69593a;
        StringBuilder sb2 = this.f69594b;
        if (z10) {
            this.f69593a = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }
}
