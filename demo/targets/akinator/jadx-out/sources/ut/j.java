package ut;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final int f88669b;

    public j(int i10) {
        this.f88669b = i10;
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList(this.f88669b);
    }
}
