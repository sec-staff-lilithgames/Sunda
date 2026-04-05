package zn;

import io.bidmachine.media3.common.util.o0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends o0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f98378j;

    public r(s sVar) {
        this.f98378j = sVar;
    }

    @Override // io.bidmachine.media3.common.util.o0
    public final void a() {
        this.f98378j.f98382d.cancel();
    }

    @Override // io.bidmachine.media3.common.util.o0
    public final Object b() throws IOException {
        this.f98378j.f98382d.cache();
        return null;
    }
}
