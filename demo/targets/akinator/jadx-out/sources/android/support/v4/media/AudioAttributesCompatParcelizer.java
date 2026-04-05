package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(g6.d dVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(dVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, g6.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, dVar);
    }
}
