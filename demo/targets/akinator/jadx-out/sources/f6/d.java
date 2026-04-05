package f6;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d extends Animatable {
    void clearAnimationCallbacks();

    void registerAnimationCallback(c cVar);

    boolean unregisterAnimationCallback(c cVar);
}
