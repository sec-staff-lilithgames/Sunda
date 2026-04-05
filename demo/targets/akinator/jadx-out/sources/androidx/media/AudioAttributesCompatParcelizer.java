package androidx.media;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(g6.d dVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f6763a = (AudioAttributesImpl) dVar.readVersionedParcelable(audioAttributesCompat.f6763a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, g6.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        dVar.setSerializationFlags(false, false);
        dVar.writeVersionedParcelable(audioAttributesCompat.f6763a, 1);
    }
}
