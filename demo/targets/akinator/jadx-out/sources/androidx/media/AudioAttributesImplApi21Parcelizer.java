package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(g6.d dVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6765a = (AudioAttributes) dVar.readParcelable(audioAttributesImplApi21.f6765a, 1);
        audioAttributesImplApi21.f6766b = dVar.readInt(audioAttributesImplApi21.f6766b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, g6.d dVar) {
        dVar.setSerializationFlags(false, false);
        dVar.writeParcelable(audioAttributesImplApi21.f6765a, 1);
        dVar.writeInt(audioAttributesImplApi21.f6766b, 2);
    }
}
