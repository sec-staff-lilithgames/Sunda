package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o0 {
    void addOnProgressChangedListener(w3.b bVar);

    void addOnReadyListener(w3.b bVar);

    void animateToEnd();

    void animateToStart(Runnable runnable);

    float getCurrentFraction();

    long getCurrentPlayTimeMillis();

    long getDurationMillis();

    boolean isReady();

    void removeOnProgressChangedListener(w3.b bVar);

    void removeOnReadyListener(w3.b bVar);

    void setCurrentFraction(float f10);

    void setCurrentPlayTimeMillis(long j10);
}
