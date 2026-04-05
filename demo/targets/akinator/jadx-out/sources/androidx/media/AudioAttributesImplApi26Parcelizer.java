package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(g6.d dVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6765a = (AudioAttributes) dVar.readParcelable(audioAttributesImplApi26.f6765a, 1);
        audioAttributesImplApi26.f6766b = dVar.readInt(audioAttributesImplApi26.f6766b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, g6.d dVar) {
        dVar.setSerializationFlags(false, false);
        dVar.writeParcelable(audioAttributesImplApi26.f6765a, 1);
        dVar.writeInt(audioAttributesImplApi26.f6766b, 2);
    }
}
