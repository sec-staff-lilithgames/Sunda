package zg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface c extends sg.b {
    void addCallback(d dVar);

    @Override // sg.b
    /* synthetic */ void cancelBackProgress();

    int getState();

    @Override // sg.b
    /* synthetic */ void handleBackInvoked();

    void removeCallback(d dVar);

    void setState(int i10);

    @Override // sg.b
    /* synthetic */ void startBackProgress(f.c cVar);

    @Override // sg.b
    /* synthetic */ void updateBackProgress(f.c cVar);
}
