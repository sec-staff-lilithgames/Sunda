package zn;

import android.net.Uri;
import go.b0;
import io.bidmachine.media3.common.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f98376a;

    /* renamed from: b, reason: collision with root package name */
    public final List f98377b;

    public q(b0 b0Var, List<StreamKey> list) {
        this.f98376a = b0Var;
        this.f98377b = list;
    }

    @Override // go.b0
    public p parse(Uri uri, InputStream inputStream) throws IOException {
        p pVar = (p) this.f98376a.parse(uri, inputStream);
        List<StreamKey> list = this.f98377b;
        return (list == null || list.isEmpty()) ? pVar : (p) pVar.copy(list);
    }
}
