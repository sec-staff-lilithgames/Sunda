package r5;

import kotlin.jvm.internal.e0;
import r5.f;
import y5.h;
import y5.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.b f83806b;

    public g(f.b bVar) {
        this.f83806b = bVar;
    }

    @Override // y5.i
    public void bindTo(h statement) {
        e0.checkNotNullParameter(statement, "statement");
        f.b bVar = this.f83806b;
        int length = bVar.f83799g.length;
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = bVar.f83799g[i10];
            if (i11 == 1) {
                statement.bindLong(i10, bVar.f83800h[i10]);
            } else if (i11 == 2) {
                statement.bindDouble(i10, bVar.f83801i[i10]);
            } else if (i11 == 3) {
                String str = bVar.f83802j[i10];
                e0.checkNotNull(str);
                statement.bindString(i10, str);
            } else if (i11 == 4) {
                byte[] bArr = bVar.f83803k[i10];
                e0.checkNotNull(bArr);
                statement.bindBlob(i10, bArr);
            } else if (i11 == 5) {
                statement.bindNull(i10);
            }
        }
    }

    @Override // y5.i
    public int getArgCount() {
        return this.f83806b.f83799g.length;
    }

    @Override // y5.i
    public String getSql() {
        return this.f83806b.f83796c;
    }
}
