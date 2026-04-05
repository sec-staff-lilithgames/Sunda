package io.odeeo.internal.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c {
    void attachPlayerEventListener();

    long getCurrentPosition();

    long getDuration();

    int getPlayerState();

    boolean isPlaying();

    void pause(boolean z10);

    void play(boolean z10);

    void prepare();

    void refreshPlayerState();

    void release();

    void setVolume(float f10);

    void stop();
}
