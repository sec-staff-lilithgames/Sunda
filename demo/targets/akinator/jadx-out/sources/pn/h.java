package pn;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements ho.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f81527a;

    public h(p pVar) {
        this.f81527a = pVar;
    }

    @Override // ho.c
    public void onInitializationFailed(IOException iOException) {
        this.f81527a.i(iOException);
    }

    @Override // ho.c
    public void onInitialized() {
        long elapsedRealtimeOffsetMs = ho.f.getElapsedRealtimeOffsetMs();
        p pVar = this.f81527a;
        pVar.L = elapsedRealtimeOffsetMs;
        pVar.j(true);
    }
}
